package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1763iy extends BY {
    public static byte[] A07;
    public final /* synthetic */ long A00;
    public final /* synthetic */ C1762ix A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    static {
        A04();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 82);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A07 = new byte[]{21, 33, 31, -32, 24, 19, 21, 23, 20, 33, 33, 29, -32, 29, 19, 38, 19, 32, 19, -32, 34, 36, 33, 40, 27, 22, 23, 36, -32, -5, 32, 37, 38, 19, 30, 30, 4, 23, 24, 23, 36, 36, 23, 36, 2, 36, 33, 40, 27, 22, 23, 36, -74, -62, -64, -127, -68, -63, -58, -57, -76, -70, -59, -76, -64, -127, -74, -62, -63, -57, -72, -63, -57, -61, -59, -62, -55, -68, -73, -72, -59, -127, -100, -63, -58, -57, -76, -65, -65, -91, -72, -71, -72, -59, -59, -72, -59, -93, -59, -62, -55, -68, -73, -72, -59};
    }

    public C1763iy(C1762ix c1762ix, boolean z, String str, String str2, String str3, long j, boolean z2) {
        this.A01 = c1762ix;
        this.A06 = z;
        this.A02 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A00 = j;
        this.A05 = z2;
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final void A05() {
        boolean fb4aResult = this.A01.A03(A01(0, 52, 96), this.A06, this.A02, this.A04, this.A03, this.A00);
        if (fb4aResult) {
            return;
        }
        boolean fb4aResult2 = this.A05;
        if (fb4aResult2) {
            this.A01.A03(A01(52, 53, 1), this.A06, this.A02, this.A04, this.A03, this.A00);
        }
    }
}
