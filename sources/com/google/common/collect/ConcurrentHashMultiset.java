package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class ConcurrentHashMultiset<E> extends AbstractMultiset<E> implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: com.google.common.collect.ConcurrentHashMultiset$1, reason: invalid class name */
    class AnonymousClass1 extends ForwardingSet<Object> {
        @Override // com.google.common.collect.ForwardingSet
        /* JADX INFO: renamed from: A */
        public final Set w() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (obj == null) {
                return false;
            }
            throw null;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean containsAll(Collection collection) {
            return Collections2.a(this, collection);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            if (obj == null) {
                return false;
            }
            throw null;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            collection.getClass();
            return Sets.h(this, collection);
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final Object w() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        public final Collection x() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ConcurrentHashMultiset$2, reason: invalid class name */
    class AnonymousClass2 extends AbstractIterator<Multiset.Entry<Object>> {
        @Override // com.google.common.collect.AbstractIterator
        public final Object a() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ConcurrentHashMultiset$3, reason: invalid class name */
    class AnonymousClass3 extends ForwardingIterator<Multiset.Entry<Object>> {
        public Multiset.Entry X;

        @Override // com.google.common.collect.ForwardingIterator, java.util.Iterator
        public final Object next() {
            Multiset.Entry entry = (Multiset.Entry) super.next();
            this.X = entry;
            return entry;
        }

        @Override // com.google.common.collect.ForwardingIterator, java.util.Iterator
        public final void remove() {
            Preconditions.o("no calls to next() since the last call to remove()", this.X != null);
            this.X.d();
            throw null;
        }

        @Override // com.google.common.collect.ForwardingIterator, com.google.common.collect.ForwardingObject
        public final Object w() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingIterator
        /* JADX INFO: renamed from: x */
        public final Iterator w() {
            throw null;
        }
    }

    public static class FieldSettersHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Serialization.FieldSetter f19810a = Serialization.a(ConcurrentHashMultiset.class, "countMap");
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        Objects.requireNonNull(object);
        FieldSettersHolder.f19810a.a(this, (ConcurrentMap) object);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(null);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int Q0(Object obj) {
        obj.getClass();
        CollectPreconditions.b(0, "count");
        Maps.i(null, obj);
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int add(int i2, Object obj) {
        obj.getClass();
        if (i2 == 0) {
            Maps.i(null, obj);
            throw null;
        }
        CollectPreconditions.c(i2, "occurrences");
        Maps.i(null, obj);
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Set d() {
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Set g() {
        return new EntrySet();
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final int h() {
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Iterator i() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return Multisets.b(this);
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Iterator l() {
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int m(int i2, Object obj) {
        if (i2 == 0) {
            Maps.i(null, obj);
            throw null;
        }
        CollectPreconditions.c(i2, "occurrences");
        Maps.i(null, obj);
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final boolean r(int i2, Object obj) {
        obj.getClass();
        CollectPreconditions.b(i2, "oldCount");
        CollectPreconditions.b(0, "newCount");
        Maps.i(null, obj);
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        throw null;
    }

    @Override // com.google.common.collect.Multiset
    public final int w0(Object obj) {
        Maps.i(null, obj);
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        throw null;
    }

    public class EntrySet extends AbstractMultiset<E>.EntrySet {
        public EntrySet() {
            super();
        }

        @Override // com.google.common.collect.AbstractMultiset.EntrySet, com.google.common.collect.Multisets.EntrySet
        public final Multiset a() {
            return ConcurrentHashMultiset.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final Object[] toArray() {
            AbstractMultiset abstractMultiset = AbstractMultiset.this;
            int iH = abstractMultiset.h();
            CollectPreconditions.b(iH, "arraySize");
            ArrayList arrayList = new ArrayList(Ints.e(((long) iH) + 5 + ((long) (iH / 10))));
            Iterators.a(arrayList, abstractMultiset.l());
            return arrayList.toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final Object[] toArray(Object[] objArr) {
            AbstractMultiset abstractMultiset = AbstractMultiset.this;
            int iH = abstractMultiset.h();
            CollectPreconditions.b(iH, "arraySize");
            ArrayList arrayList = new ArrayList(Ints.e(((long) iH) + 5 + ((long) (iH / 10))));
            Iterators.a(arrayList, abstractMultiset.l());
            return arrayList.toArray(objArr);
        }
    }
}
