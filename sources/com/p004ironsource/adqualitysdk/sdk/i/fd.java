package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;

/* JADX INFO: loaded from: classes5.dex */
public final class fd extends ef {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1971 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1972;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int[] f1973 = {157822940, 140848806, 769652177, -1918744382, -916689888, -1095108688, -105142993, -1596767769, 507829862, -844264215, -743920771, 715680362, 108893299, 632655647, -958221877, 182036771, -963384138, -84021013};

    public fd(ee eeVar, ee eeVar2, dm dmVar) {
        super(eeVar, eeVar2, dmVar);
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ef
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2089() {
        f1972 = (f1971 + 11) % 128;
        String strIntern = m2120(new int[]{-248223439, -1179483682}, Color.green(0) + 1).intern();
        int i2 = f1972 + 23;
        f1971 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 20 / 0;
        }
        return strIntern;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if ((r4 instanceof java.lang.Double) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if ((r4 instanceof java.lang.Double) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if ((r5 instanceof java.lang.Long) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if ((r4 instanceof java.lang.Long) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        return new com.p004ironsource.adqualitysdk.sdk.i.du(java.lang.Integer.valueOf(r4.intValue() + r5.intValue()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        r0 = new com.p004ironsource.adqualitysdk.sdk.i.du(java.lang.Long.valueOf(r4.longValue() + r5.longValue()));
        r4 = com.p004ironsource.adqualitysdk.sdk.i.fd.f1972 + 31;
        com.p004ironsource.adqualitysdk.sdk.i.fd.f1971 = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
    
        if ((r4 % 2) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        throw null;
     */
    @Override // com.p004ironsource.adqualitysdk.sdk.i.ee
    /* JADX INFO: renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.p004ironsource.adqualitysdk.sdk.i.du mo2050(com.p004ironsource.adqualitysdk.sdk.i.dr r4, com.p004ironsource.adqualitysdk.sdk.i.cp r5) {
        /*
            r3 = this;
            int r0 = com.p004ironsource.adqualitysdk.sdk.i.fd.f1972
            int r0 = r0 + 117
            int r0 = r0 % 128
            com.p004ironsource.adqualitysdk.sdk.i.fd.f1971 = r0
            com.ironsource.adqualitysdk.sdk.i.ee r0 = r3.m2091()
            com.ironsource.adqualitysdk.sdk.i.du r0 = r0.m2086(r4, r5)
            com.ironsource.adqualitysdk.sdk.i.ee r1 = r3.m2090()
            com.ironsource.adqualitysdk.sdk.i.du r4 = r1.m2086(r4, r5)
            java.lang.Object r5 = r0.m2043()
            boolean r5 = r5 instanceof java.lang.String
            if (r5 != 0) goto La0
            java.lang.Object r5 = r4.m2043()
            boolean r5 = r5 instanceof java.lang.String
            if (r5 == 0) goto L2a
            goto La0
        L2a:
            java.lang.Number r5 = r0.m2048()
            java.lang.Number r4 = r4.m2048()
            boolean r0 = r5 instanceof java.lang.Double
            if (r0 != 0) goto L8d
            int r0 = com.p004ironsource.adqualitysdk.sdk.i.fd.f1972
            int r0 = r0 + 59
            int r1 = r0 % 128
            com.p004ironsource.adqualitysdk.sdk.i.fd.f1971 = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L4b
            boolean r0 = r4 instanceof java.lang.Double
            r1 = 38
            int r1 = r1 / 0
            if (r0 == 0) goto L50
            goto L8d
        L4b:
            boolean r0 = r4 instanceof java.lang.Double
            if (r0 == 0) goto L50
            goto L8d
        L50:
            boolean r0 = r5 instanceof java.lang.Long
            if (r0 != 0) goto L6c
            boolean r0 = r4 instanceof java.lang.Long
            if (r0 == 0) goto L59
            goto L6c
        L59:
            com.ironsource.adqualitysdk.sdk.i.du r0 = new com.ironsource.adqualitysdk.sdk.i.du
            int r5 = r5.intValue()
            int r4 = r4.intValue()
            int r4 = r4 + r5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.<init>(r4)
            return r0
        L6c:
            com.ironsource.adqualitysdk.sdk.i.du r0 = new com.ironsource.adqualitysdk.sdk.i.du
            long r1 = r5.longValue()
            long r4 = r4.longValue()
            long r4 = r4 + r1
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r0.<init>(r4)
            int r4 = com.p004ironsource.adqualitysdk.sdk.i.fd.f1972
            int r4 = r4 + 31
            int r5 = r4 % 128
            com.p004ironsource.adqualitysdk.sdk.i.fd.f1971 = r5
            int r4 = r4 % 2
            if (r4 == 0) goto L8b
            return r0
        L8b:
            r4 = 0
            throw r4
        L8d:
            com.ironsource.adqualitysdk.sdk.i.du r0 = new com.ironsource.adqualitysdk.sdk.i.du
            double r1 = r5.doubleValue()
            double r4 = r4.doubleValue()
            double r4 = r4 + r1
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            r0.<init>(r4)
            return r0
        La0:
            com.ironsource.adqualitysdk.sdk.i.du r5 = new com.ironsource.adqualitysdk.sdk.i.du
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Object r0 = r0.m2043()
            r1.append(r0)
            java.lang.Object r4 = r4.m2043()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p004ironsource.adqualitysdk.sdk.i.fd.mo2050(com.ironsource.adqualitysdk.sdk.i.dr, com.ironsource.adqualitysdk.sdk.i.cp):com.ironsource.adqualitysdk.sdk.i.du");
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2120(int[] iArr, int i2) {
        String str;
        synchronized (d.f1586) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f1973.clone();
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
