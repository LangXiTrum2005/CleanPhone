package cl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class w0 extends x0 {
    public final wj.j l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(zk.b containingDeclaration, x0 x0Var, int i10, al.j jVar, yl.f fVar, pm.y yVar, boolean z10, boolean z11, boolean z12, pm.y yVar2, zk.j0 j0Var, jk.a aVar) {
        super(containingDeclaration, x0Var, i10, jVar, fVar, yVar, z10, z11, z12, yVar2, j0Var);
        kotlin.jvm.internal.n.f(containingDeclaration, "containingDeclaration");
        this.l = r9.b.u(aVar);
    }

    @Override // cl.x0
    public final x0 J0(xk.g gVar, yl.f fVar, int i10) {
        al.j annotations = getAnnotations();
        kotlin.jvm.internal.n.e(annotations, "annotations");
        pm.y type = getType();
        kotlin.jvm.internal.n.e(type, "type");
        return new w0(gVar, null, i10, annotations, fVar, type, K0(), this.f6633h, this.f6634i, this.f6635j, zk.j0.C9, new al.l(this, 4));
    }
}
