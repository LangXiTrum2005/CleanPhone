package p002kotlin.collections;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.collections.builders.ListBuilder;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CollectionsJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00052\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a1\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a3\u0010\u0018\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00170\u0011\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00112\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "element", "", "marial", "(Ljava/lang/Object;)Ljava/util/List;", "E", "", "dern", "()Ljava/util/List;", "", "capacity", "wireman", "(I)Ljava/util/List;", "builder", "attabal", "(Ljava/util/List;)Ljava/util/List;", "collectionSize", "", "array", "beachfront", "(I[Ljava/lang/Object;)[Ljava/lang/Object;", "", "isVarargs", "", "saneness", "([Ljava/lang/Object;Z)[Ljava/lang/Object;", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
public class graveside {
    public static <E> List<E> attabal(List<E> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return ((ListBuilder) builder).build();
    }

    public static <T> T[] beachfront(int i, T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (i < array.length) {
            array[i] = null;
        }
        return array;
    }

    public static <E> List<E> dern() {
        return new ListBuilder(0, 1, null);
    }

    public static <T> List<T> marial(T t) {
        List<T> listSingletonList = Collections.singletonList(t);
        Intrinsics.checkNotNullExpressionValue(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static final <T> Object[] saneness(T[] tArr, boolean z) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (z && Intrinsics.wireman(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    public static <E> List<E> wireman(int i) {
        return new ListBuilder(i);
    }
}
