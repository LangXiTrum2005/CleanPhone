package ea;

import android.content.Intent;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.c7;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class o3 extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f39667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f39668f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o3(Object obj, u1 u1Var, int i10) {
        super(u1Var);
        this.f39667e = i10;
        this.f39668f = obj;
    }

    @Override // ea.n
    public final void a() {
        switch (this.f39667e) {
            case 0:
                c7 c7Var = (c7) this.f39668f;
                p3 p3Var = (p3) c7Var.f13073d;
                p3Var.G0();
                m1 m1Var = (m1) p3Var.f3623a;
                m1Var.f39592k.getClass();
                c7Var.c(SystemClock.elapsedRealtime(), false, false);
                y yVar = m1Var.f39594n;
                m1.e(yVar);
                m1Var.f39592k.getClass();
                yVar.J0(SystemClock.elapsedRealtime());
                break;
            case 1:
                u3 u3Var = (u3) this.f39668f;
                u3Var.L0();
                s0 s0Var = ((m1) u3Var.f3623a).f39587f;
                m1.h(s0Var);
                s0Var.f39760n.b("Starting upload from DelayedRunnable");
                u3Var.f39807b.l();
                break;
            default:
                e4 e4Var = (e4) this.f39668f;
                e4Var.P().G0();
                String str = (String) e4Var.f39386q.pollFirst();
                if (str != null) {
                    ((p9.b) e4Var.i0()).getClass();
                    e4Var.I = SystemClock.elapsedRealtime();
                    e4Var.t().f39760n.c(str, "Sending trigger URI notification to app");
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intent.setPackage(str);
                    e4.R(e4Var.l.f39582a, intent);
                }
                e4Var.E();
                break;
        }
    }
}
