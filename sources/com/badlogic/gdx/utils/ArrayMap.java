package com.badlogic.gdx.utils;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.reflect.ArrayReflection;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public class ArrayMap<K, V> implements Iterable<ObjectMap.Entry<K, V>> {
    private transient Entries entries1;
    private transient Entries entries2;
    public K[] keys;
    private transient Keys keys1;
    private transient Keys keys2;
    public boolean ordered;
    public int size;
    public V[] values;
    private transient Values values1;
    private transient Values values2;

    public static class Entries<K, V> implements Iterable<ObjectMap.Entry<K, V>>, Iterator<ObjectMap.Entry<K, V>> {
        int index;
        private final ArrayMap<K, V> map;
        ObjectMap.Entry<K, V> entry = new ObjectMap.Entry<>();
        boolean valid = true;

        public Entries(ArrayMap<K, V> arrayMap) {
            this.map = arrayMap;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.valid) {
                return this.index < this.map.size;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // java.lang.Iterable
        public Iterator<ObjectMap.Entry<K, V>> iterator() {
            return this;
        }

        @Override // java.util.Iterator
        public void remove() {
            int i = this.index - 1;
            this.index = i;
            this.map.removeIndex(i);
        }

        public void reset() {
            this.index = 0;
        }

        @Override // java.util.Iterator
        public ObjectMap.Entry<K, V> next() {
            int i = this.index;
            ArrayMap<K, V> arrayMap = this.map;
            if (i >= arrayMap.size) {
                throw new NoSuchElementException(String.valueOf(this.index));
            }
            if (!this.valid) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            ObjectMap.Entry<K, V> entry = this.entry;
            entry.key = arrayMap.keys[i];
            V[] vArr = arrayMap.values;
            this.index = i + 1;
            entry.value = vArr[i];
            return entry;
        }
    }

    public static class Keys<K> implements Iterable<K>, Iterator<K> {
        int index;
        private final ArrayMap<K, Object> map;
        boolean valid = true;

        public Keys(ArrayMap<K, Object> arrayMap) {
            this.map = arrayMap;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.valid) {
                return this.index < this.map.size;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // java.lang.Iterable
        public Iterator<K> iterator() {
            return this;
        }

        @Override // java.util.Iterator
        public K next() {
            int i = this.index;
            ArrayMap<K, Object> arrayMap = this.map;
            if (i >= arrayMap.size) {
                throw new NoSuchElementException(String.valueOf(this.index));
            }
            if (!this.valid) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            K[] kArr = arrayMap.keys;
            this.index = i + 1;
            return kArr[i];
        }

        @Override // java.util.Iterator
        public void remove() {
            int i = this.index - 1;
            this.index = i;
            this.map.removeIndex(i);
        }

        public void reset() {
            this.index = 0;
        }

        public Array<K> toArray() {
            ArrayMap<K, Object> arrayMap = this.map;
            K[] kArr = arrayMap.keys;
            int i = this.index;
            return new Array<>(true, kArr, i, arrayMap.size - i);
        }

        public Array<K> toArray(Array array) {
            ArrayMap<K, Object> arrayMap = this.map;
            K[] kArr = arrayMap.keys;
            int i = this.index;
            array.addAll(kArr, i, arrayMap.size - i);
            return array;
        }
    }

    public static class Values<V> implements Iterable<V>, Iterator<V> {
        int index;
        private final ArrayMap<Object, V> map;
        boolean valid = true;

        public Values(ArrayMap<Object, V> arrayMap) {
            this.map = arrayMap;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.valid) {
                return this.index < this.map.size;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // java.lang.Iterable
        public Iterator<V> iterator() {
            return this;
        }

        @Override // java.util.Iterator
        public V next() {
            int i = this.index;
            ArrayMap<Object, V> arrayMap = this.map;
            if (i >= arrayMap.size) {
                throw new NoSuchElementException(String.valueOf(this.index));
            }
            if (!this.valid) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            V[] vArr = arrayMap.values;
            this.index = i + 1;
            return vArr[i];
        }

        @Override // java.util.Iterator
        public void remove() {
            int i = this.index - 1;
            this.index = i;
            this.map.removeIndex(i);
        }

        public void reset() {
            this.index = 0;
        }

        public Array<V> toArray() {
            ArrayMap<Object, V> arrayMap = this.map;
            V[] vArr = arrayMap.values;
            int i = this.index;
            return new Array<>(true, vArr, i, arrayMap.size - i);
        }

        public Array<V> toArray(Array array) {
            ArrayMap<Object, V> arrayMap = this.map;
            V[] vArr = arrayMap.values;
            int i = this.index;
            array.addAll(vArr, i, arrayMap.size - i);
            return array;
        }
    }

    public ArrayMap() {
        this(true, 16);
    }

    public void clear(int i) {
        if (this.keys.length <= i) {
            clear();
        } else {
            this.size = 0;
            resize(i);
        }
    }

    public boolean containsKey(K k) {
        K[] kArr = this.keys;
        int i = this.size - 1;
        if (k == null) {
            while (i >= 0) {
                int i2 = i - 1;
                if (kArr[i] == k) {
                    return true;
                }
                i = i2;
            }
            return false;
        }
        while (i >= 0) {
            int i3 = i - 1;
            if (k.equals(kArr[i])) {
                return true;
            }
            i = i3;
        }
        return false;
    }

    public boolean containsValue(V v, boolean z) {
        V[] vArr = this.values;
        int i = this.size - 1;
        if (z || v == null) {
            while (i >= 0) {
                int i2 = i - 1;
                if (vArr[i] == v) {
                    return true;
                }
                i = i2;
            }
            return false;
        }
        while (i >= 0) {
            int i3 = i - 1;
            if (v.equals(vArr[i])) {
                return true;
            }
            i = i3;
        }
        return false;
    }

    public void ensureCapacity(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC3950lJ.p("additionalCapacity must be >= 0: ", i));
        }
        int i2 = this.size + i;
        if (i2 > this.keys.length) {
            resize(Math.max(Math.max(8, i2), (int) (this.size * 1.75f)));
        }
    }

    public Entries<K, V> entries() {
        if (Collections.allocateIterators) {
            return new Entries<>(this);
        }
        if (this.entries1 == null) {
            this.entries1 = new Entries(this);
            this.entries2 = new Entries(this);
        }
        Entries<K, V> entries = this.entries1;
        if (!entries.valid) {
            entries.index = 0;
            entries.valid = true;
            this.entries2.valid = false;
            return entries;
        }
        Entries<K, V> entries2 = this.entries2;
        entries2.index = 0;
        entries2.valid = true;
        entries.valid = false;
        return entries2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ArrayMap)) {
            return false;
        }
        ArrayMap arrayMap = (ArrayMap) obj;
        int i = arrayMap.size;
        int i2 = this.size;
        if (i != i2) {
            return false;
        }
        K[] kArr = this.keys;
        V[] vArr = this.values;
        for (int i3 = 0; i3 < i2; i3++) {
            K k = kArr[i3];
            V v = vArr[i3];
            if (v == null) {
                if (arrayMap.get(k, ObjectMap.dummy) != null) {
                    return false;
                }
            } else if (!v.equals(arrayMap.get(k))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean equalsIdentity(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ArrayMap)) {
            return false;
        }
        ArrayMap arrayMap = (ArrayMap) obj;
        int i = arrayMap.size;
        int i2 = this.size;
        if (i != i2) {
            return false;
        }
        K[] kArr = this.keys;
        V[] vArr = this.values;
        for (int i3 = 0; i3 < i2; i3++) {
            if (vArr[i3] != arrayMap.get(kArr[i3], ObjectMap.dummy)) {
                return false;
            }
        }
        return true;
    }

    public K firstKey() {
        if (this.size != 0) {
            return this.keys[0];
        }
        throw new IllegalStateException("Map is empty.");
    }

    public V firstValue() {
        if (this.size != 0) {
            return this.values[0];
        }
        throw new IllegalStateException("Map is empty.");
    }

    @Null
    public V get(K k) {
        return get(k, null);
    }

    @Null
    public K getKey(V v, boolean z) {
        V[] vArr = this.values;
        int i = this.size - 1;
        if (z || v == null) {
            while (i >= 0) {
                if (vArr[i] == v) {
                    return this.keys[i];
                }
                i--;
            }
            return null;
        }
        while (i >= 0) {
            if (v.equals(vArr[i])) {
                return this.keys[i];
            }
            i--;
        }
        return null;
    }

    public K getKeyAt(int i) {
        if (i < this.size) {
            return this.keys[i];
        }
        throw new IndexOutOfBoundsException(String.valueOf(i));
    }

    public V getValueAt(int i) {
        if (i < this.size) {
            return this.values[i];
        }
        throw new IndexOutOfBoundsException(String.valueOf(i));
    }

    public int hashCode() {
        K[] kArr = this.keys;
        V[] vArr = this.values;
        int i = this.size;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            K k = kArr[i2];
            V v = vArr[i2];
            if (k != null) {
                iHashCode += k.hashCode() * 31;
            }
            if (v != null) {
                iHashCode = v.hashCode() + iHashCode;
            }
        }
        return iHashCode;
    }

    public int indexOfKey(K k) {
        K[] kArr = this.keys;
        int i = 0;
        if (k == null) {
            int i2 = this.size;
            while (i < i2) {
                if (kArr[i] == k) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.size;
        while (i < i3) {
            if (k.equals(kArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int indexOfValue(V v, boolean z) {
        V[] vArr = this.values;
        int i = 0;
        if (z || v == null) {
            int i2 = this.size;
            while (i < i2) {
                if (vArr[i] == v) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.size;
        while (i < i3) {
            if (v.equals(vArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void insert(int i, K k, V v) {
        int i2 = this.size;
        if (i > i2) {
            throw new IndexOutOfBoundsException(String.valueOf(i));
        }
        if (i2 == this.keys.length) {
            resize(Math.max(8, (int) (i2 * 1.75f)));
        }
        if (this.ordered) {
            K[] kArr = this.keys;
            int i3 = i + 1;
            System.arraycopy(kArr, i, kArr, i3, this.size - i);
            V[] vArr = this.values;
            System.arraycopy(vArr, i, vArr, i3, this.size - i);
        } else {
            K[] kArr2 = this.keys;
            int i4 = this.size;
            kArr2[i4] = kArr2[i];
            V[] vArr2 = this.values;
            vArr2[i4] = vArr2[i];
        }
        this.size++;
        this.keys[i] = k;
        this.values[i] = v;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<ObjectMap.Entry<K, V>> iterator() {
        return entries();
    }

    public Keys<K> keys() {
        if (Collections.allocateIterators) {
            return new Keys<>(this);
        }
        if (this.keys1 == null) {
            this.keys1 = new Keys(this);
            this.keys2 = new Keys(this);
        }
        Keys<K> keys = this.keys1;
        if (!keys.valid) {
            keys.index = 0;
            keys.valid = true;
            this.keys2.valid = false;
            return keys;
        }
        Keys<K> keys2 = this.keys2;
        keys2.index = 0;
        keys2.valid = true;
        keys.valid = false;
        return keys2;
    }

    public boolean notEmpty() {
        return this.size > 0;
    }

    public K peekKey() {
        return this.keys[this.size - 1];
    }

    public V peekValue() {
        return this.values[this.size - 1];
    }

    public int put(K k, V v) {
        int iIndexOfKey = indexOfKey(k);
        if (iIndexOfKey == -1) {
            int i = this.size;
            if (i == this.keys.length) {
                resize(Math.max(8, (int) (i * 1.75f)));
            }
            iIndexOfKey = this.size;
            this.size = iIndexOfKey + 1;
        }
        this.keys[iIndexOfKey] = k;
        this.values[iIndexOfKey] = v;
        return iIndexOfKey;
    }

    public void putAll(ArrayMap<? extends K, ? extends V> arrayMap) {
        putAll(arrayMap, 0, arrayMap.size);
    }

    public void removeIndex(int i) {
        int i2 = this.size;
        if (i >= i2) {
            throw new IndexOutOfBoundsException(String.valueOf(i));
        }
        K[] kArr = this.keys;
        int i3 = i2 - 1;
        this.size = i3;
        if (this.ordered) {
            int i4 = i + 1;
            System.arraycopy(kArr, i4, kArr, i, i3 - i);
            V[] vArr = this.values;
            System.arraycopy(vArr, i4, vArr, i, this.size - i);
        } else {
            kArr[i] = kArr[i3];
            V[] vArr2 = this.values;
            vArr2[i] = vArr2[i3];
        }
        int i5 = this.size;
        kArr[i5] = null;
        this.values[i5] = null;
    }

    @Null
    public V removeKey(K k) {
        K[] kArr = this.keys;
        int i = 0;
        if (k == null) {
            int i2 = this.size;
            while (i < i2) {
                if (kArr[i] == k) {
                    V v = this.values[i];
                    removeIndex(i);
                    return v;
                }
                i++;
            }
            return null;
        }
        int i3 = this.size;
        while (i < i3) {
            if (k.equals(kArr[i])) {
                V v2 = this.values[i];
                removeIndex(i);
                return v2;
            }
            i++;
        }
        return null;
    }

    public boolean removeValue(V v, boolean z) {
        V[] vArr = this.values;
        if (z || v == null) {
            int i = this.size;
            for (int i2 = 0; i2 < i; i2++) {
                if (vArr[i2] == v) {
                    removeIndex(i2);
                    return true;
                }
            }
        } else {
            int i3 = this.size;
            for (int i4 = 0; i4 < i3; i4++) {
                if (v.equals(vArr[i4])) {
                    removeIndex(i4);
                    return true;
                }
            }
        }
        return false;
    }

    public void resize(int i) {
        K[] kArr = (K[]) ((Object[]) ArrayReflection.newInstance(this.keys.getClass().getComponentType(), i));
        System.arraycopy(this.keys, 0, kArr, 0, Math.min(this.size, kArr.length));
        this.keys = kArr;
        V[] vArr = (V[]) ((Object[]) ArrayReflection.newInstance(this.values.getClass().getComponentType(), i));
        System.arraycopy(this.values, 0, vArr, 0, Math.min(this.size, vArr.length));
        this.values = vArr;
    }

    public void reverse() {
        int i = this.size;
        int i2 = i - 1;
        int i3 = i / 2;
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i2 - i4;
            K[] kArr = this.keys;
            K k = kArr[i4];
            kArr[i4] = kArr[i5];
            kArr[i5] = k;
            V[] vArr = this.values;
            V v = vArr[i4];
            vArr[i4] = vArr[i5];
            vArr[i5] = v;
        }
    }

    public void setKey(int i, K k) {
        if (i >= this.size) {
            throw new IndexOutOfBoundsException(String.valueOf(i));
        }
        this.keys[i] = k;
    }

    public void setValue(int i, V v) {
        if (i >= this.size) {
            throw new IndexOutOfBoundsException(String.valueOf(i));
        }
        this.values[i] = v;
    }

    public void shrink() {
        int length = this.keys.length;
        int i = this.size;
        if (length == i) {
            return;
        }
        resize(i);
    }

    public void shuffle() {
        for (int i = this.size - 1; i >= 0; i--) {
            int iRandom = MathUtils.random(i);
            K[] kArr = this.keys;
            K k = kArr[i];
            kArr[i] = kArr[iRandom];
            kArr[iRandom] = k;
            V[] vArr = this.values;
            V v = vArr[i];
            vArr[i] = vArr[iRandom];
            vArr[iRandom] = v;
        }
    }

    public String toString() {
        if (this.size == 0) {
            return "{}";
        }
        K[] kArr = this.keys;
        V[] vArr = this.values;
        StringBuilder stringBuilder = new StringBuilder(32);
        stringBuilder.append('{');
        stringBuilder.append(kArr[0]);
        stringBuilder.append('=');
        stringBuilder.append(vArr[0]);
        for (int i = 1; i < this.size; i++) {
            stringBuilder.append(", ");
            stringBuilder.append(kArr[i]);
            stringBuilder.append('=');
            stringBuilder.append(vArr[i]);
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public void truncate(int i) {
        if (this.size <= i) {
            return;
        }
        for (int i2 = i; i2 < this.size; i2++) {
            this.keys[i2] = null;
            this.values[i2] = null;
        }
        this.size = i;
    }

    public Values<V> values() {
        if (Collections.allocateIterators) {
            return new Values<>(this);
        }
        if (this.values1 == null) {
            this.values1 = new Values(this);
            this.values2 = new Values(this);
        }
        Values<V> values = this.values1;
        if (!values.valid) {
            values.index = 0;
            values.valid = true;
            this.values2.valid = false;
            return values;
        }
        Values<V> values2 = this.values2;
        values2.index = 0;
        values2.valid = true;
        values.valid = false;
        return values2;
    }

    public ArrayMap(int i) {
        this(true, i);
    }

    @Null
    public V get(K k, @Null V v) {
        K[] kArr = this.keys;
        int i = this.size - 1;
        if (k == null) {
            while (i >= 0) {
                if (kArr[i] == k) {
                    return this.values[i];
                }
                i--;
            }
        } else {
            while (i >= 0) {
                if (k.equals(kArr[i])) {
                    return this.values[i];
                }
                i--;
            }
        }
        return v;
    }

    public void putAll(ArrayMap<? extends K, ? extends V> arrayMap, int i, int i2) {
        if (i + i2 > arrayMap.size) {
            java.lang.StringBuilder sbT = AbstractC3950lJ.t("offset + length must be <= size: ", i, " + ", i2, " <= ");
            sbT.append(arrayMap.size);
            throw new IllegalArgumentException(sbT.toString());
        }
        int i3 = (this.size + i2) - i;
        if (i3 >= this.keys.length) {
            resize(Math.max(8, (int) (i3 * 1.75f)));
        }
        System.arraycopy(arrayMap.keys, i, this.keys, this.size, i2);
        System.arraycopy(arrayMap.values, i, this.values, this.size, i2);
        this.size += i2;
    }

    public ArrayMap(boolean z, int i) {
        this.ordered = z;
        this.keys = (K[]) new Object[i];
        this.values = (V[]) new Object[i];
    }

    public void clear() {
        Arrays.fill(this.keys, 0, this.size, (Object) null);
        Arrays.fill(this.values, 0, this.size, (Object) null);
        this.size = 0;
    }

    public int put(K k, V v, int i) {
        int iIndexOfKey = indexOfKey(k);
        if (iIndexOfKey != -1) {
            removeIndex(iIndexOfKey);
        } else {
            int i2 = this.size;
            if (i2 == this.keys.length) {
                resize(Math.max(8, (int) (i2 * 1.75f)));
            }
        }
        K[] kArr = this.keys;
        int i3 = i + 1;
        System.arraycopy(kArr, i, kArr, i3, this.size - i);
        V[] vArr = this.values;
        System.arraycopy(vArr, i, vArr, i3, this.size - i);
        this.keys[i] = k;
        this.values[i] = v;
        this.size++;
        return i;
    }

    public ArrayMap(boolean z, int i, Class cls, Class cls2) {
        this.ordered = z;
        this.keys = (K[]) ((Object[]) ArrayReflection.newInstance(cls, i));
        this.values = (V[]) ((Object[]) ArrayReflection.newInstance(cls2, i));
    }

    public ArrayMap(Class cls, Class cls2) {
        this(false, 16, cls, cls2);
    }

    public ArrayMap(ArrayMap arrayMap) {
        this(arrayMap.ordered, arrayMap.size, arrayMap.keys.getClass().getComponentType(), arrayMap.values.getClass().getComponentType());
        int i = arrayMap.size;
        this.size = i;
        System.arraycopy(arrayMap.keys, 0, this.keys, 0, i);
        System.arraycopy(arrayMap.values, 0, this.values, 0, this.size);
    }
}
