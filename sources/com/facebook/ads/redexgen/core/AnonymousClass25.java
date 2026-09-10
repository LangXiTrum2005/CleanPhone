package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.25, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@ElementTypesAreNonnullByDefault
public final class AnonymousClass25<E> extends BO<E> {
    public final transient E A00;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.25 != com.google.common.collect.SingletonImmutableSet<E> */
    public AnonymousClass25(E e2) {
        this.A00 = (E) AbstractC2530ki.A04(e2);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.25 != com.google.common.collect.SingletonImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2743oO
    public final int A0I(Object[] dst, int offset) {
        dst[offset] = this.A00;
        return offset + 1;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.25 != com.google.common.collect.SingletonImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.core.BO, com.facebook.ads.redexgen.core.AbstractC2743oO
    public final BP<E> A0J() {
        return BP.A04(this.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.25 != com.google.common.collect.SingletonImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2743oO
    public final boolean A0K() {
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.25 != com.google.common.collect.SingletonImmutableSet<E> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: A0N, reason: merged with bridge method [inline-methods] */
    public final C4C<E> iterator() {
        return AbstractC2790p9.A03(this.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.25 != com.google.common.collect.SingletonImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2743oO, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object target) {
        return this.A00.equals(target);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.25 != com.google.common.collect.SingletonImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.core.BO, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.A00.hashCode();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.25 != com.google.common.collect.SingletonImmutableSet<E> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.25 != com.google.common.collect.SingletonImmutableSet<E> */
    @Override // java.util.AbstractCollection
    public final String toString() {
        return AbstractJsonLexerKt.BEGIN_LIST + this.A00.toString() + AbstractJsonLexerKt.END_LIST;
    }
}
