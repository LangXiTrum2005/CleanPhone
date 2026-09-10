package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.Arrays;
import org.jacoco.core.runtime.RemoteControlWriter;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2229iM implements OQ {
    public static byte[] A06;
    public static String[] A07 = {"hwQkg6wydYZbPmHd9ra1rendlmZDH9o", "EZChF1CYxmcTUt5XULmCX0u1P", "cTSi58RkvxQZRZutX5Kpp639urCcNivT", "ILotitRaBN9o4fzRERLTj8sSXBTWlTTb", "JZvxvLc", "wZ48NZZ1KfL4Szkg73ZSFlGgbHtYLjcz", "R8pWvTFrbs0CFqCxyNRNjvJ5bjwX3", "qzEf3MAjBvJJtqQXUiJPrqpPaexFktRV"};
    public boolean A00;
    public final AbstractC2251ik A01;
    public final OE A02;
    public final OL A03;
    public final C2226iI A04;
    public final C2131gi A05;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 66);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{87, 114, 54, 121, 116, 124, 115, 117, 98, 54, 127, 101, 54, 120, 99, 122, 122, 3, 20, 15, 5, 13, 4, 30, 4, 25, 21, 19, 0, 18, 30, 10, 4, 24, 65, 69, 70, 114, 99, 110, 98, 105, 100, 98, 73, 98, 115, 112, 104, 117, 108, 94, 89, 67, 72, 82, 69, 69, 88, 69, 72, 84, 88, 83, 82, 72, 92, 82, 78, 96, 103, 125, 118, 123, 127, 118, 127, 96, 109, 108, 102, 118, 109, 124, 123, 104, 125, 96, 102, 103, 118, 98, 108, 112, 67, RemoteControlWriter.BLOCK_CMDDUMP, 65, 72, 80, 70, 65, 89, 78, 67, 70, 75, 78, 91, 70, RemoteControlWriter.BLOCK_CMDDUMP, 65, 80, 91, 70, 66, 74, 80, 68, 74, 86, 34, 10, 28, 28, 14, 8, 10, 85, 79, 127, 91, 65, 65, 91, 92, 85, 18, 80, 71, 92, 86, 94, 87, 18, 84, 93, RemoteControlWriter.BLOCK_CMDDUMP, 18, 95, 87, 65, 65, 83, 85, 87, 9, 45, 55, 55, 45, 42, 35, 100, 38, 49, 42, RemoteControlWriter.BLOCK_CMDOK, 40, 33, 100, 34, 43, 54, 100, 41, 33, 55, 55, 37, 35, 33, 106, 54, 49, 55, 58, RemoteControlWriter.BLOCK_CMDOK, 55, 55, 42, 55, 58, 40, RemoteControlWriter.BLOCK_CMDOK, 54, 54, 36, 34, RemoteControlWriter.BLOCK_CMDOK, 58, 46, RemoteControlWriter.BLOCK_CMDOK, 60, 5, 20, 13};
    }

    static {
        A01();
    }

    public C2229iM(C2131gi c2131gi, C2226iI c2226iI, OE oe, AbstractC2251ik abstractC2251ik, OL ol) {
        this.A05 = c2131gi;
        this.A04 = c2226iI;
        this.A02 = oe;
        this.A01 = abstractC2251ik;
        this.A03 = ol;
    }

    @Override // com.facebook.ads.redexgen.core.OQ
    public final Bundle A5R(String str) {
        return OX.A03(str, this.A04);
    }

    @Override // com.facebook.ads.redexgen.core.OQ
    public final void A5v() {
        this.A03.A0F(2002, null);
        this.A03.A0C();
        this.A04.A02(null);
    }

    @Override // com.facebook.ads.redexgen.core.OQ
    public final int A8P() {
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
    @Override // com.facebook.ads.redexgen.core.OQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A9j(android.os.Message r10) {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2229iM.A9j(android.os.Message):void");
    }

    @Override // com.facebook.ads.redexgen.core.OQ
    public final void AJn(boolean z) {
        this.A00 = z;
    }
}
