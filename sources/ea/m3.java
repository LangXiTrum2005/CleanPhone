package ea;

import android.os.SystemClock;
import com.google.android.gms.internal.ads.c7;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class m3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f39610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3 f39611c;

    public m3(p3 p3Var, long j10, int i10) {
        this.f39609a = i10;
        switch (i10) {
            case 1:
                this.f39610b = j10;
                Objects.requireNonNull(p3Var);
                this.f39611c = p3Var;
                break;
            default:
                this.f39610b = j10;
                Objects.requireNonNull(p3Var);
                this.f39611c = p3Var;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00b1  */
    @Override // java.lang.Runnable
    public final void run() {
        long jElapsedRealtime;
        switch (this.f39609a) {
            case 0:
                p3 p3Var = this.f39611c;
                c7 c7Var = p3Var.f39707f;
                p3Var.G0();
                p3Var.K0();
                m1 m1Var = (m1) p3Var.f3623a;
                s0 s0Var = m1Var.f39587f;
                m1.h(s0Var);
                bo.b bVar = s0Var.f39760n;
                long j10 = this.f39610b;
                bVar.c(Long.valueOf(j10), "Activity resumed, time");
                g gVar = m1Var.f39585d;
                if (gVar.R0(null, d0.S0)) {
                    if (gVar.V0() || p3Var.f39705d) {
                        ((p3) c7Var.f13073d).G0();
                        ((o3) c7Var.f13072c).c();
                        c7Var.f13070a = j10;
                        c7Var.f13071b = j10;
                    }
                } else if (gVar.V0()) {
                    ((p3) c7Var.f13073d).G0();
                    ((o3) c7Var.f13072c).c();
                    c7Var.f13070a = j10;
                    c7Var.f13071b = j10;
                } else {
                    a1 a1Var = m1Var.f39586e;
                    m1.f(a1Var);
                    if (a1Var.f39219s.a()) {
                        ((p3) c7Var.f13073d).G0();
                        ((o3) c7Var.f13072c).c();
                        c7Var.f13070a = j10;
                        c7Var.f13071b = j10;
                    }
                }
                f2 f2Var = p3Var.f39708g;
                p3 p3Var2 = (p3) f2Var.f39410c;
                p3Var2.G0();
                n3 n3Var = (n3) f2Var.f39409b;
                if (n3Var != null) {
                    p3Var2.f39704c.removeCallbacks(n3Var);
                }
                a1 a1Var2 = ((m1) p3Var2.f3623a).f39586e;
                m1.f(a1Var2);
                a1Var2.f39219s.b(false);
                p3Var2.G0();
                p3Var2.f39705d = false;
                am.e eVar = p3Var.f39706e;
                p3 p3Var3 = (p3) eVar.f3698b;
                p3Var3.G0();
                m1 m1Var2 = (m1) p3Var3.f3623a;
                boolean zA = m1Var2.a();
                p9.b bVar2 = m1Var2.f39592k;
                if (zA) {
                    bVar2.getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (m1Var2.f39585d.R0(null, d0.f39301e1)) {
                        bVar2.getClass();
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                    } else {
                        jElapsedRealtime = 0;
                    }
                    eVar.F(jCurrentTimeMillis, jElapsedRealtime);
                    break;
                }
                break;
            default:
                p3 p3Var4 = this.f39611c;
                p3Var4.G0();
                p3Var4.K0();
                m1 m1Var3 = (m1) p3Var4.f3623a;
                s0 s0Var2 = m1Var3.f39587f;
                m1.h(s0Var2);
                bo.b bVar3 = s0Var2.f39760n;
                long j11 = this.f39610b;
                bVar3.c(Long.valueOf(j11), "Activity paused, time");
                f2 f2Var2 = p3Var4.f39708g;
                p3 p3Var5 = (p3) f2Var2.f39410c;
                ((m1) p3Var5.f3623a).f39592k.getClass();
                n3 n3Var2 = new n3(f2Var2, System.currentTimeMillis(), j11);
                f2Var2.f39409b = n3Var2;
                p3Var5.f39704c.postDelayed(n3Var2, 2000L);
                if (m1Var3.f39585d.V0()) {
                    ((o3) p3Var4.f39707f.f13072c).c();
                }
                break;
        }
    }
}
