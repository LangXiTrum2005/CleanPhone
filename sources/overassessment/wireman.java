package overassessment;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.apical;
import androidx.work.impl.WorkDatabase;
import com.google.common.util.concurrent.adultoid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: Processor.java */
/* JADX INFO: loaded from: classes.dex */
public class wireman implements saneness, specky.attabal {

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public static final String f34914cord = apical.beachfront("Processor");

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public Context f34916arytenoidectomy;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public List<marial> f34917dovishness;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public WorkDatabase f34921molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public androidx.work.attabal f34922monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public arugula.attabal f34923polloi;

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public Map<String, cutely> f34915adultoid = new HashMap();

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public Map<String, cutely> f34919graveside = new HashMap();

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public Set<String> f34918gintrap = new HashSet();

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public final List<saneness> f34925rotuma = new ArrayList();

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public PowerManager.WakeLock f34920kowloon = null;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public final Object f34924preprohormone = new Object();

    /* JADX INFO: compiled from: Processor.java */
    public static class attabal implements Runnable {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public String f34926arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public saneness f34927kowloon;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public adultoid<Boolean> f34928monoploid;

        public attabal(saneness sanenessVar, String str, adultoid<Boolean> adultoidVar) {
            this.f34927kowloon = sanenessVar;
            this.f34926arytenoidectomy = str;
            this.f34928monoploid = adultoidVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zBooleanValue;
            try {
                zBooleanValue = this.f34928monoploid.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                zBooleanValue = true;
            }
            this.f34927kowloon.wireman(this.f34926arytenoidectomy, zBooleanValue);
        }
    }

    public wireman(Context context, androidx.work.attabal attabalVar, arugula.attabal attabalVar2, WorkDatabase workDatabase, List<marial> list) {
        this.f34916arytenoidectomy = context;
        this.f34922monoploid = attabalVar;
        this.f34923polloi = attabalVar2;
        this.f34921molybdenite = workDatabase;
        this.f34917dovishness = list;
    }

    public static boolean marial(String str, cutely cutelyVar) {
        if (cutelyVar == null) {
            apical.dern().attabal(f34914cord, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
            return false;
        }
        cutelyVar.wireman();
        apical.dern().attabal(f34914cord, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
        return true;
    }

    public boolean apical(String str, WorkerParameters.attabal attabalVar) throws Throwable {
        Throwable th;
        synchronized (this.f34924preprohormone) {
            try {
                try {
                    if (!competently(str)) {
                        cutely cutelyVarAttabal = new cutely.dern(this.f34916arytenoidectomy, this.f34922monoploid, this.f34923polloi, this, this.f34921molybdenite, str).dern(this.f34917dovishness).saneness(attabalVar).attabal();
                        adultoid<Boolean> adultoidVarSaneness = cutelyVarAttabal.saneness();
                        adultoidVarSaneness.taiyuan(new attabal(this, str, adultoidVarSaneness), this.f34923polloi.attabal());
                        this.f34915adultoid.put(str, cutelyVarAttabal);
                        this.f34923polloi.getBackgroundExecutor().execute(cutelyVarAttabal);
                        apical.dern().attabal(f34914cord, String.format("%s: processing %s", getClass().getSimpleName(), str), new Throwable[0]);
                        return true;
                    }
                    try {
                        apical.dern().attabal(f34914cord, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
            }
            throw th;
        }
    }

    @Override // specky.attabal
    public void attabal(String str) {
        synchronized (this.f34924preprohormone) {
            this.f34919graveside.remove(str);
            impassible();
        }
    }

    public boolean beachfront(String str) {
        boolean zContains;
        synchronized (this.f34924preprohormone) {
            zContains = this.f34918gintrap.contains(str);
        }
        return zContains;
    }

    public boolean competently(String str) {
        boolean z;
        synchronized (this.f34924preprohormone) {
            try {
                z = this.f34915adultoid.containsKey(str) || this.f34919graveside.containsKey(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public boolean cutely(String str) {
        return apical(str, null);
    }

    public void dern(saneness sanenessVar) {
        synchronized (this.f34924preprohormone) {
            this.f34925rotuma.add(sanenessVar);
        }
    }

    public boolean formularize(String str) {
        boolean zMarial;
        synchronized (this.f34924preprohormone) {
            try {
                apical.dern().attabal(f34914cord, String.format("Processor cancelling %s", str), new Throwable[0]);
                this.f34918gintrap.add(str);
                cutely cutelyVarRemove = this.f34919graveside.remove(str);
                boolean z = cutelyVarRemove != null;
                if (cutelyVarRemove == null) {
                    cutelyVarRemove = this.f34915adultoid.remove(str);
                }
                zMarial = marial(str, cutelyVarRemove);
                if (z) {
                    impassible();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zMarial;
    }

    public final void impassible() {
        synchronized (this.f34924preprohormone) {
            try {
                if (this.f34919graveside.isEmpty()) {
                    try {
                        this.f34916arytenoidectomy.startService(androidx.work.impl.foreground.attabal.beachfront(this.f34916arytenoidectomy));
                    } catch (Throwable th) {
                        apical.dern().saneness(f34914cord, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f34920kowloon;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f34920kowloon = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean impromptu(String str) {
        boolean zContainsKey;
        synchronized (this.f34924preprohormone) {
            zContainsKey = this.f34919graveside.containsKey(str);
        }
        return zContainsKey;
    }

    public boolean kowloon(String str) {
        boolean zMarial;
        synchronized (this.f34924preprohormone) {
            apical.dern().attabal(f34914cord, String.format("Processor stopping background work %s", str), new Throwable[0]);
            zMarial = marial(str, this.f34915adultoid.remove(str));
        }
        return zMarial;
    }

    @Override // specky.attabal
    public void saneness(String str, androidx.work.marial marialVar) {
        synchronized (this.f34924preprohormone) {
            try {
                apical.dern().wireman(f34914cord, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
                cutely cutelyVarRemove = this.f34915adultoid.remove(str);
                if (cutelyVarRemove != null) {
                    if (this.f34920kowloon == null) {
                        PowerManager.WakeLock wakeLockSaneness = talweg.apical.saneness(this.f34916arytenoidectomy, "ProcessorForegroundLck");
                        this.f34920kowloon = wakeLockSaneness;
                        wakeLockSaneness.acquire();
                    }
                    this.f34919graveside.put(str, cutelyVarRemove);
                    picketboat.saneness.startForegroundService(this.f34916arytenoidectomy, androidx.work.impl.foreground.attabal.dern(this.f34916arytenoidectomy, str, marialVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void taiyuan(saneness sanenessVar) {
        synchronized (this.f34924preprohormone) {
            this.f34925rotuma.remove(sanenessVar);
        }
    }

    public boolean triweekly(String str) {
        boolean zMarial;
        synchronized (this.f34924preprohormone) {
            apical.dern().attabal(f34914cord, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            zMarial = marial(str, this.f34919graveside.remove(str));
        }
        return zMarial;
    }

    @Override // overassessment.saneness
    public void wireman(String str, boolean z) {
        synchronized (this.f34924preprohormone) {
            try {
                this.f34915adultoid.remove(str);
                apical.dern().attabal(f34914cord, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, Boolean.valueOf(z)), new Throwable[0]);
                Iterator<saneness> it = this.f34925rotuma.iterator();
                while (it.hasNext()) {
                    it.next().wireman(str, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
