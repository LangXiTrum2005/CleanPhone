package p002kotlin.collections;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: _Sets.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0006\u001a.\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a4\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a.\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\t\u0010\u0004\u001a4\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\u0002¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "element", "cutely", "(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;", "", "elements", "taiyuan", "(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;", "formularize", "apical", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/collections/SetsKt")
public class starveling extends creditor {
    public static <T> Set<T> apical(Set<? extends T> set, Iterable<? extends T> elements) {
        int size;
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Integer numRotuma = dovishness.rotuma(elements);
        if (numRotuma != null) {
            size = set.size() + numRotuma.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(polder.marial(size));
        linkedHashSet.addAll(set);
        cord.stratoscope(linkedHashSet, elements);
        return linkedHashSet;
    }

    public static <T> Set<T> cutely(Set<? extends T> set, T t) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(polder.marial(set.size()));
        boolean z = false;
        for (T t2 : set) {
            boolean z2 = true;
            if (!z && Intrinsics.wireman(t2, t)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(t2);
            }
        }
        return linkedHashSet;
    }

    public static <T> Set<T> formularize(Set<? extends T> set, T t) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(polder.marial(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t);
        return linkedHashSet;
    }

    public static <T> Set<T> taiyuan(Set<? extends T> set, Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<?> collectionOilcan = cord.oilcan(elements);
        if (collectionOilcan.isEmpty()) {
            return CollectionsKt___CollectionsKt.prefect(set);
        }
        if (!(collectionOilcan instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionOilcan);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (T t : set) {
            if (!((Set) collectionOilcan).contains(t)) {
                linkedHashSet2.add(t);
            }
        }
        return linkedHashSet2;
    }
}
