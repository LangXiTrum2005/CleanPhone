package com.badlogic.gdx.utils;

import com.badlogic.gdx.utils.reflect.ArrayReflection;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public class Queue<T> implements Iterable<T> {
    protected int head;
    private transient QueueIterable iterable;
    public int size;
    protected int tail;
    protected T[] values;

    public static class QueueIterable<T> implements Iterable<T> {
        private final boolean allowRemove;
        private QueueIterator iterator1;
        private QueueIterator iterator2;
        private final Queue<T> queue;

        public QueueIterable(Queue<T> queue) {
            this(queue, true);
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            if (Collections.allocateIterators) {
                return new QueueIterator(this.queue, this.allowRemove);
            }
            if (this.iterator1 == null) {
                this.iterator1 = new QueueIterator(this.queue, this.allowRemove);
                this.iterator2 = new QueueIterator(this.queue, this.allowRemove);
            }
            QueueIterator queueIterator = this.iterator1;
            if (!queueIterator.valid) {
                queueIterator.index = 0;
                queueIterator.valid = true;
                this.iterator2.valid = false;
                return queueIterator;
            }
            QueueIterator queueIterator2 = this.iterator2;
            queueIterator2.index = 0;
            queueIterator2.valid = true;
            queueIterator.valid = false;
            return queueIterator2;
        }

        public QueueIterable(Queue<T> queue, boolean z) {
            this.queue = queue;
            this.allowRemove = z;
        }
    }

    public static class QueueIterator<T> implements Iterator<T>, Iterable<T> {
        private final boolean allowRemove;
        int index;
        private final Queue<T> queue;
        boolean valid;

        public QueueIterator(Queue<T> queue) {
            this(queue, true);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.valid) {
                return this.index < this.queue.size;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this;
        }

        @Override // java.util.Iterator
        public T next() {
            int i = this.index;
            Queue<T> queue = this.queue;
            if (i >= queue.size) {
                throw new NoSuchElementException(String.valueOf(this.index));
            }
            if (!this.valid) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            this.index = i + 1;
            return queue.get(i);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.allowRemove) {
                throw new GdxRuntimeException("Remove not allowed.");
            }
            int i = this.index - 1;
            this.index = i;
            this.queue.removeIndex(i);
        }

        public void reset() {
            this.index = 0;
        }

        public QueueIterator(Queue<T> queue, boolean z) {
            this.valid = true;
            this.queue = queue;
            this.allowRemove = z;
        }
    }

    public Queue() {
        this(16);
    }

    public void addFirst(@Null T t) {
        T[] tArr = this.values;
        if (this.size == tArr.length) {
            resize(tArr.length << 1);
            tArr = this.values;
        }
        int length = this.head - 1;
        if (length == -1) {
            length = tArr.length - 1;
        }
        tArr[length] = t;
        this.head = length;
        this.size++;
    }

    public void addLast(@Null T t) {
        T[] tArr = this.values;
        if (this.size == tArr.length) {
            resize(tArr.length << 1);
            tArr = this.values;
        }
        int i = this.tail;
        int i2 = i + 1;
        this.tail = i2;
        tArr[i] = t;
        if (i2 == tArr.length) {
            this.tail = 0;
        }
        this.size++;
    }

    public void clear() {
        if (this.size == 0) {
            return;
        }
        T[] tArr = this.values;
        int i = this.head;
        int i2 = this.tail;
        if (i < i2) {
            while (i < i2) {
                tArr[i] = null;
                i++;
            }
        } else {
            while (i < tArr.length) {
                tArr[i] = null;
                i++;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                tArr[i3] = null;
            }
        }
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }

    public void ensureCapacity(int i) {
        int i2 = this.size + i;
        if (this.values.length < i2) {
            resize(i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0038  */
    /* JADX WARN: Code duplicated, block: B:26:0x003b  */
    /* JADX WARN: Code duplicated, block: B:34:0x003c A[SYNTHETIC] */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Queue)) {
            return false;
        }
        Queue queue = (Queue) obj;
        int i = this.size;
        if (queue.size != i) {
            return false;
        }
        T[] tArr = this.values;
        int length = tArr.length;
        T[] tArr2 = queue.values;
        int length2 = tArr2.length;
        int i2 = this.head;
        int i3 = queue.head;
        for (int i4 = 0; i4 < i; i4++) {
            T t = tArr[i2];
            T t2 = tArr2[i3];
            if (t == null) {
                if (t2 != null) {
                    return false;
                }
                i2++;
                i3++;
                if (i2 == length) {
                    i2 = 0;
                }
                if (i3 == length2) {
                    i3 = 0;
                }
            } else {
                if (!t.equals(t2)) {
                    return false;
                }
                i2++;
                i3++;
                if (i2 == length) {
                    i2 = 0;
                }
                if (i3 == length2) {
                    i3 = 0;
                }
            }
        }
        return true;
    }

    public boolean equalsIdentity(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Queue)) {
            return false;
        }
        Queue queue = (Queue) obj;
        int i = this.size;
        if (queue.size != i) {
            return false;
        }
        T[] tArr = this.values;
        int length = tArr.length;
        T[] tArr2 = queue.values;
        int length2 = tArr2.length;
        int i2 = this.head;
        int i3 = queue.head;
        for (int i4 = 0; i4 < i; i4++) {
            if (tArr[i2] != tArr2[i3]) {
                return false;
            }
            i2++;
            i3++;
            if (i2 == length) {
                i2 = 0;
            }
            if (i3 == length2) {
                i3 = 0;
            }
        }
        return true;
    }

    public T first() {
        if (this.size != 0) {
            return this.values[this.head];
        }
        throw new NoSuchElementException("Queue is empty.");
    }

    public T get(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(AbstractC3950lJ.p("index can't be < 0: ", i));
        }
        if (i >= this.size) {
            java.lang.StringBuilder sbQ = AbstractC5044xl.q("index can't be >= size: ", i, " >= ");
            sbQ.append(this.size);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
        T[] tArr = this.values;
        int length = this.head + i;
        if (length >= tArr.length) {
            length -= tArr.length;
        }
        return tArr[length];
    }

    public int hashCode() {
        int i = this.size;
        T[] tArr = this.values;
        int length = tArr.length;
        int i2 = this.head;
        int iHashCode = i + 1;
        for (int i3 = 0; i3 < i; i3++) {
            T t = tArr[i2];
            iHashCode *= 31;
            if (t != null) {
                iHashCode = t.hashCode() + iHashCode;
            }
            i2++;
            if (i2 == length) {
                i2 = 0;
            }
        }
        return iHashCode;
    }

    public int indexOf(T t, boolean z) {
        int length;
        if (this.size == 0) {
            return -1;
        }
        T[] tArr = this.values;
        int i = this.head;
        int i2 = this.tail;
        int i3 = 0;
        if (z || t == null) {
            if (i < i2) {
                for (int i4 = i; i4 < i2; i4++) {
                    if (tArr[i4] == t) {
                        return i4 - i;
                    }
                }
            } else {
                int length2 = tArr.length;
                for (int i5 = i; i5 < length2; i5++) {
                    if (tArr[i5] == t) {
                        return i5 - i;
                    }
                }
                while (i3 < i2) {
                    if (tArr[i3] == t) {
                        length = tArr.length;
                        return (i3 + length) - i;
                    }
                    i3++;
                }
            }
            return -1;
        }
        if (i < i2) {
            for (int i6 = i; i6 < i2; i6++) {
                if (t.equals(tArr[i6])) {
                    return i6 - i;
                }
            }
        } else {
            int length3 = tArr.length;
            for (int i7 = i; i7 < length3; i7++) {
                if (t.equals(tArr[i7])) {
                    return i7 - i;
                }
            }
            while (i3 < i2) {
                if (t.equals(tArr[i3])) {
                    length = tArr.length;
                    return (i3 + length) - i;
                }
                i3++;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        if (Collections.allocateIterators) {
            return new QueueIterator(this, true);
        }
        if (this.iterable == null) {
            this.iterable = new QueueIterable(this);
        }
        return this.iterable.iterator();
    }

    public T last() {
        if (this.size == 0) {
            throw new NoSuchElementException("Queue is empty.");
        }
        T[] tArr = this.values;
        int length = this.tail - 1;
        if (length == -1) {
            length = tArr.length - 1;
        }
        return tArr[length];
    }

    public boolean notEmpty() {
        return this.size > 0;
    }

    public T removeFirst() {
        int i = this.size;
        if (i == 0) {
            throw new NoSuchElementException("Queue is empty.");
        }
        T[] tArr = this.values;
        int i2 = this.head;
        T t = tArr[i2];
        tArr[i2] = null;
        int i3 = i2 + 1;
        this.head = i3;
        if (i3 == tArr.length) {
            this.head = 0;
        }
        this.size = i - 1;
        return t;
    }

    public T removeIndex(int i) {
        T t;
        if (i < 0) {
            throw new IndexOutOfBoundsException(AbstractC3950lJ.p("index can't be < 0: ", i));
        }
        if (i >= this.size) {
            java.lang.StringBuilder sbQ = AbstractC5044xl.q("index can't be >= size: ", i, " >= ");
            sbQ.append(this.size);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
        T[] tArr = this.values;
        int i2 = this.head;
        int i3 = this.tail;
        int i4 = i + i2;
        if (i2 < i3) {
            t = tArr[i4];
            System.arraycopy(tArr, i4 + 1, tArr, i4, i3 - i4);
            tArr[i3] = null;
            this.tail--;
        } else if (i4 >= tArr.length) {
            int length = i4 - tArr.length;
            t = tArr[length];
            System.arraycopy(tArr, length + 1, tArr, length, i3 - length);
            this.tail--;
        } else {
            T t2 = tArr[i4];
            System.arraycopy(tArr, i2, tArr, i2 + 1, i4 - i2);
            tArr[i2] = null;
            int i5 = this.head + 1;
            this.head = i5;
            if (i5 == tArr.length) {
                this.head = 0;
            }
            t = t2;
        }
        this.size--;
        return t;
    }

    public T removeLast() {
        int i = this.size;
        if (i == 0) {
            throw new NoSuchElementException("Queue is empty.");
        }
        T[] tArr = this.values;
        int length = this.tail - 1;
        if (length == -1) {
            length = tArr.length - 1;
        }
        T t = tArr[length];
        tArr[length] = null;
        this.tail = length;
        this.size = i - 1;
        return t;
    }

    public boolean removeValue(T t, boolean z) {
        int iIndexOf = indexOf(t, z);
        if (iIndexOf == -1) {
            return false;
        }
        removeIndex(iIndexOf);
        return true;
    }

    public void resize(int i) {
        T[] tArr = this.values;
        int i2 = this.head;
        int i3 = this.tail;
        T[] tArr2 = (T[]) ((Object[]) ArrayReflection.newInstance(tArr.getClass().getComponentType(), i));
        if (i2 < i3) {
            System.arraycopy(tArr, i2, tArr2, 0, i3 - i2);
        } else if (this.size > 0) {
            int length = tArr.length - i2;
            System.arraycopy(tArr, i2, tArr2, 0, length);
            System.arraycopy(tArr, 0, tArr2, length, i3);
        }
        this.values = tArr2;
        this.head = 0;
        this.tail = this.size;
    }

    public String toString() {
        if (this.size == 0) {
            return "[]";
        }
        T[] tArr = this.values;
        int length = this.head;
        int i = this.tail;
        StringBuilder stringBuilder = new StringBuilder(64);
        stringBuilder.append('[');
        stringBuilder.append(tArr[length]);
        while (true) {
            length = (length + 1) % tArr.length;
            if (length == i) {
                stringBuilder.append(']');
                return stringBuilder.toString();
            }
            stringBuilder.append(", ").append(tArr[length]);
        }
    }

    public Queue(int i) {
        this.head = 0;
        this.tail = 0;
        this.size = 0;
        this.values = (T[]) new Object[i];
    }

    public Queue(int i, Class<T> cls) {
        this.head = 0;
        this.tail = 0;
        this.size = 0;
        this.values = (T[]) ((Object[]) ArrayReflection.newInstance(cls, i));
    }

    public String toString(String str) {
        if (this.size == 0) {
            return "";
        }
        T[] tArr = this.values;
        int length = this.head;
        int i = this.tail;
        StringBuilder stringBuilder = new StringBuilder(64);
        stringBuilder.append(tArr[length]);
        while (true) {
            length = (length + 1) % tArr.length;
            if (length != i) {
                stringBuilder.append(str).append(tArr[length]);
            } else {
                return stringBuilder.toString();
            }
        }
    }
}
