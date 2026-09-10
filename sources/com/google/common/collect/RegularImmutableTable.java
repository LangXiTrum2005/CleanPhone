package com.google.common.collect;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
abstract class RegularImmutableTable<R, C, V> extends ImmutableTable<R, C, V> {

    public final class CellSet extends IndexedImmutableSet<Table.Cell<R, C, V>> {
        public CellSet() {
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof Table.Cell)) {
                return false;
            }
            Table.Cell cell = (Table.Cell) obj;
            Object objT = RegularImmutableTable.this.t(cell.d(), cell.g());
            return objT != null && objT.equals(cell.getValue());
        }

        @Override // com.google.common.collect.IndexedImmutableSet
        public final Object get(int i2) {
            return RegularImmutableTable.this.w(i2);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean l() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return RegularImmutableTable.this.size();
        }

        @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public final class Values extends ImmutableList<V> {
        public Values() {
        }

        @Override // java.util.List
        public final Object get(int i2) {
            return RegularImmutableTable.this.x(i2);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean l() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return RegularImmutableTable.this.size();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    /* JADX INFO: renamed from: r */
    public final ImmutableSet j() {
        if (size() != 0) {
            return new CellSet();
        }
        int i2 = ImmutableSet.Z;
        return RegularImmutableSet.k0;
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    /* JADX INFO: renamed from: s */
    public final ImmutableCollection k() {
        if (size() != 0) {
            return new Values();
        }
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f19830Y;
        return RegularImmutableList.f0;
    }

    public abstract Table.Cell w(int i2);

    @Override // com.google.common.collect.ImmutableTable
    public abstract Object writeReplace();

    public abstract Object x(int i2);
}
