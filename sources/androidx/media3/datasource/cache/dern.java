package androidx.media3.datasource.cache;

import android.os.ConditionVariable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import decarock.triweekly;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import twybill.beachfront;
import twybill.competently;
import twybill.impromptu;
import twybill.marial;
import twybill.taiyuan;

/* JADX INFO: compiled from: SimpleCache.java */
/* JADX INFO: loaded from: classes.dex */
public final class dern implements Cache {

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public static final HashSet<File> f11420formularize = new HashSet<>();

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public Cache.CacheException f11421apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final File f11422attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final Random f11423beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final boolean f11424competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public boolean f11425cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final competently f11426dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public long f11427impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final HashMap<String, ArrayList<Cache.attabal>> f11428marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final saneness f11429saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public long f11430taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final twybill.saneness f11431wireman;

    /* JADX INFO: compiled from: SimpleCache.java */
    public class attabal extends Thread {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ ConditionVariable f11433kowloon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public attabal(String str, ConditionVariable conditionVariable) {
            super(str);
            this.f11433kowloon = conditionVariable;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (dern.this) {
                this.f11433kowloon.open();
                dern.this.kowloon();
                dern.this.f11429saneness.onCacheInitialized();
            }
        }
    }

    public dern(File file, saneness sanenessVar, liable.attabal attabalVar) {
        this(file, sanenessVar, attabalVar, null, false, false);
    }

    public static void apical(File file) throws Cache.CacheException {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        triweekly.dern("SimpleCache", str);
        throw new Cache.CacheException(str);
    }

    public static synchronized void cuirassed(File file) {
        f11420formularize.remove(file.getAbsoluteFile());
    }

    public static long dovishness(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    public static long formularize(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, Long.toString(jAbs, 16) + ".uid");
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    public static long monoploid(File[] fileArr) {
        int length = fileArr.length;
        for (int i = 0; i < length; i++) {
            File file = fileArr[i];
            String name = file.getName();
            if (name.endsWith(".uid")) {
                try {
                    return dovishness(name);
                } catch (NumberFormatException unused) {
                    triweekly.dern("SimpleCache", "Malformed UID file: " + file);
                    file.delete();
                }
            }
        }
        return -1L;
    }

    public static synchronized boolean polloi(File file) {
        return f11420formularize.add(file.getAbsoluteFile());
    }

    public final void adultoid(twybill.triweekly triweeklyVar, marial marialVar) {
        ArrayList<Cache.attabal> arrayList = this.f11428marial.get(triweeklyVar.f39031kowloon);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).dern(this, triweeklyVar, marialVar);
            }
        }
        this.f11429saneness.dern(this, triweeklyVar, marialVar);
    }

    public final void arytenoidectomy(File file, boolean z, File[] fileArr, Map<String, twybill.attabal> map) {
        long j;
        long j2;
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z && name.indexOf(46) == -1) {
                arytenoidectomy(file2, false, file2.listFiles(), map);
            } else if (!z || (!competently.impassible(name) && !name.endsWith(".uid"))) {
                twybill.attabal attabalVarRemove = map != null ? map.remove(name) : null;
                if (attabalVarRemove != null) {
                    j = attabalVarRemove.f38995attabal;
                    j2 = attabalVarRemove.f38996saneness;
                } else {
                    j = -1;
                    j2 = C.TIME_UNSET;
                }
                twybill.triweekly triweeklyVarTaiyuan = twybill.triweekly.taiyuan(file2, j, j2, this.f11426dern);
                if (triweeklyVarTaiyuan != null) {
                    taiyuan(triweeklyVarTaiyuan);
                } else {
                    file2.delete();
                }
            }
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized marial attabal(String str, long j, long j2) throws Throwable {
        try {
            try {
                decarock.attabal.competently(!this.f11425cutely);
                cutely();
                twybill.triweekly triweeklyVarTriweekly = triweekly(str, j, j2);
                if (triweeklyVarTriweekly.f39034polloi) {
                    return cord(str, triweeklyVarTriweekly);
                }
                if (this.f11426dern.apical(str).cutely(j, triweeklyVarTriweekly.f39033monoploid)) {
                    return triweeklyVarTriweekly;
                }
                return null;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized void beachfront(File file, long j) throws Cache.CacheException {
        boolean z = true;
        decarock.attabal.competently(!this.f11425cutely);
        if (file.exists()) {
            if (j == 0) {
                file.delete();
                return;
            }
            twybill.triweekly triweeklyVar = (twybill.triweekly) decarock.attabal.marial(twybill.triweekly.cutely(file, j, this.f11426dern));
            beachfront beachfrontVar = (beachfront) decarock.attabal.marial(this.f11426dern.beachfront(triweeklyVar.f39031kowloon));
            decarock.attabal.competently(beachfrontVar.impromptu(triweeklyVar.f39029arytenoidectomy, triweeklyVar.f39033monoploid));
            long jSaneness = impromptu.saneness(beachfrontVar.wireman());
            if (jSaneness != -1) {
                if (triweeklyVar.f39029arytenoidectomy + triweeklyVar.f39033monoploid > jSaneness) {
                    z = false;
                }
                decarock.attabal.competently(z);
            }
            if (this.f11431wireman == null) {
                taiyuan(triweeklyVar);
                this.f11426dern.monoploid();
                notifyAll();
                return;
            }
            try {
                this.f11431wireman.impromptu(file.getName(), triweeklyVar.f39033monoploid, triweeklyVar.f39030graveside);
                taiyuan(triweeklyVar);
                try {
                    this.f11426dern.monoploid();
                    notifyAll();
                    return;
                } catch (IOException e) {
                    throw new Cache.CacheException(e);
                }
            } catch (IOException e2) {
                throw new Cache.CacheException(e2);
            }
            throw th;
        }
    }

    public final twybill.triweekly cord(String str, twybill.triweekly triweeklyVar) {
        boolean z;
        if (!this.f11424competently) {
            return triweeklyVar;
        }
        String name = ((File) decarock.attabal.marial(triweeklyVar.f39032molybdenite)).getName();
        long j = triweeklyVar.f39033monoploid;
        long jCurrentTimeMillis = System.currentTimeMillis();
        twybill.saneness sanenessVar = this.f11431wireman;
        if (sanenessVar != null) {
            try {
                sanenessVar.impromptu(name, j, jCurrentTimeMillis);
            } catch (IOException unused) {
                triweekly.impromptu("SimpleCache", "Failed to update index with new touch timestamp.");
            }
            z = false;
        } else {
            z = true;
        }
        twybill.triweekly triweeklyVarFormularize = ((beachfront) decarock.attabal.marial(this.f11426dern.beachfront(str))).formularize(triweeklyVar, jCurrentTimeMillis, z);
        adultoid(triweeklyVar, triweeklyVarFormularize);
        return triweeklyVarFormularize;
    }

    public synchronized void cutely() throws Cache.CacheException {
        Cache.CacheException cacheException = this.f11421apical;
        if (cacheException != null) {
            throw cacheException;
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized void dern(marial marialVar) {
        decarock.attabal.competently(!this.f11425cutely);
        beachfront beachfrontVar = (beachfront) decarock.attabal.marial(this.f11426dern.beachfront(marialVar.f39031kowloon));
        beachfrontVar.impassible(marialVar.f39029arytenoidectomy);
        this.f11426dern.triweekly(beachfrontVar.f39000saneness);
        notifyAll();
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized impromptu getContentMetadata(String str) {
        decarock.attabal.competently(!this.f11425cutely);
        return this.f11426dern.impromptu(str);
    }

    public synchronized void gintrap() {
        File file;
        if (this.f11425cutely) {
            return;
        }
        this.f11428marial.clear();
        preprohormone();
        try {
            try {
                this.f11426dern.monoploid();
                file = this.f11422attabal;
            } catch (Throwable th) {
                cuirassed(this.f11422attabal);
                this.f11425cutely = true;
                throw th;
            }
        } catch (IOException e) {
            triweekly.wireman("SimpleCache", "Storing index file failed", e);
            file = this.f11422attabal;
        }
        cuirassed(file);
        this.f11425cutely = true;
    }

    public final void graveside(marial marialVar) {
        ArrayList<Cache.attabal> arrayList = this.f11428marial.get(marialVar.f39031kowloon);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).saneness(this, marialVar);
            }
        }
        this.f11429saneness.saneness(this, marialVar);
    }

    public synchronized long impassible(String str, long j, long j2) {
        beachfront beachfrontVarBeachfront;
        decarock.attabal.competently(!this.f11425cutely);
        if (j2 == -1) {
            j2 = Long.MAX_VALUE;
        }
        beachfrontVarBeachfront = this.f11426dern.beachfront(str);
        return beachfrontVarBeachfront != null ? beachfrontVarBeachfront.dern(j, j2) : -j2;
    }

    public final void kowloon() {
        if (!this.f11422attabal.exists()) {
            try {
                apical(this.f11422attabal);
            } catch (Cache.CacheException e) {
                this.f11421apical = e;
                return;
            }
        }
        File[] fileArrListFiles = this.f11422attabal.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + this.f11422attabal;
            triweekly.dern("SimpleCache", str);
            this.f11421apical = new Cache.CacheException(str);
            return;
        }
        long jMonoploid = monoploid(fileArrListFiles);
        this.f11427impromptu = jMonoploid;
        if (jMonoploid == -1) {
            try {
                this.f11427impromptu = formularize(this.f11422attabal);
            } catch (IOException e2) {
                String str2 = "Failed to create cache UID: " + this.f11422attabal;
                triweekly.wireman("SimpleCache", str2, e2);
                this.f11421apical = new Cache.CacheException(str2, e2);
                return;
            }
        }
        try {
            this.f11426dern.formularize(this.f11427impromptu);
            twybill.saneness sanenessVar = this.f11431wireman;
            if (sanenessVar != null) {
                sanenessVar.marial(this.f11427impromptu);
                Map<String, twybill.attabal> mapSaneness = this.f11431wireman.saneness();
                arytenoidectomy(this.f11422attabal, true, fileArrListFiles, mapSaneness);
                this.f11431wireman.competently(mapSaneness.keySet());
            } else {
                arytenoidectomy(this.f11422attabal, true, fileArrListFiles, null);
            }
            this.f11426dern.arytenoidectomy();
            try {
                this.f11426dern.monoploid();
            } catch (IOException e3) {
                triweekly.wireman("SimpleCache", "Storing index file failed", e3);
            }
        } catch (IOException e4) {
            String str3 = "Failed to initialize cache indices: " + this.f11422attabal;
            triweekly.wireman("SimpleCache", str3, e4);
            this.f11421apical = new Cache.CacheException(str3, e4);
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:? -> B:10:0x001e). Please report as a decompilation issue!!! */
    @Override // androidx.media3.datasource.cache.Cache
    public synchronized marial marial(String str, long j, long j2) throws Throwable {
        try {
            decarock.attabal.competently(!this.f11425cutely);
            cutely();
            while (true) {
                marial marialVarAttabal = attabal(str, j, j2);
                long j3 = j2;
                long j4 = j;
                String str2 = str;
                if (marialVarAttabal != null) {
                    return marialVarAttabal;
                }
                try {
                    wait();
                    str = str2;
                    j = j4;
                    j2 = j3;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final void molybdenite(twybill.triweekly triweeklyVar) {
        ArrayList<Cache.attabal> arrayList = this.f11428marial.get(triweeklyVar.f39031kowloon);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).attabal(this, triweeklyVar);
            }
        }
        this.f11429saneness.attabal(this, triweeklyVar);
    }

    public final void preprohormone() {
        ArrayList arrayList = new ArrayList();
        Iterator<beachfront> it = this.f11426dern.competently().iterator();
        while (it.hasNext()) {
            for (twybill.triweekly triweeklyVar : it.next().beachfront()) {
                if (((File) decarock.attabal.marial(triweeklyVar.f39032molybdenite)).length() != triweeklyVar.f39033monoploid) {
                    arrayList.add(triweeklyVar);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            rotuma((marial) arrayList.get(i));
        }
    }

    public final void rotuma(marial marialVar) {
        beachfront beachfrontVarBeachfront = this.f11426dern.beachfront(marialVar.f39031kowloon);
        if (beachfrontVarBeachfront == null || !beachfrontVarBeachfront.apical(marialVar)) {
            return;
        }
        this.f11430taiyuan -= marialVar.f39033monoploid;
        if (this.f11431wireman != null) {
            String name = ((File) decarock.attabal.marial(marialVar.f39032molybdenite)).getName();
            try {
                this.f11431wireman.beachfront(name);
            } catch (IOException unused) {
                triweekly.impromptu("SimpleCache", "Failed to remove file index entry for: " + name);
            }
        }
        this.f11426dern.triweekly(beachfrontVarBeachfront.f39000saneness);
        graveside(marialVar);
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized void saneness(marial marialVar) {
        decarock.attabal.competently(!this.f11425cutely);
        rotuma(marialVar);
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized File startFile(String str, long j, long j2) throws Throwable {
        Throwable th;
        try {
            try {
                decarock.attabal.competently(!this.f11425cutely);
                cutely();
                beachfront beachfrontVarBeachfront = this.f11426dern.beachfront(str);
                decarock.attabal.marial(beachfrontVarBeachfront);
                decarock.attabal.competently(beachfrontVarBeachfront.impromptu(j, j2));
                if (!this.f11422attabal.exists()) {
                    try {
                        apical(this.f11422attabal);
                        preprohormone();
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                this.f11429saneness.marial(this, str, j, j2);
                File file = new File(this.f11422attabal, Integer.toString(this.f11423beachfront.nextInt(10)));
                if (!file.exists()) {
                    apical(file);
                }
                return twybill.triweekly.impassible(file, beachfrontVarBeachfront.f38997attabal, j, System.currentTimeMillis());
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final void taiyuan(twybill.triweekly triweeklyVar) {
        this.f11426dern.apical(triweeklyVar.f39031kowloon).attabal(triweeklyVar);
        this.f11430taiyuan += triweeklyVar.f39033monoploid;
        molybdenite(triweeklyVar);
    }

    public final twybill.triweekly triweekly(String str, long j, long j2) {
        twybill.triweekly triweeklyVarMarial;
        beachfront beachfrontVarBeachfront = this.f11426dern.beachfront(str);
        if (beachfrontVarBeachfront == null) {
            return twybill.triweekly.apical(str, j, j2);
        }
        while (true) {
            triweeklyVarMarial = beachfrontVarBeachfront.marial(j, j2);
            if (!triweeklyVarMarial.f39034polloi || ((File) decarock.attabal.marial(triweeklyVarMarial.f39032molybdenite)).length() == triweeklyVarMarial.f39033monoploid) {
                break;
            }
            preprohormone();
        }
        return triweeklyVarMarial;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized void wireman(String str, taiyuan taiyuanVar) throws Cache.CacheException {
        decarock.attabal.competently(!this.f11425cutely);
        cutely();
        this.f11426dern.wireman(str, taiyuanVar);
        try {
            this.f11426dern.monoploid();
        } catch (IOException e) {
            throw new Cache.CacheException(e);
        }
    }

    public dern(File file, saneness sanenessVar, liable.attabal attabalVar, byte[] bArr, boolean z, boolean z2) {
        this(file, sanenessVar, new competently(attabalVar, file, bArr, z, z2), (attabalVar == null || z2) ? null : new twybill.saneness(attabalVar));
    }

    public dern(File file, saneness sanenessVar, competently competentlyVar, twybill.saneness sanenessVar2) {
        if (polloi(file)) {
            this.f11422attabal = file;
            this.f11429saneness = sanenessVar;
            this.f11426dern = competentlyVar;
            this.f11431wireman = sanenessVar2;
            this.f11428marial = new HashMap<>();
            this.f11423beachfront = new Random();
            this.f11424competently = sanenessVar.wireman();
            this.f11427impromptu = -1L;
            ConditionVariable conditionVariable = new ConditionVariable();
            new attabal("ExoPlayer:SimpleCacheInit", conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
    }
}
