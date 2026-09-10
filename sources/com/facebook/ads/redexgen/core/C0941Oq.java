package com.facebook.ads.redexgen.core;

import com.google.common.base.ParametricNullness;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Oq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0941Oq<T> implements InterfaceC1719iE<T>, Serializable {
    public static byte[] A01;
    public static final long serialVersionUID = 0;
    public final List<? extends InterfaceC1719iE<? super T>> A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 99);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{52, 65, 55};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Oq != com.google.common.base.Predicates$AndPredicate<T> */
    public C0941Oq(List<? extends InterfaceC1719iE<? super T>> components) {
        this.A00 = components;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Oq != com.google.common.base.Predicates$AndPredicate<T> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1719iE
    public final boolean A42(@ParametricNullness T t) {
        for (int i = 0; i < i; i++) {
            if (!this.A00.get(i).A42(t)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Oq != com.google.common.base.Predicates$AndPredicate<?> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Oq != com.google.common.base.Predicates$AndPredicate<T> */
    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof C0941Oq) {
            return this.A00.equals(((C0941Oq) obj).A00);
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Oq != com.google.common.base.Predicates$AndPredicate<T> */
    public final int hashCode() {
        return this.A00.hashCode() + 306654252;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Oq != com.google.common.base.Predicates$AndPredicate<T> */
    public final String toString() {
        return AbstractC1721iG.A02(A00(0, 3, 112), this.A00);
    }
}
