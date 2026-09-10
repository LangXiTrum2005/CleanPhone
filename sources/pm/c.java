package pm;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import m0.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {
    public static final c0 A(c0 c0Var, c0 abbreviatedType) {
        kotlin.jvm.internal.n.f(c0Var, "<this>");
        kotlin.jvm.internal.n.f(abbreviatedType, "abbreviatedType");
        return j(c0Var) ? c0Var : new a(c0Var, abbreviatedType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final a1 B(a1 a1Var, y yVar) {
        kotlin.jvm.internal.n.f(a1Var, "<this>");
        if (a1Var instanceof z0) {
            return B(((z0) a1Var).getOrigin(), yVar);
        }
        if (yVar == null || yVar.equals(a1Var)) {
            return a1Var;
        }
        if (a1Var instanceof c0) {
            return new f0((c0) a1Var, yVar);
        }
        if (a1Var instanceof r) {
            return new t((r) a1Var, yVar);
        }
        throw new aa.b((byte) 0, 20);
    }

    public static /* synthetic */ void a(int i10) {
        String str = i10 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 4 ? 3 : 2];
        switch (i10) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i10 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i10 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 4) {
            throw new IllegalStateException(str2);
        }
    }

    public static final c0 b(y yVar) {
        kotlin.jvm.internal.n.f(yVar, "<this>");
        a1 a1VarB0 = yVar.b0();
        c0 c0Var = a1VarB0 instanceof c0 ? (c0) a1VarB0 : null;
        if (c0Var != null) {
            return c0Var;
        }
        throw new IllegalStateException(("This is should be simple type: " + yVar).toString());
    }

    public static final y c(ArrayList arrayList, List list, wk.h hVar) {
        y yVarI = new w0(new i0(arrayList, 0)).i(3, (y) xj.n.o0(list));
        return yVarI == null ? hVar.m() : yVarI;
    }

    public static final sm.c d(sm.c receiver, HashSet hashSet) {
        sm.c cVarD;
        qm.m mVar = qm.m.f49193a;
        n0 n0VarP0 = mVar.p0(receiver);
        if (!hashSet.add(n0VarP0)) {
            return null;
        }
        zk.m0 m0VarS = qm.g.s(n0VarP0);
        if (m0VarS != null) {
            sm.c cVarO = qk.i0.O(m0VarS);
            sm.c cVarD2 = d(cVarO, hashSet);
            if (cVarD2 == null) {
                return null;
            }
            boolean z10 = qm.g.C(mVar.p0(cVarO)) || ((cVarO instanceof sm.d) && qm.g.I((sm.d) cVarO));
            if ((cVarD2 instanceof sm.d) && qm.g.I((sm.d) cVarD2) && qm.g.H(receiver) && z10) {
                return mVar.b(cVarO);
            }
            return (!qm.g.H(cVarD2) && (receiver instanceof sm.d) && qm.g.F((sm.d) receiver)) ? mVar.b(cVarD2) : cVarD2;
        }
        if (qm.g.C(n0VarP0)) {
            kotlin.jvm.internal.n.f(receiver, "$receiver");
            if (!(receiver instanceof y)) {
                StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb2.append(receiver);
                sb2.append(", ");
                throw new IllegalArgumentException(q4.a.k(kotlin.jvm.internal.d0.f44761a, receiver.getClass(), sb2).toString());
            }
            c0 c0VarF = bm.g.f((y) receiver);
            if (c0VarF == null || (cVarD = d(c0VarF, hashSet)) == null) {
                return null;
            }
            if (!qm.g.H(receiver)) {
                return cVarD;
            }
            if (!qm.g.H(cVarD) && (!(cVarD instanceof sm.d) || !qm.g.I((sm.d) cVarD))) {
                return mVar.b(cVarD);
            }
        }
        return receiver;
    }

    public static zc.u e(zc.u uVar, nm.s sVar, List list) {
        List parameters = sVar.f46860g.getParameters();
        ArrayList arrayList = new ArrayList(xj.p.W(parameters, 10));
        Iterator it = parameters.iterator();
        while (it.hasNext()) {
            arrayList.add(((zk.m0) it.next()).a());
        }
        return new zc.u(uVar, sVar, list, xj.b0.W(xj.n.U0(arrayList, list)), 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final y f(y yVar) {
        kotlin.jvm.internal.n.f(yVar, "<this>");
        if (yVar instanceof z0) {
            return ((z0) yVar).k();
        }
        return null;
    }

    public static boolean g(m0 m0Var, sm.d type, c cVar) {
        l0 l0Var = l0.f48450c;
        kotlin.jvm.internal.n.f(type, "type");
        qm.b bVar = m0Var.f48456c;
        if ((bVar.j(type) && !bVar.h0(type)) || bVar.c0(type)) {
            return true;
        }
        m0Var.b();
        ArrayDeque arrayDeque = m0Var.f48460g;
        kotlin.jvm.internal.n.c(arrayDeque);
        ym.i iVar = m0Var.f48461h;
        kotlin.jvm.internal.n.c(iVar);
        arrayDeque.push(type);
        while (!arrayDeque.isEmpty()) {
            if (iVar.f54557b > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + type + ". Supertypes = " + xj.n.u0(iVar, null, null, null, null, 63)).toString());
            }
            sm.d current = (sm.d) arrayDeque.pop();
            kotlin.jvm.internal.n.e(current, "current");
            if (iVar.add(current)) {
                c cVar2 = bVar.h0(current) ? l0Var : cVar;
                if (cVar2.equals(l0Var)) {
                    cVar2 = null;
                }
                if (cVar2 == null) {
                    continue;
                } else {
                    Iterator it = bVar.I0(bVar.C0(current)).iterator();
                    while (it.hasNext()) {
                        sm.d dVarY = cVar2.y(m0Var, (sm.c) it.next());
                        if ((bVar.j(dVarY) && !bVar.h0(dVarY)) || bVar.c0(dVarY)) {
                            m0Var.a();
                            return true;
                        }
                        arrayDeque.add(dVarY);
                    }
                }
            }
        }
        m0Var.a();
        return false;
    }

    public static final a1 h(a1 a1Var, y origin) {
        kotlin.jvm.internal.n.f(a1Var, "<this>");
        kotlin.jvm.internal.n.f(origin, "origin");
        return B(a1Var, f(origin));
    }

    public static boolean i(m0 m0Var, sm.d dVar, sm.f fVar) {
        qm.b bVar = m0Var.f48456c;
        if (bVar.l(dVar)) {
            return true;
        }
        if (bVar.h0(dVar)) {
            return false;
        }
        if (m0Var.f48455b) {
            bVar.M(dVar);
        }
        return bVar.A0(bVar.C0(dVar), fVar);
    }

    public static final boolean j(y yVar) {
        kotlin.jvm.internal.n.f(yVar, "<this>");
        a1 a1VarB0 = yVar.b0();
        if (a1VarB0 instanceof rm.f) {
            return true;
        }
        return (a1VarB0 instanceof r) && (((r) a1VarB0).z0() instanceof rm.f);
    }

    public static final boolean k(y yVar) {
        kotlin.jvm.internal.n.f(yVar, "<this>");
        return yVar.b0() instanceof r;
    }

    public static final c0 l(y yVar) {
        kotlin.jvm.internal.n.f(yVar, "<this>");
        a1 a1VarB0 = yVar.b0();
        if (a1VarB0 instanceof r) {
            return ((r) a1VarB0).f48470b;
        }
        if (a1VarB0 instanceof c0) {
            return (c0) a1VarB0;
        }
        throw new aa.b((byte) 0, 20);
    }

    public static final a1 m(a1 a1Var, boolean z10) {
        kotlin.jvm.internal.n.f(a1Var, "<this>");
        n nVarP = f.p(a1Var, z10);
        if (nVarP != null) {
            return nVarP;
        }
        c0 c0VarN = n(a1Var);
        return c0VarN != null ? c0VarN : a1Var.i0(false);
    }

    public static final c0 n(a1 a1Var) {
        x xVar;
        n0 n0VarP = a1Var.P();
        x xVar2 = n0VarP instanceof x ? (x) n0VarP : null;
        if (xVar2 != null) {
            LinkedHashSet<y> linkedHashSet = xVar2.f48485b;
            ArrayList arrayList = new ArrayList(xj.p.W(linkedHashSet, 10));
            boolean z10 = false;
            for (y yVarM : linkedHashSet) {
                if (y0.e(yVarM)) {
                    yVarM = m(yVarM.b0(), false);
                    z10 = true;
                }
                arrayList.add(yVarM);
            }
            if (z10) {
                y yVarM2 = xVar2.f48484a;
                if (yVarM2 == null) {
                    yVarM2 = null;
                } else if (y0.e(yVarM2)) {
                    yVarM2 = m(yVarM2.b0(), false);
                }
                arrayList.isEmpty();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
                linkedHashSet2.hashCode();
                xVar = new x(linkedHashSet2);
                xVar.f48484a = yVarM2;
            } else {
                xVar = null;
            }
            if (xVar != null) {
                return xVar.b();
            }
        }
        return null;
    }

    public static final c0 o(c0 c0Var, List newArguments, j0 newAttributes) {
        kotlin.jvm.internal.n.f(c0Var, "<this>");
        kotlin.jvm.internal.n.f(newArguments, "newArguments");
        kotlin.jvm.internal.n.f(newAttributes, "newAttributes");
        if (newArguments.isEmpty() && newAttributes == c0Var.M()) {
            return c0Var;
        }
        if (newArguments.isEmpty()) {
            return c0Var.m0(newAttributes);
        }
        if (!(c0Var instanceof rm.f)) {
            return f.r(newArguments, newAttributes, c0Var.P(), c0Var.Q());
        }
        rm.f fVar = (rm.f) c0Var;
        n0 n0Var = fVar.f49663b;
        rm.e eVar = fVar.f49664c;
        rm.h hVar = fVar.f49665d;
        boolean z10 = fVar.f49667f;
        String[] strArr = fVar.f49668g;
        return new rm.f(n0Var, eVar, hVar, newArguments, z10, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static y p(y yVar, List list, al.j jVar, int i10) {
        if ((i10 & 2) != 0) {
            jVar = yVar.getAnnotations();
        }
        kotlin.jvm.internal.n.f(yVar, "<this>");
        if ((list.isEmpty() || list == yVar.t()) && jVar == yVar.getAnnotations()) {
            return yVar;
        }
        j0 j0VarM = yVar.M();
        if ((jVar instanceof al.p) && jVar.isEmpty()) {
            jVar = al.i.f3645a;
        }
        j0 j0VarR = r(j0VarM, jVar);
        a1 a1VarB0 = yVar.b0();
        if (a1VarB0 instanceof r) {
            r rVar = (r) a1VarB0;
            return f.j(o(rVar.f48470b, list, j0VarR), o(rVar.f48471c, list, j0VarR));
        }
        if (a1VarB0 instanceof c0) {
            return o((c0) a1VarB0, list, j0VarR);
        }
        throw new aa.b((byte) 0, 20);
    }

    public static /* synthetic */ c0 q(c0 c0Var, List list, j0 j0Var, int i10) {
        if ((i10 & 1) != 0) {
            list = c0Var.t();
        }
        if ((i10 & 2) != 0) {
            j0Var = c0Var.M();
        }
        return o(c0Var, list, j0Var);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0050  */
    public static final j0 r(j0 j0Var, al.j jVar) {
        j0 j0VarG;
        kotlin.jvm.internal.n.f(j0Var, "<this>");
        if (j.a(j0Var) == jVar) {
            return j0Var;
        }
        i iVar = (i) j.f48442b.getValue(j0Var, j.f48441a[0]);
        if (iVar != null) {
            if (j0Var.isEmpty()) {
                j0VarG = j0Var;
            } else {
                vm.a aVar = j0Var.f52661a;
                ArrayList arrayList = new ArrayList();
                for (Object obj : aVar) {
                    if (!kotlin.jvm.internal.n.a((i) obj, iVar)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.size() == j0Var.f52661a.b()) {
                    j0VarG = j0Var;
                } else {
                    j0.f48443b.getClass();
                    j0VarG = s1.g(arrayList);
                }
            }
            if (j0VarG != null) {
                j0Var = j0VarG;
            }
        }
        if (jVar.iterator().hasNext() || !jVar.isEmpty()) {
            i iVar2 = new i(jVar);
            if (j0Var.f52661a.get(j0.f48443b.n(kotlin.jvm.internal.d0.f44761a.b(i.class))) == null) {
                return j0Var.isEmpty() ? new j0(j1.f.C(iVar2)) : s1.g(xj.n.D0(xj.n.N0(j0Var), iVar2));
            }
        }
        return j0Var;
    }

    public static final y s(zk.m0 m0Var) {
        kotlin.jvm.internal.n.f(m0Var, "<this>");
        zk.j jVarE = m0Var.e();
        kotlin.jvm.internal.n.e(jVarE, "this.containingDeclaration");
        if (jVarE instanceof zk.h) {
            List parameters = ((zk.h) jVarE).n().getParameters();
            kotlin.jvm.internal.n.e(parameters, "descriptor.typeConstructor.parameters");
            List list = parameters;
            ArrayList arrayList = new ArrayList(xj.p.W(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                n0 n0VarN = ((zk.m0) it.next()).n();
                kotlin.jvm.internal.n.e(n0VarN, "it.typeConstructor");
                arrayList.add(n0VarN);
            }
            List upperBounds = m0Var.getUpperBounds();
            kotlin.jvm.internal.n.e(upperBounds, "upperBounds");
            return c(arrayList, upperBounds, fm.e.e(m0Var));
        }
        if (!(jVarE instanceof zk.s)) {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
        List typeParameters = ((zk.s) jVarE).getTypeParameters();
        kotlin.jvm.internal.n.e(typeParameters, "descriptor.typeParameters");
        List list2 = typeParameters;
        ArrayList arrayList2 = new ArrayList(xj.p.W(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            n0 n0VarN2 = ((zk.m0) it2.next()).n();
            kotlin.jvm.internal.n.e(n0VarN2, "it.typeConstructor");
            arrayList2.add(n0VarN2);
        }
        List upperBounds2 = m0Var.getUpperBounds();
        kotlin.jvm.internal.n.e(upperBounds2, "upperBounds");
        return c(arrayList2, upperBounds2, fm.e.e(m0Var));
    }

    public static boolean t(qm.b bVar, sm.d dVar, sm.d dVar2) {
        if (bVar.o(dVar) == bVar.o(dVar2) && bVar.h0(dVar) == bVar.h0(dVar2)) {
            if ((bVar.r0(dVar) == null) == (bVar.r0(dVar2) == null) && bVar.A0(bVar.C0(dVar), bVar.C0(dVar2))) {
                if (!bVar.o0(dVar, dVar2)) {
                    int iO = bVar.o(dVar);
                    for (int i10 = 0; i10 < iO; i10++) {
                        q0 q0VarS = bVar.S(dVar, i10);
                        q0 q0VarS2 = bVar.S(dVar2, i10);
                        if (bVar.e(q0VarS) == bVar.e(q0VarS2) && (bVar.e(q0VarS) || (bVar.N(q0VarS) == bVar.N(q0VarS2) && u(bVar, bVar.T(q0VarS), bVar.T(q0VarS2))))) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean u(qm.b bVar, sm.c cVar, sm.c cVar2) {
        if (cVar == cVar2) {
            return true;
        }
        c0 c0VarG0 = bVar.g0(cVar);
        c0 c0VarG1 = bVar.g0(cVar2);
        if (c0VarG0 != null && c0VarG1 != null) {
            return t(bVar, c0VarG0, c0VarG1);
        }
        r rVarL0 = bVar.l0(cVar);
        r rVarL1 = bVar.l0(cVar2);
        return rVarL0 != null && rVarL1 != null && t(bVar, bVar.y(rVarL0), bVar.y(rVarL1)) && t(bVar, bVar.C(rVarL0), bVar.C(rVarL1));
    }

    public static w0 v(List list, t0 t0Var, zk.j jVar, ArrayList arrayList) {
        if (t0Var == null) {
            a(1);
            throw null;
        }
        if (jVar == null) {
            a(2);
            throw null;
        }
        if (arrayList == null) {
            a(3);
            throw null;
        }
        w0 w0VarW = w(list, t0Var, jVar, arrayList, null);
        if (w0VarW != null) {
            return w0VarW;
        }
        throw new AssertionError("Substitution failed");
    }

    public static w0 w(List list, t0 t0Var, zk.j jVar, List list2, boolean[] zArr) {
        if (t0Var == null) {
            a(6);
            throw null;
        }
        if (jVar == null) {
            a(7);
            throw null;
        }
        if (list2 == null) {
            a(8);
            throw null;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            zk.m0 m0Var = (zk.m0) it.next();
            cl.v0 v0VarL0 = cl.v0.L0(jVar, m0Var.getAnnotations(), m0Var.q(), m0Var.v(), m0Var.getName(), i10, m0Var.H());
            map.put(m0Var.n(), new r0(1, v0VarL0.g()));
            map2.put(m0Var, v0VarL0);
            list2.add(v0VarL0);
            i10++;
        }
        i0 i0Var = new i0(map, 1);
        w0 w0VarE = w0.e(t0Var, i0Var);
        w0 w0VarE2 = w0.e(new cm.d(t0Var, 1), i0Var);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            zk.m0 m0Var2 = (zk.m0) it2.next();
            cl.v0 v0Var = (cl.v0) map2.get(m0Var2);
            for (y yVar : m0Var2.getUpperBounds()) {
                zk.g gVarE = yVar.P().e();
                y yVarI = (((gVarE instanceof zk.m0) && qk.i0.Q((zk.m0) gVarE, null, null)) ? w0VarE : w0VarE2).i(3, yVar);
                if (yVarI == null) {
                    return null;
                }
                if (yVarI != yVar && zArr != null) {
                    zArr[0] = true;
                }
                if (v0Var.l) {
                    throw new IllegalStateException("Type parameter descriptor is already initialized: " + v0Var.N0());
                }
                if (!j(yVarI)) {
                    v0Var.f6607k.add(yVarI);
                }
            }
            if (v0Var.l) {
                throw new IllegalStateException("Type parameter descriptor is already initialized: " + v0Var.N0());
            }
            v0Var.l = true;
        }
        return w0VarE;
    }

    public static final j0 x(al.j jVar) {
        kotlin.jvm.internal.n.f(jVar, "<this>");
        if (jVar.isEmpty()) {
            j0.f48443b.getClass();
            return j0.f48444c;
        }
        s1 s1Var = j0.f48443b;
        List listC = j1.f.C(new i(jVar));
        s1Var.getClass();
        return s1.g(listC);
    }

    public static final c0 z(y yVar) {
        kotlin.jvm.internal.n.f(yVar, "<this>");
        a1 a1VarB0 = yVar.b0();
        if (a1VarB0 instanceof r) {
            return ((r) a1VarB0).f48471c;
        }
        if (a1VarB0 instanceof c0) {
            return (c0) a1VarB0;
        }
        throw new aa.b((byte) 0, 20);
    }

    public abstract sm.d y(m0 m0Var, sm.c cVar);
}
