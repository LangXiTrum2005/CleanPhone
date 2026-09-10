package kotlin.collections;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Lkotlin/collections/IndexingIterable;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lkotlin/collections/IndexedValue;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IndexingIterable<T> implements Iterable<IndexedValue<? extends T>>, KMappedMarker {
    public final Function0 X;

    public IndexingIterable(Function0 function0) {
        this.X = function0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new IndexingIterator((Iterator) this.X.invoke());
    }
}
