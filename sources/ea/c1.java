package ea;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39275a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m1 f39276b;

    public c1(e4 e4Var) {
        this.f39276b = e4Var.l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a() {
        switch (this.f39275a) {
            case 0:
                m1 m1Var = this.f39276b;
                boolean z10 = false;
                try {
                    f7.a aVarA = r9.c.a(m1Var.f39582a);
                    if (aVarA == null) {
                        s0 s0Var = m1Var.f39587f;
                        m1.h(s0Var);
                        s0Var.f39760n.b("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                        m1Var = m1Var;
                    } else {
                        int i10 = aVarA.f(128, "com.android.vending").versionCode;
                        m1Var = i10;
                        if (i10 >= 80837300) {
                            z10 = true;
                            m1Var = i10;
                        }
                    }
                    break;
                } catch (Exception e10) {
                    s0 s0Var2 = m1Var.f39587f;
                    m1.h(s0Var2);
                    s0Var2.f39760n.c(e10, "Failed to retrieve Play Store version for Install Referrer");
                }
                return z10;
            default:
                s0 s0Var3 = this.f39276b.f39587f;
                m1.h(s0Var3);
                return Log.isLoggable(s0Var3.Q0(), 3);
        }
    }

    public c1(b2 b2Var, m1 m1Var) {
        this.f39276b = m1Var;
    }
}
