package kotlin.reflect.jvm.internal.impl.platform;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes7.dex */
public class TargetPlatform implements Collection<SimplePlatform>, KMappedMarker {
    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(SimplePlatform simplePlatform) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends SimplePlatform> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof SimplePlatform)) {
            return false;
        }
        SimplePlatform element = (SimplePlatform) obj;
        Intrinsics.f(element, "element");
        throw null;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        Intrinsics.f(elements, "elements");
        throw null;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TargetPlatform)) {
            return false;
        }
        ((TargetPlatform) obj).getClass();
        return true;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        throw null;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        throw null;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        throw null;
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
    public final boolean removeIf(Predicate<? super SimplePlatform> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        throw null;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return CollectionToArray.a(this);
    }

    public final String toString() {
        CollectionsKt.D(null, "/", null, null, null, 62);
        throw null;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        Intrinsics.f(array, "array");
        return CollectionToArray.b(this, array);
    }
}
