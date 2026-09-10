package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ap extends ar.AnonymousClass5 {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f318 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f319 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f323 = true;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean f324 = true;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f326 = 51;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final int f327 = (int) TimeUnit.SECONDS.toMillis(120);

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f325 = {163, 165, 162, 167, 161, 166, 160, 152, 169, 151, 156, 148, 154, 153, 171, 168, 159};

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static long f322 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f321 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static char f320 = 51587;

    public ap(aw awVar) {
        m452(null, 127 - (ViewConfiguration.getPressedStateDuration() >> 16), null, "\u0086\u0085\u0083\u0084\u0083\u0082\u0081").intern();
        m451((char) TextUtils.indexOf("", "", 0), "\u0000\u0000\u0000\u0000", "牷좑尀䫜", "⚿ᓀ꛵嗝⃛듍煯\ue8a8\udf3e", KeyEvent.normalizeMetaState(0) + 13144434).intern();
        m508(awVar);
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private boolean m449() {
        int i10 = f318 + 21;
        f319 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject jSONObjectM506 = m506();
        boolean zOptBoolean = i11 == 0 ? jSONObjectM506.optBoolean(m451((char) (36681 >>> (TypedValue.complexToFloat(0) > 2.0f ? 1 : (TypedValue.complexToFloat(0) == 2.0f ? 0 : -1))), "\u0000\u0000\u0000\u0000", "ୡ넼䥩➏", "믍ݨ姼貢", Color.argb(0, 0, 1, 1)).intern(), true) : jSONObjectM506.optBoolean(m451((char) ((TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 36681), "\u0000\u0000\u0000\u0000", "ୡ넼䥩➏", "믍ݨ姼貢", Color.argb(0, 0, 0, 0)).intern(), false);
        int i12 = f319 + 99;
        f318 = i12 % 128;
        if (i12 % 2 == 0) {
            return zOptBoolean;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private int m450() {
        int i10 = f319 + 55;
        f318 = i10 % 128;
        return m506().optInt(m452(null, i10 % 2 != 0 ? Color.blue(1) + 80 : Color.blue(0) + 127, null, "\u0086\u0089\u0087\u008d\u008c\u008b\u008a").intern(), 1000000);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final String m453() {
        JSONObject jSONObjectOptJSONObject;
        int i10 = f318 + 47;
        f319 = i10 % 128;
        if (i10 % 2 != 0 ? (jSONObjectOptJSONObject = m506().optJSONObject(m452(null, (Process.myTid() >> 22) + 127, null, "\u0091\u0082\u0090").intern())) == null : (jSONObjectOptJSONObject = m506().optJSONObject(m452(null, (Process.myTid() / 19) * 44, null, "\u0091\u0082\u0090").intern())) == null) {
            return m451((char) TextUtils.getOffsetAfter("", 0), "\u0000\u0000\u0000\u0000", "牷좑尀䫜", "⚿ᓀ꛵嗝⃛듍煯\ue8a8\udf3e", View.MeasureSpec.getSize(0) + 13144434).intern();
        }
        f318 = (f319 + 37) % 128;
        return jSONObjectOptJSONObject.optString(m452(null, 127 - KeyEvent.keyCodeFromString(""), null, "\u0088").intern(), m451((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), "\u0000\u0000\u0000\u0000", "牷좑尀䫜", "⚿ᓀ꛵嗝⃛듍煯\ue8a8\udf3e", 13144434 - View.MeasureSpec.getMode(0)).intern());
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final long m454() {
        f319 = (f318 + 39) % 128;
        long jOptLong = m506().optLong(m451((char) (7709 - (ViewConfiguration.getTapTimeout() >> 16)), "\u0000\u0000\u0000\u0000", "\ue3ed禭ᶰﴞ", "娺뺤ࣉ", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1334202910).intern(), 0L);
        f318 = (f319 + 15) % 128;
        return jOptLong;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final String m455() {
        f319 = (f318 + 17) % 128;
        JSONObject jSONObjectOptJSONObject = m506().optJSONObject(m452(null, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, null, "\u0091\u0082\u0090").intern());
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject.optString(m452(null, 127 - Color.alpha(0), null, "\u0081").intern(), m452(null, ExpandableListView.getPackedPositionType(0L) + 127, null, "\u0086\u0085\u0083\u0084\u0083\u0082\u0081").intern());
        }
        String strIntern = m452(null, 127 - Color.alpha(0), null, "\u0086\u0085\u0083\u0084\u0083\u0082\u0081").intern();
        int i10 = f319 + 115;
        f318 = i10 % 128;
        if (i10 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final long m456() {
        f319 = (f318 + 23) % 128;
        long jOptLong = m506().optLong(m451((char) (29501 - Gravity.getAbsoluteGravity(0, 0)), "\u0000\u0000\u0000\u0000", "勬䄜㶉ၳ", "㿹룈", ViewConfiguration.getPressedStateDuration() >> 16).intern(), 0L);
        int i10 = f318 + 89;
        f319 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 99 / 0;
        }
        return jOptLong;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final long m457() {
        f319 = (f318 + 25) % 128;
        long jOptLong = m506().optLong(m452(null, MotionEvent.axisFromString("") + 128, null, "\u0086\u0084").intern(), 0L);
        int i10 = f318 + 19;
        f319 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 59 / 0;
        }
        return jOptLong;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final int m458() {
        if (ar.m468().mo490() && m449()) {
            int iM450 = m450();
            f318 = (f319 + 13) % 128;
            return iM450;
        }
        int iOptInt = m506().optInt(m452(null, TextUtils.getCapsMode("", 0, 0) + 127, null, "\u0086\u0089\u0087").intern(), 9850);
        f319 = (f318 + 11) % 128;
        return iOptInt;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final List<String> m459() {
        List<String> listM668 = m505().m668();
        listM668.addAll(kj.m2863(m506(), m451((char) ((Process.myTid() >> 22) + 35929), "\u0000\u0000\u0000\u0000", "혰阨妇綌", "\ue491ﰣ钌", MotionEvent.axisFromString("") - 2020202281).intern(), new ArrayList()));
        int i10 = f318 + InterfaceC0435l1.d.b.f29110g;
        f319 = i10 % 128;
        if (i10 % 2 != 0) {
            return listM668;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final int m460() {
        JSONObject jSONObjectM506;
        String strM451;
        int i10 = f318 + InterfaceC0435l1.d.b.f29110g;
        f319 = i10 % 128;
        if (i10 % 2 == 0) {
            jSONObjectM506 = m506();
            strM451 = m451((char) ((ViewConfiguration.getFadingEdgeLength() << 60) * 33683), "\u0000\u0000\u0000\u0000", "た㟦錯힃", "\uebfa啤귧", 792192560 >> (AudioTrack.getMinVolume() > 1.0f ? 1 : (AudioTrack.getMinVolume() == 1.0f ? 0 : -1)));
        } else {
            jSONObjectM506 = m506();
            strM451 = m451((char) (33683 - (ViewConfiguration.getFadingEdgeLength() >> 16)), "\u0000\u0000\u0000\u0000", "た㟦錯힃", "\uebfa啤귧", (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 792192560);
        }
        int iOptInt = jSONObjectM506.optInt(strM451.intern(), this.f327);
        f318 = (f319 + 39) % 128;
        return iOptInt;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final int m461() {
        f318 = (f319 + 33) % 128;
        int iOptInt = m506().optInt(m452(null, 127 - (ViewConfiguration.getTouchSlop() >> 8), null, "\u0081\u0088\u0087").intern(), 40);
        f318 = (f319 + 67) % 128;
        return iOptInt;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final List<String> m462() {
        List<String> listM670 = m505().m670();
        listM670.addAll(kj.m2863(m506(), m452(null, 128 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), null, "\u008f\u0084\u008e").intern(), new ArrayList()));
        int i10 = f318 + 47;
        f319 = i10 % 128;
        if (i10 % 2 != 0) {
            return listM670;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m452(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f325;
                int i11 = f326;
                if (f324) {
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
                if (f323) {
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
    private static String m451(char c4, String str, String str2, String str3, int i10) {
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
                        cArr6[i15] = (char) (((((long) (c10 ^ cArr[i15])) ^ f322) ^ ((long) f321)) ^ ((long) f320));
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
