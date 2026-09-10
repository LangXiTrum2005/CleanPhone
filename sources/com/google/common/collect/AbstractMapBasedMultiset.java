package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractMapBasedMultiset<E> extends AbstractMultiset<E> implements Serializable {
    private static final long serialVersionUID = 0;
    public transient ObjectCountHashMap Z;
    public transient long e0;

    public abstract class Itr<T> implements Iterator<T> {
        public int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f19791Y = -1;
        public int Z;

        public Itr() {
            this.X = AbstractMapBasedMultiset.this.Z.c();
            this.Z = AbstractMapBasedMultiset.this.Z.d;
        }

        public abstract Object a(int i2);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (AbstractMapBasedMultiset.this.Z.d == this.Z) {
                return this.X >= 0;
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object objA = a(this.X);
            int i2 = this.X;
            this.f19791Y = i2;
            this.X = AbstractMapBasedMultiset.this.Z.k(i2);
            return objA;
        }

        @Override // java.util.Iterator
        public final void remove() {
            AbstractMapBasedMultiset abstractMapBasedMultiset = AbstractMapBasedMultiset.this;
            if (abstractMapBasedMultiset.Z.d != this.Z) {
                throw new ConcurrentModificationException();
            }
            CollectPreconditions.d(this.f19791Y != -1);
            abstractMapBasedMultiset.e0 -= (long) abstractMapBasedMultiset.Z.o(this.f19791Y);
            this.X = abstractMapBasedMultiset.Z.l(this.X, this.f19791Y);
            this.f19791Y = -1;
            this.Z = abstractMapBasedMultiset.Z.d;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i2 = objectInputStream.readInt();
        this.Z = o(3);
        Serialization.d(this, objectInputStream, i2);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Serialization.g(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int Q0(Object obj) {
        CollectPreconditions.b(0, "count");
        ObjectCountHashMap objectCountHashMap = this.Z;
        objectCountHashMap.getClass();
        int iN = objectCountHashMap.n(Hashing.c(obj), obj);
        this.e0 += (long) (0 - iN);
        return iN;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int add(int i2, Object obj) {
        if (i2 == 0) {
            return this.Z.d(obj);
        }
        Preconditions.c(i2, "occurrences cannot be negative: %s", i2 > 0);
        int iG = this.Z.g(obj);
        if (iG == -1) {
            this.Z.m(i2, obj);
            this.e0 += (long) i2;
            return 0;
        }
        int iF = this.Z.f(iG);
        long j = i2;
        long j2 = ((long) iF) + j;
        Preconditions.d(j2, j2 <= 2147483647L, "too many occurrences: %s");
        ObjectCountHashMap objectCountHashMap = this.Z;
        Preconditions.i(iG, objectCountHashMap.f19940c);
        objectCountHashMap.f19939b[iG] = (int) j2;
        this.e0 += j;
        return iF;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.Z.a();
        this.e0 = 0L;
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final int h() {
        return this.Z.f19940c;
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Iterator i() {
        return new AbstractMapBasedMultiset<Object>.Itr<Object>() { // from class: com.google.common.collect.AbstractMapBasedMultiset.1
            @Override // com.google.common.collect.AbstractMapBasedMultiset.Itr
            public final Object a(int i2) {
                return AbstractMapBasedMultiset.this.Z.e(i2);
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return Multisets.b(this);
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Iterator l() {
        return new AbstractMapBasedMultiset<Object>.Itr<Multiset.Entry<Object>>() { // from class: com.google.common.collect.AbstractMapBasedMultiset.2
            @Override // com.google.common.collect.AbstractMapBasedMultiset.Itr
            public final Object a(int i2) {
                ObjectCountHashMap objectCountHashMap = AbstractMapBasedMultiset.this.Z;
                Preconditions.i(i2, objectCountHashMap.f19940c);
                return new ObjectCountHashMap.MapEntry(i2);
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int m(int i2, Object obj) {
        if (i2 == 0) {
            return this.Z.d(obj);
        }
        Preconditions.c(i2, "occurrences cannot be negative: %s", i2 > 0);
        int iG = this.Z.g(obj);
        if (iG == -1) {
            return 0;
        }
        int iF = this.Z.f(iG);
        if (iF > i2) {
            ObjectCountHashMap objectCountHashMap = this.Z;
            Preconditions.i(iG, objectCountHashMap.f19940c);
            objectCountHashMap.f19939b[iG] = iF - i2;
        } else {
            this.Z.o(iG);
            i2 = iF;
        }
        this.e0 -= (long) i2;
        return iF;
    }

    public abstract ObjectCountHashMap o(int i2);

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final boolean r(int i2, Object obj) {
        CollectPreconditions.b(i2, "oldCount");
        CollectPreconditions.b(0, "newCount");
        int iG = this.Z.g(obj);
        if (iG == -1) {
            if (i2 == 0) {
                return true;
            }
        } else if (this.Z.f(iG) == i2) {
            this.Z.o(iG);
            this.e0 -= (long) i2;
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return Ints.e(this.e0);
    }

    @Override // com.google.common.collect.Multiset
    public final int w0(Object obj) {
        return this.Z.d(obj);
    }
}
