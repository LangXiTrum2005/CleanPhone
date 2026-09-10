package ea;

import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class y extends z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x.e f39917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x.e f39918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f39919d;

    public y(m1 m1Var) {
        super(m1Var);
        this.f39918c = new x.e(0);
        this.f39917b = new x.e(0);
    }

    public final void H0(long j10, String str) {
        m1 m1Var = (m1) this.f3623a;
        if (str == null || str.length() == 0) {
            s0 s0Var = m1Var.f39587f;
            m1.h(s0Var);
            s0Var.f39753f.b("Ad unit id must be a non-empty string");
        } else {
            j1 j1Var = m1Var.f39588g;
            m1.h(j1Var);
            j1Var.P0(new a(this, str, j10, 0));
        }
    }

    public final void I0(long j10, String str) {
        m1 m1Var = (m1) this.f3623a;
        if (str == null || str.length() == 0) {
            s0 s0Var = m1Var.f39587f;
            m1.h(s0Var);
            s0Var.f39753f.b("Ad unit id must be a non-empty string");
        } else {
            j1 j1Var = m1Var.f39588g;
            m1.h(j1Var);
            j1Var.P0(new a(this, str, j10, 1));
        }
    }

    public final void J0(long j10) {
        z2 z2Var = ((m1) this.f3623a).l;
        m1.g(z2Var);
        w2 w2VarK0 = z2Var.K0(false);
        x.e eVar = this.f39917b;
        for (String str : (x.b) eVar.keySet()) {
            L0(str, j10 - ((Long) eVar.get(str)).longValue(), w2VarK0);
        }
        if (!eVar.isEmpty()) {
            K0(j10 - this.f39919d, w2VarK0);
        }
        M0(j10);
    }

    public final void K0(long j10, w2 w2Var) {
        m1 m1Var = (m1) this.f3623a;
        if (w2Var == null) {
            s0 s0Var = m1Var.f39587f;
            m1.h(s0Var);
            s0Var.f39760n.b("Not logging ad exposure. No active activity");
        } else if (j10 < 1000) {
            s0 s0Var2 = m1Var.f39587f;
            m1.h(s0Var2);
            s0Var2.f39760n.c(Long.valueOf(j10), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j10);
            l4.B1(w2Var, bundle, true);
            p2 p2Var = m1Var.f39593m;
            m1.g(p2Var);
            p2Var.N0("am", bundle, "_xa");
        }
    }

    public final void L0(String str, long j10, w2 w2Var) {
        m1 m1Var = (m1) this.f3623a;
        if (w2Var == null) {
            s0 s0Var = m1Var.f39587f;
            m1.h(s0Var);
            s0Var.f39760n.b("Not logging ad unit exposure. No active activity");
        } else {
            if (j10 < 1000) {
                s0 s0Var2 = m1Var.f39587f;
                m1.h(s0Var2);
                s0Var2.f39760n.c(Long.valueOf(j10), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j10);
            l4.B1(w2Var, bundle, true);
            p2 p2Var = m1Var.f39593m;
            m1.g(p2Var);
            p2Var.N0("am", bundle, "_xu");
        }
    }

    public final void M0(long j10) {
        x.e eVar = this.f39917b;
        Iterator it = ((x.b) eVar.keySet()).iterator();
        while (it.hasNext()) {
            eVar.put((String) it.next(), Long.valueOf(j10));
        }
        if (eVar.isEmpty()) {
            return;
        }
        this.f39919d = j10;
    }
}
