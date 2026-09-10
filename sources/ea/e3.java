package ea;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class e3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f39369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g3 f39370c;

    public /* synthetic */ e3(g3 g3Var, g0 g0Var, int i10) {
        this.f39368a = i10;
        this.f39369b = g0Var;
        this.f39370c = g3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39368a) {
            case 0:
                g3 g3Var = this.f39370c;
                synchronized (g3Var) {
                    try {
                        g3Var.f39427a = false;
                        h3 h3Var = g3Var.f39429c;
                        if (!h3Var.X0()) {
                            s0 s0Var = ((m1) h3Var.f3623a).f39587f;
                            m1.h(s0Var);
                            s0Var.f39760n.b("Connected to service");
                            g0 g0Var = this.f39369b;
                            h3Var.G0();
                            h3Var.f39458d = g0Var;
                            h3Var.T0();
                            h3Var.V0();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            default:
                g3 g3Var2 = this.f39370c;
                synchronized (g3Var2) {
                    try {
                        g3Var2.f39427a = false;
                        h3 h3Var2 = g3Var2.f39429c;
                        if (!h3Var2.X0()) {
                            s0 s0Var2 = ((m1) h3Var2.f3623a).f39587f;
                            m1.h(s0Var2);
                            s0Var2.f39759m.b("Connected to remote service");
                            g0 g0Var2 = this.f39369b;
                            h3Var2.G0();
                            k9.c0.h(g0Var2);
                            h3Var2.f39458d = g0Var2;
                            h3Var2.T0();
                            h3Var2.V0();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                h3 h3Var3 = this.f39370c.f39429c;
                ScheduledExecutorService scheduledExecutorService = h3Var3.f39461g;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    h3Var3.f39461g = null;
                    return;
                }
                return;
        }
    }
}
