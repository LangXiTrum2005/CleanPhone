package com.google.common.collect;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
abstract class IndexedImmutableSet<E> extends ImmutableSet<E> {
    @Override // com.google.common.collect.ImmutableCollection
    public final int e(int i2, Object[] objArr) {
        return d().e(i2, objArr);
    }

    public abstract Object get(int i2);

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: o */
    public UnmodifiableIterator iterator() {
        return d().listIterator(0);
    }

    @Override // com.google.common.collect.ImmutableSet
    public final ImmutableList w() {
        return new ImmutableList<Object>() { // from class: com.google.common.collect.IndexedImmutableSet.1
            @Override // java.util.List
            public final Object get(int i2) {
                return IndexedImmutableSet.this.get(i2);
            }

            @Override // com.google.common.collect.ImmutableCollection
            public final boolean l() {
                return IndexedImmutableSet.this.l();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return IndexedImmutableSet.this.size();
            }

            @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
            public Object writeReplace() {
                return super.writeReplace();
            }
        };
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
