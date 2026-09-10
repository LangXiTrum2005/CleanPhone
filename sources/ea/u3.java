package ea;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.measurement.s6;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class u3 extends z3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AlarmManager f39789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o3 f39790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f39791f;

    public u3(e4 e4Var) {
        super(e4Var);
        this.f39789d = (AlarmManager) ((m1) this.f3623a).f39582a.getSystemService(NotificationCompat.CATEGORY_ALARM);
    }

    @Override // ea.z3
    public final void J0() {
        AlarmManager alarmManager = this.f39789d;
        if (alarmManager != null) {
            Context context = ((m1) this.f3623a).f39582a;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), s6.f23954a));
        }
        M0();
    }

    public final n K0() {
        if (this.f39790e == null) {
            this.f39790e = new o3(this, this.f39807b.l, 1);
        }
        return this.f39790e;
    }

    public final void L0() {
        H0();
        m1 m1Var = (m1) this.f3623a;
        s0 s0Var = m1Var.f39587f;
        m1.h(s0Var);
        s0Var.f39760n.b("Unscheduling upload");
        AlarmManager alarmManager = this.f39789d;
        if (alarmManager != null) {
            Context context = m1Var.f39582a;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), s6.f23954a));
        }
        K0().c();
        M0();
    }

    public final void M0() {
        JobScheduler jobScheduler = (JobScheduler) ((m1) this.f3623a).f39582a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(N0());
        }
    }

    public final int N0() {
        if (this.f39791f == null) {
            this.f39791f = Integer.valueOf("measurement".concat(String.valueOf(((m1) this.f3623a).f39582a.getPackageName())).hashCode());
        }
        return this.f39791f.intValue();
    }
}
