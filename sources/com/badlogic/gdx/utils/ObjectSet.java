package com.badlogic.gdx.utils;

import com.badlogic.gdx.math.MathUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public class ObjectSet<T> implements Iterable<T> {
    private transient ObjectSetIterator iterator1;
    private transient ObjectSetIterator iterator2;
    T[] keyTable;
    float loadFactor;
    protected int mask;
    protected int shift;
    public int size;
    int threshold;

    public ObjectSet() {
        this(51, 0.8f);
    }

    private void addResize(T t) {
        T[] tArr = this.keyTable;
        int iPlace = place(t);
        while (tArr[iPlace] != null) {
            iPlace = (iPlace + 1) & this.mask;
        }
        tArr[iPlace] = t;
    }

    private void resize(int i) {
        int length = this.keyTable.length;
        this.threshold = (int) (i * this.loadFactor);
        int i2 = i - 1;
        this.mask = i2;
        this.shift = Long.numberOfLeadingZeros(i2);
        T[] tArr = this.keyTable;
        this.keyTable = (T[]) new Object[i];
        if (this.size > 0) {
            for (int i3 = 0; i3 < length; i3++) {
                T t = tArr[i3];
                if (t != null) {
                    addResize(t);
                }
            }
        }
    }

    public static int tableSize(int i, float f) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC3950lJ.p("capacity must be >= 0: ", i));
        }
        int iNextPowerOfTwo = MathUtils.nextPowerOfTwo(Math.max(2, (int) Math.ceil(i / f)));
        if (iNextPowerOfTwo <= 1073741824) {
            return iNextPowerOfTwo;
        }
        throw new IllegalArgumentException(AbstractC3950lJ.p("The required capacity is too large: ", i));
    }

    public static <T> ObjectSet<T> with(T... tArr) {
        ObjectSet<T> objectSet = new ObjectSet<>();
        objectSet.addAll(tArr);
        return objectSet;
    }

    public boolean add(T t) {
        int iLocateKey = locateKey(t);
        if (iLocateKey >= 0) {
            return false;
        }
        T[] tArr = this.keyTable;
        tArr[-(iLocateKey + 1)] = t;
        int i = this.size + 1;
        this.size = i;
        if (i >= this.threshold) {
            resize(tArr.length << 1);
        }
        return true;
    }

    public void addAll(Array<? extends T> array) {
        addAll(array.items, 0, array.size);
    }

    public void clear(int i) {
        int iTableSize = tableSize(i, this.loadFactor);
        if (this.keyTable.length <= iTableSize) {
            clear();
        } else {
            this.size = 0;
            resize(iTableSize);
        }
    }

    public boolean contains(T t) {
        return locateKey(t) >= 0;
    }

    public void ensureCapacity(int i) {
        int iTableSize = tableSize(this.size + i, this.loadFactor);
        if (this.keyTable.length < iTableSize) {
            resize(iTableSize);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ObjectSet)) {
            return false;
        }
        ObjectSet objectSet = (ObjectSet) obj;
        if (objectSet.size != this.size) {
            return false;
        }
        for (T t : this.keyTable) {
            if (t != null && !objectSet.contains(t)) {
                return false;
            }
        }
        return true;
    }

    public T first() {
        for (T t : this.keyTable) {
            if (t != null) {
                return t;
            }
        }
        throw new IllegalStateException("ObjectSet is empty.");
    }

    @Null
    public T get(T t) {
        int iLocateKey = locateKey(t);
        if (iLocateKey < 0) {
            return null;
        }
        return this.keyTable[iLocateKey];
    }

    public int hashCode() {
        int iHashCode = this.size;
        for (T t : this.keyTable) {
            if (t != null) {
                iHashCode = t.hashCode() + iHashCode;
            }
        }
        return iHashCode;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int locateKey(T t) {
        if (t == null) {
            throw new IllegalArgumentException("key cannot be null.");
        }
        T[] tArr = this.keyTable;
        int iPlace = place(t);
        while (true) {
            T t2 = tArr[iPlace];
            if (t2 == null) {
                return -(iPlace + 1);
            }
            if (t2.equals(t)) {
                return iPlace;
            }
            iPlace = (iPlace + 1) & this.mask;
        }
    }

    public boolean notEmpty() {
        return this.size > 0;
    }

    public int place(T t) {
        return (int) ((((long) t.hashCode()) * (-7046029254386353131L)) >>> this.shift);
    }

    public boolean remove(T t) {
        int iLocateKey = locateKey(t);
        if (iLocateKey < 0) {
            return false;
        }
        T[] tArr = this.keyTable;
        int i = this.mask;
        int i2 = iLocateKey + 1;
        while (true) {
            int i3 = i2 & i;
            T t2 = tArr[i3];
            if (t2 == null) {
                tArr[iLocateKey] = null;
                this.size--;
                return true;
            }
            int iPlace = place(t2);
            if (((i3 - iPlace) & i) > ((iLocateKey - iPlace) & i)) {
                tArr[iLocateKey] = t2;
                iLocateKey = i3;
            }
            i2 = i3 + 1;
        }
    }

    public void shrink(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC3950lJ.p("maximumCapacity must be >= 0: ", i));
        }
        int iTableSize = tableSize(i, this.loadFactor);
        if (this.keyTable.length > iTableSize) {
            resize(iTableSize);
        }
    }

    public String toString() {
        return "{" + toString(", ") + '}';
    }

    public static class ObjectSetIterator<K> implements Iterable<K>, Iterator<K> {
        int currentIndex;
        public boolean hasNext;
        int nextIndex;
        final ObjectSet<K> set;
        boolean valid = true;

        public ObjectSetIterator(ObjectSet<K> objectSet) {
            this.set = objectSet;
            reset();
        }

        private void findNextIndex() {
            int i;
            K[] kArr = this.set.keyTable;
            int length = kArr.length;
            do {
                i = this.nextIndex + 1;
                this.nextIndex = i;
                if (i >= length) {
                    this.hasNext = false;
                    return;
                }
            } while (kArr[i] == null);
            this.hasNext = true;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.valid) {
                return this.hasNext;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // java.lang.Iterable
        public ObjectSetIterator<K> iterator() {
            return this;
        }

        @Override // java.util.Iterator
        public K next() {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            if (!this.valid) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            K[] kArr = this.set.keyTable;
            int i = this.nextIndex;
            K k = kArr[i];
            this.currentIndex = i;
            findNextIndex();
            return k;
        }

        @Override // java.util.Iterator
        public void remove() {
            int i = this.currentIndex;
            if (i < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            ObjectSet<K> objectSet = this.set;
            K[] kArr = objectSet.keyTable;
            int i2 = objectSet.mask;
            int i3 = i + 1;
            while (true) {
                int i4 = i3 & i2;
                K k = kArr[i4];
                if (k == null) {
                    break;
                }
                int iPlace = this.set.place(k);
                if (((i4 - iPlace) & i2) > ((i - iPlace) & i2)) {
                    kArr[i] = k;
                    i = i4;
                }
                i3 = i4 + 1;
            }
            kArr[i] = null;
            this.set.size--;
            if (i != this.currentIndex) {
                this.nextIndex--;
            }
            this.currentIndex = -1;
        }

        public void reset() {
            this.currentIndex = -1;
            this.nextIndex = -1;
            findNextIndex();
        }

        public Array<K> toArray(Array<K> array) {
            while (this.hasNext) {
                array.add(next());
            }
            return array;
        }

        public Array<K> toArray() {
            return toArray(new Array<>(true, this.set.size));
        }
    }

    public ObjectSet(int i) {
        this(i, 0.8f);
    }

    public void addAll(Array<? extends T> array, int i, int i2) {
        if (i + i2 <= array.size) {
            addAll(array.items, i, i2);
        } else {
            java.lang.StringBuilder sbT = AbstractC3950lJ.t("offset + length must be <= size: ", i, " + ", i2, " <= ");
            sbT.append(array.size);
            throw new IllegalArgumentException(sbT.toString());
        }
    }

    @Override // java.lang.Iterable
    public ObjectSetIterator<T> iterator() {
        if (Collections.allocateIterators) {
            return new ObjectSetIterator<>(this);
        }
        if (this.iterator1 == null) {
            this.iterator1 = new ObjectSetIterator(this);
            this.iterator2 = new ObjectSetIterator(this);
        }
        ObjectSetIterator objectSetIterator = this.iterator1;
        if (objectSetIterator.valid) {
            this.iterator2.reset();
            ObjectSetIterator<T> objectSetIterator2 = this.iterator2;
            objectSetIterator2.valid = true;
            this.iterator1.valid = false;
            return objectSetIterator2;
        }
        objectSetIterator.reset();
        ObjectSetIterator<T> objectSetIterator3 = this.iterator1;
        objectSetIterator3.valid = true;
        this.iterator2.valid = false;
        return objectSetIterator3;
    }

    public String toString(String str) {
        int i;
        if (this.size == 0) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(32);
        Object[] objArr = this.keyTable;
        int length = objArr.length;
        while (true) {
            i = length - 1;
            if (length > 0) {
                Object obj = objArr[i];
                if (obj != null) {
                    if (obj == this) {
                        obj = "(this)";
                    }
                    sb.append(obj);
                    break;
                }
                length = i;
            } else {
                break;
            }
        }
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                return sb.toString();
            }
            Object obj2 = objArr[i2];
            if (obj2 != null) {
                sb.append(str);
                if (obj2 == this) {
                    obj2 = "(this)";
                }
                sb.append(obj2);
            }
            i = i2;
        }
    }

    public ObjectSet(int i, float f) {
        if (f > 0.0f && f < 1.0f) {
            this.loadFactor = f;
            int iTableSize = tableSize(i, f);
            this.threshold = (int) (iTableSize * f);
            int i2 = iTableSize - 1;
            this.mask = i2;
            this.shift = Long.numberOfLeadingZeros(i2);
            this.keyTable = (T[]) new Object[iTableSize];
            return;
        }
        throw new IllegalArgumentException(DM.g("loadFactor must be > 0 and < 1: ", f));
    }

    public void clear() {
        if (this.size == 0) {
            return;
        }
        this.size = 0;
        Arrays.fill(this.keyTable, (Object) null);
    }

    public boolean addAll(T... tArr) {
        return addAll(tArr, 0, tArr.length);
    }

    public boolean addAll(T[] tArr, int i, int i2) {
        ensureCapacity(i2);
        int i3 = this.size;
        int i4 = i2 + i;
        while (i < i4) {
            add(tArr[i]);
            i++;
        }
        return i3 != this.size;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ObjectSet(ObjectSet<? extends T> objectSet) {
        float length = objectSet.keyTable.length;
        float f = objectSet.loadFactor;
        this((int) (length * f), f);
        Object[] objArr = objectSet.keyTable;
        System.arraycopy(objArr, 0, this.keyTable, 0, objArr.length);
        this.size = objectSet.size;
    }

    public void addAll(ObjectSet<T> objectSet) {
        ensureCapacity(objectSet.size);
        for (T t : objectSet.keyTable) {
            if (t != null) {
                add(t);
            }
        }
    }
}
