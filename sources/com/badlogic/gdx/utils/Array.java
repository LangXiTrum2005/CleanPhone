package com.badlogic.gdx.utils;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.reflect.ArrayReflection;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public class Array<T> implements Iterable<T> {
    public T[] items;
    private transient ArrayIterable<T> iterable;
    public boolean ordered;
    private transient Predicate.PredicateIterable<T> predicateIterable;
    public int size;

    public static class ArrayIterable<T> implements Iterable<T> {
        private final boolean allowRemove;
        private final Array<T> array;
        private transient ArrayIterator<T> iterator1;
        private transient ArrayIterator<T> iterator2;

        public ArrayIterable(Array<T> array) {
            this(array, true);
        }

        public ArrayIterable(Array<T> array, boolean z) {
            this.array = array;
            this.allowRemove = z;
        }

        @Override // java.lang.Iterable
        public ArrayIterator<T> iterator() {
            if (Collections.allocateIterators) {
                return new ArrayIterator<>(this.array, this.allowRemove);
            }
            if (this.iterator1 == null) {
                this.iterator1 = new ArrayIterator<>(this.array, this.allowRemove);
                this.iterator2 = new ArrayIterator<>(this.array, this.allowRemove);
            }
            ArrayIterator<T> arrayIterator = this.iterator1;
            if (!arrayIterator.valid) {
                arrayIterator.index = 0;
                arrayIterator.valid = true;
                this.iterator2.valid = false;
                return arrayIterator;
            }
            ArrayIterator<T> arrayIterator2 = this.iterator2;
            arrayIterator2.index = 0;
            arrayIterator2.valid = true;
            arrayIterator.valid = false;
            return arrayIterator2;
        }
    }

    public static class ArrayIterator<T> implements Iterator<T>, Iterable<T> {
        private final boolean allowRemove;
        private final Array<T> array;
        int index;
        boolean valid;

        public ArrayIterator(Array<T> array) {
            this(array, true);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.valid) {
                return this.index < this.array.size;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // java.lang.Iterable
        public ArrayIterator<T> iterator() {
            return this;
        }

        @Override // java.util.Iterator
        public T next() {
            int i = this.index;
            Array<T> array = this.array;
            if (i >= array.size) {
                throw new NoSuchElementException(String.valueOf(this.index));
            }
            if (!this.valid) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            T[] tArr = array.items;
            this.index = i + 1;
            return tArr[i];
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.allowRemove) {
                throw new GdxRuntimeException("Remove not allowed.");
            }
            int i = this.index - 1;
            this.index = i;
            this.array.removeIndex(i);
        }

        public void reset() {
            this.index = 0;
        }

        public ArrayIterator(Array<T> array, boolean z) {
            this.valid = true;
            this.array = array;
            this.allowRemove = z;
        }
    }

    public Array() {
        this(true, 16);
    }

    public static <T> Array<T> of(Class<T> cls) {
        return new Array<>(cls);
    }

    public static <T> Array<T> with(T... tArr) {
        return new Array<>(tArr);
    }

    public void add(T t) {
        T[] tArrResize = this.items;
        int i = this.size;
        if (i == tArrResize.length) {
            tArrResize = resize(Math.max(8, (int) (i * 1.75f)));
        }
        int i2 = this.size;
        this.size = i2 + 1;
        tArrResize[i2] = t;
    }

    public void addAll(Array<? extends T> array) {
        addAll(array.items, 0, array.size);
    }

    public void clear() {
        Arrays.fill(this.items, 0, this.size, (Object) null);
        this.size = 0;
    }

    public boolean contains(@Null T t, boolean z) {
        T[] tArr = this.items;
        int i = this.size - 1;
        if (z || t == null) {
            while (i >= 0) {
                int i2 = i - 1;
                if (tArr[i] == t) {
                    return true;
                }
                i = i2;
            }
            return false;
        }
        while (i >= 0) {
            int i3 = i - 1;
            if (t.equals(tArr[i])) {
                return true;
            }
            i = i3;
        }
        return false;
    }

    public boolean containsAll(Array<? extends T> array, boolean z) {
        T[] tArr = array.items;
        int i = array.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (!contains(tArr[i2], z)) {
                return false;
            }
        }
        return true;
    }

    public boolean containsAny(Array<? extends T> array, boolean z) {
        T[] tArr = array.items;
        int i = array.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (contains(tArr[i2], z)) {
                return true;
            }
        }
        return false;
    }

    public T[] ensureCapacity(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC3950lJ.p("additionalCapacity must be >= 0: ", i));
        }
        int i2 = this.size + i;
        if (i2 > this.items.length) {
            resize(Math.max(Math.max(8, i2), (int) (this.size * 1.75f)));
        }
        return this.items;
    }

    public boolean equals(Object obj) {
        int i;
        if (obj == this) {
            return true;
        }
        if (!this.ordered || !(obj instanceof Array)) {
            return false;
        }
        Array array = (Array) obj;
        if (!array.ordered || (i = this.size) != array.size) {
            return false;
        }
        T[] tArr = this.items;
        T[] tArr2 = array.items;
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            T t2 = tArr2[i2];
            if (t == null) {
                if (t2 != null) {
                    return false;
                }
            } else {
                if (!t.equals(t2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean equalsIdentity(Object obj) {
        int i;
        if (obj == this) {
            return true;
        }
        if (!this.ordered || !(obj instanceof Array)) {
            return false;
        }
        Array array = (Array) obj;
        if (!array.ordered || (i = this.size) != array.size) {
            return false;
        }
        T[] tArr = this.items;
        T[] tArr2 = array.items;
        for (int i2 = 0; i2 < i; i2++) {
            if (tArr[i2] != tArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public T first() {
        if (this.size != 0) {
            return this.items[0];
        }
        throw new IllegalStateException("Array is empty.");
    }

    public T get(int i) {
        if (i < this.size) {
            return this.items[i];
        }
        java.lang.StringBuilder sbQ = AbstractC5044xl.q("index can't be >= size: ", i, " >= ");
        sbQ.append(this.size);
        throw new IndexOutOfBoundsException(sbQ.toString());
    }

    public int hashCode() {
        if (!this.ordered) {
            return super.hashCode();
        }
        T[] tArr = this.items;
        int i = this.size;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode *= 31;
            T t = tArr[i2];
            if (t != null) {
                iHashCode = t.hashCode() + iHashCode;
            }
        }
        return iHashCode;
    }

    public int indexOf(@Null T t, boolean z) {
        T[] tArr = this.items;
        int i = 0;
        if (z || t == null) {
            int i2 = this.size;
            while (i < i2) {
                if (tArr[i] == t) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.size;
        while (i < i3) {
            if (t.equals(tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void insert(int i, T t) {
        int i2 = this.size;
        if (i > i2) {
            java.lang.StringBuilder sbQ = AbstractC5044xl.q("index can't be > size: ", i, " > ");
            sbQ.append(this.size);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
        T[] tArrResize = this.items;
        if (i2 == tArrResize.length) {
            tArrResize = resize(Math.max(8, (int) (i2 * 1.75f)));
        }
        if (this.ordered) {
            System.arraycopy(tArrResize, i, tArrResize, i + 1, this.size - i);
        } else {
            tArrResize[this.size] = tArrResize[i];
        }
        this.size++;
        tArrResize[i] = t;
    }

    public void insertRange(int i, int i2) {
        int i3 = this.size;
        if (i > i3) {
            java.lang.StringBuilder sbQ = AbstractC5044xl.q("index can't be > size: ", i, " > ");
            sbQ.append(this.size);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
        int i4 = i3 + i2;
        if (i4 > this.items.length) {
            this.items = resize(Math.max(Math.max(8, i4), (int) (this.size * 1.75f)));
        }
        T[] tArr = this.items;
        System.arraycopy(tArr, i, tArr, i2 + i, this.size - i);
        this.size = i4;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int lastIndexOf(@Null T t, boolean z) {
        T[] tArr = this.items;
        if (z || t == null) {
            for (int i = this.size - 1; i >= 0; i--) {
                if (tArr[i] == t) {
                    return i;
                }
            }
            return -1;
        }
        for (int i2 = this.size - 1; i2 >= 0; i2--) {
            if (t.equals(tArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public boolean notEmpty() {
        return this.size > 0;
    }

    public T peek() {
        int i = this.size;
        if (i != 0) {
            return this.items[i - 1];
        }
        throw new IllegalStateException("Array is empty.");
    }

    public T pop() {
        int i = this.size;
        if (i == 0) {
            throw new IllegalStateException("Array is empty.");
        }
        int i2 = i - 1;
        this.size = i2;
        T[] tArr = this.items;
        T t = tArr[i2];
        tArr[i2] = null;
        return t;
    }

    @Null
    public T random() {
        int i = this.size;
        if (i == 0) {
            return null;
        }
        return this.items[MathUtils.random(0, i - 1)];
    }

    public boolean removeAll(Array<? extends T> array, boolean z) {
        int i;
        int i2 = this.size;
        T[] tArr = this.items;
        if (z) {
            int i3 = array.size;
            i = i2;
            for (int i4 = 0; i4 < i3; i4++) {
                T t = array.get(i4);
                for (int i5 = 0; i5 < i; i5++) {
                    if (t == tArr[i5]) {
                        removeIndex(i5);
                        i--;
                        break;
                    }
                }
            }
        } else {
            int i6 = array.size;
            i = i2;
            for (int i7 = 0; i7 < i6; i7++) {
                T t2 = array.get(i7);
                for (int i8 = 0; i8 < i; i8++) {
                    if (t2.equals(tArr[i8])) {
                        removeIndex(i8);
                        i--;
                        break;
                    }
                }
            }
        }
        return i != i2;
    }

    public T removeIndex(int i) {
        int i2 = this.size;
        if (i >= i2) {
            java.lang.StringBuilder sbQ = AbstractC5044xl.q("index can't be >= size: ", i, " >= ");
            sbQ.append(this.size);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
        T[] tArr = this.items;
        T t = tArr[i];
        int i3 = i2 - 1;
        this.size = i3;
        if (this.ordered) {
            System.arraycopy(tArr, i + 1, tArr, i, i3 - i);
        } else {
            tArr[i] = tArr[i3];
        }
        tArr[this.size] = null;
        return t;
    }

    public void removeRange(int i, int i2) {
        int i3 = this.size;
        if (i2 >= i3) {
            java.lang.StringBuilder sbQ = AbstractC5044xl.q("end can't be >= size: ", i2, " >= ");
            sbQ.append(this.size);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
        if (i > i2) {
            throw new IndexOutOfBoundsException(AbstractC3888ke0.h("start can't be > end: ", i, " > ", i2));
        }
        T[] tArr = this.items;
        int i4 = (i2 - i) + 1;
        int i5 = i3 - i4;
        if (this.ordered) {
            int i6 = i4 + i;
            System.arraycopy(tArr, i6, tArr, i, i3 - i6);
        } else {
            int iMax = Math.max(i5, i2 + 1);
            System.arraycopy(tArr, iMax, tArr, i, i3 - iMax);
        }
        for (int i7 = i5; i7 < i3; i7++) {
            tArr[i7] = null;
        }
        this.size = i5;
    }

    public boolean removeValue(@Null T t, boolean z) {
        T[] tArr = this.items;
        if (z || t == null) {
            int i = this.size;
            for (int i2 = 0; i2 < i; i2++) {
                if (tArr[i2] == t) {
                    removeIndex(i2);
                    return true;
                }
            }
        } else {
            int i3 = this.size;
            for (int i4 = 0; i4 < i3; i4++) {
                if (t.equals(tArr[i4])) {
                    removeIndex(i4);
                    return true;
                }
            }
        }
        return false;
    }

    public int replaceAll(@Null T t, boolean z, @Null T t2) {
        int i;
        T[] tArr = this.items;
        int i2 = 0;
        if (z || t == null) {
            int i3 = this.size;
            i = 0;
            while (i2 < i3) {
                if (tArr[i2] == t) {
                    tArr[i2] = t2;
                    i++;
                }
                i2++;
            }
        } else {
            int i4 = this.size;
            i = 0;
            while (i2 < i4) {
                if (t.equals(tArr[i2])) {
                    tArr[i2] = t2;
                    i++;
                }
                i2++;
            }
        }
        return i;
    }

    public boolean replaceFirst(@Null T t, boolean z, T t2) {
        T[] tArr = this.items;
        if (z || t == null) {
            int i = this.size;
            for (int i2 = 0; i2 < i; i2++) {
                if (tArr[i2] == t) {
                    tArr[i2] = t2;
                    return true;
                }
            }
        } else {
            int i3 = this.size;
            for (int i4 = 0; i4 < i3; i4++) {
                if (t.equals(tArr[i4])) {
                    tArr[i4] = t2;
                    return true;
                }
            }
        }
        return false;
    }

    public T[] resize(int i) {
        T[] tArr = this.items;
        T[] tArr2 = (T[]) ((Object[]) ArrayReflection.newInstance(tArr.getClass().getComponentType(), i));
        System.arraycopy(tArr, 0, tArr2, 0, Math.min(this.size, tArr2.length));
        this.items = tArr2;
        return tArr2;
    }

    public void reverse() {
        T[] tArr = this.items;
        int i = this.size;
        int i2 = i - 1;
        int i3 = i / 2;
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i2 - i4;
            T t = tArr[i4];
            tArr[i4] = tArr[i5];
            tArr[i5] = t;
        }
    }

    public Iterable<T> select(Predicate<T> predicate) {
        if (Collections.allocateIterators) {
            return new Predicate.PredicateIterable(this, predicate);
        }
        Predicate.PredicateIterable<T> predicateIterable = this.predicateIterable;
        if (predicateIterable == null) {
            this.predicateIterable = new Predicate.PredicateIterable<>(this, predicate);
        } else {
            predicateIterable.set(this, predicate);
        }
        return this.predicateIterable;
    }

    public T selectRanked(Comparator<T> comparator, int i) {
        if (i >= 1) {
            return (T) Select.instance().select(this.items, comparator, i, this.size);
        }
        throw new GdxRuntimeException("nth_lowest must be greater than 0, 1 = first, 2 = second...");
    }

    public int selectRankedIndex(Comparator<T> comparator, int i) {
        if (i >= 1) {
            return Select.instance().selectIndex(this.items, comparator, i, this.size);
        }
        throw new GdxRuntimeException("nth_lowest must be greater than 0, 1 = first, 2 = second...");
    }

    public void set(int i, T t) {
        if (i < this.size) {
            this.items[i] = t;
        } else {
            java.lang.StringBuilder sbQ = AbstractC5044xl.q("index can't be >= size: ", i, " >= ");
            sbQ.append(this.size);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
    }

    public T[] setSize(int i) {
        truncate(i);
        if (i > this.items.length) {
            resize(Math.max(8, i));
        }
        this.size = i;
        return this.items;
    }

    public T[] shrink() {
        int length = this.items.length;
        int i = this.size;
        if (length != i) {
            resize(i);
        }
        return this.items;
    }

    public void shuffle() {
        T[] tArr = this.items;
        for (int i = this.size - 1; i >= 0; i--) {
            int iRandom = MathUtils.random(i);
            T t = tArr[i];
            tArr[i] = tArr[iRandom];
            tArr[iRandom] = t;
        }
    }

    public void sort() {
        Sort.instance().sort(this.items, 0, this.size);
    }

    public void swap(int i, int i2) {
        int i3 = this.size;
        if (i >= i3) {
            java.lang.StringBuilder sbQ = AbstractC5044xl.q("first can't be >= size: ", i, " >= ");
            sbQ.append(this.size);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
        if (i2 >= i3) {
            java.lang.StringBuilder sbQ2 = AbstractC5044xl.q("second can't be >= size: ", i2, " >= ");
            sbQ2.append(this.size);
            throw new IndexOutOfBoundsException(sbQ2.toString());
        }
        T[] tArr = this.items;
        T t = tArr[i];
        tArr[i] = tArr[i2];
        tArr[i2] = t;
    }

    public T[] toArray() {
        return (T[]) toArray(this.items.getClass().getComponentType());
    }

    public String toString() {
        if (this.size == 0) {
            return "[]";
        }
        T[] tArr = this.items;
        StringBuilder stringBuilder = new StringBuilder(32);
        stringBuilder.append('[');
        stringBuilder.append(tArr[0]);
        for (int i = 1; i < this.size; i++) {
            stringBuilder.append(", ");
            stringBuilder.append(tArr[i]);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public void truncate(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC3950lJ.p("newSize must be >= 0: ", i));
        }
        if (this.size <= i) {
            return;
        }
        for (int i2 = i; i2 < this.size; i2++) {
            this.items[i2] = null;
        }
        this.size = i;
    }

    public Array(int i) {
        this(true, i);
    }

    public static <T> Array<T> of(boolean z, int i, Class<T> cls) {
        return new Array<>(z, i, cls);
    }

    public void addAll(Array<? extends T> array, int i, int i2) {
        if (i + i2 <= array.size) {
            addAll(array.items, i, i2);
        } else {
            java.lang.StringBuilder sbT = AbstractC3950lJ.t("start + count must be <= size: ", i, " + ", i2, " <= ");
            sbT.append(array.size);
            throw new IllegalArgumentException(sbT.toString());
        }
    }

    @Override // java.lang.Iterable
    public ArrayIterator<T> iterator() {
        if (Collections.allocateIterators) {
            return new ArrayIterator<>(this, true);
        }
        if (this.iterable == null) {
            this.iterable = new ArrayIterable<>(this);
        }
        return this.iterable.iterator();
    }

    public void sort(Comparator<? super T> comparator) {
        Sort.instance().sort(this.items, comparator, 0, this.size);
    }

    public <V> V[] toArray(Class<V> cls) {
        V[] vArr = (V[]) ((Object[]) ArrayReflection.newInstance(cls, this.size));
        System.arraycopy(this.items, 0, vArr, 0, this.size);
        return vArr;
    }

    public Array(boolean z, int i) {
        this.ordered = z;
        this.items = (T[]) new Object[i];
    }

    public void add(T t, T t2) {
        T[] tArrResize = this.items;
        int i = this.size;
        if (i + 1 >= tArrResize.length) {
            tArrResize = resize(Math.max(8, (int) (i * 1.75f)));
        }
        int i2 = this.size;
        tArrResize[i2] = t;
        tArrResize[i2 + 1] = t2;
        this.size = i2 + 2;
    }

    public Array(boolean z, int i, Class cls) {
        this.ordered = z;
        this.items = (T[]) ((Object[]) ArrayReflection.newInstance(cls, i));
    }

    public Array(Class cls) {
        this(true, 16, cls);
    }

    public void add(T t, T t2, T t3) {
        T[] tArrResize = this.items;
        int i = this.size;
        if (i + 2 >= tArrResize.length) {
            tArrResize = resize(Math.max(8, (int) (i * 1.75f)));
        }
        int i2 = this.size;
        tArrResize[i2] = t;
        tArrResize[i2 + 1] = t2;
        tArrResize[i2 + 2] = t3;
        this.size = i2 + 3;
    }

    public Array(Array<? extends T> array) {
        this(array.ordered, array.size, array.items.getClass().getComponentType());
        int i = array.size;
        this.size = i;
        System.arraycopy(array.items, 0, this.items, 0, i);
    }

    public String toString(String str) {
        if (this.size == 0) {
            return "";
        }
        T[] tArr = this.items;
        StringBuilder stringBuilder = new StringBuilder(32);
        stringBuilder.append(tArr[0]);
        for (int i = 1; i < this.size; i++) {
            stringBuilder.append(str);
            stringBuilder.append(tArr[i]);
        }
        return stringBuilder.toString();
    }

    public Array(T[] tArr) {
        this(true, tArr, 0, tArr.length);
    }

    public void addAll(T... tArr) {
        addAll(tArr, 0, tArr.length);
    }

    public Array(boolean z, T[] tArr, int i, int i2) {
        this(z, i2, tArr.getClass().getComponentType());
        this.size = i2;
        System.arraycopy(tArr, i, this.items, 0, i2);
    }

    public void addAll(T[] tArr, int i, int i2) {
        T[] tArrResize = this.items;
        int i3 = this.size + i2;
        if (i3 > tArrResize.length) {
            tArrResize = resize(Math.max(Math.max(8, i3), (int) (this.size * 1.75f)));
        }
        System.arraycopy(tArr, i, tArrResize, this.size, i2);
        this.size = i3;
    }

    public void add(T t, T t2, T t3, T t4) {
        T[] tArrResize = this.items;
        int i = this.size;
        if (i + 3 >= tArrResize.length) {
            tArrResize = resize(Math.max(8, (int) (i * 1.8f)));
        }
        int i2 = this.size;
        tArrResize[i2] = t;
        tArrResize[i2 + 1] = t2;
        tArrResize[i2 + 2] = t3;
        tArrResize[i2 + 3] = t4;
        this.size = i2 + 4;
    }
}
