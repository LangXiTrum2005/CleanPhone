package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class fe extends eu {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2037 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2038 = 17475;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2039 = 61506;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f2040 = 38465;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2041 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2042 = 9891;

    public fe(ef efVar, ef efVar2) {
        super(efVar, efVar2);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.em
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2179() {
        int i10 = f2041 + 87;
        f2037 = i10 % 128;
        return m2205("㻡칇", i10 % 2 == 0 ? TextUtils.indexOf("", "", 0) + 5 : 2 - TextUtils.indexOf("", "", 0)).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ev
    /* JADX INFO: renamed from: ﾒ */
    public final boolean mo2197(int i10) {
        int i11 = f2041;
        int i12 = i11 + 53;
        f2037 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        if (i10 <= 0) {
            return true;
        }
        int i13 = i11 + 69;
        f2037 = i13 % 128;
        if (i13 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2205(String str, int i10) {
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
                            char c10 = (char) (c4 - (((c5 + i12) ^ ((c5 << 4) + f2039)) ^ ((c5 >>> 5) + f2042)));
                            cArr3[1] = c10;
                            cArr3[0] = (char) (c5 - (((c10 >>> 5) + f2038) ^ ((c10 + i12) ^ ((c10 << 4) + f2040))));
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
}
