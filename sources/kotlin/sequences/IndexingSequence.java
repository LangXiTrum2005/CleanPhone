package kotlin.sequences;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Lkotlin/sequences/IndexingSequence;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/sequences/Sequence;", "Lkotlin/collections/IndexedValue;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IndexingSequence<T> implements Sequence<IndexedValue<? extends T>> {

    /* JADX INFO: renamed from: kotlin.sequences.IndexingSequence$iterator$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001¨\u0006\u0003"}, d2 = {"kotlin/sequences/IndexingSequence$iterator$1", "", "Lkotlin/collections/IndexedValue;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class AnonymousClass1 implements Iterator<IndexedValue<Object>>, KMappedMarker {
        public int X;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            throw null;
        }

        @Override // java.util.Iterator
        public final IndexedValue<Object> next() {
            int i2 = this.X;
            this.X = i2 + 1;
            if (i2 >= 0) {
                throw null;
            }
            CollectionsKt.f0();
            throw null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        throw null;
    }
}
