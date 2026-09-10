package ea;

import android.os.Handler;
import com.google.android.gms.internal.measurement.u6;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile u6 f39614d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u1 f39615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ta.i0 f39616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f39617c;

    public n(u1 u1Var) {
        k9.c0.h(u1Var);
        this.f39615a = u1Var;
        this.f39616b = new ta.i0(this, false, u1Var, 5);
    }

    public abstract void a();

    public final void b(long j10) {
        c();
        if (j10 >= 0) {
            u1 u1Var = this.f39615a;
            ((p9.b) u1Var.i0()).getClass();
            this.f39617c = System.currentTimeMillis();
            if (d().postDelayed(this.f39616b, j10)) {
                return;
            }
            u1Var.t().f39753f.c(Long.valueOf(j10), "Failed to schedule delayed post. time");
        }
    }

    public final void c() {
        this.f39617c = 0L;
        d().removeCallbacks(this.f39616b);
    }

    public final Handler d() {
        u6 u6Var;
        if (f39614d != null) {
            return f39614d;
        }
        synchronized (n.class) {
            try {
                if (f39614d == null) {
                    f39614d = new u6(this.f39615a.Q().getMainLooper(), 0);
                }
                u6Var = f39614d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return u6Var;
    }
}
