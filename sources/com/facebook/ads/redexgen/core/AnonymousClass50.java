package com.facebook.ads.redexgen.core;

import android.view.Surface;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.50, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass50 {
    public static byte[] A04;
    public static String[] A05 = {"rYnPbEfuSaTBbvatyKmqENn8mgRSZdek", "ofstc3luVQLhDPNdocOCjRxToKRzk7nB", "Fnbmz9sIEw5y7N9QBLdBg", "MRjsdls7eSgWLCoo8pA3j", "UfW8AgM42njlyNRr2q7EB3IdvayipkgN", "kcxrVmXx561a0K31f6UYVe0sWhenvrT2", "", "AcILJL5UwW37jf1DZrUjVyU1aBx980VR"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final Surface A03;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 33);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{66, 95, 68, 72, 67, 89, 76, 89, 68, 66, 67, 105, 72, 74, 95, 72, 72, 94, 13, 64, 88, 94, 89, 13, 79, 72, 13, 29, 1, 13, 20, 29, 1, 13, 28, 21, 29, 1, 13, 66, 95, 13, 31, 26, 29};
    }

    static {
        A01();
    }

    public AnonymousClass50(Surface surface, int i2, int i3) {
        this(surface, i2, i3, 0);
    }

    public AnonymousClass50(Surface surface, int i2, int i3, int i4) {
        AbstractC10843y.A09(i4 == 0 || i4 == 90 || i4 == 180 || i4 == 270, A00(0, 45, 12));
        this.A03 = surface;
        this.A02 = i2;
        this.A00 = i3;
        this.A01 = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass50)) {
            return false;
        }
        AnonymousClass50 anonymousClass50 = (AnonymousClass50) obj;
        if (this.A02 == anonymousClass50.A02 && this.A00 == anonymousClass50.A00) {
            int i2 = this.A01;
            int i3 = anonymousClass50.A01;
            if (A05[7].charAt(29) == 'q') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[2] = "IfmXZsmHB8xObc4DA1o6c";
            strArr[3] = "9bmF1UX1T4riDJeOAx7tH";
            if (i2 == i3 && this.A03.equals(anonymousClass50.A03)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A03.hashCode();
        int i2 = result * 31;
        int result2 = this.A02;
        int result3 = (((i2 + result2) * 31) + this.A00) * 31;
        int result4 = this.A01;
        return result3 + result4;
    }
}
