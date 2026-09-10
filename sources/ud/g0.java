package ud;

import com.google.android.gms.internal.ads.kj1;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g0 implements rn.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f52079a;
    private static final pn.d descriptor;

    static {
        g0 g0Var = new g0();
        f52079a = g0Var;
        rn.m mVar = new rn.m("com.google.firebase.sessions.SessionData", g0Var, 3);
        mVar.j("sessionDetails", false);
        mVar.j("backgroundTime", true);
        mVar.j("processDataMap", true);
        descriptor = mVar;
    }

    @Override // nn.a
    public final void a(f4.a aVar, Object obj) {
        i0 value = (i0) obj;
        kotlin.jvm.internal.n.f(value, "value");
        pn.d dVar = descriptor;
        f4.a aVarA = aVar.a(dVar);
        wj.d[] dVarArr = i0.f52105d;
        k0 k0Var = k0.f52118a;
        m0 m0Var = value.f52106a;
        Map map = value.f52108c;
        f1 f1Var = value.f52107b;
        aVarA.h(dVar, 0, k0Var, m0Var);
        if (aVarA.o(dVar) || f1Var != null) {
            aVarA.g(dVar, 1, d1.f52058a, f1Var);
        }
        if (aVarA.o(dVar) || map != null) {
            aVarA.g(dVar, 2, (nn.a) dVarArr[2].getValue(), map);
        }
        aVarA.l(dVar);
    }

    @Override // nn.a
    public final Object b(kj1 decoder) {
        kotlin.jvm.internal.n.f(decoder, "decoder");
        pn.d dVar = descriptor;
        kj1 kj1VarB = decoder.b(dVar);
        wj.d[] dVarArr = i0.f52105d;
        m0 m0Var = null;
        boolean z10 = true;
        int i10 = 0;
        f1 f1Var = null;
        Map map = null;
        while (z10) {
            int iC = kj1VarB.c(dVar);
            if (iC == -1) {
                z10 = false;
            } else if (iC == 0) {
                m0Var = (m0) kj1VarB.j(dVar, 0, k0.f52118a, m0Var);
                i10 |= 1;
            } else if (iC == 1) {
                f1Var = (f1) kj1VarB.i(dVar, 1, d1.f52058a, f1Var);
                i10 |= 2;
            } else {
                if (iC != 2) {
                    throw new nn.d(iC);
                }
                map = (Map) kj1VarB.i(dVar, 2, (nn.a) dVarArr[2].getValue(), map);
                i10 |= 4;
            }
        }
        kj1VarB.n(dVar);
        return new i0(i10, m0Var, f1Var, map);
    }

    @Override // rn.e
    public final nn.a[] c() {
        return new nn.a[]{k0.f52118a, no.b.v(d1.f52058a), no.b.v((nn.a) i0.f52105d[2].getValue())};
    }

    @Override // nn.a
    public final pn.d d() {
        return descriptor;
    }
}
