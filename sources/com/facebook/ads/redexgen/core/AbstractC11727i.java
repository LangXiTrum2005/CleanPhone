package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract /* synthetic */ class AbstractC11727i {
    public static int A00(int i2) {
        return A06(i2, 0, 0);
    }

    public static int A01(int i2) {
        return i2 & 24;
    }

    public static int A02(int i2) {
        return i2 & 384;
    }

    public static int A03(int i2) {
        return i2 & 7;
    }

    public static int A04(int i2) {
        return i2 & 64;
    }

    public static int A05(int i2) {
        return i2 & 32;
    }

    public static int A06(int i2, int i3, int i4) {
        return A07(i2, i3, i4, 0, 128);
    }

    public static int A07(int i2, int i3, int i4, int i5, int i6) {
        return i2 | i3 | i4 | i5 | i6;
    }
}
