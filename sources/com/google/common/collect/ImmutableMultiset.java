package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ImmutableMultiset<E> extends ImmutableMultisetGwtSerializationDependencies<E> implements Multiset<E> {
    public static final /* synthetic */ int e0 = 0;
    private static final long serialVersionUID = 912559;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public transient ImmutableList f19847Y;
    public transient ImmutableSet Z;

    public static class Builder<E> extends ImmutableCollection.Builder<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ObjectCountHashMap f19849a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f19850b = false;

        public Builder(int i2) {
            this.f19849a = new ObjectCountHashMap(i2, 0);
        }

        @Override // 
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Builder b(Object obj) {
            return d(1, obj);
        }

        public Builder d(int i2, Object obj) {
            Objects.requireNonNull(this.f19849a);
            if (i2 == 0) {
                return this;
            }
            if (this.f19850b) {
                ObjectCountHashMap objectCountHashMap = this.f19849a;
                ObjectCountHashMap objectCountHashMap2 = new ObjectCountHashMap();
                objectCountHashMap2.h(objectCountHashMap.f19940c);
                for (int iC = objectCountHashMap.c(); iC != -1; iC = objectCountHashMap.k(iC)) {
                    objectCountHashMap2.m(objectCountHashMap.f(iC), objectCountHashMap.e(iC));
                }
                this.f19849a = objectCountHashMap2;
            }
            this.f19850b = false;
            obj.getClass();
            ObjectCountHashMap objectCountHashMap3 = this.f19849a;
            objectCountHashMap3.m(i2 + objectCountHashMap3.d(obj), obj);
            return this;
        }

        public ImmutableMultiset e() {
            Objects.requireNonNull(this.f19849a);
            if (this.f19849a.f19940c == 0) {
                int i2 = ImmutableMultiset.e0;
                return RegularImmutableMultiset.i0;
            }
            this.f19850b = true;
            return new RegularImmutableMultiset(this.f19849a);
        }
    }

    public final class EntrySet extends IndexedImmutableSet<Multiset.Entry<E>> {
        private static final long serialVersionUID = 0;

        public EntrySet() {
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use EntrySetSerializedForm");
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof Multiset.Entry)) {
                return false;
            }
            Multiset.Entry entry = (Multiset.Entry) obj;
            return entry.getCount() > 0 && ImmutableMultiset.this.w0(entry.d()) == entry.getCount();
        }

        @Override // com.google.common.collect.IndexedImmutableSet
        public final Object get(int i2) {
            return ImmutableMultiset.this.u(i2);
        }

        @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
        public final int hashCode() {
            return ImmutableMultiset.this.hashCode();
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean l() {
            return ImmutableMultiset.this.l();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return ImmutableMultiset.this.k().size();
        }

        @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return new EntrySetSerializedForm(ImmutableMultiset.this);
        }
    }

    public static class EntrySetSerializedForm<E> implements Serializable {
        public final ImmutableMultiset X;

        public EntrySetSerializedForm(ImmutableMultiset immutableMultiset) {
            this.X = immutableMultiset;
        }

        public Object readResolve() {
            return this.X.entrySet();
        }
    }

    public static ImmutableMultiset p(Collection collection) {
        if (collection instanceof ImmutableMultiset) {
            ImmutableMultiset immutableMultiset = (ImmutableMultiset) collection;
            if (!immutableMultiset.l()) {
                return immutableMultiset;
            }
        }
        Collection collection2 = collection;
        Builder builder = new Builder(collection2 instanceof Multiset ? ((Multiset) collection2).k().size() : 11);
        Objects.requireNonNull(builder.f19849a);
        if (collection instanceof Multiset) {
            Multiset multiset = (Multiset) collection;
            ObjectCountHashMap objectCountHashMap = multiset instanceof RegularImmutableMultiset ? ((RegularImmutableMultiset) multiset).f0 : multiset instanceof AbstractMapBasedMultiset ? ((AbstractMapBasedMultiset) multiset).Z : null;
            if (objectCountHashMap != null) {
                ObjectCountHashMap objectCountHashMap2 = builder.f19849a;
                objectCountHashMap2.b(Math.max(objectCountHashMap2.f19940c, objectCountHashMap.f19940c));
                for (int iC = objectCountHashMap.c(); iC >= 0; iC = objectCountHashMap.k(iC)) {
                    builder.d(objectCountHashMap.f(iC), objectCountHashMap.e(iC));
                }
            } else {
                Set setEntrySet = multiset.entrySet();
                ObjectCountHashMap objectCountHashMap3 = builder.f19849a;
                objectCountHashMap3.b(Math.max(objectCountHashMap3.f19940c, setEntrySet.size()));
                for (Multiset.Entry entry : multiset.entrySet()) {
                    builder.d(entry.getCount(), entry.d());
                }
            }
        } else {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                builder.b(it.next());
            }
        }
        return builder.e();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.Multiset
    public final int Q0(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Multiset
    public final int add(int i2, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return w0(obj) > 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final ImmutableList d() {
        ImmutableList immutableList = this.f19847Y;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList immutableListD = super.d();
        this.f19847Y = immutableListD;
        return immutableListD;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int e(int i2, Object[] objArr) {
        UnmodifiableIterator it = entrySet().iterator();
        while (it.hasNext()) {
            Multiset.Entry entry = (Multiset.Entry) it.next();
            Arrays.fill(objArr, i2, entry.getCount() + i2, entry.d());
            i2 += entry.getCount();
        }
        return i2;
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public final boolean equals(Object obj) {
        return Multisets.a(this, obj);
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public final int hashCode() {
        return Sets.e(entrySet());
    }

    @Override // com.google.common.collect.Multiset
    public final int m(int i2, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: o */
    public final UnmodifiableIterator iterator() {
        final UnmodifiableIterator it = entrySet().iterator();
        return new UnmodifiableIterator<Object>() { // from class: com.google.common.collect.ImmutableMultiset.1
            public int X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public Object f19848Y;

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.X > 0 || it.hasNext();
            }

            @Override // java.util.Iterator
            public final Object next() {
                if (this.X <= 0) {
                    Multiset.Entry entry = (Multiset.Entry) it.next();
                    this.f19848Y = entry.d();
                    this.X = entry.getCount();
                }
                this.X--;
                Object obj = this.f19848Y;
                Objects.requireNonNull(obj);
                return obj;
            }
        };
    }

    @Override // com.google.common.collect.Multiset
    public final boolean r(int i2, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Multiset
    /* JADX INFO: renamed from: s */
    public abstract ImmutableSet k();

    @Override // com.google.common.collect.Multiset
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final ImmutableSet entrySet() {
        ImmutableSet entrySet = this.Z;
        if (entrySet == null) {
            entrySet = isEmpty() ? RegularImmutableSet.k0 : new EntrySet();
            this.Z = entrySet;
        }
        return entrySet;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return entrySet().toString();
    }

    public abstract Multiset.Entry u(int i2);

    @Override // com.google.common.collect.ImmutableCollection
    public abstract Object writeReplace();
}
