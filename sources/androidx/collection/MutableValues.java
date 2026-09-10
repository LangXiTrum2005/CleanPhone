package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableCollection;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/collection/MutableValues;", "K", "V", "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class MutableValues<K, V> implements Collection<V>, KMutableCollection {

    /* JADX INFO: renamed from: androidx.collection.MutableValues$iterator$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010)\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/collection/MutableValues$iterator$1", "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class AnonymousClass1 implements Iterator<Object>, KMutableIterator {
        public final Iterator X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f3757Y = -1;

        public AnonymousClass1(MutableValues mutableValues) {
            this.X = SequencesKt.m(new MutableValues$iterator$1$iterator$1(mutableValues, null));
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.X.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.f3757Y = ((Number) this.X.next()).intValue();
            throw null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (this.f3757Y >= 0) {
                throw null;
            }
        }
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection elements) {
        Intrinsics.f(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        throw null;
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        throw null;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        Intrinsics.f(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next();
        throw null;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        throw null;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new AnonymousClass1(this);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw null;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection elements) {
        Intrinsics.f(elements, "elements");
        throw null;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection elements) {
        Intrinsics.f(elements, "elements");
        throw null;
    }

    @Override // java.util.Collection
    public final int size() {
        throw null;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return CollectionToArray.a(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        Intrinsics.f(array, "array");
        return CollectionToArray.b(this, array);
    }
}
