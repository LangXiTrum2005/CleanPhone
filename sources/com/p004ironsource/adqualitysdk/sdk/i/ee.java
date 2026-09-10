package com.p004ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.text.TextUtils;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ee {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1871 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1872 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f1873 = 16001;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f1874 = 10835;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f1875 = 20394;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f1876 = 34640;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private dm f1877;

    public ee(dm dmVar) {
        this.f1877 = dmVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static String m2084(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        int length = objArr.length;
        f1871 = (f1872 + 23) % 128;
        int i2 = 0;
        boolean z2 = true;
        while (i2 < length) {
            f1872 = (f1871 + 59) % 128;
            Object obj = objArr[i2];
            if (!z2) {
                sb.append(m2083("\u07b9\ueb43", 2 - TextUtils.indexOf("", "")).intern());
            }
            if (obj instanceof String) {
                sb.append(m2083("歘\uee84", -MotionEvent.axisFromString("")).intern());
                sb.append(obj);
                sb.append(m2083("歘\uee84", -Process.getGidForName("")).intern());
            } else {
                sb.append(obj);
                f1871 = (f1872 + 25) % 128;
            }
            i2++;
            z2 = false;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ｋ */
    public abstract du mo2050(dr drVar, cp cpVar);

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m2085() {
        f1871 = (f1872 + 95) % 128;
        if (this.f1877 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m2083("肕愹᱅䀷䘩짖Ḥ뚔矦ꢕ頜都", 10 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern());
        sb.append(this.f1877);
        String string = sb.toString();
        f1872 = (f1871 + 63) % 128;
        return string;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final du m2086(dr drVar, cp cpVar) {
        du duVarMo2050;
        ee eeVar = this;
        while (true) {
            duVarMo2050 = eeVar.mo2050(drVar, cpVar);
            if (duVarMo2050 == null) {
                break;
            }
            int i2 = f1871 + 9;
            f1872 = i2 % 128;
            if (i2 % 2 != 0) {
                boolean z2 = duVarMo2050.m2043() instanceof ee;
                throw null;
            }
            if (!(duVarMo2050.m2043() instanceof ee)) {
                break;
            }
            eeVar = (ee) duVarMo2050.m2043();
        }
        f1872 = (f1871 + 7) % 128;
        return duVarMo2050;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final int m2087() {
        int i2 = f1871 + 99;
        f1872 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        dm dmVar = this.f1877;
        if (dmVar == null) {
            return -1;
        }
        int iM1951 = dmVar.m1951();
        int i3 = f1872 + 107;
        f1871 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 37 / 0;
        }
        return iM1951;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2083(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (m.f2870) {
            try {
                char[] cArr2 = new char[cArr.length];
                m.f2869 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i3 = m.f2869;
                    if (i3 < cArr.length) {
                        cArr3[0] = cArr[i3];
                        cArr3[1] = cArr[i3 + 1];
                        int i4 = 58224;
                        for (int i5 = 0; i5 < 16; i5++) {
                            char c2 = cArr3[1];
                            char c3 = cArr3[0];
                            char c4 = (char) (c2 - (((c3 + i4) ^ ((c3 << 4) + f1875)) ^ ((c3 >>> 5) + f1874)));
                            cArr3[1] = c4;
                            cArr3[0] = (char) (c3 - (((c4 >>> 5) + f1876) ^ ((c4 + i4) ^ ((c4 << 4) + f1873))));
                            i4 -= 40503;
                        }
                        int i6 = m.f2869;
                        cArr2[i6] = cArr3[0];
                        cArr2[i6 + 1] = cArr3[1];
                        m.f2869 = i6 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}
