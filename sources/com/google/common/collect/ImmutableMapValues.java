package com.google.common.collect;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class ImmutableMapValues<K, V> extends ImmutableCollection<V> {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final ImmutableMap f19839Y;

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableMapValues$1, reason: invalid class name */
    class AnonymousClass1 extends UnmodifiableIterator<Object> {
        public final UnmodifiableIterator X;

        public AnonymousClass1(ImmutableMapValues immutableMapValues) {
            this.X = immutableMapValues.f19839Y.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.X.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            return ((Map.Entry) this.X.next()).getValue();
        }
    }

    public static class SerializedForm<V> implements Serializable {
        private static final long serialVersionUID = 0;
        public final ImmutableMap X;

        public SerializedForm(ImmutableMap immutableMap) {
            this.X = immutableMap;
        }

        public Object readResolve() {
            return this.X.values();
        }
    }

    public ImmutableMapValues(ImmutableMap immutableMap) {
        this.f19839Y = immutableMap;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return obj != null && Iterators.d(new AnonymousClass1(this), obj);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final ImmutableList d() {
        final ImmutableList immutableListD = this.f19839Y.entrySet().d();
        return new ImmutableList<Object>() { // from class: com.google.common.collect.ImmutableMapValues.2
            @Override // java.util.List
            public final Object get(int i2) {
                return ((Map.Entry) immutableListD.get(i2)).getValue();
            }

            @Override // com.google.common.collect.ImmutableCollection
            public final boolean l() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return immutableListD.size();
            }

            @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
            public Object writeReplace() {
                return super.writeReplace();
            }
        };
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final Iterator iterator() {
        return new AnonymousClass1(this);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean l() {
        return true;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: o */
    public final UnmodifiableIterator iterator() {
        return new AnonymousClass1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f19839Y.size();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(this.f19839Y);
    }
}
