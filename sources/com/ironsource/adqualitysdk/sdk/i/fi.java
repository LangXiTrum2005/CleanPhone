package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class fi extends ev {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2054 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2055 = 17952;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2056 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f2057 = 26119;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2058 = 6769;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2059 = 13712;

    public fi(ef efVar, ef efVar2) {
        super(efVar, efVar2);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2209(String str, int i10) {
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
                            char c10 = (char) (c4 - (((c5 + i12) ^ ((c5 << 4) + f2059)) ^ ((c5 >>> 5) + f2057)));
                            cArr3[1] = c10;
                            cArr3[0] = (char) (c5 - (((c10 >>> 5) + f2058) ^ ((c10 + i12) ^ ((c10 << 4) + f2055))));
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

    @Override // com.ironsource.adqualitysdk.sdk.i.ev
    /* JADX INFO: renamed from: ｋ */
    public final boolean mo2195(Object obj, Object obj2) {
        int i10 = (f2054 + 51) % 128;
        f2056 = i10;
        if (obj == obj2) {
            return false;
        }
        int i11 = i10 + 77;
        f2054 = i11 % 128;
        if (i11 % 2 != 0) {
            return true;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ev
    /* JADX INFO: renamed from: ﾇ */
    public final boolean mo2196(String str, String str2) {
        if (str.equals(str2)) {
            return false;
        }
        int i10 = (f2056 + 61) % 128;
        f2054 = i10;
        f2056 = (i10 + 7) % 128;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ev
    /* JADX INFO: renamed from: ﾒ */
    public final boolean mo2197(int i10) {
        int i11 = f2056;
        int i12 = i11 + 71;
        f2054 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        if (i10 == 0) {
            return false;
        }
        int i13 = i11 + 123;
        f2054 = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 13 / 0;
        }
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.em
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2179() {
        f2056 = (f2054 + 107) % 128;
        String strIntern = m2209("胋嗩", 2 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern();
        int i10 = f2056 + 1;
        f2054 = i10 % 128;
        if (i10 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }
}
