package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.mf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0467mf implements Jb<AbstractC0360gf, C0630w> {
    @Override // com.ironsource.Jb
    public C0630w a(AbstractC0360gf input) {
        String strH;
        String strI;
        String strG;
        S7 s7E;
        String strC;
        kotlin.jvm.internal.n.f(input, "input");
        EnumC0485nf enumC0485nfB = input.b();
        P pA = input.a();
        if (pA == null || (strH = pA.h()) == null) {
            strH = "0";
        }
        P pA2 = input.a();
        if (pA2 == null || (strI = pA2.i()) == null) {
            strI = "0";
        }
        P pA3 = input.a();
        if (pA3 == null || (strG = pA3.g()) == null) {
            strG = "0";
        }
        P pA4 = input.a();
        if (pA4 == null || (s7E = pA4.e()) == null) {
            s7E = S7.UnknownProvider;
        }
        P pA5 = input.a();
        return new C0630w(enumC0485nfB, strH, strI, strG, s7E, (pA5 == null || (strC = pA5.c()) == null) ? "0" : strC);
    }
}
