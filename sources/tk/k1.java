package tk;

import java.lang.reflect.Array;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class k1 implements qk.x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ qk.w[] f51001e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pm.y f51002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o1 f51003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o1 f51004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o1 f51005d;

    static {
        kotlin.jvm.internal.e0 e0Var = kotlin.jvm.internal.d0.f44761a;
        f51001e = new qk.w[]{e0Var.g(new kotlin.jvm.internal.v(e0Var.b(k1.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), e0Var.g(new kotlin.jvm.internal.v(e0Var.b(k1.class), "arguments", "getArguments()Ljava/util/List;"))};
    }

    public k1(pm.y type, jk.a aVar) {
        kotlin.jvm.internal.n.f(type, "type");
        this.f51002a = type;
        o1 o1Var = aVar instanceof o1 ? (o1) aVar : null;
        this.f51003b = o1Var == null ? aVar != null ? q1.g(null, aVar) : null : o1Var;
        this.f51004c = q1.g(null, new j1(this, 1));
        this.f51005d = q1.g(null, new cl.t0(11, this, aVar));
    }

    public final qk.e a(pm.y yVar) {
        pm.y yVarB;
        zk.g gVarE = yVar.P().e();
        if (gVarE instanceof zk.e) {
            Class clsJ = v1.j((zk.e) gVarE);
            if (clsJ != null) {
                if (!clsJ.isArray()) {
                    if (pm.y0.e(yVar)) {
                        return new z(clsJ);
                    }
                    Class cls = (Class) fl.c.f40981b.get(clsJ);
                    if (cls != null) {
                        clsJ = cls;
                    }
                    return new z(clsJ);
                }
                pm.q0 q0Var = (pm.q0) xj.n.H0(yVar.t());
                if (q0Var == null || (yVarB = q0Var.b()) == null) {
                    return new z(clsJ);
                }
                qk.e eVarA = a(yVarB);
                if (eVarA != null) {
                    return new z(Array.newInstance((Class<?>) d0.c.p(go.c.s(eVarA)), 0).getClass());
                }
                throw new cn.c0("Cannot determine classifier for array element type: " + this, 3);
            }
        } else {
            if (gVarE instanceof zk.m0) {
                return new l1(null, (zk.m0) gVarE);
            }
            if (gVarE instanceof nm.s) {
                throw new cn.c0("An operation is not implemented: Type alias classifiers are not yet supported");
            }
        }
        return null;
    }

    public final List c() {
        qk.w wVar = f51001e[1];
        Object objInvoke = this.f51005d.invoke();
        kotlin.jvm.internal.n.e(objInvoke, "<get-arguments>(...)");
        return (List) objInvoke;
    }

    public final qk.e e() {
        qk.w wVar = f51001e[0];
        return (qk.e) this.f51004c.invoke();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return kotlin.jvm.internal.n.a(this.f51002a, k1Var.f51002a) && kotlin.jvm.internal.n.a(e(), k1Var.e()) && c().equals(k1Var.c());
    }

    public final int hashCode() {
        int iHashCode = this.f51002a.hashCode() * 31;
        qk.e eVarE = e();
        return c().hashCode() + ((iHashCode + (eVarE != null ? eVarE.hashCode() : 0)) * 31);
    }

    public final String toString() {
        am.h hVar = s1.f51061a;
        return s1.d(this.f51002a);
    }
}
