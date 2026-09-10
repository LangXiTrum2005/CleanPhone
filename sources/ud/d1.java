package ud;

import com.google.android.gms.internal.ads.kj1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d1 implements rn.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d1 f52058a;
    private static final pn.d descriptor;

    static {
        d1 d1Var = new d1();
        f52058a = d1Var;
        rn.m mVar = new rn.m("com.google.firebase.sessions.Time", d1Var, 3);
        mVar.j("ms", false);
        mVar.j("us", true);
        mVar.j("seconds", true);
        descriptor = mVar;
    }

    @Override // nn.a
    public final void a(f4.a aVar, Object obj) {
        f1 value = (f1) obj;
        kotlin.jvm.internal.n.f(value, "value");
        pn.d dVar = descriptor;
        f4.a aVarA = aVar.a(dVar);
        long j10 = value.f52072a;
        long j11 = value.f52074c;
        long j12 = value.f52073b;
        aVarA.e(dVar, 0, j10);
        if (aVarA.o(dVar) || j12 != ((long) 1000) * j10) {
            aVarA.e(dVar, 1, j12);
        }
        if (aVarA.o(dVar) || j11 != j10 / ((long) 1000)) {
            aVarA.e(dVar, 2, j11);
        }
        aVarA.l(dVar);
    }

    @Override // nn.a
    public final Object b(kj1 decoder) {
        kotlin.jvm.internal.n.f(decoder, "decoder");
        pn.d dVar = descriptor;
        kj1 kj1VarB = decoder.b(dVar);
        int i10 = 0;
        long jG = 0;
        long jG2 = 0;
        long jG3 = 0;
        boolean z10 = true;
        while (z10) {
            int iC = kj1VarB.c(dVar);
            if (iC == -1) {
                z10 = false;
            } else if (iC == 0) {
                jG = kj1VarB.g(dVar, 0);
                i10 |= 1;
            } else if (iC == 1) {
                jG2 = kj1VarB.g(dVar, 1);
                i10 |= 2;
            } else {
                if (iC != 2) {
                    throw new nn.d(iC);
                }
                jG3 = kj1VarB.g(dVar, 2);
                i10 |= 4;
            }
        }
        kj1VarB.n(dVar);
        return new f1(i10, jG, jG2, jG3);
    }

    @Override // rn.e
    public final nn.a[] c() {
        rn.i iVar = rn.i.f49719a;
        return new nn.a[]{iVar, iVar, iVar};
    }

    @Override // nn.a
    public final pn.d d() {
        return descriptor;
    }
}
