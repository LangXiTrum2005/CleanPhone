package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ek extends ef {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1948 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static char f1949 = 55060;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1950 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f1951 = 57892;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f1952 = 533;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f1953 = 58620;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final ef f1954;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final String f1955;

    public ek(ef efVar, String str) {
        this.f1954 = efVar;
        this.f1955 = str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2171(String str, int i10) {
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
                            char c10 = (char) (c4 - (((c5 + i12) ^ ((c5 << 4) + f1951)) ^ ((c5 >>> 5) + f1949)));
                            cArr3[1] = c10;
                            cArr3[0] = (char) (c5 - (((c10 >>> 5) + f1953) ^ ((c10 + i12) ^ ((c10 << 4) + f1952))));
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

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r5.f1954 != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L51
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.ek> r2 = com.ironsource.adqualitysdk.sdk.i.ek.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L51
        L10:
            com.ironsource.adqualitysdk.sdk.i.ek r5 = (com.ironsource.adqualitysdk.sdk.i.ek) r5
            com.ironsource.adqualitysdk.sdk.i.ef r2 = r4.f1954
            if (r2 == 0) goto L2f
            int r3 = com.ironsource.adqualitysdk.sdk.i.ek.f1950
            int r3 = r3 + 31
            int r3 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.ek.f1948 = r3
            com.ironsource.adqualitysdk.sdk.i.ef r3 = r5.f1954
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L34
            int r4 = com.ironsource.adqualitysdk.sdk.i.ek.f1950
            int r4 = r4 + 49
            int r4 = r4 % 128
            com.ironsource.adqualitysdk.sdk.i.ek.f1948 = r4
            goto L33
        L2f:
            com.ironsource.adqualitysdk.sdk.i.ef r2 = r5.f1954
            if (r2 == 0) goto L34
        L33:
            return r1
        L34:
            java.lang.String r4 = r4.f1955
            if (r4 == 0) goto L3f
            java.lang.String r5 = r5.f1955
            boolean r4 = r4.equals(r5)
            return r4
        L3f:
            java.lang.String r4 = r5.f1955
            if (r4 != 0) goto L51
            int r4 = com.ironsource.adqualitysdk.sdk.i.ek.f1950
            int r4 = r4 + 29
            int r5 = r4 % 128
            com.ironsource.adqualitysdk.sdk.i.ek.f1948 = r5
            int r4 = r4 % 2
            if (r4 == 0) goto L50
            return r1
        L50:
            return r0
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ek.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    public final int hashCode() {
        int iHashCode;
        int i10 = f1948 + 43;
        f1950 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 54 / 0;
            if (this.f1954 != null) {
                iHashCode = this.f1954.hashCode();
            } else {
                iHashCode = 0;
            }
        } else if (this.f1954 != null) {
            iHashCode = this.f1954.hashCode();
        } else {
            iHashCode = 0;
        }
        int i12 = iHashCode * 31;
        String str = this.f1955;
        int iHashCode2 = i12 + (str != null ? str.hashCode() : 0);
        f1948 = (f1950 + 23) % 128;
        return iHashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1954.toString());
        sb2.append(m2171("讪\ue6ee", 1 - (ViewConfiguration.getTouchSlop() >> 8)).intern());
        sb2.append(this.f1955);
        String string = sb2.toString();
        int i10 = f1950 + 93;
        f1948 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 12 / 0;
        }
        return string;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* JADX INFO: renamed from: ｋ */
    public final ea mo2164(ee eeVar, cl clVar) {
        f1950 = (f1948 + 125) % 128;
        Object objM2124 = this.f1954.m2165(eeVar, clVar).m2124();
        if (!(objM2124 instanceof cl)) {
            try {
                return new ea(objM2124.getClass().getDeclaredField(this.f1955).get(objM2124));
            } catch (Exception unused) {
                return new ea(null);
            }
        }
        ea eaVar = new ea(((cl) objM2124).m1648(this.f1955));
        f1948 = (f1950 + 21) % 128;
        return eaVar;
    }
}
