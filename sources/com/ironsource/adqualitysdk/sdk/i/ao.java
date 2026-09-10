package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ao extends ar.AnonymousClass5 {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f315 = 154;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f316 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f317 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m445(int i10, boolean z10, int i11, String str, int i12) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (d.f1625) {
            try {
                char[] cArr2 = new char[i10];
                d.f1622 = 0;
                while (true) {
                    int i13 = d.f1622;
                    if (i13 >= i10) {
                        break;
                    }
                    d.f1624 = cArr[i13];
                    cArr2[d.f1622] = (char) (d.f1624 + i11);
                    int i14 = d.f1622;
                    cArr2[i14] = (char) (cArr2[i14] - f315);
                    d.f1622 = i14 + 1;
                }
                if (i12 > 0) {
                    d.f1623 = i12;
                    char[] cArr3 = new char[i10];
                    System.arraycopy(cArr2, 0, cArr3, 0, i10);
                    int i15 = d.f1623;
                    System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                    int i16 = d.f1623;
                    System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
                }
                if (z10) {
                    char[] cArr4 = new char[i10];
                    d.f1622 = 0;
                    while (true) {
                        int i17 = d.f1622;
                        if (i17 >= i10) {
                            break;
                        }
                        cArr4[i17] = cArr2[(i10 - i17) - 1];
                        d.f1622 = i17 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m447() {
        int i10 = f317 + 19;
        f316 = i10 % 128;
        return m506().optString((i10 % 2 != 0 ? m445(2 - View.getDefaultSize(0, 1), true, 8495 % Gravity.getAbsoluteGravity(1, 0), "\ufff6\u0005\u0005", 16777217 >> Color.rgb(0, 1, 1)) : m445(View.getDefaultSize(0, 0) + 3, true, 265 - Gravity.getAbsoluteGravity(0, 0), "\ufff6\u0005\u0005", Color.rgb(0, 0, 0) + 16777217)).intern());
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final JSONObject m448() {
        int i10 = f316 + 75;
        f317 = i10 % 128;
        JSONObject jSONObjectOptJSONObject = m506().optJSONObject((i10 % 2 == 0 ? m445(27 % (ViewConfiguration.getFadingEdgeLength() >> 21), false, (ViewConfiguration.getDoubleTapTimeout() % 15) * 13622, "\u0006\u0004\ufff3\ufffb\u0006\u0005", 23 >> (TypedValue.complexToFraction(1, 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > 1.0f ? 1 : (TypedValue.complexToFraction(1, 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 1.0f ? 0 : -1))) : m445((ViewConfiguration.getFadingEdgeLength() >> 16) + 6, false, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 264, "\u0006\u0004\ufff3\ufffb\u0006\u0005", (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 6)).intern());
        int i11 = f316 + 71;
        f317 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 59 / 0;
        }
        return jSONObjectOptJSONObject;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final Object m446(String str) {
        int i10 = f316 + 47;
        f317 = i10 % 128;
        if (i10 % 2 == 0) {
            m448();
            throw null;
        }
        JSONObject jSONObjectM448 = m448();
        if (jSONObjectM448 != null) {
            return jSONObjectM448.opt(str);
        }
        int i11 = f317 + 39;
        f316 = i11 % 128;
        if (i11 % 2 == 0) {
            return null;
        }
        throw null;
    }
}
