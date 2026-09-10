package xj;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import qk.i0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g0 extends i0 {
    public static HashSet t0(Object... objArr) {
        HashSet hashSet = new HashSet(b0.O(objArr.length));
        k.A0(objArr, hashSet);
        return hashSet;
    }

    public static LinkedHashSet u0(Set set, Serializable serializable) {
        kotlin.jvm.internal.n.f(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(b0.O(set.size()));
        boolean z10 = false;
        for (Object obj : set) {
            boolean z11 = true;
            if (!z10 && kotlin.jvm.internal.n.a(obj, serializable)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static LinkedHashSet v0(Iterable elements, Set set) {
        int size;
        kotlin.jvm.internal.n.f(set, "<this>");
        kotlin.jvm.internal.n.f(elements, "elements");
        Integer numValueOf = elements instanceof Collection ? Integer.valueOf(((Collection) elements).size()) : null;
        if (numValueOf != null) {
            size = set.size() + numValueOf.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(b0.O(size));
        linkedHashSet.addAll(set);
        t.a0(elements, linkedHashSet);
        return linkedHashSet;
    }

    public static LinkedHashSet w0(Set set, Object obj) {
        kotlin.jvm.internal.n.f(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(b0.O(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
