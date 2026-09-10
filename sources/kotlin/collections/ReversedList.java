package kotlin.collections;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableListIterator;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/collections/ReversedList;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/collections/AbstractMutableList;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ReversedList<T> extends AbstractMutableList<T> {
    public final ArrayList X;

    /* JADX INFO: renamed from: kotlin.collections.ReversedList$listIterator$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010+\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlin/collections/ReversedList$listIterator$1", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class AnonymousClass1 implements ListIterator<Object>, KMutableListIterator {
        public final ListIterator X;

        public AnonymousClass1(int i2) {
            this.X = ReversedList.this.X.listIterator(CollectionsKt__ReversedViewsKt.d(i2, ReversedList.this));
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            ListIterator listIterator = this.X;
            listIterator.add(obj);
            listIterator.previous();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.X.hasPrevious();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.X.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            return this.X.previous();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return CollectionsKt.A(ReversedList.this) - this.X.previousIndex();
        }

        @Override // java.util.ListIterator
        public final Object previous() {
            return this.X.next();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return CollectionsKt.A(ReversedList.this) - this.X.nextIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            this.X.remove();
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            this.X.set(obj);
        }
    }

    public ReversedList(ArrayList arrayList) {
        this.X = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        this.X.add(CollectionsKt__ReversedViewsKt.d(i2, this), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.X.clear();
    }

    @Override // kotlin.collections.AbstractMutableList
    /* JADX INFO: renamed from: d */
    public final int getF43279Y() {
        return this.X.size();
    }

    @Override // kotlin.collections.AbstractMutableList
    public final Object e(int i2) {
        return this.X.remove(CollectionsKt__ReversedViewsKt.c(i2, this));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        return this.X.get(CollectionsKt__ReversedViewsKt.c(i2, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new AnonymousClass1(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new AnonymousClass1(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        return this.X.set(CollectionsKt__ReversedViewsKt.c(i2, this), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i2) {
        return new AnonymousClass1(i2);
    }
}
