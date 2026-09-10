package com.badlogic.gdx.utils;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public class OrderedSet<T> extends ObjectSet<T> {
    final Array<T> items;
    transient OrderedSetIterator iterator1;
    transient OrderedSetIterator iterator2;

    public OrderedSet() {
        this.items = new Array<>();
    }

    public static <T> OrderedSet<T> with(T... tArr) {
        OrderedSet<T> orderedSet = new OrderedSet<>();
        orderedSet.addAll(tArr);
        return orderedSet;
    }

    @Override // com.badlogic.gdx.utils.ObjectSet
    public boolean add(T t) {
        if (!super.add(t)) {
            return false;
        }
        this.items.add(t);
        return true;
    }

    public void addAll(OrderedSet<T> orderedSet) {
        ensureCapacity(orderedSet.size);
        Array<T> array = orderedSet.items;
        T[] tArr = array.items;
        int i = array.size;
        for (int i2 = 0; i2 < i; i2++) {
            add(tArr[i2]);
        }
    }

    public boolean alter(T t, T t2) {
        if (contains(t2) || !super.remove(t)) {
            return false;
        }
        super.add(t2);
        Array<T> array = this.items;
        array.set(array.indexOf(t, false), t2);
        return true;
    }

    public boolean alterIndex(int i, T t) {
        if (i < 0 || i >= this.size || contains(t)) {
            return false;
        }
        super.remove(this.items.get(i));
        super.add(t);
        this.items.set(i, t);
        return true;
    }

    @Override // com.badlogic.gdx.utils.ObjectSet
    public void clear(int i) {
        this.items.clear();
        super.clear(i);
    }

    public Array<T> orderedItems() {
        return this.items;
    }

    @Override // com.badlogic.gdx.utils.ObjectSet
    public boolean remove(T t) {
        if (!super.remove(t)) {
            return false;
        }
        this.items.removeValue(t, false);
        return true;
    }

    public T removeIndex(int i) {
        T tRemoveIndex = this.items.removeIndex(i);
        super.remove(tRemoveIndex);
        return tRemoveIndex;
    }

    @Override // com.badlogic.gdx.utils.ObjectSet
    public String toString() {
        if (this.size == 0) {
            return "{}";
        }
        T[] tArr = this.items.items;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(32);
        sb.append('{');
        sb.append(tArr[0]);
        for (int i = 1; i < this.size; i++) {
            sb.append(", ");
            sb.append(tArr[i]);
        }
        sb.append('}');
        return sb.toString();
    }

    public static class OrderedSetIterator<K> extends ObjectSet.ObjectSetIterator<K> {
        private Array<K> items;

        public OrderedSetIterator(OrderedSet<K> orderedSet) {
            super(orderedSet);
            this.items = orderedSet.items;
        }

        @Override // com.badlogic.gdx.utils.ObjectSet.ObjectSetIterator, java.util.Iterator
        public K next() {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            if (!this.valid) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            K k = this.items.get(this.nextIndex);
            int i = this.nextIndex + 1;
            this.nextIndex = i;
            this.hasNext = i < this.set.size;
            return k;
        }

        @Override // com.badlogic.gdx.utils.ObjectSet.ObjectSetIterator, java.util.Iterator
        public void remove() {
            int i = this.nextIndex;
            if (i < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            int i2 = i - 1;
            this.nextIndex = i2;
            ((OrderedSet) this.set).removeIndex(i2);
        }

        @Override // com.badlogic.gdx.utils.ObjectSet.ObjectSetIterator
        public void reset() {
            this.nextIndex = 0;
            this.hasNext = this.set.size > 0;
        }

        @Override // com.badlogic.gdx.utils.ObjectSet.ObjectSetIterator
        public Array<K> toArray(Array<K> array) {
            Array<K> array2 = this.items;
            int i = this.nextIndex;
            array.addAll((Array<? extends K>) array2, i, array2.size - i);
            this.nextIndex = this.items.size;
            this.hasNext = false;
            return array;
        }

        @Override // com.badlogic.gdx.utils.ObjectSet.ObjectSetIterator
        public Array<K> toArray() {
            return toArray(new Array<>(true, this.set.size - this.nextIndex));
        }
    }

    public OrderedSet(int i, float f) {
        super(i, f);
        this.items = new Array<>(i);
    }

    public boolean add(T t, int i) {
        if (!super.add(t)) {
            int iIndexOf = this.items.indexOf(t, true);
            if (iIndexOf == i) {
                return false;
            }
            Array<T> array = this.items;
            array.insert(i, array.removeIndex(iIndexOf));
            return false;
        }
        this.items.insert(i, t);
        return true;
    }

    @Override // com.badlogic.gdx.utils.ObjectSet
    public void clear() {
        this.items.clear();
        super.clear();
    }

    @Override // com.badlogic.gdx.utils.ObjectSet, java.lang.Iterable
    public OrderedSetIterator<T> iterator() {
        if (Collections.allocateIterators) {
            return new OrderedSetIterator<>(this);
        }
        if (this.iterator1 == null) {
            this.iterator1 = new OrderedSetIterator(this);
            this.iterator2 = new OrderedSetIterator(this);
        }
        OrderedSetIterator orderedSetIterator = this.iterator1;
        if (!orderedSetIterator.valid) {
            orderedSetIterator.reset();
            OrderedSetIterator<T> orderedSetIterator2 = this.iterator1;
            orderedSetIterator2.valid = true;
            this.iterator2.valid = false;
            return orderedSetIterator2;
        }
        this.iterator2.reset();
        OrderedSetIterator<T> orderedSetIterator3 = this.iterator2;
        orderedSetIterator3.valid = true;
        this.iterator1.valid = false;
        return orderedSetIterator3;
    }

    public OrderedSet(int i) {
        super(i);
        this.items = new Array<>(i);
    }

    public OrderedSet(OrderedSet<? extends T> orderedSet) {
        super(orderedSet);
        this.items = new Array<>(orderedSet.items);
    }

    @Override // com.badlogic.gdx.utils.ObjectSet
    public String toString(String str) {
        return this.items.toString(str);
    }
}
