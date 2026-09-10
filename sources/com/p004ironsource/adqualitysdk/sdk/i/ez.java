package com.p004ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes5.dex */
public final class ez extends ek {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f1948 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1949 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f1950 = 47057;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1951 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1952;

    public ez(ee eeVar, ee eeVar2, dm dmVar) {
        super(eeVar, eeVar2, dmVar);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2115(int i2, char c2, String str, String str2, String str3) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (j.f2569) {
            try {
                char[] cArr4 = (char[]) cArr3.clone();
                char[] cArr5 = (char[]) cArr.clone();
                cArr4[0] = (char) (c2 ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i2));
                int length = cArr2.length;
                char[] cArr6 = new char[length];
                j.f2567 = 0;
                while (true) {
                    int i3 = j.f2567;
                    if (i3 < length) {
                        int i4 = (i3 + 2) % 4;
                        int i5 = (i3 + 3) % 4;
                        int i6 = cArr4[i3 % 4] * 32718;
                        char c3 = cArr5[i4];
                        char c4 = (char) ((i6 + c3) % 65535);
                        j.f2568 = c4;
                        cArr5[i5] = (char) (((cArr4[i5] * 32718) + c3) / 65535);
                        cArr4[i5] = c4;
                        int i7 = j.f2567;
                        cArr6[i7] = (char) (((((long) (c4 ^ cArr2[i7])) ^ f1948) ^ ((long) f1949)) ^ ((long) f1950));
                        j.f2567 = i7 + 1;
                    } else {
                        str4 = new String(cArr6);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str4;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ef
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2089() {
        f1952 = (f1951 + 33) % 128;
        String strIntern = m2115(TextUtils.getOffsetBefore("", 0), (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 25534), "䈿ꕒ뺞鹣", "뉸\ue07b", "\u0000\u0000\u0000\u0000").intern();
        int i2 = f1951 + 27;
        f1952 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 47 / 0;
        }
        return strIntern;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ek
    /* JADX INFO: renamed from: ﻛ */
    public final boolean mo2099(int i2) {
        int i3 = (f1952 + 97) % 128;
        f1951 = i3;
        if (i2 == 0) {
            return false;
        }
        int i4 = i3 + 17;
        f1952 = i4 % 128;
        if (i4 % 2 == 0) {
            return true;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ek
    /* JADX INFO: renamed from: ﾇ */
    public final boolean mo2101(String str, String str2) {
        if (!str.equals(str2)) {
            int i2 = f1952 + 29;
            f1951 = i2 % 128;
            return i2 % 2 != 0;
        }
        int i3 = f1951 + 9;
        f1952 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 98 / 0;
        }
        return false;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ek
    /* JADX INFO: renamed from: ﻛ */
    public final boolean mo2100(Object obj, Object obj2) {
        int i2 = f1951 + 15;
        int i3 = i2 % 128;
        f1952 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (obj != obj2) {
            return true;
        }
        f1951 = (i3 + 65) % 128;
        return false;
    }
}
