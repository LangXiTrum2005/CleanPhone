package kotlin;

import com.p004ironsource.d9;
import java.util.Arrays;
import java.util.Collection;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u0088\u0001\u0004\u0092\u0001\u00020\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/UIntArray;", "", "Lkotlin/UInt;", "Iterator", d9.a.k, "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@JvmInline
public final class UIntArray implements Collection<UInt>, KMappedMarker {
    public final int[] X;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlin/UIntArray$Iterator;", "", "Lkotlin/UInt;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Iterator implements java.util.Iterator<UInt>, KMappedMarker {
        public final int[] X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f43257Y;

        public Iterator(int[] array) {
            Intrinsics.f(array, "array");
            this.X = array;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f43257Y < this.X.length;
        }

        @Override // java.util.Iterator
        public final UInt next() {
            int i2 = this.f43257Y;
            int[] iArr = this.X;
            if (i2 >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f43257Y));
            }
            this.f43257Y = i2 + 1;
            return new UInt(iArr[i2]);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(UInt uInt) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends UInt> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof UInt)) {
            return false;
        }
        return ArraysKt.i(this.X, ((UInt) obj).X);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        Intrinsics.f(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof UInt)) {
                return false;
            }
            if (!ArraysKt.i(this.X, ((UInt) obj).X)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof UIntArray) {
            return Intrinsics.a(this.X, ((UIntArray) obj).X);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.X);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.X.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new Iterator(this.X);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.X.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return CollectionToArray.a(this);
    }

    public final String toString() {
        return "UIntArray(storage=" + Arrays.toString(this.X) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        Intrinsics.f(array, "array");
        return CollectionToArray.b(this, array);
    }
}
