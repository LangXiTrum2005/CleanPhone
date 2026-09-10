package ml;

import cc.a2;
import cl.h0;
import com.google.android.gms.internal.measurement.nf;
import zk.j0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class r extends h0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ qk.w[] f46231m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fl.x f46232g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final nf f46233h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final om.i f46234i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f46235j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final om.c f46236k;
    public final al.j l;

    static {
        kotlin.jvm.internal.e0 e0Var = kotlin.jvm.internal.d0.f44761a;
        f46231m = new qk.w[]{e0Var.g(new kotlin.jvm.internal.v(e0Var.b(r.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), e0Var.g(new kotlin.jvm.internal.v(e0Var.b(r.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public r(nf outerContext, fl.x xVar) {
        kotlin.jvm.internal.n.f(outerContext, "outerContext");
        ll.a aVar = (ll.a) outerContext.f23782b;
        super(aVar.f45498o, xVar.f41010a);
        this.f46232g = xVar;
        nf nfVarD = android.support.v4.media.session.a.d(outerContext, this, null, 6);
        this.f46233h = nfVarD;
        kotlin.jvm.internal.n.f(aVar.f45488d.c().f45539c, "<this>");
        xl.f fVar = xl.f.f53902g;
        ll.a aVar2 = (ll.a) nfVarD.f23782b;
        om.o oVar = aVar2.f45485a;
        q qVar = new q(this, 0);
        om.l lVar = (om.l) oVar;
        lVar.getClass();
        this.f46234i = new om.i(lVar, qVar);
        this.f46235j = new d(nfVarD, xVar, this);
        q qVar2 = new q(this, 2);
        om.l lVar2 = (om.l) oVar;
        lVar2.getClass();
        this.f46236k = new om.c(lVar2, qVar2);
        this.l = aVar2.f45505v.f43112b ? al.i.f3645a : a2.I(nfVarD, xVar);
        ((om.l) oVar).a(new q(this, 1));
    }

    @Override // zk.b0
    public final im.n A() {
        return this.f46235j;
    }

    @Override // cl.h0, cl.q, zk.k
    public final j0 c() {
        return new rb.c(this, 1);
    }

    @Override // al.b, al.a
    public final al.j getAnnotations() {
        return this.l;
    }

    @Override // cl.h0, cl.p
    public final String toString() {
        return "Lazy Java package fragment: " + this.f6518e + " of module " + ((ll.a) this.f46233h.f23782b).f45498o;
    }
}
