package tk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class l1 implements qk.y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ qk.w[] f51010d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zk.m0 f51011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o1 f51012b = q1.g(null, new al.l(this, 28));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m1 f51013c;

    static {
        kotlin.jvm.internal.e0 e0Var = kotlin.jvm.internal.d0.f44761a;
        f51010d = new qk.w[]{e0Var.g(new kotlin.jvm.internal.v(e0Var.b(l1.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};
    }

    public l1(m1 m1Var, zk.m0 m0Var) {
        Class cls;
        z zVarC;
        Object objC0;
        this.f51011a = m0Var;
        if (m1Var == null) {
            zk.j jVarE = m0Var.e();
            kotlin.jvm.internal.n.e(jVarE, "descriptor.containingDeclaration");
            if (jVarE instanceof zk.e) {
                objC0 = c((zk.e) jVarE);
            } else {
                if (!(jVarE instanceof zk.c)) {
                    throw new cn.c0("Unknown type parameter container: " + jVarE, 3);
                }
                zk.j jVarE2 = ((zk.c) jVarE).e();
                kotlin.jvm.internal.n.e(jVarE2, "declaration.containingDeclaration");
                if (jVarE2 instanceof zk.e) {
                    zVarC = c((zk.e) jVarE2);
                } else {
                    nm.j jVar = jVarE instanceof nm.j ? (nm.j) jVarE : null;
                    if (jVar == null) {
                        throw new cn.c0("Non-class callable descriptor must be deserialized: " + jVarE, 3);
                    }
                    nm.i iVarD = jVar.D();
                    rl.f fVar = iVarD instanceof rl.f ? (rl.f) iVarD : null;
                    el.b bVar = fVar != null ? fVar.f49631c : null;
                    el.b bVar2 = bVar instanceof el.b ? bVar : null;
                    if (bVar2 == null || (cls = bVar2.f40112a) == null) {
                        throw new cn.c0("Container of deserialized member is not resolved: " + jVar, 3);
                    }
                    zVarC = (z) d0.c.s(cls);
                }
                objC0 = jVarE.c0(new qj.x(zVarC, 11), wj.r.f53297a);
            }
            kotlin.jvm.internal.n.e(objC0, "when (val declaration = … $declaration\")\n        }");
            m1Var = (m1) objC0;
        }
        this.f51013c = m1Var;
    }

    public static z c(zk.e eVar) {
        Class clsJ = v1.j(eVar);
        z zVar = (z) (clsJ != null ? d0.c.s(clsJ) : null);
        if (zVar != null) {
            return zVar;
        }
        throw new cn.c0("Type parameter container is not resolved: " + eVar.e(), 3);
    }

    public final String a() {
        String strB = this.f51011a.getName().b();
        kotlin.jvm.internal.n.e(strB, "descriptor.name.asString()");
        return strB;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return kotlin.jvm.internal.n.a(this.f51013c, l1Var.f51013c) && a().equals(l1Var.a());
    }

    public final int hashCode() {
        return a().hashCode() + (this.f51013c.hashCode() * 31);
    }

    public final String toString() {
        qk.b0 b0Var;
        StringBuilder sb2 = new StringBuilder();
        int iC = v0.i.c(this.f51011a.v());
        if (iC == 0) {
            b0Var = qk.b0.f49105a;
        } else if (iC == 1) {
            b0Var = qk.b0.f49106b;
        } else {
            if (iC != 2) {
                throw new aa.b((byte) 0, 20);
            }
            b0Var = qk.b0.f49107c;
        }
        int iOrdinal = b0Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                sb2.append("in ");
            } else {
                if (iOrdinal != 2) {
                    throw new aa.b((byte) 0, 20);
                }
                sb2.append("out ");
            }
        }
        sb2.append(a());
        return sb2.toString();
    }
}
