package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
class CompactHashMap<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Object k0 = new Object();
    public transient Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public transient int[] f19801Y;
    public transient Object[] Z;
    public transient Object[] e0;
    public transient int f0;
    public transient int g0;
    public transient Set h0;
    public transient Set i0;
    public transient Collection j0;

    /* JADX INFO: renamed from: com.google.common.collect.CompactHashMap$2, reason: invalid class name */
    class AnonymousClass2 extends CompactHashMap<Object, Object>.Itr<Map.Entry<Object, Object>> {
        public AnonymousClass2() {
            super();
        }

        @Override // com.google.common.collect.CompactHashMap.Itr
        public final Object a(int i2) {
            return new MapEntry(i2);
        }
    }

    public class EntrySetView extends AbstractSet<Map.Entry<K, V>> {
        public EntrySetView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            CompactHashMap compactHashMap = CompactHashMap.this;
            Map mapJ = compactHashMap.j();
            if (mapJ != null) {
                return mapJ.entrySet().contains(obj);
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int iO = compactHashMap.o(entry.getKey());
                if (iO != -1 && Objects.a(compactHashMap.y()[iO], entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            CompactHashMap compactHashMap = CompactHashMap.this;
            Map mapJ = compactHashMap.j();
            return mapJ != null ? mapJ.entrySet().iterator() : new AnonymousClass2();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            CompactHashMap compactHashMap = CompactHashMap.this;
            Map mapJ = compactHashMap.j();
            if (mapJ != null) {
                return mapJ.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (compactHashMap.u()) {
                return false;
            }
            int iM = compactHashMap.m();
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object obj2 = compactHashMap.X;
            java.util.Objects.requireNonNull(obj2);
            int iD = CompactHashing.d(key, value, iM, obj2, compactHashMap.w(), compactHashMap.x(), compactHashMap.y());
            if (iD == -1) {
                return false;
            }
            compactHashMap.t(iD, iM);
            compactHashMap.g0--;
            compactHashMap.n();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return CompactHashMap.this.size();
        }
    }

    public abstract class Itr<T> implements Iterator<T> {
        public int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f19802Y;
        public int Z = -1;

        public Itr() {
            this.X = CompactHashMap.this.f0;
            this.f19802Y = CompactHashMap.this.k();
        }

        public abstract Object a(int i2);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f19802Y >= 0;
        }

        @Override // java.util.Iterator
        public final Object next() {
            CompactHashMap compactHashMap = CompactHashMap.this;
            if (compactHashMap.f0 != this.X) {
                throw new ConcurrentModificationException();
            }
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i2 = this.f19802Y;
            this.Z = i2;
            Object objA = a(i2);
            this.f19802Y = compactHashMap.l(this.f19802Y);
            return objA;
        }

        @Override // java.util.Iterator
        public final void remove() {
            CompactHashMap compactHashMap = CompactHashMap.this;
            if (compactHashMap.f0 != this.X) {
                throw new ConcurrentModificationException();
            }
            CollectPreconditions.d(this.Z >= 0);
            this.X += 32;
            compactHashMap.remove(compactHashMap.x()[this.Z]);
            this.f19802Y = compactHashMap.b(this.f19802Y, this.Z);
            this.Z = -1;
        }
    }

    public class KeySetView extends AbstractSet<K> {
        public KeySetView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return CompactHashMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            final CompactHashMap compactHashMap = CompactHashMap.this;
            Map mapJ = compactHashMap.j();
            return mapJ != null ? mapJ.keySet().iterator() : new CompactHashMap<Object, Object>.Itr<Object>() { // from class: com.google.common.collect.CompactHashMap.1
                @Override // com.google.common.collect.CompactHashMap.Itr
                public final Object a(int i2) {
                    Object obj = CompactHashMap.k0;
                    return CompactHashMap.this.x()[i2];
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            CompactHashMap compactHashMap = CompactHashMap.this;
            Map mapJ = compactHashMap.j();
            if (mapJ != null) {
                return mapJ.keySet().remove(obj);
            }
            return compactHashMap.v(obj) != CompactHashMap.k0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return CompactHashMap.this.size();
        }
    }

    public final class MapEntry extends AbstractMapEntry<K, V> {
        public final Object X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f19803Y;

        public MapEntry(int i2) {
            Object obj = CompactHashMap.k0;
            this.X = CompactHashMap.this.x()[i2];
            this.f19803Y = i2;
        }

        public final void g() {
            int i2 = this.f19803Y;
            Object obj = this.X;
            CompactHashMap compactHashMap = CompactHashMap.this;
            if (i2 != -1 && i2 < compactHashMap.size()) {
                if (Objects.a(obj, compactHashMap.x()[this.f19803Y])) {
                    return;
                }
            }
            Object obj2 = CompactHashMap.k0;
            this.f19803Y = compactHashMap.o(obj);
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.X;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            CompactHashMap compactHashMap = CompactHashMap.this;
            Map mapJ = compactHashMap.j();
            if (mapJ != null) {
                return mapJ.get(this.X);
            }
            g();
            int i2 = this.f19803Y;
            if (i2 == -1) {
                return null;
            }
            return compactHashMap.y()[i2];
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public final Object setValue(Object obj) {
            CompactHashMap compactHashMap = CompactHashMap.this;
            Map mapJ = compactHashMap.j();
            Object obj2 = this.X;
            if (mapJ != 0) {
                return mapJ.put(obj2, obj);
            }
            g();
            int i2 = this.f19803Y;
            if (i2 == -1) {
                compactHashMap.put(obj2, obj);
                return null;
            }
            Object obj3 = compactHashMap.y()[i2];
            compactHashMap.y()[this.f19803Y] = obj;
            return obj3;
        }
    }

    public class ValuesView extends AbstractCollection<V> {
        public ValuesView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            final CompactHashMap compactHashMap = CompactHashMap.this;
            Map mapJ = compactHashMap.j();
            return mapJ != null ? mapJ.values().iterator() : new CompactHashMap<Object, Object>.Itr<Object>() { // from class: com.google.common.collect.CompactHashMap.3
                @Override // com.google.common.collect.CompactHashMap.Itr
                public final Object a(int i2) {
                    Object obj = CompactHashMap.k0;
                    return CompactHashMap.this.y()[i2];
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return CompactHashMap.this.size();
        }
    }

    public CompactHashMap(int i2) {
        q(i2);
    }

    public static CompactHashMap h() {
        CompactHashMap compactHashMap = new CompactHashMap();
        compactHashMap.q(3);
        return compactHashMap;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i2 = objectInputStream.readInt();
        if (i2 < 0) {
            throw new InvalidObjectException(android.support.v4.media.a.h(i2, "Invalid size: "));
        }
        q(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Map mapJ = j();
        Iterator<Map.Entry<K, V>> it = mapJ != null ? mapJ.entrySet().iterator() : new AnonymousClass2();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    public final int A(int i2, int i3, int i4, int i5) {
        Object objA = CompactHashing.a(i3);
        int i6 = i3 - 1;
        if (i5 != 0) {
            CompactHashing.f(i4 & i6, i5 + 1, objA);
        }
        Object obj = this.X;
        java.util.Objects.requireNonNull(obj);
        int[] iArrW = w();
        for (int i7 = 0; i7 <= i2; i7++) {
            int iE = CompactHashing.e(i7, obj);
            while (iE != 0) {
                int i8 = iE - 1;
                int i9 = iArrW[i8];
                int i10 = ((~i2) & i9) | i7;
                int i11 = i10 & i6;
                int iE2 = CompactHashing.e(i11, objA);
                CompactHashing.f(i11, iE, objA);
                iArrW[i8] = CompactHashing.b(i10, iE2, i6);
                iE = i9 & i2;
            }
        }
        this.X = objA;
        this.f0 = CompactHashing.b(this.f0, 32 - Integer.numberOfLeadingZeros(i6), 31);
        return i6;
    }

    public void a(int i2) {
    }

    public int b(int i2, int i3) {
        return i2 - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (u()) {
            return;
        }
        n();
        Map mapJ = j();
        if (mapJ != null) {
            this.f0 = Ints.c(size(), 3);
            mapJ.clear();
            this.X = null;
            this.g0 = 0;
            return;
        }
        Arrays.fill(x(), 0, this.g0, (Object) null);
        Arrays.fill(y(), 0, this.g0, (Object) null);
        Object obj = this.X;
        java.util.Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(w(), 0, this.g0, 0);
        this.g0 = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapJ = j();
        if (mapJ != null) {
            return mapJ.containsKey(obj);
        }
        return o(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapJ = j();
        if (mapJ != null) {
            return mapJ.containsValue(obj);
        }
        for (int i2 = 0; i2 < this.g0; i2++) {
            if (Objects.a(obj, y()[i2])) {
                return true;
            }
        }
        return false;
    }

    public int d() {
        Preconditions.o("Arrays already allocated", u());
        int i2 = this.f0;
        int iMax = Math.max(4, Hashing.a(i2 + 1, 1.0d));
        this.X = CompactHashing.a(iMax);
        this.f0 = CompactHashing.b(this.f0, 32 - Integer.numberOfLeadingZeros(iMax - 1), 31);
        this.f19801Y = new int[i2];
        this.Z = new Object[i2];
        this.e0 = new Object[i2];
        return i2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.i0;
        if (set != null) {
            return set;
        }
        EntrySetView entrySetView = new EntrySetView();
        this.i0 = entrySetView;
        return entrySetView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Map g() {
        LinkedHashMap linkedHashMapI = i(m() + 1);
        int iK = k();
        while (iK >= 0) {
            linkedHashMapI.put(x()[iK], y()[iK]);
            iK = l(iK);
        }
        this.X = linkedHashMapI;
        this.f19801Y = null;
        this.Z = null;
        this.e0 = null;
        n();
        return linkedHashMapI;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapJ = j();
        if (mapJ != null) {
            return mapJ.get(obj);
        }
        int iO = o(obj);
        if (iO == -1) {
            return null;
        }
        a(iO);
        return y()[iO];
    }

    public LinkedHashMap i(int i2) {
        return new LinkedHashMap(i2, 1.0f);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Map j() {
        Object obj = this.X;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public int k() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.h0;
        if (set != null) {
            return set;
        }
        KeySetView keySetView = new KeySetView();
        this.h0 = keySetView;
        return keySetView;
    }

    public int l(int i2) {
        int i3 = i2 + 1;
        if (i3 < this.g0) {
            return i3;
        }
        return -1;
    }

    public final int m() {
        return (1 << (this.f0 & 31)) - 1;
    }

    public final void n() {
        this.f0 += 32;
    }

    public final int o(Object obj) {
        if (u()) {
            return -1;
        }
        int iC = Hashing.c(obj);
        int iM = m();
        Object obj2 = this.X;
        java.util.Objects.requireNonNull(obj2);
        int iE = CompactHashing.e(iC & iM, obj2);
        if (iE == 0) {
            return -1;
        }
        int i2 = ~iM;
        int i3 = iC & i2;
        do {
            int i4 = iE - 1;
            int i5 = w()[i4];
            if ((i5 & i2) == i3 && Objects.a(obj, x()[i4])) {
                return i4;
            }
            iE = i5 & iM;
        } while (iE != 0);
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b8  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i2;
        int iA;
        int length;
        int iMin;
        Object obj3 = obj;
        Object obj4 = obj2;
        if (u()) {
            d();
        }
        Map mapJ = j();
        if (mapJ != 0) {
            return mapJ.put(obj3, obj4);
        }
        int[] iArrW = w();
        Object[] objArrX = x();
        Object[] objArrY = y();
        int i3 = this.g0;
        int i4 = i3 + 1;
        int iC = Hashing.c(obj3);
        int iM = m();
        int i5 = iC & iM;
        Object obj5 = this.X;
        java.util.Objects.requireNonNull(obj5);
        int iE = CompactHashing.e(i5, obj5);
        int i6 = 1;
        if (iE == 0) {
            if (i4 > iM) {
                iA = A(iM, CompactHashing.c(iM), iC, i3);
                i2 = 1;
            } else {
                Object obj6 = this.X;
                java.util.Objects.requireNonNull(obj6);
                CompactHashing.f(i5, i4, obj6);
                i2 = 1;
            }
            length = w().length;
            if (i4 > length) {
                int i7 = i2;
                iMin = Math.min(1073741823, (Math.max(i7, length >>> 1) + length) | i7);
                if (iMin != length) {
                    z(iMin);
                }
            }
            r(i3, obj3, obj4, iC, iA);
            this.g0 = i4;
            n();
            return null;
        }
        int i8 = ~iM;
        int i9 = iC & i8;
        int i10 = 0;
        while (true) {
            int i11 = iE - i6;
            int i12 = iArrW[i11];
            i2 = i6;
            if ((i12 & i8) == i9 && Objects.a(obj3, objArrX[i11])) {
                Object obj7 = objArrY[i11];
                objArrY[i11] = obj4;
                a(i11);
                return obj7;
            }
            int i13 = i12 & iM;
            i10++;
            if (i13 == 0) {
                if (i10 < 9) {
                    if (i4 <= iM) {
                        iArrW[i11] = CompactHashing.b(i12, i4, iM);
                        break;
                    }
                    iM = A(iM, CompactHashing.c(iM), iC, i3);
                    break;
                }
                return g().put(obj3, obj4);
            }
            obj3 = obj;
            obj4 = obj2;
            iE = i13;
            i6 = i2;
        }
        iA = iM;
        length = w().length;
        if (i4 > length) {
            int i14 = i2;
            iMin = Math.min(1073741823, (Math.max(i14, length >>> 1) + length) | i14);
            if (iMin != length) {
                z(iMin);
            }
        }
        r(i3, obj3, obj4, iC, iA);
        this.g0 = i4;
        n();
        return null;
    }

    public void q(int i2) {
        Preconditions.e("Expected size must be >= 0", i2 >= 0);
        this.f0 = Ints.c(i2, 1);
    }

    public void r(int i2, Object obj, Object obj2, int i3, int i4) {
        w()[i2] = CompactHashing.b(i3, 0, i4);
        x()[i2] = obj;
        y()[i2] = obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapJ = j();
        if (mapJ != null) {
            return mapJ.remove(obj);
        }
        Object objV = v(obj);
        if (objV == k0) {
            return null;
        }
        return objV;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapJ = j();
        return mapJ != null ? mapJ.size() : this.g0;
    }

    public void t(int i2, int i3) {
        Object obj = this.X;
        java.util.Objects.requireNonNull(obj);
        int[] iArrW = w();
        Object[] objArrX = x();
        Object[] objArrY = y();
        int size = size();
        int i4 = size - 1;
        if (i2 >= i4) {
            objArrX[i2] = null;
            objArrY[i2] = null;
            iArrW[i2] = 0;
            return;
        }
        Object obj2 = objArrX[i4];
        objArrX[i2] = obj2;
        objArrY[i2] = objArrY[i4];
        objArrX[i4] = null;
        objArrY[i4] = null;
        iArrW[i2] = iArrW[i4];
        iArrW[i4] = 0;
        int iC = Hashing.c(obj2) & i3;
        int iE = CompactHashing.e(iC, obj);
        if (iE == size) {
            CompactHashing.f(iC, i2 + 1, obj);
            return;
        }
        while (true) {
            int i5 = iE - 1;
            int i6 = iArrW[i5];
            int i7 = i6 & i3;
            if (i7 == size) {
                iArrW[i5] = CompactHashing.b(i6, i2 + 1, i3);
                return;
            }
            iE = i7;
        }
    }

    public final boolean u() {
        return this.X == null;
    }

    public final Object v(Object obj) {
        boolean zU = u();
        Object obj2 = k0;
        if (zU) {
            return obj2;
        }
        int iM = m();
        Object obj3 = this.X;
        java.util.Objects.requireNonNull(obj3);
        int iD = CompactHashing.d(obj, null, iM, obj3, w(), x(), null);
        if (iD == -1) {
            return obj2;
        }
        Object obj4 = y()[iD];
        t(iD, iM);
        this.g0--;
        n();
        return obj4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.j0;
        if (collection != null) {
            return collection;
        }
        ValuesView valuesView = new ValuesView();
        this.j0 = valuesView;
        return valuesView;
    }

    public final int[] w() {
        int[] iArr = this.f19801Y;
        java.util.Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] x() {
        Object[] objArr = this.Z;
        java.util.Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] y() {
        Object[] objArr = this.e0;
        java.util.Objects.requireNonNull(objArr);
        return objArr;
    }

    public void z(int i2) {
        this.f19801Y = Arrays.copyOf(w(), i2);
        this.Z = Arrays.copyOf(x(), i2);
        this.e0 = Arrays.copyOf(y(), i2);
    }
}
