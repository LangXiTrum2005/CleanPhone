package qm;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;
import m0.s1;
import pm.a1;
import pm.c0;
import pm.j0;
import pm.n0;
import pm.x;
import pm.y;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f49202a = new u();

    public static ArrayList a(AbstractCollection abstractCollection, jk.c cVar) {
        ArrayList<c0> arrayList = new ArrayList(abstractCollection);
        Iterator it = arrayList.iterator();
        kotlin.jvm.internal.n.e(it, "filteredTypes.iterator()");
        while (it.hasNext()) {
            c0 upper = (c0) it.next();
            if (!arrayList.isEmpty()) {
                for (c0 lower : arrayList) {
                    if (lower != upper) {
                        kotlin.jvm.internal.n.e(lower, "lower");
                        kotlin.jvm.internal.n.e(upper, "upper");
                        if (((Boolean) cVar.invoke(lower, upper)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, pm.j0, vm.d] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [pm.j0] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, pm.c0, pm.y] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v20, types: [pm.c0] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v4 */
    public final c0 b(ArrayList arrayList) {
        c0 c0Var;
        c0 c0VarB;
        arrayList.size();
        ArrayList<c0> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c0 c0Var2 = (c0) it.next();
            if (c0Var2.P() instanceof x) {
                Collection collectionF = c0Var2.P().f();
                kotlin.jvm.internal.n.e(collectionF, "type.constructor.supertypes");
                Collection<y> collection = collectionF;
                ArrayList arrayList3 = new ArrayList(xj.p.W(collection, 10));
                for (y it2 : collection) {
                    kotlin.jvm.internal.n.e(it2, "it");
                    c0 c0VarZ = pm.c.z(it2);
                    if (c0Var2.Q()) {
                        c0VarZ = c0VarZ.i0(true);
                    }
                    arrayList3.add(c0VarZ);
                }
                arrayList2.addAll(arrayList3);
            } else {
                arrayList2.add(c0Var2);
            }
        }
        Iterator it3 = arrayList2.iterator();
        s sVarA = s.f49196a;
        while (it3.hasNext()) {
            sVarA = sVarA.a((a1) it3.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (c0 c0VarI0 : arrayList2) {
            if (sVarA == s.f49199d) {
                if (c0VarI0 instanceof h) {
                    h hVar = (h) c0VarI0;
                    c0VarI0 = new h(hVar.f49177b, hVar.f49178c, hVar.f49179d, hVar.f49180e, hVar.f49181f, true);
                }
                kotlin.jvm.internal.n.f(c0VarI0, "<this>");
                c0 c0VarP = pm.f.p(c0VarI0, false);
                c0VarI0 = (c0VarP == null && (c0VarP = pm.c.n(c0VarI0)) == null) ? c0VarI0.i0(false) : c0VarP;
            }
            linkedHashSet.add(c0VarI0);
        }
        ArrayList arrayList4 = new ArrayList(xj.p.W(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((c0) it4.next()).M());
        }
        Iterator it5 = arrayList4.iterator();
        if (!it5.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        ?? next = it5.next();
        while (true) {
            c0Var = null;
            if (!it5.hasNext()) {
                break;
            }
            j0 other = (j0) it5.next();
            next = (j0) next;
            next.getClass();
            s1 s1Var = j0.f48443b;
            kotlin.jvm.internal.n.f(other, "other");
            if (!next.isEmpty() || !other.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                Collection collectionValues = ((ConcurrentHashMap) s1Var.f45751b).values();
                kotlin.jvm.internal.n.e(collectionValues, "idPerType.values");
                Iterator it6 = collectionValues.iterator();
                while (it6.hasNext()) {
                    int iIntValue = ((Number) it6.next()).intValue();
                    pm.i iVar = (pm.i) next.f52661a.get(iIntValue);
                    pm.i iVar2 = (pm.i) other.f52661a.get(iIntValue);
                    if (iVar != null) {
                        if (!kotlin.jvm.internal.n.a(iVar2, iVar)) {
                            iVar = null;
                        }
                        iVar2 = iVar;
                    } else if (iVar2 == null || !kotlin.jvm.internal.n.a(iVar, iVar2)) {
                        iVar2 = null;
                    }
                    ym.l.a(arrayList5, iVar2);
                }
                next = s1.g(arrayList5);
            }
        }
        j0 j0Var = (j0) next;
        if (linkedHashSet.size() == 1) {
            c0VarB = (c0) xj.n.E0(linkedHashSet);
        } else {
            ArrayList arrayListA = a(linkedHashSet, new t(2, 0, this));
            arrayListA.isEmpty();
            if (!arrayListA.isEmpty()) {
                Iterator it7 = arrayListA.iterator();
                if (!it7.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                ?? next2 = it7.next();
                while (it7.hasNext()) {
                    c0 c0Var3 = (c0) it7.next();
                    next2 = (c0) next2;
                    if (next2 != 0 && c0Var3 != null) {
                        n0 n0VarP = next2.P();
                        n0 n0VarP2 = c0Var3.P();
                        boolean z10 = n0VarP instanceof dm.n;
                        if (z10 && (n0VarP2 instanceof dm.n)) {
                            dm.n nVar = new dm.n(xj.n.S0(((dm.n) n0VarP).f38958a, ((dm.n) n0VarP2).f38958a));
                            j0.f48443b.getClass();
                            j0 attributes = j0.f48444c;
                            kotlin.jvm.internal.n.f(attributes, "attributes");
                            next2 = pm.f.s(rm.i.a(2, true, "unknown integer literal type"), v.f53866a, attributes, nVar, false);
                        } else if (z10) {
                            if (((dm.n) n0VarP).f38958a.contains(c0Var3)) {
                                next2 = c0Var3;
                            }
                        } else if (!(n0VarP2 instanceof dm.n) || !((dm.n) n0VarP2).f38958a.contains(next2)) {
                        }
                    }
                    next2 = 0;
                }
                c0Var = (c0) next2;
            }
            if (c0Var != null) {
                c0VarB = c0Var;
            } else {
                k.f49190b.getClass();
                ArrayList arrayListA2 = a(arrayListA, new t(2, 1, j.f49189b));
                arrayListA2.isEmpty();
                c0VarB = arrayListA2.size() < 2 ? (c0) xj.n.E0(arrayListA2) : new x(linkedHashSet).b();
            }
        }
        return c0VarB.m0(j0Var);
    }
}
