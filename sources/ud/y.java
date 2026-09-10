package ud;

import com.google.android.gms.internal.ads.kj1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y implements rn.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f52186a;
    private static final pn.d descriptor;

    static {
        y yVar = new y();
        f52186a = yVar;
        rn.m mVar = new rn.m("com.google.firebase.sessions.ProcessData", yVar, 2);
        mVar.j("pid", false);
        mVar.j("uuid", false);
        descriptor = mVar;
    }

    @Override // nn.a
    public final void a(f4.a aVar, Object obj) {
        a0 value = (a0) obj;
        kotlin.jvm.internal.n.f(value, "value");
        pn.d dVar = descriptor;
        f4.a aVarA = aVar.a(dVar);
        int i10 = value.f52010a;
        aVarA.b(dVar, 0);
        aVarA.c(i10);
        aVarA.k(dVar, 1, value.f52011b);
        aVarA.l(dVar);
    }

    @Override // nn.a
    public final Object b(kj1 decoder) {
        kotlin.jvm.internal.n.f(decoder, "decoder");
        pn.d dVar = descriptor;
        kj1 kj1VarB = decoder.b(dVar);
        String strM = null;
        boolean z10 = true;
        int i10 = 0;
        int iE = 0;
        while (z10) {
            int iC = kj1VarB.c(dVar);
            if (iC == -1) {
                z10 = false;
            } else if (iC == 0) {
                iE = kj1VarB.e(dVar, 0);
                i10 |= 1;
            } else {
                if (iC != 1) {
                    throw new nn.d(iC);
                }
                strM = kj1VarB.m(dVar, 1);
                i10 |= 2;
            }
        }
        kj1VarB.n(dVar);
        return new a0(i10, iE, strM);
    }

    @Override // rn.e
    public final nn.a[] c() {
        return new nn.a[]{rn.f.f49713a, rn.p.f49742a};
    }

    @Override // nn.a
    public final pn.d d() {
        return descriptor;
    }
}
