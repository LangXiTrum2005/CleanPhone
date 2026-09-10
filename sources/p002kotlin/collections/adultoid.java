package p002kotlin.collections;

import com.google.android.gms.ads.RequestConfiguration;
import frenchy.saneness;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.ranges.IntRange;

/* JADX INFO: compiled from: Collections.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a1\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00002\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\u000e\u0010\f\u001a7\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u00002\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0000*\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a5\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0000*\u00020\u00132\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0001\"\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0017\u0010\f\u001a%\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001aG\u0010\u001e\u001a\u00020\u001b\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001a*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00072\b\u0010\u0014\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001f\u001a'\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\"\u0010#\u001a\u000f\u0010$\u001a\u00020!H\u0001¢\u0006\u0004\b$\u0010%\u001a\u000f\u0010&\u001a\u00020!H\u0001¢\u0006\u0004\b&\u0010%\"\u0019\u0010*\u001a\u00020'*\u0006\u0012\u0002\b\u00030\u00048F¢\u0006\u0006\u001a\u0004\b(\u0010)\"!\u0010-\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00078F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "", "isVarargs", "", "impromptu", "([Ljava/lang/Object;Z)Ljava/util/Collection;", "", "formularize", "()Ljava/util/List;", "elements", "kowloon", "([Ljava/lang/Object;)Ljava/util/List;", "", "polloi", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "competently", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "", "element", "arytenoidectomy", "(Ljava/lang/Object;)Ljava/util/List;", "monoploid", "molybdenite", "(Ljava/util/List;)Ljava/util/List;", "", "", "fromIndex", "toIndex", "cutely", "(Ljava/util/List;Ljava/lang/Comparable;II)I", "size", "", "graveside", "(III)V", "dovishness", "()V", "adultoid", "Lkotlin/ranges/IntRange;", "impassible", "(Ljava/util/Collection;)Lkotlin/ranges/IntRange;", "indices", "triweekly", "(Ljava/util/List;)I", "lastIndex", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
public class adultoid extends graveside {
    public static void adultoid() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static /* synthetic */ int apical(List list, Comparable comparable, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        return cutely(list, comparable, i, i2);
    }

    public static <T> List<T> arytenoidectomy(T t) {
        return t != null ? graveside.marial(t) : formularize();
    }

    public static <T> ArrayList<T> competently(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? new ArrayList<>() : new ArrayList<>(impromptu(elements, true));
    }

    public static final <T extends Comparable<? super T>> int cutely(List<? extends T> list, T t, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        graveside(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int iWireman = saneness.wireman(list.get(i4), t);
            if (iWireman < 0) {
                i = i4 + 1;
            } else {
                if (iWireman <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    public static void dovishness() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static <T> List<T> formularize() {
        return EmptyList.INSTANCE;
    }

    public static final void graveside(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException("fromIndex (" + i2 + ") is greater than toIndex (" + i3 + ").");
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i2 + ") is less than zero.");
        }
        if (i3 <= i) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + i + ").");
    }

    public static IntRange impassible(Collection<?> collection2) {
        Intrinsics.checkNotNullParameter(collection2, "<this>");
        return new IntRange(0, collection2.size() - 1);
    }

    public static final <T> Collection<T> impromptu(T[] tArr, boolean z) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return new formularize(tArr, z);
    }

    public static <T> List<T> kowloon(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length > 0 ? arytenoidectomy.wireman(elements) : formularize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> molybdenite(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : graveside.marial(list.get(0));
        }
        return formularize();
    }

    public static <T> List<T> monoploid(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return polloi.saran(elements);
    }

    public static <T> List<T> polloi(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(impromptu(elements, true));
    }

    public static /* synthetic */ Collection taiyuan(Object[] objArr, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return impromptu(objArr, z);
    }

    public static <T> int triweekly(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.size() - 1;
    }
}
