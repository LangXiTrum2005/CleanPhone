package talweg;

import android.content.Context;
import androidx.work.ListenableWorker;
import com.google.common.util.concurrent.adultoid;
import ocellation.arytenoidectomy;

/* JADX INFO: compiled from: WorkForegroundRunnable.java */
/* JADX INFO: loaded from: classes.dex */
public class formularize implements Runnable {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public static final String f38612adultoid = androidx.work.apical.beachfront("WorkForegroundRunnable");

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final Context f38613arytenoidectomy;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final arugula.attabal f38614graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final androidx.work.impl.utils.futures.attabal<Void> f38615kowloon = androidx.work.impl.utils.futures.attabal.graveside();

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final androidx.work.beachfront f38616molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final arytenoidectomy f38617monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final ListenableWorker f38618polloi;

    /* JADX INFO: compiled from: WorkForegroundRunnable.java */
    public class attabal implements Runnable {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ androidx.work.impl.utils.futures.attabal f38620kowloon;

        public attabal(androidx.work.impl.utils.futures.attabal attabalVar) {
            this.f38620kowloon = attabalVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f38620kowloon.polloi(formularize.this.f38618polloi.getForegroundInfoAsync());
        }
    }

    /* JADX INFO: compiled from: WorkForegroundRunnable.java */
    public class saneness implements Runnable {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ androidx.work.impl.utils.futures.attabal f38622kowloon;

        public saneness(androidx.work.impl.utils.futures.attabal attabalVar) {
            this.f38622kowloon = attabalVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                androidx.work.marial marialVar = (androidx.work.marial) this.f38622kowloon.get();
                if (marialVar == null) {
                    throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", formularize.this.f38617monoploid.f34003dern));
                }
                androidx.work.apical.dern().attabal(formularize.f38612adultoid, String.format("Updating notification for %s", formularize.this.f38617monoploid.f34003dern), new Throwable[0]);
                formularize.this.f38618polloi.setRunInForeground(true);
                formularize formularizeVar = formularize.this;
                formularizeVar.f38615kowloon.polloi(formularizeVar.f38616molybdenite.attabal(formularizeVar.f38613arytenoidectomy, formularizeVar.f38618polloi.getId(), marialVar));
            } catch (Throwable th) {
                formularize.this.f38615kowloon.monoploid(th);
            }
        }
    }

    public formularize(Context context, arytenoidectomy arytenoidectomyVar, ListenableWorker listenableWorker, androidx.work.beachfront beachfrontVar, arugula.attabal attabalVar) {
        this.f38613arytenoidectomy = context;
        this.f38617monoploid = arytenoidectomyVar;
        this.f38618polloi = listenableWorker;
        this.f38616molybdenite = beachfrontVar;
        this.f38614graveside = attabalVar;
    }

    public adultoid<Void> attabal() {
        return this.f38615kowloon;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.f38617monoploid.f34009monoploid || claque.attabal.dern()) {
            this.f38615kowloon.arytenoidectomy(null);
            return;
        }
        androidx.work.impl.utils.futures.attabal attabalVarGraveside = androidx.work.impl.utils.futures.attabal.graveside();
        this.f38614graveside.attabal().execute(new attabal(attabalVarGraveside));
        attabalVarGraveside.taiyuan(new saneness(attabalVarGraveside), this.f38614graveside.attabal());
    }
}
