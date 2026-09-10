package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.text.AndroidCharacter;
import android.view.ViewConfiguration;
import com.ironsource.InterfaceC0435l1;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class fy extends gb {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char f2110 = 36726;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2111 = 1;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2112 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static char f2113 = 5575;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2114 = 56351;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2115 = 40986;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final ft f2116;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final eq f2117;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final ft f2118;

    public fy(ft ftVar, ft ftVar2, eq eqVar) {
        this.f2116 = ftVar;
        this.f2118 = ftVar2;
        this.f2117 = eqVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2226(String str, int i10) {
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
                            char c10 = (char) (c4 - (((c5 + i12) ^ ((c5 << 4) + f2113)) ^ ((c5 >>> 5) + f2110)));
                            cArr3[1] = c10;
                            cArr3[0] = (char) (c5 - (((c10 >>> 5) + f2114) ^ ((c10 + i12) ^ ((c10 << 4) + f2115))));
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

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (r2.equals(r6.f2116) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        if (r2.equals(r6.f2116) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        if (r6.f2116 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        r2 = r5.f2118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        if (r2 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
    
        if (r2.equals(r6.f2118) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        if (r6.f2118 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0055, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        r5 = r5.f2117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0058, code lost:
    
        if (r5 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005a, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.fy.f2111 = (com.ironsource.adqualitysdk.sdk.i.fy.f2112 + 15) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0068, code lost:
    
        return r5.equals(r6.f2117);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006b, code lost:
    
        if (r6.f2117 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006d, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.fy.f2112
            int r0 = r0 + 41
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.fy.f2111 = r0
            r0 = 1
            if (r5 != r6) goto Lc
            return r0
        Lc:
            r1 = 0
            if (r6 == 0) goto L6e
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.fy> r2 = com.ironsource.adqualitysdk.sdk.i.fy.class
            java.lang.Class r3 = r6.getClass()
            if (r2 == r3) goto L18
            goto L6e
        L18:
            com.ironsource.adqualitysdk.sdk.i.fy r6 = (com.ironsource.adqualitysdk.sdk.i.fy) r6
            com.ironsource.adqualitysdk.sdk.i.ft r2 = r5.f2116
            if (r2 == 0) goto L3f
            int r3 = com.ironsource.adqualitysdk.sdk.i.fy.f2112
            int r3 = r3 + 83
            int r4 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.fy.f2111 = r4
            int r3 = r3 % 2
            if (r3 != 0) goto L36
            com.ironsource.adqualitysdk.sdk.i.ft r3 = r6.f2116
            boolean r2 = r2.equals(r3)
            r3 = 24
            int r3 = r3 / r1
            if (r2 != 0) goto L44
            goto L43
        L36:
            com.ironsource.adqualitysdk.sdk.i.ft r3 = r6.f2116
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L44
            goto L43
        L3f:
            com.ironsource.adqualitysdk.sdk.i.ft r2 = r6.f2116
            if (r2 == 0) goto L44
        L43:
            return r1
        L44:
            com.ironsource.adqualitysdk.sdk.i.ft r2 = r5.f2118
            if (r2 == 0) goto L51
            com.ironsource.adqualitysdk.sdk.i.ft r3 = r6.f2118
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L56
            goto L55
        L51:
            com.ironsource.adqualitysdk.sdk.i.ft r2 = r6.f2118
            if (r2 == 0) goto L56
        L55:
            return r1
        L56:
            com.ironsource.adqualitysdk.sdk.i.eq r5 = r5.f2117
            if (r5 == 0) goto L69
            int r0 = com.ironsource.adqualitysdk.sdk.i.fy.f2112
            int r0 = r0 + 15
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.fy.f2111 = r0
            com.ironsource.adqualitysdk.sdk.i.eq r6 = r6.f2117
            boolean r5 = r5.equals(r6)
            return r5
        L69:
            com.ironsource.adqualitysdk.sdk.i.eq r5 = r6.f2117
            if (r5 != 0) goto L6e
            return r0
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.fy.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode;
        f2112 = (f2111 + 99) % 128;
        ft ftVar = this.f2116;
        int iHashCode2 = 0;
        int iHashCode3 = (ftVar != null ? ftVar.hashCode() : 0) * 31;
        ft ftVar2 = this.f2118;
        if (ftVar2 != null) {
            f2112 = (f2111 + 23) % 128;
            iHashCode = ftVar2.hashCode();
        } else {
            iHashCode = 0;
        }
        int i10 = (iHashCode3 + iHashCode) * 31;
        eq eqVar = this.f2117;
        if (eqVar != null) {
            iHashCode2 = eqVar.hashCode();
        } else {
            f2111 = (f2112 + 119) % 128;
        }
        return i10 + iHashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2226("싃䏡髛霖", (Process.myPid() >> 22) + 4).intern());
        sb2.append(this.f2116);
        sb2.append(m2226("\uede5麨\ued12ꕁ䎯怇㋊\u173f", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 8).intern());
        sb2.append(this.f2117);
        sb2.append(m2226("䳍꾨", AndroidCharacter.getMirror('0') - '.').intern());
        sb2.append(this.f2118);
        String string = sb2.toString();
        int i10 = f2112 + 7;
        f2111 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 26 / 0;
        }
        return string;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gb
    /* JADX INFO: renamed from: ﻐ */
    public final ea mo2220(ee eeVar, cl clVar) {
        try {
            ft ftVar = this.f2116;
            if (ftVar != null) {
                ea eaVarM2232 = ftVar.m2232(new ee(eeVar), clVar);
                int i10 = f2111 + 9;
                f2112 = i10 % 128;
                if (i10 % 2 == 0) {
                    return eaVarM2232;
                }
                throw null;
            }
        } catch (Throwable th2) {
            eeVar.m2161(this.f2116);
            if (this.f2118 != null) {
                eeVar.m2155(this);
                HashMap map = new HashMap();
                eq eqVar = this.f2117;
                if (eqVar != null) {
                    map.put(eb.m2127(eqVar.m2189()), th2);
                    f2111 = (f2112 + InterfaceC0435l1.d.b.f29112i) % 128;
                }
                return this.f2118.m2232(new ee(map, eeVar), clVar);
            }
        }
        return new ea(null);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gb
    /* JADX INFO: renamed from: ﻐ */
    public final int mo2219(ee eeVar) {
        int i10 = f2111 + InterfaceC0435l1.d.b.f29110g;
        f2112 = i10 % 128;
        if (i10 % 2 == 0) {
            if (!eeVar.m2153(this)) {
                return this.f2116.mo2218();
            }
            int i11 = f2111 + 27;
            f2112 = i11 % 128;
            if (i11 % 2 == 0) {
                return 1;
            }
            throw null;
        }
        eeVar.m2153(this);
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gb
    /* JADX INFO: renamed from: ﻐ */
    public final int mo2218() {
        f2112 = (f2111 + 3) % 128;
        int iMo2218 = (this.f2118.mo2218() + this.f2116.mo2218()) - 1;
        int i10 = f2111 + 85;
        f2112 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 63 / 0;
        }
        return iMo2218;
    }
}
