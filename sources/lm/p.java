package lm;

import tl.g0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends kotlin.jvm.internal.o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f45573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f45574f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g0 f45575g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ nm.q f45576h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(r rVar, g0 g0Var, nm.q qVar, int i10) {
        super(0);
        this.f45573e = i10;
        this.f45574f = rVar;
        this.f45575g = g0Var;
        this.f45576h = qVar;
    }

    @Override // jk.a
    public final Object invoke() {
        switch (this.f45573e) {
            case 0:
                r rVar = this.f45574f;
                com.google.android.gms.internal.consent_sdk.d dVar = rVar.f45583a;
                u uVarA = rVar.a((zk.j) dVar.f22983c);
                kotlin.jvm.internal.n.c(uVarA);
                a aVar = ((i) dVar.f22981a).f45541e;
                pm.y returnType = this.f45576h.getReturnType();
                kotlin.jvm.internal.n.e(returnType, "property.returnType");
                return (dm.g) aVar.x(uVarA, this.f45575g, returnType);
            case 1:
                r rVar2 = this.f45574f;
                om.l lVar = ((i) rVar2.f45583a.f22981a).f45537a;
                p pVar = new p(rVar2, this.f45575g, this.f45576h, 0);
                lVar.getClass();
                return new om.h(lVar, pVar);
            case 2:
                r rVar3 = this.f45574f;
                com.google.android.gms.internal.consent_sdk.d dVar2 = rVar3.f45583a;
                u uVarA2 = rVar3.a((zk.j) dVar2.f22983c);
                kotlin.jvm.internal.n.c(uVarA2);
                a aVar2 = ((i) dVar2.f22981a).f45541e;
                pm.y returnType2 = this.f45576h.getReturnType();
                kotlin.jvm.internal.n.e(returnType2, "property.returnType");
                return (dm.g) aVar2.F0(uVarA2, this.f45575g, returnType2);
            default:
                r rVar4 = this.f45574f;
                om.l lVar2 = ((i) rVar4.f45583a.f22981a).f45537a;
                p pVar2 = new p(rVar4, this.f45575g, this.f45576h, 2);
                lVar2.getClass();
                return new om.h(lVar2, pVar2);
        }
    }
}
