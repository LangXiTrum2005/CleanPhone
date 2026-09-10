package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.Intent;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ix {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char f2638 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2639 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char f2640 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2641 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Map<String, Integer> f2642;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2643;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static Map<String, Integer> f2644;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2645;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Map<String, Object> f2646;

    static {
        m2570();
        f2646 = new HashMap();
        f2642 = new HashMap();
        f2644 = new HashMap();
        int i10 = f2641 + 15;
        f2639 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2568(Context context, String str, JSONObject jSONObject, Object... objArr) {
        iu.m2556(context).m2566(new Intent(str).putExtra(is.f2565, jSONObject.toString()));
        int i10 = f2641 + 87;
        f2639 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m2570() {
        f2640 = (char) 52997;
        f2643 = (char) 28552;
        f2638 = (char) 48589;
        f2645 = (char) 58757;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2569(String str, int i10) {
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
                            char c10 = (char) (c4 - (((c5 + i12) ^ ((c5 << 4) + f2640)) ^ ((c5 >>> 5) + f2638)));
                            cArr3[1] = c10;
                            cArr3[0] = (char) (c5 - (((c10 >>> 5) + f2643) ^ ((c10 + i12) ^ ((c10 << 4) + f2645))));
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
