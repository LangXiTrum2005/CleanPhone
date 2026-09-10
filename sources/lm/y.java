package lm;

import tl.q0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class y extends kotlin.jvm.internal.o implements jk.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f45599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0 f45600f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(b0 b0Var, int i10) {
        super(1);
        this.f45599e = i10;
        this.f45600f = b0Var;
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        switch (this.f45599e) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                com.google.android.gms.internal.consent_sdk.d dVar = this.f45600f.f45519a;
                vl.f fVar = (vl.f) dVar.f22982b;
                i iVar = (i) dVar.f22981a;
                yl.b bVarR = com.bumptech.glide.c.r(fVar, iIntValue);
                return bVarR.f54503c ? iVar.b(bVarR) : zk.u.e(iVar.f45538b, bVarR);
            case 1:
                int iIntValue2 = ((Number) obj).intValue();
                com.google.android.gms.internal.consent_sdk.d dVar2 = this.f45600f.f45519a;
                yl.b bVarR2 = com.bumptech.glide.c.r((vl.f) dVar2.f22982b, iIntValue2);
                if (!bVarR2.f54503c) {
                    zk.w wVar = ((i) dVar2.f22981a).f45538b;
                    kotlin.jvm.internal.n.f(wVar, "<this>");
                    zk.g gVarE = zk.u.e(wVar, bVarR2);
                    if (gVarE instanceof nm.s) {
                        return (nm.s) gVarE;
                    }
                }
                return null;
            default:
                q0 it = (q0) obj;
                kotlin.jvm.internal.n.f(it, "it");
                return com.google.android.gms.internal.auth.o.t(it, (l3.i) this.f45600f.f45519a.f22984d);
        }
    }
}
