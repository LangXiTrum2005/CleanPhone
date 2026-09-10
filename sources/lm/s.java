package lm;

import zk.j0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class s extends u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tl.j f45585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f45586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final yl.b f45587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final tl.i f45588g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f45589h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(tl.j classProto, vl.f nameResolver, l3.i iVar, j0 j0Var, s sVar) {
        super(nameResolver, iVar, j0Var);
        kotlin.jvm.internal.n.f(classProto, "classProto");
        kotlin.jvm.internal.n.f(nameResolver, "nameResolver");
        this.f45585d = classProto;
        this.f45586e = sVar;
        this.f45587f = com.bumptech.glide.c.r(nameResolver, classProto.f51297e);
        tl.i iVar2 = (tl.i) vl.e.f52635f.c(classProto.f51296d);
        this.f45588g = iVar2 == null ? tl.i.CLASS : iVar2;
        this.f45589h = vl.e.f52636g.c(classProto.f51296d).booleanValue();
    }

    @Override // lm.u
    public final yl.c a() {
        return this.f45587f.b();
    }
}
