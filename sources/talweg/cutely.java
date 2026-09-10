package talweg;

import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import ocellation.monoploid;

/* JADX INFO: compiled from: StopWorkRunnable.java */
/* JADX INFO: loaded from: classes.dex */
public class cutely implements Runnable {

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final String f38607polloi = androidx.work.apical.beachfront("StopWorkRunnable");

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final String f38608arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final overassessment.taiyuan f38609kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final boolean f38610monoploid;

    public cutely(overassessment.taiyuan taiyuanVar, String str, boolean z) {
        this.f38609kowloon = taiyuanVar;
        this.f38608arytenoidectomy = str;
        this.f38610monoploid = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zKowloon;
        WorkDatabase workDatabaseKowloon = this.f38609kowloon.kowloon();
        overassessment.wireman wiremanVarImpassible = this.f38609kowloon.impassible();
        monoploid monoploidVarStratoscope = workDatabaseKowloon.stratoscope();
        workDatabaseKowloon.dern();
        try {
            boolean zImpromptu = wiremanVarImpassible.impromptu(this.f38608arytenoidectomy);
            if (this.f38610monoploid) {
                zKowloon = this.f38609kowloon.impassible().triweekly(this.f38608arytenoidectomy);
            } else {
                if (!zImpromptu && monoploidVarStratoscope.beachfront(this.f38608arytenoidectomy) == WorkInfo.State.RUNNING) {
                    monoploidVarStratoscope.saneness(WorkInfo.State.ENQUEUED, this.f38608arytenoidectomy);
                }
                zKowloon = this.f38609kowloon.impassible().kowloon(this.f38608arytenoidectomy);
            }
            androidx.work.apical.dern().attabal(f38607polloi, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f38608arytenoidectomy, Boolean.valueOf(zKowloon)), new Throwable[0]);
            workDatabaseKowloon.polloi();
        } finally {
            workDatabaseKowloon.competently();
        }
    }
}
