package tk;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ne.c f51046a = new ne.c(28);

    /* JADX WARN: Code duplicated, block: B:13:0x0037  */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, wj.d] */
    public static final uk.f a(c1 c1Var, boolean z10) throws ClassNotFoundException {
        j jVar;
        Method method;
        uk.f qVar;
        wl.c cVar;
        uk.f sVar;
        if (c0.f50957a.a(c1Var.l().f50990h)) {
            return uk.z.f52254a;
        }
        yl.b bVar = t1.f51065a;
        q1 q1VarB = t1.b(c1Var.l().h());
        boolean z11 = false;
        if (q1VarB instanceof m) {
            m mVar = (m) q1VarB;
            vl.f fVar = mVar.f51017e;
            wl.e eVar = mVar.f51016d;
            int i10 = 4;
            if (z10) {
                if ((eVar.f53422b & 4) == 4) {
                    cVar = eVar.f53425e;
                } else {
                    cVar = null;
                }
            } else if ((eVar.f53422b & 8) == 8) {
                cVar = eVar.f53426f;
            } else {
                cVar = null;
            }
            Method methodE = cVar != null ? c1Var.l().f50988f.e(fVar.getString(cVar.f53409c), fVar.getString(cVar.f53410d)) : null;
            if (methodE != null) {
                if (!Modifier.isStatic(methodE.getModifiers())) {
                    sVar = c1Var.j() ? new uk.q(f(c1Var), methodE) : new uk.t(methodE);
                } else if (c1Var.l().h().getAnnotations().c(v1.f51075a)) {
                    sVar = c1Var.j() ? new uk.r(methodE, false, 4) : new uk.t(methodE, true, i10, true ? 1 : 0);
                } else {
                    sVar = c1Var.j() ? new uk.s(f(c1Var), methodE) : new uk.t(methodE, z11, 6, 2);
                }
                qVar = sVar;
            } else if (bm.g.d(c1Var.l().h()) && kotlin.jvm.internal.n.a(c1Var.l().h().getVisibility(), zk.n.f54977d)) {
                Class clsR = d0.c.R(c1Var.l().h().e());
                if (clsR == null) {
                    throw new cn.c0("Underlying property of inline class " + c1Var.l() + " should have a field", 3);
                }
                Method methodX = d0.c.x(clsR, c1Var.l().h());
                qVar = c1Var.j() ? new uk.w(f(c1Var), methodX) : new uk.x(methodX, j1.f.C(methodX.getDeclaringClass()));
            } else {
                Field field = (Field) c1Var.l().f50992j.getValue();
                if (field == null) {
                    throw new cn.c0("No accessors or field is found for property " + c1Var.l(), 3);
                }
                qVar = d(c1Var, z10, field);
            }
        } else if (q1VarB instanceof k) {
            qVar = d(c1Var, z10, ((k) q1VarB).f50999b);
        } else {
            if (!(q1VarB instanceof l)) {
                if (!(q1VarB instanceof n)) {
                    throw new aa.b((byte) 0, 20);
                }
                if (z10) {
                    jVar = ((n) q1VarB).f51023b;
                } else {
                    jVar = ((n) q1VarB).f51024c;
                    if (jVar == null) {
                        throw new cn.c0("No setter found for property " + c1Var.l(), 3);
                    }
                }
                c0 c0Var = c1Var.l().f50988f;
                xl.e eVar2 = jVar.f50994b;
                Method methodE2 = c0Var.e(eVar2.f53900d, eVar2.f53901e);
                if (methodE2 != null) {
                    Modifier.isStatic(methodE2.getModifiers());
                    return c1Var.j() ? new uk.q(f(c1Var), methodE2) : new uk.t(methodE2);
                }
                throw new cn.c0("No accessor found for property " + c1Var.l(), 3);
            }
            if (z10) {
                method = ((l) q1VarB).f51006b;
            } else {
                l lVar = (l) q1VarB;
                method = lVar.f51007c;
                if (method == null) {
                    throw new cn.c0("No source found for setter of Java method property: " + lVar.f51006b, 3);
                }
            }
            qVar = c1Var.j() ? new uk.q(f(c1Var), method) : new uk.t(method);
        }
        return d0.c.d(qVar, c1Var.k(), false);
    }

    public static final String b(Method method) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        kotlin.jvm.internal.n.e(parameterTypes, "parameterTypes");
        sb2.append(xj.k.v0(parameterTypes, "", "(", ")", b.f50952n, 24));
        Class<?> returnType = method.getReturnType();
        kotlin.jvm.internal.n.e(returnType, "returnType");
        sb2.append(fl.c.b(returnType));
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:32:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00be  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d2  */
    public static final uk.u d(c1 c1Var, boolean z10, Field field) {
        boolean z11;
        zk.h0 h0VarH = c1Var.l().h();
        zk.j containingDeclaration = h0VarH.e();
        kotlin.jvm.internal.n.e(containingDeclaration, "containingDeclaration");
        boolean z12 = true;
        if (bm.e.l(containingDeclaration)) {
            zk.j jVarE = containingDeclaration.e();
            if ((bm.e.n(jVarE, 2) || bm.e.n(jVarE, 5)) && (!(h0VarH instanceof nm.q) || !xl.h.d(((nm.q) h0VarH).A))) {
                if (Modifier.isStatic(field.getModifiers())) {
                    z11 = false;
                    if (c1Var.l().h().getAnnotations().c(v1.f51075a)) {
                        if (z10) {
                        }
                    }
                    if (z10) {
                        if (c1Var.j()) {
                        }
                    }
                    if (c1Var.j()) {
                    }
                }
            }
        } else if (Modifier.isStatic(field.getModifiers())) {
            z11 = false;
            if (c1Var.l().h().getAnnotations().c(v1.f51075a)) {
                return z10 ? new uk.k(field, z11, 2) : new uk.o(field, e(c1Var), false, 2);
            }
            if (z10) {
                return c1Var.j() ? new uk.j(field, false) : new uk.k(field, z12, 1);
            }
            return c1Var.j() ? new uk.n(field, e(c1Var), false) : new uk.o(field, e(c1Var), true, 1);
        }
        if (z10) {
            if (c1Var.j()) {
                return new uk.i(field, f(c1Var));
            }
            kotlin.jvm.internal.n.f(field, "field");
            return new uk.k(field, z12, 0);
        }
        if (c1Var.j()) {
            return new uk.m(field, e(c1Var), f(c1Var));
        }
        boolean zE = e(c1Var);
        kotlin.jvm.internal.n.f(field, "field");
        return new uk.o(field, zE, true, 0);
    }

    public static final boolean e(c1 c1Var) {
        return !pm.y0.e(c1Var.l().h().getType());
    }

    public static final Object f(c1 c1Var) {
        i1 i1VarL = c1Var.l();
        return d0.c.b(i1VarL.f50991i, i1VarL.h());
    }

    public static o1 g(zk.c cVar, jk.a aVar) {
        if (aVar != null) {
            return new o1(cVar, aVar);
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties", "lazySoft"));
    }

    public abstract String c();
}
