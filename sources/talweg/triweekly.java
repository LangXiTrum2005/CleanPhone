package talweg;

import android.content.Context;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import com.google.common.util.concurrent.adultoid;
import java.util.UUID;
import ocellation.arytenoidectomy;

/* JADX INFO: compiled from: WorkProgressUpdater.java */
/* JADX INFO: loaded from: classes.dex */
public class triweekly implements androidx.work.triweekly {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final String f38655dern = androidx.work.apical.beachfront("WorkProgressUpdater");

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final WorkDatabase f38656attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final arugula.attabal f38657saneness;

    /* JADX INFO: compiled from: WorkProgressUpdater.java */
    public class attabal implements Runnable {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ androidx.work.wireman f38658arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ UUID f38659kowloon;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final /* synthetic */ androidx.work.impl.utils.futures.attabal f38660monoploid;

        public attabal(UUID uuid, androidx.work.wireman wiremanVar, androidx.work.impl.utils.futures.attabal attabalVar) {
            this.f38659kowloon = uuid;
            this.f38658arytenoidectomy = wiremanVar;
            this.f38660monoploid = attabalVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            String string = this.f38659kowloon.toString();
            androidx.work.apical apicalVarDern = androidx.work.apical.dern();
            String str = triweekly.f38655dern;
            apicalVarDern.attabal(str, String.format("Updating progress for %s (%s)", this.f38659kowloon, this.f38658arytenoidectomy), new Throwable[0]);
            triweekly.this.f38656attabal.dern();
            try {
                arytenoidectomy arytenoidectomyVarCompetently = triweekly.this.f38656attabal.stratoscope().competently(string);
                if (arytenoidectomyVarCompetently == null) {
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                if (arytenoidectomyVarCompetently.f34011saneness == WorkInfo.State.RUNNING) {
                    triweekly.this.f38656attabal.cuirassed().saneness(new ocellation.impassible(string, this.f38658arytenoidectomy));
                } else {
                    androidx.work.apical.dern().impromptu(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", string), new Throwable[0]);
                }
                this.f38660monoploid.arytenoidectomy(null);
                triweekly.this.f38656attabal.polloi();
            } catch (Throwable th) {
                try {
                    androidx.work.apical.dern().saneness(triweekly.f38655dern, "Error updating Worker progress", th);
                    this.f38660monoploid.monoploid(th);
                } finally {
                    triweekly.this.f38656attabal.competently();
                }
            }
        }
    }

    public triweekly(WorkDatabase workDatabase, arugula.attabal attabalVar) {
        this.f38656attabal = workDatabase;
        this.f38657saneness = attabalVar;
    }

    @Override // androidx.work.triweekly
    public adultoid<Void> attabal(Context context, UUID uuid, androidx.work.wireman wiremanVar) {
        androidx.work.impl.utils.futures.attabal attabalVarGraveside = androidx.work.impl.utils.futures.attabal.graveside();
        this.f38657saneness.saneness(new attabal(uuid, wiremanVar, attabalVarGraveside));
        return attabalVarGraveside;
    }
}
