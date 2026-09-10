package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes7.dex */
public class UnmodifiableLazyStringList extends AbstractList<String> implements RandomAccess, LazyStringList {
    public final LazyStringArrayList X;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.UnmodifiableLazyStringList$1, reason: invalid class name */
    class AnonymousClass1 implements ListIterator<String> {
        public ListIterator X;

        @Override // java.util.ListIterator
        public final void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.X.hasNext();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.X.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            return (String) this.X.next();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.X.nextIndex();
        }

        @Override // java.util.ListIterator
        public final String previous() {
            return (String) this.X.previous();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.X.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public final void set(String str) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.UnmodifiableLazyStringList$2, reason: invalid class name */
    class AnonymousClass2 implements Iterator<String> {
        public Iterator X;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.X.hasNext();
        }

        @Override // java.util.Iterator
        public final String next() {
            return (String) this.X.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public UnmodifiableLazyStringList(LazyStringArrayList lazyStringArrayList) {
        this.X = lazyStringArrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        return this.X.get(i2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public final ByteString getByteString(int i2) {
        return this.X.getByteString(i2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public final List getUnderlyingElements() {
        return Collections.unmodifiableList(this.X.X);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2();
        anonymousClass2.X = this.X.iterator();
        return anonymousClass2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public final void j(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i2) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        anonymousClass1.X = this.X.listIterator(i2);
        return anonymousClass1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.X.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public final UnmodifiableLazyStringList getUnmodifiableView() {
        return this;
    }
}
