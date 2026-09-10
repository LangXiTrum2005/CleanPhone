package nm;

import cl.q0;
import tl.y;
import zk.j0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class r extends q0 implements b {
    public final y D;
    public final vl.f E;
    public final l3.i F;
    public final vl.g G;
    public final i H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(zk.j containingDeclaration, q0 q0Var, al.j annotations, yl.f fVar, int i10, y proto, vl.f nameResolver, l3.i typeTable, vl.g versionRequirementTable, i iVar, j0 j0Var) {
        super(containingDeclaration, q0Var, annotations, fVar, i10, j0Var == null ? j0.C9 : j0Var);
        kotlin.jvm.internal.n.f(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.n.f(annotations, "annotations");
        d5.u.n(i10, "kind");
        kotlin.jvm.internal.n.f(proto, "proto");
        kotlin.jvm.internal.n.f(nameResolver, "nameResolver");
        kotlin.jvm.internal.n.f(typeTable, "typeTable");
        kotlin.jvm.internal.n.f(versionRequirementTable, "versionRequirementTable");
        this.D = proto;
        this.E = nameResolver;
        this.F = typeTable;
        this.G = versionRequirementTable;
        this.H = iVar;
    }

    @Override // nm.j
    public final vl.f C() {
        return this.E;
    }

    @Override // nm.j
    public final i D() {
        return this.H;
    }

    @Override // cl.q0, cl.y
    public final cl.y L0(int i10, al.j annotations, yl.f fVar, zk.j newOwner, zk.s sVar, j0 j0Var) {
        yl.f fVar2;
        kotlin.jvm.internal.n.f(newOwner, "newOwner");
        d5.u.n(i10, "kind");
        kotlin.jvm.internal.n.f(annotations, "annotations");
        q0 q0Var = (q0) sVar;
        if (fVar == null) {
            yl.f name = getName();
            kotlin.jvm.internal.n.e(name, "name");
            fVar2 = name;
        } else {
            fVar2 = fVar;
        }
        r rVar = new r(newOwner, q0Var, annotations, fVar2, i10, this.D, this.E, this.F, this.G, this.H, j0Var);
        rVar.f6653v = this.f6653v;
        return rVar;
    }

    @Override // nm.j
    public final zl.a Z() {
        return this.D;
    }

    @Override // nm.j
    public final l3.i z() {
        return this.F;
    }
}
