package com.ironsource.adqualitysdk.sdk.i;

import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class fl extends em {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2063 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2064 = {'N', 156};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2065;

    public fl(ef efVar, ef efVar2) {
        super(efVar, efVar2);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2211(String str, int[] iArr, boolean z10) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (h.f2261) {
            try {
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                char[] cArr = new char[i11];
                System.arraycopy(f2064, i10, cArr, 0, i11);
                if (bArr != null) {
                    char[] cArr2 = new char[i11];
                    h.f2262 = 0;
                    char c4 = 0;
                    while (true) {
                        int i14 = h.f2262;
                        if (i14 >= i11) {
                            break;
                        }
                        if (bArr[i14] == 1) {
                            cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c4);
                        } else {
                            cArr2[i14] = (char) ((cArr[i14] << 1) - c4);
                        }
                        c4 = cArr2[i14];
                        h.f2262 = i14 + 1;
                    }
                    cArr = cArr2;
                }
                if (i13 > 0) {
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr, 0, cArr3, 0, i11);
                    int i15 = i11 - i13;
                    System.arraycopy(cArr3, 0, cArr, i15, i13);
                    System.arraycopy(cArr3, i13, cArr, 0, i15);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    h.f2262 = 0;
                    while (true) {
                        int i16 = h.f2262;
                        if (i16 >= i11) {
                            break;
                        }
                        cArr4[i16] = cArr[(i11 - i16) - 1];
                        h.f2262 = i16 + 1;
                    }
                    cArr = cArr4;
                }
                if (i12 > 0) {
                    h.f2262 = 0;
                    while (true) {
                        int i17 = h.f2262;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr[i17] = (char) (cArr[i17] - iArr[2]);
                        h.f2262 = i17 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        return m2178().m2165(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r0.m2125() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r0.m2125() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.fl.f2063 = (com.ironsource.adqualitysdk.sdk.i.fl.f2065 + 73) % 128;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* JADX INFO: renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.ironsource.adqualitysdk.sdk.i.ea mo2164(com.ironsource.adqualitysdk.sdk.i.ee r4, com.ironsource.adqualitysdk.sdk.i.cl r5) {
        /*
            r3 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.fl.f2065
            int r0 = r0 + 75
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.fl.f2063 = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L1f
            com.ironsource.adqualitysdk.sdk.i.ef r0 = r3.m2177()
            com.ironsource.adqualitysdk.sdk.i.ea r0 = r0.m2165(r4, r5)
            boolean r1 = r0.m2125()
            r2 = 34
            int r2 = r2 / 0
            if (r1 == 0) goto L36
            goto L2d
        L1f:
            com.ironsource.adqualitysdk.sdk.i.ef r0 = r3.m2177()
            com.ironsource.adqualitysdk.sdk.i.ea r0 = r0.m2165(r4, r5)
            boolean r1 = r0.m2125()
            if (r1 == 0) goto L36
        L2d:
            int r3 = com.ironsource.adqualitysdk.sdk.i.fl.f2065
            int r3 = r3 + 73
            int r3 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.fl.f2063 = r3
            return r0
        L36:
            com.ironsource.adqualitysdk.sdk.i.ef r3 = r3.m2178()
            com.ironsource.adqualitysdk.sdk.i.ea r3 = r3.m2165(r4, r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.fl.mo2164(com.ironsource.adqualitysdk.sdk.i.ee, com.ironsource.adqualitysdk.sdk.i.cl):com.ironsource.adqualitysdk.sdk.i.ea");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.em
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2179() {
        f2065 = (f2063 + 59) % 128;
        String strIntern = m2211("\u0000\u0000", new int[]{0, 2, 32, 2}, false).intern();
        f2065 = (f2063 + 125) % 128;
        return strIntern;
    }
}
