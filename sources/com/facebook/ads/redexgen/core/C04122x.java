package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public final class C04122x<E> extends OG<E> {
    public final transient E A00;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.google.common.collect.SingletonImmutableSet<E> */
    public C04122x(E e) {
        this.A00 = (E) AbstractC1718iD.A04(e);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.google.common.collect.SingletonImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC1924ld
    public final int A0I(Object[] dst, int offset) {
        dst[offset] = this.A00;
        return offset + 1;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.google.common.collect.SingletonImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.core.OG, com.facebook.ads.redexgen.core.AbstractC1924ld
    public final OI<E> A0J() {
        return OI.A04(this.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.google.common.collect.SingletonImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC1924ld
    public final boolean A0K() {
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.google.common.collect.SingletonImmutableSet<E> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: A0N, reason: merged with bridge method [inline-methods] */
    public final AbstractC2093oj<E> iterator() {
        return AbstractC1970mO.A03(this.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.google.common.collect.SingletonImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC1924ld, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object target) {
        return this.A00.equals(target);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.google.common.collect.SingletonImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.core.OG, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.A00.hashCode();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.google.common.collect.SingletonImmutableSet<E> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.google.common.collect.SingletonImmutableSet<E> */
    @Override // java.util.AbstractCollection
    public final String toString() {
        return '[' + this.A00.toString() + ']';
    }
}
