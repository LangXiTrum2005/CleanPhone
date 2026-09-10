package com.bytedance.adsdk.lr;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
abstract class vr<K, V> {
    vr<K, V>.lr lr;

    public final class lr implements Set<K> {
        public lr() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection2) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            vr.this.ik();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return vr.this.ri(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection2) {
            return vr.ri(vr.this.lr(), collection2);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return vr.ri(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iRi = vr.this.ri() - 1; iRi >= 0; iRi--) {
                Object objRi = vr.this.ri(iRi, 0);
                iHashCode += objRi == null ? 0 : objRi.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return vr.this.ri() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new ri(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iRi = vr.this.ri(obj);
            if (iRi < 0) {
                return false;
            }
            vr.this.ri(iRi);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection2) {
            return vr.lr(vr.this.lr(), collection2);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection2) {
            return vr.ik(vr.this.lr(), collection2);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return vr.this.ri();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return vr.this.lr(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) vr.this.ri(tArr, 0);
        }
    }

    public final class ri<T> implements Iterator<T> {
        int ik;
        boolean ka = false;
        int lr;
        final int ri;

        public ri(int i) {
            this.ri = i;
            this.lr = vr.this.ri();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.ik < this.lr;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t = (T) vr.this.ri(this.ik, this.ri);
            this.ik++;
            this.ka = true;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.ka) {
                throw new IllegalStateException();
            }
            int i = this.ik - 1;
            this.ik = i;
            this.lr--;
            this.ka = false;
            vr.this.ri(i);
        }
    }

    public static <K, V> boolean ik(Map<K, V> map, Collection<?> collection2) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection2.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public static <K, V> boolean lr(Map<K, V> map, Collection<?> collection2) {
        int size = map.size();
        Iterator<?> it = collection2.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static <K, V> boolean ri(Map<K, V> map, Collection<?> collection2) {
        Iterator<?> it = collection2.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract void ik();

    public Set<K> ka() {
        if (this.lr == null) {
            this.lr = new lr();
        }
        return this.lr;
    }

    public abstract Map<K, V> lr();

    public abstract int ri();

    public abstract int ri(Object obj);

    public abstract Object ri(int i, int i2);

    public abstract void ri(int i);

    public <T> T[] ri(T[] tArr, int i) {
        int iRi = ri();
        if (tArr.length < iRi) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iRi));
        }
        for (int i2 = 0; i2 < iRi; i2++) {
            tArr[i2] = ri(i2, i);
        }
        if (tArr.length > iRi) {
            tArr[iRi] = null;
        }
        return tArr;
    }

    public Object[] lr(int i) {
        int iRi = ri();
        Object[] objArr = new Object[iRi];
        for (int i2 = 0; i2 < iRi; i2++) {
            objArr[i2] = ri(i2, i);
        }
        return objArr;
    }

    public static <T> boolean ri(Set<T> set, Object obj) {
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
