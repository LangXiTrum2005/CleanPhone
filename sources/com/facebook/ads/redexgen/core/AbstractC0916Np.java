package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.ListIterator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Np, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC0916Np<E> extends AbstractC2093oj<E> implements ListIterator<E> {
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Np != com.google.common.collect.UnmodifiableListIterator<E> */
    @Override // java.util.ListIterator
    @Deprecated
    public final void add(@ParametricNullness E e) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Np != com.google.common.collect.UnmodifiableListIterator<E> */
    @Override // java.util.ListIterator
    @Deprecated
    public final void set(@ParametricNullness E e) {
        throw new UnsupportedOperationException();
    }
}
