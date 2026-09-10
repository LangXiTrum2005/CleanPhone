package com.google.common.collect;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
class SingletonImmutableTable<R, C, V> extends ImmutableTable<R, C, V> {
    public final Object Z;
    public final Object e0;
    public final Object f0;

    public SingletonImmutableTable(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        this.Z = obj;
        obj2.getClass();
        this.e0 = obj2;
        obj3.getClass();
        this.f0 = obj3;
    }

    @Override // com.google.common.collect.ImmutableTable
    public final ImmutableMap q() {
        Object obj = this.Z;
        Object obj2 = this.f0;
        CollectPreconditions.a(obj, obj2);
        RegularImmutableMap regularImmutableMapU = RegularImmutableMap.u(1, new Object[]{obj, obj2}, null);
        Object obj3 = this.e0;
        CollectPreconditions.a(obj3, regularImmutableMapU);
        return RegularImmutableMap.u(1, new Object[]{obj3, regularImmutableMapU}, null);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    /* JADX INFO: renamed from: r */
    public final ImmutableSet j() {
        Table.Cell cellN = ImmutableTable.n(this.Z, this.e0, this.f0);
        int i2 = ImmutableSet.Z;
        return new SingletonImmutableSet(cellN);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    /* JADX INFO: renamed from: s */
    public final ImmutableCollection k() {
        int i2 = ImmutableSet.Z;
        return new SingletonImmutableSet(this.f0);
    }

    @Override // com.google.common.collect.Table
    public final int size() {
        return 1;
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    /* JADX INFO: renamed from: u */
    public final ImmutableMap g() {
        Object obj = this.e0;
        Object obj2 = this.f0;
        CollectPreconditions.a(obj, obj2);
        RegularImmutableMap regularImmutableMapU = RegularImmutableMap.u(1, new Object[]{obj, obj2}, null);
        Object obj3 = this.Z;
        CollectPreconditions.a(obj3, regularImmutableMapU);
        return RegularImmutableMap.u(1, new Object[]{obj3, regularImmutableMapU}, null);
    }

    @Override // com.google.common.collect.ImmutableTable
    public Object writeReplace() {
        return ImmutableTable.SerializedForm.a(this, new int[]{0}, new int[]{0});
    }
}
