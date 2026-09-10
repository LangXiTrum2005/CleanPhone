package tk;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class q0 extends c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f51044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p1 f51045c;

    public q0(Class jClass) {
        kotlin.jvm.internal.n.f(jClass, "jClass");
        this.f51044b = jClass;
        this.f51045c = new p1(new l0(this, 1));
    }

    @Override // kotlin.jvm.internal.e
    public final Class a() {
        return this.f51044b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q0) {
            return kotlin.jvm.internal.n.a(this.f51044b, ((q0) obj).f51044b);
        }
        return false;
    }

    @Override // tk.c0
    public final Collection f() {
        return xj.v.f53866a;
    }

    @Override // tk.c0
    public final Collection h(yl.f fVar) {
        o1 o1Var = ((o0) this.f51045c.invoke()).f51032d;
        qk.w wVar = o0.f51030g[1];
        Object objInvoke = o1Var.invoke();
        kotlin.jvm.internal.n.e(objInvoke, "<get-scope>(...)");
        return ((im.n) objInvoke).a(fVar, hl.b.f42406b);
    }

    public final int hashCode() {
        return this.f51044b.hashCode();
    }

    @Override // tk.c0
    public final zk.h0 i(int i10) {
        p1 p1Var = ((o0) this.f51045c.invoke()).f51034f;
        qk.w wVar = o0.f51030g[3];
        wj.k kVar = (wj.k) p1Var.invoke();
        if (kVar == null) {
            return null;
        }
        xl.g gVar = (xl.g) kVar.f53293a;
        tl.c0 c0Var = (tl.c0) kVar.f53294b;
        xl.f fVar = (xl.f) kVar.f53295c;
        zl.m packageLocalVariable = wl.k.f53478n;
        kotlin.jvm.internal.n.e(packageLocalVariable, "packageLocalVariable");
        tl.g0 g0Var = (tl.g0) com.google.android.gms.internal.auth.i.v(c0Var, packageLocalVariable, i10);
        if (g0Var == null) {
            return null;
        }
        tl.w0 w0Var = c0Var.f51148g;
        kotlin.jvm.internal.n.e(w0Var, "packageProto.typeTable");
        return (zk.h0) v1.f(this.f51044b, g0Var, gVar, new l3.i(w0Var), fVar, p0.f51039b);
    }

    @Override // tk.c0
    public final Class k() {
        p1 p1Var = ((o0) this.f51045c.invoke()).f51033e;
        qk.w wVar = o0.f51030g[2];
        Class cls = (Class) p1Var.invoke();
        return cls == null ? this.f51044b : cls;
    }

    @Override // tk.c0
    public final Collection l(yl.f fVar) {
        o1 o1Var = ((o0) this.f51045c.invoke()).f51032d;
        qk.w wVar = o0.f51030g[1];
        Object objInvoke = o1Var.invoke();
        kotlin.jvm.internal.n.e(objInvoke, "<get-scope>(...)");
        return ((im.n) objInvoke).f(fVar, hl.b.f42406b);
    }

    public final String toString() {
        return "file class " + fl.c.a(this.f51044b).b();
    }
}
