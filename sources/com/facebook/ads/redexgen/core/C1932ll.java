package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import com.umeng.analytics.pro.cw;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ll, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1932ll implements C3Q {
    public static byte[] A06;
    public static String[] A07 = {"hwQkg6wydYZbPmHd9ra1rendlmZDH9o", "EZChF1CYxmcTUt5XULmCX0u1P", "cTSi58RkvxQZRZutX5Kpp639urCcNivT", "ILotitRaBN9o4fzRERLTj8sSXBTWlTTb", "JZvxvLc", "wZ48NZZ1KfL4Szkg73ZSFlGgbHtYLjcz", "R8pWvTFrbs0CFqCxyNRNjvJ5bjwX3", "qzEf3MAjBvJJtqQXUiJPrqpPaexFktRV"};
    public boolean A00;
    public final AbstractC1951m5 A01;
    public final C3E A02;
    public final C3L A03;
    public final C1929li A04;
    public final C1828k1 A05;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 66);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{87, 114, 54, 121, 116, 124, 115, 117, 98, 54, 127, 101, 54, 120, 99, 122, 122, 3, 20, cw.m, 5, cw.k, 4, 30, 4, 25, 21, 19, 0, 18, 30, 10, 4, 24, 65, 69, 70, 114, 99, 110, 98, 105, 100, 98, 73, 98, 115, 112, 104, 117, 108, 94, 89, 67, 72, 82, 69, 69, 88, 69, 72, 84, 88, 83, 82, 72, 92, 82, 78, 96, 103, 125, 118, 123, 127, 118, 127, 96, 109, 108, 102, 118, 109, 124, 123, 104, 125, 96, 102, 103, 118, 98, 108, 112, 67, 64, 65, 72, 80, 70, 65, 89, 78, 67, 70, 75, 78, 91, 70, 64, 65, 80, 91, 70, 66, 74, 80, 68, 74, 86, 34, 10, 28, 28, cw.l, 8, 10, 85, 79, 127, 91, 65, 65, 91, 92, 85, 18, 80, 71, 92, 86, 94, 87, 18, 84, 93, 64, 18, 95, 87, 65, 65, 83, 85, 87, 9, 45, 55, 55, 45, 42, 35, 100, 38, 49, 42, 32, 40, 33, 100, 34, 43, 54, 100, 41, 33, 55, 55, 37, 35, 33, 106, 54, 49, 55, 58, 32, 55, 55, 42, 55, 58, 40, 32, 54, 54, 36, 34, 32, 58, 46, 32, 60, 5, 20, cw.k};
    }

    static {
        A01();
    }

    public C1932ll(C1828k1 c1828k1, C1929li c1929li, C3E c3e, AbstractC1951m5 abstractC1951m5, C3L c3l) {
        this.A05 = c1828k1;
        this.A04 = c1929li;
        this.A02 = c3e;
        this.A01 = abstractC1951m5;
        this.A03 = c3l;
    }

    @Override // com.facebook.ads.redexgen.core.C3Q
    public final Bundle A5H(String str) {
        return C3X.A03(str, this.A04);
    }

    @Override // com.facebook.ads.redexgen.core.C3Q
    public final void A5l() {
        this.A03.A0F(2002, null);
        this.A03.A0C();
        this.A04.A02(null);
    }

    @Override // com.facebook.ads.redexgen.core.C3Q
    public final int A8F() {
        return 2000;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x014a, code lost:
    
        if (r4 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x014c, code lost:
    
        r9.A04.A04.onAdLoaded(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0153, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x015b, code lost:
    
        if (r4 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x015e, code lost:
    
        r9.A00 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
    
        return;
     */
    @Override // com.facebook.ads.redexgen.core.C3Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A9Z(android.os.Message r10) {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1932ll.A9Z(android.os.Message):void");
    }

    @Override // com.facebook.ads.redexgen.core.C3Q
    public final void AIt(boolean z) {
        this.A00 = z;
    }
}
