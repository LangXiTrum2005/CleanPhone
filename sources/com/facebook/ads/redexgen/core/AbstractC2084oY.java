package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.Iterator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC2084oY<F, T> implements Iterator<T> {
    public final Iterator<? extends F> A00;

    @ParametricNullness
    public abstract T A01(@ParametricNullness F from);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oY != com.google.common.collect.TransformedIterator<F, T> */
    public AbstractC2084oY(Iterator<? extends F> backingIterator) {
        this.A00 = (Iterator) AbstractC1718iD.A04(backingIterator);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oY != com.google.common.collect.TransformedIterator<F, T> */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oY != com.google.common.collect.TransformedIterator<F, T> */
    @Override // java.util.Iterator
    @ParametricNullness
    public final T next() {
        return A01(this.A00.next());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oY != com.google.common.collect.TransformedIterator<F, T> */
    @Override // java.util.Iterator
    public final void remove() {
        this.A00.remove();
    }
}
