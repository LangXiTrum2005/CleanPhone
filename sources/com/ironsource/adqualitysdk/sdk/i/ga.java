package com.ironsource.adqualitysdk.sdk.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ga extends fz {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2130 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2131 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2132 = 15007;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f2133 = 55264;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2134 = 32091;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2135 = 60808;

    public ga(ef efVar) {
        super(efVar);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2230(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (o.f3076) {
            try {
                char[] cArr2 = new char[cArr.length];
                o.f3077 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i11 = o.f3077;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c4 = cArr3[1];
                            char c5 = cArr3[0];
                            char c10 = (char) (c4 - (((c5 + i12) ^ ((c5 << 4) + f2134)) ^ ((c5 >>> 5) + f2132)));
                            cArr3[1] = c10;
                            cArr3[0] = (char) (c5 - (((c10 >>> 5) + f2135) ^ ((c10 + i12) ^ ((c10 << 4) + f2133))));
                            i12 -= 40503;
                        }
                        int i14 = o.f3077;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        o.f3077 = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004c, code lost:
    
        if ((r0 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        r3 = m2230("ऒ₎朽\udfc2㜄魃ꏻ踉", android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 7).intern();
        com.ironsource.adqualitysdk.sdk.i.ga.f2131 = (com.ironsource.adqualitysdk.sdk.i.ga.f2130 + com.ironsource.InterfaceC0435l1.d.b.f29110g) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (m2228() != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (m2228() != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        r0 = new java.lang.StringBuilder();
        r0.append(m2230("ऒ₎朽\udfc2㜄魃ႏண", 7 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern());
        r0.append(super.toString());
        r3 = r0.toString();
        r0 = com.ironsource.adqualitysdk.sdk.i.ga.f2131 + 117;
        com.ironsource.adqualitysdk.sdk.i.ga.f2130 = r0 % 128;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.fz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r3 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.ga.f2131
            int r0 = r0 + 87
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ga.f2130 = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L17
            com.ironsource.adqualitysdk.sdk.i.ef r0 = r3.m2228()
            r2 = 58
            int r2 = r2 / r1
            if (r0 == 0) goto L51
            goto L1d
        L17:
            com.ironsource.adqualitysdk.sdk.i.ef r0 = r3.m2228()
            if (r0 == 0) goto L51
        L1d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = android.view.ViewConfiguration.getMinimumFlingVelocity()
            int r1 = r1 >> 16
            int r1 = 7 - r1
            java.lang.String r2 = "ऒ₎朽\udfc2㜄魃ႏண"
            java.lang.String r1 = m2230(r2, r1)
            java.lang.String r1 = r1.intern()
            r0.append(r1)
            java.lang.String r3 = super.toString()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            int r0 = com.ironsource.adqualitysdk.sdk.i.ga.f2131
            int r0 = r0 + 117
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ga.f2130 = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L4f
            return r3
        L4f:
            r3 = 0
            throw r3
        L51:
            int r3 = android.graphics.drawable.Drawable.resolveOpacity(r1, r1)
            int r3 = r3 + 7
            java.lang.String r0 = "ऒ₎朽\udfc2㜄魃ꏻ踉"
            java.lang.String r3 = m2230(r0, r3)
            java.lang.String r3 = r3.intern()
            int r0 = com.ironsource.adqualitysdk.sdk.i.ga.f2130
            int r0 = r0 + 109
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ga.f2131 = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ga.toString():java.lang.String");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fz, com.ironsource.adqualitysdk.sdk.i.gb
    /* JADX INFO: renamed from: ﻐ */
    public final ea mo2220(ee eeVar, cl clVar) {
        ea eaVarMo2220;
        int i10 = f2130 + 73;
        f2131 = i10 % 128;
        if (i10 % 2 != 0) {
            eaVarMo2220 = super.mo2220(eeVar, clVar);
            eaVarMo2220.m2123(false);
        } else {
            eaVarMo2220 = super.mo2220(eeVar, clVar);
            eaVarMo2220.m2123(true);
        }
        int i11 = f2131 + 69;
        f2130 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 43 / 0;
        }
        return eaVarMo2220;
    }
}
