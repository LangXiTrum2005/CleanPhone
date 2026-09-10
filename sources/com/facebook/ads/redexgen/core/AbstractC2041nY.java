package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC2041nY<T> implements Comparator<T> {
    @Override // java.util.Comparator
    public abstract int compare(@ParametricNullness T left, @ParametricNullness T right);

    public static <C extends Comparable> AbstractC2041nY<C> A03() {
        return C0923Nw.A02;
    }

    public static <T> AbstractC2041nY<T> A04(Comparator<T> comparator) {
        if (comparator instanceof AbstractC2041nY) {
            return (AbstractC2041nY) comparator;
        }
        return new OS(comparator);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.hs != com.google.common.base.Function<F, ? extends T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nY != com.google.common.collect.Ordering<T> */
    public final <F> AbstractC2041nY<F> A05(InterfaceC1699hs<F, ? extends T> function) {
        return new OY(function, this);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nY != com.google.common.collect.Ordering<T> */
    public <S extends T> AbstractC2041nY<S> A06() {
        return new C0920Nt(this);
    }
}
