package nm;

import cl.n0;
import tl.g0;
import zk.h0;
import zk.j0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class q extends n0 implements b {
    public final g0 A;
    public final vl.f B;
    public final l3.i C;
    public final vl.g D;
    public final i E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(zk.j containingDeclaration, h0 h0Var, al.j annotations, int i10, il.o visibility, boolean z10, yl.f name, int i11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, g0 proto, vl.f nameResolver, l3.i typeTable, vl.g versionRequirementTable, i iVar) {
        super(containingDeclaration, h0Var, annotations, i10, visibility, z10, name, i11, j0.C9, z11, z12, z15, z13, z14);
        kotlin.jvm.internal.n.f(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.n.f(annotations, "annotations");
        d5.u.n(i10, "modality");
        kotlin.jvm.internal.n.f(visibility, "visibility");
        kotlin.jvm.internal.n.f(name, "name");
        d5.u.n(i11, "kind");
        kotlin.jvm.internal.n.f(proto, "proto");
        kotlin.jvm.internal.n.f(nameResolver, "nameResolver");
        kotlin.jvm.internal.n.f(typeTable, "typeTable");
        kotlin.jvm.internal.n.f(versionRequirementTable, "versionRequirementTable");
        this.A = proto;
        this.B = nameResolver;
        this.C = typeTable;
        this.D = versionRequirementTable;
        this.E = iVar;
    }

    @Override // nm.j
    public final vl.f C() {
        return this.B;
    }

    @Override // nm.j
    public final i D() {
        return this.E;
    }

    @Override // cl.n0
    public final n0 L0(zk.j newOwner, int i10, il.o newVisibility, h0 h0Var, int i11, yl.f newName) {
        kotlin.jvm.internal.n.f(newOwner, "newOwner");
        d5.u.n(i10, "newModality");
        kotlin.jvm.internal.n.f(newVisibility, "newVisibility");
        d5.u.n(i11, "kind");
        kotlin.jvm.internal.n.f(newName, "newName");
        return new q(newOwner, h0Var, getAnnotations(), i10, newVisibility, this.f6560f, newName, i11, this.f6567n, this.f6568o, isExternal(), this.f6571r, this.f6569p, this.A, this.B, this.C, this.D, this.E);
    }

    @Override // nm.j
    public final zl.a Z() {
        return this.A;
    }

    @Override // cl.n0, zk.v
    public final boolean isExternal() {
        return vl.e.D.c(this.A.f51240d).booleanValue();
    }

    @Override // nm.j
    public final l3.i z() {
        return this.C;
    }
}
