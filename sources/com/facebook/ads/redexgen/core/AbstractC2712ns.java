package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ns, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC2712ns {
    public static final AbstractC2712ns A00 = new C1256Be();
    public static final AbstractC2712ns A02 = new C1254Bc(-1);
    public static final AbstractC2712ns A01 = new C1254Bc(1);

    public abstract int A05();

    public abstract AbstractC2712ns A06(int left, int right);

    public abstract AbstractC2712ns A07(long left, long right);

    public abstract <T> AbstractC2712ns A08(@ParametricNullness T left, @ParametricNullness T right, Comparator<T> comparator);

    public abstract AbstractC2712ns A09(boolean left, boolean right);

    public abstract AbstractC2712ns A0A(boolean left, boolean right);

    public AbstractC2712ns() {
    }

    public /* synthetic */ AbstractC2712ns(C1256Be c1256Be) {
        this();
    }

    public static AbstractC2712ns A01() {
        return A00;
    }
}
