package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.unity3d.services.UnityAdsConstants;
import java.io.UnsupportedEncodingException;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class aq extends ar.AnonymousClass5 {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f328 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f329 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f330 = true;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f331 = 17;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f332 = true;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f333 = {'t', 128, 127, 'v', 133, 131, 132, '>', '{', 'z', 'g'};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final String f334;

    public aq(aw awVar) {
        m463(null, 127 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), null, "\u0087\u0086\u0082\u0085\u0081\u0084\u0083\u0083\u0082\u0081").intern();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m463(null, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, null, "\u0087").intern());
        sb2.append(UUID.randomUUID().toString().replace(m463(null, (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 127, null, "\u0088").intern(), ""));
        this.f334 = sb2.toString();
        m508(awVar);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m463(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f333;
                int i11 = f331;
                if (f332) {
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
                if (f330) {
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

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private JSONObject m464() {
        JSONObject jSONObjectOptJSONObject = m506().optJSONObject(m463(null, 126 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), null, "\u0087\u0086\u0082\u0085\u0081\u0084\u0083\u0083\u0082\u0081").intern());
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
            f329 = (f328 + 123) % 128;
        }
        f328 = (f329 + 9) % 128;
        return jSONObjectOptJSONObject;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m465(String str) {
        JSONObject jSONObjectOptJSONObject = m464().optJSONObject(str);
        if (jSONObjectOptJSONObject != null) {
            int i10 = f328 + 21;
            f329 = i10 % 128;
            return jSONObjectOptJSONObject.optString(m463(null, i10 % 2 != 0 ? 23 >> (ExpandableListView.getPackedPositionForGroup(1) > 1L ? 1 : (ExpandableListView.getPackedPositionForGroup(1) == 1L ? 0 : -1)) : (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 127, null, "\u0083\u0082\u008a\u0087\u0086\u0084\u008b\u0086\u0082\u0085\u0081\u0084\u0083\u0083\u0082\u0081").intern());
        }
        int i11 = f328 + 77;
        f329 = i11 % 128;
        if (i11 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m467() {
        JSONObject jSONObjectM506;
        int iIndexOf;
        int i10 = f329 + 43;
        f328 = i10 % 128;
        if (i10 % 2 == 0) {
            jSONObjectM506 = m506();
            iIndexOf = TextUtils.indexOf("", "", 1, 1) * 10;
        } else {
            jSONObjectM506 = m506();
            iIndexOf = TextUtils.indexOf("", "", 0, 0) + 127;
        }
        return jSONObjectM506.optString(m463(null, iIndexOf, null, "\u0083\u008a\u0089").intern(), this.f334);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final boolean m466() {
        f329 = (f328 + 115) % 128;
        boolean zHas = m506().has(m463(null, 128 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), null, "\u0087\u0086\u0082\u0085\u0081\u0084\u0083\u0083\u0082\u0081").intern());
        int i10 = f329 + 45;
        f328 = i10 % 128;
        if (i10 % 2 != 0) {
            return zHas;
        }
        throw null;
    }
}
