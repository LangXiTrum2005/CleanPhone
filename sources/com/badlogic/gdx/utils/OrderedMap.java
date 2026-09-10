package com.badlogic.gdx.utils;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public class OrderedMap<K, V> extends ObjectMap<K, V> {
    final Array<K> keys;

    public static class OrderedMapEntries<K, V> extends ObjectMap.Entries<K, V> {
        private Array<K> keys;

        public OrderedMapEntries(OrderedMap<K, V> orderedMap) {
            super(orderedMap);
            this.keys = orderedMap.keys;
        }

        @Override // com.badlogic.gdx.utils.ObjectMap.Entries, com.badlogic.gdx.utils.ObjectMap.MapIterator, java.util.Iterator
        public void remove() {
            if (this.currentIndex < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            this.map.remove(this.entry.key);
            this.nextIndex--;
            this.currentIndex = -1;
        }

        @Override // com.badlogic.gdx.utils.ObjectMap.Entries, com.badlogic.gdx.utils.ObjectMap.MapIterator
        public void reset() {
            this.currentIndex = -1;
            this.nextIndex = 0;
            this.hasNext = this.map.size > 0;
        }

        @Override // com.badlogic.gdx.utils.ObjectMap.Entries, java.util.Iterator
        public ObjectMap.Entry next() {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            if (!this.valid) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            int i = this.nextIndex;
            this.currentIndex = i;
            this.entry.key = this.keys.get(i);
            ObjectMap.Entry<K, V> entry = this.entry;
            entry.value = this.map.get(entry.key);
            int i2 = this.nextIndex + 1;
            this.nextIndex = i2;
            this.hasNext = i2 < this.map.size;
            return this.entry;
        }
    }

    public OrderedMap() {
        this.keys = new Array<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean alter(K k, K k2) {
        int iIndexOf;
        if (containsKey(k2) || (iIndexOf = this.keys.indexOf(k, false)) == -1) {
            return false;
        }
        super.put(k2, super.remove(k));
        this.keys.set(iIndexOf, k2);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean alterIndex(int i, K k) {
        if (i < 0 || i >= this.size || containsKey(k)) {
            return false;
        }
        super.put(k, super.remove(this.keys.get(i)));
        this.keys.set(i, k);
        return true;
    }

    @Override // com.badlogic.gdx.utils.ObjectMap
    public void clear(int i) {
        this.keys.clear();
        super.clear(i);
    }

    @Override // com.badlogic.gdx.utils.ObjectMap
    public ObjectMap.Entries<K, V> entries() {
        if (Collections.allocateIterators) {
            return new OrderedMapEntries(this);
        }
        if (this.entries1 == null) {
            this.entries1 = new OrderedMapEntries(this);
            this.entries2 = new OrderedMapEntries(this);
        }
        ObjectMap.Entries entries = this.entries1;
        if (entries.valid) {
            this.entries2.reset();
            ObjectMap.Entries<K, V> entries2 = this.entries2;
            entries2.valid = true;
            this.entries1.valid = false;
            return entries2;
        }
        entries.reset();
        ObjectMap.Entries<K, V> entries3 = this.entries1;
        entries3.valid = true;
        this.entries2.valid = false;
        return entries3;
    }

    @Override // com.badlogic.gdx.utils.ObjectMap
    public ObjectMap.Keys<K> keys() {
        if (Collections.allocateIterators) {
            return new OrderedMapKeys(this);
        }
        if (this.keys1 == null) {
            this.keys1 = new OrderedMapKeys(this);
            this.keys2 = new OrderedMapKeys(this);
        }
        ObjectMap.Keys keys = this.keys1;
        if (keys.valid) {
            this.keys2.reset();
            ObjectMap.Keys<K> keys2 = this.keys2;
            keys2.valid = true;
            this.keys1.valid = false;
            return keys2;
        }
        keys.reset();
        ObjectMap.Keys<K> keys3 = this.keys1;
        keys3.valid = true;
        this.keys2.valid = false;
        return keys3;
    }

    public Array<K> orderedKeys() {
        return this.keys;
    }

    @Override // com.badlogic.gdx.utils.ObjectMap
    public V put(K k, V v) {
        int iLocateKey = locateKey(k);
        if (iLocateKey >= 0) {
            V[] vArr = this.valueTable;
            V v2 = vArr[iLocateKey];
            vArr[iLocateKey] = v;
            return v2;
        }
        int i = -(iLocateKey + 1);
        this.keyTable[i] = k;
        this.valueTable[i] = v;
        this.keys.add(k);
        int i2 = this.size + 1;
        this.size = i2;
        if (i2 < this.threshold) {
            return null;
        }
        resize(this.keyTable.length << 1);
        return null;
    }

    public <T extends K> void putAll(OrderedMap<T, ? extends V> orderedMap) {
        ensureCapacity(orderedMap.size);
        Array<T> array = orderedMap.keys;
        T[] tArr = array.items;
        int i = array.size;
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            put(t, orderedMap.get(t));
        }
    }

    @Override // com.badlogic.gdx.utils.ObjectMap
    public V remove(K k) {
        this.keys.removeValue(k, false);
        return (V) super.remove(k);
    }

    public V removeIndex(int i) {
        return (V) super.remove(this.keys.removeIndex(i));
    }

    @Override // com.badlogic.gdx.utils.ObjectMap
    public String toString(String str, boolean z) {
        if (this.size == 0) {
            return z ? "{}" : "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(32);
        if (z) {
            sb.append('{');
        }
        Array<K> array = this.keys;
        int i = array.size;
        for (int i2 = 0; i2 < i; i2++) {
            K k = array.get(i2);
            if (i2 > 0) {
                sb.append(str);
            }
            Object obj = "(this)";
            sb.append(k == this ? "(this)" : k);
            sb.append('=');
            V v = get(k);
            if (v != this) {
                obj = v;
            }
            sb.append(obj);
        }
        if (z) {
            sb.append('}');
        }
        return sb.toString();
    }

    @Override // com.badlogic.gdx.utils.ObjectMap
    public ObjectMap.Values<V> values() {
        if (Collections.allocateIterators) {
            return new OrderedMapValues(this);
        }
        if (this.values1 == null) {
            this.values1 = new OrderedMapValues(this);
            this.values2 = new OrderedMapValues(this);
        }
        ObjectMap.Values values = this.values1;
        if (values.valid) {
            this.values2.reset();
            ObjectMap.Values<V> values2 = this.values2;
            values2.valid = true;
            this.values1.valid = false;
            return values2;
        }
        values.reset();
        ObjectMap.Values<V> values3 = this.values1;
        values3.valid = true;
        this.values2.valid = false;
        return values3;
    }

    @Override // com.badlogic.gdx.utils.ObjectMap, java.lang.Iterable
    public ObjectMap.Entries<K, V> iterator() {
        return entries();
    }

    public static class OrderedMapKeys<K> extends ObjectMap.Keys<K> {
        private Array<K> keys;

        public OrderedMapKeys(OrderedMap<K, ?> orderedMap) {
            super(orderedMap);
            this.keys = orderedMap.keys;
        }

        @Override // com.badlogic.gdx.utils.ObjectMap.Keys, java.util.Iterator
        public K next() {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            if (!this.valid) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            K k = this.keys.get(this.nextIndex);
            int i = this.nextIndex;
            this.currentIndex = i;
            int i2 = i + 1;
            this.nextIndex = i2;
            this.hasNext = i2 < this.map.size;
            return k;
        }

        @Override // com.badlogic.gdx.utils.ObjectMap.Keys, com.badlogic.gdx.utils.ObjectMap.MapIterator, java.util.Iterator
        public void remove() {
            int i = this.currentIndex;
            if (i < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            ((OrderedMap) this.map).removeIndex(i);
            this.nextIndex = this.currentIndex;
            this.currentIndex = -1;
        }

        @Override // com.badlogic.gdx.utils.ObjectMap.Keys, com.badlogic.gdx.utils.ObjectMap.MapIterator
        public void reset() {
            this.currentIndex = -1;
            this.nextIndex = 0;
            this.hasNext = this.map.size > 0;
        }

        @Override // com.badlogic.gdx.utils.ObjectMap.Keys
        public Array<K> toArray(Array<K> array) {
            Array<K> array2 = this.keys;
            int i = this.nextIndex;
            array.addAll((Array<? extends K>) array2, i, array2.size - i);
            this.nextIndex = this.keys.size;
            this.hasNext = false;
            return array;
        }

        @Override // com.badlogic.gdx.utils.ObjectMap.Keys
        public Array<K> toArray() {
            return toArray(new Array<>(true, this.keys.size - this.nextIndex));
        }
    }

    public OrderedMap(int i) {
        super(i);
        this.keys = new Array<>(i);
    }

    @Override // com.badlogic.gdx.utils.ObjectMap
    public void clear() {
        this.keys.clear();
        super.clear();
    }

    public OrderedMap(int i, float f) {
        super(i, f);
        this.keys = new Array<>(i);
    }

    public OrderedMap(OrderedMap<? extends K, ? extends V> orderedMap) {
        super(orderedMap);
        this.keys = new Array<>(orderedMap.keys);
    }

    public static class OrderedMapValues<V> extends ObjectMap.Values<V> {
        private Array keys;

        public OrderedMapValues(OrderedMap<?, V> orderedMap) {
            super(orderedMap);
            this.keys = orderedMap.keys;
        }

        @Override // com.badlogic.gdx.utils.ObjectMap.Values, java.util.Iterator
        public V next() {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            if (!this.valid) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            V v = this.map.get(this.keys.get(this.nextIndex));
            int i = this.nextIndex;
            this.currentIndex = i;
            int i2 = i + 1;
            this.nextIndex = i2;
            this.hasNext = i2 < this.map.size;
            return v;
        }

        @Override // com.badlogic.gdx.utils.ObjectMap.Values, com.badlogic.gdx.utils.ObjectMap.MapIterator, java.util.Iterator
        public void remove() {
            int i = this.currentIndex;
            if (i < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            ((OrderedMap) this.map).removeIndex(i);
            this.nextIndex = this.currentIndex;
            this.currentIndex = -1;
        }

        @Override // com.badlogic.gdx.utils.ObjectMap.Values, com.badlogic.gdx.utils.ObjectMap.MapIterator
        public void reset() {
            this.currentIndex = -1;
            this.nextIndex = 0;
            this.hasNext = this.map.size > 0;
        }

        @Override // com.badlogic.gdx.utils.ObjectMap.Values
        public Array<V> toArray(Array<V> array) {
            int i = this.keys.size;
            array.ensureCapacity(i - this.nextIndex);
            Object[] objArr = this.keys.items;
            for (int i2 = this.nextIndex; i2 < i; i2++) {
                array.add(this.map.get(objArr[i2]));
            }
            this.currentIndex = i - 1;
            this.nextIndex = i;
            this.hasNext = false;
            return array;
        }

        @Override // com.badlogic.gdx.utils.ObjectMap.Values
        public Array<V> toArray() {
            return toArray(new Array<>(true, this.keys.size - this.nextIndex));
        }
    }
}
