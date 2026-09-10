package kotlin.jvm.internal;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/jvm/internal/ArrayIterator;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ArrayIterator<T> implements Iterator<T>, KMappedMarker {
    public final Object[] X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f43323Y;

    public ArrayIterator(Object[] array) {
        Intrinsics.f(array, "array");
        this.X = array;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f43323Y < this.X.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            Object[] objArr = this.X;
            int i2 = this.f43323Y;
            this.f43323Y = i2 + 1;
            return objArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f43323Y--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
