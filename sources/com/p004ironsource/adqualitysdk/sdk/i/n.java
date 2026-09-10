package com.p004ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.util.Log;
import com.google.firebase.crashlytics.internal.model.a;
import com.p004ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes5.dex */
public final class n {

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2871 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f2872 = true;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2873 = 254;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2874 = {264, 327, 368, 365, 364, 337, 371, 353, 355, 286, 319, 354, 335, 351, 362, 359, 370, 375, 312};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f2875 = true;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2876;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static void m2825(String str, String str2) {
        f2876 = (f2871 + 37) % 128;
        m2836(str, str, str2);
        int i2 = f2871 + 77;
        f2876 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 67 / 0;
        }
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static void m2826(String str, String str2) {
        int i2 = f2876 + 51;
        f2871 = i2 % 128;
        int i3 = i2 % 2;
        m2841(str, str2, null);
        if (i3 == 0) {
            throw null;
        }
        f2871 = (f2876 + 119) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2828(String str, String str2) {
        f2876 = (f2871 + 21) % 128;
        m2847(str, str2, (Throwable) null);
        f2876 = (f2871 + 71) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m2834() {
        f2876 = (f2871 + 43) % 128;
        boolean zM2907 = r.m2874().m2907();
        f2871 = (f2876 + 63) % 128;
        return zM2907;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2835(String str, String str2) {
        f2876 = (f2871 + 15) % 128;
        m2832(str, str2, null);
        f2871 = (f2876 + 109) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static ISAdQualityLogLevel m2839() {
        int i2 = f2876 + 59;
        f2871 = i2 % 128;
        if (i2 % 2 == 0) {
            r.m2874().m2906();
            throw null;
        }
        ISAdQualityLogLevel iSAdQualityLogLevelM2906 = r.m2874().m2906();
        f2876 = (f2871 + 23) % 128;
        return iSAdQualityLogLevelM2906;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m2847(String str, String str2, Throwable th) {
        int i2 = f2876 + 1;
        f2871 = i2 % 128;
        if (i2 % 2 == 0) {
            m2842(str, str, str2, th, false);
        } else {
            m2842(str, str, str2, th, true);
        }
        f2876 = (f2871 + 21) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2829(String str, String str2, boolean z2) {
        f2876 = (f2871 + 25) % 128;
        m2838(str, str, str2, z2);
        f2871 = (f2876 + 117) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2832(String str, String str2, Throwable th) {
        f2876 = (f2871 + 1) % 128;
        m2842(str, str, str2, th, false);
        f2871 = (f2876 + 3) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2838(String str, String str2, String str3, boolean z2) {
        f2871 = (f2876 + 125) % 128;
        m2842(str, str2, str3, null, z2);
        f2871 = (f2876 + 87) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m2842(String str, String str2, String str3, Throwable th, boolean z2) {
        if (!m2834()) {
            if (z2) {
                f2876 = (f2871 + 117) % 128;
                if (m2839().shouldPrintLog(ISAdQualityLogLevel.ERROR)) {
                    f2871 = (f2876 + 51) % 128;
                    Log.e(m2827(str2), str3, th);
                    return;
                }
                return;
            }
            return;
        }
        int i2 = f2871 + 113;
        f2876 = i2 % 128;
        if (i2 % 2 == 0) {
            Log.e(m2827(str), str3, th);
        } else {
            Log.e(m2827(str), str3, th);
            int i3 = 56 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m2846(String str, String str2, String str3, boolean z2) {
        int i2 = f2871 + 13;
        f2876 = i2 % 128;
        if (i2 % 2 != 0) {
            m2834();
            throw null;
        }
        if (m2834()) {
            Log.i(m2827(str), str3);
            return;
        }
        if (z2) {
            f2876 = (f2871 + 101) % 128;
            if (!(!m2839().shouldPrintLog(ISAdQualityLogLevel.INFO))) {
                Log.i(m2827(str2), str3);
                f2876 = (f2871 + 77) % 128;
            }
        }
        int i3 = f2876 + 75;
        f2871 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 62 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2827(String str) {
        String strN = a.n(new StringBuilder(), m2843(128 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (String) null, (int[]) null, "\u008a\u0093\u0092\u0091\u0090\u008f\u008e\u0087\u008d\u008c\u008b\u008a\u0089\u0088\u0083\u0087\u0084\u0086\u0085\u0084\u0083\u0082"), str);
        f2876 = (f2871 + 73) % 128;
        return strN;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2833(String str, String str2, Throwable th, boolean z2) {
        int i2 = f2876 + 73;
        f2871 = i2 % 128;
        int i3 = i2 % 2;
        m2842(str, str, str2, th, z2);
        if (i3 == 0) {
            throw null;
        }
        int i4 = f2876 + 99;
        f2871 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m2837(String str, String str2, String str3, Object obj) {
        int i2 = f2876 + 3;
        f2871 = i2 % 128;
        int i3 = i2 % 2;
        m2831(str, str2, str3, obj, true);
        f2876 = (f2871 + 99) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2830(String str, String str2) {
        int i2 = f2871 + 107;
        f2876 = i2 % 128;
        if (i2 % 2 != 0) {
            m2846(str, str, str2, false);
        } else {
            m2846(str, str, str2, true);
        }
        int i3 = f2871 + 95;
        f2876 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 34 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m2836(String str, String str2, String str3) {
        int i2 = f2871 + 87;
        f2876 = i2 % 128;
        if (i2 % 2 == 0) {
            if (m2834()) {
                Log.v(m2827(str), str3);
                return;
            } else {
                if (m2839().shouldPrintLog(ISAdQualityLogLevel.VERBOSE)) {
                    Log.v(m2827(str2), str3);
                    f2876 = (f2871 + 105) % 128;
                    return;
                }
                return;
            }
        }
        m2834();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2831(String str, String str2, String str3, Object obj, boolean z2) {
        f2871 = (f2876 + 7) % 128;
        if (obj != null) {
            StringBuilder sbW = android.support.v4.media.a.w(str3);
            sbW.append(m2843(175 - AndroidCharacter.getMirror('0'), (String) null, (int[]) null, "\u0081").intern());
            sbW.append(obj.toString());
            str3 = sbW.toString();
        }
        if (m2834()) {
            f2876 = (f2871 + 93) % 128;
            Log.d(m2827(str), str3);
        } else if (z2) {
            f2871 = (f2876 + 77) % 128;
            if (m2839().shouldPrintLog(ISAdQualityLogLevel.DEBUG)) {
                Log.d(m2827(str2), str3);
            }
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2840(String str, String str2) {
        f2871 = (f2876 + 77) % 128;
        m2846(str, str, str2, false);
        int i2 = f2871 + 45;
        f2876 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2841(String str, String str2, Object obj) {
        int i2 = f2871 + 59;
        f2876 = i2 % 128;
        int i3 = i2 % 2;
        m2831(str, str, str2, obj, false);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m2844(String str, String str2) {
        int i2 = f2871 + 13;
        f2876 = i2 % 128;
        int i3 = i2 % 2;
        m2837(str, str, str2, (Object) null);
        if (i3 != 0) {
            int i4 = 61 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m2845(String str, String str2, Object obj) {
        f2871 = (f2876 + 13) % 128;
        m2837(str, str, str2, obj);
        f2871 = (f2876 + 9) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2843(int i2, String str, int[] iArr, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes(CharEncoding.ISO_8859_1);
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (o.f2877) {
            try {
                char[] cArr2 = f2874;
                int i3 = f2873;
                if (f2872) {
                    int length = bArr.length;
                    o.f2878 = length;
                    char[] cArr3 = new char[length];
                    o.f2879 = 0;
                    while (o.f2879 < o.f2878) {
                        int i4 = o.f2879;
                        int i5 = o.f2878 - 1;
                        int i6 = o.f2879;
                        cArr3[i4] = (char) (cArr2[bArr[i5 - i6] + i2] - i3);
                        o.f2879 = i6 + 1;
                    }
                    return new String(cArr3);
                }
                if (f2875) {
                    int length2 = cArr.length;
                    o.f2878 = length2;
                    char[] cArr4 = new char[length2];
                    o.f2879 = 0;
                    while (o.f2879 < o.f2878) {
                        int i7 = o.f2879;
                        int i8 = o.f2878 - 1;
                        int i9 = o.f2879;
                        cArr4[i7] = (char) (cArr2[cArr[i8 - i9] - i2] - i3);
                        o.f2879 = i9 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                o.f2878 = length3;
                char[] cArr5 = new char[length3];
                o.f2879 = 0;
                while (o.f2879 < o.f2878) {
                    int i10 = o.f2879;
                    int i11 = o.f2878 - 1;
                    int i12 = o.f2879;
                    cArr5[i10] = (char) (cArr2[iArr[i11 - i12] - i2] - i3);
                    o.f2879 = i12 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
