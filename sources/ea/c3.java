package ea;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n4 f39280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h3 f39281c;

    public /* synthetic */ c3(h3 h3Var, n4 n4Var, int i10) {
        this.f39279a = i10;
        this.f39280b = n4Var;
        this.f39281c = h3Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f39279a) {
            case 0:
                h3 h3Var = this.f39281c;
                g0 g0Var = h3Var.f39458d;
                m1 m1Var = (m1) h3Var.f3623a;
                if (g0Var != null) {
                    try {
                        g0Var.p1(this.f39280b);
                    } catch (RemoteException e10) {
                        s0 s0Var = m1Var.f39587f;
                        m1.h(s0Var);
                        s0Var.f39753f.c(e10, "Failed to reset data on the service: remote exception");
                    }
                    h3Var.T0();
                } else {
                    s0 s0Var2 = m1Var.f39587f;
                    m1.h(s0Var2);
                    s0Var2.f39753f.b("Failed to reset data on the service: not connected to service");
                }
                break;
            case 1:
                h3 h3Var2 = this.f39281c;
                g0 g0Var2 = h3Var2.f39458d;
                m1 m1Var2 = (m1) h3Var2.f3623a;
                if (g0Var2 == null) {
                    s0 s0Var3 = m1Var2.f39587f;
                    m1.h(s0Var3);
                    s0Var3.f39753f.b("Discarding data. Failed to send app launch");
                } else {
                    try {
                        n4 n4Var = this.f39280b;
                        g gVar = m1Var2.f39585d;
                        c0 c0Var = d0.W0;
                        if (gVar.R0(null, c0Var)) {
                            h3Var2.Y0(g0Var2, null, n4Var);
                        }
                        g0Var2.O0(n4Var);
                        m1Var2.j().L0();
                        m1Var2.f39585d.R0(null, c0Var);
                        h3Var2.Y0(g0Var2, null, n4Var);
                        h3Var2.T0();
                    } catch (RemoteException e11) {
                        s0 s0Var4 = m1Var2.f39587f;
                        m1.h(s0Var4);
                        s0Var4.f39753f.c(e11, "Failed to send app launch to the service");
                        return;
                    }
                }
                break;
            case 2:
                h3 h3Var3 = this.f39281c;
                g0 g0Var3 = h3Var3.f39458d;
                m1 m1Var3 = (m1) h3Var3.f3623a;
                if (g0Var3 == null) {
                    s0 s0Var5 = m1Var3.f39587f;
                    m1.h(s0Var5);
                    s0Var5.f39756i.b("Failed to send app backgrounded");
                } else {
                    try {
                        g0Var3.m1(this.f39280b);
                        h3Var3.T0();
                    } catch (RemoteException e12) {
                        s0 s0Var6 = m1Var3.f39587f;
                        m1.h(s0Var6);
                        s0Var6.f39753f.c(e12, "Failed to send app backgrounded to the service");
                        return;
                    }
                }
                break;
            case 3:
                h3 h3Var4 = this.f39281c;
                g0 g0Var4 = h3Var4.f39458d;
                m1 m1Var4 = (m1) h3Var4.f3623a;
                if (g0Var4 == null) {
                    s0 s0Var7 = m1Var4.f39587f;
                    m1.h(s0Var7);
                    s0Var7.f39753f.b("Failed to send measurementEnabled to service");
                } else {
                    try {
                        g0Var4.x0(this.f39280b);
                        h3Var4.T0();
                    } catch (RemoteException e13) {
                        s0 s0Var8 = m1Var4.f39587f;
                        m1.h(s0Var8);
                        s0Var8.f39753f.c(e13, "Failed to send measurementEnabled to the service");
                        return;
                    }
                }
                break;
            default:
                h3 h3Var5 = this.f39281c;
                g0 g0Var5 = h3Var5.f39458d;
                m1 m1Var5 = (m1) h3Var5.f3623a;
                if (g0Var5 == null) {
                    s0 s0Var9 = m1Var5.f39587f;
                    m1.h(s0Var9);
                    s0Var9.f39753f.b("Failed to send consent settings to service");
                } else {
                    try {
                        g0Var5.b1(this.f39280b);
                        h3Var5.T0();
                    } catch (RemoteException e14) {
                        s0 s0Var10 = m1Var5.f39587f;
                        m1.h(s0Var10);
                        s0Var10.f39753f.c(e14, "Failed to send consent settings to the service");
                    }
                }
                break;
        }
    }

    public c3(h3 h3Var, n4 n4Var) {
        this.f39279a = 4;
        this.f39280b = n4Var;
        Objects.requireNonNull(h3Var);
        this.f39281c = h3Var;
    }
}
