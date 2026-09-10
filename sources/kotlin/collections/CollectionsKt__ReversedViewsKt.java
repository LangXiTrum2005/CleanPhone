package kotlin.collections;

import android.support.v4.media.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
class CollectionsKt__ReversedViewsKt extends CollectionsKt__MutableCollectionsKt {
    public static final int c(int i2, List list) {
        if (i2 >= 0 && i2 <= CollectionsKt.A(list)) {
            return CollectionsKt.A(list) - i2;
        }
        StringBuilder sbU = a.u(i2, "Element index ", " must be in range [");
        sbU.append(new IntRange(0, CollectionsKt.A(list), 1));
        sbU.append("].");
        throw new IndexOutOfBoundsException(sbU.toString());
    }

    public static final int d(int i2, List list) {
        if (i2 >= 0 && i2 <= list.size()) {
            return list.size() - i2;
        }
        StringBuilder sbU = a.u(i2, "Position index ", " must be in range [");
        sbU.append(new IntRange(0, list.size(), 1));
        sbU.append("].");
        throw new IndexOutOfBoundsException(sbU.toString());
    }
}
