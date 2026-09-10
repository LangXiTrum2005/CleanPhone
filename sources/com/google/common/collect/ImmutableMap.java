package com.google.common.collect;

import com.google.errorprone.annotations.DoNotMock;
import com.p004ironsource.d9;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes4.dex */
@DoNotMock
@ElementTypesAreNonnullByDefault
public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable {
    private static final long serialVersionUID = 912559;
    public transient ImmutableSet X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public transient ImmutableSet f19831Y;
    public transient ImmutableCollection Z;

    @DoNotMock
    public static class Builder<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object[] f19832a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19833b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public DuplicateKey f19834c;

        public static final class DuplicateKey {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Object f19835a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f19836b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f19837c;

            public DuplicateKey(Object obj, Object obj2, Object obj3) {
                this.f19835a = obj;
                this.f19836b = obj2;
                this.f19837c = obj3;
            }

            public final IllegalArgumentException a() {
                StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
                Object obj = this.f19835a;
                sb.append(obj);
                sb.append(d9.i.f24747b);
                sb.append(this.f19836b);
                sb.append(" and ");
                sb.append(obj);
                sb.append(d9.i.f24747b);
                sb.append(this.f19837c);
                return new IllegalArgumentException(sb.toString());
            }
        }

        public Builder(int i2) {
            this.f19832a = new Object[i2 * 2];
        }

        public final ImmutableMap a(boolean z2) {
            DuplicateKey duplicateKey;
            DuplicateKey duplicateKey2;
            if (z2 && (duplicateKey2 = this.f19834c) != null) {
                throw duplicateKey2.a();
            }
            RegularImmutableMap regularImmutableMapU = RegularImmutableMap.u(this.f19833b, this.f19832a, this);
            if (!z2 || (duplicateKey = this.f19834c) == null) {
                return regularImmutableMapU;
            }
            throw duplicateKey.a();
        }

        public ImmutableMap b() {
            return a(true);
        }

        public Builder c(Object obj, Object obj2) {
            int i2 = (this.f19833b + 1) * 2;
            Object[] objArr = this.f19832a;
            if (i2 > objArr.length) {
                this.f19832a = Arrays.copyOf(objArr, ImmutableCollection.Builder.a(objArr.length, i2));
            }
            CollectPreconditions.a(obj, obj2);
            Object[] objArr2 = this.f19832a;
            int i3 = this.f19833b;
            int i4 = i3 * 2;
            objArr2[i4] = obj;
            objArr2[i4 + 1] = obj2;
            this.f19833b = i3 + 1;
            return this;
        }

        public Builder d(Iterable iterable) {
            if (iterable instanceof Collection) {
                int size = (((Collection) iterable).size() + this.f19833b) * 2;
                Object[] objArr = this.f19832a;
                if (size > objArr.length) {
                    this.f19832a = Arrays.copyOf(objArr, ImmutableCollection.Builder.a(objArr.length, size));
                }
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                c(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public Builder e(Map map) {
            return d(((ImmutableMap) map).entrySet());
        }
    }

    public static abstract class IteratorBasedImmutableMap<K, V> extends ImmutableMap<K, V> {
        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public final /* bridge */ /* synthetic */ Set entrySet() {
            return entrySet();
        }

        @Override // com.google.common.collect.ImmutableMap
        public final ImmutableSet g() {
            return new ImmutableMapEntrySet<Object, Object>() { // from class: com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap.1EntrySetImpl
                @Override // com.google.common.collect.ImmutableMapEntrySet
                public final ImmutableMap B() {
                    return IteratorBasedImmutableMap.this;
                }

                @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
                public final Iterator iterator() {
                    return IteratorBasedImmutableMap.this.u();
                }

                @Override // com.google.common.collect.ImmutableCollection
                /* JADX INFO: renamed from: o */
                public final UnmodifiableIterator iterator() {
                    return IteratorBasedImmutableMap.this.u();
                }

                @Override // com.google.common.collect.ImmutableMapEntrySet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
                public Object writeReplace() {
                    return super.writeReplace();
                }
            };
        }

        @Override // com.google.common.collect.ImmutableMap
        public ImmutableSet h() {
            return new ImmutableMapKeySet(this);
        }

        @Override // com.google.common.collect.ImmutableMap
        public final ImmutableCollection i() {
            return new ImmutableMapValues(this);
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public final /* bridge */ /* synthetic */ Set keySet() {
            return keySet();
        }

        public abstract UnmodifiableIterator u();

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public final /* bridge */ /* synthetic */ Collection values() {
            return values();
        }

        @Override // com.google.common.collect.ImmutableMap
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public final class MapViewOfValuesAsSingletonSets extends IteratorBasedImmutableMap<K, ImmutableSet<V>> {

        /* JADX INFO: renamed from: com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets$1, reason: invalid class name */
        class AnonymousClass1 extends UnmodifiableIterator<Map.Entry<Object, ImmutableSet<Object>>> {

            /* JADX INFO: renamed from: com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets$1$1, reason: invalid class name and collision with other inner class name */
            class C01941 extends AbstractMapEntry<Object, ImmutableSet<Object>> {
                @Override // java.util.Map.Entry
                public final Object getKey() {
                    throw null;
                }

                @Override // java.util.Map.Entry
                public final Object getValue() {
                    throw null;
                }
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                throw null;
            }

            @Override // java.util.Iterator
            public final Object next() {
                throw null;
            }
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public final boolean containsKey(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public final Object get(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public final ImmutableSet h() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public final int hashCode() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableMap
        public final boolean k() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableMap
        public final boolean l() {
            throw null;
        }

        @Override // java.util.Map
        public final int size() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
        public final UnmodifiableIterator u() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static class SerializedForm<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        public final Object[] X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Object[] f19838Y;

        public SerializedForm(ImmutableMap immutableMap) {
            Object[] objArr = new Object[immutableMap.size()];
            Object[] objArr2 = new Object[immutableMap.size()];
            UnmodifiableIterator it = immutableMap.entrySet().iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                objArr[i2] = entry.getKey();
                objArr2[i2] = entry.getValue();
                i2++;
            }
            this.X = objArr;
            this.f19838Y = objArr2;
        }

        public Builder a(int i2) {
            return new Builder(i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object readResolve() {
            Object[] objArr = this.X;
            boolean z2 = objArr instanceof ImmutableSet;
            Object[] objArr2 = this.f19838Y;
            if (!z2) {
                Builder builderA = a(objArr.length);
                for (int i2 = 0; i2 < objArr.length; i2++) {
                    builderA.c(objArr[i2], objArr2[i2]);
                }
                return builderA.b();
            }
            ImmutableSet immutableSet = (ImmutableSet) objArr;
            Builder builderA2 = a(immutableSet.size());
            UnmodifiableIterator it = immutableSet.iterator();
            UnmodifiableIterator it2 = ((ImmutableCollection) objArr2).iterator();
            while (it.hasNext()) {
                builderA2.c(it.next(), it2.next());
            }
            return builderA2.b();
        }
    }

    public static Builder d() {
        return new Builder(4);
    }

    public static ImmutableMap e(Map map) {
        if ((map instanceof ImmutableMap) && !(map instanceof SortedMap)) {
            ImmutableMap immutableMap = (ImmutableMap) map;
            if (!immutableMap.l()) {
                return immutableMap;
            }
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        Builder builder = new Builder(setEntrySet != null ? setEntrySet.size() : 4);
        builder.d(setEntrySet);
        return builder.a(true);
    }

    public static ImmutableMap o() {
        return RegularImmutableMap.h0;
    }

    public static ImmutableMap q(String str, String str2, String str3, String str4) {
        CollectPreconditions.a("Purpose1", str);
        CollectPreconditions.a("Purpose3", str2);
        CollectPreconditions.a("Purpose4", str3);
        CollectPreconditions.a("Purpose7", str4);
        return RegularImmutableMap.u(4, new Object[]{"Purpose1", str, "Purpose3", str2, "Purpose4", str3, "Purpose7", str4}, null);
    }

    public static ImmutableMap r(String str, String str2, String str3, String str4, String str5) {
        return RegularImmutableMap.u(5, new Object[]{"AuthorizePurpose1", str, "AuthorizePurpose3", str2, "AuthorizePurpose4", str3, "AuthorizePurpose7", str4, "PurposeDiagnostics", str5}, null);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return Maps.d(this, obj);
    }

    public abstract ImmutableSet g();

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public abstract ImmutableSet h();

    @Override // java.util.Map
    public int hashCode() {
        return Sets.e(entrySet());
    }

    public abstract ImmutableCollection i();

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public ImmutableSet entrySet() {
        ImmutableSet immutableSet = this.X;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet immutableSetG = g();
        this.X = immutableSetG;
        return immutableSetG;
    }

    public boolean k() {
        return false;
    }

    public abstract boolean l();

    public UnmodifiableIterator m() {
        final UnmodifiableIterator it = entrySet().iterator();
        return new UnmodifiableIterator<Object>() { // from class: com.google.common.collect.ImmutableMap.1
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            public final Object next() {
                return ((Map.Entry) it.next()).getKey();
            }
        };
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public ImmutableSet keySet() {
        ImmutableSet immutableSet = this.f19831Y;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet immutableSetH = h();
        this.f19831Y = immutableSetH;
        return immutableSetH;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public ImmutableCollection values() {
        ImmutableCollection immutableCollection = this.Z;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        ImmutableCollection immutableCollectionI = i();
        this.Z = immutableCollectionI;
        return immutableCollectionI;
    }

    public final String toString() {
        return Maps.j(this);
    }

    public Object writeReplace() {
        return new SerializedForm(this);
    }
}
