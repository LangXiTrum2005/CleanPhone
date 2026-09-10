package ayutthaya;

import androidx.work.apical;
import androidx.work.arytenoidectomy;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: DelayedWorkTracker.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final String f14800wireman = apical.beachfront("DelayedWorkTracker");

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final saneness f14801attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Map<String, Runnable> f14802dern = new HashMap();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final arytenoidectomy f14803saneness;

    /* JADX INFO: renamed from: ayutthaya.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DelayedWorkTracker.java */
    public class RunnableC0125attabal implements Runnable {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ ocellation.arytenoidectomy f14805kowloon;

        public RunnableC0125attabal(ocellation.arytenoidectomy arytenoidectomyVar) {
            this.f14805kowloon = arytenoidectomyVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            apical.dern().attabal(attabal.f14800wireman, String.format("Scheduling work %s", this.f14805kowloon.f33999attabal), new Throwable[0]);
            attabal.this.f14801attabal.beachfront(this.f14805kowloon);
        }
    }

    public attabal(saneness sanenessVar, arytenoidectomy arytenoidectomyVar) {
        this.f14801attabal = sanenessVar;
        this.f14803saneness = arytenoidectomyVar;
    }

    public void attabal(ocellation.arytenoidectomy arytenoidectomyVar) {
        Runnable runnableRemove = this.f14802dern.remove(arytenoidectomyVar.f33999attabal);
        if (runnableRemove != null) {
            this.f14803saneness.attabal(runnableRemove);
        }
        RunnableC0125attabal runnableC0125attabal = new RunnableC0125attabal(arytenoidectomyVar);
        this.f14802dern.put(arytenoidectomyVar.f33999attabal, runnableC0125attabal);
        this.f14803saneness.saneness(arytenoidectomyVar.attabal() - System.currentTimeMillis(), runnableC0125attabal);
    }

    public void saneness(String str) {
        Runnable runnableRemove = this.f14802dern.remove(str);
        if (runnableRemove != null) {
            this.f14803saneness.attabal(runnableRemove);
        }
    }
}
