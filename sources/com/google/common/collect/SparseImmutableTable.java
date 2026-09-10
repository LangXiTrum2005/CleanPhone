package com.google.common.collect;

import com.google.common.base.Strings;
import com.google.errorprone.annotations.Immutable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
@Immutable
@ElementTypesAreNonnullByDefault
final class SparseImmutableTable<R, C, V> extends RegularImmutableTable<R, C, V> {
    public static final ImmutableTable h0;
    public final ImmutableMap Z;
    public final ImmutableMap e0;
    public final int[] f0;
    public final int[] g0;

    static {
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f19830Y;
        ImmutableList immutableList = RegularImmutableList.f0;
        int i2 = ImmutableSet.Z;
        RegularImmutableSet regularImmutableSet = RegularImmutableSet.k0;
        h0 = new SparseImmutableTable(immutableList, regularImmutableSet, regularImmutableSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SparseImmutableTable(ImmutableList immutableList, ImmutableSet immutableSet, ImmutableSet immutableSet2) {
        ImmutableMap immutableMapF = Maps.f(immutableSet);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        UnmodifiableIterator it = immutableSet.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), new LinkedHashMap());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        UnmodifiableIterator it2 = immutableSet2.iterator();
        while (it2.hasNext()) {
            linkedHashMap2.put(it2.next(), new LinkedHashMap());
        }
        int[] iArr = new int[((RegularImmutableList) immutableList).e0];
        RegularImmutableList regularImmutableList = (RegularImmutableList) immutableList;
        int i2 = regularImmutableList.e0;
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            Table.Cell cell = (Table.Cell) regularImmutableList.get(i3);
            Object objD = cell.d();
            Object objG = cell.g();
            Object value = cell.getValue();
            Integer num = (Integer) ((RegularImmutableMap) immutableMapF).get(objD);
            Objects.requireNonNull(num);
            iArr[i3] = num.intValue();
            Map map = (Map) linkedHashMap.get(objD);
            Objects.requireNonNull(map);
            Map map2 = map;
            iArr2[i3] = map2.size();
            Object objPut = map2.put(objG, value);
            if (objPut != null) {
                throw new IllegalArgumentException(Strings.a("Duplicate key: (row=%s, column=%s), values: [%s, %s].", objD, objG, value, objPut));
            }
            Map map3 = (Map) linkedHashMap2.get(objG);
            Objects.requireNonNull(map3);
            map3.put(objD, value);
        }
        this.f0 = iArr;
        this.g0 = iArr2;
        ImmutableMap.Builder builder = new ImmutableMap.Builder(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            builder.c(entry.getKey(), ImmutableMap.e((Map) entry.getValue()));
        }
        this.Z = builder.a(true);
        ImmutableMap.Builder builder2 = new ImmutableMap.Builder(linkedHashMap2.size());
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            builder2.c(entry2.getKey(), ImmutableMap.e((Map) entry2.getValue()));
        }
        this.e0 = builder2.a(true);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public final Map g() {
        return ImmutableMap.e(this.Z);
    }

    @Override // com.google.common.collect.ImmutableTable
    public final ImmutableMap q() {
        return ImmutableMap.e(this.e0);
    }

    @Override // com.google.common.collect.Table
    public final int size() {
        return this.f0.length;
    }

    @Override // com.google.common.collect.ImmutableTable
    /* JADX INFO: renamed from: u */
    public final ImmutableMap g() {
        return ImmutableMap.e(this.Z);
    }

    @Override // com.google.common.collect.RegularImmutableTable
    public final Table.Cell w(int i2) {
        Map.Entry entry = (Map.Entry) this.Z.entrySet().d().get(this.f0[i2]);
        ImmutableMap immutableMap = (ImmutableMap) entry.getValue();
        Map.Entry entry2 = (Map.Entry) immutableMap.entrySet().d().get(this.g0[i2]);
        return ImmutableTable.n(entry.getKey(), entry2.getKey(), entry2.getValue());
    }

    @Override // com.google.common.collect.RegularImmutableTable, com.google.common.collect.ImmutableTable
    public Object writeReplace() {
        ImmutableMap immutableMapF = Maps.f(q().keySet());
        int[] iArr = new int[p().size()];
        UnmodifiableIterator it = p().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Integer num = (Integer) ((RegularImmutableMap) immutableMapF).get(((Table.Cell) it.next()).g());
            Objects.requireNonNull(num);
            iArr[i2] = num.intValue();
            i2++;
        }
        return ImmutableTable.SerializedForm.a(this, this.f0, iArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.RegularImmutableTable
    public final Object x(int i2) {
        ImmutableMap immutableMap = (ImmutableMap) this.Z.values().d().get(this.f0[i2]);
        return immutableMap.values().d().get(this.g0[i2]);
    }
}
