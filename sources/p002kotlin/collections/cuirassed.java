package p002kotlin.collections;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.ranges.IntRange;

/* JADX INFO: compiled from: ReversedViews.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0002\u001a\u001f\u0010\u0003\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001f\u0010\u0006\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0004\u001a#\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\nH\u0007¢\u0006\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"", "", "index", "walach", "(Ljava/util/List;I)I", "mathsort", "peridotite", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "starveling", "(Ljava/util/List;)Ljava/util/List;", "", "hydrovane", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
public class cuirassed extends cord {
    public static <T> List<T> hydrovane(List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return new grimness(list);
    }

    public static final int mathsort(List<?> list, int i) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        throw new IndexOutOfBoundsException("Position index " + i + " must be in range [" + new IntRange(0, list.size()) + "].");
    }

    public static final int peridotite(List<?> list, int i) {
        return adultoid.triweekly(list) - i;
    }

    public static <T> List<T> starveling(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return new saran(list);
    }

    public static final int walach(List<?> list, int i) {
        if (i >= 0 && i <= adultoid.triweekly(list)) {
            return adultoid.triweekly(list) - i;
        }
        throw new IndexOutOfBoundsException("Element index " + i + " must be in range [" + new IntRange(0, adultoid.triweekly(list)) + "].");
    }
}
