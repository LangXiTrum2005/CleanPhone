package com.google.common.collect;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class RegularImmutableSet<E> extends ImmutableSet<E> {
    public static final Object[] j0;
    public static final RegularImmutableSet k0;
    public final transient Object[] e0;
    public final transient int f0;
    public final transient Object[] g0;
    public final transient int h0;
    public final transient int i0;

    static {
        Object[] objArr = new Object[0];
        j0 = objArr;
        k0 = new RegularImmutableSet(objArr, 0, objArr, 0, 0);
    }

    public RegularImmutableSet(Object[] objArr, int i2, Object[] objArr2, int i3, int i4) {
        this.e0 = objArr;
        this.f0 = i2;
        this.g0 = objArr2;
        this.h0 = i3;
        this.i0 = i4;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.g0;
            if (objArr.length != 0) {
                int iC = Hashing.c(obj);
                while (true) {
                    int i2 = iC & this.h0;
                    Object obj2 = objArr[i2];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iC = i2 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int e(int i2, Object[] objArr) {
        Object[] objArr2 = this.e0;
        int i3 = this.i0;
        System.arraycopy(objArr2, 0, objArr, i2, i3);
        return i2 + i3;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final Object[] g() {
        return this.e0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int h() {
        return this.i0;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int i() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean l() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: o */
    public final UnmodifiableIterator iterator() {
        return d().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.i0;
    }

    @Override // com.google.common.collect.ImmutableSet
    public final ImmutableList w() {
        return ImmutableList.p(this.i0, this.e0);
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.ImmutableSet
    public final boolean x() {
        return true;
    }
}
