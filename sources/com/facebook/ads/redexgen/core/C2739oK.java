package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2739oK implements InterfaceC12088v {
    public static byte[] A01;
    public static String[] A02 = {"", "W3zKx7uimPBnuqB79eRuk71Lq6Q9Tdtq", "pdw5IcOEDsyx", "PznYxCtiabQ1XXQUVp9BfEAYIGk6ZsUE", "E1k4hPJKfb0MvebzJOZYusmHHBWvORO7", "bmueFxdYYt0nqn8p", "GRfRtgnBgmJZB0Qq", "VS7ML1wDeymmTLeKFRcttz7uEm3bVRGQ"};
    public final /* synthetic */ AnonymousClass12 A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A02;
            if (strArr[5].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            A02[4] = "fuFs1gweK6T0kCx4bj1F2DHsk5QuVwMS";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 8);
            i5++;
        }
    }

    public static void A01() {
        A01 = new byte[]{47, 27, 10, 7, 1, 78, 29, 7, 0, 5, 78, 11, 28, 28, 1, 28, 32, 8, 9, 4, 12, 46, 2, 9, 8, 14, 44, 24, 9, 4, 2, 63, 8, 3, 9, 8, 31, 8, 31, 55, 54, 11, 52, 61, 61, 40, 24, 25, 32, 22, 28, 18, 2, 7};
    }

    static {
        A01();
    }

    public C2739oK(AnonymousClass12 anonymousClass12) {
        this.A00 = anonymousClass12;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC12088v
    public final void AD6(Exception exc) {
        AbstractC10924g.A08(A00(16, 23, 101), A00(0, 16, 102), exc);
        this.A00.A0F.A0D(exc);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC12088v
    public final void AD7(C12058r c12058r) {
        this.A00.A0F.A0B(c12058r);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC12088v
    public final void AD8(C12058r c12058r) {
        this.A00.A0F.A0C(c12058r);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC12088v
    public final void AF2() {
        AnonymousClass12.A05(this.A00);
        if (0 != 0) {
            AnonymousClass12.A05(this.A00);
            throw new NullPointerException(A00(46, 8, 127));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC12088v
    public final void AF3() {
        AnonymousClass12.A05(this.A00);
        if (0 != 0) {
            AnonymousClass12.A05(this.A00);
            throw new NullPointerException(A00(39, 7, 80));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC12088v
    public final void AFN(long j) {
        this.A00.A0F.A03(j);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC12088v
    public final void AFO() {
        this.A00.A26();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC12088v
    public final void AFy(boolean z2) {
        this.A00.A0F.A0I(z2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC12088v
    public final void AGJ(int i2, long j, long j2) {
        this.A00.A0F.A01(i2, j, j2);
    }
}
