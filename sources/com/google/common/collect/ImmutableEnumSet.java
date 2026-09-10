package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Collection;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class ImmutableEnumSet<E extends Enum<E>> extends ImmutableSet<E> {
    public static final /* synthetic */ int g0 = 0;
    public final transient EnumSet e0;
    public transient int f0;

    public static class EnumSerializedForm<E extends Enum<E>> implements Serializable {
        private static final long serialVersionUID = 0;
        public final EnumSet X;

        public EnumSerializedForm(EnumSet enumSet) {
            this.X = enumSet;
        }

        public Object readResolve() {
            return new ImmutableEnumSet(this.X.clone());
        }
    }

    public ImmutableEnumSet(EnumSet enumSet) {
        this.e0 = enumSet;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.e0.contains(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof ImmutableEnumSet) {
            collection = ((ImmutableEnumSet) collection).e0;
        }
        return this.e0.containsAll(collection);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableEnumSet) {
            obj = ((ImmutableEnumSet) obj).e0;
        }
        return this.e0.equals(obj);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i2 = this.f0;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = this.e0.hashCode();
        this.f0 = iHashCode;
        return iHashCode;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.e0.isEmpty();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean l() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: o */
    public final UnmodifiableIterator iterator() {
        return Iterators.n(this.e0.iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e0.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return this.e0.toString();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new EnumSerializedForm(this.e0);
    }

    @Override // com.google.common.collect.ImmutableSet
    public final boolean x() {
        return true;
    }
}
