package cl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 extends p implements zk.e0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ qk.w[] f6478h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f0 f6479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yl.c f6480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final om.i f6481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final om.i f6482f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final im.j f6483g;

    static {
        kotlin.jvm.internal.e0 e0Var = kotlin.jvm.internal.d0.f44761a;
        f6478h = new qk.w[]{e0Var.g(new kotlin.jvm.internal.v(e0Var.b(b0.class), "fragments", "getFragments()Ljava/util/List;")), e0Var.g(new kotlin.jvm.internal.v(e0Var.b(b0.class), "empty", "getEmpty()Z"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(f0 f0Var, yl.c fqName, om.l storageManager) {
        super(al.i.f3645a, fqName.g());
        kotlin.jvm.internal.n.f(fqName, "fqName");
        kotlin.jvm.internal.n.f(storageManager, "storageManager");
        this.f6479c = f0Var;
        this.f6480d = fqName;
        this.f6481e = new om.i(storageManager, new a0(this, 1));
        this.f6482f = new om.i(storageManager, new a0(this, 0));
        this.f6483g = new im.j(storageManager, new a0(this, 2));
    }

    @Override // zk.j
    public final Object c0(zk.l lVar, Object obj) {
        return lVar.v(this, obj);
    }

    @Override // zk.j
    public final zk.j e() {
        yl.c cVar = this.f6480d;
        if (cVar.d()) {
            return null;
        }
        return this.f6479c.F(cVar.e());
    }

    public final boolean equals(Object obj) {
        zk.e0 e0Var = obj instanceof zk.e0 ? (zk.e0) obj : null;
        if (e0Var == null) {
            return false;
        }
        b0 b0Var = (b0) e0Var;
        return kotlin.jvm.internal.n.a(this.f6480d, b0Var.f6480d) && kotlin.jvm.internal.n.a(this.f6479c, b0Var.f6479c);
    }

    public final int hashCode() {
        return this.f6480d.hashCode() + (this.f6479c.hashCode() * 31);
    }
}
