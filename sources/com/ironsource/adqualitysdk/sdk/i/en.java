package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.view.View;
import com.google.android.gms.internal.measurement.f2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class en extends ef {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f1970 = 7057107540311525502L;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1971 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1972 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final ef f1973;

    public en(ef efVar) {
        this.f1973 = efVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2180(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2127) {
            try {
                char[] cArrM2229 = g.m2229(f1970, cArr, i10);
                g.f2129 = 4;
                while (true) {
                    int i11 = g.f2129;
                    if (i11 < cArrM2229.length) {
                        int i12 = i11 - 4;
                        g.f2128 = i12;
                        cArrM2229[i11] = (char) (((long) (cArrM2229[i11] ^ cArrM2229[i11 % 4])) ^ (((long) i12) * f1970));
                        g.f2129 = i11 + 1;
                    } else {
                        str2 = new String(cArrM2229, 4, cArrM2229.length - 4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.en.class == r5.getClass()) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        r5 = (com.ironsource.adqualitysdk.sdk.i.en) r5;
        r4 = r4.f1973;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        if (r4 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        return r4.equals(r5.f1973);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        if (r5.f1973 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        r4 = com.ironsource.adqualitysdk.sdk.i.en.f1972 + 21;
        com.ironsource.adqualitysdk.sdk.i.en.f1971 = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        if ((r4 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
    
        r4 = com.ironsource.adqualitysdk.sdk.i.en.f1972 + com.ironsource.InterfaceC0435l1.d.b.f29112i;
        com.ironsource.adqualitysdk.sdk.i.en.f1971 = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if ((r4 % 2) != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0050, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        if (r4 == r5) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r4 == r5) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        if (r5 == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.en.f1972
            int r0 = r0 + 73
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.en.f1971 = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L14
            r0 = 23
            int r0 = r0 / r2
            if (r4 != r5) goto L17
            goto L16
        L14:
            if (r4 != r5) goto L17
        L16:
            return r1
        L17:
            if (r5 == 0) goto L50
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.en> r0 = com.ironsource.adqualitysdk.sdk.i.en.class
            java.lang.Class r3 = r5.getClass()
            if (r0 == r3) goto L22
            goto L50
        L22:
            com.ironsource.adqualitysdk.sdk.i.en r5 = (com.ironsource.adqualitysdk.sdk.i.en) r5
            com.ironsource.adqualitysdk.sdk.i.ef r4 = r4.f1973
            if (r4 == 0) goto L2f
            com.ironsource.adqualitysdk.sdk.i.ef r5 = r5.f1973
            boolean r4 = r4.equals(r5)
            return r4
        L2f:
            com.ironsource.adqualitysdk.sdk.i.ef r4 = r5.f1973
            if (r4 != 0) goto L41
            int r4 = com.ironsource.adqualitysdk.sdk.i.en.f1972
            int r4 = r4 + 21
            int r5 = r4 % 128
            com.ironsource.adqualitysdk.sdk.i.en.f1971 = r5
            int r4 = r4 % 2
            if (r4 == 0) goto L40
            return r2
        L40:
            return r1
        L41:
            int r4 = com.ironsource.adqualitysdk.sdk.i.en.f1972
            int r4 = r4 + 111
            int r5 = r4 % 128
            com.ironsource.adqualitysdk.sdk.i.en.f1971 = r5
            int r4 = r4 % 2
            if (r4 != 0) goto L4e
            return r2
        L4e:
            r4 = 0
            throw r4
        L50:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.en.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        ef efVar = this.f1973;
        if (efVar == null) {
            f1972 = (f1971 + 85) % 128;
            return 0;
        }
        int iHashCode = efVar.hashCode();
        f1971 = (f1972 + 95) % 128;
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2180("ゾゖ頾贫⋈", Color.green(0)).intern());
        sb2.append(this.f1973);
        String strM = f2.m(sb2, m2180("ણઊ癠밌\uf541", View.resolveSizeAndState(0, 0, 0)));
        f1971 = (f1972 + 95) % 128;
        return strM;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* JADX INFO: renamed from: ｋ */
    public final ea mo2164(ee eeVar, cl clVar) {
        f1971 = (f1972 + 19) % 128;
        ea eaVarM2165 = this.f1973.m2165(eeVar, clVar);
        f1971 = (f1972 + 23) % 128;
        return eaVarM2165;
    }
}
