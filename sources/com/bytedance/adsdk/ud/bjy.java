package com.bytedance.adsdk.ud;

import android.support.v4.media.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
abstract class bjy<K, V> {
    bjy<K, V>.ud ud;

    public final class qdl<T> implements Iterator<T> {
        int lnr;
        boolean mml = false;
        final int qdl;
        int ud;

        public qdl(int i2) {
            this.qdl = i2;
            this.ud = bjy.this.qdl();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.lnr < this.ud;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t = (T) bjy.this.qdl(this.lnr, this.qdl);
            this.lnr++;
            this.mml = true;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.mml) {
                throw new IllegalStateException();
            }
            int i2 = this.lnr - 1;
            this.lnr = i2;
            this.ud--;
            this.mml = false;
            bjy.this.qdl(i2);
        }
    }

    public final class ud implements Set<K> {
        public ud() {
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
            bjy.this.lnr();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return bjy.this.qdl(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return bjy.qdl(bjy.this.ud(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return bjy.qdl(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iQdl = bjy.this.qdl() - 1; iQdl >= 0; iQdl--) {
                Object objQdl = bjy.this.qdl(iQdl, 0);
                iHashCode += objQdl == null ? 0 : objQdl.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return bjy.this.qdl() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new qdl(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iQdl = bjy.this.qdl(obj);
            if (iQdl < 0) {
                return false;
            }
            bjy.this.qdl(iQdl);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return bjy.ud(bjy.this.ud(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return bjy.lnr(bjy.this.ud(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return bjy.this.qdl();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return bjy.this.ud(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) bjy.this.qdl(tArr, 0);
        }
    }

    public static <K, V> boolean lnr(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public static <K, V> boolean qdl(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <K, V> boolean ud(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public abstract void lnr();

    public Set<K> mml() {
        if (this.ud == null) {
            this.ud = new ud();
        }
        return this.ud;
    }

    public abstract int qdl();

    public abstract int qdl(Object obj);

    public abstract Object qdl(int i2, int i3);

    public abstract void qdl(int i2);

    public abstract Map<K, V> ud();

    public <T> T[] qdl(T[] tArr, int i2) {
        int iQdl = qdl();
        if (tArr.length < iQdl) {
            tArr = (T[]) ((Object[]) a.e(iQdl, tArr));
        }
        for (int i3 = 0; i3 < iQdl; i3++) {
            tArr[i3] = qdl(i3, i2);
        }
        if (tArr.length > iQdl) {
            tArr[iQdl] = null;
        }
        return tArr;
    }

    public Object[] ud(int i2) {
        int iQdl = qdl();
        Object[] objArr = new Object[iQdl];
        for (int i3 = 0; i3 < iQdl; i3++) {
            objArr[i3] = qdl(i3, i2);
        }
        return objArr;
    }

    public static <T> boolean qdl(Set<T> set, Object obj) {
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
