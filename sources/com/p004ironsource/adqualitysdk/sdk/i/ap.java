package com.p004ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class ap extends as.AnonymousClass3 {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f329 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f330 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f331 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f332 = 1532859845;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f333;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final Object m450(String str) {
        int i2 = f330 + 91;
        f331 = i2 % 128;
        if (i2 % 2 != 0) {
            m451();
            throw null;
        }
        JSONObject jSONObjectM451 = m451();
        if (jSONObjectM451 == null) {
            return null;
        }
        Object objOpt = jSONObjectM451.opt(str);
        f331 = (f330 + 45) % 128;
        return objOpt;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final JSONObject m451() {
        JSONObject jSONObjectM501;
        String strM449;
        int i2 = f331 + 119;
        f330 = i2 % 128;
        if (i2 % 2 == 0) {
            jSONObjectM501 = m501();
            strM449 = m449((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (244 >>> TextUtils.getOffsetAfter("", 1)), "\ue78d韌殠ﴅ", "뗪뇵㑦ᾆꝀ岲", "\u0000\u0000\u0000\u0000");
        } else {
            jSONObjectM501 = m501();
            strM449 = m449(1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (1387 - TextUtils.getOffsetAfter("", 0)), "\ue78d韌殠ﴅ", "뗪뇵㑦ᾆꝀ岲", "\u0000\u0000\u0000\u0000");
        }
        return jSONObjectM501.optJSONObject(strM449.intern());
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m452() {
        f331 = (f330 + 19) % 128;
        String strOptString = m501().optString(m449((-380034850) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (23681 - TextUtils.lastIndexOf("", '0')), "\udebf夠苩\udd5c", "\ue459ꝳ\ue56f", "\u0000\u0000\u0000\u0000").intern());
        f330 = (f331 + 51) % 128;
        return strOptString;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m449(int i2, char c2, String str, String str2, String str3) {
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
                        cArr6[i7] = (char) (((((long) (c4 ^ cArr2[i7])) ^ f329) ^ ((long) f332)) ^ ((long) f333));
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
