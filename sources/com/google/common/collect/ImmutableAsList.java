package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
abstract class ImmutableAsList<E> extends ImmutableList<E> {

    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        public final ImmutableCollection X;

        public SerializedForm(ImmutableCollection immutableCollection) {
            this.X = immutableCollection;
        }

        public Object readResolve() {
            return this.X.d();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public abstract ImmutableCollection F();

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return F().contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        ((RegularContiguousSet) F()).getClass();
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean l() {
        ((RegularContiguousSet) F()).getClass();
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return F().size();
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(F());
    }
}
