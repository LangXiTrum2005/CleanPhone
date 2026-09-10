package ea;

import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.c7;
import com.google.android.gms.internal.measurement.u6;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class p3 extends f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u6 f39704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f39705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final am.e f39706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c7 f39707f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f2 f39708g;

    public p3(m1 m1Var) {
        super(m1Var);
        this.f39705d = true;
        this.f39706e = new am.e(this, 5);
        c7 c7Var = new c7();
        c7Var.f13073d = this;
        m1 m1Var2 = (m1) this.f3623a;
        c7Var.f13072c = new o3(c7Var, m1Var2, 0);
        m1Var2.f39592k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        c7Var.f13070a = jElapsedRealtime;
        c7Var.f13071b = jElapsedRealtime;
        this.f39707f = c7Var;
        this.f39708g = new f2(this);
    }

    @Override // ea.f0
    public final boolean J0() {
        return false;
    }

    public final void K0() {
        G0();
        if (this.f39704c == null) {
            this.f39704c = new u6(Looper.getMainLooper(), 0);
        }
    }
}
