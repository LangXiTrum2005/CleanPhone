package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.measurement.f2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ep extends ef {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1979 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int[] f1980 = {1411768817, -225482512, 825996846, 1744057012, 1439915563, -1052891097, -878539719, 1876767303, 2063845712, 439803141, -88386540, -365978611, -1779319978, -434864079, 1312932671, 1362236437, -197087216, -1125826107};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1981 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final ef f1982;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final ef f1983;

    public ep(ef efVar, ef efVar2) {
        this.f1983 = efVar;
        this.f1982 = efVar2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2185(int[] iArr, int i10) {
        String str;
        synchronized (a.f61) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f1980.clone();
                a.f58 = 0;
                while (true) {
                    int i11 = a.f58;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        char c4 = (char) (i12 >> 16);
                        cArr[0] = c4;
                        char c5 = (char) i12;
                        cArr[1] = c5;
                        char c10 = (char) (iArr[i11 + 1] >> 16);
                        cArr[2] = c10;
                        char c11 = (char) iArr[i11 + 1];
                        cArr[3] = c11;
                        a.f59 = (c4 << 16) + c5;
                        a.f60 = (c10 << 16) + c11;
                        a.m199(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = a.f59 ^ iArr2[i13];
                            a.f59 = i14;
                            int iM200 = a.m200(i14) ^ a.f60;
                            int i15 = a.f59;
                            a.f59 = iM200;
                            a.f60 = i15;
                        }
                        int i16 = a.f59;
                        int i17 = a.f60;
                        a.f59 = i17;
                        a.f60 = i16;
                        int i18 = i16 ^ iArr2[16];
                        a.f60 = i18;
                        int i19 = i17 ^ iArr2[17];
                        a.f59 = i19;
                        cArr[0] = (char) (i19 >>> 16);
                        cArr[1] = (char) i19;
                        cArr[2] = (char) (i18 >>> 16);
                        cArr[3] = (char) i18;
                        a.m199(iArr2);
                        int i20 = a.f58;
                        cArr2[i20 << 1] = cArr[0];
                        cArr2[(i20 << 1) + 1] = cArr[1];
                        cArr2[(i20 << 1) + 2] = cArr[2];
                        cArr2[(i20 << 1) + 3] = cArr[3];
                        a.f58 = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r5.f1983 != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L4d
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L4d
        L12:
            com.ironsource.adqualitysdk.sdk.i.ep r5 = (com.ironsource.adqualitysdk.sdk.i.ep) r5
            com.ironsource.adqualitysdk.sdk.i.ef r2 = r4.f1983
            if (r2 == 0) goto L29
            com.ironsource.adqualitysdk.sdk.i.ef r3 = r5.f1983
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2e
            int r4 = com.ironsource.adqualitysdk.sdk.i.ep.f1979
            int r4 = r4 + 75
            int r4 = r4 % 128
            com.ironsource.adqualitysdk.sdk.i.ep.f1981 = r4
            goto L2d
        L29:
            com.ironsource.adqualitysdk.sdk.i.ef r2 = r5.f1983
            if (r2 == 0) goto L2e
        L2d:
            return r1
        L2e:
            com.ironsource.adqualitysdk.sdk.i.ef r4 = r4.f1982
            if (r4 == 0) goto L39
            com.ironsource.adqualitysdk.sdk.i.ef r5 = r5.f1982
            boolean r4 = r4.equals(r5)
            return r4
        L39:
            com.ironsource.adqualitysdk.sdk.i.ef r4 = r5.f1982
            if (r4 != 0) goto L3e
            return r0
        L3e:
            int r4 = com.ironsource.adqualitysdk.sdk.i.ep.f1979
            int r4 = r4 + 59
            int r5 = r4 % 128
            com.ironsource.adqualitysdk.sdk.i.ep.f1981 = r5
            int r4 = r4 % 2
            if (r4 == 0) goto L4b
            return r1
        L4b:
            r4 = 0
            throw r4
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ep.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i10 = f1979 + 9;
        f1981 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        ef efVar = this.f1983;
        int iHashCode = 0;
        int iHashCode2 = (efVar != null ? efVar.hashCode() : 0) * 31;
        ef efVar2 = this.f1982;
        if (efVar2 != null) {
            int i11 = f1979 + 63;
            f1981 = i11 % 128;
            if (i11 % 2 == 0) {
                efVar2.hashCode();
                throw null;
            }
            iHashCode = efVar2.hashCode();
            f1979 = (f1981 + 125) % 128;
        }
        return iHashCode2 + iHashCode;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2187().toString());
        sb2.append(m2185(new int[]{-1818049716, -461078107}, 1 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern());
        sb2.append(m2186().toString());
        String strM = f2.m(sb2, m2185(new int[]{-204645904, 125839984}, 1 - Color.red(0)));
        int i10 = f1979 + 1;
        f1981 = i10 % 128;
        if (i10 % 2 != 0) {
            return strM;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final ef m2186() {
        int i10 = f1981;
        int i11 = i10 + 41;
        f1979 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        ef efVar = this.f1982;
        f1979 = (i10 + 77) % 128;
        return efVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final ef m2187() {
        int i10 = f1981 + 89;
        int i11 = i10 % 128;
        f1979 = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        ef efVar = this.f1983;
        f1981 = (i11 + 87) % 128;
        return efVar;
    }
}
