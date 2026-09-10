package tk;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends kotlin.jvm.internal.o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f50959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e0 f50960f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(e0 e0Var, int i10) {
        super(0);
        this.f50959e = i10;
        this.f50960f = e0Var;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x017a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0182  */
    /* JADX WARN: Code duplicated, block: B:48:0x0192  */
    @Override // jk.a
    public final Object invoke() throws ClassNotFoundException {
        Object objE;
        uk.f sVar;
        uk.f rVar;
        GenericDeclaration genericDeclarationP;
        uk.u uVarK;
        Method method;
        uk.u tVar;
        int i10 = this.f50959e;
        e0 e0Var = this.f50960f;
        switch (i10) {
            case 0:
                yl.b bVar = t1.f51065a;
                Object obj = e0Var.f50965h;
                zk.s sVarH = e0Var.h();
                c0 c0Var = e0Var.f50963f;
                q1 q1VarC = t1.c(sVarH);
                if (q1VarC instanceof i) {
                    if (e0Var.i()) {
                        Class clsA = c0Var.a();
                        List parameters = e0Var.getParameters();
                        ArrayList arrayList = new ArrayList(xj.p.W(parameters, 10));
                        Iterator it = parameters.iterator();
                        while (it.hasNext()) {
                            String name = ((s0) ((qk.o) it.next())).getName();
                            kotlin.jvm.internal.n.c(name);
                            arrayList.add(name);
                        }
                        return new uk.a(clsA, arrayList, 2);
                    }
                    String desc = ((i) q1VarC).f50985b.f53901e;
                    c0Var.getClass();
                    kotlin.jvm.internal.n.f(desc, "desc");
                    objE = c0.p(c0Var.a(), c0Var.m(desc));
                } else if (q1VarC instanceof j) {
                    xl.e eVar = ((j) q1VarC).f50994b;
                    objE = c0Var.e(eVar.f53900d, eVar.f53901e);
                } else if (q1VarC instanceof h) {
                    objE = ((h) q1VarC).f50981b;
                } else {
                    if (!(q1VarC instanceof g)) {
                        if (!(q1VarC instanceof f)) {
                            throw new aa.b((byte) 0, 20);
                        }
                        List list = ((f) q1VarC).f50972b;
                        Class clsA2 = c0Var.a();
                        List list2 = list;
                        ArrayList arrayList2 = new ArrayList(xj.p.W(list2, 10));
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((Method) it2.next()).getName());
                        }
                        return new uk.a(clsA2, arrayList2, 2, 1, list);
                    }
                    objE = ((g) q1VarC).f50976b;
                }
                if (objE instanceof Constructor) {
                    rVar = e0.k(e0Var, (Constructor) objE, e0Var.h(), false);
                } else {
                    if (!(objE instanceof Method)) {
                        throw new cn.c0("Could not compute caller for function: " + e0Var.h() + " (member = " + objE + ')', 3);
                    }
                    Method method2 = (Method) objE;
                    if (!Modifier.isStatic(method2.getModifiers())) {
                        sVar = e0Var.j() ? new uk.q(d0.c.b(obj, e0Var.h()), method2) : new uk.t(method2);
                    } else if (((al.b) e0Var.h()).getAnnotations().d(v1.f51075a) != null) {
                        rVar = e0Var.j() ? new uk.r(method2, false, 4) : new uk.t(method2, true, 4, 1);
                    } else {
                        sVar = e0Var.j() ? new uk.s(d0.c.b(obj, e0Var.h()), method2) : new uk.t(method2, false, 6, 2);
                    }
                    rVar = sVar;
                }
                return d0.c.d(rVar, e0Var.h(), false);
            default:
                yl.b bVar2 = t1.f51065a;
                zk.s sVarH2 = e0Var.h();
                c0 c0Var2 = e0Var.f50963f;
                q1 q1VarC2 = t1.c(sVarH2);
                if (q1VarC2 instanceof j) {
                    xl.e eVar2 = ((j) q1VarC2).f50994b;
                    String name2 = eVar2.f53900d;
                    String desc2 = eVar2.f53901e;
                    Member memberB = e0Var.c().b();
                    kotlin.jvm.internal.n.c(memberB);
                    boolean zIsStatic = Modifier.isStatic(memberB.getModifiers());
                    boolean z10 = !zIsStatic;
                    c0Var2.getClass();
                    kotlin.jvm.internal.n.f(name2, "name");
                    kotlin.jvm.internal.n.f(desc2, "desc");
                    if (name2.equals("<init>")) {
                        genericDeclarationP = null;
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        if (!zIsStatic) {
                            arrayList3.add(c0Var2.a());
                        }
                        c0Var2.c(arrayList3, desc2, false);
                        genericDeclarationP = c0.n(c0Var2.k(), name2.concat("$default"), (Class[]) arrayList3.toArray(new Class[0]), c0Var2.o(an.h.v0(desc2, ')', 0, 6) + 1, desc2.length(), desc2), z10);
                    }
                } else if (!(q1VarC2 instanceof i)) {
                    if (q1VarC2 instanceof f) {
                        List list3 = ((f) q1VarC2).f50972b;
                        Class clsA3 = c0Var2.a();
                        List list4 = list3;
                        ArrayList arrayList4 = new ArrayList(xj.p.W(list4, 10));
                        Iterator it3 = list4.iterator();
                        while (it3.hasNext()) {
                            arrayList4.add(((Method) it3.next()).getName());
                        }
                        return new uk.a(clsA3, arrayList4, 1, 1, list3);
                    }
                    genericDeclarationP = null;
                } else {
                    if (e0Var.i()) {
                        Class clsA4 = c0Var2.a();
                        List parameters2 = e0Var.getParameters();
                        ArrayList arrayList5 = new ArrayList(xj.p.W(parameters2, 10));
                        Iterator it4 = parameters2.iterator();
                        while (it4.hasNext()) {
                            String name3 = ((s0) ((qk.o) it4.next())).getName();
                            kotlin.jvm.internal.n.c(name3);
                            arrayList5.add(name3);
                        }
                        return new uk.a(clsA4, arrayList5, 1);
                    }
                    String desc3 = ((i) q1VarC2).f50985b.f53901e;
                    c0Var2.getClass();
                    kotlin.jvm.internal.n.f(desc3, "desc");
                    Class clsA5 = c0Var2.a();
                    ArrayList arrayList6 = new ArrayList();
                    c0Var2.c(arrayList6, desc3, true);
                    genericDeclarationP = c0.p(clsA5, arrayList6);
                }
                if (genericDeclarationP instanceof Constructor) {
                    uVarK = e0.k(e0Var, (Constructor) genericDeclarationP, e0Var.h(), true);
                } else if (genericDeclarationP instanceof Method) {
                    if (((al.b) e0Var.h()).getAnnotations().d(v1.f51075a) != null) {
                        zk.j jVarE = e0Var.h().e();
                        kotlin.jvm.internal.n.d(jVarE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        if (((zk.e) jVarE).W()) {
                            method = (Method) genericDeclarationP;
                            if (e0Var.j()) {
                                tVar = new uk.s(d0.c.b(e0Var.f50965h, e0Var.h()), method);
                            } else {
                                tVar = new uk.t(method, false, 6, 2);
                            }
                        } else {
                            Method method3 = (Method) genericDeclarationP;
                            tVar = e0Var.j() ? new uk.r(method3, false, 4) : new uk.t(method3, true, 4, 1);
                        }
                    } else {
                        method = (Method) genericDeclarationP;
                        if (e0Var.j()) {
                            tVar = new uk.s(d0.c.b(e0Var.f50965h, e0Var.h()), method);
                        } else {
                            tVar = new uk.t(method, false, 6, 2);
                        }
                    }
                    uVarK = tVar;
                } else {
                    uVarK = null;
                }
                if (uVarK != null) {
                    return d0.c.d(uVarK, e0Var.h(), true);
                }
                return null;
        }
    }
}
