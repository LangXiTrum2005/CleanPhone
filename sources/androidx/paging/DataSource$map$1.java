package androidx.paging;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003\"\b\b\u0002\u0010\u0005*\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "ToValue", "", "Key", "Value", "list", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class DataSource$map$1 extends Lambda implements Function1<List<Object>, List<Object>> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list = (List) obj;
        Intrinsics.f(list, "list");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.n(list2, 10));
        Iterator it = list2.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        it.next();
        throw null;
    }
}
