package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.view.ViewConfiguration;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.unity3d.services.UnityAdsConstants;
import java.io.UnsupportedEncodingException;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class jn {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static boolean f2811 = true;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2812 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2813 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2814 = {269, 268, 272, 273, 225, 254, 274, 262, 257};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f2815 = true;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2816 = 157;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private JSONObject f2817;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f2818;

    public jn(JSONObject jSONObject) {
        this(jSONObject, UUID.randomUUID().toString());
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final JSONObject m2684() {
        int i10 = f2812 + 33;
        f2813 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f2817;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final JSONObject m2685() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(m2683(null, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + WebSocketProtocol.PAYLOAD_SHORT, null, "\u0086\u0084\u0086\u0085\u0084\u0083\u0082\u0081").intern(), this.f2817);
        jSONObject.put(m2683(null, (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + WebSocketProtocol.PAYLOAD_SHORT, null, "\u0089\u0088\u0087\u0087").intern(), this.f2818);
        int i10 = f2812 + 13;
        f2813 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 15 / 0;
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m2686() {
        int i10 = f2812 + 1;
        f2813 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f2818;
        }
        throw null;
    }

    public jn(JSONObject jSONObject, String str) {
        this.f2817 = jSONObject;
        this.f2818 = str;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2683(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (k.f2932) {
            try {
                char[] cArr2 = f2814;
                int i11 = f2816;
                if (f2811) {
                    int length = bArr.length;
                    k.f2931 = length;
                    char[] cArr3 = new char[length];
                    k.f2933 = 0;
                    while (k.f2933 < k.f2931) {
                        int i12 = k.f2933;
                        int i13 = k.f2931 - 1;
                        int i14 = k.f2933;
                        cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                        k.f2933 = i14 + 1;
                    }
                    return new String(cArr3);
                }
                if (f2815) {
                    int length2 = cArr.length;
                    k.f2931 = length2;
                    char[] cArr4 = new char[length2];
                    k.f2933 = 0;
                    while (k.f2933 < k.f2931) {
                        int i15 = k.f2933;
                        int i16 = k.f2931 - 1;
                        int i17 = k.f2933;
                        cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                        k.f2933 = i17 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                k.f2931 = length3;
                char[] cArr5 = new char[length3];
                k.f2933 = 0;
                while (k.f2933 < k.f2931) {
                    int i18 = k.f2933;
                    int i19 = k.f2931 - 1;
                    int i20 = k.f2933;
                    cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                    k.f2933 = i20 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
