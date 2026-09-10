package com.badlogic.gdx.utils;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public class ObjectFloatMap<K> implements Iterable<Entry<K>> {
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
    float[] valueTable;
    transient Values values1;
    transient Values values2;

    public static class Entries<K> extends MapIterator<K> implements Iterable<Entry<K>>, Iterator<Entry<K>> {
        Entry<K> entry;

        public Entries(ObjectFloatMap<K> objectFloatMap) {
            super(objectFloatMap);
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

        @Override // com.badlogic.gdx.utils.ObjectFloatMap.MapIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.ObjectFloatMap.MapIterator
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
            ObjectFloatMap<K> objectFloatMap = this.map;
            K[] kArr = objectFloatMap.keyTable;
            Entry<K> entry = this.entry;
            int i = this.nextIndex;
            entry.key = kArr[i];
            entry.value = objectFloatMap.valueTable[i];
            this.currentIndex = i;
            findNextIndex();
            return this.entry;
        }
    }

    public static class Entry<K> {
        public K key;
        public float value;

        public String toString() {
            return this.key + "=" + this.value;
        }
    }

    public static class Keys<K> extends MapIterator<K> implements Iterable<K>, Iterator<K> {
        public Keys(ObjectFloatMap<K> objectFloatMap) {
            super(objectFloatMap);
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

        @Override // com.badlogic.gdx.utils.ObjectFloatMap.MapIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.ObjectFloatMap.MapIterator
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
        final ObjectFloatMap<K> map;
        int nextIndex;
        boolean valid = true;

        public MapIterator(ObjectFloatMap<K> objectFloatMap) {
            this.map = objectFloatMap;
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
            ObjectFloatMap<K> objectFloatMap = this.map;
            K[] kArr = objectFloatMap.keyTable;
            float[] fArr = objectFloatMap.valueTable;
            int i2 = objectFloatMap.mask;
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
                    fArr[i] = fArr[i4];
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

    public ObjectFloatMap() {
        this(51, 0.8f);
    }

    private void putResize(K k, float f) {
        K[] kArr = this.keyTable;
        int iPlace = place(k);
        while (kArr[iPlace] != null) {
            iPlace = (iPlace + 1) & this.mask;
        }
        kArr[iPlace] = k;
        this.valueTable[iPlace] = f;
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

    public boolean containsValue(float f) {
        K[] kArr = this.keyTable;
        float[] fArr = this.valueTable;
        for (int length = fArr.length - 1; length >= 0; length--) {
            if (kArr[length] != null && fArr[length] == f) {
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
        if (!(obj instanceof ObjectFloatMap)) {
            return false;
        }
        ObjectFloatMap objectFloatMap = (ObjectFloatMap) obj;
        if (objectFloatMap.size != this.size) {
            return false;
        }
        K[] kArr = this.keyTable;
        float[] fArr = this.valueTable;
        int length = kArr.length;
        for (int i = 0; i < length; i++) {
            K k = kArr[i];
            if (k != null) {
                float f = objectFloatMap.get(k, 0.0f);
                if ((f == 0.0f && !objectFloatMap.containsKey(k)) || f != fArr[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Null
    public K findKey(float f) {
        K[] kArr = this.keyTable;
        float[] fArr = this.valueTable;
        for (int length = fArr.length - 1; length >= 0; length--) {
            K k = kArr[length];
            if (k != null && fArr[length] == f) {
                return k;
            }
        }
        return null;
    }

    public float get(K k, float f) {
        int iLocateKey = locateKey(k);
        return iLocateKey < 0 ? f : this.valueTable[iLocateKey];
    }

    public float getAndIncrement(K k, float f, float f2) {
        int iLocateKey = locateKey(k);
        if (iLocateKey >= 0) {
            float[] fArr = this.valueTable;
            float f3 = fArr[iLocateKey];
            fArr[iLocateKey] = f2 + f3;
            return f3;
        }
        int i = -(iLocateKey + 1);
        K[] kArr = this.keyTable;
        kArr[i] = k;
        this.valueTable[i] = f2 + f;
        int i2 = this.size + 1;
        this.size = i2;
        if (i2 >= this.threshold) {
            resize(kArr.length << 1);
        }
        return f;
    }

    public int hashCode() {
        int iFloatToRawIntBits = this.size;
        K[] kArr = this.keyTable;
        float[] fArr = this.valueTable;
        int length = kArr.length;
        for (int i = 0; i < length; i++) {
            K k = kArr[i];
            if (k != null) {
                iFloatToRawIntBits = NumberUtils.floatToRawIntBits(fArr[i]) + k.hashCode() + iFloatToRawIntBits;
            }
        }
        return iFloatToRawIntBits;
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

    public void put(K k, float f) {
        int iLocateKey = locateKey(k);
        if (iLocateKey >= 0) {
            this.valueTable[iLocateKey] = f;
            return;
        }
        int i = -(iLocateKey + 1);
        K[] kArr = this.keyTable;
        kArr[i] = k;
        this.valueTable[i] = f;
        int i2 = this.size + 1;
        this.size = i2;
        if (i2 >= this.threshold) {
            resize(kArr.length << 1);
        }
    }

    public void putAll(ObjectFloatMap<? extends K> objectFloatMap) {
        ensureCapacity(objectFloatMap.size);
        K[] kArr = objectFloatMap.keyTable;
        float[] fArr = objectFloatMap.valueTable;
        int length = kArr.length;
        for (int i = 0; i < length; i++) {
            K k = kArr[i];
            if (k != null) {
                put(k, fArr[i]);
            }
        }
    }

    public float remove(K k, float f) {
        int iLocateKey = locateKey(k);
        if (iLocateKey < 0) {
            return f;
        }
        K[] kArr = this.keyTable;
        float[] fArr = this.valueTable;
        float f2 = fArr[iLocateKey];
        int i = this.mask;
        int i2 = iLocateKey + 1;
        while (true) {
            int i3 = i2 & i;
            K k2 = kArr[i3];
            if (k2 == null) {
                kArr[iLocateKey] = null;
                this.size--;
                return f2;
            }
            int iPlace = place(k2);
            if (((i3 - iPlace) & i) > ((iLocateKey - iPlace) & i)) {
                kArr[iLocateKey] = k2;
                fArr[iLocateKey] = fArr[i3];
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
        float[] fArr = this.valueTable;
        this.keyTable = (K[]) new Object[i];
        this.valueTable = new float[i];
        if (this.size > 0) {
            for (int i3 = 0; i3 < length; i3++) {
                K k = kArr[i3];
                if (k != null) {
                    putResize(k, fArr[i3]);
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

    public ObjectFloatMap(int i) {
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
        public Values(ObjectFloatMap<?> objectFloatMap) {
            super(objectFloatMap);
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

        public float next() {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            if (!this.valid) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            float[] fArr = this.map.valueTable;
            int i = this.nextIndex;
            float f = fArr[i];
            this.currentIndex = i;
            findNextIndex();
            return f;
        }

        @Override // com.badlogic.gdx.utils.ObjectFloatMap.MapIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.ObjectFloatMap.MapIterator
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        public FloatArray toArray() {
            FloatArray floatArray = new FloatArray(true, this.map.size);
            while (this.hasNext) {
                floatArray.add(next());
            }
            return floatArray;
        }

        public FloatArray toArray(FloatArray floatArray) {
            while (this.hasNext) {
                floatArray.add(next());
            }
            return floatArray;
        }
    }

    public ObjectFloatMap(int i, float f) {
        if (f > 0.0f && f < 1.0f) {
            this.loadFactor = f;
            int iTableSize = ObjectSet.tableSize(i, f);
            this.threshold = (int) (iTableSize * f);
            int i2 = iTableSize - 1;
            this.mask = i2;
            this.shift = Long.numberOfLeadingZeros(i2);
            this.keyTable = (K[]) new Object[iTableSize];
            this.valueTable = new float[iTableSize];
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
        float[] fArr = this.valueTable;
        int length = kArr.length;
        while (true) {
            i = length - 1;
            if (length > 0) {
                K k = kArr[i];
                if (k != null) {
                    sb.append(k);
                    sb.append('=');
                    sb.append(fArr[i]);
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
                sb.append(fArr[i2]);
            }
            i = i2;
        }
        if (z) {
            sb.append('}');
        }
        return sb.toString();
    }

    public boolean containsValue(float f, float f2) {
        K[] kArr = this.keyTable;
        float[] fArr = this.valueTable;
        for (int length = fArr.length - 1; length >= 0; length--) {
            if (kArr[length] != null && Math.abs(fArr[length] - f) <= f2) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        if (this.size == 0) {
            return;
        }
        this.size = 0;
        Arrays.fill(this.keyTable, (Object) null);
    }

    @Null
    public K findKey(float f, float f2) {
        K[] kArr = this.keyTable;
        float[] fArr = this.valueTable;
        for (int length = fArr.length - 1; length >= 0; length--) {
            K k = kArr[length];
            if (k != null && Math.abs(fArr[length] - f) <= f2) {
                return k;
            }
        }
        return null;
    }

    public float put(K k, float f, float f2) {
        int iLocateKey = locateKey(k);
        if (iLocateKey >= 0) {
            float[] fArr = this.valueTable;
            float f3 = fArr[iLocateKey];
            fArr[iLocateKey] = f;
            return f3;
        }
        int i = -(iLocateKey + 1);
        K[] kArr = this.keyTable;
        kArr[i] = k;
        this.valueTable[i] = f;
        int i2 = this.size + 1;
        this.size = i2;
        if (i2 >= this.threshold) {
            resize(kArr.length << 1);
        }
        return f2;
    }

    public ObjectFloatMap(ObjectFloatMap<? extends K> objectFloatMap) {
        this((int) Math.floor(objectFloatMap.keyTable.length * objectFloatMap.loadFactor), objectFloatMap.loadFactor);
        Object[] objArr = objectFloatMap.keyTable;
        System.arraycopy(objArr, 0, this.keyTable, 0, objArr.length);
        float[] fArr = objectFloatMap.valueTable;
        System.arraycopy(fArr, 0, this.valueTable, 0, fArr.length);
        this.size = objectFloatMap.size;
    }
}
