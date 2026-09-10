package com.google.common.collect;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
class CompactLinkedHashSet<E> extends CompactHashSet<E> {
    public transient int[] g0;
    public transient int[] h0;
    public transient int i0;
    public transient int j0;

    @Override // com.google.common.collect.CompactHashSet
    public final int a(int i2, int i3) {
        return i2 >= size() ? i3 : i2;
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (t()) {
            return;
        }
        this.i0 = -2;
        this.j0 = -2;
        int[] iArr = this.g0;
        if (iArr != null && this.h0 != null) {
            Arrays.fill(iArr, 0, size(), 0);
            Arrays.fill(this.h0, 0, size(), 0);
        }
        super.clear();
    }

    @Override // com.google.common.collect.CompactHashSet
    public final int d() {
        int iD = super.d();
        this.g0 = new int[iD];
        this.h0 = new int[iD];
        return iD;
    }

    @Override // com.google.common.collect.CompactHashSet
    public final LinkedHashSet g() {
        LinkedHashSet linkedHashSetG = super.g();
        this.g0 = null;
        this.h0 = null;
        return linkedHashSetG;
    }

    @Override // com.google.common.collect.CompactHashSet
    public final int i() {
        return this.i0;
    }

    @Override // com.google.common.collect.CompactHashSet
    public final int l(int i2) {
        int[] iArr = this.h0;
        Objects.requireNonNull(iArr);
        return iArr[i2] - 1;
    }

    @Override // com.google.common.collect.CompactHashSet
    public final void o(int i2) {
        super.o(i2);
        this.i0 = -2;
        this.j0 = -2;
    }

    @Override // com.google.common.collect.CompactHashSet
    public final void p(int i2, int i3, int i4, Object obj) {
        super.p(i2, i3, i4, obj);
        y(this.j0, i2);
        y(i2, -2);
    }

    @Override // com.google.common.collect.CompactHashSet
    public final void s(int i2, int i3) {
        int size = size() - 1;
        super.s(i2, i3);
        int[] iArr = this.g0;
        Objects.requireNonNull(iArr);
        y(iArr[i2] - 1, l(i2));
        if (i2 < size) {
            int[] iArr2 = this.g0;
            Objects.requireNonNull(iArr2);
            y(iArr2[size] - 1, i2);
            y(i2, l(size));
        }
        int[] iArr3 = this.g0;
        Objects.requireNonNull(iArr3);
        iArr3[size] = 0;
        int[] iArr4 = this.h0;
        Objects.requireNonNull(iArr4);
        iArr4[size] = 0;
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = new Object[size()];
        ObjectArrays.b(this, objArr);
        return objArr;
    }

    @Override // com.google.common.collect.CompactHashSet
    public final void w(int i2) {
        super.w(i2);
        int[] iArr = this.g0;
        Objects.requireNonNull(iArr);
        this.g0 = Arrays.copyOf(iArr, i2);
        int[] iArr2 = this.h0;
        Objects.requireNonNull(iArr2);
        this.h0 = Arrays.copyOf(iArr2, i2);
    }

    public final void y(int i2, int i3) {
        if (i2 == -2) {
            this.i0 = i3;
        } else {
            int[] iArr = this.h0;
            Objects.requireNonNull(iArr);
            iArr[i2] = i3 + 1;
        }
        if (i3 == -2) {
            this.j0 = i2;
            return;
        }
        int[] iArr2 = this.g0;
        Objects.requireNonNull(iArr2);
        iArr2[i3] = i2 + 1;
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        return ObjectArrays.c(this, objArr);
    }
}
