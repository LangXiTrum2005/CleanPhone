package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class dp {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1783 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char f1784 = 52278;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static long f1785 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1786 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1787;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f1788;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f1789;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1790;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f1791;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f1792;

    public dp(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f1792 = jSONObject.optString(m2036((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), "\u0000\u0000\u0000\u0000", "魦\uec32ࠁᙽ", "\uea05錥贶쏸\udeed⊘\ue81a", 32256667 - Color.argb(0, 0, 0, 0)).intern());
            this.f1791 = jSONObject.optString(m2036((char) (14421 - TextUtils.indexOf("", "")), "\u0000\u0000\u0000\u0000", "ﯡ堏嗗㴸", "\ue4d9寁蓊颇\u1680䁾", ImageFormat.getBitsPerPixel(0) + 1).intern());
            this.f1789 = jSONObject.optString(m2036((char) (43112 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), "\u0000\u0000\u0000\u0000", "梨\uefb9树ꎨ", "㧩묏䔕㡃梜", ExpandableListView.getPackedPositionChild(0L) + 300923386).intern());
            this.f1790 = jSONObject.optString(m2036((char) Color.argb(0, 0, 0, 0), "\u0000\u0000\u0000\u0000", "\uf4af萤〈蜶", "颯稣\ue1e0ᦢڞ顜㏶", Color.alpha(0) + 696526068).intern());
            this.f1788 = jSONObject.optBoolean(m2036((char) Color.alpha(0), "\u0000\u0000\u0000\u0000", "놰쒳횫仙", "栖募騨ퟗఈ핰㪶ㄩ\ue2e0汇", Color.red(0)).intern());
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String m2037() {
        int i10 = f1787 + 63;
        int i11 = i10 % 128;
        f1786 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        String str = this.f1791;
        f1787 = (i11 + 23) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m2038() {
        int i10 = (f1787 + 77) % 128;
        f1786 = i10;
        String str = this.f1792;
        int i11 = i10 + InterfaceC0435l1.d.b.f29105b;
        f1787 = i11 % 128;
        if (i11 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m2039() {
        int i10 = f1786;
        String str = this.f1790;
        f1787 = (i10 + 27) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m2040() {
        int i10 = f1787;
        String str = this.f1789;
        int i11 = i10 + 63;
        f1786 = i11 % 128;
        if (i11 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m2041() {
        int i10 = f1786 + 47;
        int i11 = i10 % 128;
        f1787 = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        boolean z10 = this.f1788;
        f1786 = (i11 + 51) % 128;
        return z10;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2036(char c4, String str, String str2, String str3, int i10) {
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
        synchronized (f.f2016) {
            try {
                char[] cArr4 = (char[]) cArr2.clone();
                char[] cArr5 = (char[]) cArr3.clone();
                cArr4[0] = (char) (c4 ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i10));
                int length = cArr.length;
                char[] cArr6 = new char[length];
                f.f2015 = 0;
                while (true) {
                    int i11 = f.f2015;
                    if (i11 < length) {
                        int i12 = (i11 + 2) % 4;
                        int i13 = (i11 + 3) % 4;
                        int i14 = cArr4[i11 % 4] * 32718;
                        char c5 = cArr5[i12];
                        char c10 = (char) ((i14 + c5) % Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        f.f2017 = c10;
                        cArr5[i13] = (char) d5.u.d(cArr4[i13], 32718, c5, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cArr4[i13] = c10;
                        int i15 = f.f2015;
                        cArr6[i15] = (char) (((((long) (c10 ^ cArr[i15])) ^ f1785) ^ ((long) f1783)) ^ ((long) f1784));
                        f.f2015 = i15 + 1;
                    } else {
                        str4 = new String(cArr6);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str4;
    }
}
