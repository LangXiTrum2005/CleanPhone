package com.bytedance.adsdk.LD;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
abstract class IeN<K, V> {
    IeN<K, V>.LD LD;

    public final class LD implements Set<K> {
        public LD() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            IeN.this.lk();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return IeN.this.Lxb(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return IeN.Lxb(IeN.this.LD(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return IeN.Lxb(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iLxb = IeN.this.Lxb() - 1; iLxb >= 0; iLxb--) {
                Object objLxb = IeN.this.Lxb(iLxb, 0);
                iHashCode += objLxb == null ? 0 : objLxb.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return IeN.this.Lxb() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new Lxb(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iLxb = IeN.this.Lxb(obj);
            if (iLxb < 0) {
                return false;
            }
            IeN.this.Lxb(iLxb);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return IeN.LD(IeN.this.LD(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return IeN.lk(IeN.this.LD(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return IeN.this.Lxb();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return IeN.this.LD(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) IeN.this.Lxb(tArr, 0);
        }
    }

    public final class Lxb<T> implements Iterator<T> {
        int LD;
        final int Lxb;
        boolean ZU = false;
        int lk;

        public Lxb(int i) {
            this.Lxb = i;
            this.LD = IeN.this.Lxb();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.lk < this.LD;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t = (T) IeN.this.Lxb(this.lk, this.Lxb);
            this.lk++;
            this.ZU = true;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.ZU) {
                throw new IllegalStateException();
            }
            int i = this.lk - 1;
            this.lk = i;
            this.LD--;
            this.ZU = false;
            IeN.this.Lxb(i);
        }
    }

    public static <K, V> boolean LD(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static <K, V> boolean Lxb(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <K, V> boolean lk(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract Map<K, V> LD();

    public abstract int Lxb();

    public abstract int Lxb(Object obj);

    public abstract Object Lxb(int i, int i2);

    public abstract void Lxb(int i);

    public Set<K> ZU() {
        if (this.LD == null) {
            this.LD = new LD();
        }
        return this.LD;
    }

    public abstract void lk();

    public <T> T[] Lxb(T[] tArr, int i) {
        int iLxb = Lxb();
        if (tArr.length < iLxb) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iLxb));
        }
        for (int i2 = 0; i2 < iLxb; i2++) {
            tArr[i2] = Lxb(i2, i);
        }
        if (tArr.length > iLxb) {
            tArr[iLxb] = null;
        }
        return tArr;
    }

    public Object[] LD(int i) {
        int iLxb = Lxb();
        Object[] objArr = new Object[iLxb];
        for (int i2 = 0; i2 < iLxb; i2++) {
            objArr[i2] = Lxb(i2, i);
        }
        return objArr;
    }

    public static <T> boolean Lxb(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size() && set.containsAll(set2)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}
