package nm;

import cl.y;
import zk.j0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends cl.l implements b {
    public final tl.l E;
    public final vl.f F;
    public final l3.i G;
    public final vl.g H;
    public final i I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(zk.e containingDeclaration, zk.i iVar, al.j annotations, boolean z10, int i10, tl.l proto, vl.f nameResolver, l3.i typeTable, vl.g versionRequirementTable, i iVar2, j0 j0Var) {
        super(containingDeclaration, iVar, annotations, z10, i10, j0Var == null ? j0.C9 : j0Var);
        kotlin.jvm.internal.n.f(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.n.f(annotations, "annotations");
        d5.u.n(i10, "kind");
        kotlin.jvm.internal.n.f(proto, "proto");
        kotlin.jvm.internal.n.f(nameResolver, "nameResolver");
        kotlin.jvm.internal.n.f(typeTable, "typeTable");
        kotlin.jvm.internal.n.f(versionRequirementTable, "versionRequirementTable");
        this.E = proto;
        this.F = nameResolver;
        this.G = typeTable;
        this.H = versionRequirementTable;
        this.I = iVar2;
    }

    @Override // nm.j
    public final vl.f C() {
        return this.F;
    }

    @Override // nm.j
    public final i D() {
        return this.I;
    }

    @Override // cl.l, cl.y
    public final /* bridge */ /* synthetic */ y L0(int i10, al.j jVar, yl.f fVar, zk.j jVar2, zk.s sVar, j0 j0Var) {
        return a1(jVar2, sVar, i10, jVar, j0Var);
    }

    @Override // cl.l
    /* JADX INFO: renamed from: U0 */
    public final /* bridge */ /* synthetic */ cl.l L0(int i10, al.j jVar, yl.f fVar, zk.j jVar2, zk.s sVar, j0 j0Var) {
        return a1(jVar2, sVar, i10, jVar, j0Var);
    }

    @Override // nm.j
    public final zl.a Z() {
        return this.E;
    }

    public final c a1(zk.j newOwner, zk.s sVar, int i10, al.j annotations, j0 j0Var) {
        kotlin.jvm.internal.n.f(newOwner, "newOwner");
        d5.u.n(i10, "kind");
        kotlin.jvm.internal.n.f(annotations, "annotations");
        c cVar = new c((zk.e) newOwner, (zk.i) sVar, annotations, this.D, i10, this.E, this.F, this.G, this.H, this.I, j0Var);
        cVar.f6653v = this.f6653v;
        return cVar;
    }

    @Override // cl.y, zk.v
    public final boolean isExternal() {
        return false;
    }

    @Override // cl.y, zk.s
    public final boolean isInline() {
        return false;
    }

    @Override // cl.y, zk.s
    public final boolean isSuspend() {
        return false;
    }

    @Override // cl.y, zk.s
    public final boolean x() {
        return false;
    }

    @Override // nm.j
    public final l3.i z() {
        return this.G;
    }
}
