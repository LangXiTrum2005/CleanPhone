package il;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f43077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f43078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f43079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f43080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Set f43081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set f43082f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d0 f43083g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f43084h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final LinkedHashMap f43085i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ArrayList f43086j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final LinkedHashMap f43087k;

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, java.util.Map] */
    static {
        Set<String> setE0 = xj.k.E0(new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(xj.p.W(setE0, 10));
        for (String str : setE0) {
            String strD = gm.c.BOOLEAN.d();
            kotlin.jvm.internal.n.e(strD, "BOOLEAN.desc");
            arrayList.add(m.a("java/util/Collection", str, "Ljava/util/Collection;", strD));
        }
        f43077a = arrayList;
        ArrayList arrayList2 = new ArrayList(xj.p.W(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((d0) it.next()).f43059b);
        }
        f43078b = arrayList2;
        ArrayList arrayList3 = f43077a;
        ArrayList arrayList4 = new ArrayList(xj.p.W(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((d0) it2.next()).f43058a.b());
        }
        String strConcat = "java/util/".concat("Collection");
        gm.c cVar = gm.c.BOOLEAN;
        String strD2 = cVar.d();
        kotlin.jvm.internal.n.e(strD2, "BOOLEAN.desc");
        d0 d0VarA = m.a(strConcat, "contains", "Ljava/lang/Object;", strD2);
        f0 f0Var = f0.f43069d;
        wj.f fVar = new wj.f(d0VarA, f0Var);
        String strConcat2 = "java/util/".concat("Collection");
        String strD3 = cVar.d();
        kotlin.jvm.internal.n.e(strD3, "BOOLEAN.desc");
        wj.f fVar2 = new wj.f(m.a(strConcat2, "remove", "Ljava/lang/Object;", strD3), f0Var);
        String strConcat3 = "java/util/".concat("Map");
        String strD4 = cVar.d();
        kotlin.jvm.internal.n.e(strD4, "BOOLEAN.desc");
        wj.f fVar3 = new wj.f(m.a(strConcat3, "containsKey", "Ljava/lang/Object;", strD4), f0Var);
        String strConcat4 = "java/util/".concat("Map");
        String strD5 = cVar.d();
        kotlin.jvm.internal.n.e(strD5, "BOOLEAN.desc");
        wj.f fVar4 = new wj.f(m.a(strConcat4, "containsValue", "Ljava/lang/Object;", strD5), f0Var);
        String strConcat5 = "java/util/".concat("Map");
        String strD6 = cVar.d();
        kotlin.jvm.internal.n.e(strD6, "BOOLEAN.desc");
        wj.f fVar5 = new wj.f(m.a(strConcat5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", strD6), f0Var);
        wj.f fVar6 = new wj.f(m.a("java/util/".concat("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), f0.f43070e);
        d0 d0VarA2 = m.a("java/util/".concat("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        f0 f0Var2 = f0.f43067b;
        wj.f fVar7 = new wj.f(d0VarA2, f0Var2);
        wj.f fVar8 = new wj.f(m.a("java/util/".concat("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), f0Var2);
        String strConcat6 = "java/util/".concat("List");
        gm.c cVar2 = gm.c.INT;
        String strD7 = cVar2.d();
        kotlin.jvm.internal.n.e(strD7, "INT.desc");
        d0 d0VarA3 = m.a(strConcat6, "indexOf", "Ljava/lang/Object;", strD7);
        f0 f0Var3 = f0.f43068c;
        wj.f fVar9 = new wj.f(d0VarA3, f0Var3);
        String strConcat7 = "java/util/".concat("List");
        String strD8 = cVar2.d();
        kotlin.jvm.internal.n.e(strD8, "INT.desc");
        Map mapQ = xj.b0.Q(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, new wj.f(m.a(strConcat7, "lastIndexOf", "Ljava/lang/Object;", strD8), f0Var3));
        f43079c = mapQ;
        LinkedHashMap linkedHashMap = new LinkedHashMap(xj.b0.O(mapQ.size()));
        for (Map.Entry entry : mapQ.entrySet()) {
            linkedHashMap.put(((d0) entry.getKey()).f43059b, entry.getValue());
        }
        f43080d = linkedHashMap;
        LinkedHashSet linkedHashSetV0 = xj.g0.v0(f43077a, f43079c.keySet());
        ArrayList arrayList5 = new ArrayList(xj.p.W(linkedHashSetV0, 10));
        Iterator it3 = linkedHashSetV0.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((d0) it3.next()).f43058a);
        }
        f43081e = xj.n.R0(arrayList5);
        ArrayList arrayList6 = new ArrayList(xj.p.W(linkedHashSetV0, 10));
        Iterator it4 = linkedHashSetV0.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((d0) it4.next()).f43059b);
        }
        f43082f = xj.n.R0(arrayList6);
        gm.c cVar3 = gm.c.INT;
        String strD9 = cVar3.d();
        kotlin.jvm.internal.n.e(strD9, "INT.desc");
        d0 d0VarA4 = m.a("java/util/List", "removeAt", strD9, "Ljava/lang/Object;");
        f43083g = d0VarA4;
        String strConcat8 = "java/lang/".concat("Number");
        String strD10 = gm.c.BYTE.d();
        kotlin.jvm.internal.n.e(strD10, "BYTE.desc");
        wj.f fVar10 = new wj.f(m.a(strConcat8, "toByte", "", strD10), yl.f.e("byteValue"));
        String strConcat9 = "java/lang/".concat("Number");
        String strD11 = gm.c.SHORT.d();
        kotlin.jvm.internal.n.e(strD11, "SHORT.desc");
        wj.f fVar11 = new wj.f(m.a(strConcat9, "toShort", "", strD11), yl.f.e("shortValue"));
        String strConcat10 = "java/lang/".concat("Number");
        String strD12 = cVar3.d();
        kotlin.jvm.internal.n.e(strD12, "INT.desc");
        wj.f fVar12 = new wj.f(m.a(strConcat10, "toInt", "", strD12), yl.f.e("intValue"));
        String strConcat11 = "java/lang/".concat("Number");
        String strD13 = gm.c.LONG.d();
        kotlin.jvm.internal.n.e(strD13, "LONG.desc");
        wj.f fVar13 = new wj.f(m.a(strConcat11, "toLong", "", strD13), yl.f.e("longValue"));
        String strConcat12 = "java/lang/".concat("Number");
        String strD14 = gm.c.FLOAT.d();
        kotlin.jvm.internal.n.e(strD14, "FLOAT.desc");
        wj.f fVar14 = new wj.f(m.a(strConcat12, "toFloat", "", strD14), yl.f.e("floatValue"));
        String strConcat13 = "java/lang/".concat("Number");
        String strD15 = gm.c.DOUBLE.d();
        kotlin.jvm.internal.n.e(strD15, "DOUBLE.desc");
        wj.f fVar15 = new wj.f(m.a(strConcat13, "toDouble", "", strD15), yl.f.e("doubleValue"));
        wj.f fVar16 = new wj.f(d0VarA4, yl.f.e("remove"));
        String strConcat14 = "java/lang/".concat("CharSequence");
        String strD16 = cVar3.d();
        kotlin.jvm.internal.n.e(strD16, "INT.desc");
        String strD17 = gm.c.CHAR.d();
        kotlin.jvm.internal.n.e(strD17, "CHAR.desc");
        Map mapQ2 = xj.b0.Q(fVar10, fVar11, fVar12, fVar13, fVar14, fVar15, fVar16, new wj.f(m.a(strConcat14, "get", strD16, strD17), yl.f.e("charAt")));
        f43084h = mapQ2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(xj.b0.O(mapQ2.size()));
        for (Map.Entry entry2 : mapQ2.entrySet()) {
            linkedHashMap2.put(((d0) entry2.getKey()).f43059b, entry2.getValue());
        }
        f43085i = linkedHashMap2;
        Set setKeySet = f43084h.keySet();
        ArrayList arrayList7 = new ArrayList(xj.p.W(setKeySet, 10));
        Iterator it5 = setKeySet.iterator();
        while (it5.hasNext()) {
            arrayList7.add(((d0) it5.next()).f43058a);
        }
        f43086j = arrayList7;
        Set<Map.Entry> setEntrySet = f43084h.entrySet();
        ArrayList<wj.f> arrayList8 = new ArrayList(xj.p.W(setEntrySet, 10));
        for (Map.Entry entry3 : setEntrySet) {
            arrayList8.add(new wj.f(((d0) entry3.getKey()).f43058a, entry3.getValue()));
        }
        int iO = xj.b0.O(xj.p.W(arrayList8, 10));
        if (iO < 16) {
            iO = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iO);
        for (wj.f fVar17 : arrayList8) {
            linkedHashMap3.put((yl.f) fVar17.f53284b, (yl.f) fVar17.f53283a);
        }
        f43087k = linkedHashMap3;
    }
}
