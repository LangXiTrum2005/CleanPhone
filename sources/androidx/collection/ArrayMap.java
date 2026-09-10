package androidx.collection;

import android.support.v4.media.a;
import com.p004ironsource.d9;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class ArrayMap<K, V> extends SimpleArrayMap<K, V> implements Map<K, V> {
    public EntrySet e0;
    public KeySet f0;
    public ValueCollection g0;

    public final class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        public EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new MapIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return ArrayMap.this.Z;
        }
    }

    public final class KeyIterator extends IndexBasedArrayIterator<K> {
        public KeyIterator() {
            super(ArrayMap.this.Z);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public final Object a(int i2) {
            return ArrayMap.this.f(i2);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public final void c(int i2) {
            ArrayMap.this.h(i2);
        }
    }

    public final class MapIterator implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
        public int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f3734Y = -1;
        public boolean Z;

        public MapIterator() {
            this.X = ArrayMap.this.Z - 1;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!this.Z) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i2 = this.f3734Y;
            ArrayMap arrayMap = ArrayMap.this;
            return Intrinsics.a(key, arrayMap.f(i2)) && Intrinsics.a(entry.getValue(), arrayMap.j(this.f3734Y));
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            if (this.Z) {
                return ArrayMap.this.f(this.f3734Y);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            if (this.Z) {
                return ArrayMap.this.j(this.f3734Y);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f3734Y < this.X;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            if (!this.Z) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            int i2 = this.f3734Y;
            ArrayMap arrayMap = ArrayMap.this;
            Object objF = arrayMap.f(i2);
            Object objJ = arrayMap.j(this.f3734Y);
            return (objF == null ? 0 : objF.hashCode()) ^ (objJ != null ? objJ.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f3734Y++;
            this.Z = true;
            return this;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.Z) {
                throw new IllegalStateException();
            }
            ArrayMap.this.h(this.f3734Y);
            this.f3734Y--;
            this.X--;
            this.Z = false;
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (this.Z) {
                return ArrayMap.this.i(this.f3734Y, obj);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + d9.i.f24747b + getValue();
        }
    }

    public final class ValueIterator extends IndexBasedArrayIterator<V> {
        public ValueIterator() {
            super(ArrayMap.this.Z);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public final Object a(int i2) {
            return ArrayMap.this.j(i2);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public final void c(int i2) {
            ArrayMap.this.h(i2);
        }
    }

    public ArrayMap() {
        super(0);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        EntrySet entrySet = this.e0;
        if (entrySet != null) {
            return entrySet;
        }
        EntrySet entrySet2 = new EntrySet();
        this.e0 = entrySet2;
        return entrySet2;
    }

    public final boolean k(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set keySet() {
        KeySet keySet = this.f0;
        if (keySet != null) {
            return keySet;
        }
        KeySet keySet2 = new KeySet();
        this.f0 = keySet2;
        return keySet2;
    }

    public final boolean l(Collection collection) {
        int i2 = this.Z;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i2 != this.Z;
    }

    public final boolean m(Collection collection) {
        int i2 = this.Z;
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            if (!collection.contains(f(i3))) {
                h(i3);
            }
        }
        return i2 != this.Z;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.Z);
        for (Map.Entry<K, V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        ValueCollection valueCollection = this.g0;
        if (valueCollection != null) {
            return valueCollection;
        }
        ValueCollection valueCollection2 = new ValueCollection();
        this.g0 = valueCollection2;
        return valueCollection2;
    }

    public final class KeySet implements Set<K> {
        public KeySet() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            ArrayMap.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return ArrayMap.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection collection) {
            return ArrayMap.this.k(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Set)) {
                return false;
            }
            Set set = (Set) obj;
            ArrayMap arrayMap = ArrayMap.this;
            try {
                return arrayMap.Z == set.size() && arrayMap.k(set);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            ArrayMap arrayMap = ArrayMap.this;
            int iHashCode = 0;
            for (int i2 = arrayMap.Z - 1; i2 >= 0; i2--) {
                Object objF = arrayMap.f(i2);
                iHashCode += objF == null ? 0 : objF.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return ArrayMap.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new KeyIterator();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            ArrayMap arrayMap = ArrayMap.this;
            int iD = arrayMap.d(obj);
            if (iD < 0) {
                return false;
            }
            arrayMap.h(iD);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection collection) {
            return ArrayMap.this.l(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection collection) {
            return ArrayMap.this.m(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return ArrayMap.this.Z;
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            ArrayMap arrayMap = ArrayMap.this;
            int i2 = arrayMap.Z;
            Object[] objArr = new Object[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                objArr[i3] = arrayMap.f(i3);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            ArrayMap arrayMap = ArrayMap.this;
            int i2 = arrayMap.Z;
            if (objArr.length < i2) {
                objArr = (Object[]) a.e(i2, objArr);
            }
            for (int i3 = 0; i3 < i2; i3++) {
                objArr[i3] = arrayMap.f(i3);
            }
            if (objArr.length > i2) {
                objArr[i2] = null;
            }
            return objArr;
        }
    }

    public final class ValueCollection implements Collection<V> {
        public ValueCollection() {
        }

        @Override // java.util.Collection
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final void clear() {
            ArrayMap.this.clear();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return ArrayMap.this.a(obj) >= 0;
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return ArrayMap.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new ValueIterator();
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            ArrayMap arrayMap = ArrayMap.this;
            int iA = arrayMap.a(obj);
            if (iA < 0) {
                return false;
            }
            arrayMap.h(iA);
            return true;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection collection) {
            ArrayMap arrayMap = ArrayMap.this;
            int i2 = arrayMap.Z;
            int i3 = 0;
            boolean z2 = false;
            while (i3 < i2) {
                if (collection.contains(arrayMap.j(i3))) {
                    arrayMap.h(i3);
                    i3--;
                    i2--;
                    z2 = true;
                }
                i3++;
            }
            return z2;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection collection) {
            ArrayMap arrayMap = ArrayMap.this;
            int i2 = arrayMap.Z;
            int i3 = 0;
            boolean z2 = false;
            while (i3 < i2) {
                if (!collection.contains(arrayMap.j(i3))) {
                    arrayMap.h(i3);
                    i3--;
                    i2--;
                    z2 = true;
                }
                i3++;
            }
            return z2;
        }

        @Override // java.util.Collection
        public final int size() {
            return ArrayMap.this.Z;
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            ArrayMap arrayMap = ArrayMap.this;
            int i2 = arrayMap.Z;
            Object[] objArr = new Object[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                objArr[i3] = arrayMap.j(i3);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            ArrayMap arrayMap = ArrayMap.this;
            int i2 = arrayMap.Z;
            if (objArr.length < i2) {
                objArr = (Object[]) a.e(i2, objArr);
            }
            for (int i3 = 0; i3 < i2; i3++) {
                objArr[i3] = arrayMap.j(i3);
            }
            if (objArr.length > i2) {
                objArr[i2] = null;
            }
            return objArr;
        }
    }
}
