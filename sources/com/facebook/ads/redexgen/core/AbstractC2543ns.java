package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ns, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC2543ns {
    public static final AbstractC2543ns A00 = new C1087Be();
    public static final AbstractC2543ns A02 = new C1085Bc(-1);
    public static final AbstractC2543ns A01 = new C1085Bc(1);

    public abstract int A05();

    public abstract AbstractC2543ns A06(int left, int right);

    public abstract AbstractC2543ns A07(long left, long right);

    public abstract <T> AbstractC2543ns A08(@ParametricNullness T left, @ParametricNullness T right, Comparator<T> comparator);

    public abstract AbstractC2543ns A09(boolean left, boolean right);

    public abstract AbstractC2543ns A0A(boolean left, boolean right);

    public AbstractC2543ns() {
    }

    public /* synthetic */ AbstractC2543ns(C1087Be c1087Be) {
        this();
    }

    public static AbstractC2543ns A01() {
        return A00;
    }
}
