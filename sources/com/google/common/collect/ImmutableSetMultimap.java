package com.google.common.collect;

import com.google.common.base.MoreObjects;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public class ImmutableSetMultimap<K, V> extends ImmutableMultimap<K, V> implements SetMultimap<K, V> {
    private static final long serialVersionUID = 0;
    public final transient ImmutableSet i0;
    public transient ImmutableSet j0;

    public static final class Builder<K, V> extends ImmutableMultimap.Builder<K, V> {
    }

    public static final class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {
        public final transient ImmutableSetMultimap e0;

        public EntrySet(ImmutableSetMultimap immutableSetMultimap) {
            this.e0 = immutableSetMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.e0.v(entry.getKey(), entry.getValue());
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public final Iterator iterator() {
            return this.e0.q();
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean l() {
            return false;
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* JADX INFO: renamed from: o */
        public final UnmodifiableIterator iterator() {
            return this.e0.q();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.e0.h0;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static final class SetFieldSettersHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Serialization.FieldSetter f19856a = Serialization.a(ImmutableSetMultimap.class, "emptySet");
    }

    public ImmutableSetMultimap() {
        super(RegularImmutableMap.h0, 0);
        int i2 = ImmutableSet.Z;
        this.i0 = RegularImmutableSet.k0;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        Object objF;
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int i2 = objectInputStream.readInt();
        if (i2 < 0) {
            throw new InvalidObjectException(android.support.v4.media.a.h(i2, "Invalid key count "));
        }
        ImmutableMap.Builder builderD = ImmutableMap.d();
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            int i5 = objectInputStream.readInt();
            if (i5 <= 0) {
                throw new InvalidObjectException(android.support.v4.media.a.h(i5, "Invalid value count "));
            }
            ImmutableSet.Builder builder = comparator == null ? new ImmutableSet.Builder(4) : new ImmutableSortedSet.Builder(comparator);
            for (int i6 = 0; i6 < i5; i6++) {
                Object object2 = objectInputStream.readObject();
                Objects.requireNonNull(object2);
                builder.c(object2);
            }
            ImmutableSet immutableSetK = builder.k();
            if (immutableSetK.size() != i5) {
                throw new InvalidObjectException("Duplicate key-value pairs exist for key " + object);
            }
            builderD.c(object, immutableSetK);
            i3 += i5;
        }
        try {
            ImmutableMultimap.FieldSettersHolder.f19844a.a(this, builderD.a(true));
            Serialization.FieldSetter fieldSetter = ImmutableMultimap.FieldSettersHolder.f19845b;
            fieldSetter.getClass();
            try {
                fieldSetter.f19951a.set(this, Integer.valueOf(i3));
                Serialization.FieldSetter fieldSetter2 = SetFieldSettersHolder.f19856a;
                if (comparator == null) {
                    int i7 = ImmutableSet.Z;
                    objF = RegularImmutableSet.k0;
                } else {
                    objF = ImmutableSortedSet.F(comparator);
                }
                fieldSetter2.a(this, objF);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        } catch (IllegalArgumentException e3) {
            throw ((InvalidObjectException) new InvalidObjectException(e3.getMessage()).initCause(e3));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        ImmutableSet immutableSet = this.i0;
        objectOutputStream.writeObject(immutableSet instanceof ImmutableSortedSet ? ((ImmutableSortedSet) immutableSet).e0 : null);
        Serialization.f(this, objectOutputStream);
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final Collection a(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final Collection d() {
        ImmutableSet immutableSet = this.j0;
        if (immutableSet != null) {
            return immutableSet;
        }
        EntrySet entrySet = new EntrySet(this);
        this.j0 = entrySet;
        return entrySet;
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final Collection get(Object obj) {
        return (ImmutableSet) MoreObjects.a((ImmutableSet) this.g0.get(obj), this.i0);
    }

    @Override // com.google.common.collect.ImmutableMultimap
    /* JADX INFO: renamed from: p */
    public final ImmutableCollection d() {
        ImmutableSet immutableSet = this.j0;
        if (immutableSet != null) {
            return immutableSet;
        }
        EntrySet entrySet = new EntrySet(this);
        this.j0 = entrySet;
        return entrySet;
    }

    @Override // com.google.common.collect.ImmutableMultimap
    /* JADX INFO: renamed from: r */
    public final ImmutableCollection get(Object obj) {
        return (ImmutableSet) MoreObjects.a((ImmutableSet) this.g0.get(obj), this.i0);
    }

    @Override // com.google.common.collect.ImmutableMultimap
    public final ImmutableCollection w() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final Set a(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final Set d() {
        ImmutableSet immutableSet = this.j0;
        if (immutableSet != null) {
            return immutableSet;
        }
        EntrySet entrySet = new EntrySet(this);
        this.j0 = entrySet;
        return entrySet;
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final Set get(Object obj) {
        return (ImmutableSet) MoreObjects.a((ImmutableSet) this.g0.get(obj), this.i0);
    }
}
