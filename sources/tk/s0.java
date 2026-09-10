package tk;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class s0 implements qk.o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ qk.w[] f51056e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f51057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f51058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qk.n f51059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o1 f51060d;

    static {
        kotlin.jvm.internal.e0 e0Var = kotlin.jvm.internal.d0.f44761a;
        f51056e = new qk.w[]{e0Var.g(new kotlin.jvm.internal.v(e0Var.b(s0.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), e0Var.g(new kotlin.jvm.internal.v(e0Var.b(s0.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public s0(r rVar, int i10, qk.n nVar, jk.a aVar) {
        this.f51057a = rVar;
        this.f51058b = i10;
        this.f51059c = nVar;
        this.f51060d = q1.g(null, aVar);
        q1.g(null, new r0(this, 0));
    }

    public final zk.f0 a() {
        qk.w wVar = f51056e[0];
        Object objInvoke = this.f51060d.invoke();
        kotlin.jvm.internal.n.e(objInvoke, "<get-descriptor>(...)");
        return (zk.f0) objInvoke;
    }

    public final k1 c() {
        pm.y type = a().getType();
        kotlin.jvm.internal.n.e(type, "descriptor.type");
        return new k1(type, new r0(this, 1));
    }

    public final boolean e() {
        zk.f0 f0VarA = a();
        cl.x0 x0Var = f0VarA instanceof cl.x0 ? (cl.x0) f0VarA : null;
        if (x0Var != null) {
            return fm.e.a(x0Var);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return kotlin.jvm.internal.n.a(this.f51057a, s0Var.f51057a) && this.f51058b == s0Var.f51058b;
    }

    public final boolean f() {
        zk.f0 f0VarA = a();
        return (f0VarA instanceof cl.x0) && ((cl.x0) f0VarA).f6635j != null;
    }

    public final String getName() {
        zk.f0 f0VarA = a();
        cl.x0 x0Var = f0VarA instanceof cl.x0 ? (cl.x0) f0VarA : null;
        if (x0Var != null && !x0Var.e().a0()) {
            yl.f name = x0Var.getName();
            kotlin.jvm.internal.n.e(name, "valueParameter.name");
            if (!name.f54515b) {
                return name.b();
            }
        }
        return null;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f51058b) + (this.f51057a.hashCode() * 31);
    }

    public final String toString() throws IOException {
        String strB;
        am.h hVar = s1.f51061a;
        StringBuilder sb2 = new StringBuilder();
        int iOrdinal = this.f51059c.ordinal();
        if (iOrdinal == 0) {
            sb2.append("instance parameter");
        } else if (iOrdinal == 2) {
            sb2.append("extension receiver parameter");
        } else if (iOrdinal == 3) {
            sb2.append("parameter #" + this.f51058b + ' ' + getName());
        }
        sb2.append(" of ");
        zk.c cVarH = this.f51057a.h();
        if (cVarH instanceof zk.h0) {
            strB = s1.c((zk.h0) cVarH);
        } else {
            if (!(cVarH instanceof zk.s)) {
                throw new IllegalStateException(("Illegal callable: " + cVarH).toString());
            }
            strB = s1.b((zk.s) cVarH);
        }
        sb2.append(strB);
        String string = sb2.toString();
        kotlin.jvm.internal.n.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
