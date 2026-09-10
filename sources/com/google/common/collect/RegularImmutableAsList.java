package com.google.common.collect;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
class RegularImmutableAsList<E> extends ImmutableAsList<E> {
    @Override // com.google.common.collect.ImmutableAsList
    public final ImmutableCollection F() {
        return null;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public final int e(int i2, Object[] objArr) {
        throw null;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final Object[] g() {
        throw null;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        throw null;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int h() {
        throw null;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int i() {
        throw null;
    }

    @Override // com.google.common.collect.ImmutableList, java.util.List
    public final ListIterator listIterator(int i2) {
        throw null;
    }

    @Override // com.google.common.collect.ImmutableList
    /* JADX INFO: renamed from: w */
    public final UnmodifiableListIterator listIterator(int i2) {
        throw null;
    }

    @Override // com.google.common.collect.ImmutableAsList, com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
