package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@ElementTypesAreNonnullByDefault
public final class B2<T> extends AbstractC2862qK<T> implements Serializable {
    public static byte[] A01;
    public static String[] A02 = {"TYphIuCeMUBPtejfiFOUwjFxcT4QBTq", "8HYxpO9zw1uGMW", "bftleM0W", "QbbbyMJUXm1d4Xd", "2naIPdaT", "exbXjeCkSw", "w", "Nm7"};
    public static final long serialVersionUID = 0;
    public final AbstractC2862qK<? super T> A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 55);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-30, 38, 25, 42, 25, 38, 39, 25, -36, -35};
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B2 != com.google.common.collect.ReverseOrdering<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.qK != com.google.common.collect.Ordering<? super T> */
    public B2(AbstractC2862qK<? super T> forwardOrder) {
        this.A00 = (AbstractC2862qK) AbstractC2530ki.A04(forwardOrder);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B2 != com.google.common.collect.ReverseOrdering<T> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2862qK
    public final <S extends T> AbstractC2862qK<S> A06() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B2 != com.google.common.collect.ReverseOrdering<T> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2862qK, java.util.Comparator
    public final int compare(@ParametricNullness T a2, @ParametricNullness T b2) {
        return this.A00.compare(b2, a2);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B2 != com.google.common.collect.ReverseOrdering<?> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B2 != com.google.common.collect.ReverseOrdering<T> */
    @Override // java.util.Comparator
    public final boolean equals(@CheckForNull Object object) {
        if (object != this) {
            if (object instanceof B2) {
                return this.A00.equals(((B2) object).A00);
            }
            return false;
        }
        String[] strArr = A02;
        if (strArr[2].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[2] = "3jzErf5H";
        strArr2[4] = "YYoE6Ooa";
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B2 != com.google.common.collect.ReverseOrdering<T> */
    public final int hashCode() {
        return -this.A00.hashCode();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B2 != com.google.common.collect.ReverseOrdering<T> */
    public final String toString() {
        return this.A00 + A00(0, 10, 125);
    }
}
