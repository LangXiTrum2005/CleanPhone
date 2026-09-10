package com.badlogic.gdx.utils;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public class IntMap<V> implements Iterable<Entry<V>> {
    private transient Entries entries1;
    private transient Entries entries2;
    boolean hasZeroValue;
    int[] keyTable;
    private transient Keys keys1;
    private transient Keys keys2;
    private final float loadFactor;
    protected int mask;
    protected int shift;
    public int size;
    private int threshold;
    V[] valueTable;
    private transient Values values1;
    private transient Values values2;
    V zeroValue;

    public static class Entries<V> extends MapIterator<V> implements Iterable<Entry<V>>, Iterator<Entry<V>> {
        private final Entry<V> entry;

        public Entries(IntMap intMap) {
            super(intMap);
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
        public Iterator<Entry<V>> iterator() {
            return this;
        }

        @Override // com.badlogic.gdx.utils.IntMap.MapIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.IntMap.MapIterator
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        @Override // java.util.Iterator
        public Entry<V> next() {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            if (!this.valid) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            IntMap<V> intMap = this.map;
            int[] iArr = intMap.keyTable;
            int i = this.nextIndex;
            if (i == -1) {
                Entry<V> entry = this.entry;
                entry.key = 0;
                entry.value = intMap.zeroValue;
            } else {
                Entry<V> entry2 = this.entry;
                entry2.key = iArr[i];
                entry2.value = intMap.valueTable[i];
            }
            this.currentIndex = i;
            findNextIndex();
            return this.entry;
        }
    }

    public static class Entry<V> {
        public int key;

        @Null
        public V value;

        public String toString() {
            return this.key + "=" + this.value;
        }
    }

    public static class MapIterator<V> {
        private static final int INDEX_ILLEGAL = -2;
        static final int INDEX_ZERO = -1;
        int currentIndex;
        public boolean hasNext;
        final IntMap<V> map;
        int nextIndex;
        boolean valid = true;

        public MapIterator(IntMap<V> intMap) {
            this.map = intMap;
            reset();
        }

        public void findNextIndex() {
            int i;
            int[] iArr = this.map.keyTable;
            int length = iArr.length;
            do {
                i = this.nextIndex + 1;
                this.nextIndex = i;
                if (i >= length) {
                    this.hasNext = false;
                    return;
                }
            } while (iArr[i] == 0);
            this.hasNext = true;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0023  */
        /* JADX WARN: Code duplicated, block: B:13:0x0031  */
        /* JADX WARN: Code duplicated, block: B:17:0x0043  */
        /* JADX WARN: Code duplicated, block: B:20:0x0055  */
        /* JADX WARN: Code duplicated, block: B:22:0x003b A[EDGE_INSN: B:22:0x003b->B:15:0x003b BREAK  A[LOOP:0: B:9:0x001e->B:14:0x0038], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:24:0x0038 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0012 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:8:0x0014  */
        public void remove() {
            int[] iArr;
            V[] vArr;
            int i;
            int i2;
            int i3;
            int i4;
            int iPlace;
            int i5 = this.currentIndex;
            if (i5 == -1) {
                IntMap<V> intMap = this.map;
                if (intMap.hasZeroValue) {
                    intMap.hasZeroValue = false;
                    intMap.zeroValue = null;
                } else {
                    if (i5 >= 0) {
                        throw new IllegalStateException("next must be called before remove.");
                    }
                    IntMap<V> intMap2 = this.map;
                    iArr = intMap2.keyTable;
                    vArr = intMap2.valueTable;
                    i = intMap2.mask;
                    i2 = i5 + 1;
                    while (true) {
                        i3 = i2 & i;
                        i4 = iArr[i3];
                        if (i4 != 0) {
                            break;
                        }
                        iPlace = this.map.place(i4);
                        if (((i3 - iPlace) & i) > ((i5 - iPlace) & i)) {
                            iArr[i5] = i4;
                            vArr[i5] = vArr[i3];
                            i5 = i3;
                        }
                        i2 = i3 + 1;
                    }
                    iArr[i5] = 0;
                    vArr[i5] = null;
                    if (i5 != this.currentIndex) {
                        this.nextIndex--;
                    }
                }
            } else {
                if (i5 >= 0) {
                    throw new IllegalStateException("next must be called before remove.");
                }
                IntMap<V> intMap3 = this.map;
                iArr = intMap3.keyTable;
                vArr = intMap3.valueTable;
                i = intMap3.mask;
                i2 = i5 + 1;
                while (true) {
                    i3 = i2 & i;
                    i4 = iArr[i3];
                    if (i4 != 0) {
                        break;
                        break;
                    }
                    iPlace = this.map.place(i4);
                    if (((i3 - iPlace) & i) > ((i5 - iPlace) & i)) {
                        iArr[i5] = i4;
                        vArr[i5] = vArr[i3];
                        i5 = i3;
                    }
                    i2 = i3 + 1;
                }
                iArr[i5] = 0;
                vArr[i5] = null;
                if (i5 != this.currentIndex) {
                    this.nextIndex--;
                }
            }
            this.currentIndex = -2;
            this.map.size--;
        }

        public void reset() {
            this.currentIndex = -2;
            this.nextIndex = -1;
            if (this.map.hasZeroValue) {
                this.hasNext = true;
            } else {
                findNextIndex();
            }
        }
    }

    public static class Values<V> extends MapIterator<V> implements Iterable<V>, Iterator<V> {
        public Values(IntMap<V> intMap) {
            super(intMap);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.valid) {
                return this.hasNext;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // java.lang.Iterable
        public Iterator<V> iterator() {
            return this;
        }

        @Override // java.util.Iterator
        @Null
        public V next() {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            if (!this.valid) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            int i = this.nextIndex;
            V v = i == -1 ? this.map.zeroValue : this.map.valueTable[i];
            this.currentIndex = i;
            findNextIndex();
            return v;
        }

        @Override // com.badlogic.gdx.utils.IntMap.MapIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.IntMap.MapIterator
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        public Array<V> toArray() {
            Array<V> array = new Array<>(true, this.map.size);
            while (this.hasNext) {
                array.add(next());
            }
            return array;
        }
    }

    public IntMap() {
        this(51, 0.8f);
    }

    private int locateKey(int i) {
        int[] iArr = this.keyTable;
        int iPlace = place(i);
        while (true) {
            int i2 = iArr[iPlace];
            if (i2 == 0) {
                return -(iPlace + 1);
            }
            if (i2 == i) {
                return iPlace;
            }
            iPlace = (iPlace + 1) & this.mask;
        }
    }

    private void putResize(int i, @Null V v) {
        int[] iArr = this.keyTable;
        int iPlace = place(i);
        while (iArr[iPlace] != 0) {
            iPlace = (iPlace + 1) & this.mask;
        }
        iArr[iPlace] = i;
        this.valueTable[iPlace] = v;
    }

    private void resize(int i) {
        int length = this.keyTable.length;
        this.threshold = (int) (i * this.loadFactor);
        int i2 = i - 1;
        this.mask = i2;
        this.shift = Long.numberOfLeadingZeros(i2);
        int[] iArr = this.keyTable;
        V[] vArr = this.valueTable;
        this.keyTable = new int[i];
        this.valueTable = (V[]) new Object[i];
        if (this.size > 0) {
            for (int i3 = 0; i3 < length; i3++) {
                int i4 = iArr[i3];
                if (i4 != 0) {
                    putResize(i4, vArr[i3]);
                }
            }
        }
    }

    public void clear(int i) {
        int iTableSize = ObjectSet.tableSize(i, this.loadFactor);
        if (this.keyTable.length <= iTableSize) {
            clear();
            return;
        }
        this.size = 0;
        this.hasZeroValue = false;
        this.zeroValue = null;
        resize(iTableSize);
    }

    public boolean containsKey(int i) {
        if (i == 0) {
            return this.hasZeroValue;
        }
        return locateKey(i) >= 0;
    }

    public boolean containsValue(@Null Object obj, boolean z) {
        V[] vArr = this.valueTable;
        if (obj == null) {
            if (this.hasZeroValue && this.zeroValue == null) {
                return true;
            }
            int[] iArr = this.keyTable;
            for (int length = vArr.length - 1; length >= 0; length--) {
                if (iArr[length] != 0 && vArr[length] == null) {
                    return true;
                }
            }
            return false;
        }
        if (z) {
            if (obj == this.zeroValue) {
                return true;
            }
            for (int length2 = vArr.length - 1; length2 >= 0; length2--) {
                if (vArr[length2] == obj) {
                    return true;
                }
            }
            return false;
        }
        if (this.hasZeroValue && obj.equals(this.zeroValue)) {
            return true;
        }
        for (int length3 = vArr.length - 1; length3 >= 0; length3--) {
            if (obj.equals(vArr[length3])) {
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

    public Entries<V> entries() {
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
            Entries<V> entries2 = this.entries2;
            entries2.valid = true;
            this.entries1.valid = false;
            return entries2;
        }
        entries.reset();
        Entries<V> entries3 = this.entries1;
        entries3.valid = true;
        this.entries2.valid = false;
        return entries3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntMap)) {
            return false;
        }
        IntMap intMap = (IntMap) obj;
        if (intMap.size != this.size) {
            return false;
        }
        boolean z = intMap.hasZeroValue;
        boolean z2 = this.hasZeroValue;
        if (z != z2) {
            return false;
        }
        if (z2) {
            V v = intMap.zeroValue;
            if (v == null) {
                if (this.zeroValue != null) {
                    return false;
                }
            } else if (!v.equals(this.zeroValue)) {
                return false;
            }
        }
        int[] iArr = this.keyTable;
        V[] vArr = this.valueTable;
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                V v2 = vArr[i];
                if (v2 == null) {
                    if (intMap.get(i2, ObjectMap.dummy) != null) {
                        return false;
                    }
                } else if (!v2.equals(intMap.get(i2))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean equalsIdentity(@Null Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntMap)) {
            return false;
        }
        IntMap intMap = (IntMap) obj;
        if (intMap.size != this.size) {
            return false;
        }
        boolean z = intMap.hasZeroValue;
        boolean z2 = this.hasZeroValue;
        if (z != z2) {
            return false;
        }
        if (z2 && this.zeroValue != intMap.zeroValue) {
            return false;
        }
        int[] iArr = this.keyTable;
        V[] vArr = this.valueTable;
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            if (i2 != 0 && vArr[i] != intMap.get(i2, ObjectMap.dummy)) {
                return false;
            }
        }
        return true;
    }

    public int findKey(@Null Object obj, boolean z, int i) {
        V[] vArr = this.valueTable;
        if (obj == null) {
            if (this.hasZeroValue && this.zeroValue == null) {
                return 0;
            }
            int[] iArr = this.keyTable;
            for (int length = vArr.length - 1; length >= 0; length--) {
                int i2 = iArr[length];
                if (i2 != 0 && vArr[length] == null) {
                    return i2;
                }
            }
        } else if (z) {
            if (obj == this.zeroValue) {
                return 0;
            }
            for (int length2 = vArr.length - 1; length2 >= 0; length2--) {
                if (vArr[length2] == obj) {
                    return this.keyTable[length2];
                }
            }
        } else {
            if (this.hasZeroValue && obj.equals(this.zeroValue)) {
                return 0;
            }
            for (int length3 = vArr.length - 1; length3 >= 0; length3--) {
                if (obj.equals(vArr[length3])) {
                    return this.keyTable[length3];
                }
            }
        }
        return i;
    }

    public V get(int i) {
        if (i == 0) {
            if (this.hasZeroValue) {
                return this.zeroValue;
            }
            return null;
        }
        int iLocateKey = locateKey(i);
        if (iLocateKey >= 0) {
            return this.valueTable[iLocateKey];
        }
        return null;
    }

    public int hashCode() {
        V v;
        int iHashCode = this.size;
        if (this.hasZeroValue && (v = this.zeroValue) != null) {
            iHashCode += v.hashCode();
        }
        int[] iArr = this.keyTable;
        V[] vArr = this.valueTable;
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                int i3 = (i2 * 31) + iHashCode;
                V v2 = vArr[i];
                iHashCode = v2 != null ? v2.hashCode() + i3 : i3;
            }
        }
        return iHashCode;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<Entry<V>> iterator() {
        return entries();
    }

    public Keys keys() {
        if (Collections.allocateIterators) {
            return new Keys(this);
        }
        if (this.keys1 == null) {
            this.keys1 = new Keys(this);
            this.keys2 = new Keys(this);
        }
        Keys keys = this.keys1;
        if (keys.valid) {
            this.keys2.reset();
            Keys keys2 = this.keys2;
            keys2.valid = true;
            this.keys1.valid = false;
            return keys2;
        }
        keys.reset();
        Keys keys3 = this.keys1;
        keys3.valid = true;
        this.keys2.valid = false;
        return keys3;
    }

    public boolean notEmpty() {
        return this.size > 0;
    }

    public int place(int i) {
        return (int) ((((long) i) * (-7046029254386353131L)) >>> this.shift);
    }

    @Null
    public V put(int i, @Null V v) {
        if (i == 0) {
            V v2 = this.zeroValue;
            this.zeroValue = v;
            if (!this.hasZeroValue) {
                this.hasZeroValue = true;
                this.size++;
            }
            return v2;
        }
        int iLocateKey = locateKey(i);
        if (iLocateKey >= 0) {
            V[] vArr = this.valueTable;
            V v3 = vArr[iLocateKey];
            vArr[iLocateKey] = v;
            return v3;
        }
        int i2 = -(iLocateKey + 1);
        int[] iArr = this.keyTable;
        iArr[i2] = i;
        this.valueTable[i2] = v;
        int i3 = this.size + 1;
        this.size = i3;
        if (i3 < this.threshold) {
            return null;
        }
        resize(iArr.length << 1);
        return null;
    }

    public void putAll(IntMap<? extends V> intMap) {
        ensureCapacity(intMap.size);
        if (intMap.hasZeroValue) {
            put(0, intMap.zeroValue);
        }
        int[] iArr = intMap.keyTable;
        V[] vArr = intMap.valueTable;
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                put(i2, vArr[i]);
            }
        }
    }

    @Null
    public V remove(int i) {
        if (i == 0) {
            if (!this.hasZeroValue) {
                return null;
            }
            this.hasZeroValue = false;
            V v = this.zeroValue;
            this.zeroValue = null;
            this.size--;
            return v;
        }
        int iLocateKey = locateKey(i);
        if (iLocateKey < 0) {
            return null;
        }
        int[] iArr = this.keyTable;
        V[] vArr = this.valueTable;
        V v2 = vArr[iLocateKey];
        int i2 = this.mask;
        int i3 = iLocateKey + 1;
        while (true) {
            int i4 = i3 & i2;
            int i5 = iArr[i4];
            if (i5 == 0) {
                iArr[iLocateKey] = 0;
                vArr[iLocateKey] = null;
                this.size--;
                return v2;
            }
            int iPlace = place(i5);
            if (((i4 - iPlace) & i2) > ((iLocateKey - iPlace) & i2)) {
                iArr[iLocateKey] = i5;
                vArr[iLocateKey] = vArr[i4];
                iLocateKey = i4;
            }
            i3 = i4 + 1;
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

    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX WARN: Code duplicated, block: B:21:0x0048 A[EDGE_INSN: B:21:0x0048->B:15:0x003e BREAK  A[LOOP:0: B:9:0x0029->B:13:0x0031]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x003e -> B:16:0x003f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.String toString() {
        /*
            r7 = this;
            int r0 = r7.size
            if (r0 != 0) goto L7
            java.lang.String r0 = "[]"
            return r0
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 32
            r0.<init>(r1)
            r1 = 91
            r0.append(r1)
            int[] r1 = r7.keyTable
            V[] r2 = r7.valueTable
            int r3 = r1.length
            boolean r4 = r7.hasZeroValue
            r5 = 61
            if (r4 == 0) goto L29
            java.lang.String r4 = "0="
            r0.append(r4)
            V r4 = r7.zeroValue
            r0.append(r4)
            goto L3f
        L29:
            int r4 = r3 + (-1)
            if (r3 <= 0) goto L3e
            r3 = r1[r4]
            if (r3 != 0) goto L33
            r3 = r4
            goto L29
        L33:
            r0.append(r3)
            r0.append(r5)
            r3 = r2[r4]
            r0.append(r3)
        L3e:
            r3 = r4
        L3f:
            int r4 = r3 + (-1)
            if (r3 <= 0) goto L59
            r3 = r1[r4]
            if (r3 != 0) goto L48
            goto L3e
        L48:
            java.lang.String r6 = ", "
            r0.append(r6)
            r0.append(r3)
            r0.append(r5)
            r3 = r2[r4]
            r0.append(r3)
            goto L3e
        L59:
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.IntMap.toString():java.lang.String");
    }

    public Values<V> values() {
        if (Collections.allocateIterators) {
            return new Values<>(this);
        }
        if (this.values1 == null) {
            this.values1 = new Values(this);
            this.values2 = new Values(this);
        }
        Values values = this.values1;
        if (values.valid) {
            this.values2.reset();
            Values<V> values2 = this.values2;
            values2.valid = true;
            this.values1.valid = false;
            return values2;
        }
        values.reset();
        Values<V> values3 = this.values1;
        values3.valid = true;
        this.values2.valid = false;
        return values3;
    }

    public IntMap(int i) {
        this(i, 0.8f);
    }

    public static class Keys extends MapIterator {
        public Keys(IntMap intMap) {
            super(intMap);
        }

        public int next() {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            if (!this.valid) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            int i = this.nextIndex;
            int i2 = i == -1 ? 0 : this.map.keyTable[i];
            this.currentIndex = i;
            findNextIndex();
            return i2;
        }

        @Override // com.badlogic.gdx.utils.IntMap.MapIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.IntMap.MapIterator
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        public IntArray toArray() {
            IntArray intArray = new IntArray(true, this.map.size);
            while (this.hasNext) {
                intArray.add(next());
            }
            return intArray;
        }

        public IntArray toArray(IntArray intArray) {
            while (this.hasNext) {
                intArray.add(next());
            }
            return intArray;
        }
    }

    public IntMap(int i, float f) {
        if (f > 0.0f && f < 1.0f) {
            this.loadFactor = f;
            int iTableSize = ObjectSet.tableSize(i, f);
            this.threshold = (int) (iTableSize * f);
            int i2 = iTableSize - 1;
            this.mask = i2;
            this.shift = Long.numberOfLeadingZeros(i2);
            this.keyTable = new int[iTableSize];
            this.valueTable = (V[]) new Object[iTableSize];
            return;
        }
        throw new IllegalArgumentException(DM.g("loadFactor must be > 0 and < 1: ", f));
    }

    public V get(int i, @Null V v) {
        if (i == 0) {
            return this.hasZeroValue ? this.zeroValue : v;
        }
        int iLocateKey = locateKey(i);
        return iLocateKey >= 0 ? this.valueTable[iLocateKey] : v;
    }

    public void clear() {
        if (this.size == 0) {
            return;
        }
        this.size = 0;
        Arrays.fill(this.keyTable, 0);
        Arrays.fill(this.valueTable, (Object) null);
        this.zeroValue = null;
        this.hasZeroValue = false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IntMap(IntMap<? extends V> intMap) {
        float length = intMap.keyTable.length;
        float f = intMap.loadFactor;
        this((int) (length * f), f);
        int[] iArr = intMap.keyTable;
        System.arraycopy(iArr, 0, this.keyTable, 0, iArr.length);
        Object[] objArr = intMap.valueTable;
        System.arraycopy(objArr, 0, this.valueTable, 0, objArr.length);
        this.size = intMap.size;
        this.zeroValue = intMap.zeroValue;
        this.hasZeroValue = intMap.hasZeroValue;
    }
}
