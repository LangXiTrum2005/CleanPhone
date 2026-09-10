package com.facebook.ads.redexgen.core;

import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Be, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1087Be extends AbstractC2543ns {
    public C1087Be() {
        super(null);
    }

    private final AbstractC2543ns A00(int result) {
        if (result < 0) {
            return AbstractC2543ns.A02;
        }
        if (result > 0) {
            return AbstractC2543ns.A01;
        }
        return AbstractC2543ns.A00;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2543ns
    public final int A05() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2543ns
    public final AbstractC2543ns A06(int left, int right) {
        return A00(Integer.compare(left, right));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2543ns
    public final AbstractC2543ns A07(long left, long right) {
        return A00(Long.compare(left, right));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2543ns
    public final <T> AbstractC2543ns A08(@ParametricNullness T left, @ParametricNullness T right, Comparator<T> comparator) {
        return A00(comparator.compare(left, right));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2543ns
    public final AbstractC2543ns A09(boolean left, boolean right) {
        return A00(Boolean.compare(left, right));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2543ns
    public final AbstractC2543ns A0A(boolean left, boolean right) {
        return A00(Boolean.compare(right, left));
    }
}
