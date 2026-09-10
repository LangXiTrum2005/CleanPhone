package com.google.common.collect;

import com.google.common.base.Strings;
import com.google.errorprone.annotations.Immutable;
import java.lang.reflect.Array;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
@Immutable
@ElementTypesAreNonnullByDefault
final class DenseImmutableTable<R, C, V> extends RegularImmutableTable<R, C, V> {
    public final ImmutableMap Z;
    public final ImmutableMap e0;
    public final ImmutableMap f0;
    public final ImmutableMap g0;
    public final int[] h0;
    public final int[] i0;
    public final Object[][] j0;
    public final int[] k0;
    public final int[] l0;

    public final class Column extends ImmutableArrayMap<R, V> {
        public final int f0;

        public Column(int i2) {
            super(DenseImmutableTable.this.i0[i2]);
            this.f0 = i2;
        }

        @Override // com.google.common.collect.ImmutableMap
        public final boolean l() {
            return true;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public final Object v(int i2) {
            return DenseImmutableTable.this.j0[i2][this.f0];
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public final ImmutableMap w() {
            return DenseImmutableTable.this.Z;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap, com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public final class ColumnMap extends ImmutableArrayMap<C, ImmutableMap<R, V>> {
        public ColumnMap() {
            super(DenseImmutableTable.this.i0.length);
        }

        @Override // com.google.common.collect.ImmutableMap
        public final boolean l() {
            return false;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public final Object v(int i2) {
            return new Column(i2);
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public final ImmutableMap w() {
            return DenseImmutableTable.this.e0;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap, com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static abstract class ImmutableArrayMap<K, V> extends ImmutableMap.IteratorBasedImmutableMap<K, V> {
        public final int e0;

        public ImmutableArrayMap(int i2) {
            this.e0 = i2;
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public final Object get(Object obj) {
            Integer num = (Integer) w().get(obj);
            if (num == null) {
                return null;
            }
            return v(num.intValue());
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public final ImmutableSet h() {
            return this.e0 == w().size() ? w().keySet() : new ImmutableMapKeySet(this);
        }

        @Override // java.util.Map
        public final int size() {
            return this.e0;
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
        public final UnmodifiableIterator u() {
            return new AbstractIterator<Map.Entry<Object, Object>>() { // from class: com.google.common.collect.DenseImmutableTable.ImmutableArrayMap.1
                public int Z = -1;
                public final int e0;

                {
                    this.e0 = ImmutableArrayMap.this.w().size();
                }

                @Override // com.google.common.collect.AbstractIterator
                public final Object a() {
                    int i2 = this.Z;
                    while (true) {
                        this.Z = i2 + 1;
                        int i3 = this.Z;
                        if (i3 >= this.e0) {
                            this.X = AbstractIterator.State.Z;
                            return null;
                        }
                        ImmutableArrayMap immutableArrayMap = ImmutableArrayMap.this;
                        Object objV = immutableArrayMap.v(i3);
                        if (objV != null) {
                            return new ImmutableEntry(immutableArrayMap.w().keySet().d().get(this.Z), objV);
                        }
                        i2 = this.Z;
                    }
                }
            };
        }

        public abstract Object v(int i2);

        public abstract ImmutableMap w();

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public final class Row extends ImmutableArrayMap<C, V> {
        public final int f0;

        public Row(int i2) {
            super(DenseImmutableTable.this.h0[i2]);
            this.f0 = i2;
        }

        @Override // com.google.common.collect.ImmutableMap
        public final boolean l() {
            return true;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public final Object v(int i2) {
            return DenseImmutableTable.this.j0[this.f0][i2];
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public final ImmutableMap w() {
            return DenseImmutableTable.this.e0;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap, com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public final class RowMap extends ImmutableArrayMap<R, ImmutableMap<C, V>> {
        public RowMap() {
            super(DenseImmutableTable.this.h0.length);
        }

        @Override // com.google.common.collect.ImmutableMap
        public final boolean l() {
            return false;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public final Object v(int i2) {
            return new Row(i2);
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public final ImmutableMap w() {
            return DenseImmutableTable.this.Z;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap, com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public DenseImmutableTable(ImmutableList immutableList, ImmutableSet immutableSet, ImmutableSet immutableSet2) {
        this.j0 = (Object[][]) Array.newInstance((Class<?>) Object.class, immutableSet.size(), immutableSet2.size());
        ImmutableMap immutableMapF = Maps.f(immutableSet);
        this.Z = immutableMapF;
        ImmutableMap immutableMapF2 = Maps.f(immutableSet2);
        this.e0 = immutableMapF2;
        this.h0 = new int[((RegularImmutableMap) immutableMapF).g0];
        this.i0 = new int[((RegularImmutableMap) immutableMapF2).g0];
        RegularImmutableList regularImmutableList = (RegularImmutableList) immutableList;
        int i2 = regularImmutableList.e0;
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            Table.Cell cell = (Table.Cell) regularImmutableList.get(i3);
            Object objD = cell.d();
            Object objG = cell.g();
            Integer num = (Integer) this.Z.get(objD);
            Objects.requireNonNull(num);
            int iIntValue = num.intValue();
            Integer num2 = (Integer) this.e0.get(objG);
            Objects.requireNonNull(num2);
            int iIntValue2 = num2.intValue();
            Object obj = this.j0[iIntValue][iIntValue2];
            Object value = cell.getValue();
            if (obj != null) {
                throw new IllegalArgumentException(Strings.a("Duplicate key: (row=%s, column=%s), values: [%s, %s].", objD, objG, value, obj));
            }
            this.j0[iIntValue][iIntValue2] = cell.getValue();
            int[] iArr3 = this.h0;
            iArr3[iIntValue] = iArr3[iIntValue] + 1;
            int[] iArr4 = this.i0;
            iArr4[iIntValue2] = iArr4[iIntValue2] + 1;
            iArr[i3] = iIntValue;
            iArr2[i3] = iIntValue2;
        }
        this.k0 = iArr;
        this.l0 = iArr2;
        this.f0 = new RowMap();
        this.g0 = new ColumnMap();
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public final Map g() {
        return ImmutableMap.e(this.f0);
    }

    @Override // com.google.common.collect.ImmutableTable
    public final ImmutableMap q() {
        return ImmutableMap.e(this.g0);
    }

    @Override // com.google.common.collect.Table
    public final int size() {
        return this.k0.length;
    }

    @Override // com.google.common.collect.ImmutableTable
    public final Object t(Object obj, Object obj2) {
        Integer num = (Integer) this.Z.get(obj);
        Integer num2 = (Integer) this.e0.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return this.j0[num.intValue()][num2.intValue()];
    }

    @Override // com.google.common.collect.ImmutableTable
    /* JADX INFO: renamed from: u */
    public final ImmutableMap g() {
        return ImmutableMap.e(this.f0);
    }

    @Override // com.google.common.collect.RegularImmutableTable
    public final Table.Cell w(int i2) {
        int i3 = this.k0[i2];
        int i4 = this.l0[i2];
        E e2 = g().keySet().d().get(i3);
        E e3 = q().keySet().d().get(i4);
        Object obj = this.j0[i3][i4];
        Objects.requireNonNull(obj);
        return ImmutableTable.n(e2, e3, obj);
    }

    @Override // com.google.common.collect.RegularImmutableTable, com.google.common.collect.ImmutableTable
    public Object writeReplace() {
        return ImmutableTable.SerializedForm.a(this, this.k0, this.l0);
    }

    @Override // com.google.common.collect.RegularImmutableTable
    public final Object x(int i2) {
        Object obj = this.j0[this.k0[i2]][this.l0[i2]];
        Objects.requireNonNull(obj);
        return obj;
    }
}
