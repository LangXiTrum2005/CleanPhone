package com.google.common.collect;

import com.google.errorprone.annotations.DoNotMock;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@DoNotMock
@ElementTypesAreNonnullByDefault
public abstract class ImmutableCollection<E> extends AbstractCollection<E> implements Serializable {
    public static final Object[] X = new Object[0];
    private static final long serialVersionUID = 912559;

    public static abstract class ArrayBasedBuilder<E> extends Builder<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object[] f19826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19827b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f19828c;

        public ArrayBasedBuilder(int i2) {
            CollectPreconditions.b(i2, "initialCapacity");
            this.f19826a = new Object[i2];
            this.f19827b = 0;
        }

        @Override // 
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ArrayBasedBuilder c(Object obj) {
            obj.getClass();
            g(this.f19827b + 1);
            Object[] objArr = this.f19826a;
            int i2 = this.f19827b;
            this.f19827b = i2 + 1;
            objArr[i2] = obj;
            return this;
        }

        public final void d(int i2, Object[] objArr) {
            ObjectArrays.a(i2, objArr);
            g(this.f19827b + i2);
            System.arraycopy(objArr, 0, this.f19826a, this.f19827b, i2);
            this.f19827b += i2;
        }

        public final void e(Iterable iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                g(collection.size() + this.f19827b);
                if (collection instanceof ImmutableCollection) {
                    this.f19827b = ((ImmutableCollection) collection).e(this.f19827b, this.f19826a);
                    return;
                }
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                c(it.next());
            }
        }

        public void f(List list) {
            e(list);
        }

        public final void g(int i2) {
            Object[] objArr = this.f19826a;
            if (objArr.length < i2) {
                this.f19826a = Arrays.copyOf(objArr, Builder.a(objArr.length, i2));
                this.f19828c = false;
            } else if (this.f19828c) {
                this.f19826a = (Object[]) objArr.clone();
                this.f19828c = false;
            }
        }
    }

    @DoNotMock
    public static abstract class Builder<E> {
        public static int a(int i2, int i3) {
            if (i3 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = i2 + (i2 >> 1) + 1;
            if (iHighestOneBit < i3) {
                iHighestOneBit = Integer.highestOneBit(i3 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    public ImmutableList d() {
        if (isEmpty()) {
            UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f19830Y;
            return RegularImmutableList.f0;
        }
        Object[] array = toArray(X);
        UnmodifiableListIterator unmodifiableListIterator2 = ImmutableList.f19830Y;
        return ImmutableList.p(array.length, array);
    }

    public int e(int i2, Object[] objArr) {
        UnmodifiableIterator it = iterator();
        while (it.hasNext()) {
            objArr[i2] = it.next();
            i2++;
        }
        return i2;
    }

    public Object[] g() {
        return null;
    }

    public int h() {
        throw new UnsupportedOperationException();
    }

    public int i() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean l();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public abstract UnmodifiableIterator iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(X);
    }

    public Object writeReplace() {
        return new ImmutableList.SerializedForm(toArray(X));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        if (objArr.length < size) {
            Object[] objArrG = g();
            if (objArrG != null) {
                return Arrays.copyOfRange(objArrG, i(), h(), objArr.getClass());
            }
            if (objArr.length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        e(0, objArr);
        return objArr;
    }
}
