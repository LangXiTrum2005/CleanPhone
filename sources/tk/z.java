package tk;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class z extends c0 implements qk.d, m1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f51094d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f51095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p1 f51096c;

    public z(Class jClass) {
        kotlin.jvm.internal.n.f(jClass, "jClass");
        this.f51095b = jClass;
        this.f51096c = new p1(new t(this, 8));
    }

    @Override // kotlin.jvm.internal.e
    public final Class a() {
        return this.f51095b;
    }

    @Override // qk.d
    public final boolean b(Object obj) {
        List list = fl.c.f40980a;
        Class cls = this.f51095b;
        kotlin.jvm.internal.n.f(cls, "<this>");
        Integer num = (Integer) fl.c.f40983d.get(cls);
        if (num != null) {
            return kotlin.jvm.internal.h0.e(num.intValue(), obj);
        }
        Class cls2 = (Class) fl.c.f40982c.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return cls.isInstance(obj);
    }

    @Override // qk.d
    public final String d() {
        o1 o1Var = ((w) this.f51096c.invoke()).f51078e;
        qk.w wVar = w.l[3];
        return (String) o1Var.invoke();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof z) && d0.c.q(this).equals(d0.c.q((qk.d) obj));
    }

    @Override // tk.c0
    public final Collection f() {
        zk.e eVarS = s();
        if (eVarS.l0() == 2 || eVarS.l0() == 6) {
            return xj.v.f53866a;
        }
        Collection collectionP = eVarS.p();
        kotlin.jvm.internal.n.e(collectionP, "descriptor.constructors");
        return collectionP;
    }

    @Override // qk.d
    public final String g() {
        o1 o1Var = ((w) this.f51096c.invoke()).f51077d;
        qk.w wVar = w.l[2];
        return (String) o1Var.invoke();
    }

    @Override // tk.c0
    public final Collection h(yl.f fVar) {
        im.n nVarA = s().g().A();
        hl.b bVar = hl.b.f42406b;
        Collection collectionA = nVarA.a(fVar, bVar);
        im.n nVarG0 = s().g0();
        kotlin.jvm.internal.n.e(nVarG0, "descriptor.staticScope");
        return xj.n.B0(nVarG0.a(fVar, bVar), collectionA);
    }

    public final int hashCode() {
        return d0.c.q(this).hashCode();
    }

    @Override // tk.c0
    public final zk.h0 i(int i10) {
        Class<?> declaringClass;
        Class cls = this.f51095b;
        if (cls.getSimpleName().equals("DefaultImpls") && (declaringClass = cls.getDeclaringClass()) != null && declaringClass.isInterface()) {
            return ((z) d0.c.s(declaringClass)).i(i10);
        }
        zk.e eVarS = s();
        nm.h hVar = eVarS instanceof nm.h ? (nm.h) eVarS : null;
        if (hVar != null) {
            tl.j jVar = hVar.f46815e;
            zl.m classLocalVariable = wl.k.f53475j;
            kotlin.jvm.internal.n.e(classLocalVariable, "classLocalVariable");
            tl.g0 g0Var = (tl.g0) com.google.android.gms.internal.auth.i.v(jVar, classLocalVariable, i10);
            if (g0Var != null) {
                com.google.android.gms.internal.consent_sdk.d dVar = hVar.l;
                return (zk.h0) v1.f(this.f51095b, g0Var, (vl.f) dVar.f22982b, (l3.i) dVar.f22984d, hVar.f46816f, y.f51091b);
            }
        }
        return null;
    }

    @Override // tk.c0
    public final Collection l(yl.f fVar) {
        im.n nVarA = s().g().A();
        hl.b bVar = hl.b.f42406b;
        Collection collectionF = nVarA.f(fVar, bVar);
        im.n nVarG0 = s().g0();
        kotlin.jvm.internal.n.e(nVarG0, "descriptor.staticScope");
        return xj.n.B0(nVarG0.f(fVar, bVar), collectionF);
    }

    public final yl.b r() {
        wk.j jVarG;
        yl.b bVar = t1.f51065a;
        Class klass = this.f51095b;
        kotlin.jvm.internal.n.f(klass, "klass");
        if (klass.isArray()) {
            Class<?> componentType = klass.getComponentType();
            kotlin.jvm.internal.n.e(componentType, "klass.componentType");
            jVarG = componentType.isPrimitive() ? gm.c.b(componentType.getSimpleName()).g() : null;
            return jVarG != null ? new yl.b(wk.m.f53373k, jVarG.f53327b) : yl.b.j(wk.l.f53344g.g());
        }
        if (klass.equals(Void.TYPE)) {
            return t1.f51065a;
        }
        jVarG = klass.isPrimitive() ? gm.c.b(klass.getSimpleName()).g() : null;
        if (jVarG != null) {
            return new yl.b(wk.m.f53373k, jVarG.f53326a);
        }
        yl.b bVarA = fl.c.a(klass);
        if (!bVarA.f54503c) {
            String str = yk.d.f54447a;
            yl.b bVar2 = (yl.b) yk.d.f54454h.get(bVarA.b().i());
            if (bVar2 != null) {
                return bVar2;
            }
        }
        return bVarA;
    }

    public final zk.e s() {
        return ((w) this.f51096c.invoke()).a();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("class ");
        yl.b bVarR = r();
        yl.c cVarG = bVarR.g();
        kotlin.jvm.internal.n.e(cVarG, "classId.packageFqName");
        String strConcat = cVarG.d() ? "" : cVarG.b().concat(".");
        sb2.append(strConcat + an.p.m0(bVarR.h().b(), '.', '$'));
        return sb2.toString();
    }
}
