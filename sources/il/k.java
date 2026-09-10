package il;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f43089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f43090b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f43089a = linkedHashMap;
        b(yl.i.f54539q, a("java.util.ArrayList", "java.util.LinkedList"));
        b(yl.i.f54540r, a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        b(yl.i.f54541s, a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        b(yl.b.j(new yl.c("java.util.function.Function")), a("java.util.function.UnaryOperator"));
        b(yl.b.j(new yl.c("java.util.function.BiFunction")), a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new wj.f(((yl.b) entry.getKey()).b(), ((yl.b) entry.getValue()).b()));
        }
        f43090b = xj.b0.W(arrayList);
    }

    public static ArrayList a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(yl.b.j(new yl.c(str)));
        }
        return arrayList;
    }

    public static void b(yl.b bVar, ArrayList arrayList) {
        for (Object obj : arrayList) {
            f43089a.put(obj, bVar);
        }
    }
}
