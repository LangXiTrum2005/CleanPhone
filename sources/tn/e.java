package tn;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e extends k implements jk.c {
    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        pn.d p10 = (pn.d) obj;
        int iIntValue = ((Number) obj2).intValue();
        n.f(p10, "p0");
        f fVar = (f) this.receiver;
        fVar.getClass();
        boolean z10 = !p10.i(iIntValue) && p10.g(iIntValue).b();
        fVar.f51596b = z10;
        return Boolean.valueOf(z10);
    }
}
