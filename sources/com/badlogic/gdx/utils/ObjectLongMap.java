package com.badlogic.gdx.utils;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public class ObjectLongMap<K> implements Iterable<Entry<K>> {
    transient Entries entries1;
    transient Entries entries2;
    K[] keyTable;
    transient Keys keys1;
    transient Keys keys2;
    float loadFactor;
    protected int mask;
    protected int shift;
    public int size;
    int threshold;
    long[] valueTable;
    transient Values values1;
    transient Values values2;

    public static class Entries<K> extends MapIterator<K> implements Iterable<Entry<K>>, Iterator<Entry<K>> {
        Entry<K> entry;

        public Entries(ObjectLongMap<K> objectLongMap) {
            super(objectLongMap);
            this.entry = new Entry<>();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.valid) {
                return this.hasNext;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // java.lang.Iterable
        public Entries<K> iterator() {
            return this;
        }

        @Override // com.badlogic.gdx.utils.ObjectLongMap.MapIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.ObjectLongMap.MapIterator
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        @Override // java.util.Iterator
        public Entry<K> next() {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            if (!this.valid) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            ObjectLongMap<K> objectLongMap = this.map;
            K[] kArr = objectLongMap.keyTable;
            Entry<K> entry = this.entry;
            int i = this.nextIndex;
            entry.key = kArr[i];
            entry.value = objectLongMap.valueTable[i];
            this.currentIndex = i;
            findNextIndex();
            return this.entry;
        }
    }

    public static class Entry<K> {
        public K key;
        public long value;

        public String toString() {
            return this.key + "=" + this.value;
        }
    }

    public static class Keys<K> extends MapIterator<K> implements Iterable<K>, Iterator<K> {
        public Keys(ObjectLongMap<K> objectLongMap) {
            super(objectLongMap);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.valid) {
                return this.hasNext;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // java.lang.Iterable
        public Keys<K> iterator() {
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
            K[] kArr = this.map.keyTable;
            int i = this.nextIndex;
            K k = kArr[i];
            this.currentIndex = i;
            findNextIndex();
            return k;
        }

        @Override // com.badlogic.gdx.utils.ObjectLongMap.MapIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.ObjectLongMap.MapIterator
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        public Array<K> toArray() {
            return toArray(new Array<>(true, this.map.size));
        }

        public Array<K> toArray(Array<K> array) {
            while (this.hasNext) {
                array.add(next());
            }
            return array;
        }
    }

    public static class MapIterator<K> {
        int currentIndex;
        public boolean hasNext;
        final ObjectLongMap<K> map;
        int nextIndex;
        boolean valid = true;

        public MapIterator(ObjectLongMap<K> objectLongMap) {
            this.map = objectLongMap;
            reset();
        }

        public void findNextIndex() {
            int i;
            K[] kArr = this.map.keyTable;
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

        public void remove() {
            int i = this.currentIndex;
            if (i < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            ObjectLongMap<K> objectLongMap = this.map;
            K[] kArr = objectLongMap.keyTable;
            long[] jArr = objectLongMap.valueTable;
            int i2 = objectLongMap.mask;
            int i3 = i + 1;
            while (true) {
                int i4 = i3 & i2;
                K k = kArr[i4];
                if (k == null) {
                    break;
                }
                int iPlace = this.map.place(k);
                if (((i4 - iPlace) & i2) > ((i - iPlace) & i2)) {
                    kArr[i] = k;
                    jArr[i] = jArr[i4];
                    i = i4;
                }
                i3 = i4 + 1;
            }
            kArr[i] = null;
            this.map.size--;
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
    }

    public ObjectLongMap() {
        this(51, 0.8f);
    }

    private void putResize(K k, long j) {
        K[] kArr = this.keyTable;
        int iPlace = place(k);
        while (kArr[iPlace] != null) {
            iPlace = (iPlace + 1) & this.mask;
        }
        kArr[iPlace] = k;
        this.valueTable[iPlace] = j;
    }

    public void clear(int i) {
        int iTableSize = ObjectSet.tableSize(i, this.loadFactor);
        if (this.keyTable.length <= iTableSize) {
            clear();
        } else {
            this.size = 0;
            resize(iTableSize);
        }
    }

    public boolean containsKey(K k) {
        return locateKey(k) >= 0;
    }

    public boolean containsValue(long j) {
        K[] kArr = this.keyTable;
        long[] jArr = this.valueTable;
        for (int length = jArr.length - 1; length >= 0; length--) {
            if (kArr[length] != null && jArr[length] == j) {
                return true;
            }
        }
        return false;
    }

    public void ensureCapacity(int i) {
        int iTableSize = ObjectSet.tableSize(this.size + i, this.loadFactor);
        if (this.keyTable.length < iTableSize) {
            resize(iTableSize);
        }
    }

    public Entries<K> entries() {
        if (Collections.allocateIterators) {
            return new Entries<>(this);
        }
        if (this.entries1 == null) {
            this.entries1 = new Entries(this);
            this.entries2 = new Entries(this);
        }
        Entries entries = this.entries1;
        if (entries.valid) {
            this.entries2.reset();
            Entries<K> entries2 = this.entries2;
            entries2.valid = true;
            this.entries1.valid = false;
            return entries2;
        }
        entries.reset();
        Entries<K> entries3 = this.entries1;
        entries3.valid = true;
        this.entries2.valid = false;
        return entries3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ObjectLongMap)) {
            return false;
        }
        ObjectLongMap objectLongMap = (ObjectLongMap) obj;
        if (objectLongMap.size != this.size) {
            return false;
        }
        K[] kArr = this.keyTable;
        long[] jArr = this.valueTable;
        int length = kArr.length;
        for (int i = 0; i < length; i++) {
            K k = kArr[i];
            if (k != null) {
                long j = objectLongMap.get(k, 0L);
                if ((j == 0 && !objectLongMap.containsKey(k)) || j != jArr[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Null
    public K findKey(long j) {
        K[] kArr = this.keyTable;
        long[] jArr = this.valueTable;
        for (int length = jArr.length - 1; length >= 0; length--) {
            K k = kArr[length];
            if (k != null && jArr[length] == j) {
                return k;
            }
        }
        return null;
    }

    public long get(K k, long j) {
        int iLocateKey = locateKey(k);
        return iLocateKey < 0 ? j : this.valueTable[iLocateKey];
    }

    public long getAndIncrement(K k, long j, long j2) {
        int iLocateKey = locateKey(k);
        if (iLocateKey >= 0) {
            long[] jArr = this.valueTable;
            long j3 = jArr[iLocateKey];
            jArr[iLocateKey] = j2 + j3;
            return j3;
        }
        int i = -(iLocateKey + 1);
        K[] kArr = this.keyTable;
        kArr[i] = k;
        this.valueTable[i] = j2 + j;
        int i2 = this.size + 1;
        this.size = i2;
        if (i2 >= this.threshold) {
            resize(kArr.length << 1);
        }
        return j;
    }

    public int hashCode() {
        int iHashCode = this.size;
        K[] kArr = this.keyTable;
        long[] jArr = this.valueTable;
        int length = kArr.length;
        for (int i = 0; i < length; i++) {
            K k = kArr[i];
            if (k != null) {
                iHashCode = (int) (((long) k.hashCode()) + jArr[i] + ((long) iHashCode));
            }
        }
        return iHashCode;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public Keys<K> keys() {
        if (Collections.allocateIterators) {
            return new Keys<>(this);
        }
        if (this.keys1 == null) {
            this.keys1 = new Keys(this);
            this.keys2 = new Keys(this);
        }
        Keys keys = this.keys1;
        if (keys.valid) {
            this.keys2.reset();
            Keys<K> keys2 = this.keys2;
            keys2.valid = true;
            this.keys1.valid = false;
            return keys2;
        }
        keys.reset();
        Keys<K> keys3 = this.keys1;
        keys3.valid = true;
        this.keys2.valid = false;
        return keys3;
    }

    public int locateKey(K k) {
        if (k == null) {
            throw new IllegalArgumentException("key cannot be null.");
        }
        K[] kArr = this.keyTable;
        int iPlace = place(k);
        while (true) {
            K k2 = kArr[iPlace];
            if (k2 == null) {
                return -(iPlace + 1);
            }
            if (k2.equals(k)) {
                return iPlace;
            }
            iPlace = (iPlace + 1) & this.mask;
        }
    }

    public boolean notEmpty() {
        return this.size > 0;
    }

    public int place(K k) {
        return (int) ((((long) k.hashCode()) * (-7046029254386353131L)) >>> this.shift);
    }

    public void put(K k, long j) {
        int iLocateKey = locateKey(k);
        if (iLocateKey >= 0) {
            this.valueTable[iLocateKey] = j;
            return;
        }
        int i = -(iLocateKey + 1);
        K[] kArr = this.keyTable;
        kArr[i] = k;
        this.valueTable[i] = j;
        int i2 = this.size + 1;
        this.size = i2;
        if (i2 >= this.threshold) {
            resize(kArr.length << 1);
        }
    }

    public void putAll(ObjectLongMap<? extends K> objectLongMap) {
        ensureCapacity(objectLongMap.size);
        K[] kArr = objectLongMap.keyTable;
        long[] jArr = objectLongMap.valueTable;
        int length = kArr.length;
        for (int i = 0; i < length; i++) {
            K k = kArr[i];
            if (k != null) {
                put(k, jArr[i]);
            }
        }
    }

    public long remove(K k, long j) {
        int iLocateKey = locateKey(k);
        if (iLocateKey < 0) {
            return j;
        }
        K[] kArr = this.keyTable;
        long[] jArr = this.valueTable;
        long j2 = jArr[iLocateKey];
        int i = this.mask;
        int i2 = iLocateKey + 1;
        while (true) {
            int i3 = i2 & i;
            K k2 = kArr[i3];
            if (k2 == null) {
                kArr[iLocateKey] = null;
                this.size--;
                return j2;
            }
            int iPlace = place(k2);
            if (((i3 - iPlace) & i) > ((iLocateKey - iPlace) & i)) {
                kArr[iLocateKey] = k2;
                jArr[iLocateKey] = jArr[i3];
                iLocateKey = i3;
            }
            i2 = i3 + 1;
        }
    }

    public final void resize(int i) {
        int length = this.keyTable.length;
        this.threshold = (int) (i * this.loadFactor);
        int i2 = i - 1;
        this.mask = i2;
        this.shift = Long.numberOfLeadingZeros(i2);
        K[] kArr = this.keyTable;
        long[] jArr = this.valueTable;
        this.keyTable = (K[]) new Object[i];
        this.valueTable = new long[i];
        if (this.size > 0) {
            for (int i3 = 0; i3 < length; i3++) {
                K k = kArr[i3];
                if (k != null) {
                    putResize(k, jArr[i3]);
                }
            }
        }
    }

    public void shrink(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC3950lJ.p("maximumCapacity must be >= 0: ", i));
        }
        int iTableSize = ObjectSet.tableSize(i, this.loadFactor);
        if (this.keyTable.length > iTableSize) {
            resize(iTableSize);
        }
    }

    public String toString(String str) {
        return toString(str, false);
    }

    public Values values() {
        if (Collections.allocateIterators) {
            return new Values(this);
        }
        if (this.values1 == null) {
            this.values1 = new Values(this);
            this.values2 = new Values(this);
        }
        Values values = this.values1;
        if (values.valid) {
            this.values2.reset();
            Values values2 = this.values2;
            values2.valid = true;
            this.values1.valid = false;
            return values2;
        }
        values.reset();
        Values values3 = this.values1;
        values3.valid = true;
        this.values2.valid = false;
        return values3;
    }

    public ObjectLongMap(int i) {
        this(i, 0.8f);
    }

    @Override // java.lang.Iterable
    public Entries<K> iterator() {
        return entries();
    }

    public String toString() {
        return toString(", ", true);
    }

    public static class Values extends MapIterator<Object> {
        public Values(ObjectLongMap<?> objectLongMap) {
            super(objectLongMap);
        }

        public boolean hasNext() {
            if (this.valid) {
                return this.hasNext;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        public Values iterator() {
            return this;
        }

        public long next() {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            if (!this.valid) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            long[] jArr = this.map.valueTable;
            int i = this.nextIndex;
            long j = jArr[i];
            this.currentIndex = i;
            findNextIndex();
            return j;
        }

        @Override // com.badlogic.gdx.utils.ObjectLongMap.MapIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.ObjectLongMap.MapIterator
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        public LongArray toArray() {
            LongArray longArray = new LongArray(true, this.map.size);
            while (this.hasNext) {
                longArray.add(next());
            }
            return longArray;
        }

        public LongArray toArray(LongArray longArray) {
            while (this.hasNext) {
                longArray.add(next());
            }
            return longArray;
        }
    }

    public ObjectLongMap(int i, float f) {
        if (f > 0.0f && f < 1.0f) {
            this.loadFactor = f;
            int iTableSize = ObjectSet.tableSize(i, f);
            this.threshold = (int) (iTableSize * f);
            int i2 = iTableSize - 1;
            this.mask = i2;
            this.shift = Long.numberOfLeadingZeros(i2);
            this.keyTable = (K[]) new Object[iTableSize];
            this.valueTable = new long[iTableSize];
            return;
        }
        throw new IllegalArgumentException(DM.g("loadFactor must be > 0 and < 1: ", f));
    }

    private String toString(String str, boolean z) {
        int i;
        if (this.size == 0) {
            return z ? "{}" : "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(32);
        if (z) {
            sb.append('{');
        }
        K[] kArr = this.keyTable;
        long[] jArr = this.valueTable;
        int length = kArr.length;
        while (true) {
            i = length - 1;
            if (length > 0) {
                K k = kArr[i];
                if (k != null) {
                    sb.append(k);
                    sb.append('=');
                    sb.append(jArr[i]);
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
                break;
            }
            K k2 = kArr[i2];
            if (k2 != null) {
                sb.append(str);
                sb.append(k2);
                sb.append('=');
                sb.append(jArr[i2]);
            }
            i = i2;
        }
        if (z) {
            sb.append('}');
        }
        return sb.toString();
    }

    public void clear() {
        if (this.size == 0) {
            return;
        }
        this.size = 0;
        Arrays.fill(this.keyTable, (Object) null);
    }

    public long put(K k, long j, long j2) {
        int iLocateKey = locateKey(k);
        if (iLocateKey >= 0) {
            long[] jArr = this.valueTable;
            long j3 = jArr[iLocateKey];
            jArr[iLocateKey] = j;
            return j3;
        }
        int i = -(iLocateKey + 1);
        K[] kArr = this.keyTable;
        kArr[i] = k;
        this.valueTable[i] = j;
        int i2 = this.size + 1;
        this.size = i2;
        if (i2 >= this.threshold) {
            resize(kArr.length << 1);
        }
        return j2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ObjectLongMap(ObjectLongMap<? extends K> objectLongMap) {
        float length = objectLongMap.keyTable.length;
        float f = objectLongMap.loadFactor;
        this((int) (length * f), f);
        Object[] objArr = objectLongMap.keyTable;
        System.arraycopy(objArr, 0, this.keyTable, 0, objArr.length);
        long[] jArr = objectLongMap.valueTable;
        System.arraycopy(jArr, 0, this.valueTable, 0, jArr.length);
        this.size = objectLongMap.size;
    }
}
