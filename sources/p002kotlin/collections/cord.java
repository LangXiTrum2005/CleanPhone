package p002kotlin.collections;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.rotuma;

/* JADX INFO: compiled from: MutableCollections.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\n\u001a-\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0007¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\r\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\r\u0010\u0006\u001a1\u0010\u0011\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0004\b\u0011\u0010\u0012\u001a;\u0010\u0014\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001f\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a!\u0010\u0019\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u0018\u001a\u001f\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0007¢\u0006\u0004\b\u001a\u0010\u0018\u001a!\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0007¢\u0006\u0004\b\u001b\u0010\u0018\u001a1\u0010\u001c\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00162\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0004\b\u001c\u0010\u001d\u001a;\u0010\u001e\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00162\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "", "elements", "", "stratoscope", "(Ljava/util/Collection;Ljava/lang/Iterable;)Z", "", "trm", "(Ljava/util/Collection;[Ljava/lang/Object;)Z", "", "oilcan", "(Ljava/lang/Iterable;)Ljava/util/Collection;", "grimness", "", "Lkotlin/Function1;", "predicate", "seminary", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Z", "predicateResultToRemove", "yemenite", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;Z)Z", "", "supplicat", "(Ljava/util/List;)Ljava/lang/Object;", "restrictive", "merc", "polder", "kattegat", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z", "sealless", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Z)Z", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
public class cord extends preprohormone {
    public static final <T> boolean grimness(Collection<? super T> collection2, Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection2, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return collection2.retainAll(oilcan(elements));
    }

    public static <T> boolean kattegat(List<T> list, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return sealless(list, predicate, true);
    }

    public static <T> T merc(List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(adultoid.triweekly(list));
    }

    public static final <T> Collection<T> oilcan(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? (Collection) iterable : CollectionsKt___CollectionsKt.molet(iterable);
    }

    public static <T> T polder(List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(adultoid.triweekly(list));
    }

    public static <T> T restrictive(List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static final <T> boolean sealless(List<T> list, Function1<? super T, Boolean> function1, boolean z) {
        int i;
        if (!(list instanceof RandomAccess)) {
            Intrinsics.competently(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return yemenite(rotuma.saneness(list), function1, z);
        }
        int iTriweekly = adultoid.triweekly(list);
        if (iTriweekly >= 0) {
            int i2 = 0;
            i = 0;
            while (true) {
                T t = list.get(i2);
                if (function1.invoke(t).booleanValue() != z) {
                    if (i != i2) {
                        list.set(i, t);
                    }
                    i++;
                }
                if (i2 == iTriweekly) {
                    break;
                }
                i2++;
            }
        } else {
            i = 0;
        }
        if (i >= list.size()) {
            return false;
        }
        int iTriweekly2 = adultoid.triweekly(list);
        if (i > iTriweekly2) {
            return true;
        }
        while (true) {
            list.remove(iTriweekly2);
            if (iTriweekly2 == i) {
                return true;
            }
            iTriweekly2--;
        }
    }

    public static <T> boolean seminary(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return yemenite(iterable, predicate, false);
    }

    public static <T> boolean stratoscope(Collection<? super T> collection2, Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection2, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements instanceof Collection) {
            return collection2.addAll((Collection) elements);
        }
        Iterator<? extends T> it = elements.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection2.add(it.next())) {
                z = true;
            }
        }
        return z;
    }

    public static <T> T supplicat(List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    public static <T> boolean trm(Collection<? super T> collection2, T[] elements) {
        Intrinsics.checkNotNullParameter(collection2, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return collection2.addAll(arytenoidectomy.wireman(elements));
    }

    public static final <T> boolean yemenite(Iterable<? extends T> iterable, Function1<? super T, Boolean> function1, boolean z) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (function1.invoke(it.next()).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }
}
