package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.util.Objects;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public final class C04323r<E> extends OI<E> {
    public static final OI<Object> A02 = new C04323r(new Object[0], 0);
    public final transient Object[] A00;
    public final transient int A01;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.3r != com.google.common.collect.RegularImmutableList<E> */
    public C04323r(Object[] array, int size) {
        this.A00 = array;
        this.A01 = size;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.3r != com.google.common.collect.RegularImmutableList<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC1924ld
    public final int A0G() {
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.3r != com.google.common.collect.RegularImmutableList<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC1924ld
    public final int A0H() {
        return 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.3r != com.google.common.collect.RegularImmutableList<E> */
    @Override // com.facebook.ads.redexgen.core.OI, com.facebook.ads.redexgen.core.AbstractC1924ld
    public final int A0I(Object[] dst, int dstOff) {
        System.arraycopy(this.A00, 0, dst, dstOff, this.A01);
        return this.A01 + dstOff;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.3r != com.google.common.collect.RegularImmutableList<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC1924ld
    public final boolean A0K() {
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.3r != com.google.common.collect.RegularImmutableList<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC1924ld
    public final Object[] A0L() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.3r != com.google.common.collect.RegularImmutableList<E> */
    @Override // java.util.List
    public final E get(int i) {
        AbstractC1718iD.A00(i, this.A01);
        return (E) Objects.requireNonNull(this.A00[i]);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.3r != com.google.common.collect.RegularImmutableList<E> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A01;
    }
}
