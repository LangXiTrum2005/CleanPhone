package talweg;

import android.content.Context;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import com.google.common.util.concurrent.adultoid;
import java.util.UUID;
import ocellation.monoploid;

/* JADX INFO: compiled from: WorkForegroundUpdater.java */
/* JADX INFO: loaded from: classes.dex */
public class impassible implements androidx.work.beachfront {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final String f38623wireman = androidx.work.apical.beachfront("WMFgUpdater");

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final arugula.attabal f38624attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final monoploid f38625dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final specky.attabal f38626saneness;

    /* JADX INFO: compiled from: WorkForegroundUpdater.java */
    public class attabal implements Runnable {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ UUID f38627arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ androidx.work.impl.utils.futures.attabal f38628kowloon;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final /* synthetic */ androidx.work.marial f38630monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public final /* synthetic */ Context f38631polloi;

        public attabal(androidx.work.impl.utils.futures.attabal attabalVar, UUID uuid, androidx.work.marial marialVar, Context context) {
            this.f38628kowloon = attabalVar;
            this.f38627arytenoidectomy = uuid;
            this.f38630monoploid = marialVar;
            this.f38631polloi = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.f38628kowloon.isCancelled()) {
                    String string = this.f38627arytenoidectomy.toString();
                    WorkInfo.State stateBeachfront = impassible.this.f38625dern.beachfront(string);
                    if (stateBeachfront == null || stateBeachfront.isFinished()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    impassible.this.f38626saneness.saneness(string, this.f38630monoploid);
                    this.f38631polloi.startService(androidx.work.impl.foreground.attabal.attabal(this.f38631polloi, string, this.f38630monoploid));
                }
                this.f38628kowloon.arytenoidectomy(null);
            } catch (Throwable th) {
                this.f38628kowloon.monoploid(th);
            }
        }
    }

    public impassible(WorkDatabase workDatabase, specky.attabal attabalVar, arugula.attabal attabalVar2) {
        this.f38626saneness = attabalVar;
        this.f38624attabal = attabalVar2;
        this.f38625dern = workDatabase.stratoscope();
    }

    @Override // androidx.work.beachfront
    public adultoid<Void> attabal(Context context, UUID uuid, androidx.work.marial marialVar) {
        androidx.work.impl.utils.futures.attabal attabalVarGraveside = androidx.work.impl.utils.futures.attabal.graveside();
        this.f38624attabal.saneness(new attabal(attabalVarGraveside, uuid, marialVar, context));
        return attabalVarGraveside;
    }
}
