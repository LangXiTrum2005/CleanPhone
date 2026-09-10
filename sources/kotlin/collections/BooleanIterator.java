package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0000\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlin/collections/BooleanIterator;", "", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BooleanIterator implements Iterator<Boolean>, KMappedMarker {
    public abstract boolean a();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Boolean next() {
        return Boolean.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
