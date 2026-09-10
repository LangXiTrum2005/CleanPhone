package il;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f43050c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f43051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f43052b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (a aVar : a.values()) {
            String str = aVar.f43039a;
            if (linkedHashMap.get(str) == null) {
                linkedHashMap.put(str, aVar);
            }
        }
        f43050c = linkedHashMap;
    }

    public c(u javaTypeEnhancementState) {
        kotlin.jvm.internal.n.f(javaTypeEnhancementState, "javaTypeEnhancementState");
        this.f43051a = javaTypeEnhancementState;
        this.f43052b = new ConcurrentHashMap();
    }

    public static ArrayList a(Object obj, boolean z10) {
        al.c cVar = (al.c) obj;
        kotlin.jvm.internal.n.f(cVar, "<this>");
        Map mapD = cVar.d();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapD.entrySet()) {
            xj.t.a0((!z10 || kotlin.jvm.internal.n.a((yl.f) entry.getKey(), y.f43121b)) ? j((dm.g) entry.getValue()) : xj.v.f53866a, arrayList);
        }
        return arrayList;
    }

    public static Object c(Object obj, yl.c cVar) {
        for (Object obj2 : e(obj)) {
            if (kotlin.jvm.internal.n.a(d(obj2), cVar)) {
                return obj2;
            }
        }
        return null;
    }

    public static yl.c d(Object obj) {
        al.c cVar = (al.c) obj;
        kotlin.jvm.internal.n.f(cVar, "<this>");
        return cVar.e();
    }

    public static Iterable e(Object obj) {
        al.j annotations;
        al.c cVar = (al.c) obj;
        kotlin.jvm.internal.n.f(cVar, "<this>");
        zk.e eVarD = fm.e.d(cVar);
        return (eVarD == null || (annotations = eVarD.getAnnotations()) == null) ? xj.v.f53866a : annotations;
    }

    public static boolean f(Object obj, yl.c cVar) {
        Iterable iterableE = e(obj);
        if ((iterableE instanceof Collection) && ((Collection) iterableE).isEmpty()) {
            return false;
        }
        Iterator it = iterableE.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.n.a(d(it.next()), cVar)) {
                return true;
            }
        }
        return false;
    }

    public static List j(dm.g gVar) {
        if (!(gVar instanceof dm.b)) {
            return gVar instanceof dm.i ? j1.f.C(((dm.i) gVar).f38955c.c()) : xj.v.f53866a;
        }
        Iterable iterable = (Iterable) ((dm.b) gVar).f38953a;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            xj.t.a0(j((dm.g) it.next()), arrayList);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0088  */
    /* JADX WARN: Code duplicated, block: B:74:0x0127  */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.util.Map] */
    public final v b(v vVar, al.j annotations) {
        boolean z10;
        n nVar;
        c0 c0VarH;
        n nVar2;
        Object objC;
        Object next;
        wj.f fVar;
        ql.h hVarG;
        kotlin.jvm.internal.n.f(annotations, "annotations");
        u uVar = this.f43051a;
        if (!uVar.f43112b) {
            ArrayList<n> arrayList = new ArrayList();
            Iterator it = annotations.iterator();
            while (true) {
                z10 = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next2 = it.next();
                boolean z11 = uVar.f43112b;
                c0 c0Var = c0.IGNORE;
                c0 c0Var2 = c0.WARN;
                n nVar3 = null;
                if (z11 || (nVar = (n) b.f43048g.get(d(next2))) == null) {
                    nVar2 = null;
                } else {
                    yl.c cVarD = d(next2);
                    if (cVarD == null || !b.f43047f.containsKey(cVarD)) {
                        c0VarH = h(next2);
                        if (c0VarH == null) {
                            c0VarH = uVar.f43111a.f43114a;
                        }
                    } else {
                        c0VarH = (c0) t.f43109b.invoke(cVarD);
                    }
                    if (c0VarH == c0Var) {
                        c0VarH = null;
                    }
                    if (c0VarH == null) {
                        nVar2 = null;
                    } else {
                        ql.h hVarA = ql.h.a(nVar.f43092a, null, c0VarH == c0Var2, 1);
                        Collection qualifierApplicabilityTypes = nVar.f43093b;
                        boolean z12 = nVar.f43094c;
                        kotlin.jvm.internal.n.f(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
                        nVar2 = new n(hVarA, qualifierApplicabilityTypes, z12);
                    }
                }
                if (nVar2 != null) {
                    nVar3 = nVar2;
                } else {
                    if (uVar.f43111a.f43117d || (objC = c(next2, b.f43044c)) == null) {
                        fVar = null;
                    } else {
                        Iterator it2 = e(next2).iterator();
                        do {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                        } while (i(next) == null);
                        if (next == null) {
                            fVar = null;
                        } else {
                            ArrayList arrayListA = a(objC, true);
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Iterator it3 = arrayListA.iterator();
                            while (it3.hasNext()) {
                                a aVar = (a) f43050c.get((String) it3.next());
                                if (aVar != null) {
                                    linkedHashSet.add(aVar);
                                }
                            }
                            if (linkedHashSet.contains(a.TYPE_USE)) {
                                linkedHashSet = xj.g0.v0(linkedHashSet, xj.g0.u0(xj.k.E0(a.values()), a.TYPE_PARAMETER_BOUNDS));
                            }
                            fVar = new wj.f(next, linkedHashSet);
                        }
                    }
                    if (fVar != null) {
                        Object extractNullability = fVar.f53283a;
                        Set set = (Set) fVar.f53284b;
                        c0 c0VarH2 = h(next2);
                        if (c0VarH2 == null && (c0VarH2 = h(extractNullability)) == null) {
                            c0VarH2 = uVar.f43111a.f43114a;
                        }
                        if (c0VarH2 != c0Var) {
                            kotlin.jvm.internal.n.f(extractNullability, "$this$extractNullability");
                            ql.h hVarG2 = g(extractNullability, false);
                            if (hVarG2 == null) {
                                Object objI = i(extractNullability);
                                if (objI != null) {
                                    c0 c0VarH3 = h(extractNullability);
                                    if (c0VarH3 == null) {
                                        c0VarH3 = uVar.f43111a.f43114a;
                                    }
                                    if (c0VarH3 == c0Var || (hVarG = g(objI, false)) == null) {
                                        hVarG2 = null;
                                    } else {
                                        hVarG2 = ql.h.a(hVarG, null, c0VarH3 == c0Var2, 1);
                                    }
                                } else {
                                    hVarG2 = null;
                                }
                            }
                            if (hVarG2 != null) {
                                nVar3 = new n(ql.h.a(hVarG2, null, c0VarH2 == c0Var2, 1), set);
                            }
                        }
                    }
                }
                if (nVar3 != null) {
                    arrayList.add(nVar3);
                }
            }
            if (!arrayList.isEmpty()) {
                EnumMap enumMap = vVar != null ? new EnumMap(vVar.f43113a) : new EnumMap(a.class);
                for (n nVar4 : arrayList) {
                    Iterator it4 = nVar4.f43093b.iterator();
                    while (it4.hasNext()) {
                        enumMap.put((a) it4.next(), nVar4);
                        z10 = true;
                    }
                }
                if (z10) {
                    return new v(enumMap);
                }
            }
        }
        return vVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
    
        if (r9.equals("ALWAYS") != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008f, code lost:
    
        if (r9.equals("UNKNOWN") == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0098, code lost:
    
        if (r9.equals("NEVER") == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a1, code lost:
    
        if (r9.equals("MAYBE") == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c6, code lost:
    
        if (r0.equals(il.z.f43147m) != false) goto L57;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ql.h g(java.lang.Object r9, boolean r10) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: il.c.g(java.lang.Object, boolean):ql.h");
    }

    public final c0 h(Object obj) {
        String str;
        u uVar = this.f43051a;
        c0 c0Var = (c0) uVar.f43111a.f43116c.get(d(obj));
        if (c0Var != null) {
            return c0Var;
        }
        Object objC = c(obj, b.f43045d);
        if (objC == null || (str = (String) xj.n.p0(a(objC, false))) == null) {
            return null;
        }
        c0 c0Var2 = uVar.f43111a.f43115b;
        if (c0Var2 != null) {
            return c0Var2;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return c0.IGNORE;
            }
            return null;
        }
        if (iHashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return c0.STRICT;
            }
            return null;
        }
        if (iHashCode == 2656902 && str.equals("WARN")) {
            return c0.WARN;
        }
        return null;
    }

    public final Object i(Object annotation) {
        Object objI;
        kotlin.jvm.internal.n.f(annotation, "annotation");
        if (!this.f43051a.f43111a.f43117d) {
            if (xj.n.i0(b.f43049h, d(annotation)) || f(annotation, b.f43043b)) {
                return annotation;
            }
            if (f(annotation, b.f43042a)) {
                zk.e eVarD = fm.e.d((al.c) annotation);
                kotlin.jvm.internal.n.c(eVarD);
                ConcurrentHashMap concurrentHashMap = this.f43052b;
                Object obj = concurrentHashMap.get(eVarD);
                if (obj != null) {
                    return obj;
                }
                Iterator it = e(annotation).iterator();
                do {
                    if (!it.hasNext()) {
                        objI = null;
                        break;
                    }
                    objI = i(it.next());
                } while (objI == null);
                if (objI != null) {
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(eVarD, objI);
                    return objPutIfAbsent == null ? objI : objPutIfAbsent;
                }
            }
        }
        return null;
    }
}
