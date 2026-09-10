package kotlin.collections.builders;

import com.p004ironsource.dc;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableMap;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0006\t\n\u000b\f\r\u000eJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lkotlin/collections/builders/MapBuilder;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "Companion", "Itr", "KeysItr", "ValuesItr", "EntriesItr", "EntryRef", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, KMutableMap {
    public static final MapBuilder o0;
    public Object[] X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Object[] f43283Y;
    public int[] Z;
    public int[] e0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public MapBuilderKeys k0;
    public MapBuilderValues l0;
    public MapBuilderEntries m0;
    public boolean n0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lkotlin/collections/builders/MapBuilder$Companion;", "", "", "MAGIC", "I", "INITIAL_CAPACITY", "INITIAL_MAX_PROBE_DISTANCE", "TOMBSTONE", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00050\u0004¨\u0006\u0006"}, d2 = {"Lkotlin/collections/builders/MapBuilder$EntriesItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", "", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EntriesItr<K, V> extends Itr<K, V> implements Iterator<Map.Entry<K, V>>, KMutableIterator {
        @Override // java.util.Iterator
        public final Object next() {
            a();
            int i2 = this.f43285Y;
            MapBuilder mapBuilder = this.X;
            if (i2 >= mapBuilder.g0) {
                throw new NoSuchElementException();
            }
            this.f43285Y = i2 + 1;
            this.Z = i2;
            EntryRef entryRef = new EntryRef(mapBuilder, i2);
            c();
            return entryRef;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/collections/builders/MapBuilder$EntryRef;", "K", "V", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EntryRef<K, V> implements Map.Entry<K, V>, KMutableMap.Entry {
        public final MapBuilder X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final int f43284Y;
        public final int Z;

        public EntryRef(MapBuilder map, int i2) {
            Intrinsics.f(map, "map");
            this.X = map;
            this.f43284Y = i2;
            this.Z = map.i0;
        }

        public final void a() {
            if (this.X.i0 != this.Z) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return Intrinsics.a(entry.getKey(), getKey()) && Intrinsics.a(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            a();
            return this.X.X[this.f43284Y];
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            a();
            Object[] objArr = this.X.f43283Y;
            Intrinsics.c(objArr);
            return objArr[this.f43284Y];
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            Object key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            a();
            MapBuilder mapBuilder = this.X;
            mapBuilder.g();
            Object[] objArr = mapBuilder.f43283Y;
            if (objArr == null) {
                int length = mapBuilder.X.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                mapBuilder.f43283Y = objArr;
            }
            int i2 = this.f43284Y;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
            return obj2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append(dc.T);
            sb.append(getValue());
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/collections/builders/MapBuilder$Itr;", "K", "V", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class Itr<K, V> {
        public final MapBuilder X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f43285Y;
        public int Z;
        public int e0;

        public Itr(MapBuilder map) {
            Intrinsics.f(map, "map");
            this.X = map;
            this.Z = -1;
            this.e0 = map.i0;
            c();
        }

        public final void a() {
            if (this.X.i0 != this.e0) {
                throw new ConcurrentModificationException();
            }
        }

        public final void c() {
            while (true) {
                int i2 = this.f43285Y;
                MapBuilder mapBuilder = this.X;
                if (i2 >= mapBuilder.g0 || mapBuilder.Z[i2] >= 0) {
                    return;
                } else {
                    this.f43285Y = i2 + 1;
                }
            }
        }

        public final boolean hasNext() {
            return this.f43285Y < this.X.g0;
        }

        public final void remove() {
            a();
            if (this.Z == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            MapBuilder mapBuilder = this.X;
            mapBuilder.g();
            mapBuilder.q(this.Z);
            this.Z = -1;
            this.e0 = mapBuilder.i0;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/collections/builders/MapBuilder$KeysItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class KeysItr<K, V> extends Itr<K, V> implements Iterator<K>, KMutableIterator {
        @Override // java.util.Iterator
        public final Object next() {
            a();
            int i2 = this.f43285Y;
            MapBuilder mapBuilder = this.X;
            if (i2 >= mapBuilder.g0) {
                throw new NoSuchElementException();
            }
            this.f43285Y = i2 + 1;
            this.Z = i2;
            Object obj = mapBuilder.X[i2];
            c();
            return obj;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00030\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/collections/builders/MapBuilder$ValuesItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ValuesItr<K, V> extends Itr<K, V> implements Iterator<V>, KMutableIterator {
        @Override // java.util.Iterator
        public final Object next() {
            a();
            int i2 = this.f43285Y;
            MapBuilder mapBuilder = this.X;
            if (i2 >= mapBuilder.g0) {
                throw new NoSuchElementException();
            }
            this.f43285Y = i2 + 1;
            this.Z = i2;
            Object[] objArr = mapBuilder.f43283Y;
            Intrinsics.c(objArr);
            Object obj = objArr[this.Z];
            c();
            return obj;
        }
    }

    static {
        MapBuilder mapBuilder = new MapBuilder(0);
        mapBuilder.n0 = true;
        o0 = mapBuilder;
    }

    public MapBuilder() {
        this(8);
    }

    private final Object writeReplace() throws NotSerializableException {
        if (!this.n0) {
            throw new NotSerializableException("The map cannot be serialized while it is being built.");
        }
        SerializedMap serializedMap = new SerializedMap();
        serializedMap.X = this;
        return serializedMap;
    }

    public final int a(Object obj) {
        g();
        while (true) {
            int iN = n(obj);
            int i2 = this.f0 * 2;
            int length = this.e0.length / 2;
            if (i2 > length) {
                i2 = length;
            }
            int i3 = 0;
            while (true) {
                int[] iArr = this.e0;
                int i4 = iArr[iN];
                if (i4 <= 0) {
                    int i5 = this.g0;
                    Object[] objArr = this.X;
                    if (i5 >= objArr.length) {
                        k(1);
                        break;
                    }
                    int i6 = i5 + 1;
                    this.g0 = i6;
                    objArr[i5] = obj;
                    this.Z[i5] = iN;
                    iArr[iN] = i6;
                    this.j0++;
                    this.i0++;
                    if (i3 > this.f0) {
                        this.f0 = i3;
                    }
                    return i5;
                }
                if (Intrinsics.a(this.X[i4 - 1], obj)) {
                    return -i4;
                }
                i3++;
                if (i3 > i2) {
                    o(this.e0.length * 2);
                    break;
                }
                iN = iN == 0 ? this.e0.length - 1 : iN - 1;
            }
        }
    }

    @Override // java.util.Map
    public final void clear() {
        g();
        int i2 = this.g0 - 1;
        if (i2 >= 0) {
            int i3 = 0;
            while (true) {
                int[] iArr = this.Z;
                int i4 = iArr[i3];
                if (i4 >= 0) {
                    this.e0[i4] = 0;
                    iArr[i3] = -1;
                }
                if (i3 == i2) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        ListBuilderKt.c(this.X, 0, this.g0);
        Object[] objArr = this.f43283Y;
        if (objArr != null) {
            ListBuilderKt.c(objArr, 0, this.g0);
        }
        this.j0 = 0;
        this.g0 = 0;
        this.i0++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return l(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return m(obj) >= 0;
    }

    public final MapBuilder d() {
        g();
        this.n0 = true;
        if (this.j0 > 0) {
            return this;
        }
        MapBuilder mapBuilder = o0;
        Intrinsics.d(mapBuilder, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return mapBuilder;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        MapBuilderEntries mapBuilderEntries = this.m0;
        if (mapBuilderEntries != null) {
            return mapBuilderEntries;
        }
        MapBuilderEntries mapBuilderEntries2 = new MapBuilderEntries(this);
        this.m0 = mapBuilderEntries2;
        return mapBuilderEntries2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.j0 == map.size() && i(map.entrySet());
    }

    public final void g() {
        if (this.n0) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iL = l(obj);
        if (iL < 0) {
            return null;
        }
        Object[] objArr = this.f43283Y;
        Intrinsics.c(objArr);
        return objArr[iL];
    }

    public final void h(boolean z2) {
        int i2;
        Object[] objArr = this.f43283Y;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i2 = this.g0;
            if (i3 >= i2) {
                break;
            }
            int[] iArr = this.Z;
            int i5 = iArr[i3];
            if (i5 >= 0) {
                Object[] objArr2 = this.X;
                objArr2[i4] = objArr2[i3];
                if (objArr != null) {
                    objArr[i4] = objArr[i3];
                }
                if (z2) {
                    iArr[i4] = i5;
                    this.e0[i5] = i4 + 1;
                }
                i4++;
            }
            i3++;
        }
        ListBuilderKt.c(this.X, i4, i2);
        if (objArr != null) {
            ListBuilderKt.c(objArr, i4, this.g0);
        }
        this.g0 = i4;
    }

    @Override // java.util.Map
    public final int hashCode() {
        EntriesItr entriesItr = new EntriesItr(this);
        int i2 = 0;
        while (entriesItr.hasNext()) {
            int i3 = entriesItr.f43285Y;
            MapBuilder mapBuilder = entriesItr.X;
            if (i3 >= mapBuilder.g0) {
                throw new NoSuchElementException();
            }
            entriesItr.f43285Y = i3 + 1;
            entriesItr.Z = i3;
            Object obj = mapBuilder.X[i3];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = mapBuilder.f43283Y;
            Intrinsics.c(objArr);
            Object obj2 = objArr[entriesItr.Z];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            entriesItr.c();
            i2 += iHashCode ^ iHashCode2;
        }
        return i2;
    }

    public final boolean i(Collection m) {
        Intrinsics.f(m, "m");
        for (Object obj : m) {
            if (obj != null) {
                try {
                    if (!j((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.j0 == 0;
    }

    public final boolean j(Map.Entry entry) {
        Intrinsics.f(entry, "entry");
        int iL = l(entry.getKey());
        if (iL < 0) {
            return false;
        }
        Object[] objArr = this.f43283Y;
        Intrinsics.c(objArr);
        return Intrinsics.a(objArr[iL], entry.getValue());
    }

    public final void k(int i2) {
        Object[] objArrCopyOf;
        Object[] objArr = this.X;
        int length = objArr.length;
        int i3 = this.g0;
        int i4 = length - i3;
        int i5 = i3 - this.j0;
        if (i4 < i2 && i4 + i5 >= i2 && i5 >= objArr.length / 4) {
            h(true);
            return;
        }
        int i6 = i3 + i2;
        if (i6 < 0) {
            throw new OutOfMemoryError();
        }
        if (i6 > objArr.length) {
            AbstractList.Companion companion = AbstractList.INSTANCE;
            int length2 = objArr.length;
            companion.getClass();
            int iE = AbstractList.Companion.e(length2, i6);
            Object[] objArr2 = this.X;
            Intrinsics.f(objArr2, "<this>");
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, iE);
            Intrinsics.e(objArrCopyOf2, "copyOf(...)");
            this.X = objArrCopyOf2;
            Object[] objArr3 = this.f43283Y;
            if (objArr3 != null) {
                objArrCopyOf = Arrays.copyOf(objArr3, iE);
                Intrinsics.e(objArrCopyOf, "copyOf(...)");
            } else {
                objArrCopyOf = null;
            }
            this.f43283Y = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.Z, iE);
            Intrinsics.e(iArrCopyOf, "copyOf(...)");
            this.Z = iArrCopyOf;
            int iHighestOneBit = Integer.highestOneBit((iE >= 1 ? iE : 1) * 3);
            if (iHighestOneBit > this.e0.length) {
                o(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        MapBuilderKeys mapBuilderKeys = this.k0;
        if (mapBuilderKeys != null) {
            return mapBuilderKeys;
        }
        MapBuilderKeys mapBuilderKeys2 = new MapBuilderKeys(this);
        this.k0 = mapBuilderKeys2;
        return mapBuilderKeys2;
    }

    public final int l(Object obj) {
        int iN = n(obj);
        int i2 = this.f0;
        while (true) {
            int i3 = this.e0[iN];
            if (i3 == 0) {
                return -1;
            }
            if (i3 > 0) {
                int i4 = i3 - 1;
                if (Intrinsics.a(this.X[i4], obj)) {
                    return i4;
                }
            }
            i2--;
            if (i2 < 0) {
                return -1;
            }
            iN = iN == 0 ? this.e0.length - 1 : iN - 1;
        }
    }

    public final int m(Object obj) {
        int i2 = this.g0;
        while (true) {
            i2--;
            if (i2 < 0) {
                return -1;
            }
            if (this.Z[i2] >= 0) {
                Object[] objArr = this.f43283Y;
                Intrinsics.c(objArr);
                if (Intrinsics.a(objArr[i2], obj)) {
                    return i2;
                }
            }
        }
    }

    public final int n(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.h0;
    }

    public final void o(int i2) {
        int[] iArr;
        this.i0++;
        int i3 = 0;
        if (this.g0 > this.j0) {
            h(false);
        }
        this.e0 = new int[i2];
        this.h0 = Integer.numberOfLeadingZeros(i2) + 1;
        while (i3 < this.g0) {
            int i4 = i3 + 1;
            int iN = n(this.X[i3]);
            int i5 = this.f0;
            while (true) {
                iArr = this.e0;
                if (iArr[iN] == 0) {
                    break;
                }
                i5--;
                if (i5 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                iN = iN == 0 ? iArr.length - 1 : iN - 1;
            }
            iArr[iN] = i4;
            this.Z[i3] = iN;
            i3 = i4;
        }
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        g();
        int iA = a(obj);
        Object[] objArr = this.f43283Y;
        if (objArr == null) {
            int length = this.X.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f43283Y = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i2 = (-iA) - 1;
        Object obj3 = objArr[i2];
        objArr[i2] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        Intrinsics.f(from, "from");
        g();
        Set<Map.Entry<K, V>> setEntrySet = from.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        k(setEntrySet.size());
        for (Map.Entry<K, V> entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.f43283Y;
            if (objArr == null) {
                int length = this.X.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f43283Y = objArr;
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i2 = (-iA) - 1;
                if (!Intrinsics.a(entry.getValue(), objArr[i2])) {
                    objArr[i2] = entry.getValue();
                }
            }
        }
    }

    public final void q(int i2) {
        Object[] objArr = this.X;
        Intrinsics.f(objArr, "<this>");
        objArr[i2] = null;
        Object[] objArr2 = this.f43283Y;
        if (objArr2 != null) {
            objArr2[i2] = null;
        }
        int length = this.Z[i2];
        int i3 = this.f0 * 2;
        int length2 = this.e0.length / 2;
        if (i3 > length2) {
            i3 = length2;
        }
        int i4 = i3;
        int i5 = 0;
        int i6 = length;
        do {
            length = length == 0 ? this.e0.length - 1 : length - 1;
            i5++;
            if (i5 > this.f0) {
                this.e0[i6] = 0;
            } else {
                int[] iArr = this.e0;
                int i7 = iArr[length];
                if (i7 == 0) {
                    iArr[i6] = 0;
                } else {
                    if (i7 < 0) {
                        iArr[i6] = -1;
                    } else {
                        int i8 = i7 - 1;
                        int iN = n(this.X[i8]) - length;
                        int[] iArr2 = this.e0;
                        if ((iN & (iArr2.length - 1)) >= i5) {
                            iArr2[i6] = i7;
                            this.Z[i8] = i6;
                        }
                        i4--;
                    }
                    i6 = length;
                    i5 = 0;
                    i4--;
                }
            }
            this.Z[i2] = -1;
            this.j0--;
            this.i0++;
        } while (i4 >= 0);
        this.e0[i6] = -1;
        this.Z[i2] = -1;
        this.j0--;
        this.i0++;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        g();
        int iL = l(obj);
        if (iL < 0) {
            return null;
        }
        Object[] objArr = this.f43283Y;
        Intrinsics.c(objArr);
        Object obj2 = objArr[iL];
        q(iL);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.j0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.j0 * 3) + 2);
        sb.append("{");
        EntriesItr entriesItr = new EntriesItr(this);
        int i2 = 0;
        while (entriesItr.hasNext()) {
            if (i2 > 0) {
                sb.append(", ");
            }
            int i3 = entriesItr.f43285Y;
            MapBuilder mapBuilder = entriesItr.X;
            if (i3 >= mapBuilder.g0) {
                throw new NoSuchElementException();
            }
            entriesItr.f43285Y = i3 + 1;
            entriesItr.Z = i3;
            Object obj = mapBuilder.X[i3];
            if (obj == mapBuilder) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append(dc.T);
            Object[] objArr = mapBuilder.f43283Y;
            Intrinsics.c(objArr);
            Object obj2 = objArr[entriesItr.Z];
            if (obj2 == mapBuilder) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            entriesItr.c();
            i2++;
        }
        sb.append("}");
        String string = sb.toString();
        Intrinsics.e(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final Collection values() {
        MapBuilderValues mapBuilderValues = this.l0;
        if (mapBuilderValues != null) {
            return mapBuilderValues;
        }
        MapBuilderValues mapBuilderValues2 = new MapBuilderValues(this);
        this.l0 = mapBuilderValues2;
        return mapBuilderValues2;
    }

    public MapBuilder(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i2];
        int[] iArr = new int[i2];
        int iHighestOneBit = Integer.highestOneBit((i2 < 1 ? 1 : i2) * 3);
        this.X = objArr;
        this.f43283Y = null;
        this.Z = iArr;
        this.e0 = new int[iHighestOneBit];
        this.f0 = 2;
        this.g0 = 0;
        this.h0 = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}
