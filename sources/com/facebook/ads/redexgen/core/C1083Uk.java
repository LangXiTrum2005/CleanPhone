package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1083Uk {
    public static byte[] A02;
    public static final C1083Uk A03;
    public final long A00;
    public final long A01;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 1);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{23, 27, 75, 84, 72, 82, 79, 82, 84, 85, 6, 89, 118, 107, 111, 103, 87, 113, 63, 88};
    }

    static {
        A01();
        A03 = new C1083Uk(0L, 0L);
    }

    public C1083Uk(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1083Uk c1083Uk = (C1083Uk) obj;
        return this.A01 == c1083Uk.A01 && this.A00 == c1083Uk.A00;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }

    public final String toString() {
        return A00(11, 8, 3) + this.A01 + A00(0, 11, 58) + this.A00 + A00(19, 1, 4);
    }
}
