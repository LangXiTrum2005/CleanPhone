package com.badlogic.gdx.utils;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public class IntFloatMap implements Iterable<Entry> {
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
    float[] valueTable;
    private transient Values values1;
    private transient Values values2;
    float zeroValue;

    public static class Entries extends MapIterator implements Iterable<Entry>, Iterator<Entry> {
        private final Entry entry;

        public Entries(IntFloatMap intFloatMap) {
            super(intFloatMap);
            this.entry = new Entry();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.valid) {
                return this.hasNext;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // java.lang.Iterable
        public Iterator<Entry> iterator() {
            return this;
        }

        @Override // com.badlogic.gdx.utils.IntFloatMap.MapIterator, java.util.Iterator
        public void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.IntFloatMap.MapIterator
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public Entry next() {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            if (!this.valid) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            IntFloatMap intFloatMap = this.map;
            int[] iArr = intFloatMap.keyTable;
            int i = this.nextIndex;
            if (i == -1) {
                Entry entry = this.entry;
                entry.key = 0;
                entry.value = intFloatMap.zeroValue;
            } else {
                Entry entry2 = this.entry;
                entry2.key = iArr[i];
                entry2.value = intFloatMap.valueTable[i];
            }
            this.currentIndex = i;
            findNextIndex();
            return this.entry;
        }
    }

    public static class Entry {
        public int key;
        public float value;

        public String toString() {
            return this.key + "=" + this.value;
        }
    }

    public static class MapIterator {
        private static final int INDEX_ILLEGAL = -2;
        static final int INDEX_ZERO = -1;
        int currentIndex;
        public boolean hasNext;
        final IntFloatMap map;
        int nextIndex;
        boolean valid = true;

        public MapIterator(IntFloatMap intFloatMap) {
            this.map = intFloatMap;
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

        /* JADX WARN: Code duplicated, block: B:11:0x0020  */
        /* JADX WARN: Code duplicated, block: B:13:0x002e  */
        /* JADX WARN: Code duplicated, block: B:17:0x003e  */
        /* JADX WARN: Code duplicated, block: B:20:0x0050  */
        /* JADX WARN: Code duplicated, block: B:22:0x0038 A[EDGE_INSN: B:22:0x0038->B:15:0x0038 BREAK  A[LOOP:0: B:9:0x001b->B:14:0x0035], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:24:0x0035 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x000f A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:8:0x0011  */
        public void remove() {
            int[] iArr;
            float[] fArr;
            int i;
            int i2;
            int i3;
            int i4;
            int iPlace;
            int i5 = this.currentIndex;
            if (i5 == -1) {
                IntFloatMap intFloatMap = this.map;
                if (intFloatMap.hasZeroValue) {
                    intFloatMap.hasZeroValue = false;
                } else {
                    if (i5 >= 0) {
                        throw new IllegalStateException("next must be called before remove.");
                    }
                    IntFloatMap intFloatMap2 = this.map;
                    iArr = intFloatMap2.keyTable;
                    fArr = intFloatMap2.valueTable;
                    i = intFloatMap2.mask;
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
                            fArr[i5] = fArr[i3];
                            i5 = i3;
                        }
                        i2 = i3 + 1;
                    }
                    iArr[i5] = 0;
                    if (i5 != this.currentIndex) {
                        this.nextIndex--;
                    }
                }
            } else {
                if (i5 >= 0) {
                    throw new IllegalStateException("next must be called before remove.");
                }
                IntFloatMap intFloatMap3 = this.map;
                iArr = intFloatMap3.keyTable;
                fArr = intFloatMap3.valueTable;
                i = intFloatMap3.mask;
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
                        fArr[i5] = fArr[i3];
                        i5 = i3;
                    }
                    i2 = i3 + 1;
                }
                iArr[i5] = 0;
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

    public IntFloatMap() {
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

    private void putResize(int i, float f) {
        int[] iArr = this.keyTable;
        int iPlace = place(i);
        while (iArr[iPlace] != 0) {
            iPlace = (iPlace + 1) & this.mask;
        }
        iArr[iPlace] = i;
        this.valueTable[iPlace] = f;
    }

    private void resize(int i) {
        int length = this.keyTable.length;
        this.threshold = (int) (i * this.loadFactor);
        int i2 = i - 1;
        this.mask = i2;
        this.shift = Long.numberOfLeadingZeros(i2);
        int[] iArr = this.keyTable;
        float[] fArr = this.valueTable;
        this.keyTable = new int[i];
        this.valueTable = new float[i];
        if (this.size > 0) {
            for (int i3 = 0; i3 < length; i3++) {
                int i4 = iArr[i3];
                if (i4 != 0) {
                    putResize(i4, fArr[i3]);
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
        resize(iTableSize);
    }

    public boolean containsKey(int i) {
        if (i == 0) {
            return this.hasZeroValue;
        }
        return locateKey(i) >= 0;
    }

    public boolean containsValue(float f) {
        if (this.hasZeroValue && this.zeroValue == f) {
            return true;
        }
        int[] iArr = this.keyTable;
        float[] fArr = this.valueTable;
        for (int length = fArr.length - 1; length >= 0; length--) {
            if (iArr[length] != 0 && fArr[length] == f) {
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

    public Entries entries() {
        if (Collections.allocateIterators) {
            return new Entries(this);
        }
        if (this.entries1 == null) {
            this.entries1 = new Entries(this);
            this.entries2 = new Entries(this);
        }
        Entries entries = this.entries1;
        if (entries.valid) {
            this.entries2.reset();
            Entries entries2 = this.entries2;
            entries2.valid = true;
            this.entries1.valid = false;
            return entries2;
        }
        entries.reset();
        Entries entries3 = this.entries1;
        entries3.valid = true;
        this.entries2.valid = false;
        return entries3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntFloatMap)) {
            return false;
        }
        IntFloatMap intFloatMap = (IntFloatMap) obj;
        if (intFloatMap.size != this.size) {
            return false;
        }
        boolean z = intFloatMap.hasZeroValue;
        boolean z2 = this.hasZeroValue;
        if (z != z2) {
            return false;
        }
        if (z2 && intFloatMap.zeroValue != this.zeroValue) {
            return false;
        }
        int[] iArr = this.keyTable;
        float[] fArr = this.valueTable;
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                float f = intFloatMap.get(i2, 0.0f);
                if ((f == 0.0f && !intFloatMap.containsKey(i2)) || f != fArr[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public int findKey(float f, int i) {
        if (this.hasZeroValue && this.zeroValue == f) {
            return 0;
        }
        int[] iArr = this.keyTable;
        float[] fArr = this.valueTable;
        for (int length = fArr.length - 1; length >= 0; length--) {
            int i2 = iArr[length];
            if (i2 != 0 && fArr[length] == f) {
                return i2;
            }
        }
        return i;
    }

    public float get(int i, float f) {
        if (i == 0) {
            return this.hasZeroValue ? this.zeroValue : f;
        }
        int iLocateKey = locateKey(i);
        return iLocateKey >= 0 ? this.valueTable[iLocateKey] : f;
    }

    public float getAndIncrement(int i, float f, float f2) {
        if (i == 0) {
            if (this.hasZeroValue) {
                float f3 = this.zeroValue;
                this.zeroValue = f2 + f3;
                return f3;
            }
            this.hasZeroValue = true;
            this.zeroValue = f2 + f;
            this.size++;
            return f;
        }
        int iLocateKey = locateKey(i);
        if (iLocateKey >= 0) {
            float[] fArr = this.valueTable;
            float f4 = fArr[iLocateKey];
            fArr[iLocateKey] = f2 + f4;
            return f4;
        }
        int i2 = -(iLocateKey + 1);
        int[] iArr = this.keyTable;
        iArr[i2] = i;
        this.valueTable[i2] = f2 + f;
        int i3 = this.size + 1;
        this.size = i3;
        if (i3 >= this.threshold) {
            resize(iArr.length << 1);
        }
        return f;
    }

    public int hashCode() {
        int iFloatToRawIntBits = this.size;
        if (this.hasZeroValue) {
            iFloatToRawIntBits += NumberUtils.floatToRawIntBits(this.zeroValue);
        }
        int[] iArr = this.keyTable;
        float[] fArr = this.valueTable;
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                iFloatToRawIntBits = NumberUtils.floatToRawIntBits(fArr[i]) + (i2 * 31) + iFloatToRawIntBits;
            }
        }
        return iFloatToRawIntBits;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<Entry> iterator() {
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

    public void put(int i, float f) {
        if (i == 0) {
            this.zeroValue = f;
            if (this.hasZeroValue) {
                return;
            }
            this.hasZeroValue = true;
            this.size++;
            return;
        }
        int iLocateKey = locateKey(i);
        if (iLocateKey >= 0) {
            this.valueTable[iLocateKey] = f;
            return;
        }
        int i2 = -(iLocateKey + 1);
        int[] iArr = this.keyTable;
        iArr[i2] = i;
        this.valueTable[i2] = f;
        int i3 = this.size + 1;
        this.size = i3;
        if (i3 >= this.threshold) {
            resize(iArr.length << 1);
        }
    }

    public void putAll(IntFloatMap intFloatMap) {
        ensureCapacity(intFloatMap.size);
        if (intFloatMap.hasZeroValue) {
            put(0, intFloatMap.zeroValue);
        }
        int[] iArr = intFloatMap.keyTable;
        float[] fArr = intFloatMap.valueTable;
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                put(i2, fArr[i]);
            }
        }
    }

    public float remove(int i, float f) {
        if (i == 0) {
            if (!this.hasZeroValue) {
                return f;
            }
            this.hasZeroValue = false;
            this.size--;
            return this.zeroValue;
        }
        int iLocateKey = locateKey(i);
        if (iLocateKey < 0) {
            return f;
        }
        int[] iArr = this.keyTable;
        float[] fArr = this.valueTable;
        float f2 = fArr[iLocateKey];
        int i2 = this.mask;
        int i3 = iLocateKey + 1;
        while (true) {
            int i4 = i3 & i2;
            int i5 = iArr[i4];
            if (i5 == 0) {
                iArr[iLocateKey] = 0;
                this.size--;
                return f2;
            }
            int iPlace = place(i5);
            if (((i4 - iPlace) & i2) > ((iLocateKey - iPlace) & i2)) {
                iArr[iLocateKey] = i5;
                fArr[iLocateKey] = fArr[i4];
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
            float[] r2 = r7.valueTable
            int r3 = r1.length
            boolean r4 = r7.hasZeroValue
            r5 = 61
            if (r4 == 0) goto L29
            java.lang.String r4 = "0="
            r0.append(r4)
            float r4 = r7.zeroValue
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
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.IntFloatMap.toString():java.lang.String");
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

    public IntFloatMap(int i) {
        this(i, 0.8f);
    }

    public static class Keys extends MapIterator {
        public Keys(IntFloatMap intFloatMap) {
            super(intFloatMap);
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

        @Override // com.badlogic.gdx.utils.IntFloatMap.MapIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.IntFloatMap.MapIterator
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

    public static class Values extends MapIterator {
        public Values(IntFloatMap intFloatMap) {
            super(intFloatMap);
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
            int i = this.nextIndex;
            float f = i == -1 ? this.map.zeroValue : this.map.valueTable[i];
            this.currentIndex = i;
            findNextIndex();
            return f;
        }

        @Override // com.badlogic.gdx.utils.IntFloatMap.MapIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.IntFloatMap.MapIterator
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

    public IntFloatMap(int i, float f) {
        if (f > 0.0f && f < 1.0f) {
            this.loadFactor = f;
            int iTableSize = ObjectSet.tableSize(i, f);
            this.threshold = (int) (iTableSize * f);
            int i2 = iTableSize - 1;
            this.mask = i2;
            this.shift = Long.numberOfLeadingZeros(i2);
            this.keyTable = new int[iTableSize];
            this.valueTable = new float[iTableSize];
            return;
        }
        throw new IllegalArgumentException(DM.g("loadFactor must be > 0 and < 1: ", f));
    }

    public boolean containsValue(float f, float f2) {
        if (this.hasZeroValue && Math.abs(this.zeroValue - f) <= f2) {
            return true;
        }
        int[] iArr = this.keyTable;
        float[] fArr = this.valueTable;
        for (int length = fArr.length - 1; length >= 0; length--) {
            if (iArr[length] != 0 && Math.abs(fArr[length] - f) <= f2) {
                return true;
            }
        }
        return false;
    }

    public int findKey(float f, float f2, int i) {
        if (this.hasZeroValue && Math.abs(this.zeroValue - f) <= f2) {
            return 0;
        }
        int[] iArr = this.keyTable;
        float[] fArr = this.valueTable;
        for (int length = fArr.length - 1; length >= 0; length--) {
            if (iArr[length] != 0 && Math.abs(fArr[length] - f) <= f2) {
                return iArr[length];
            }
        }
        return i;
    }

    public void clear() {
        if (this.size == 0) {
            return;
        }
        Arrays.fill(this.keyTable, 0);
        this.size = 0;
        this.hasZeroValue = false;
    }

    public float put(int i, float f, float f2) {
        if (i == 0) {
            float f3 = this.zeroValue;
            this.zeroValue = f;
            if (this.hasZeroValue) {
                return f3;
            }
            this.hasZeroValue = true;
            this.size++;
            return f2;
        }
        int iLocateKey = locateKey(i);
        if (iLocateKey >= 0) {
            float[] fArr = this.valueTable;
            float f4 = fArr[iLocateKey];
            fArr[iLocateKey] = f;
            return f4;
        }
        int i2 = -(iLocateKey + 1);
        int[] iArr = this.keyTable;
        iArr[i2] = i;
        this.valueTable[i2] = f;
        int i3 = this.size + 1;
        this.size = i3;
        if (i3 >= this.threshold) {
            resize(iArr.length << 1);
        }
        return f2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IntFloatMap(IntFloatMap intFloatMap) {
        float length = intFloatMap.keyTable.length;
        float f = intFloatMap.loadFactor;
        this((int) (length * f), f);
        int[] iArr = intFloatMap.keyTable;
        System.arraycopy(iArr, 0, this.keyTable, 0, iArr.length);
        float[] fArr = intFloatMap.valueTable;
        System.arraycopy(fArr, 0, this.valueTable, 0, fArr.length);
        this.size = intFloatMap.size;
        this.zeroValue = intFloatMap.zeroValue;
        this.hasZeroValue = intFloatMap.hasZeroValue;
    }
}
