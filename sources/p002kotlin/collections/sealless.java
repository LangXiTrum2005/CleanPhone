package p002kotlin.collections;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import unready.attabal;

/* JADX INFO: compiled from: Iterators.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lkotlin/collections/sealless;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lkotlin/collections/IndexedValue;", "iterator", "<init>", "(Ljava/util/Iterator;)V", "", "hasNext", "()Z", "saneness", "()Lkotlin/collections/IndexedValue;", "kowloon", "Ljava/util/Iterator;", "", "arytenoidectomy", "I", "index", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class sealless<T> implements Iterator<IndexedValue<? extends T>>, attabal {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public int index;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final Iterator<T> iterator;

    /* JADX WARN: Multi-variable type inference failed */
    public sealless(Iterator<? extends T> iterator) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        this.iterator = iterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public final IndexedValue<T> next() {
        int i = this.index;
        this.index = i + 1;
        if (i < 0) {
            adultoid.dovishness();
        }
        return new IndexedValue<>(i, this.iterator.next());
    }
}
