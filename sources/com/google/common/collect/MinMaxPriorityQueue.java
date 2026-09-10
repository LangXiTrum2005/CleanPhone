package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class MinMaxPriorityQueue<E> extends AbstractQueue<E> {
    public Object[] X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f19925Y;
    public int Z;

    public static final class Builder<B> {
    }

    public class Heap {
    }

    public static class MoveDesc<E> {
    }

    public class QueueIterator implements Iterator<E> {
        public int X = -1;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f19926Y = -1;
        public int Z;
        public boolean e0;

        public QueueIterator() {
            this.Z = MinMaxPriorityQueue.this.Z;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            MinMaxPriorityQueue minMaxPriorityQueue = MinMaxPriorityQueue.this;
            if (minMaxPriorityQueue.Z != this.Z) {
                throw new ConcurrentModificationException();
            }
            int i2 = this.X + 1;
            if (this.f19926Y < i2) {
                this.f19926Y = i2;
            }
            return this.f19926Y < minMaxPriorityQueue.f19925Y;
        }

        @Override // java.util.Iterator
        public final Object next() {
            MinMaxPriorityQueue minMaxPriorityQueue = MinMaxPriorityQueue.this;
            if (minMaxPriorityQueue.Z != this.Z) {
                throw new ConcurrentModificationException();
            }
            int i2 = this.X + 1;
            if (this.f19926Y < i2) {
                this.f19926Y = i2;
            }
            int i3 = this.f19926Y;
            if (i3 >= minMaxPriorityQueue.f19925Y) {
                throw new NoSuchElementException("iterator moved past last element in queue.");
            }
            this.X = i3;
            this.e0 = true;
            Object obj = minMaxPriorityQueue.X[i3];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // java.util.Iterator
        public final void remove() {
            CollectPreconditions.d(this.e0);
            MinMaxPriorityQueue minMaxPriorityQueue = MinMaxPriorityQueue.this;
            int i2 = minMaxPriorityQueue.Z;
            int i3 = this.Z;
            if (i2 != i3) {
                throw new ConcurrentModificationException();
            }
            this.e0 = false;
            this.Z = i3 + 1;
            int i4 = this.X;
            if (i4 >= minMaxPriorityQueue.f19925Y) {
                throw null;
            }
            minMaxPriorityQueue.a(i4);
            this.X--;
            this.f19926Y--;
        }
    }

    public final void a(int i2) {
        Preconditions.k(i2, this.f19925Y);
        this.Z++;
        int i3 = this.f19925Y - 1;
        this.f19925Y = i3;
        if (i3 == i2) {
            this.X[i3] = null;
        } else {
            Objects.requireNonNull(this.X[i3]);
            Preconditions.o("negative index", (~(~(this.f19925Y + 1))) > 0);
            throw null;
        }
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        offer(obj);
        throw null;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator<E> it = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        offer(it.next());
        throw null;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        for (int i2 = 0; i2 < this.f19925Y; i2++) {
            this.X[i2] = null;
        }
        this.f19925Y = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new QueueIterator();
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        obj.getClass();
        this.Z++;
        int i2 = this.f19925Y + 1;
        this.f19925Y = i2;
        Object[] objArr = this.X;
        if (i2 > objArr.length) {
            int length = objArr.length;
            Object[] objArr2 = new Object[Math.min((length < 64 ? (length + 1) * 2 : IntMath.b(length / 2)) - 1, 0) + 1];
            Object[] objArr3 = this.X;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.X = objArr2;
        }
        Preconditions.o("negative index", (~(~i2)) > 0);
        throw null;
    }

    @Override // java.util.Queue
    public final Object peek() {
        if (isEmpty()) {
            return null;
        }
        Object obj = this.X[0];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.Queue
    public final Object poll() {
        if (isEmpty()) {
            return null;
        }
        Object obj = this.X[0];
        Objects.requireNonNull(obj);
        a(0);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f19925Y;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        int i2 = this.f19925Y;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.X, 0, objArr, 0, i2);
        return objArr;
    }
}
