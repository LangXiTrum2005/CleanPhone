package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
class RegularImmutableList<E> extends ImmutableList<E> {
    public static final ImmutableList f0 = new RegularImmutableList(new Object[0], 0);
    public final transient Object[] Z;
    public final transient int e0;

    public RegularImmutableList(Object[] objArr, int i2) {
        this.Z = objArr;
        this.e0 = i2;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public final int e(int i2, Object[] objArr) {
        Object[] objArr2 = this.Z;
        int i3 = this.e0;
        System.arraycopy(objArr2, 0, objArr, i2, i3);
        return i2 + i3;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final Object[] g() {
        return this.Z;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        Preconditions.i(i2, this.e0);
        Object obj = this.Z[i2];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int h() {
        return this.e0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int i() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e0;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
