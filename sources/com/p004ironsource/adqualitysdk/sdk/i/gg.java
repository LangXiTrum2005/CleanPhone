package com.p004ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.view.ViewConfiguration;
import io.bidmachine.BidMachine;

/* JADX INFO: loaded from: classes5.dex */
public final class gg extends gi {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int[] f2090 = {1580033455, -1826060177, 1303643798, -1204573656, -59520090, 596212055, 540757174, 817319823, -206749844, 1933460606, -876767580, -1671368541, 255193907, 2047951978, 2003472233, 808431614, -1053883232, 1015266156};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2091 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2092;

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2138() {
        int i2 = f2091 + 113;
        f2092 = i2 % 128;
        int[] iArr = {-2033005804, -564609164, -760683524, -1479076214, -1879828469, -351045342, 283195529, 523624329, -1639578310, 1924544090, 1272289186, 842186065};
        return (i2 % 2 != 0 ? m2154(iArr, (Process.myTid() / 58) * 80) : m2154(iArr, (Process.myTid() >> 22) + 24)).intern();
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2139() {
        int i2 = f2091 + 65;
        f2092 = i2 % 128;
        int[] iArr = {-1470622330, -1172998804, -1957802814, 659705156, 1763368839, -381090811};
        return (i2 % 2 != 0 ? m2154(iArr, (ViewConfiguration.getTapTimeout() - 66) * 7) : m2154(iArr, (ViewConfiguration.getTapTimeout() >> 16) + 10)).intern();
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2140() {
        int i2 = f2091 + 73;
        int i3 = i2 % 128;
        f2092 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        f2091 = (i3 + 29) % 128;
        return BidMachine.class;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﾇ */
    public final bg mo2141() {
        bl blVar = new bl(mo2139());
        int i2 = f2091 + 75;
        f2092 = i2 % 128;
        if (i2 % 2 == 0) {
            return blVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2154(int[] iArr, int i2) {
        String str;
        synchronized (d.f1586) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2090.clone();
                d.f1584 = 0;
                while (true) {
                    int i3 = d.f1584;
                    if (i3 < iArr.length) {
                        int i4 = iArr[i3];
                        char c2 = (char) (i4 >> 16);
                        cArr[0] = c2;
                        char c3 = (char) i4;
                        cArr[1] = c3;
                        char c4 = (char) (iArr[i3 + 1] >> 16);
                        cArr[2] = c4;
                        char c5 = (char) iArr[i3 + 1];
                        cArr[3] = c5;
                        d.f1587 = (c2 << 16) + c3;
                        d.f1585 = (c4 << 16) + c5;
                        d.m1788(iArr2);
                        for (int i5 = 0; i5 < 16; i5++) {
                            int i6 = d.f1587 ^ iArr2[i5];
                            d.f1587 = i6;
                            int iM1787 = d.m1787(i6) ^ d.f1585;
                            int i7 = d.f1587;
                            d.f1587 = iM1787;
                            d.f1585 = i7;
                        }
                        int i8 = d.f1587;
                        int i9 = d.f1585;
                        d.f1587 = i9;
                        d.f1585 = i8;
                        int i10 = i8 ^ iArr2[16];
                        d.f1585 = i10;
                        int i11 = i9 ^ iArr2[17];
                        d.f1587 = i11;
                        cArr[0] = (char) (i11 >>> 16);
                        cArr[1] = (char) i11;
                        cArr[2] = (char) (i10 >>> 16);
                        cArr[3] = (char) i10;
                        d.m1788(iArr2);
                        int i12 = d.f1584;
                        cArr2[i12 << 1] = cArr[0];
                        cArr2[(i12 << 1) + 1] = cArr[1];
                        cArr2[(i12 << 1) + 2] = cArr[2];
                        cArr2[(i12 << 1) + 3] = cArr[3];
                        d.f1584 = i12 + 2;
                    } else {
                        str = new String(cArr2, 0, i2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
