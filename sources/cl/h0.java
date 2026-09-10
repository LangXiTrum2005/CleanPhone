package cl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h0 extends q implements zk.b0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yl.c f6518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f6519f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(zk.w module, yl.c fqName) {
        super(module, al.i.f3645a, fqName.g(), zk.j0.C9);
        kotlin.jvm.internal.n.f(module, "module");
        kotlin.jvm.internal.n.f(fqName, "fqName");
        this.f6518e = fqName;
        this.f6519f = "package " + fqName + " of " + module;
    }

    @Override // cl.q, zk.j
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public final zk.w e() {
        zk.j jVarE = super.e();
        kotlin.jvm.internal.n.d(jVarE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (zk.w) jVarE;
    }

    @Override // cl.q, zk.k
    public zk.j0 c() {
        return zk.j0.C9;
    }

    @Override // zk.j
    public final Object c0(zk.l lVar, Object obj) {
        return lVar.f(this, obj);
    }

    @Override // cl.p
    public String toString() {
        return this.f6519f;
    }
}
