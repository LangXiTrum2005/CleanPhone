package com.p004ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes5.dex */
public final class dz extends ee {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1840 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f1841 = 47089;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f1842;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1843;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1844;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1845;

    public dz(String str, dm dmVar) {
        super(dmVar);
        this.f1845 = dw.m2051(str);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2070(int i2, char c2, String str, String str2, String str3) {
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
                        cArr6[i7] = (char) (((((long) (c4 ^ cArr2[i7])) ^ f1842) ^ ((long) f1843)) ^ ((long) f1841));
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            f1844 = (f1840 + 101) % 128;
            return true;
        }
        if (obj != null && dz.class == obj.getClass()) {
            String str = this.f1845;
            String str2 = ((dz) obj).f1845;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                f1840 = (f1844 + 11) % 128;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = (f1840 + 53) % 128;
        f1844 = i2;
        String str = this.f1845;
        if (str == null) {
            return 0;
        }
        int i3 = i2 + 73;
        f1840 = i3 % 128;
        if (i3 % 2 != 0) {
            return str.hashCode();
        }
        str.hashCode();
        throw null;
    }

    public final String toString() {
        int i2 = f1840;
        String str = this.f1845;
        f1844 = (i2 + 73) % 128;
        return str;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ee
    /* JADX INFO: renamed from: ｋ */
    public final du mo2050(dr drVar, cp cpVar) {
        du duVar = new du(cpVar.m1620().m794(kd.m2778(this.f1845, m2070(TextUtils.getOffsetBefore("", 0), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 16879), "捭ꔮ\uee30\uf341", "摻㽾땘톈䪯휓", "\u0000\u0000\u0000\u0000").intern())));
        f1840 = (f1844 + 109) % 128;
        return duVar;
    }
}
