package pm;

import com.google.android.gms.internal.play_billing.q1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import m0.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f48428a = new f();

    public static final boolean b(qm.b bVar, sm.d dVar) {
        if (bVar.X(dVar)) {
            return true;
        }
        if (!(dVar instanceof sm.b)) {
            return false;
        }
        q0 q0VarH = bVar.H(bVar.i0((sm.b) dVar));
        return !bVar.e(q0VarH) && bVar.X(bVar.I(bVar.T(q0VarH)));
    }

    public static final boolean c(qm.b bVar, m0 m0Var, sm.d dVar, sm.d dVar2, boolean z10) {
        Set<sm.c> setR = bVar.R(dVar);
        if (setR != null && setR.isEmpty()) {
            return false;
        }
        for (sm.c cVar : setR) {
            if (kotlin.jvm.internal.n.a(bVar.p0(cVar), bVar.C0(dVar2))) {
                return true;
            }
            if (z10 && n(f48428a, m0Var, dVar2, cVar)) {
                return true;
            }
        }
        return false;
    }

    public static List d(m0 m0Var, sm.d dVar, sm.f fVar) {
        c cVarW;
        l0 l0Var = l0.f48450c;
        qm.b bVar = m0Var.f48456c;
        bVar.Y(dVar, fVar);
        if (bVar.m0(fVar) || !bVar.j(dVar)) {
            if (!bVar.D0(fVar)) {
                ym.f fVar2 = new ym.f();
                m0Var.b();
                ArrayDeque arrayDeque = m0Var.f48460g;
                kotlin.jvm.internal.n.c(arrayDeque);
                ym.i iVar = m0Var.f48461h;
                kotlin.jvm.internal.n.c(iVar);
                arrayDeque.push(dVar);
                while (!arrayDeque.isEmpty()) {
                    if (iVar.f54557b > 1000) {
                        throw new IllegalStateException(("Too many supertypes for type: " + dVar + ". Supertypes = " + xj.n.u0(iVar, null, null, null, null, 63)).toString());
                    }
                    sm.d current = (sm.d) arrayDeque.pop();
                    kotlin.jvm.internal.n.e(current, "current");
                    if (iVar.add(current)) {
                        sm.d dVarD0 = bVar.d0(current);
                        if (dVarD0 == null) {
                            dVarD0 = current;
                        }
                        if (bVar.A0(bVar.C0(dVarD0), fVar)) {
                            fVar2.add(dVarD0);
                            cVarW = l0Var;
                        } else {
                            cVarW = bVar.o(dVarD0) == 0 ? l0.f48449b : bVar.w(dVarD0);
                        }
                        if (cVarW.equals(l0Var)) {
                            cVarW = null;
                        }
                        if (cVarW != null) {
                            Iterator it = bVar.I0(bVar.C0(current)).iterator();
                            while (it.hasNext()) {
                                arrayDeque.add(cVarW.y(m0Var, (sm.c) it.next()));
                            }
                        }
                    }
                }
                m0Var.a();
                return fVar2;
            }
            if (bVar.A0(bVar.C0(dVar), fVar)) {
                c0 c0VarD0 = bVar.d0(dVar);
                if (c0VarD0 != null) {
                    dVar = c0VarD0;
                }
                return j1.f.C(dVar);
            }
        }
        return xj.v.f53866a;
    }

    public static List e(m0 m0Var, sm.d dVar, sm.f fVar) {
        List listD = d(m0Var, dVar, fVar);
        qm.b bVar = m0Var.f48456c;
        if (listD.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listD) {
                sm.e eVarP = bVar.p((sm.d) obj);
                int iR = bVar.r(eVarP);
                int i10 = 0;
                while (true) {
                    if (i10 >= iR) {
                        arrayList.add(obj);
                        break;
                    }
                    if (bVar.l0(bVar.T(bVar.Z(eVarP, i10))) != null) {
                        break;
                    }
                    i10++;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return listD;
    }

    public static boolean g(m0 m0Var, sm.c a8, sm.c b10) {
        kotlin.jvm.internal.n.f(a8, "a");
        kotlin.jvm.internal.n.f(b10, "b");
        qm.b bVar = m0Var.f48456c;
        if (a8 == b10) {
            return true;
        }
        if (l(bVar, a8) && l(bVar, b10)) {
            a1 a1VarC = m0Var.c(m0Var.d(a8));
            a1 a1VarC2 = m0Var.c(m0Var.d(b10));
            c0 c0VarQ0 = bVar.q0(a1VarC);
            if (!bVar.A0(bVar.p0(a1VarC), bVar.p0(a1VarC2))) {
                return false;
            }
            if (bVar.o(c0VarQ0) == 0) {
                return bVar.a0(a1VarC) || bVar.a0(a1VarC2) || bVar.h0(c0VarQ0) == bVar.h0(bVar.q0(a1VarC2));
            }
        }
        f fVar = f48428a;
        return n(fVar, m0Var, a8, b10) && n(fVar, m0Var, b10, a8);
    }

    public static final a1 j(c0 lowerBound, c0 upperBound) {
        kotlin.jvm.internal.n.f(lowerBound, "lowerBound");
        kotlin.jvm.internal.n.f(upperBound, "upperBound");
        return lowerBound.equals(upperBound) ? lowerBound : new s(lowerBound, upperBound);
    }

    public static zk.m0 k(qm.b bVar, sm.c cVar, sm.c cVar2) {
        a1 a1VarT;
        int iO = bVar.o(cVar);
        int i10 = 0;
        while (true) {
            if (i10 >= iO) {
                return null;
            }
            q0 q0VarS = bVar.S(cVar, i10);
            q0 q0Var = bVar.e(q0VarS) ? null : q0VarS;
            if (q0Var != null && (a1VarT = bVar.T(q0Var)) != null) {
                boolean z10 = bVar.H0(bVar.k0(bVar.q0(a1VarT))) && bVar.H0(bVar.k0(bVar.q0(cVar2)));
                if (a1VarT.equals(cVar2) || (z10 && kotlin.jvm.internal.n.a(bVar.p0(a1VarT), bVar.p0(cVar2)))) {
                    return bVar.v(bVar.p0(cVar), i10);
                }
                zk.m0 m0VarK = k(bVar, a1VarT, cVar2);
                if (m0VarK != null) {
                    return m0VarK;
                }
            }
            i10++;
        }
    }

    public static boolean l(qm.b bVar, sm.c cVar) {
        if (!bVar.v0(bVar.p0(cVar))) {
            return false;
        }
        bVar.G(cVar);
        return (bVar.c0(cVar) || bVar.s0(cVar) || !kotlin.jvm.internal.n.a(bVar.C0(bVar.q0(cVar)), bVar.C0(bVar.I(cVar)))) ? false : true;
    }

    public static boolean m(m0 m0Var, sm.e capturedSubArguments, sm.d dVar) {
        boolean zN;
        kotlin.jvm.internal.n.f(capturedSubArguments, "capturedSubArguments");
        qm.b bVar = m0Var.f48456c;
        n0 n0VarC0 = bVar.C0(dVar);
        int iR = bVar.r(capturedSubArguments);
        int iK0 = bVar.K0(n0VarC0);
        if (iR == iK0 && iR == bVar.o(dVar)) {
            for (int i10 = 0; i10 < iK0; i10++) {
                q0 q0VarS = bVar.S(dVar, i10);
                if (!bVar.e(q0VarS)) {
                    a1 a1VarT = bVar.T(q0VarS);
                    q0 q0VarZ = bVar.Z(capturedSubArguments, i10);
                    bVar.N(q0VarZ);
                    a1 a1VarT2 = bVar.T(q0VarZ);
                    int iL = bVar.L(bVar.v(n0VarC0, i10));
                    int iN = bVar.N(q0VarS);
                    d5.u.n(iL, "declared");
                    d5.u.n(iN, "useSite");
                    if (iL == 3) {
                        iL = iN;
                    } else if (iN != 3 && iL != iN) {
                        iL = 0;
                    }
                    if (iL == 0) {
                        return m0Var.f48454a;
                    }
                    if (iL == 3) {
                        o(bVar, a1VarT2, a1VarT);
                        o(bVar, a1VarT, a1VarT2);
                    }
                    int i11 = m0Var.f48459f;
                    if (i11 > 100) {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + a1VarT2).toString());
                    }
                    m0Var.f48459f = i11 + 1;
                    int iC = v0.i.c(iL);
                    f fVar = f48428a;
                    if (iC == 0) {
                        zN = n(fVar, m0Var, a1VarT, a1VarT2);
                    } else if (iC == 1) {
                        zN = n(fVar, m0Var, a1VarT2, a1VarT);
                    } else {
                        if (iC != 2) {
                            throw new aa.b((byte) 0, 20);
                        }
                        zN = g(m0Var, a1VarT2, a1VarT);
                    }
                    m0Var.f48459f--;
                    if (!zN) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0266  */
    /* JADX WARN: Code duplicated, block: B:167:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:221:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:224:0x040a  */
    /* JADX WARN: Code duplicated, block: B:228:0x0415  */
    /* JADX WARN: Code duplicated, block: B:230:0x0418  */
    /* JADX WARN: Code duplicated, block: B:232:0x042a  */
    /* JADX WARN: Code duplicated, block: B:237:0x043b  */
    /* JADX WARN: Code duplicated, block: B:239:0x043e  */
    /* JADX WARN: Code duplicated, block: B:242:0x0451  */
    /* JADX WARN: Code duplicated, block: B:244:0x045d  */
    /* JADX WARN: Code duplicated, block: B:247:0x0465  */
    /* JADX WARN: Code duplicated, block: B:262:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:264:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:266:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:268:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:272:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:275:0x0508  */
    /* JADX WARN: Code duplicated, block: B:277:0x050e  */
    /* JADX WARN: Code duplicated, block: B:279:0x051d  */
    /* JADX WARN: Code duplicated, block: B:281:0x0523  */
    /* JADX WARN: Code duplicated, block: B:282:0x0525  */
    /* JADX WARN: Code duplicated, block: B:286:0x052d  */
    /* JADX WARN: Code duplicated, block: B:292:0x0543  */
    /* JADX WARN: Code duplicated, block: B:296:0x055d A[LOOP:6: B:290:0x053d->B:296:0x055d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:312:0x040b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:0x0474 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:0x04a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0089  */
    /* JADX WARN: Code duplicated, block: B:321:0x0566 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x0563 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:323:0x0531 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:324:0x0557 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:326:0x0502 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0093  */
    /* JADX WARN: Code duplicated, block: B:345:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:346:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:347:? A[LOOP:11: B:39:0x00af->B:347:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:350:? A[LOOP:12: B:55:0x00ee->B:350:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:354:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:62:0x0105  */
    /* JADX WARN: Code duplicated, block: B:65:0x0112  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, qm.b] */
    /* JADX WARN: Type inference failed for: r8v33, types: [int] */
    /* JADX WARN: Type inference failed for: r8v72 */
    /* JADX WARN: Type inference failed for: r8v73 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static boolean n(f fVar, m0 m0Var, sm.c subType, sm.c superType) {
        Boolean boolValueOf;
        Boolean bool;
        boolean z10;
        List listD;
        l0 l0Var;
        ArrayList<sm.d> arrayList;
        int i10;
        int size;
        n0 n0VarC0;
        ArrayDeque arrayDeque;
        ym.i iVar;
        sm.d current;
        l0 l0Var2;
        Iterator it;
        sm.d dVarY;
        sm.a aVar;
        int iK0;
        boolean z11;
        boolean z12;
        ?? r10;
        boolean z13;
        q0 q0VarU;
        a1 a1VarT;
        c0 c0VarG0;
        c0 c0VarF0;
        n0 n0VarC1;
        n0 n0VarC2;
        zk.m0 m0VarK;
        Collection collectionI0;
        Iterator it2;
        Collection collectionI1;
        Iterator it3;
        boolean z14;
        ?? context = m0Var.f48456c;
        kotlin.jvm.internal.n.f(subType, "subType");
        kotlin.jvm.internal.n.f(superType, "superType");
        if (subType == superType) {
            return true;
        }
        m0Var.getClass();
        boolean z15 = false;
        a1 a1VarC = m0Var.c(m0Var.d(subType));
        a1 a1VarC2 = m0Var.c(m0Var.d(superType));
        c0 c0VarQ0 = context.q0(a1VarC);
        c0 c0VarI = context.I(a1VarC2);
        if (!context.V(c0VarQ0) && !context.V(c0VarI)) {
            context.z(c0VarQ0);
            context.M(c0VarQ0);
            context.M(c0VarI);
            n nVarR0 = context.r0(c0VarI);
            if (nVarR0 == null || (c0VarF0 = context.f0(nVarR0)) == null) {
                c0VarF0 = c0VarI;
            }
            sm.b bVarO0 = context.O0(c0VarF0);
            sm.c cVarL0 = bVarO0 != null ? context.L0(bVarO0) : null;
            f fVar2 = f48428a;
            if (bVarO0 == null || cVarL0 == null) {
                n0VarC1 = context.C0(c0VarI);
                if (context.N0(n0VarC1)) {
                    context.h0(c0VarI);
                    collectionI1 = context.I0(n0VarC1);
                    if (!(collectionI1 instanceof Collection) && collectionI1.isEmpty()) {
                        z14 = true;
                        break;
                    }
                    it3 = collectionI1.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            z14 = true;
                            break;
                        }
                        if (!n(fVar2, m0Var, c0VarQ0, (sm.c) it3.next())) {
                            z14 = false;
                            break;
                        }
                    }
                    boolValueOf = Boolean.valueOf(z14);
                } else {
                    n0VarC2 = context.C0(c0VarQ0);
                    if (c0VarQ0 instanceof sm.b) {
                        m0VarK = k(context, c0VarI, c0VarQ0);
                        if (m0VarK == null && context.s(m0VarK, context.C0(c0VarI))) {
                            boolValueOf = Boolean.TRUE;
                        } else {
                            boolValueOf = null;
                        }
                    } else {
                        if (context.N0(n0VarC2)) {
                            collectionI0 = context.I0(n0VarC2);
                            if ((collectionI0 instanceof Collection) || !collectionI0.isEmpty()) {
                                it2 = collectionI0.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        m0VarK = k(context, c0VarI, c0VarQ0);
                                        if (m0VarK == null) {
                                        }
                                    } else if (!(((sm.c) it2.next()) instanceof sm.b)) {
                                    }
                                }
                            } else {
                                m0VarK = k(context, c0VarI, c0VarQ0);
                                if (m0VarK == null) {
                                }
                            }
                        }
                        boolValueOf = null;
                    }
                }
            } else {
                if (context.h0(c0VarI)) {
                    cVarL0 = context.E(cVarL0);
                } else if (context.c0(c0VarI)) {
                    cVarL0 = context.e0(cVarL0);
                }
                if (n(fVar2, m0Var, c0VarQ0, cVarL0)) {
                    boolValueOf = Boolean.TRUE;
                } else {
                    n0VarC1 = context.C0(c0VarI);
                    if (context.N0(n0VarC1)) {
                        context.h0(c0VarI);
                        collectionI1 = context.I0(n0VarC1);
                        if (!(collectionI1 instanceof Collection)) {
                            it3 = collectionI1.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    z14 = true;
                                    break;
                                }
                                if (!n(fVar2, m0Var, c0VarQ0, (sm.c) it3.next())) {
                                    z14 = false;
                                    break;
                                }
                            }
                        } else {
                            it3 = collectionI1.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    z14 = true;
                                    break;
                                }
                                if (!n(fVar2, m0Var, c0VarQ0, (sm.c) it3.next())) {
                                    z14 = false;
                                    break;
                                }
                            }
                        }
                        boolValueOf = Boolean.valueOf(z14);
                    } else {
                        n0VarC2 = context.C0(c0VarQ0);
                        if (c0VarQ0 instanceof sm.b) {
                            m0VarK = k(context, c0VarI, c0VarQ0);
                            if (m0VarK == null) {
                                boolValueOf = null;
                            } else {
                                boolValueOf = null;
                            }
                        } else {
                            if (context.N0(n0VarC2)) {
                                collectionI0 = context.I0(n0VarC2);
                                if (collectionI0 instanceof Collection) {
                                    it2 = collectionI0.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            m0VarK = k(context, c0VarI, c0VarQ0);
                                            if (m0VarK == null) {
                                            }
                                        } else if (!(((sm.c) it2.next()) instanceof sm.b)) {
                                        }
                                    }
                                } else {
                                    it2 = collectionI0.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            m0VarK = k(context, c0VarI, c0VarQ0);
                                            if (m0VarK == null) {
                                            }
                                        } else if (!(((sm.c) it2.next()) instanceof sm.b)) {
                                        }
                                    }
                                }
                            }
                            boolValueOf = null;
                        }
                    }
                }
            }
        } else if (m0Var.f48454a) {
            boolValueOf = Boolean.TRUE;
        } else if (!context.h0(c0VarQ0) || context.h0(c0VarI)) {
            c0 a8 = context.M0(c0VarQ0, false);
            c0 b10 = context.M0(c0VarI, false);
            kotlin.jvm.internal.n.f(context, "context");
            kotlin.jvm.internal.n.f(a8, "a");
            kotlin.jvm.internal.n.f(b10, "b");
            boolValueOf = Boolean.valueOf(c.u(context, a8, b10));
        } else {
            boolValueOf = Boolean.FALSE;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        sm.d dVarQ0 = context.q0(a1VarC);
        c0 c0VarI2 = context.I(a1VarC2);
        l0 l0Var3 = l0.f48450c;
        l0 l0Var4 = l0.f48449b;
        int i11 = 1000;
        if (!context.h0(c0VarI2) && !context.c0(dVarQ0) && !context.s0(dVarQ0) && ((!(dVarQ0 instanceof sm.b) || !context.W((sm.b) dVarQ0)) && !c.g(m0Var, dVarQ0, l0Var4))) {
            if (context.c0(c0VarI2) || c.g(m0Var, c0VarI2, l0.f48451d) || context.j(dVarQ0)) {
                return false;
            }
            n0 end = context.C0(c0VarI2);
            kotlin.jvm.internal.n.f(end, "end");
            if (!c.i(m0Var, dVarQ0, end)) {
                m0Var.b();
                ArrayDeque arrayDeque2 = m0Var.f48460g;
                kotlin.jvm.internal.n.c(arrayDeque2);
                ym.i iVar2 = m0Var.f48461h;
                kotlin.jvm.internal.n.c(iVar2);
                arrayDeque2.push(dVarQ0);
                loop0: while (true) {
                    if (arrayDeque2.isEmpty()) {
                        m0Var.a();
                        return false;
                    }
                    if (iVar2.f54557b > i11) {
                        throw new IllegalStateException(("Too many supertypes for type: " + dVarQ0 + ". Supertypes = " + xj.n.u0(iVar2, null, null, null, null, 63)).toString());
                    }
                    sm.d current2 = (sm.d) arrayDeque2.pop();
                    kotlin.jvm.internal.n.e(current2, "current");
                    if (iVar2.add(current2)) {
                        l0 l0Var5 = context.h0(current2) ? l0Var3 : l0Var4;
                        if (l0Var5.equals(l0Var3)) {
                            l0Var5 = null;
                        }
                        if (l0Var5 != null) {
                            Iterator it4 = context.I0(context.C0(current2)).iterator();
                            while (it4.hasNext()) {
                                sm.d dVarY2 = l0Var5.y(m0Var, (sm.c) it4.next());
                                if (c.i(m0Var, dVarY2, end)) {
                                    m0Var.a();
                                    break loop0;
                                }
                                arrayDeque2.add(dVarY2);
                            }
                        }
                        i11 = 1000;
                    }
                }
            }
        }
        c0 c0VarQ1 = context.q0(dVarQ0);
        c0 c0VarI3 = context.I(c0VarI2);
        if (!context.X(c0VarQ1) && !context.X(c0VarI3)) {
            bool = null;
        } else if (b(context, c0VarQ1) && b(context, c0VarI3)) {
            bool = Boolean.TRUE;
        } else if (context.X(c0VarQ1)) {
            if (c(context, m0Var, c0VarQ1, c0VarI3, false)) {
                bool = Boolean.TRUE;
            } else {
                bool = null;
            }
        } else if (context.X(c0VarI3)) {
            n0 n0VarC3 = context.C0(c0VarQ1);
            if (n0VarC3 instanceof x) {
                Collection collectionI2 = context.I0(n0VarC3);
                if (!(collectionI2 instanceof Collection) || !collectionI2.isEmpty()) {
                    Iterator it5 = collectionI2.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            c0 c0VarG1 = context.g0((sm.c) it5.next());
                            if (c0VarG1 != null && context.X(c0VarG1)) {
                            }
                        } else if (!c(context, m0Var, c0VarI3, c0VarQ1, true)) {
                            bool = null;
                        }
                    }
                } else if (!c(context, m0Var, c0VarI3, c0VarQ1, true)) {
                    bool = null;
                }
            } else if (!c(context, m0Var, c0VarI3, c0VarQ1, true)) {
                bool = null;
            }
            bool = Boolean.TRUE;
        } else {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        n0 superConstructor = context.C0(c0VarI2);
        if ((context.A0(context.C0(dVarQ0), superConstructor) && context.K0(superConstructor) == 0) || context.F(context.C0(c0VarI2))) {
            return true;
        }
        kotlin.jvm.internal.n.f(superConstructor, "superConstructor");
        if (!context.j(dVarQ0)) {
            if (context.m0(superConstructor) || context.D(superConstructor)) {
                ym.f<sm.d> fVar3 = new ym.f();
                m0Var.b();
                ArrayDeque arrayDeque3 = m0Var.f48460g;
                kotlin.jvm.internal.n.c(arrayDeque3);
                ym.i iVar3 = m0Var.f48461h;
                kotlin.jvm.internal.n.c(iVar3);
                arrayDeque3.push(dVarQ0);
                while (!arrayDeque3.isEmpty()) {
                    if (iVar3.f54557b > 1000) {
                        throw new IllegalStateException(("Too many supertypes for type: " + dVarQ0 + ". Supertypes = " + xj.n.u0(iVar3, null, null, null, null, 63)).toString());
                    }
                    sm.d current3 = (sm.d) arrayDeque3.pop();
                    kotlin.jvm.internal.n.e(current3, "current");
                    if (iVar3.add(current3)) {
                        if (context.j(current3)) {
                            fVar3.add(current3);
                            l0Var = l0Var3;
                        } else {
                            l0Var = l0Var4;
                        }
                        if (l0Var.equals(l0Var3)) {
                            l0Var = null;
                        }
                        if (l0Var != null) {
                            Iterator it6 = context.I0(context.C0(current3)).iterator();
                            while (it6.hasNext()) {
                                arrayDeque3.add(l0Var.y(m0Var, (sm.c) it6.next()));
                                z15 = z15;
                            }
                        }
                    }
                }
                z10 = z15;
                m0Var.a();
                ArrayList arrayList2 = new ArrayList();
                for (sm.d it7 : fVar3) {
                    kotlin.jvm.internal.n.e(it7, "it");
                    xj.t.a0(e(m0Var, it7, superConstructor), arrayList2);
                }
                listD = arrayList2;
            } else {
                listD = d(m0Var, dVarQ0, superConstructor);
            }
            List<sm.d> list = listD;
            i10 = 10;
            arrayList = new ArrayList(xj.p.W(list, 10));
            for (sm.d dVar : list) {
                c0VarG0 = context.g0(m0Var.c(dVar));
                if (c0VarG0 == null) {
                    dVar = c0VarG0;
                }
                arrayList.add(dVar);
            }
            size = arrayList.size();
            if (size != 0) {
                n0VarC0 = context.C0(dVarQ0);
                if (context.m0(n0VarC0)) {
                    return context.J0(n0VarC0);
                }
                if (context.J0(context.C0(dVarQ0))) {
                    return true;
                }
                m0Var.b();
                arrayDeque = m0Var.f48460g;
                kotlin.jvm.internal.n.c(arrayDeque);
                iVar = m0Var.f48461h;
                kotlin.jvm.internal.n.c(iVar);
                arrayDeque.push(dVarQ0);
                while (!arrayDeque.isEmpty()) {
                    if (iVar.f54557b <= 1000) {
                        throw new IllegalStateException(("Too many supertypes for type: " + dVarQ0 + ". Supertypes = " + xj.n.u0(iVar, null, null, null, null, 63)).toString());
                    }
                    current = (sm.d) arrayDeque.pop();
                    kotlin.jvm.internal.n.e(current, "current");
                    if (!iVar.add(current)) {
                        if (context.j(current)) {
                            l0Var2 = l0Var3;
                        } else {
                            l0Var2 = l0Var4;
                        }
                        if (l0Var2.equals(l0Var3)) {
                            l0Var2 = null;
                        }
                        if (l0Var2 == null) {
                            continue;
                        } else {
                            it = context.I0(context.C0(current)).iterator();
                            while (it.hasNext()) {
                                dVarY = l0Var2.y(m0Var, (sm.c) it.next());
                                if (context.J0(context.C0(dVarY))) {
                                    m0Var.a();
                                    return true;
                                }
                                arrayDeque.add(dVarY);
                            }
                        }
                    }
                }
                m0Var.a();
                return z10;
            }
            if (size != 1) {
                return m(m0Var, context.p((sm.d) xj.n.o0(arrayList)), c0VarI2);
            }
            aVar = new sm.a(context.K0(superConstructor));
            iK0 = context.K0(superConstructor);
            z11 = z10;
            z12 = z11;
            while (r10 < iK0) {
                if (z12 && context.L(context.v(superConstructor, r10)) == 2) {
                    z13 = z10;
                } else {
                    z13 = true;
                }
                if (!z13) {
                    ArrayList arrayList3 = new ArrayList(xj.p.W(arrayList, i10));
                    for (sm.d dVar2 : arrayList) {
                        q0VarU = context.U(dVar2, r10);
                        if (q0VarU == null) {
                            if (context.N(q0VarU) != 3) {
                                q0VarU = null;
                            }
                            if (q0VarU == null && (a1VarT = context.T(q0VarU)) != null) {
                                arrayList3.add(a1VarT);
                            }
                        }
                        throw new IllegalStateException(("Incorrect type: " + dVar2 + ", subType: " + dVarQ0 + ", superType: " + c0VarI2).toString());
                    }
                    aVar.add(context.J(context.A(arrayList3)));
                }
                i10 = 10;
                r10++;
                z12 = z13;
            }
            if (z12 && m(m0Var, aVar, c0VarI2)) {
                r10 = z11;
                return true;
            }
            r10 = z11;
            r10 = z11;
            e eVar = new e(arrayList, m0Var, context, c0VarI2);
            k0 k0Var = new k0();
            eVar.invoke(k0Var);
            return k0Var.f48448a;
        }
        listD = e(m0Var, dVarQ0, superConstructor);
        z10 = false;
        List<sm.d> list2 = listD;
        i10 = 10;
        arrayList = new ArrayList(xj.p.W(list2, 10));
        while (r8.hasNext()) {
            c0VarG0 = context.g0(m0Var.c(dVar));
            if (c0VarG0 == null) {
                dVar = c0VarG0;
            }
            arrayList.add(dVar);
        }
        size = arrayList.size();
        if (size != 0) {
            n0VarC0 = context.C0(dVarQ0);
            if (context.m0(n0VarC0)) {
                return context.J0(n0VarC0);
            }
            if (context.J0(context.C0(dVarQ0))) {
                return true;
            }
            m0Var.b();
            arrayDeque = m0Var.f48460g;
            kotlin.jvm.internal.n.c(arrayDeque);
            iVar = m0Var.f48461h;
            kotlin.jvm.internal.n.c(iVar);
            arrayDeque.push(dVarQ0);
            while (!arrayDeque.isEmpty()) {
                if (iVar.f54557b <= 1000) {
                    throw new IllegalStateException(("Too many supertypes for type: " + dVarQ0 + ". Supertypes = " + xj.n.u0(iVar, null, null, null, null, 63)).toString());
                }
                current = (sm.d) arrayDeque.pop();
                kotlin.jvm.internal.n.e(current, "current");
                if (!iVar.add(current)) {
                    if (context.j(current)) {
                        l0Var2 = l0Var3;
                    } else {
                        l0Var2 = l0Var4;
                    }
                    if (l0Var2.equals(l0Var3)) {
                        l0Var2 = null;
                    }
                    if (l0Var2 == null) {
                        continue;
                    } else {
                        it = context.I0(context.C0(current)).iterator();
                        while (it.hasNext()) {
                            dVarY = l0Var2.y(m0Var, (sm.c) it.next());
                            if (context.J0(context.C0(dVarY))) {
                                m0Var.a();
                                return true;
                            }
                            arrayDeque.add(dVarY);
                        }
                    }
                }
            }
            m0Var.a();
            return z10;
        }
        if (size != 1) {
            return m(m0Var, context.p((sm.d) xj.n.o0(arrayList)), c0VarI2);
        }
        aVar = new sm.a(context.K0(superConstructor));
        iK0 = context.K0(superConstructor);
        z11 = z10;
        z12 = z11;
        while (r10 < iK0) {
            if (z12) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (!z13) {
                ArrayList arrayList4 = new ArrayList(xj.p.W(arrayList, i10));
                while (r12.hasNext()) {
                    q0VarU = context.U(dVar2, r10);
                    if (q0VarU == null) {
                        if (context.N(q0VarU) != 3) {
                            q0VarU = null;
                        }
                        if (q0VarU == null) {
                        }
                    }
                    throw new IllegalStateException(("Incorrect type: " + dVar2 + ", subType: " + dVarQ0 + ", superType: " + c0VarI2).toString());
                }
                aVar.add(context.J(context.A(arrayList4)));
            }
            i10 = 10;
            r10++;
            z12 = z13;
        }
        if (z12) {
        }
        r10 = z11;
        r10 = z11;
        e eVar2 = new e(arrayList, m0Var, context, c0VarI2);
        k0 k0Var2 = new k0();
        eVar2.invoke(k0Var2);
        return k0Var2.f48448a;
    }

    public static void o(qm.b bVar, sm.c cVar, sm.c cVar2) {
        al.a aVarG0 = bVar.g0(cVar);
        if (aVarG0 instanceof sm.b) {
            sm.b bVar2 = (sm.b) aVarG0;
            if (!bVar.a(bVar2) && bVar.e(bVar.H(bVar.i0(bVar2))) && bVar.G0(bVar2) == 1) {
                bVar.p0(cVar2);
            }
        }
    }

    public static n p(a1 type, boolean z10) {
        boolean zE;
        kotlin.jvm.internal.n.f(type, "type");
        if (type instanceof n) {
            return (n) type;
        }
        type.P();
        if ((type.P().e() instanceof zk.m0) || (type instanceof qm.h)) {
            zk.g gVarE = type.P().e();
            cl.v0 v0Var = gVarE instanceof cl.v0 ? (cl.v0) gVarE : null;
            zE = true;
            if (v0Var == null || v0Var.l) {
                zE = (z10 && (type.P().e() instanceof zk.m0)) ? y0.e(type) : true ^ c.g(qm.g.l(false, null, 24), c.l(type), l0.f48449b);
            }
        } else {
            zE = false;
        }
        if (!zE) {
            return null;
        }
        if (type instanceof r) {
            r rVar = (r) type;
            kotlin.jvm.internal.n.a(rVar.f48470b.P(), rVar.f48471c.P());
        }
        return new n(c.l(type).i0(false), z10);
    }

    public static final c0 q(j0 attributes, zk.e descriptor, List arguments) {
        kotlin.jvm.internal.n.f(attributes, "attributes");
        kotlin.jvm.internal.n.f(descriptor, "descriptor");
        kotlin.jvm.internal.n.f(arguments, "arguments");
        n0 n0VarN = descriptor.n();
        kotlin.jvm.internal.n.e(n0VarN, "descriptor.typeConstructor");
        return r(arguments, attributes, n0VarN, false);
    }

    public static c0 r(List arguments, j0 attributes, n0 constructor, boolean z10) {
        im.n nVarL;
        cl.d0 d0Var;
        im.n nVarK;
        im.n nVar;
        im.n nVarO;
        kotlin.jvm.internal.n.f(attributes, "attributes");
        kotlin.jvm.internal.n.f(constructor, "constructor");
        kotlin.jvm.internal.n.f(arguments, "arguments");
        if (attributes.isEmpty() && arguments.isEmpty() && !z10 && constructor.e() != null) {
            zk.g gVarE = constructor.e();
            kotlin.jvm.internal.n.c(gVarE);
            c0 c0VarG = gVarE.g();
            kotlin.jvm.internal.n.e(c0VarG, "constructor.declarationDescriptor!!.defaultType");
            return c0VarG;
        }
        zk.g gVarE2 = constructor.e();
        if (gVarE2 instanceof zk.m0) {
            nVarL = ((zk.m0) gVarE2).g().A();
        } else {
            if (gVarE2 instanceof zk.e) {
                fm.e.i(fm.e.j(gVarE2));
                boolean zIsEmpty = arguments.isEmpty();
                qm.f fVar = qm.f.f49175a;
                if (zIsEmpty) {
                    zk.e eVar = (zk.e) gVarE2;
                    d0Var = eVar instanceof cl.d0 ? (cl.d0) eVar : null;
                    if (d0Var == null || (nVarO = d0Var.o(fVar)) == null) {
                        nVarL = eVar.R();
                        kotlin.jvm.internal.n.e(nVarL, "this.unsubstitutedMemberScope");
                    } else {
                        nVar = nVarO;
                    }
                } else {
                    zk.e eVar2 = (zk.e) gVarE2;
                    t0 t0VarF = o0.f48464b.f(constructor, arguments);
                    d0Var = eVar2 instanceof cl.d0 ? (cl.d0) eVar2 : null;
                    if (d0Var == null || (nVarK = d0Var.k(t0VarF, fVar)) == null) {
                        nVarL = eVar2.E(t0VarF);
                        kotlin.jvm.internal.n.e(nVarL, "this.getMemberScope(\n   …ubstitution\n            )");
                    } else {
                        nVar = nVarK;
                    }
                }
                return t(attributes, constructor, arguments, z10, nVar, new z(arguments, attributes, constructor, z10));
            }
            if (gVarE2 instanceof nm.s) {
                String str = ((nm.s) gVarE2).getName().f54514a;
                kotlin.jvm.internal.n.e(str, "descriptor.name.toString()");
                nVarL = rm.i.a(4, true, str);
            } else {
                if (!(constructor instanceof x)) {
                    throw new IllegalStateException("Unsupported classifier: " + gVarE2 + " for constructor: " + constructor);
                }
                nVarL = android.support.v4.media.session.a.l("member scope for intersection type", ((x) constructor).f48485b);
            }
        }
        nVar = nVarL;
        return t(attributes, constructor, arguments, z10, nVar, new z(arguments, attributes, constructor, z10));
    }

    public static final c0 s(im.n memberScope, List arguments, j0 attributes, n0 constructor, boolean z10) {
        kotlin.jvm.internal.n.f(attributes, "attributes");
        kotlin.jvm.internal.n.f(constructor, "constructor");
        kotlin.jvm.internal.n.f(arguments, "arguments");
        kotlin.jvm.internal.n.f(memberScope, "memberScope");
        d0 d0Var = new d0(constructor, arguments, z10, memberScope, new z(memberScope, arguments, attributes, constructor, z10));
        return attributes.isEmpty() ? d0Var : new e0(d0Var, attributes);
    }

    public static final c0 t(j0 attributes, n0 constructor, List arguments, boolean z10, im.n memberScope, jk.b bVar) {
        kotlin.jvm.internal.n.f(attributes, "attributes");
        kotlin.jvm.internal.n.f(constructor, "constructor");
        kotlin.jvm.internal.n.f(arguments, "arguments");
        kotlin.jvm.internal.n.f(memberScope, "memberScope");
        d0 d0Var = new d0(constructor, arguments, z10, memberScope, bVar);
        return attributes.isEmpty() ? d0Var : new e0(d0Var, attributes);
    }

    public void a(al.j jVar, al.j jVar2) {
        HashSet hashSet = new HashSet();
        Iterator it = jVar.iterator();
        while (it.hasNext()) {
            hashSet.add(((al.c) it.next()).e());
        }
        Iterator it2 = jVar2.iterator();
        while (it2.hasNext()) {
            hashSet.contains(((al.c) it2.next()).e());
        }
    }

    public t0 f(n0 typeConstructor, List arguments) {
        kotlin.jvm.internal.n.f(typeConstructor, "typeConstructor");
        kotlin.jvm.internal.n.f(arguments, "arguments");
        List parameters = typeConstructor.getParameters();
        kotlin.jvm.internal.n.e(parameters, "typeConstructor.parameters");
        zk.m0 m0Var = (zk.m0) xj.n.x0(parameters);
        if (m0Var == null || !m0Var.L()) {
            return new u((zk.m0[]) parameters.toArray(new zk.m0[0]), (q0[]) arguments.toArray(new q0[0]), false);
        }
        List parameters2 = typeConstructor.getParameters();
        kotlin.jvm.internal.n.e(parameters2, "typeConstructor.parameters");
        List list = parameters2;
        ArrayList arrayList = new ArrayList(xj.p.W(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((zk.m0) it.next()).n());
        }
        return new i0(xj.b0.W(xj.n.U0(arrayList, arguments)), 1);
    }

    public c0 h(zc.u uVar, j0 j0Var, boolean z10, int i10, boolean z11) {
        j0 j0VarG;
        nm.s sVar = (nm.s) uVar.f54880c;
        q0 q0VarI = i(new r0(1, sVar.L0()), uVar, null, i10);
        y yVarB = q0VarI.b();
        kotlin.jvm.internal.n.e(yVarB, "expandedProjection.type");
        c0 c0VarB = c.b(yVarB);
        if (c.j(c0VarB)) {
            return c0VarB;
        }
        q0VarI.a();
        a(c0VarB.getAnnotations(), j.a(j0Var));
        if (!c.j(c0VarB)) {
            if (c.j(c0VarB)) {
                j0VarG = c0VarB.M();
            } else {
                j0 other = c0VarB.M();
                s1 s1Var = j0.f48443b;
                kotlin.jvm.internal.n.f(other, "other");
                if (j0Var.isEmpty() && other.isEmpty()) {
                    j0VarG = j0Var;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Collection collectionValues = ((ConcurrentHashMap) s1Var.f45751b).values();
                    kotlin.jvm.internal.n.e(collectionValues, "idPerType.values");
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        i iVar = (i) j0Var.f52661a.get(iIntValue);
                        i iVar2 = (i) other.f52661a.get(iIntValue);
                        if (iVar != null) {
                            if (iVar2 != null) {
                                iVar = new i(q1.g(iVar.f48438a, iVar2.f48438a));
                            }
                            iVar2 = iVar;
                        } else if (iVar2 == null) {
                            iVar2 = null;
                        } else if (iVar != null) {
                            iVar2 = new i(q1.g(iVar2.f48438a, iVar.f48438a));
                        }
                        ym.l.a(arrayList, iVar2);
                    }
                    j0VarG = s1.g(arrayList);
                }
            }
            c0VarB = c.q(c0VarB, null, j0VarG, 1);
        }
        c0 c0VarI = y0.i(c0VarB, z10);
        if (!z11) {
            return c0VarI;
        }
        cl.f fVar = sVar.f46860g;
        kotlin.jvm.internal.n.e(fVar, "descriptor.typeConstructor");
        return c.A(c0VarI, s(im.m.f43190b, (List) uVar.f54881d, j0Var, fVar, z10));
    }

    public q0 i(q0 q0Var, zc.u uVar, zk.m0 m0Var, int i10) {
        int iV;
        nm.s sVar = (nm.s) uVar.f54880c;
        if (i10 > 100) {
            throw new AssertionError("Too deep recursion while expanding type alias " + sVar.getName());
        }
        if (q0Var.c()) {
            kotlin.jvm.internal.n.c(m0Var);
            return y0.j(m0Var);
        }
        y yVarB = q0Var.b();
        kotlin.jvm.internal.n.e(yVarB, "underlyingProjection.type");
        n0 constructor = yVarB.P();
        kotlin.jvm.internal.n.f(constructor, "constructor");
        zk.g gVarE = constructor.e();
        q0 q0Var2 = gVarE instanceof zk.m0 ? (q0) ((Map) uVar.f54882e).get(gVarE) : null;
        if (q0Var2 == null) {
            c0 c0VarB = c.b(q0Var.b().b0());
            if (!c.j(c0VarB) && y0.c(c0VarB, tm.a.f51589g, null)) {
                n0 n0VarP = c0VarB.P();
                zk.g gVarE2 = n0VarP.e();
                n0VarP.getParameters().size();
                c0VarB.t().size();
                if (!(gVarE2 instanceof zk.m0)) {
                    int i11 = 0;
                    if (gVarE2 instanceof nm.s) {
                        nm.s sVar2 = (nm.s) gVarE2;
                        if (uVar.w(sVar2)) {
                            String str = sVar2.getName().f54514a;
                            kotlin.jvm.internal.n.e(str, "typeDescriptor.name.toString()");
                            return new r0(1, rm.i.c(rm.h.RECURSIVE_TYPE_ALIAS, str));
                        }
                        List listT = c0VarB.t();
                        ArrayList arrayList = new ArrayList(xj.p.W(listT, 10));
                        for (Object obj : listT) {
                            int i12 = i11 + 1;
                            if (i11 < 0) {
                                xj.o.V();
                                throw null;
                            }
                            arrayList.add(i((q0) obj, uVar, (zk.m0) n0VarP.getParameters().get(i11), i10 + 1));
                            i11 = i12;
                        }
                        return new r0(q0Var.a(), c.A(h(c.e(uVar, sVar2, arrayList), c0VarB.M(), c0VarB.Q(), i10 + 1, false), u(c0VarB, uVar, i10)));
                    }
                    c0 c0VarU = u(c0VarB, uVar, i10);
                    w0.d(c0VarU);
                    for (Object obj2 : c0VarU.t()) {
                        int i13 = i11 + 1;
                        if (i11 < 0) {
                            xj.o.V();
                            throw null;
                        }
                        q0 q0Var3 = (q0) obj2;
                        if (!q0Var3.c()) {
                            y yVarB2 = q0Var3.b();
                            kotlin.jvm.internal.n.e(yVarB2, "substitutedArgument.type");
                            if (!y0.c(yVarB2, tm.a.f51588f, null)) {
                            }
                        }
                        i11 = i13;
                    }
                    return new r0(q0Var.a(), c0VarU);
                }
            }
            return q0Var;
        }
        if (q0Var2.c()) {
            kotlin.jvm.internal.n.c(m0Var);
            return y0.j(m0Var);
        }
        a1 a1VarB0 = q0Var2.b().b0();
        int iA = q0Var2.a();
        d5.u.u(iA, "argument.projectionKind");
        int iA2 = q0Var.a();
        d5.u.u(iA2, "underlyingProjection.projectionKind");
        if (iA2 != iA && iA2 != 1 && iA == 1) {
            iA = iA2;
        }
        if (m0Var == null || (iV = m0Var.v()) == 0) {
            iV = 1;
        }
        if (iV != iA && iV != 1 && iA == 1) {
            iA = 1;
        }
        a(yVarB.getAnnotations(), a1VarB0.getAnnotations());
        c0 c0VarI = y0.i(c.b(a1VarB0), yVarB.Q());
        j0 j0VarM = yVarB.M();
        if (!c.j(c0VarI)) {
            if (c.j(c0VarI)) {
                j0VarM = c0VarI.M();
            } else {
                j0 other = c0VarI.M();
                j0VarM.getClass();
                s1 s1Var = j0.f48443b;
                kotlin.jvm.internal.n.f(other, "other");
                if (!j0VarM.isEmpty() || !other.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    Collection collectionValues = ((ConcurrentHashMap) s1Var.f45751b).values();
                    kotlin.jvm.internal.n.e(collectionValues, "idPerType.values");
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        i iVar = (i) j0VarM.f52661a.get(iIntValue);
                        i iVar2 = (i) other.f52661a.get(iIntValue);
                        if (iVar != null) {
                            if (iVar2 != null) {
                                iVar = new i(q1.g(iVar.f48438a, iVar2.f48438a));
                            }
                            iVar2 = iVar;
                        } else if (iVar2 == null) {
                            iVar2 = null;
                        } else if (iVar != null) {
                            iVar2 = new i(q1.g(iVar2.f48438a, iVar.f48438a));
                        }
                        ym.l.a(arrayList2, iVar2);
                    }
                    j0VarM = s1.g(arrayList2);
                }
            }
            c0VarI = c.q(c0VarI, null, j0VarM, 1);
        }
        return new r0(iA, c0VarI);
    }

    public c0 u(c0 c0Var, zc.u uVar, int i10) {
        n0 n0VarP = c0Var.P();
        List listT = c0Var.t();
        ArrayList arrayList = new ArrayList(xj.p.W(listT, 10));
        int i11 = 0;
        for (Object obj : listT) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                xj.o.V();
                throw null;
            }
            q0 q0Var = (q0) obj;
            q0 q0VarI = i(q0Var, uVar, (zk.m0) n0VarP.getParameters().get(i11), i10 + 1);
            if (!q0VarI.c()) {
                q0VarI = new r0(q0VarI.a(), y0.h(q0VarI.b(), q0Var.b().Q()));
            }
            arrayList.add(q0VarI);
            i11 = i12;
        }
        return c.q(c0Var, arrayList, null, 2);
    }
}
