package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.InterfaceC0435l1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ej extends ef {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char f1940 = 36955;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1941 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1942 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f1943 = 63898;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f1944 = 53261;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f1945 = 55212;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final eq f1946;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final ef f1947;

    public ej(eq eqVar, ef efVar) {
        this.f1946 = eqVar;
        this.f1947 = efVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2169(String str, int i10) {
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
                            char c10 = (char) (c4 - (((c5 + i12) ^ ((c5 << 4) + f1943)) ^ ((c5 >>> 5) + f1940)));
                            cArr3[1] = c10;
                            cArr3[0] = (char) (c5 - (((c10 >>> 5) + f1945) ^ ((c10 + i12) ^ ((c10 << 4) + f1944))));
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            int i10 = f1941 + InterfaceC0435l1.d.b.f29107d;
            f1942 = i10 % 128;
            if (i10 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (obj != null && ej.class == obj.getClass()) {
            ej ejVar = (ej) obj;
            eq eqVar = this.f1946;
            if (eqVar == null ? ejVar.f1946 != null : !eqVar.equals(ejVar.f1946)) {
                int i11 = f1941 + 67;
                f1942 = i11 % 128;
                if (i11 % 2 == 0) {
                    return false;
                }
                throw null;
            }
            ef efVar = this.f1947;
            if (efVar != null) {
                return efVar.equals(ejVar.f1947);
            }
            if (ejVar.f1947 == null) {
                int i12 = f1942 + InterfaceC0435l1.d.b.f29110g;
                f1941 = i12 % 128;
                return i12 % 2 != 0;
            }
        }
        return false;
    }

    public final int hashCode() {
        eq eqVar = this.f1946;
        int iHashCode = 0;
        int iHashCode2 = (eqVar != null ? eqVar.hashCode() : 0) * 31;
        ef efVar = this.f1947;
        if (efVar != null) {
            int i10 = f1942 + 59;
            f1941 = i10 % 128;
            if (i10 % 2 == 0) {
                efVar.hashCode();
                throw null;
            }
            iHashCode = efVar.hashCode();
            f1941 = (f1942 + 77) % 128;
        }
        return iHashCode2 + iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1946);
        sb2.append(m2169("싗㸹틄\uda65", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 4).intern());
        sb2.append(this.f1947);
        String string = sb2.toString();
        f1941 = (f1942 + 121) % 128;
        return string;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final eq m2170() {
        int i10 = (f1942 + 83) % 128;
        f1941 = i10;
        eq eqVar = this.f1946;
        int i11 = i10 + 1;
        f1942 = i11 % 128;
        if (i11 % 2 == 0) {
            return eqVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* JADX INFO: renamed from: ｋ */
    public final ea mo2164(ee eeVar, cl clVar) {
        f1941 = (f1942 + 7) % 128;
        ea eaVarM2165 = this.f1947.m2165(eeVar, clVar);
        eeVar.m2152(this.f1946.m2189(), eaVarM2165.m2124());
        f1942 = (f1941 + 41) % 128;
        return eaVarM2165;
    }
}
