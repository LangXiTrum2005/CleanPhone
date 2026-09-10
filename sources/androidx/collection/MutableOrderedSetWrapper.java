package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableSet;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/collection/MutableOrderedSetWrapper;", "E", "Landroidx/collection/OrderedSetWrapper;", "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class MutableOrderedSetWrapper<E> extends OrderedSetWrapper<E> implements Set<E>, KMutableSet {

    /* JADX INFO: renamed from: androidx.collection.MutableOrderedSetWrapper$iterator$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010)\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/collection/MutableOrderedSetWrapper$iterator$1", "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class AnonymousClass1 implements Iterator<Object>, KMutableIterator {
        public final int X = -1;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Iterator f3753Y;

        public AnonymousClass1() {
            this.f3753Y = SequencesKt.m(new MutableOrderedSetWrapper$iterator$1$iterator$1(MutableOrderedSetWrapper.this, this, null));
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f3753Y.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            return this.f3753Y.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (this.X == -1) {
                return;
            }
            MutableOrderedSetWrapper.this.getClass();
            throw null;
        }
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw null;
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public final boolean addAll(Collection elements) {
        Intrinsics.f(elements, "elements");
        throw null;
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public final void clear() {
        throw null;
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new AnonymousClass1();
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        throw null;
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public final boolean removeAll(Collection elements) {
        Intrinsics.f(elements, "elements");
        throw null;
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public final boolean retainAll(Collection elements) {
        Intrinsics.f(elements, "elements");
        throw null;
    }
}
