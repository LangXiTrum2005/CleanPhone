package kotlin.collections;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
class CollectionsKt__CollectionsKt extends CollectionsKt__CollectionsJVMKt {
    public static final List a(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : CollectionsKt.H(list.get(0));
        }
        return EmptyList.X;
    }
}
