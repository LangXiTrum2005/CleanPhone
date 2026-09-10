package ea;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.c7;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class h2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f39455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p2 f39456c;

    public h2(p2 p2Var, long j10, int i10) {
        this.f39454a = i10;
        switch (i10) {
            case 1:
                this.f39455b = j10;
                this.f39456c = p2Var;
                break;
            default:
                this.f39455b = j10;
                Objects.requireNonNull(p2Var);
                this.f39456c = p2Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39454a) {
            case 0:
                m1 m1Var = (m1) this.f39456c.f3623a;
                a1 a1Var = m1Var.f39586e;
                m1.f(a1Var);
                z0 z0Var = a1Var.f39212k;
                long j10 = this.f39455b;
                z0Var.f(j10);
                s0 s0Var = m1Var.f39587f;
                m1.h(s0Var);
                s0Var.f39759m.c(Long.valueOf(j10), "Session timeout duration set");
                break;
            default:
                p2 p2Var = this.f39456c;
                p2Var.G0();
                p2Var.H0();
                m1 m1Var2 = (m1) p2Var.f3623a;
                s0 s0Var2 = m1Var2.f39587f;
                m1.h(s0Var2);
                s0Var2.f39759m.b("Resetting analytics data (FE)");
                p3 p3Var = m1Var2.f39589h;
                m1.g(p3Var);
                p3Var.G0();
                c7 c7Var = p3Var.f39707f;
                ((o3) c7Var.f13072c).c();
                ((m1) ((p3) c7Var.f13073d).f3623a).f39592k.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                c7Var.f13070a = jElapsedRealtime;
                c7Var.f13071b = jElapsedRealtime;
                m1Var2.m().L0();
                boolean z10 = !m1Var2.a();
                a1 a1Var2 = m1Var2.f39586e;
                m1.f(a1Var2);
                a1Var2.f39207f.f(this.f39455b);
                m1 m1Var3 = (m1) a1Var2.f3623a;
                a1 a1Var3 = m1Var3.f39586e;
                m1.f(a1Var3);
                if (!TextUtils.isEmpty(a1Var3.f39222v.g())) {
                    a1Var2.f39222v.h(null);
                }
                a1Var2.f39216p.f(0L);
                a1Var2.f39217q.f(0L);
                if (!m1Var3.f39585d.U0()) {
                    a1Var2.O0(z10);
                }
                a1Var2.f39223w.h(null);
                a1Var2.f39224x.f(0L);
                a1Var2.f39225y.H(null);
                h3 h3VarK = m1Var2.k();
                h3VarK.G0();
                h3VarK.H0();
                n4 n4VarW0 = h3VarK.W0(false);
                h3VarK.S0();
                ((m1) h3VarK.f3623a).j().K0();
                h3VarK.U0(new c3(h3VarK, n4VarW0, 0));
                m1.g(p3Var);
                p3Var.f39706e.E();
                p2Var.f39699r = z10;
                m1Var2.k().K0(new AtomicReference());
                break;
        }
    }
}
