package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.google.firebase.crashlytics.internal.model.a;

/* JADX INFO: loaded from: classes5.dex */
public final class ei extends ee {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1894 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1895 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1896 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f1897 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f1898 = -9076982150857276290L;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ee f1899;

    public ei(ee eeVar, dm dmVar) {
        super(dmVar);
        this.f1899 = eeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            f1894 = (f1895 + 115) % 128;
            return true;
        }
        if (obj != null && ei.class == obj.getClass()) {
            ei eiVar = (ei) obj;
            ee eeVar = this.f1899;
            if (eeVar != null) {
                int i2 = f1894 + 5;
                f1895 = i2 % 128;
                int i3 = i2 % 2;
                boolean zEquals = eeVar.equals(eiVar.f1899);
                if (i3 != 0) {
                    int i4 = 50 / 0;
                }
                return zEquals;
            }
            if (eiVar.f1899 == null) {
                f1894 = (f1895 + 29) % 128;
                return true;
            }
            f1894 = (f1895 + 69) % 128;
        }
        return false;
    }

    public final int hashCode() {
        int i2 = f1894;
        f1895 = (i2 + 51) % 128;
        ee eeVar = this.f1899;
        if (eeVar == null) {
            int i3 = i2 + 11;
            f1895 = i3 % 128;
            if (i3 % 2 == 0) {
                return 0;
            }
            throw null;
        }
        int i4 = i2 + 5;
        f1895 = i4 % 128;
        if (i4 % 2 != 0) {
            eeVar.hashCode();
            throw null;
        }
        int iHashCode = eeVar.hashCode();
        int i5 = f1894 + 27;
        f1895 = i5 % 128;
        if (i5 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m2095(47264702 - MotionEvent.axisFromString(""), (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 655), "뾕턳輂砂", "\uf3b0", "䑾憗ᓓ興").intern());
        sb.append(this.f1899);
        String strC = a.C(sb, m2095(298434062 - Color.red(0), (char) (16179 - TextUtils.lastIndexOf("", '0', 0)), "ຉ즾㐑䰿", "\uf09b", "䑾憗ᓓ興"));
        int i2 = f1895 + 35;
        f1894 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 2 / 0;
        }
        return strC;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ee
    /* JADX INFO: renamed from: ｋ */
    public final du mo2050(dr drVar, cp cpVar) {
        int i2 = f1894 + 45;
        f1895 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f1899.m2086(drVar, cpVar);
        }
        this.f1899.m2086(drVar, cpVar);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2095(int i2, char c2, String str, String str2, String str3) {
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
                        cArr6[i7] = (char) (((((long) (c4 ^ cArr2[i7])) ^ f1898) ^ ((long) f1896)) ^ ((long) f1897));
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
}
