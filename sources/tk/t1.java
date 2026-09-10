package tk;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yl.b f51065a = yl.b.j(new yl.c("java.lang.Void"));

    /* JADX WARN: Multi-variable type inference failed */
    public static j a(zk.s sVar) {
        String strK = qk.i0.K(sVar);
        if (strK == null) {
            if (sVar instanceof cl.o0) {
                String strB = fm.e.k(sVar).getName().b();
                kotlin.jvm.internal.n.e(strB, "descriptor.propertyIfAccessor.name.asString()");
                strK = il.x.a(strB);
            } else if (sVar instanceof cl.p0) {
                String strB2 = fm.e.k(sVar).getName().b();
                kotlin.jvm.internal.n.e(strB2, "descriptor.propertyIfAccessor.name.asString()");
                strK = il.x.b(strB2);
            } else {
                strK = ((cl.p) sVar).getName().b();
                kotlin.jvm.internal.n.e(strK, "descriptor.name.asString()");
            }
        }
        return new j(new xl.e(strK, go.k.u(sVar, 1)));
    }

    public static q1 b(zk.h0 possiblyOverriddenProperty) {
        kotlin.jvm.internal.n.f(possiblyOverriddenProperty, "possiblyOverriddenProperty");
        zk.h0 h0VarA = ((zk.h0) bm.e.t(possiblyOverriddenProperty)).a();
        kotlin.jvm.internal.n.e(h0VarA, "unwrapFakeOverride(possi…rriddenProperty).original");
        if (h0VarA instanceof nm.q) {
            nm.q qVar = (nm.q) h0VarA;
            tl.g0 g0Var = qVar.A;
            zl.m propertySignature = wl.k.f53469d;
            kotlin.jvm.internal.n.e(propertySignature, "propertySignature");
            wl.e eVar = (wl.e) com.google.android.gms.internal.auth.i.u(g0Var, propertySignature);
            if (eVar != null) {
                return new m(h0VarA, g0Var, eVar, qVar.B, qVar.C);
            }
        } else if (h0VarA instanceof kl.f) {
            zk.j0 j0VarC = ((kl.f) h0VarA).c();
            el.g gVar = j0VarC instanceof el.g ? (el.g) j0VarC : null;
            fl.r rVar = gVar != null ? gVar.f40120a : null;
            if (rVar instanceof fl.t) {
                return new k(((fl.t) rVar).f41007a);
            }
            if (!(rVar instanceof fl.w)) {
                throw new cn.c0("Incorrect resolution sequence for Java field " + h0VarA + " (source = " + rVar + ')', 3);
            }
            Method method = ((fl.w) rVar).f41009a;
            cl.p0 setter = h0VarA.getSetter();
            zk.j0 j0VarC2 = setter != null ? setter.c() : null;
            el.g gVar2 = j0VarC2 instanceof el.g ? (el.g) j0VarC2 : null;
            fl.r rVar2 = gVar2 != null ? gVar2.f40120a : null;
            fl.w wVar = rVar2 instanceof fl.w ? (fl.w) rVar2 : null;
            return new l(method, wVar != null ? wVar.f41009a : null);
        }
        cl.o0 getter = h0VarA.getGetter();
        kotlin.jvm.internal.n.c(getter);
        j jVarA = a(getter);
        cl.p0 setter2 = h0VarA.getSetter();
        return new n(jVarA, setter2 != null ? a(setter2) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static q1 c(zk.s possiblySubstitutedFunction) {
        Method method;
        kotlin.jvm.internal.n.f(possiblySubstitutedFunction, "possiblySubstitutedFunction");
        zk.s sVarA = ((zk.s) bm.e.t(possiblySubstitutedFunction)).a();
        kotlin.jvm.internal.n.e(sVarA, "unwrapFakeOverride(possi…titutedFunction).original");
        if (sVarA instanceof nm.b) {
            nm.b bVar = (nm.b) sVarA;
            zl.a aVarZ = bVar.Z();
            if (aVarZ instanceof tl.y) {
                zl.g gVar = xl.h.f53909a;
                xl.e eVarC = xl.h.c((tl.y) aVarZ, bVar.C(), bVar.z());
                if (eVarC != null) {
                    return new j(eVarC);
                }
            }
            if (aVarZ instanceof tl.l) {
                zl.g gVar2 = xl.h.f53909a;
                xl.e eVarA = xl.h.a((tl.l) aVarZ, bVar.C(), bVar.z());
                if (eVarA != null) {
                    zk.j jVarE = possiblySubstitutedFunction.e();
                    kotlin.jvm.internal.n.e(jVarE, "possiblySubstitutedFunction.containingDeclaration");
                    return bm.g.b(jVarE) ? new j(eVarA) : new i(eVarA);
                }
            }
            return a(sVarA);
        }
        if (sVarA instanceof kl.e) {
            zk.j0 j0VarC = ((kl.e) sVarA).c();
            el.g gVar3 = j0VarC instanceof el.g ? (el.g) j0VarC : null;
            fl.r rVar = gVar3 != null ? gVar3.f40120a : null;
            fl.w wVar = rVar instanceof fl.w ? (fl.w) rVar : null;
            if (wVar != null && (method = wVar.f41009a) != null) {
                return new h(method);
            }
            throw new cn.c0("Incorrect resolution sequence for Java method " + sVarA, 3);
        }
        if (!(sVarA instanceof kl.b)) {
            cl.p pVar = (cl.p) sVarA;
            if ((pVar.getName().equals(wk.m.f53365c) && bm.m.n(sVarA)) || ((pVar.getName().equals(wk.m.f53363a) && bm.m.n(sVarA)) || (kotlin.jvm.internal.n.a(pVar.getName(), yk.a.f54442e) && sVarA.B().isEmpty()))) {
                return a(sVarA);
            }
            throw new cn.c0("Unknown origin of " + sVarA + " (" + sVarA.getClass() + ')', 3);
        }
        zk.j0 j0VarC2 = ((kl.b) sVarA).c();
        el.g gVar4 = j0VarC2 instanceof el.g ? (el.g) j0VarC2 : null;
        Object obj = gVar4 != null ? gVar4.f40120a : null;
        if (obj instanceof fl.q) {
            return new g(((fl.q) obj).f41005a);
        }
        if (obj instanceof fl.n) {
            Class cls = ((fl.n) obj).f41001a;
            if (cls.isAnnotation()) {
                return new f(cls);
            }
        }
        throw new cn.c0("Incorrect resolution sequence for Java constructor " + sVarA + " (" + obj + ')', 3);
    }
}
