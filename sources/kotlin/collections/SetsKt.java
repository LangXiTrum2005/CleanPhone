package kotlin.collections;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.builders.MapBuilder;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"kotlin/collections/SetsKt__SetsJVMKt", "kotlin/collections/SetsKt__SetsKt", "kotlin/collections/SetsKt___SetsKt"}, k = 4, mv = {2, 1, 0}, xi = 49)
public final class SetsKt extends SetsKt___SetsKt {
    public static SetBuilder a(SetBuilder setBuilder) {
        MapBuilder mapBuilder = setBuilder.X;
        mapBuilder.d();
        return mapBuilder.j0 > 0 ? setBuilder : SetBuilder.f43287Y;
    }

    public static HashSet b(Object... objArr) {
        HashSet hashSet = new HashSet(MapsKt.h(objArr.length));
        ArraysKt___ArraysKt.c(objArr, hashSet);
        return hashSet;
    }

    public static LinkedHashSet c(Object... elements) {
        Intrinsics.f(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.h(elements.length));
        ArraysKt___ArraysKt.c(elements, linkedHashSet);
        return linkedHashSet;
    }

    public static LinkedHashSet d(Set set, Serializable serializable) {
        Intrinsics.f(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.h(set.size()));
        boolean z2 = false;
        for (Object obj : set) {
            boolean z3 = true;
            if (!z2 && Intrinsics.a(obj, serializable)) {
                z2 = true;
                z3 = false;
            }
            if (z3) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static LinkedHashSet e(Object... elements) {
        Intrinsics.f(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.h(elements.length));
        ArraysKt___ArraysKt.c(elements, linkedHashSet);
        return linkedHashSet;
    }

    public static LinkedHashSet f(Set set, Iterable elements) {
        int size;
        Intrinsics.f(set, "<this>");
        Intrinsics.f(elements, "elements");
        Integer numValueOf = elements instanceof Collection ? Integer.valueOf(((Collection) elements).size()) : null;
        if (numValueOf != null) {
            size = set.size() + numValueOf.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.h(size));
        linkedHashSet.addAll(set);
        CollectionsKt.g(elements, linkedHashSet);
        return linkedHashSet;
    }

    public static LinkedHashSet g(Set set, Object obj) {
        Intrinsics.f(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.h(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static Set h(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        Intrinsics.e(setSingleton, "singleton(...)");
        return setSingleton;
    }
}
