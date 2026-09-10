package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class HashBiMap<K, V> extends AbstractMap<K, V> implements BiMap<K, V>, Serializable {
    public transient Object[] X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public transient Object[] f19821Y;
    public transient int Z;
    public transient int e0;
    public transient int[] f0;
    public transient int[] g0;
    public transient int[] h0;
    public transient int[] i0;
    public transient int j0;
    public transient int k0;
    public transient int[] l0;
    public transient int[] m0;
    public transient BiMap n0;

    public final class EntryForKey extends AbstractMapEntry<K, V> {
        public final Object X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f19822Y;

        public EntryForKey(int i2) {
            this.X = HashBiMap.this.X[i2];
            this.f19822Y = i2;
        }

        public final void g() {
            int i2 = this.f19822Y;
            HashBiMap hashBiMap = HashBiMap.this;
            Object obj = this.X;
            if (i2 == -1 || i2 > hashBiMap.Z || !Objects.a(hashBiMap.X[i2], obj)) {
                this.f19822Y = hashBiMap.f(Hashing.c(obj), obj);
            }
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.X;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            g();
            int i2 = this.f19822Y;
            if (i2 == -1) {
                return null;
            }
            return HashBiMap.this.f19821Y[i2];
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public final Object setValue(Object obj) {
            g();
            int i2 = this.f19822Y;
            HashBiMap hashBiMap = HashBiMap.this;
            if (i2 == -1) {
                hashBiMap.put(this.X, obj);
                return null;
            }
            Object obj2 = hashBiMap.f19821Y[i2];
            if (Objects.a(obj2, obj)) {
                return obj;
            }
            hashBiMap.m(this.f19822Y, obj);
            return obj2;
        }
    }

    public static final class EntryForValue<K, V> extends AbstractMapEntry<V, K> {
        public final HashBiMap X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Object f19823Y;
        public int Z;

        public EntryForValue(HashBiMap hashBiMap, int i2) {
            this.X = hashBiMap;
            this.f19823Y = hashBiMap.f19821Y[i2];
            this.Z = i2;
        }

        public final void g() {
            int i2 = this.Z;
            Object obj = this.f19823Y;
            HashBiMap hashBiMap = this.X;
            if (i2 == -1 || i2 > hashBiMap.Z || !Objects.a(obj, hashBiMap.f19821Y[i2])) {
                hashBiMap.getClass();
                this.Z = hashBiMap.g(Hashing.c(obj), obj);
            }
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f19823Y;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            g();
            int i2 = this.Z;
            if (i2 == -1) {
                return null;
            }
            return this.X.X[i2];
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public final Object setValue(Object obj) {
            g();
            int i2 = this.Z;
            HashBiMap hashBiMap = this.X;
            if (i2 != -1) {
                Object obj2 = hashBiMap.X[i2];
                if (Objects.a(obj2, obj)) {
                    return obj;
                }
                hashBiMap.l(this.Z, obj);
                return obj2;
            }
            Object obj3 = this.f19823Y;
            hashBiMap.getClass();
            int iC = Hashing.c(obj3);
            int iG = hashBiMap.g(iC, obj3);
            if (iG != -1) {
                if (Objects.a(hashBiMap.X[iG], obj)) {
                    return null;
                }
                hashBiMap.l(iG, obj);
                return null;
            }
            int i3 = hashBiMap.k0;
            int iC2 = Hashing.c(obj);
            Preconditions.g(hashBiMap.f(iC2, obj) == -1, "Key already present: %s", obj);
            hashBiMap.e(hashBiMap.Z + 1);
            Object[] objArr = hashBiMap.X;
            int i4 = hashBiMap.Z;
            objArr[i4] = obj;
            hashBiMap.f19821Y[i4] = obj3;
            hashBiMap.h(i4, iC2);
            hashBiMap.i(hashBiMap.Z, iC);
            int i5 = i3 == -2 ? hashBiMap.j0 : hashBiMap.m0[i3];
            hashBiMap.n(i3, hashBiMap.Z);
            hashBiMap.n(hashBiMap.Z, i5);
            hashBiMap.Z++;
            hashBiMap.e0++;
            return null;
        }
    }

    public final class EntrySet extends View<K, V, Map.Entry<K, V>> {
        @Override // com.google.common.collect.HashBiMap.View
        public final Object a(int i2) {
            return new EntryForKey(i2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            entry.getValue();
            Hashing.c(key);
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            entry.getValue();
            Hashing.c(key);
            throw null;
        }
    }

    public static class Inverse<K, V> extends AbstractMap<V, K> implements BiMap<V, K>, Serializable {
        public transient Set X;

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            throw null;
        }

        @Override // com.google.common.collect.BiMap
        public final BiMap H() {
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsValue(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Set entrySet() {
            Set set = this.X;
            if (set != null) {
                return set;
            }
            InverseEntrySet inverseEntrySet = new InverseEntrySet(null);
            this.X = inverseEntrySet;
            return inverseEntrySet;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object put(Object obj, Object obj2) {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Collection values() {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public final Set values() {
            throw null;
        }
    }

    public static class InverseEntrySet<K, V> extends View<K, V, Map.Entry<V, K>> {
        @Override // com.google.common.collect.HashBiMap.View
        public final Object a(int i2) {
            return new EntryForValue(this.X, i2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            HashBiMap hashBiMap = this.X;
            hashBiMap.getClass();
            int iG = hashBiMap.g(Hashing.c(key), key);
            return iG != -1 && Objects.a(hashBiMap.X[iG], value);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iC = Hashing.c(key);
            HashBiMap hashBiMap = this.X;
            int iG = hashBiMap.g(iC, key);
            if (iG == -1 || !Objects.a(hashBiMap.X[iG], value)) {
                return false;
            }
            hashBiMap.j(iG, Hashing.c(hashBiMap.X[iG]), iC);
            return true;
        }
    }

    public final class KeySet extends View<K, V, K> {
        @Override // com.google.common.collect.HashBiMap.View
        public final Object a(int i2) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Hashing.c(obj);
            throw null;
        }
    }

    public final class ValueSet extends View<K, V, V> {
        @Override // com.google.common.collect.HashBiMap.View
        public final Object a(int i2) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Hashing.c(obj);
            throw null;
        }
    }

    public static abstract class View<K, V, T> extends AbstractSet<T> {
        public final HashBiMap X;

        public View(HashBiMap hashBiMap) {
            this.X = hashBiMap;
        }

        public abstract Object a(int i2);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            this.X.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new Iterator<Object>() { // from class: com.google.common.collect.HashBiMap.View.1
                public int X;

                /* JADX INFO: renamed from: Y, reason: collision with root package name */
                public int f19824Y;
                public int Z;
                public int e0;

                {
                    HashBiMap hashBiMap = View.this.X;
                    this.X = hashBiMap.j0;
                    this.f19824Y = -1;
                    this.Z = hashBiMap.e0;
                    this.e0 = hashBiMap.Z;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    if (View.this.X.e0 == this.Z) {
                        return this.X != -2 && this.e0 > 0;
                    }
                    throw new ConcurrentModificationException();
                }

                @Override // java.util.Iterator
                public final Object next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    int i2 = this.X;
                    View view = View.this;
                    Object objA = view.a(i2);
                    int i3 = this.X;
                    this.f19824Y = i3;
                    this.X = view.X.m0[i3];
                    this.e0--;
                    return objA;
                }

                @Override // java.util.Iterator
                public final void remove() {
                    View view = View.this;
                    if (view.X.e0 != this.Z) {
                        throw new ConcurrentModificationException();
                    }
                    CollectPreconditions.d(this.f19824Y != -1);
                    int i2 = this.f19824Y;
                    HashBiMap hashBiMap = view.X;
                    hashBiMap.k(i2, Hashing.c(hashBiMap.X[i2]));
                    if (this.X == hashBiMap.Z) {
                        this.X = this.f19824Y;
                    }
                    this.f19824Y = -1;
                    this.Z = hashBiMap.e0;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.X.Z;
        }
    }

    public static int[] b(int i2) {
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i2 = objectInputStream.readInt();
        CollectPreconditions.b(16, "expectedSize");
        int iA = Hashing.a(16, 1.0d);
        this.Z = 0;
        this.X = new Object[16];
        this.f19821Y = new Object[16];
        this.f0 = b(iA);
        this.g0 = b(iA);
        this.h0 = b(16);
        this.i0 = b(16);
        this.j0 = -2;
        this.k0 = -2;
        this.l0 = b(16);
        this.m0 = b(16);
        Serialization.b(this, objectInputStream, i2);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Serialization.e(this, objectOutputStream);
    }

    @Override // com.google.common.collect.BiMap
    public final BiMap H() {
        return this.n0;
    }

    public final int a(int i2) {
        return i2 & (this.f0.length - 1);
    }

    public final void c(int i2, int i3) {
        Preconditions.f(i2 != -1);
        int iA = a(i3);
        int[] iArr = this.f0;
        int i4 = iArr[iA];
        if (i4 == i2) {
            int[] iArr2 = this.h0;
            iArr[iA] = iArr2[i2];
            iArr2[i2] = -1;
            return;
        }
        int i5 = this.h0[i4];
        while (true) {
            int i6 = i4;
            i4 = i5;
            if (i4 == -1) {
                throw new AssertionError("Expected to find entry with key " + this.X[i2]);
            }
            if (i4 == i2) {
                int[] iArr3 = this.h0;
                iArr3[i6] = iArr3[i2];
                iArr3[i2] = -1;
                return;
            }
            i5 = this.h0[i4];
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.X, 0, this.Z, (Object) null);
        Arrays.fill(this.f19821Y, 0, this.Z, (Object) null);
        Arrays.fill(this.f0, -1);
        Arrays.fill(this.g0, -1);
        Arrays.fill(this.h0, 0, this.Z, -1);
        Arrays.fill(this.i0, 0, this.Z, -1);
        Arrays.fill(this.l0, 0, this.Z, -1);
        Arrays.fill(this.m0, 0, this.Z, -1);
        this.Z = 0;
        this.j0 = -2;
        this.k0 = -2;
        this.e0++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return f(Hashing.c(obj), obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return g(Hashing.c(obj), obj) != -1;
    }

    public final void d(int i2, int i3) {
        Preconditions.f(i2 != -1);
        int iA = a(i3);
        int[] iArr = this.g0;
        int i4 = iArr[iA];
        if (i4 == i2) {
            int[] iArr2 = this.i0;
            iArr[iA] = iArr2[i2];
            iArr2[i2] = -1;
            return;
        }
        int i5 = this.i0[i4];
        while (true) {
            int i6 = i4;
            i4 = i5;
            if (i4 == -1) {
                throw new AssertionError("Expected to find entry with value " + this.f19821Y[i2]);
            }
            if (i4 == i2) {
                int[] iArr3 = this.i0;
                iArr3[i6] = iArr3[i2];
                iArr3[i2] = -1;
                return;
            }
            i5 = this.i0[i4];
        }
    }

    public final void e(int i2) {
        int[] iArr = this.h0;
        if (iArr.length < i2) {
            int iA = ImmutableCollection.Builder.a(iArr.length, i2);
            this.X = Arrays.copyOf(this.X, iA);
            this.f19821Y = Arrays.copyOf(this.f19821Y, iA);
            int[] iArr2 = this.h0;
            int length = iArr2.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr2, iA);
            Arrays.fill(iArrCopyOf, length, iA, -1);
            this.h0 = iArrCopyOf;
            int[] iArr3 = this.i0;
            int length2 = iArr3.length;
            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, iA);
            Arrays.fill(iArrCopyOf2, length2, iA, -1);
            this.i0 = iArrCopyOf2;
            int[] iArr4 = this.l0;
            int length3 = iArr4.length;
            int[] iArrCopyOf3 = Arrays.copyOf(iArr4, iA);
            Arrays.fill(iArrCopyOf3, length3, iA, -1);
            this.l0 = iArrCopyOf3;
            int[] iArr5 = this.m0;
            int length4 = iArr5.length;
            int[] iArrCopyOf4 = Arrays.copyOf(iArr5, iA);
            Arrays.fill(iArrCopyOf4, length4, iA, -1);
            this.m0 = iArrCopyOf4;
        }
        if (this.f0.length < i2) {
            int iA2 = Hashing.a(i2, 1.0d);
            this.f0 = b(iA2);
            this.g0 = b(iA2);
            for (int i3 = 0; i3 < this.Z; i3++) {
                int iA3 = a(Hashing.c(this.X[i3]));
                int[] iArr6 = this.h0;
                int[] iArr7 = this.f0;
                iArr6[i3] = iArr7[iA3];
                iArr7[iA3] = i3;
                int iA4 = a(Hashing.c(this.f19821Y[i3]));
                int[] iArr8 = this.i0;
                int[] iArr9 = this.g0;
                iArr8[i3] = iArr9[iA4];
                iArr9[iA4] = i3;
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return null;
    }

    public final int f(int i2, Object obj) {
        int[] iArr = this.f0;
        int[] iArr2 = this.h0;
        Object[] objArr = this.X;
        for (int i3 = iArr[a(i2)]; i3 != -1; i3 = iArr2[i3]) {
            if (Objects.a(objArr[i3], obj)) {
                return i3;
            }
        }
        return -1;
    }

    public final int g(int i2, Object obj) {
        int[] iArr = this.g0;
        int[] iArr2 = this.i0;
        Object[] objArr = this.f19821Y;
        for (int i3 = iArr[a(i2)]; i3 != -1; i3 = iArr2[i3]) {
            if (Objects.a(objArr[i3], obj)) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        int iF = f(Hashing.c(obj), obj);
        if (iF == -1) {
            return null;
        }
        return this.f19821Y[iF];
    }

    public final void h(int i2, int i3) {
        Preconditions.f(i2 != -1);
        int iA = a(i3);
        int[] iArr = this.h0;
        int[] iArr2 = this.f0;
        iArr[i2] = iArr2[iA];
        iArr2[iA] = i2;
    }

    public final void i(int i2, int i3) {
        Preconditions.f(i2 != -1);
        int iA = a(i3);
        int[] iArr = this.i0;
        int[] iArr2 = this.g0;
        iArr[i2] = iArr2[iA];
        iArr2[iA] = i2;
    }

    public final void j(int i2, int i3, int i4) {
        int i5;
        int i6;
        Preconditions.f(i2 != -1);
        c(i2, i3);
        d(i2, i4);
        n(this.l0[i2], this.m0[i2]);
        int i7 = this.Z - 1;
        if (i7 != i2) {
            int i8 = this.l0[i7];
            int i9 = this.m0[i7];
            n(i8, i2);
            n(i2, i9);
            Object[] objArr = this.X;
            Object obj = objArr[i7];
            Object[] objArr2 = this.f19821Y;
            Object obj2 = objArr2[i7];
            objArr[i2] = obj;
            objArr2[i2] = obj2;
            int iA = a(Hashing.c(obj));
            int[] iArr = this.f0;
            int i10 = iArr[iA];
            if (i10 == i7) {
                iArr[iA] = i2;
            } else {
                int i11 = this.h0[i10];
                while (true) {
                    i5 = i10;
                    i10 = i11;
                    if (i10 == i7) {
                        break;
                    } else {
                        i11 = this.h0[i10];
                    }
                }
                this.h0[i5] = i2;
            }
            int[] iArr2 = this.h0;
            iArr2[i2] = iArr2[i7];
            iArr2[i7] = -1;
            int iA2 = a(Hashing.c(obj2));
            int[] iArr3 = this.g0;
            int i12 = iArr3[iA2];
            if (i12 == i7) {
                iArr3[iA2] = i2;
            } else {
                int i13 = this.i0[i12];
                while (true) {
                    i6 = i12;
                    i12 = i13;
                    if (i12 == i7) {
                        break;
                    } else {
                        i13 = this.i0[i12];
                    }
                }
                this.i0[i6] = i2;
            }
            int[] iArr4 = this.i0;
            iArr4[i2] = iArr4[i7];
            iArr4[i7] = -1;
        }
        Object[] objArr3 = this.X;
        int i14 = this.Z;
        objArr3[i14 - 1] = null;
        this.f19821Y[i14 - 1] = null;
        this.Z = i14 - 1;
        this.e0++;
    }

    public final void k(int i2, int i3) {
        j(i2, i3, Hashing.c(this.f19821Y[i2]));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return null;
    }

    public final void l(int i2, Object obj) {
        Preconditions.f(i2 != -1);
        int iF = f(Hashing.c(obj), obj);
        int i3 = this.k0;
        if (iF != -1) {
            throw new IllegalArgumentException("Key already present in map: " + obj);
        }
        if (i3 == i2) {
            i3 = this.l0[i2];
        } else if (i3 == this.Z) {
            i3 = iF;
        }
        if (-2 == i2) {
            iF = this.m0[i2];
        } else if (-2 != this.Z) {
            iF = -2;
        }
        n(this.l0[i2], this.m0[i2]);
        c(i2, Hashing.c(this.X[i2]));
        this.X[i2] = obj;
        h(i2, Hashing.c(obj));
        n(i3, i2);
        n(i2, iF);
    }

    public final void m(int i2, Object obj) {
        Preconditions.f(i2 != -1);
        int iC = Hashing.c(obj);
        if (g(iC, obj) != -1) {
            throw new IllegalArgumentException("Value already present in map: " + obj);
        }
        d(i2, Hashing.c(this.f19821Y[i2]));
        this.f19821Y[i2] = obj;
        i(i2, iC);
    }

    public final void n(int i2, int i3) {
        if (i2 == -2) {
            this.j0 = i3;
        } else {
            this.m0[i2] = i3;
        }
        if (i3 == -2) {
            this.k0 = i2;
        } else {
            this.l0[i3] = i2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int iC = Hashing.c(obj);
        int iF = f(iC, obj);
        if (iF != -1) {
            Object obj3 = this.f19821Y[iF];
            if (Objects.a(obj3, obj2)) {
                return obj2;
            }
            m(iF, obj2);
            return obj3;
        }
        int iC2 = Hashing.c(obj2);
        Preconditions.g(g(iC2, obj2) == -1, "Value already present: %s", obj2);
        e(this.Z + 1);
        Object[] objArr = this.X;
        int i2 = this.Z;
        objArr[i2] = obj;
        this.f19821Y[i2] = obj2;
        h(i2, iC);
        i(this.Z, iC2);
        n(this.k0, this.Z);
        n(this.Z, -2);
        this.Z++;
        this.e0++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        int iC = Hashing.c(obj);
        int iF = f(iC, obj);
        if (iF == -1) {
            return null;
        }
        Object obj2 = this.f19821Y[iF];
        k(iF, iC);
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.Z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
    public final Set values() {
        return null;
    }
}
