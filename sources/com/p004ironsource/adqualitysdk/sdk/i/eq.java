package com.p004ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes5.dex */
public final class eq extends eo {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1920 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int[] f1921 = {797656759, 1562401224, 1784676952, 735941736, 1706411476, -182344892, 1896746434, -1455156712, 1431824416, 1593043335, 3458233, 674547778, 776961446, -327616408, 1079281396, 1927882278, 1075014869, -1975634407};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1922;

    public eq(ee eeVar, ee eeVar2, dm dmVar) {
        super(eeVar, eeVar2, dmVar);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2108(int[] iArr, int i2) {
        String str;
        synchronized (d.f1586) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f1921.clone();
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

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ef
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2089() {
        f1922 = (f1920 + 87) % 128;
        String strIntern = m2108(new int[]{242588460, 632900173}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3).intern();
        f1920 = (f1922 + 113) % 128;
        return strIntern;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        if (r4 >= 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r4 >= 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        com.p004ironsource.adqualitysdk.sdk.i.eq.f1920 = (r1 + 17) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        return true;
     */
    @Override // com.p004ironsource.adqualitysdk.sdk.i.ek
    /* JADX INFO: renamed from: ﻛ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo2099(int r4) {
        /*
            r3 = this;
            int r0 = com.p004ironsource.adqualitysdk.sdk.i.eq.f1920
            int r0 = r0 + 53
            int r1 = r0 % 128
            com.p004ironsource.adqualitysdk.sdk.i.eq.f1922 = r1
            int r0 = r0 % 2
            r2 = 0
            if (r0 == 0) goto L13
            r0 = 25
            int r0 = r0 / r2
            if (r4 < 0) goto L1d
            goto L15
        L13:
            if (r4 < 0) goto L1d
        L15:
            int r1 = r1 + 17
            int r1 = r1 % 128
            com.p004ironsource.adqualitysdk.sdk.i.eq.f1920 = r1
            r4 = 1
            return r4
        L1d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p004ironsource.adqualitysdk.sdk.i.eq.mo2099(int):boolean");
    }
}
