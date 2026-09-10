package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class ImmutableSortedMap<K, V> extends ImmutableMap<K, V> implements NavigableMap<K, V> {
    public static final ImmutableSortedMap h0;
    private static final long serialVersionUID = 0;
    public final transient RegularImmutableSortedSet e0;
    public final transient ImmutableList f0;
    public final transient ImmutableSortedMap g0;

    public static class Builder<K, V> extends ImmutableMap.Builder<K, V> {
        public transient Object[] d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public transient Object[] f19857e;
        public final Comparator f;

        public Builder(Comparator comparator) {
            super(4);
            comparator.getClass();
            this.f = comparator;
            this.d = new Object[4];
            this.f19857e = new Object[4];
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public final ImmutableMap b() {
            int i2 = this.f19833b;
            Comparator comparator = this.f;
            if (i2 == 0) {
                return ImmutableSortedMap.u(comparator);
            }
            if (i2 == 1) {
                Object obj = this.d[0];
                Objects.requireNonNull(obj);
                Object obj2 = this.f19857e[0];
                Objects.requireNonNull(obj2);
                ImmutableList immutableListZ = ImmutableList.z(obj);
                comparator.getClass();
                return new ImmutableSortedMap(new RegularImmutableSortedSet(immutableListZ, comparator), ImmutableList.z(obj2), null);
            }
            Object[] objArrCopyOf = Arrays.copyOf(this.d, i2);
            Arrays.sort(objArrCopyOf, comparator);
            int i3 = this.f19833b;
            Object[] objArr = new Object[i3];
            for (int i4 = 0; i4 < this.f19833b; i4++) {
                if (i4 > 0) {
                    int i5 = i4 - 1;
                    if (comparator.compare(objArrCopyOf[i5], objArrCopyOf[i4]) == 0) {
                        throw new IllegalArgumentException("keys required to be distinct but compared as equal: " + objArrCopyOf[i5] + " and " + objArrCopyOf[i4]);
                    }
                }
                Object obj3 = this.d[i4];
                Objects.requireNonNull(obj3);
                int iBinarySearch = Arrays.binarySearch(objArrCopyOf, obj3, comparator);
                Object obj4 = this.f19857e[i4];
                Objects.requireNonNull(obj4);
                objArr[iBinarySearch] = obj4;
            }
            return new ImmutableSortedMap(new RegularImmutableSortedSet(ImmutableList.p(objArrCopyOf.length, objArrCopyOf), comparator), ImmutableList.p(i3, objArr), null);
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public final ImmutableMap.Builder c(Object obj, Object obj2) {
            int i2 = this.f19833b + 1;
            Object[] objArr = this.d;
            if (i2 > objArr.length) {
                int iA = ImmutableCollection.Builder.a(objArr.length, i2);
                this.d = Arrays.copyOf(this.d, iA);
                this.f19857e = Arrays.copyOf(this.f19857e, iA);
            }
            CollectPreconditions.a(obj, obj2);
            Object[] objArr2 = this.d;
            int i3 = this.f19833b;
            objArr2[i3] = obj;
            this.f19857e[i3] = obj2;
            this.f19833b = i3 + 1;
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public final ImmutableMap.Builder d(Iterable iterable) {
            super.d(iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public final ImmutableMap.Builder e(Map map) {
            d(((ImmutableMap) map).entrySet());
            return this;
        }
    }

    public static class SerializedForm<K, V> extends ImmutableMap.SerializedForm<K, V> {
        private static final long serialVersionUID = 0;
        public final Comparator Z;

        public SerializedForm(ImmutableSortedMap immutableSortedMap) {
            super(immutableSortedMap);
            this.Z = immutableSortedMap.e0.e0;
        }

        @Override // com.google.common.collect.ImmutableMap.SerializedForm
        public final ImmutableMap.Builder a(int i2) {
            return new Builder(this.Z);
        }
    }

    static {
        RegularImmutableSortedSet regularImmutableSortedSetF = ImmutableSortedSet.F(NaturalOrdering.Z);
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f19830Y;
        h0 = new ImmutableSortedMap(regularImmutableSortedSetF, RegularImmutableList.f0, null);
    }

    public ImmutableSortedMap(RegularImmutableSortedSet regularImmutableSortedSet, ImmutableList immutableList, ImmutableSortedMap immutableSortedMap) {
        this.e0 = regularImmutableSortedSet;
        this.f0 = immutableList;
        this.g0 = immutableSortedMap;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static ImmutableSortedMap u(Comparator comparator) {
        return NaturalOrdering.Z.equals(comparator) ? h0 : new ImmutableSortedMap(ImmutableSortedSet.F(comparator), RegularImmutableList.f0, null);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return Maps.g(ceilingEntry(obj));
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return this.e0.e0;
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return this.e0.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        ImmutableSortedMap immutableSortedMap = this.g0;
        if (immutableSortedMap != null) {
            return immutableSortedMap;
        }
        boolean zIsEmpty = isEmpty();
        RegularImmutableSortedSet regularImmutableSortedSet = this.e0;
        return zIsEmpty ? u(Ordering.b(regularImmutableSortedSet.e0).j()) : new ImmutableSortedMap((RegularImmutableSortedSet) regularImmutableSortedSet.descendingSet(), this.f0.C(), this);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final Set entrySet() {
        return super.entrySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) super.entrySet().d().get(0);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.e0.first();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return Maps.g(floorEntry(obj));
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet g() {
        if (!isEmpty()) {
            return new ImmutableMapEntrySet<Object, Object>() { // from class: com.google.common.collect.ImmutableSortedMap.1EntrySet
                @Override // com.google.common.collect.ImmutableMapEntrySet
                public final ImmutableMap B() {
                    return ImmutableSortedMap.this;
                }

                @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
                /* JADX INFO: renamed from: o */
                public final UnmodifiableIterator iterator() {
                    return d().listIterator(0);
                }

                @Override // com.google.common.collect.ImmutableSet
                public final ImmutableList w() {
                    return new ImmutableList<Map.Entry<Object, Object>>() { // from class: com.google.common.collect.ImmutableSortedMap.1EntrySet.1
                        @Override // java.util.List
                        public final Object get(int i2) {
                            C1EntrySet c1EntrySet = C1EntrySet.this;
                            return new AbstractMap.SimpleImmutableEntry(ImmutableSortedMap.this.e0.g0.get(i2), ImmutableSortedMap.this.f0.get(i2));
                        }

                        @Override // com.google.common.collect.ImmutableCollection
                        public final boolean l() {
                            return true;
                        }

                        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                        public final int size() {
                            return ImmutableSortedMap.this.f0.size();
                        }

                        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
                        public Object writeReplace() {
                            return super.writeReplace();
                        }
                    };
                }

                @Override // com.google.common.collect.ImmutableMapEntrySet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
                public Object writeReplace() {
                    return super.writeReplace();
                }
            };
        }
        int i2 = ImmutableSet.Z;
        return RegularImmutableSet.k0;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0008  */
    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final Object get(Object obj) {
        int iBinarySearch;
        RegularImmutableSortedSet regularImmutableSortedSet = this.e0;
        regularImmutableSortedSet.getClass();
        if (obj == null) {
            iBinarySearch = -1;
        } else {
            try {
                iBinarySearch = Collections.binarySearch(regularImmutableSortedSet.g0, obj, regularImmutableSortedSet.e0);
                if (iBinarySearch < 0) {
                    iBinarySearch = -1;
                }
            } catch (ClassCastException unused) {
            }
        }
        if (iBinarySearch == -1) {
            return null;
        }
        return this.f0.get(iBinarySearch);
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet h() {
        throw new AssertionError("should never be called");
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return Maps.g(higherEntry(obj));
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableCollection i() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final Set keySet() {
        return this.e0;
    }

    @Override // com.google.common.collect.ImmutableMap
    public final boolean l() {
        return this.e0.g0.l() || this.f0.l();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) super.entrySet().d().get(this.f0.size() - 1);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.e0.last();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return Maps.g(lowerEntry(obj));
    }

    @Override // com.google.common.collect.ImmutableMap
    /* JADX INFO: renamed from: n */
    public final ImmutableSet keySet() {
        return this.e0;
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return this.e0;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f0.size();
    }

    @Override // com.google.common.collect.ImmutableMap
    /* JADX INFO: renamed from: t */
    public final ImmutableCollection values() {
        return this.f0;
    }

    public final ImmutableSortedMap v(int i2, int i3) {
        ImmutableList immutableList = this.f0;
        if (i2 == 0 && i3 == immutableList.size()) {
            return this;
        }
        RegularImmutableSortedSet regularImmutableSortedSet = this.e0;
        return i2 == i3 ? u(regularImmutableSortedSet.e0) : new ImmutableSortedMap(regularImmutableSortedSet.P(i2, i3), immutableList.subList(i2, i3), null);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final Collection values() {
        return this.f0;
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final ImmutableSortedMap headMap(Object obj, boolean z2) {
        obj.getClass();
        return v(0, this.e0.Q(obj, z2));
    }

    @Override // com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return new SerializedForm(this);
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final ImmutableSortedMap subMap(Object obj, boolean z2, Object obj2, boolean z3) {
        obj.getClass();
        obj2.getClass();
        Preconditions.h(this.e0.e0.compare(obj, obj2) <= 0, "expected fromKey <= toKey but %s > %s", obj, obj2);
        return headMap(obj2, z3).tailMap(obj, z2);
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final ImmutableSortedMap tailMap(Object obj, boolean z2) {
        obj.getClass();
        return v(this.e0.R(obj, z2), this.f0.size());
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
