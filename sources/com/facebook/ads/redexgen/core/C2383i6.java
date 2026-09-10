package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.i6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2383i6<T> implements PD<T> {
    public static byte[] A02;
    public static String[] A03 = {"iLl0wsw23K5yUh77EmQ7aS", "GfoEaaBl8U8k0Q7PfB9fbljrax1waY16", "5gtDUT", "ShV5kwK9yY", "0fmlK", "YYoW0eMgewTEbJ6HTbYGGS2KWNlxhaI9", "", "sW1q2ctPu7RNrNZv5Ej0VW9PcKYvvqLT"};
    public int A00;
    public final Object[] A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A03[0].length() == 2) {
                throw new RuntimeException();
            }
            A03[0] = "a39lLlVm2wZ";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 94);
            i5++;
        }
    }

    public static void A01() {
        A02 = new byte[]{-15, 28, 34, 21, 17, 20, 41, -48, 25, 30, -48, 36, 24, 21, -48, 32, 31, 31, 28, -47, -63, -43, -46, -115, -38, -50, -27, -115, -35, -36, -36, -39, -115, -32, -42, -25, -46, -115, -38, -30, -32, -31, -115, -49, -46, -115, -85, -115, -99};
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.i6 != com.facebook.ads.internal.androidx.support.v4.util.Pools$SimplePool<T> */
    public C2383i6(int i2) {
        if (i2 > 0) {
            this.A01 = new Object[i2];
            return;
        }
        throw new IllegalArgumentException(A00(20, 29, 15));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.i6 != com.facebook.ads.internal.androidx.support.v4.util.Pools$SimplePool<T> */
    private boolean A02(T instance) {
        for (int i2 = 0; i2 < i; i2++) {
            if (this.A01[i2] == instance) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.i6 != com.facebook.ads.internal.androidx.support.v4.util.Pools$SimplePool<T> */
    @Override // com.facebook.ads.redexgen.core.PD
    @Nullable
    public T A3B() {
        if (this.A00 <= 0) {
            return null;
        }
        int i2 = this.A00 - 1;
        T t = (T) this.A01[i2];
        this.A01[i2] = null;
        if (A03[1].charAt(25) == 't') {
            throw new RuntimeException();
        }
        A03[1] = "CkflbgsNAkMx06fZnMm4opLTGkpn7A2i";
        this.A00--;
        return t;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.i6 != com.facebook.ads.internal.androidx.support.v4.util.Pools$SimplePool<T> */
    @Override // com.facebook.ads.redexgen.core.PD
    public boolean AHf(T t) {
        if (!A02(t)) {
            int i2 = this.A00;
            Object[] objArr = this.A01;
            if (A03[3].length() == 20) {
                throw new RuntimeException();
            }
            A03[4] = "en1OjK";
            if (i2 < objArr.length) {
                this.A01[this.A00] = t;
                this.A00++;
                return true;
            }
            return false;
        }
        throw new IllegalStateException(A00(0, 20, 82));
    }
}
