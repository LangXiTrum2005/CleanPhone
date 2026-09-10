package com.p004ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.firebase.crashlytics.internal.model.a;

/* JADX INFO: loaded from: classes5.dex */
public class fs extends fq {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2018 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2019 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2020 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2021 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f2022 = -6269926821851505975L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private ee f2023;

    public fs(ee eeVar) {
        this.f2023 = eeVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            int i2 = f2019 + 35;
            f2018 = i2 % 128;
            return i2 % 2 != 0;
        }
        if (obj != null) {
            f2019 = (f2018 + 113) % 128;
            if (getClass() == obj.getClass()) {
                ee eeVar = this.f2023;
                ee eeVar2 = ((fs) obj).f2023;
                if (eeVar != null) {
                    return eeVar.equals(eeVar2);
                }
                if (eeVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i2 = f2018 + 63;
        int i3 = i2 % 128;
        f2019 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        ee eeVar = this.f2023;
        if (eeVar == null) {
            return 0;
        }
        int i4 = i3 + 23;
        f2018 = i4 % 128;
        int i5 = i4 % 2;
        int iHashCode = eeVar.hashCode();
        if (i5 == 0) {
            int i6 = 77 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i2 = f2019 + 61;
        f2018 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.f2023 == null) {
            return m2133((ViewConfiguration.getJumpTapTimeout() >> 16) - 868038611, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 64749), "ⵅ䋈\ueecc㋼", "ꛈ", "\udac9柘뻆꣼").intern();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2023);
        String strC = a.C(sb, m2133((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 868038612, (char) ((KeyEvent.getMaxKeyCode() >> 16) + 64750), "ⵅ䋈\ueecc㋼", "ꛈ", "\udac9柘뻆꣼"));
        int i3 = f2019 + 91;
        f2018 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 48 / 0;
        }
        return strC;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.fq
    /* JADX INFO: renamed from: ｋ */
    public du mo2122(dr drVar, cp cpVar) {
        int i2 = f2019 + 83;
        f2018 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        ee eeVar = this.f2023;
        if (eeVar == null) {
            return new du(null);
        }
        du duVarM2086 = eeVar.m2086(drVar, cpVar);
        f2018 = (f2019 + 25) % 128;
        return duVarM2086;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final ee m2134() {
        int i2 = (f2019 + 69) % 128;
        f2018 = i2;
        ee eeVar = this.f2023;
        f2019 = (i2 + 57) % 128;
        return eeVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2133(int i2, char c2, String str, String str2, String str3) {
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
                        cArr6[i7] = (char) (((((long) (c4 ^ cArr2[i7])) ^ f2022) ^ ((long) f2021)) ^ ((long) f2020));
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
