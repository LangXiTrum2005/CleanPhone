package ql;

import b2.w;
import cl.o0;
import cl.x0;
import com.google.android.gms.internal.ads.hx0;
import com.google.android.gms.internal.measurement.nf;
import d5.u;
import il.t;
import il.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import pm.a1;
import pm.c0;
import pm.j0;
import pm.n0;
import pm.q0;
import pm.r;
import pm.y;
import pm.y0;
import qk.i0;
import xj.v;
import zk.h0;
import zk.m0;
import zk.s;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:36:0x009c  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v31 */
    public static j1.d c(c0 c0Var, a4.b bVar, int i10, int i11, boolean z10, boolean z11) {
        zk.e eVarA;
        Boolean bool;
        n0 n0VarP;
        w wVar;
        Object objJ;
        u.n(i11, "<this>");
        ?? r10 = 0;
        boolean z12 = i11 != 3;
        boolean z13 = (z11 && z10) ? false : true;
        Object obj = null;
        if (!z12 && c0Var.t().isEmpty()) {
            return new j1.d(null, 1, false);
        }
        zk.g gVarE = c0Var.P().e();
        if (gVarE == null) {
            return new j1.d(null, 1, false);
        }
        d dVar = (d) bVar.invoke(Integer.valueOf(i10));
        al.k kVar = q.f49169a;
        u.n(i11, "<this>");
        if (i11 == 3 || !(gVarE instanceof zk.e)) {
            eVarA = null;
        } else if (dVar.f49136b == e.f49139a && i11 == 1) {
            zk.e eVar = (zk.e) gVarE;
            String str = yk.d.f54447a;
            yl.e eVarG = bm.e.g(eVar);
            HashMap map = yk.d.f54456j;
            if (map.containsKey(eVarG)) {
                yl.c cVar = (yl.c) map.get(bm.e.g(eVar));
                if (cVar == null) {
                    throw new IllegalArgumentException("Given class " + eVar + " is not a mutable collection");
                }
                eVarA = fm.e.e(eVar).i(cVar);
            } else if (dVar.f49136b == e.f49140b) {
                eVarA = null;
            } else {
                eVarA = null;
            }
        } else if (dVar.f49136b == e.f49140b || i11 != 2) {
            eVarA = null;
        } else {
            zk.e eVar2 = (zk.e) gVarE;
            String str2 = yk.d.f54447a;
            if (yk.d.f54457k.containsKey(bm.e.g(eVar2))) {
                eVarA = yk.e.a(eVar2);
            } else {
                eVarA = null;
            }
        }
        u.n(i11, "<this>");
        if (i11 == 3) {
            bool = null;
        } else {
            g gVar = dVar.f49135a;
            int i12 = gVar == null ? -1 : p.f49168a[gVar.ordinal()];
            if (i12 == 1) {
                bool = Boolean.TRUE;
            } else if (i12 != 2) {
                bool = null;
            } else {
                bool = Boolean.FALSE;
            }
        }
        if (eVarA == null || (n0VarP = eVarA.n()) == null) {
            n0VarP = c0Var.P();
        }
        kotlin.jvm.internal.n.e(n0VarP, "enhancedClassifier?.typeConstructor ?: constructor");
        int i13 = i10 + 1;
        List listT = c0Var.t();
        List parameters = n0VarP.getParameters();
        kotlin.jvm.internal.n.e(parameters, "typeConstructor.parameters");
        List list = parameters;
        Iterator it = listT.iterator();
        Iterator it2 = list.iterator();
        ArrayList arrayList = new ArrayList(Math.min(xj.p.W(listT, 10), xj.p.W(list, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            m0 m0Var = (m0) it2.next();
            q0 q0Var = (q0) next;
            if (!z13) {
                wVar = new w((int) r10, 18, obj);
            } else if (!q0Var.c()) {
                wVar = d(q0Var.b().b0(), bVar, i13, z11);
            } else if (((d) bVar.invoke(Integer.valueOf(i13))).f49135a == g.f49143a) {
                a1 a1VarB0 = q0Var.b().b0();
                wVar = new w(1, 18, pm.f.j(pm.c.l(a1VarB0).i0(r10), pm.c.z(a1VarB0).i0(true)));
            } else {
                wVar = new w(1, 18, (Object) null);
            }
            i13 += wVar.f5410b;
            y yVar = (y) wVar.f5411c;
            if (yVar != null) {
                int iA = q0Var.a();
                u.u(iA, "arg.projectionKind");
                objJ = i0.u(yVar, iA, m0Var);
            } else if (eVarA == null || q0Var.c()) {
                objJ = eVarA != null ? y0.j(m0Var) : null;
            } else {
                y yVarB = q0Var.b();
                kotlin.jvm.internal.n.e(yVarB, "arg.type");
                int iA2 = q0Var.a();
                u.u(iA2, "arg.projectionKind");
                objJ = i0.u(yVarB, iA2, m0Var);
            }
            arrayList.add(objJ);
            r10 = 0;
            obj = null;
        }
        int i14 = i13 - i10;
        if (eVarA == null && bool == null) {
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                do {
                    if (it3.hasNext()) {
                    }
                } while (((q0) it3.next()) == null);
            }
            return new j1.d(null, i14, false);
        }
        al.j annotations = c0Var.getAnnotations();
        al.k kVar2 = q.f49170b;
        if (eVarA == null) {
            kVar2 = null;
        }
        ArrayList arrayListM0 = xj.k.m0(new al.j[]{annotations, kVar2, bool != null ? q.f49169a : null});
        int size = arrayListM0.size();
        if (size == 0) {
            throw new IllegalStateException("At least one Annotations object expected");
        }
        j0 j0VarX = pm.c.x(size != 1 ? new al.k(xj.n.N0(arrayListM0), 1) : (al.j) xj.n.F0(arrayListM0));
        List listT2 = c0Var.t();
        Iterator it4 = arrayList.iterator();
        Iterator it5 = listT2.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(xj.p.W(arrayList, 10), xj.p.W(listT2, 10)));
        while (it4.hasNext() && it5.hasNext()) {
            Object next2 = it4.next();
            q0 q0Var2 = (q0) it5.next();
            q0 q0Var3 = (q0) next2;
            if (q0Var3 != null) {
                q0Var2 = q0Var3;
            }
            arrayList2.add(q0Var2);
        }
        c0 c0VarR = pm.f.r(arrayList2, j0VarX, n0VarP, bool != null ? bool.booleanValue() : c0Var.Q());
        if (dVar.f49137c) {
            c0VarR = new f(c0VarR);
        }
        return new j1.d(c0VarR, i14, bool != null && dVar.f49138d);
    }

    public static w d(a1 a1Var, a4.b bVar, int i10, boolean z10) {
        a1 a1VarJ;
        c0 c0Var;
        Object objB = null;
        if (pm.c.j(a1Var)) {
            return new w(1, 18, (Object) null);
        }
        if (!(a1Var instanceof r)) {
            if (!(a1Var instanceof c0)) {
                throw new aa.b((byte) 0, 20);
            }
            j1.d dVarC = c((c0) a1Var, bVar, i10, 3, false, z10);
            y yVarB = (c0) dVarC.f43584c;
            if (dVarC.f43582a) {
                yVarB = pm.c.B(a1Var, yVarB);
            }
            return new w(dVarC.f43583b, 18, yVarB);
        }
        boolean z11 = a1Var instanceof nl.f;
        r rVar = (r) a1Var;
        c0 c0Var2 = rVar.f48471c;
        c0 c0Var3 = rVar.f48470b;
        j1.d dVarC2 = c(c0Var3, bVar, i10, 1, z11, z10);
        j1.d dVarC3 = c(rVar.f48471c, bVar, i10, 2, z11, z10);
        c0 c0Var4 = (c0) dVarC3.f43584c;
        c0 c0Var5 = (c0) dVarC2.f43584c;
        if (c0Var5 != null || c0Var4 != null) {
            if (dVarC2.f43582a || dVarC3.f43582a) {
                if (c0Var4 != null) {
                    if (c0Var5 == null) {
                        c0Var5 = c0Var4;
                    }
                    a1VarJ = pm.f.j(c0Var5, c0Var4);
                } else {
                    kotlin.jvm.internal.n.c(c0Var5);
                    a1VarJ = c0Var5;
                }
                objB = pm.c.B(a1Var, a1VarJ);
            } else if (z11) {
                c0 c0Var6 = c0Var5;
                if (c0Var5 == null) {
                }
                if (c0Var4 != null) {
                    c0Var6 = c0Var3;
                    c0Var2 = c0Var4;
                }
                c0Var6 = c0Var3;
                objB = new nl.f(c0Var6, c0Var2);
            } else {
                if (c0Var5 == null) {
                }
                if (c0Var4 != null) {
                    c0Var = c0Var3;
                    c0Var2 = c0Var4;
                }
                c0Var = c0Var3;
                objB = pm.f.j(c0Var, c0Var2);
            }
        }
        return new w(dVarC2.f43583b, 18, objB);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:103:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:112:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:176:0x0295  */
    /* JADX WARN: Code duplicated, block: B:191:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:221:0x032c  */
    /* JADX WARN: Code duplicated, block: B:223:0x032f  */
    /* JADX WARN: Code duplicated, block: B:228:0x033a  */
    /* JADX WARN: Code duplicated, block: B:235:0x034a  */
    /* JADX WARN: Code duplicated, block: B:239:0x035c  */
    /* JADX WARN: Code duplicated, block: B:241:0x0366  */
    /* JADX WARN: Code duplicated, block: B:242:0x0368  */
    /* JADX WARN: Code duplicated, block: B:247:0x0378  */
    /* JADX WARN: Code duplicated, block: B:248:0x037a  */
    /* JADX WARN: Code duplicated, block: B:250:0x037d  */
    /* JADX WARN: Code duplicated, block: B:251:0x037f  */
    /* JADX WARN: Code duplicated, block: B:253:0x0387  */
    /* JADX WARN: Code duplicated, block: B:256:0x0396  */
    /* JADX WARN: Code duplicated, block: B:262:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:263:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:267:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:277:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:279:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:281:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:284:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:287:0x0400  */
    /* JADX WARN: Code duplicated, block: B:290:0x040c  */
    /* JADX WARN: Code duplicated, block: B:294:0x0413  */
    /* JADX WARN: Code duplicated, block: B:307:0x0332 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:308:0x036c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x0356 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x03a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:0x0390 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:0x03cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x03bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:323:0x040a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:324:0x040c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:? A[LOOP:7: B:285:0x03fa->B:325:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:333:0x01f6 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public y a(hx0 hx0Var, y yVar, List list, o oVar, boolean z10) {
        int size;
        al.j annotations;
        Iterable iterable;
        nf nfVar;
        d[] dVarArr;
        boolean z11;
        g gVar;
        h hVar;
        il.n nVar;
        h hVarB;
        h hVar2;
        h hVar3;
        g gVar2;
        boolean z12;
        h hVarA;
        d dVar;
        h hVarB2;
        h hVarA2;
        il.n nVar2;
        h hVar4;
        h hVarA3;
        boolean z13;
        e eVar;
        n0 n0VarP0;
        ArrayList<d> arrayList;
        Iterator it;
        boolean z14;
        boolean z15;
        g gVar3;
        ArrayList arrayList2;
        Set setR0;
        g gVar4;
        g gVar5;
        ArrayList arrayList3;
        Iterator it2;
        g gVar6;
        boolean z16;
        boolean z17;
        Iterator it3;
        e eVar2;
        ArrayList arrayList4;
        Iterator it4;
        Set setR1;
        g gVar7;
        g gVar8;
        a aVar;
        d dVar2;
        sm.c cVar;
        g gVarE;
        int i10;
        hx0 hx0Var2 = hx0Var;
        al.a aVar2 = (al.a) hx0Var2.f15420d;
        nf nfVar2 = (nf) hx0Var2.f15421e;
        List list2 = list;
        boolean z18 = hx0Var2.f15418b;
        kotlin.jvm.internal.n.f(yVar, "<this>");
        ArrayList arrayListI = hx0Var.i(yVar);
        ArrayList arrayList5 = new ArrayList(xj.p.W(list2, 10));
        Iterator it5 = list2.iterator();
        while (it5.hasNext()) {
            arrayList5.add(hx0Var2.i((sm.c) it5.next()));
        }
        if (!z18 || ((list2 instanceof Collection) && list2.isEmpty())) {
            size = arrayListI.size();
            break;
        }
        Iterator it6 = list2.iterator();
        while (true) {
            if (!it6.hasNext()) {
                size = arrayListI.size();
                break;
            }
            sm.c other = (sm.c) it6.next();
            kotlin.jvm.internal.n.f(other, "other");
            if (!((qm.l) ((ll.a) nfVar2.f23782b).f45504u).a(yVar, (y) other)) {
                size = 1;
                break;
            }
        }
        d[] dVarArr2 = new d[size];
        int i11 = 0;
        while (i11 < size) {
            a aVar3 = (a) arrayListI.get(i11);
            il.a aVar4 = (il.a) hx0Var2.f15422f;
            sm.c cVar2 = aVar3.f49130a;
            m0 m0Var = aVar3.f49132c;
            g gVar9 = g.f49143a;
            g gVar10 = g.f49144b;
            qm.m mVar = qm.m.f49193a;
            int i12 = size;
            g gVar11 = g.f49145c;
            boolean z19 = z18;
            e eVar3 = e.f49140b;
            ArrayList arrayList6 = arrayListI;
            e eVar4 = e.f49139a;
            ArrayList arrayList7 = arrayList5;
            if (cVar2 == null) {
                if (m0Var != null) {
                    int iV = m0Var.v();
                    u.u(iV, "this.variance");
                    i10 = j1.f.i(iV);
                } else {
                    i10 = 0;
                }
                if (i10 == 1) {
                    dVar = d.f49134e;
                    nfVar = nfVar2;
                    dVarArr = dVarArr2;
                }
                arrayList = new ArrayList();
                it = arrayList7.iterator();
                while (it.hasNext()) {
                    aVar = (a) xj.n.r0(i11, (List) it.next());
                    if (aVar != null || (cVar = aVar.f49130a) == null) {
                        dVar2 = null;
                    } else {
                        g gVarE2 = hx0.e(cVar);
                        if (gVarE2 == null) {
                            y yVarF = pm.c.f((y) cVar);
                            gVarE = yVarF != null ? hx0.e(yVarF) : null;
                        } else {
                            gVarE = gVarE2;
                        }
                        String str = yk.d.f54447a;
                        dVar2 = new d(gVarE, yk.d.f54457k.containsKey(hx0.c(mVar.q0(cVar))) ? eVar4 : yk.d.f54456j.containsKey(hx0.c(mVar.I(cVar))) ? eVar3 : null, mVar.c0(cVar) || (((y) cVar).b0() instanceof f), gVarE != gVarE2);
                    }
                    if (dVar2 != null) {
                        arrayList.add(dVar2);
                    }
                }
                if (i11 == 0 || !z19) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                if (i11 == 0 || !(aVar2 instanceof x0) || ((x0) aVar2).f6635j == null) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                gVar3 = dVar.f49135a;
                arrayList2 = new ArrayList();
                for (d dVar3 : arrayList) {
                    if (dVar3.f49138d) {
                        gVar8 = null;
                    } else {
                        gVar8 = dVar3.f49135a;
                    }
                    if (gVar8 != null) {
                        arrayList2.add(gVar8);
                    }
                }
                setR0 = xj.n.R0(arrayList2);
                if (dVar.f49138d) {
                    gVar4 = null;
                } else {
                    gVar4 = gVar3;
                }
                if (gVar4 == gVar9) {
                    gVar5 = gVar9;
                } else {
                    gVar5 = (g) t9.e.t(setR0, gVar11, gVar10, gVar4, z14);
                }
                if (gVar5 == null) {
                    arrayList4 = new ArrayList();
                    it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        gVar7 = ((d) it4.next()).f49135a;
                        if (gVar7 != null) {
                            arrayList4.add(gVar7);
                        }
                    }
                    setR1 = xj.n.R0(arrayList4);
                    if (gVar3 != gVar9) {
                        gVar9 = (g) t9.e.t(setR1, gVar11, gVar10, gVar3, z14);
                    }
                } else {
                    gVar9 = gVar5;
                }
                arrayList3 = new ArrayList();
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    eVar2 = ((d) it2.next()).f49136b;
                    if (eVar2 != null) {
                        arrayList3.add(eVar2);
                    }
                }
                e eVar5 = (e) t9.e.t(xj.n.R0(arrayList3), eVar3, eVar4, dVar.f49136b, z14);
                if (gVar9 != null || z10 || (z15 && gVar9 == gVar10)) {
                    gVar6 = null;
                } else {
                    gVar6 = gVar9;
                }
                if (gVar6 != gVar11) {
                    z16 = false;
                } else {
                    if (!dVar.f49137c) {
                        if (!arrayList.isEmpty()) {
                            it3 = arrayList.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (((d) it3.next()).f49137c) {
                                    }
                                }
                            }
                        }
                        z16 = false;
                    }
                    z16 = true;
                }
                if (gVar6 != null || gVar5 == gVar9) {
                    z17 = false;
                } else {
                    z17 = true;
                }
                dVarArr[i11] = new d(gVar6, eVar5, z16, z17);
                i11++;
                hx0Var2 = hx0Var;
                size = i12;
                z18 = z19;
                arrayListI = arrayList6;
                arrayList5 = arrayList7;
                nfVar2 = nfVar;
                dVarArr2 = dVarArr;
            } else {
                m0Var = m0Var;
            }
            boolean z20 = m0Var == null;
            Iterable iterable2 = v.f53866a;
            Iterable annotations2 = cVar2 != null ? ((y) cVar2).getAnnotations() : iterable2;
            m0 m0VarS = (cVar2 == null || (n0VarP0 = mVar.p0(cVar2)) == null) ? null : qm.g.s(n0VarP0);
            boolean z21 = aVar4 == il.a.TYPE_PARAMETER_BOUNDS;
            if (z20 != 0) {
                if (!z21) {
                    ((ll.a) nfVar2.f23782b).f45503t.getClass();
                }
                if (aVar2 != null && (annotations = aVar2.getAnnotations()) != null) {
                    iterable2 = annotations;
                }
                annotations2 = xj.n.z0(iterable2, annotations2);
            }
            ((ll.a) nfVar2.f23782b).f45500q.getClass();
            Iterator it7 = annotations2.iterator();
            e eVar6 = null;
            while (true) {
                if (!it7.hasNext()) {
                    iterable = annotations2;
                    break;
                }
                iterable = annotations2;
                yl.c cVarD = il.c.d(it7.next());
                Iterator it8 = it7;
                if (z.f43149o.contains(cVarD)) {
                    eVar = eVar4;
                } else {
                    if (z.f43150p.contains(cVarD)) {
                        eVar = eVar3;
                    } else {
                        continue;
                    }
                    it7 = it8;
                    annotations2 = iterable;
                }
                if (eVar6 != null && eVar6 != eVar) {
                    eVar6 = null;
                    break;
                }
                eVar6 = eVar;
                it7 = it8;
                annotations2 = iterable;
            }
            il.c cVar3 = ((ll.a) nfVar2.f23782b).f45500q;
            nfVar = nfVar2;
            a4.b bVar = new a4.b(6, hx0Var2, aVar3);
            cVar3.getClass();
            Iterator it9 = iterable.iterator();
            h hVar5 = null;
            while (true) {
                if (!it9.hasNext()) {
                    dVarArr = dVarArr2;
                    z11 = z21;
                    gVar = null;
                    hVar = hVar5;
                    break;
                }
                z11 = z21;
                Object next = it9.next();
                h hVarG = cVar3.g(next, ((Boolean) bVar.invoke(next)).booleanValue());
                if (hVarG != null) {
                    dVarArr = dVarArr2;
                    hVar4 = hVarG;
                } else {
                    Object objI = cVar3.i(next);
                    if (objI == null) {
                        dVarArr = dVarArr2;
                    } else {
                        il.c0 c0VarH = cVar3.h(next);
                        if (c0VarH == null) {
                            c0VarH = cVar3.f43051a.f43111a.f43114a;
                        }
                        dVarArr = dVarArr2;
                        if (c0VarH == il.c0.IGNORE) {
                            hVar4 = null;
                        } else {
                            h hVarG2 = cVar3.g(objI, ((Boolean) bVar.invoke(objI)).booleanValue());
                            if (hVarG2 != null) {
                                boolean z22 = c0VarH == il.c0.WARN;
                                cVar3 = cVar3;
                                gVar = null;
                                hVarA3 = h.a(hVarG2, null, z22, 1);
                            }
                        }
                        if (hVar5 == null) {
                            hVar5 = hVarA3;
                        } else {
                            boolean z23 = hVar5.f49148b;
                            if (hVarA3 == null && !hVarA3.equals(hVar5) && (!(z13 = hVarA3.f49148b) || z23)) {
                                if (z13 || !z23) {
                                    hVar = gVar;
                                    break;
                                }
                                hVar5 = hVarA3;
                            }
                        }
                        cVar3 = cVar3;
                        z21 = z11;
                        dVarArr2 = dVarArr;
                        hVar5 = hVar5;
                    }
                    cVar3 = cVar3;
                    gVar = null;
                    hVarA3 = null;
                    if (hVar5 == null) {
                        hVar5 = hVarA3;
                    } else {
                        boolean z24 = hVar5.f49148b;
                        if (hVarA3 == null) {
                            continue;
                        }
                    }
                    cVar3 = cVar3;
                    z21 = z11;
                    dVarArr2 = dVarArr;
                    hVar5 = hVar5;
                }
                gVar = null;
                hVarA3 = hVar4;
                if (hVar5 == null) {
                    hVar5 = hVarA3;
                } else {
                    boolean z25 = hVar5.f49148b;
                    if (hVarA3 == null) {
                        continue;
                    }
                }
                cVar3 = cVar3;
                z21 = z11;
                dVarArr2 = dVarArr;
                hVar5 = hVar5;
            }
            if (hVar != 0) {
                g gVar12 = hVar.f49147a;
                dVar = new d(gVar12, eVar6, gVar12 == gVar11 && m0VarS != null, hVar.f49148b);
            } else {
                il.a aVar5 = (z20 || z11) ? aVar4 : il.a.TYPE_USE;
                il.v vVar = aVar3.f49131b;
                if (vVar != null) {
                    nVar2 = (il.n) vVar.f43113a.get(aVar5);
                } else {
                    nVar = gVar;
                }
                if (m0VarS != null) {
                    nVar = nVar2;
                    hVarB = hx0.b(m0VarS);
                } else {
                    nVar = nVar2;
                    hVarB = gVar;
                }
                if (hVarB != 0) {
                    hVarA2 = h.a(hVarB, gVar11, false, 2);
                } else if (nVar != 0) {
                    hVar3 = nVar.f43092a;
                } else {
                    hVar2 = gVar;
                }
                if (hVarB != 0) {
                    hVar2 = hVar3;
                    gVar2 = hVarB.f49147a;
                } else {
                    hVar2 = hVar3;
                    gVar2 = gVar;
                }
                if (gVar2 == gVar11 || !(m0VarS == null || nVar == 0 || !nVar.f43094c)) {
                    hVar2 = hVarA2;
                    hVar2 = hVarA2;
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (m0Var == null || (hVarB2 = hx0.b(m0Var)) == null) {
                    hVarA = gVar;
                } else if (hVarB2.f49147a == gVar10) {
                    hVarA = hVarB2;
                    hVarA = h.a(hVarB2, gVar9, false, 2);
                }
                if (hVarA != 0) {
                    g gVar13 = hVarA.f49147a;
                    if (hVar2 == 0) {
                        hVar2 = hVarA;
                    } else {
                        g gVar14 = hVar2.f49147a;
                        boolean z26 = hVar2.f49148b;
                        boolean z27 = hVarA.f49148b;
                        if ((!z27 || z26) && ((!z27 && z26) || (gVar13.compareTo(gVar14) >= 0 && gVar13.compareTo(gVar14) > 0))) {
                            hVar2 = hVarA;
                        }
                    }
                }
                dVar = new d(hVar2 != 0 ? hVar2.f49147a : null, eVar6, z12, hVar2 != 0 && hVar2.f49148b);
            }
            arrayList = new ArrayList();
            it = arrayList7.iterator();
            while (it.hasNext()) {
                aVar = (a) xj.n.r0(i11, (List) it.next());
                if (aVar != null) {
                    dVar2 = null;
                } else {
                    dVar2 = null;
                }
                if (dVar2 != null) {
                    arrayList.add(dVar2);
                }
            }
            if (i11 == 0) {
                z14 = false;
            } else {
                z14 = false;
            }
            if (i11 == 0) {
                z15 = false;
            } else {
                z15 = false;
            }
            gVar3 = dVar.f49135a;
            arrayList2 = new ArrayList();
            while (r12.hasNext()) {
                if (dVar3.f49138d) {
                    gVar8 = null;
                } else {
                    gVar8 = dVar3.f49135a;
                }
                if (gVar8 != null) {
                    arrayList2.add(gVar8);
                }
            }
            setR0 = xj.n.R0(arrayList2);
            if (dVar.f49138d) {
                gVar4 = null;
            } else {
                gVar4 = gVar3;
            }
            if (gVar4 == gVar9) {
                gVar5 = gVar9;
            } else {
                gVar5 = (g) t9.e.t(setR0, gVar11, gVar10, gVar4, z14);
            }
            if (gVar5 == null) {
                arrayList4 = new ArrayList();
                it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    gVar7 = ((d) it4.next()).f49135a;
                    if (gVar7 != null) {
                        arrayList4.add(gVar7);
                    }
                }
                setR1 = xj.n.R0(arrayList4);
                if (gVar3 != gVar9) {
                    gVar9 = (g) t9.e.t(setR1, gVar11, gVar10, gVar3, z14);
                }
            } else {
                gVar9 = gVar5;
            }
            arrayList3 = new ArrayList();
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                eVar2 = ((d) it2.next()).f49136b;
                if (eVar2 != null) {
                    arrayList3.add(eVar2);
                }
            }
            e eVar7 = (e) t9.e.t(xj.n.R0(arrayList3), eVar3, eVar4, dVar.f49136b, z14);
            if (gVar9 != null) {
                gVar6 = null;
            } else {
                gVar6 = null;
            }
            if (gVar6 != gVar11) {
                z16 = false;
            } else {
                if (!dVar.f49137c) {
                    if (!arrayList.isEmpty()) {
                        it3 = arrayList.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (((d) it3.next()).f49137c) {
                                }
                            }
                        }
                    }
                    z16 = false;
                }
                z16 = true;
            }
            if (gVar6 != null) {
                z17 = false;
            } else {
                z17 = false;
            }
            dVarArr[i11] = new d(gVar6, eVar7, z16, z17);
            i11++;
            hx0Var2 = hx0Var;
            size = i12;
            z18 = z19;
            arrayListI = arrayList6;
            arrayList5 = arrayList7;
            nfVar2 = nfVar;
            dVarArr2 = dVarArr;
        }
        return (y) d(yVar.b0(), new a4.b(5, oVar, dVarArr2), 0, hx0Var.f15419c).f5411c;
    }

    public y b(kl.a aVar, zk.b bVar, boolean z10, nf nfVar, il.a aVar2, o oVar, boolean z11, jk.b bVar2) {
        hx0 hx0Var = new hx0(bVar, z10, nfVar, aVar2, false);
        y yVar = (y) bVar2.invoke(aVar);
        Collection overriddenDescriptors = aVar.f();
        kotlin.jvm.internal.n.e(overriddenDescriptors, "overriddenDescriptors");
        Collection<zk.c> collection = overriddenDescriptors;
        ArrayList arrayList = new ArrayList(xj.p.W(collection, 10));
        for (zk.c it : collection) {
            kotlin.jvm.internal.n.e(it, "it");
            arrayList.add((y) bVar2.invoke(it));
        }
        return a(hx0Var, yVar, arrayList, oVar, z11);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0201  */
    /* JADX WARN: Code duplicated, block: B:103:0x0205  */
    /* JADX WARN: Code duplicated, block: B:106:0x020b  */
    /* JADX WARN: Code duplicated, block: B:107:0x020f  */
    /* JADX WARN: Code duplicated, block: B:110:0x022d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0233  */
    /* JADX WARN: Code duplicated, block: B:113:0x023c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0240  */
    /* JADX WARN: Code duplicated, block: B:117:0x024f  */
    /* JADX WARN: Code duplicated, block: B:120:0x025b  */
    /* JADX WARN: Code duplicated, block: B:123:0x0265  */
    /* JADX WARN: Code duplicated, block: B:128:0x0281  */
    /* JADX WARN: Code duplicated, block: B:129:0x0284  */
    /* JADX WARN: Code duplicated, block: B:131:0x0288  */
    /* JADX WARN: Code duplicated, block: B:132:0x0295  */
    /* JADX WARN: Code duplicated, block: B:134:0x0298 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:137:0x02a0 A[EDGE_INSN: B:137:0x02a0->B:146:0x02bc BREAK  A[LOOP:2: B:139:0x02a7->B:182:?]] */
    /* JADX WARN: Code duplicated, block: B:138:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:141:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:143:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:144:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:147:0x02be A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:149:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:151:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:153:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:154:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:155:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:159:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:161:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:163:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:168:0x0317  */
    /* JADX WARN: Code duplicated, block: B:173:0x0311 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x02a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x0315 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x030d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x027c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:? A[LOOP:4: B:121:0x025f->B:188:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0146  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:87:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:96:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:97:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:99:0x01fa  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [zk.b] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r22v0, types: [ql.c] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [zk.b, zk.c, zk.j] */
    /* JADX WARN: Type inference failed for: r5v6, types: [kl.a] */
    /* JADX WARN: Type inference failed for: r9v15, types: [zk.b] */
    public ArrayList e(nf nfVar, Collection collection) {
        al.j annotations;
        ?? r10;
        ?? r17;
        y yVarB;
        l lVar;
        boolean z10;
        ArrayList arrayList;
        l lVar2;
        ArrayList arrayList2;
        h0 h0Var;
        boolean z11;
        il.a aVar;
        o oVar;
        boolean z12;
        y yVarB2;
        y returnType;
        boolean z13;
        wj.f fVar;
        y type;
        ArrayList arrayList3;
        int i10;
        Iterator it;
        int i11;
        Object next;
        y type2;
        cl.z zVarJ;
        Iterator it2;
        boolean z14;
        cl.z zVarJ2;
        boolean zC;
        List list;
        Iterator it3;
        y type3;
        boolean z15;
        o oVar2;
        nf nfVarJ;
        o0 o0Var;
        nf c4 = nfVar;
        m mVar = m.f49160f;
        kotlin.jvm.internal.n.f(c4, "c");
        Collection<??> collection2 = collection;
        int i12 = 10;
        ArrayList arrayList4 = new ArrayList(xj.p.W(collection2, 10));
        for (?? M : collection2) {
            if (M instanceof kl.a) {
                kl.a aVar2 = (kl.a) M;
                if (aVar2.getKind() == 2 && aVar2.a().f().size() == 1) {
                    i10 = 10;
                } else {
                    zk.g gVarG = zk.u.g(M);
                    if (gVarG == null) {
                        annotations = ((al.b) M).getAnnotations();
                    } else {
                        ml.j jVar = gVarG instanceof ml.j ? (ml.j) gVarG : null;
                        List list2 = jVar != null ? (List) jVar.f46196k.getValue() : null;
                        List list3 = list2;
                        if (list3 == null || list3.isEmpty()) {
                            annotations = ((al.b) M).getAnnotations();
                        } else {
                            List list4 = list2;
                            ArrayList arrayList5 = new ArrayList(xj.p.W(list4, i12));
                            Iterator it4 = list4.iterator();
                            while (it4.hasNext()) {
                                arrayList5.add(new ml.f(c4, (fl.d) it4.next(), true));
                            }
                            ArrayList arrayListZ0 = xj.n.z0(((al.b) M).getAnnotations(), arrayList5);
                            annotations = arrayListZ0.isEmpty() ? al.i.f3645a : new al.k(arrayListZ0, 0);
                        }
                    }
                    nf nfVarJ2 = android.support.v4.media.session.a.j(c4, annotations);
                    if (!(M instanceof kl.f) || (o0Var = ((kl.f) M).f6576w) == null || o0Var.f6535e) {
                        r10 = o0Var;
                        r10 = M;
                    }
                    r10 = o0Var;
                    cl.z zVarJ3 = aVar2.J();
                    il.a aVar3 = il.a.VALUE_PARAMETER;
                    if (zVarJ3 != null) {
                        s sVar = r10 instanceof s ? (s) r10 : null;
                        x0 x0Var = sVar != null ? (x0) sVar.d0(kl.e.F) : null;
                        r17 = r10;
                        yVarB = b(aVar2, x0Var, false, x0Var != null ? android.support.v4.media.session.a.j(nfVarJ2, x0Var.getAnnotations()) : nfVarJ2, aVar3, null, false, m.f49161g);
                    } else {
                        r17 = r10;
                        yVarB = null;
                    }
                    kl.e eVar = M instanceof kl.e ? (kl.e) M : null;
                    if (eVar != null) {
                        zk.j jVarE = eVar.e();
                        kotlin.jvm.internal.n.d(jVarE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        String strH = go.c.H((zk.e) jVarE, go.k.u(eVar, 3));
                        if (strH != null) {
                            lVar = (l) k.f49157d.get(strH);
                        } else {
                            lVar = null;
                        }
                    } else {
                        lVar = null;
                    }
                    if (lVar != null) {
                        lVar.f49159b.size();
                        aVar2.B().size();
                    }
                    il.u javaTypeEnhancementState = ((ll.a) c4.f23782b).f45505v;
                    kotlin.jvm.internal.n.f(javaTypeEnhancementState, "javaTypeEnhancementState");
                    int i13 = 0;
                    if (t.f43109b.invoke(il.r.f43101a) == il.c0.STRICT) {
                        if ((M instanceof s) && kotlin.jvm.internal.n.a(M.d0(kl.e.G), Boolean.TRUE)) {
                            z10 = true;
                        }
                        List listB = r17.B();
                        kotlin.jvm.internal.n.e(listB, "annotationOwnerForMember.valueParameters");
                        List<x0> list5 = listB;
                        arrayList = new ArrayList(xj.p.W(list5, i12));
                        for (x0 x0Var2 : list5) {
                            if (lVar != null) {
                                oVar2 = (o) xj.n.r0(x0Var2.f6631f, lVar.f49159b);
                            } else {
                                oVar2 = null;
                            }
                            al.f fVar2 = new al.f(x0Var2, 24);
                            if (x0Var2 != null) {
                                nfVarJ = android.support.v4.media.session.a.j(nfVarJ2, x0Var2.getAnnotations());
                            } else {
                                nfVarJ = nfVarJ2;
                            }
                            ArrayList arrayList6 = arrayList;
                            arrayList6.add(b(aVar2, x0Var2, false, nfVarJ, aVar3, oVar2, z10, fVar2));
                            arrayList = arrayList6;
                            lVar = lVar;
                        }
                        lVar2 = lVar;
                        arrayList2 = arrayList;
                        if (M instanceof h0) {
                            h0Var = (h0) M;
                        } else {
                            h0Var = null;
                        }
                        if (h0Var != null) {
                            z11 = true;
                            if (x7.a.D(h0Var)) {
                                aVar = il.a.FIELD;
                            }
                            il.a aVar4 = aVar;
                            if (lVar2 != null) {
                                oVar = lVar2.f49158a;
                            } else {
                                oVar = null;
                            }
                            z12 = z11;
                            yVarB2 = b(aVar2, r17, true, nfVarJ2, aVar4, oVar, false, m.f49162h);
                            returnType = aVar2.getReturnType();
                            kotlin.jvm.internal.n.c(returnType);
                            if (y0.c(returnType, mVar, null)) {
                                z13 = z12;
                            } else {
                                zVarJ2 = aVar2.J();
                                if (zVarJ2 != null) {
                                    zC = y0.c(zVarJ2.getType(), mVar, null);
                                } else {
                                    zC = false;
                                }
                                if (zC) {
                                    z13 = z12;
                                } else {
                                    List valueParameters = aVar2.B();
                                    kotlin.jvm.internal.n.e(valueParameters, "valueParameters");
                                    list = valueParameters;
                                    if (!(list instanceof Collection) && list.isEmpty()) {
                                        z15 = false;
                                        break;
                                    }
                                    it3 = list.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            z15 = false;
                                            break;
                                        }
                                        type3 = ((x0) it3.next()).getType();
                                        kotlin.jvm.internal.n.e(type3, "it.type");
                                        if (y0.c(type3, mVar, null)) {
                                            z15 = z12;
                                            break;
                                        }
                                    }
                                    if (z15) {
                                        z13 = z12;
                                    } else {
                                        z13 = false;
                                    }
                                }
                            }
                            if (z13) {
                                fVar = new wj.f(em.b.f40121a, new il.h());
                            } else {
                                fVar = null;
                            }
                            if (yVarB == null && yVarB2 == null) {
                                if (arrayList2.isEmpty()) {
                                    z12 = false;
                                    break;
                                }
                                it2 = arrayList2.iterator();
                                do {
                                    if (it2.hasNext()) {
                                        z12 = false;
                                        break;
                                    }
                                    if (((y) it2.next()) != null) {
                                        z14 = z12;
                                    } else {
                                        z14 = false;
                                    }
                                } while (!z14);
                                if (z12 && fVar == null) {
                                    i10 = 10;
                                }
                            }
                            if (yVarB == null) {
                                zVarJ = aVar2.J();
                                if (zVarJ != null) {
                                    type = zVarJ.getType();
                                } else {
                                    type = null;
                                }
                            } else {
                                type = yVarB;
                            }
                            i10 = 10;
                            arrayList3 = new ArrayList(xj.p.W(arrayList2, 10));
                            it = arrayList2.iterator();
                            while (true) {
                                i11 = i13;
                                if (it.hasNext()) {
                                    if (yVarB2 == null) {
                                        yVarB2 = aVar2.getReturnType();
                                        kotlin.jvm.internal.n.c(yVarB2);
                                    }
                                    M = aVar2.m(type, arrayList3, yVarB2, fVar);
                                    break;
                                }
                                next = it.next();
                                i13 = i11 + 1;
                                if (i11 >= 0) {
                                    xj.o.V();
                                    throw null;
                                }
                                type2 = (y) next;
                                if (type2 == null) {
                                    type2 = ((x0) aVar2.B().get(i11)).getType();
                                    kotlin.jvm.internal.n.e(type2, "valueParameters[index].type");
                                }
                                arrayList3.add(type2);
                            }
                        } else {
                            z11 = true;
                        }
                        aVar = il.a.METHOD_RETURN_TYPE;
                        il.a aVar5 = aVar;
                        if (lVar2 != null) {
                            oVar = lVar2.f49158a;
                        } else {
                            oVar = null;
                        }
                        z12 = z11;
                        yVarB2 = b(aVar2, r17, true, nfVarJ2, aVar5, oVar, false, m.f49162h);
                        returnType = aVar2.getReturnType();
                        kotlin.jvm.internal.n.c(returnType);
                        if (y0.c(returnType, mVar, null)) {
                            z13 = z12;
                        } else {
                            zVarJ2 = aVar2.J();
                            if (zVarJ2 != null) {
                                zC = y0.c(zVarJ2.getType(), mVar, null);
                            } else {
                                zC = false;
                            }
                            if (zC) {
                                List valueParameters2 = aVar2.B();
                                kotlin.jvm.internal.n.e(valueParameters2, "valueParameters");
                                list = valueParameters2;
                                if (!(list instanceof Collection)) {
                                    it3 = list.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            z15 = false;
                                            break;
                                        }
                                        type3 = ((x0) it3.next()).getType();
                                        kotlin.jvm.internal.n.e(type3, "it.type");
                                        if (y0.c(type3, mVar, null)) {
                                            z15 = z12;
                                            break;
                                        }
                                    }
                                } else {
                                    it3 = list.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            z15 = false;
                                            break;
                                        }
                                        type3 = ((x0) it3.next()).getType();
                                        kotlin.jvm.internal.n.e(type3, "it.type");
                                        if (y0.c(type3, mVar, null)) {
                                            z15 = z12;
                                            break;
                                        }
                                    }
                                }
                                if (z15) {
                                    z13 = z12;
                                } else {
                                    z13 = false;
                                }
                            } else {
                                z13 = z12;
                            }
                        }
                        if (z13) {
                            fVar = new wj.f(em.b.f40121a, new il.h());
                        } else {
                            fVar = null;
                        }
                        if (yVarB == null) {
                            if (arrayList2.isEmpty()) {
                                z12 = false;
                                break;
                            }
                            it2 = arrayList2.iterator();
                            do {
                                if (it2.hasNext()) {
                                    z12 = false;
                                    break;
                                }
                                if (((y) it2.next()) != null) {
                                    z14 = z12;
                                } else {
                                    z14 = false;
                                }
                            } while (!z14);
                            if (z12) {
                            }
                        }
                        if (yVarB == null) {
                            zVarJ = aVar2.J();
                            if (zVarJ != null) {
                                type = zVarJ.getType();
                            } else {
                                type = null;
                            }
                        } else {
                            type = yVarB;
                        }
                        i10 = 10;
                        arrayList3 = new ArrayList(xj.p.W(arrayList2, 10));
                        it = arrayList2.iterator();
                        while (true) {
                            i11 = i13;
                            if (it.hasNext()) {
                                if (yVarB2 == null) {
                                    yVarB2 = aVar2.getReturnType();
                                    kotlin.jvm.internal.n.c(yVarB2);
                                }
                                M = aVar2.m(type, arrayList3, yVarB2, fVar);
                                break;
                                break;
                            }
                            next = it.next();
                            i13 = i11 + 1;
                            if (i11 >= 0) {
                                xj.o.V();
                                throw null;
                            }
                            type2 = (y) next;
                            if (type2 == null) {
                                type2 = ((x0) aVar2.B().get(i11)).getType();
                                kotlin.jvm.internal.n.e(type2, "valueParameters[index].type");
                            }
                            arrayList3.add(type2);
                        }
                    } else {
                        ((ll.a) nfVarJ2.f23782b).f45503t.getClass();
                    }
                    z10 = false;
                    List listB2 = r17.B();
                    kotlin.jvm.internal.n.e(listB2, "annotationOwnerForMember.valueParameters");
                    List<x0> list6 = listB2;
                    arrayList = new ArrayList(xj.p.W(list6, i12));
                    while (r20.hasNext()) {
                        if (lVar != null) {
                            oVar2 = (o) xj.n.r0(x0Var2.f6631f, lVar.f49159b);
                        } else {
                            oVar2 = null;
                        }
                        al.f fVar3 = new al.f(x0Var2, 24);
                        if (x0Var2 != null) {
                            nfVarJ = android.support.v4.media.session.a.j(nfVarJ2, x0Var2.getAnnotations());
                        } else {
                            nfVarJ = nfVarJ2;
                        }
                        ArrayList arrayList7 = arrayList;
                        arrayList7.add(b(aVar2, x0Var2, false, nfVarJ, aVar3, oVar2, z10, fVar3));
                        arrayList = arrayList7;
                        lVar = lVar;
                    }
                    lVar2 = lVar;
                    arrayList2 = arrayList;
                    if (M instanceof h0) {
                        h0Var = (h0) M;
                    } else {
                        h0Var = null;
                    }
                    if (h0Var != null) {
                        z11 = true;
                        if (x7.a.D(h0Var)) {
                            aVar = il.a.FIELD;
                        }
                        il.a aVar6 = aVar;
                        if (lVar2 != null) {
                            oVar = lVar2.f49158a;
                        } else {
                            oVar = null;
                        }
                        z12 = z11;
                        yVarB2 = b(aVar2, r17, true, nfVarJ2, aVar6, oVar, false, m.f49162h);
                        returnType = aVar2.getReturnType();
                        kotlin.jvm.internal.n.c(returnType);
                        if (y0.c(returnType, mVar, null)) {
                            z13 = z12;
                        } else {
                            zVarJ2 = aVar2.J();
                            if (zVarJ2 != null) {
                                zC = y0.c(zVarJ2.getType(), mVar, null);
                            } else {
                                zC = false;
                            }
                            if (zC) {
                                List valueParameters3 = aVar2.B();
                                kotlin.jvm.internal.n.e(valueParameters3, "valueParameters");
                                list = valueParameters3;
                                if (!(list instanceof Collection)) {
                                    it3 = list.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            z15 = false;
                                            break;
                                        }
                                        type3 = ((x0) it3.next()).getType();
                                        kotlin.jvm.internal.n.e(type3, "it.type");
                                        if (y0.c(type3, mVar, null)) {
                                            z15 = z12;
                                            break;
                                        }
                                    }
                                } else {
                                    it3 = list.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            z15 = false;
                                            break;
                                        }
                                        type3 = ((x0) it3.next()).getType();
                                        kotlin.jvm.internal.n.e(type3, "it.type");
                                        if (y0.c(type3, mVar, null)) {
                                            z15 = z12;
                                            break;
                                        }
                                    }
                                }
                                if (z15) {
                                    z13 = z12;
                                } else {
                                    z13 = false;
                                }
                            } else {
                                z13 = z12;
                            }
                        }
                        if (z13) {
                            fVar = new wj.f(em.b.f40121a, new il.h());
                        } else {
                            fVar = null;
                        }
                        if (yVarB == null) {
                            if (arrayList2.isEmpty()) {
                                z12 = false;
                                break;
                            }
                            it2 = arrayList2.iterator();
                            do {
                                if (it2.hasNext()) {
                                    z12 = false;
                                    break;
                                }
                                if (((y) it2.next()) != null) {
                                    z14 = z12;
                                } else {
                                    z14 = false;
                                }
                            } while (!z14);
                            if (z12) {
                            }
                        }
                        if (yVarB == null) {
                            zVarJ = aVar2.J();
                            if (zVarJ != null) {
                                type = zVarJ.getType();
                            } else {
                                type = null;
                            }
                        } else {
                            type = yVarB;
                        }
                        i10 = 10;
                        arrayList3 = new ArrayList(xj.p.W(arrayList2, 10));
                        it = arrayList2.iterator();
                        while (true) {
                            i11 = i13;
                            if (it.hasNext()) {
                                if (yVarB2 == null) {
                                    yVarB2 = aVar2.getReturnType();
                                    kotlin.jvm.internal.n.c(yVarB2);
                                }
                                M = aVar2.m(type, arrayList3, yVarB2, fVar);
                                break;
                                break;
                            }
                            next = it.next();
                            i13 = i11 + 1;
                            if (i11 >= 0) {
                                xj.o.V();
                                throw null;
                            }
                            type2 = (y) next;
                            if (type2 == null) {
                                type2 = ((x0) aVar2.B().get(i11)).getType();
                                kotlin.jvm.internal.n.e(type2, "valueParameters[index].type");
                            }
                            arrayList3.add(type2);
                        }
                    } else {
                        z11 = true;
                    }
                    aVar = il.a.METHOD_RETURN_TYPE;
                    il.a aVar7 = aVar;
                    if (lVar2 != null) {
                        oVar = lVar2.f49158a;
                    } else {
                        oVar = null;
                    }
                    z12 = z11;
                    yVarB2 = b(aVar2, r17, true, nfVarJ2, aVar7, oVar, false, m.f49162h);
                    returnType = aVar2.getReturnType();
                    kotlin.jvm.internal.n.c(returnType);
                    if (y0.c(returnType, mVar, null)) {
                        z13 = z12;
                    } else {
                        zVarJ2 = aVar2.J();
                        if (zVarJ2 != null) {
                            zC = y0.c(zVarJ2.getType(), mVar, null);
                        } else {
                            zC = false;
                        }
                        if (zC) {
                            List valueParameters4 = aVar2.B();
                            kotlin.jvm.internal.n.e(valueParameters4, "valueParameters");
                            list = valueParameters4;
                            if (!(list instanceof Collection)) {
                                it3 = list.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        z15 = false;
                                        break;
                                    }
                                    type3 = ((x0) it3.next()).getType();
                                    kotlin.jvm.internal.n.e(type3, "it.type");
                                    if (y0.c(type3, mVar, null)) {
                                        z15 = z12;
                                        break;
                                    }
                                }
                            } else {
                                it3 = list.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        z15 = false;
                                        break;
                                    }
                                    type3 = ((x0) it3.next()).getType();
                                    kotlin.jvm.internal.n.e(type3, "it.type");
                                    if (y0.c(type3, mVar, null)) {
                                        z15 = z12;
                                        break;
                                    }
                                }
                            }
                            if (z15) {
                                z13 = z12;
                            } else {
                                z13 = false;
                            }
                        } else {
                            z13 = z12;
                        }
                    }
                    if (z13) {
                        fVar = new wj.f(em.b.f40121a, new il.h());
                    } else {
                        fVar = null;
                    }
                    if (yVarB == null) {
                        if (arrayList2.isEmpty()) {
                            z12 = false;
                            break;
                        }
                        it2 = arrayList2.iterator();
                        do {
                            if (it2.hasNext()) {
                                z12 = false;
                                break;
                            }
                            if (((y) it2.next()) != null) {
                                z14 = z12;
                            } else {
                                z14 = false;
                            }
                        } while (!z14);
                        if (z12) {
                        }
                    }
                    if (yVarB == null) {
                        zVarJ = aVar2.J();
                        if (zVarJ != null) {
                            type = zVarJ.getType();
                        } else {
                            type = null;
                        }
                    } else {
                        type = yVarB;
                    }
                    i10 = 10;
                    arrayList3 = new ArrayList(xj.p.W(arrayList2, 10));
                    it = arrayList2.iterator();
                    while (true) {
                        i11 = i13;
                        if (it.hasNext()) {
                            if (yVarB2 == null) {
                                yVarB2 = aVar2.getReturnType();
                                kotlin.jvm.internal.n.c(yVarB2);
                            }
                            M = aVar2.m(type, arrayList3, yVarB2, fVar);
                            break;
                            break;
                        }
                        next = it.next();
                        i13 = i11 + 1;
                        if (i11 >= 0) {
                            xj.o.V();
                            throw null;
                        }
                        type2 = (y) next;
                        if (type2 == null) {
                            type2 = ((x0) aVar2.B().get(i11)).getType();
                            kotlin.jvm.internal.n.e(type2, "valueParameters[index].type");
                        }
                        arrayList3.add(type2);
                    }
                }
            } else {
                i10 = i12;
            }
            arrayList4.add(M);
            c4 = nfVar;
            i12 = i10;
        }
        return arrayList4;
    }
}
