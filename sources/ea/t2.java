package ea;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class t2 extends f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JobScheduler f39767c;

    @Override // ea.f0
    public final boolean J0() {
        return true;
    }

    public final void K0(long j10) {
        m1 m1Var = (m1) this.f3623a;
        H0();
        G0();
        JobScheduler jobScheduler = this.f39767c;
        if (jobScheduler != null && jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(m1Var.f39582a.getPackageName())).hashCode()) != null) {
            s0 s0Var = m1Var.f39587f;
            m1.h(s0Var);
            s0Var.f39760n.b("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        int iL0 = L0();
        if (iL0 != 2) {
            s0 s0Var2 = m1Var.f39587f;
            m1.h(s0Var2);
            s0Var2.f39760n.c(com.google.android.gms.internal.measurement.f2.B(iL0), "[sgtm] Not eligible for Scion upload");
            return;
        }
        s0 s0Var3 = m1Var.f39587f;
        m1.h(s0Var3);
        s0Var3.f39760n.c(Long.valueOf(j10), "[sgtm] Scheduling Scion upload, millis");
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        JobInfo jobInfoBuild = new JobInfo.Builder("measurement-client".concat(String.valueOf(m1Var.f39582a.getPackageName())).hashCode(), new ComponentName(m1Var.f39582a, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j10).setOverrideDeadline(j10 + j10).setExtras(persistableBundle).build();
        JobScheduler jobScheduler2 = this.f39767c;
        k9.c0.h(jobScheduler2);
        int iSchedule = jobScheduler2.schedule(jobInfoBuild);
        s0 s0Var4 = m1Var.f39587f;
        m1.h(s0Var4);
        s0Var4.f39760n.c(iSchedule == 1 ? "SUCCESS" : "FAILURE", "[sgtm] Scion upload job scheduled with result");
    }

    public final int L0() {
        m1 m1Var = (m1) this.f3623a;
        H0();
        G0();
        if (this.f39767c == null) {
            return 7;
        }
        Boolean boolT0 = m1Var.f39585d.T0("google_analytics_sgtm_upload_enabled");
        if (!(boolT0 == null ? false : boolT0.booleanValue())) {
            return 8;
        }
        if (m1Var.m().f39541j < 119000) {
            return 6;
        }
        if (l4.b1(m1Var.f39582a)) {
            return !m1Var.k().N0() ? 5 : 2;
        }
        return 3;
    }
}
