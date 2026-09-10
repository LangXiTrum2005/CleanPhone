package androidx.collection;

import com.ironsource.X3;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: ArrayMap.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal<K, V> extends splinterproof<K, V> implements Map<K, V> {

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public attabal<K, V>.marial f5656graveside;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public attabal<K, V>.dern f5657molybdenite;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public attabal<K, V>.C0034attabal f5658polloi;

    /* JADX INFO: renamed from: androidx.collection.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ArrayMap.java */
    public final class C0034attabal extends AbstractSet<Map.Entry<K, V>> {
        public C0034attabal() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new wireman();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return attabal.this.getSize();
        }
    }

    /* JADX INFO: compiled from: ArrayMap.java */
    public final class beachfront extends apical<V> {
        public beachfront() {
            super(attabal.this.getSize());
        }

        @Override // androidx.collection.apical
        public V saneness(int i) {
            return attabal.this.formularize(i);
        }

        @Override // androidx.collection.apical
        public void wireman(int i) {
            attabal.this.taiyuan(i);
        }
    }

    /* JADX INFO: compiled from: ArrayMap.java */
    public final class saneness extends apical<K> {
        public saneness() {
            super(attabal.this.getSize());
        }

        @Override // androidx.collection.apical
        public K saneness(int i) {
            return attabal.this.competently(i);
        }

        @Override // androidx.collection.apical
        public void wireman(int i) {
            attabal.this.taiyuan(i);
        }
    }

    /* JADX INFO: compiled from: ArrayMap.java */
    public final class wireman implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public int f5664arytenoidectomy = -1;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public int f5665kowloon;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public boolean f5666monoploid;

        public wireman() {
            this.f5665kowloon = attabal.this.getSize() - 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f5664arytenoidectomy++;
            this.f5666monoploid = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f5666monoploid) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return molybdenite.attabal.dern(entry.getKey(), attabal.this.competently(this.f5664arytenoidectomy)) && molybdenite.attabal.dern(entry.getValue(), attabal.this.formularize(this.f5664arytenoidectomy));
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f5666monoploid) {
                return attabal.this.competently(this.f5664arytenoidectomy);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f5666monoploid) {
                return attabal.this.formularize(this.f5664arytenoidectomy);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f5664arytenoidectomy < this.f5665kowloon;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f5666monoploid) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            K kCompetently = attabal.this.competently(this.f5664arytenoidectomy);
            V vFormularize = attabal.this.formularize(this.f5664arytenoidectomy);
            return (kCompetently == null ? 0 : kCompetently.hashCode()) ^ (vFormularize != null ? vFormularize.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f5666monoploid) {
                throw new IllegalStateException();
            }
            attabal.this.taiyuan(this.f5664arytenoidectomy);
            this.f5664arytenoidectomy--;
            this.f5665kowloon--;
            this.f5666monoploid = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (this.f5666monoploid) {
                return attabal.this.cutely(this.f5664arytenoidectomy, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + X3.j.b + getValue();
        }
    }

    public attabal() {
    }

    public static <T> boolean triweekly(Set<T> set, Object obj) {
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

    public boolean arytenoidectomy(Collection<?> collection2) {
        int size = getSize();
        for (int size2 = getSize() - 1; size2 >= 0; size2--) {
            if (!collection2.contains(competently(size2))) {
                taiyuan(size2);
            }
        }
        return size != getSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.splinterproof, java.util.Map
    public boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.splinterproof, java.util.Map
    public boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        attabal<K, V>.C0034attabal c0034attabal = this.f5658polloi;
        if (c0034attabal != null) {
            return c0034attabal;
        }
        attabal<K, V>.C0034attabal c0034attabal2 = new C0034attabal();
        this.f5658polloi = c0034attabal2;
        return c0034attabal2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.splinterproof, java.util.Map
    public V get(Object obj) {
        return (V) super.get(obj);
    }

    public boolean impassible(Collection<?> collection2) {
        Iterator<?> it = collection2.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        attabal<K, V>.dern dernVar = this.f5657molybdenite;
        if (dernVar != null) {
            return dernVar;
        }
        attabal<K, V>.dern dernVar2 = new dern();
        this.f5657molybdenite = dernVar2;
        return dernVar2;
    }

    public boolean kowloon(Collection<?> collection2) {
        int size = getSize();
        Iterator<?> it = collection2.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return size != getSize();
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        saneness(getSize() + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.splinterproof, java.util.Map
    public V remove(Object obj) {
        return (V) super.remove(obj);
    }

    @Override // java.util.Map
    public Collection<V> values() {
        attabal<K, V>.marial marialVar = this.f5656graveside;
        if (marialVar != null) {
            return marialVar;
        }
        attabal<K, V>.marial marialVar2 = new marial();
        this.f5656graveside = marialVar2;
        return marialVar2;
    }

    public attabal(int i) {
        super(i);
    }

    /* JADX INFO: compiled from: ArrayMap.java */
    public final class dern implements Set<K> {
        public dern() {
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
            attabal.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return attabal.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection2) {
            return attabal.this.impassible(collection2);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return attabal.triweekly(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int size = attabal.this.getSize() - 1; size >= 0; size--) {
                K kCompetently = attabal.this.competently(size);
                iHashCode += kCompetently == null ? 0 : kCompetently.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return attabal.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new saneness();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iMarial = attabal.this.marial(obj);
            if (iMarial < 0) {
                return false;
            }
            attabal.this.taiyuan(iMarial);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection2) {
            return attabal.this.kowloon(collection2);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection2) {
            return attabal.this.arytenoidectomy(collection2);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return attabal.this.getSize();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            int size = attabal.this.getSize();
            Object[] objArr = new Object[size];
            for (int i = 0; i < size; i++) {
                objArr[i] = attabal.this.competently(i);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            int size = size();
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            }
            for (int i = 0; i < size; i++) {
                tArr[i] = attabal.this.competently(i);
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }
    }

    /* JADX INFO: compiled from: ArrayMap.java */
    public final class marial implements Collection<V> {
        public marial() {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection2) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            attabal.this.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return attabal.this.attabal(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection2) {
            Iterator<?> it = collection2.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return attabal.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new beachfront();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iAttabal = attabal.this.attabal(obj);
            if (iAttabal < 0) {
                return false;
            }
            attabal.this.taiyuan(iAttabal);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection2) {
            int size = attabal.this.getSize();
            int i = 0;
            boolean z = false;
            while (i < size) {
                if (collection2.contains(attabal.this.formularize(i))) {
                    attabal.this.taiyuan(i);
                    i--;
                    size--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection2) {
            int size = attabal.this.getSize();
            int i = 0;
            boolean z = false;
            while (i < size) {
                if (!collection2.contains(attabal.this.formularize(i))) {
                    attabal.this.taiyuan(i);
                    i--;
                    size--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return attabal.this.getSize();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            int size = attabal.this.getSize();
            Object[] objArr = new Object[size];
            for (int i = 0; i < size; i++) {
                objArr[i] = attabal.this.formularize(i);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            int size = size();
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            }
            for (int i = 0; i < size; i++) {
                tArr[i] = attabal.this.formularize(i);
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }
    }

    public attabal(splinterproof splinterproofVar) {
        super(splinterproofVar);
    }
}
