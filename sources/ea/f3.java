package ea;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h3 f39412b;

    public /* synthetic */ f3(h3 h3Var, int i10) {
        this.f39411a = i10;
        this.f39412b = h3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39411a) {
            case 0:
                this.f39412b.M0();
                break;
            case 1:
                h3 h3Var = this.f39412b;
                m1 m1Var = (m1) h3Var.f3623a;
                g0 g0Var = h3Var.f39458d;
                if (g0Var == null) {
                    s0 s0Var = m1Var.f39587f;
                    m1.h(s0Var);
                    s0Var.f39753f.b("Failed to send Dma consent settings to service");
                } else {
                    try {
                        g0Var.y0(h3Var.W0(false));
                        h3Var.T0();
                    } catch (RemoteException e10) {
                        s0 s0Var2 = m1Var.f39587f;
                        m1.h(s0Var2);
                        s0Var2.f39753f.c(e10, "Failed to send Dma consent settings to the service");
                        return;
                    }
                }
                break;
            default:
                h3 h3Var2 = this.f39412b;
                m1 m1Var2 = (m1) h3Var2.f3623a;
                g0 g0Var2 = h3Var2.f39458d;
                if (g0Var2 == null) {
                    s0 s0Var3 = m1Var2.f39587f;
                    m1.h(s0Var3);
                    s0Var3.f39753f.b("Failed to send storage consent settings to service");
                } else {
                    try {
                        g0Var2.J0(h3Var2.W0(false));
                        h3Var2.T0();
                    } catch (RemoteException e11) {
                        s0 s0Var4 = m1Var2.f39587f;
                        m1.h(s0Var4);
                        s0Var4.f39753f.c(e11, "Failed to send storage consent settings to the service");
                    }
                }
                break;
        }
    }
}
