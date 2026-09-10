package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.StandardClassIds;

/* JADX INFO: loaded from: classes7.dex */
public final class FakePureImplementationsProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f43737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f43738b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f43737a = linkedHashMap;
        b(StandardClassIds.q, a("java.util.ArrayList", "java.util.LinkedList"));
        b(StandardClassIds.r, a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        b(StandardClassIds.s, a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        b(ClassId.j(new FqName("java.util.function.Function")), a("java.util.function.UnaryOperator"));
        b(ClassId.j(new FqName("java.util.function.BiFunction")), a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new Pair(((ClassId) entry.getKey()).b(), ((ClassId) entry.getValue()).b()));
        }
        f43738b = MapsKt.p(arrayList);
    }

    public static ArrayList a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(ClassId.j(new FqName(str)));
        }
        return arrayList;
    }

    public static void b(ClassId classId, ArrayList arrayList) {
        for (Object obj : arrayList) {
            f43737a.put(obj, classId);
        }
    }
}
