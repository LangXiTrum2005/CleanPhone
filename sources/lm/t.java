package lm;

import zk.j0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class t extends u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yl.c f45590d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(yl.c fqName, vl.f nameResolver, l3.i iVar, j0 j0Var) {
        super(nameResolver, iVar, j0Var);
        kotlin.jvm.internal.n.f(fqName, "fqName");
        kotlin.jvm.internal.n.f(nameResolver, "nameResolver");
        this.f45590d = fqName;
    }

    @Override // lm.u
    public final yl.c a() {
        return this.f45590d;
    }
}
