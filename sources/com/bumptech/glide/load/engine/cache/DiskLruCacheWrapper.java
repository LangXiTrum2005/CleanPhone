package com.bumptech.glide.load.engine.cache;

import android.util.Log;
import com.bumptech.glide.disklrucache.DiskLruCache;
import com.bumptech.glide.load.Key;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class DiskLruCacheWrapper implements DiskCache {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f12518b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DiskLruCache f12520e;
    public final DiskCacheWriteLocker d = new DiskCacheWriteLocker();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12519c = 262144000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SafeKeyGenerator f12517a = new SafeKeyGenerator();

    public DiskLruCacheWrapper(File file) {
        this.f12518b = file;
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public final void a(Key key, DiskCache.Writer writer) {
        DiskCacheWriteLocker.WriteLock writeLock;
        String strA = this.f12517a.a(key);
        DiskCacheWriteLocker diskCacheWriteLocker = this.d;
        synchronized (diskCacheWriteLocker) {
            writeLock = (DiskCacheWriteLocker.WriteLock) diskCacheWriteLocker.f12511a.get(strA);
            if (writeLock == null) {
                DiskCacheWriteLocker.WriteLockPool writeLockPool = diskCacheWriteLocker.f12512b;
                synchronized (writeLockPool.f12515a) {
                    writeLock = (DiskCacheWriteLocker.WriteLock) writeLockPool.f12515a.poll();
                }
                if (writeLock == null) {
                    writeLock = new DiskCacheWriteLocker.WriteLock();
                }
                diskCacheWriteLocker.f12511a.put(strA, writeLock);
            }
            writeLock.f12514b++;
        }
        writeLock.f12513a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strA + " for for Key: " + key);
            }
            try {
                DiskLruCache diskLruCacheC = c();
                if (diskLruCacheC.j(strA) != null) {
                    this.d.a(strA);
                    return;
                }
                DiskLruCache.Editor editorH = diskLruCacheC.h(strA);
                if (editorH == null) {
                    throw new IllegalStateException("Had two simultaneous puts for: ".concat(strA));
                }
                try {
                    if (writer.a(editorH.b())) {
                        DiskLruCache.a(DiskLruCache.this, editorH, true);
                        editorH.f12318c = true;
                    }
                    if (!editorH.f12318c) {
                        try {
                            editorH.a();
                        } catch (IOException unused) {
                        }
                    }
                    this.d.a(strA);
                } catch (Throwable th) {
                    if (!editorH.f12318c) {
                        try {
                            editorH.a();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e2) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e2);
                }
            }
        } catch (Throwable th2) {
            this.d.a(strA);
            throw th2;
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public final File b(Key key) {
        String strA = this.f12517a.a(key);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strA + " for for Key: " + key);
        }
        try {
            DiskLruCache.Value valueJ = c().j(strA);
            if (valueJ != null) {
                return valueJ.f12323a[0];
            }
            return null;
        } catch (IOException e2) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e2);
            return null;
        }
    }

    public final synchronized DiskLruCache c() {
        try {
            if (this.f12520e == null) {
                this.f12520e = DiskLruCache.l(this.f12518b, this.f12519c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f12520e;
    }
}
