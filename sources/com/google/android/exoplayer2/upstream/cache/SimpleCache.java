package com.google.android.exoplayer2.upstream.cache;

import android.database.SQLException;
import android.os.ConditionVariable;
import android.support.v4.media.a;
import com.applovin.impl.Z;
import com.google.android.exoplayer2.database.DatabaseIOException;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
public final class SimpleCache implements Cache {
    public static final HashSet k = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f18882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CacheEvictor f18883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CachedContentIndex f18884c;
    public final CacheFileMetadataIndex d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f18885e;
    public final Random f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f18886h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f18887i;
    public Cache.CacheException j;

    public SimpleCache(File file, CacheEvictor cacheEvictor, DatabaseProvider databaseProvider) {
        boolean zAdd;
        CachedContentIndex cachedContentIndex = new CachedContentIndex(databaseProvider, file);
        CacheFileMetadataIndex cacheFileMetadataIndex = new CacheFileMetadataIndex(databaseProvider);
        synchronized (SimpleCache.class) {
            zAdd = k.add(file.getAbsoluteFile());
        }
        if (!zAdd) {
            throw new IllegalStateException(a.l(file, "Another SimpleCache instance uses the folder: "));
        }
        this.f18882a = file;
        this.f18883b = cacheEvictor;
        this.f18884c = cachedContentIndex;
        this.d = cacheFileMetadataIndex;
        this.f18885e = new HashMap();
        this.f = new Random();
        this.g = cacheEvictor.requiresCacheSpanTouches();
        this.f18886h = -1L;
        final ConditionVariable conditionVariable = new ConditionVariable();
        new Thread() { // from class: com.google.android.exoplayer2.upstream.cache.SimpleCache.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super("ExoPlayer:SimpleCacheInit");
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                synchronized (SimpleCache.this) {
                    conditionVariable.open();
                    SimpleCache.i(SimpleCache.this);
                    SimpleCache.this.f18883b.onCacheInitialized();
                }
            }
        }.start();
        conditionVariable.block();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void i(SimpleCache simpleCache) {
        long j;
        CachedContentIndex cachedContentIndex = simpleCache.f18884c;
        File file = simpleCache.f18882a;
        if (!file.exists()) {
            try {
                l(file);
            } catch (Cache.CacheException e2) {
                simpleCache.j = e2;
                return;
            }
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + file;
            Log.c("SimpleCache", str);
            simpleCache.j = new Cache.CacheException(str);
            return;
        }
        int length = fileArrListFiles.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                j = -1;
                break;
            }
            File file2 = fileArrListFiles[i2];
            String name = file2.getName();
            if (name.endsWith(".uid")) {
                try {
                    j = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    Log.c("SimpleCache", "Malformed UID file: " + file2);
                    file2.delete();
                }
            }
            i2++;
        }
        simpleCache.f18886h = j;
        if (j == -1) {
            try {
                simpleCache.f18886h = m(file);
            } catch (IOException e3) {
                String str2 = "Failed to create cache UID: " + file;
                Log.d("SimpleCache", str2, e3);
                simpleCache.j = new Cache.CacheException(str2, e3);
                return;
            }
        }
        try {
            cachedContentIndex.e(simpleCache.f18886h);
            CacheFileMetadataIndex cacheFileMetadataIndex = simpleCache.d;
            if (cacheFileMetadataIndex != null) {
                cacheFileMetadataIndex.b(simpleCache.f18886h);
                HashMap mapA = cacheFileMetadataIndex.a();
                simpleCache.n(file, true, fileArrListFiles, mapA);
                cacheFileMetadataIndex.c(mapA.keySet());
            } else {
                simpleCache.n(file, true, fileArrListFiles, null);
            }
            UnmodifiableIterator it = ImmutableSet.u(cachedContentIndex.f18865a.keySet()).iterator();
            while (it.hasNext()) {
                cachedContentIndex.f((String) it.next());
            }
            try {
                cachedContentIndex.g();
            } catch (IOException e4) {
                Log.d("SimpleCache", "Storing index file failed", e4);
            }
        } catch (IOException e5) {
            String str3 = "Failed to initialize cache indices: " + file;
            Log.d("SimpleCache", str3, e5);
            simpleCache.j = new Cache.CacheException(str3, e5);
        }
    }

    public static void l(File file) throws Cache.CacheException {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        Log.c("SimpleCache", str);
        throw new Cache.CacheException(str);
    }

    public static long m(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, a.m(Long.toString(jAbs, 16), ".uid"));
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException(a.l(file2, "Failed to create UID file: "));
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public final synchronized void a(String str, ContentMetadataMutations contentMetadataMutations) {
        k();
        CachedContentIndex cachedContentIndex = this.f18884c;
        CachedContent cachedContentD = cachedContentIndex.d(str);
        DefaultContentMetadata defaultContentMetadata = cachedContentD.f18862e;
        DefaultContentMetadata defaultContentMetadataA = defaultContentMetadata.a(contentMetadataMutations);
        cachedContentD.f18862e = defaultContentMetadataA;
        if (!defaultContentMetadataA.equals(defaultContentMetadata)) {
            cachedContentIndex.f18868e.f(cachedContentD);
        }
        try {
            this.f18884c.g();
        } catch (IOException e2) {
            throw new Cache.CacheException(e2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public final synchronized CacheSpan b(long j, long j2, String str) throws Throwable {
        try {
            try {
                k();
                while (true) {
                    CacheSpan cacheSpanD = d(j, j2, str);
                    String str2 = str;
                    long j3 = j2;
                    long j4 = j;
                    if (cacheSpanD != null) {
                        return cacheSpanD;
                    }
                    wait();
                    j = j4;
                    j2 = j3;
                    str = str2;
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public final synchronized void c(CacheSpan cacheSpan) {
        CachedContent cachedContentC = this.f18884c.c(cacheSpan.X);
        cachedContentC.getClass();
        long j = cacheSpan.f18852Y;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = cachedContentC.d;
            if (i2 >= arrayList.size()) {
                throw new IllegalStateException();
            }
            if (((CachedContent.Range) arrayList.get(i2)).f18863a == j) {
                arrayList.remove(i2);
                this.f18884c.f(cachedContentC.f18860b);
                notifyAll();
            } else {
                i2++;
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public final synchronized CacheSpan d(long j, long j2, String str) {
        long j3;
        SimpleCacheSpan simpleCacheSpanB;
        k();
        CachedContent cachedContentC = this.f18884c.c(str);
        if (cachedContentC == null) {
            j3 = j;
            simpleCacheSpanB = new SimpleCacheSpan(str, j3, j2, -9223372036854775807L, null);
        } else {
            j3 = j;
            while (true) {
                simpleCacheSpanB = cachedContentC.b(j3, j2);
                if (!simpleCacheSpanB.e0 || simpleCacheSpanB.f0.length() == simpleCacheSpanB.Z) {
                    break;
                }
                p();
            }
        }
        if (simpleCacheSpanB.e0) {
            return q(str, simpleCacheSpanB);
        }
        CachedContent cachedContentD = this.f18884c.d(str);
        long j4 = simpleCacheSpanB.Z;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = cachedContentD.d;
            if (i2 >= arrayList.size()) {
                arrayList.add(new CachedContent.Range(j3, j4));
                return simpleCacheSpanB;
            }
            CachedContent.Range range = (CachedContent.Range) arrayList.get(i2);
            long j5 = range.f18863a;
            if (j5 <= j3) {
                long j6 = range.f18864b;
                if (j6 == -1 || j5 + j6 > j3) {
                    break;
                }
                i2++;
            } else {
                if (j4 == -1 || j3 + j4 > j5) {
                    break;
                }
                i2++;
            }
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public final synchronized void e(CacheSpan cacheSpan) {
        o(cacheSpan);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public final synchronized long f(long j, long j2, String str) {
        long j3;
        long j4 = j2 == -1 ? Long.MAX_VALUE : j + j2;
        long j5 = j4 >= 0 ? j4 : Long.MAX_VALUE;
        long j6 = j;
        j3 = 0;
        while (j6 < j5) {
            long cachedLength = getCachedLength(str, j6, j5 - j6);
            if (cachedLength > 0) {
                j3 += cachedLength;
            } else {
                cachedLength = -cachedLength;
            }
            j6 += cachedLength;
        }
        return j3;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public final synchronized void g(File file, long j) {
        if (file.exists()) {
            if (j == 0) {
                file.delete();
                return;
            }
            SimpleCacheSpan simpleCacheSpanB = SimpleCacheSpan.b(file, j, -9223372036854775807L, this.f18884c);
            simpleCacheSpanB.getClass();
            CachedContent cachedContentC = this.f18884c.c(simpleCacheSpanB.X);
            cachedContentC.getClass();
            Assertions.d(cachedContentC.c(simpleCacheSpanB.f18852Y, simpleCacheSpanB.Z));
            long jB = cachedContentC.f18862e.b();
            if (jB != -1) {
                Assertions.d(simpleCacheSpanB.f18852Y + simpleCacheSpanB.Z <= jB);
            }
            if (this.d == null) {
                j(simpleCacheSpanB);
                this.f18884c.g();
                notifyAll();
                return;
            }
            try {
                this.d.d(simpleCacheSpanB.Z, simpleCacheSpanB.g0, file.getName());
                j(simpleCacheSpanB);
                try {
                    this.f18884c.g();
                    notifyAll();
                    return;
                } catch (IOException e2) {
                    throw new Cache.CacheException(e2);
                }
            } catch (IOException e3) {
                throw new Cache.CacheException(e3);
            }
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public final synchronized long getCachedLength(String str, long j, long j2) {
        CachedContent cachedContentC;
        if (j2 == -1) {
            j2 = Long.MAX_VALUE;
        }
        cachedContentC = this.f18884c.c(str);
        return cachedContentC != null ? cachedContentC.a(j, j2) : -j2;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public final synchronized DefaultContentMetadata getContentMetadata(String str) {
        CachedContent cachedContentC;
        cachedContentC = this.f18884c.c(str);
        return cachedContentC != null ? cachedContentC.f18862e : DefaultContentMetadata.f18879c;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public final synchronized void h(String str) {
        CachedContent cachedContentC;
        synchronized (this) {
            try {
                cachedContentC = this.f18884c.c(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = ((cachedContentC == null || cachedContentC.f18861c.isEmpty()) ? new TreeSet() : new TreeSet((Collection) cachedContentC.f18861c)).iterator();
        while (it.hasNext()) {
            o((CacheSpan) it.next());
        }
    }

    public final void j(SimpleCacheSpan simpleCacheSpan) {
        CachedContentIndex cachedContentIndex = this.f18884c;
        String str = simpleCacheSpan.X;
        cachedContentIndex.d(str).f18861c.add(simpleCacheSpan);
        this.f18887i += simpleCacheSpan.Z;
        ArrayList arrayList = (ArrayList) this.f18885e.get(str);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((Cache.Listener) arrayList.get(size)).onSpanAdded(this, simpleCacheSpan);
            }
        }
        this.f18883b.onSpanAdded(this, simpleCacheSpan);
    }

    public final synchronized void k() {
        Cache.CacheException cacheException = this.j;
        if (cacheException != null) {
            throw cacheException;
        }
    }

    public final void n(File file, boolean z2, File[] fileArr, HashMap map) {
        long j;
        long j2;
        if (fileArr == null || fileArr.length == 0) {
            if (z2) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z2 && name.indexOf(46) == -1) {
                n(file2, false, file2.listFiles(), map);
            } else if (!z2 || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                CacheFileMetadata cacheFileMetadata = map != null ? (CacheFileMetadata) map.remove(name) : null;
                if (cacheFileMetadata != null) {
                    j = cacheFileMetadata.f18847a;
                    j2 = cacheFileMetadata.f18848b;
                } else {
                    j = -1;
                    j2 = -9223372036854775807L;
                }
                SimpleCacheSpan simpleCacheSpanB = SimpleCacheSpan.b(file2, j, j2, this.f18884c);
                if (simpleCacheSpanB != null) {
                    j(simpleCacheSpanB);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final void o(CacheSpan cacheSpan) {
        String str = cacheSpan.X;
        CachedContentIndex cachedContentIndex = this.f18884c;
        CachedContent cachedContentC = cachedContentIndex.c(str);
        if (cachedContentC == null || !cachedContentC.f18861c.remove(cacheSpan)) {
            return;
        }
        File file = cacheSpan.f0;
        if (file != null) {
            file.delete();
        }
        this.f18887i -= cacheSpan.Z;
        CacheFileMetadataIndex cacheFileMetadataIndex = this.d;
        if (cacheFileMetadataIndex != null) {
            String name = file.getName();
            try {
                cacheFileMetadataIndex.f18851b.getClass();
                try {
                    cacheFileMetadataIndex.f18850a.getWritableDatabase().delete(cacheFileMetadataIndex.f18851b, "name = ?", new String[]{name});
                } catch (SQLException e2) {
                    throw new DatabaseIOException(e2);
                }
            } catch (IOException unused) {
                Z.v("Failed to remove file index entry for: ", name, "SimpleCache");
            }
        }
        cachedContentIndex.f(cachedContentC.f18860b);
        ArrayList arrayList = (ArrayList) this.f18885e.get(cacheSpan.X);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((Cache.Listener) arrayList.get(size)).onSpanRemoved(this, cacheSpan);
            }
        }
        this.f18883b.onSpanRemoved(this, cacheSpan);
    }

    public final void p() {
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableCollection(this.f18884c.f18865a.values()).iterator();
        while (it.hasNext()) {
            for (CacheSpan cacheSpan : ((CachedContent) it.next()).f18861c) {
                if (cacheSpan.f0.length() != cacheSpan.Z) {
                    arrayList.add(cacheSpan);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            o((CacheSpan) arrayList.get(i2));
        }
    }

    public final SimpleCacheSpan q(String str, SimpleCacheSpan simpleCacheSpan) {
        boolean z2;
        File file;
        if (!this.g) {
            return simpleCacheSpan;
        }
        File file2 = simpleCacheSpan.f0;
        file2.getClass();
        String name = file2.getName();
        long j = simpleCacheSpan.Z;
        long jCurrentTimeMillis = System.currentTimeMillis();
        CacheFileMetadataIndex cacheFileMetadataIndex = this.d;
        if (cacheFileMetadataIndex != null) {
            try {
                cacheFileMetadataIndex.d(j, jCurrentTimeMillis, name);
            } catch (IOException unused) {
                jCurrentTimeMillis = jCurrentTimeMillis;
                Log.g("SimpleCache", "Failed to update index with new touch timestamp.");
            }
            z2 = false;
        } else {
            z2 = true;
        }
        CachedContent cachedContentC = this.f18884c.c(str);
        TreeSet treeSet = cachedContentC.f18861c;
        Assertions.d(treeSet.remove(simpleCacheSpan));
        file2.getClass();
        if (z2) {
            File parentFile = file2.getParentFile();
            parentFile.getClass();
            File fileD = SimpleCacheSpan.d(parentFile, cachedContentC.f18859a, simpleCacheSpan.f18852Y, jCurrentTimeMillis);
            if (file2.renameTo(fileD)) {
                file = fileD;
            } else {
                Log.g("CachedContent", "Failed to rename " + file2 + " to " + fileD);
                file = file2;
            }
        } else {
            file = file2;
        }
        Assertions.d(simpleCacheSpan.e0);
        SimpleCacheSpan simpleCacheSpan2 = new SimpleCacheSpan(simpleCacheSpan.X, simpleCacheSpan.f18852Y, simpleCacheSpan.Z, jCurrentTimeMillis, file);
        treeSet.add(simpleCacheSpan2);
        ArrayList arrayList = (ArrayList) this.f18885e.get(simpleCacheSpan.X);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((Cache.Listener) arrayList.get(size)).onSpanTouched(this, simpleCacheSpan, simpleCacheSpan2);
            }
        }
        this.f18883b.onSpanTouched(this, simpleCacheSpan, simpleCacheSpan2);
        return simpleCacheSpan2;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public final synchronized File startFile(String str, long j, long j2) throws Throwable {
        Throwable th;
        try {
            try {
                k();
                CachedContent cachedContentC = this.f18884c.c(str);
                cachedContentC.getClass();
                Assertions.d(cachedContentC.c(j, j2));
                if (!this.f18882a.exists()) {
                    try {
                        l(this.f18882a);
                        p();
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                this.f18883b.onStartFile(this, str, j, j2);
                File file = new File(this.f18882a, Integer.toString(this.f.nextInt(10)));
                if (!file.exists()) {
                    l(file);
                }
                return SimpleCacheSpan.d(file, cachedContentC.f18859a, j, System.currentTimeMillis());
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
