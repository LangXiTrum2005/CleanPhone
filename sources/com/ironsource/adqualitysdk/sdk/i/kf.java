package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0435l1;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.unity3d.services.UnityAdsConstants;
import java.io.UnsupportedEncodingException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class kf {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2973 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2974 = 1;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static char[] f2975;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char f2976;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2977;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2978;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static JSONObject f2979;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static JSONObject f2980;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2981;

    static {
        m2813();
        f2979 = null;
        f2974 = (f2973 + 99) % 128;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static synchronized JSONObject m2805() {
        int i10 = f2973 + 67;
        int i11 = i10 % 128;
        f2974 = i11;
        try {
            if (i10 % 2 == 0) {
                throw null;
            }
            JSONObject jSONObject = f2980;
            int i12 = i11 + 71;
            f2973 = i12 % 128;
            if (i12 % 2 == 0) {
                return jSONObject;
            }
            int i13 = 57 / 0;
            return jSONObject;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static synchronized JSONObject m2806() {
        try {
            int i10 = f2974 + InterfaceC0435l1.d.b.f29105b;
            f2973 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            if (f2979 == null) {
                JSONObject jSONObject = new JSONObject();
                f2979 = jSONObject;
                try {
                    jSONObject.put(m2824(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{0, 1, 165, 1}, true).intern(), -1);
                    f2979.put(m2812("獑仝", 1 - TextUtils.getTrimmedLength("")).intern(), -1);
                    f2973 = (f2974 + 67) % 128;
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f2979;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static JSONObject m2807() {
        int i10 = f2973 + 73;
        f2974 = i10 % 128;
        if (i10 % 2 != 0) {
            return kj.m2855(m2805());
        }
        kj.m2855(m2805());
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static boolean m2811(int i10, int i11) {
        int i12 = f2974 + 13;
        f2973 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        if (i10 >= 0 && i11 >= 0 && i10 <= m2823() && i11 <= m2820()) {
            int i13 = f2973 + InterfaceC0435l1.d.b.f29105b;
            f2974 = i13 % 128;
            return i13 % 2 != 0;
        }
        int i14 = f2974 + 93;
        f2973 = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 8 / 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2813() {
        f2977 = (char) 9950;
        f2978 = (char) 19129;
        f2976 = (char) 15394;
        f2981 = (char) 14904;
        f2975 = new char[]{142, '2', 'm', 'o', 'f', 'd', ']', 'd', 'n', 'j', 'o', '[', ':', 'l', 'Y', 'b', 's', 'i', 'i', 'k', 'p', 'K', 'C', 'j', 'k', 'n', 't', 'l', 'f', 'C', 'G', 'k', 'D', 'I', 'p', 'p', 'r', '[', '[', 'k', 'f', 'j', 'g', 'W', 'b', 's', 'i', 'i', 'k', 'p', 'K', 'F', 'n', 'p', 'l', 'C', 'I', 'k', 'f', 'm', '2', 'o', 'q', 'n', 'I', 'G', 'i', 'e', 'k', 'j', 'k', 'I', 'C', 'j', 'k', 'n', 't', 'l', 'l', 'I', 'I', 'p', 'p', 'r', '[', '6', 'm', 'q', 'k', 146, 287, 283, 286, '^', 211, 234, 232, 232, 193, 187, 222, 228, 236, 230, 227, 226, 187, 190, 225, 225, 230, 232, 237, 196, 194, 236, 226, 220, 222, 199, 165, '8', 'q', 'u', 'r', 134, 272, 274, 275, '1', 'i', 'n', 'n', 'i', 'd', 'k', 'n', 'o', 'o', 'n', 'v', '8', 'l', 'k', 'n', 'i', ':', 'k', 'g', 'k', 'l', '6', 'g', 'k', 'r', '8', 'q', 'j', 'g', 'y', 236, 237, 243, 'J', 149, 148, 153, '6', 'g', 'j', 'q', 150, 302, 296, 293, 'w', 245, 245, 236, 253, 241, 258, 254, '8', 'j', 'd', 'f', 'g', 'n', 'p', 147, 304, 311, 307, 141, 279, 284, 284, 279};
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static String m2816() {
        f2973 = (f2974 + 75) % 128;
        String str = Build.VERSION.RELEASE;
        int i10 = f2973 + 91;
        f2974 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 97 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2822(JSONObject jSONObject) {
        f2973 = (f2974 + 55) % 128;
        try {
            jSONObject.put(m2812("\uf3d9ｊ㕢䍗", 5 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), m2808());
            f2974 = (f2973 + 123) % 128;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int m2823() throws UnsupportedEncodingException {
        JSONObject jSONObjectM2808;
        String strM2824;
        int i10 = f2974 + 75;
        f2973 = i10 % 128;
        if (i10 % 2 != 0) {
            jSONObjectM2808 = m2808();
            strM2824 = m2824(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{0, 1, 165, 1}, false);
        } else {
            jSONObjectM2808 = m2808();
            strM2824 = m2824(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{0, 1, 165, 1}, true);
        }
        int iOptInt = jSONObjectM2808.optInt(strM2824.intern());
        int i11 = f2974 + 69;
        f2973 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 11 / 0;
        }
        return iOptInt;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static JSONObject m2808() {
        f2974 = (f2973 + 43) % 128;
        JSONObject jSONObjectM2855 = kj.m2855(m2806());
        int i10 = f2974 + 71;
        f2973 = i10 % 128;
        if (i10 % 2 == 0) {
            return jSONObjectM2855;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static synchronized void m2814(Activity activity) {
        try {
            f2973 = (f2974 + InterfaceC0435l1.d.b.f29114k) % 128;
            if (activity != null) {
                m2821(activity.getApplicationContext());
                f2973 = (f2974 + 67) % 128;
            }
            int i10 = f2974 + 67;
            f2973 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 15 / 0;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2819(JSONObject jSONObject) {
        JSONObject jSONObjectM2807;
        int i10 = f2974 + 123;
        f2973 = i10 % 128;
        if (i10 % 2 != 0) {
            jSONObjectM2807 = m2807();
            int i11 = 32 / 0;
            if (jSONObjectM2807 == null) {
                return;
            }
        } else {
            jSONObjectM2807 = m2807();
            if (jSONObjectM2807 == null) {
                return;
            }
        }
        kj.m2869(jSONObject, jSONObjectM2807);
        f2973 = (f2974 + 21) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m2809(DisplayMetrics displayMetrics) {
        int i10 = f2973 + 91;
        f2974 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (displayMetrics != null) {
            m2825(displayMetrics.heightPixels, displayMetrics.widthPixels);
            f2974 = (f2973 + 25) % 128;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2815(Context context, JSONObject jSONObject) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(m2812("뿚쑆颸捌睬뙷㢐\ue448", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 9).intern());
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            jSONObject.put(m2824("\u0001\u0000\u0001\u0001", new int[]{85, 4, 0, 2}, true).intern(), memoryInfo.availMem / 1048576);
            jSONObject.put(m2824("\u0001\u0000\u0001\u0000", new int[]{89, 4, 177, 2}, false).intern(), memoryInfo.threshold / 1048576);
            if (memoryInfo.lowMemory) {
                int i10 = f2974 + 95;
                f2973 = i10 % 128;
                jSONObject.put(i10 % 2 != 0 ? m2812("\uf614㧈㎘槔", (ViewConfiguration.getZoomControlsTimeout() > 1L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 1L ? 0 : -1)) + 4).intern() : m2812("\uf614㧈㎘槔", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3).intern(), memoryInfo.lowMemory);
            }
            f2974 = (f2973 + 81) % 128;
            jSONObject.put(m2812("\uf614㧈\udb8b箭", Gravity.getAbsoluteGravity(0, 0) + 4).intern(), memoryInfo.totalMem / 1048576);
            int i11 = (f2974 + 79) % 128;
            f2973 = i11;
            f2974 = (i11 + 125) % 128;
        } catch (Throwable th2) {
            String strIntern = m2824("\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{1, 11, 0, 10}, false).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2824("\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000", new int[]{93, 28, 120, 0}, false).intern());
            sb2.append(th2.getLocalizedMessage());
            m.m2972(strIntern, sb2.toString());
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int m2820() {
        JSONObject jSONObjectM2808;
        int iIndexOf;
        int i10 = f2974 + 17;
        f2973 = i10 % 128;
        if (i10 % 2 != 0) {
            jSONObjectM2808 = m2808();
            iIndexOf = 1 - TextUtils.indexOf("", "");
        } else {
            jSONObjectM2808 = m2808();
            iIndexOf = TextUtils.indexOf("", "") + 1;
        }
        return jSONObjectM2808.optInt(m2812("獑仝", iIndexOf).intern());
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static synchronized void m2810(JSONObject jSONObject) {
        int i10 = f2974;
        f2980 = jSONObject;
        int i11 = i10 + 67;
        f2973 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 81 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m2826(Application application) {
        f2974 = (f2973 + 29) % 128;
        if (application != null) {
            m2821(application.getApplicationContext());
        }
        int i10 = f2973 + 19;
        f2974 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m2825(int i10, int i11) {
        if (i10 > 0) {
            int i12 = f2974;
            int i13 = i12 + 5;
            f2973 = i13 % 128;
            try {
                if (i13 % 2 != 0) {
                    throw null;
                }
                if (i11 > 0) {
                    f2973 = (i12 + 11) % 128;
                    JSONObject jSONObjectM2806 = m2806();
                    jSONObjectM2806.put(m2824(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{0, 1, 165, 1}, true).intern(), i11);
                    jSONObjectM2806.put(m2812("獑仝", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern(), i10);
                }
            } catch (Throwable th2) {
                m.m2983(m2824("\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{1, 11, 0, 10}, false).intern(), m2824("\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001", new int[]{60, 25, 0, 0}, true).intern(), th2);
            }
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2817(Context context, JSONObject jSONObject, boolean z10) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(m2824("\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{TsExtractor.TS_STREAM_TYPE_AC3, 12, 0, 0}, false).intern());
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(m2824("\u0000\u0000\u0001\u0001\u0001", new int[]{141, 5, 0, 0}, false).intern());
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
            if (networkInfo != null) {
                f2974 = (f2973 + 91) % 128;
                jSONObject.put(m2812("⯮\uf8a3圕\ue27e", 5 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern(), networkInfo.getState());
                if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    f2973 = (f2974 + InterfaceC0435l1.d.b.f29114k) % 128;
                    jSONObject.put(m2824("\u0000\u0000\u0001\u0000\u0001", new int[]{146, 5, 0, 3}, true).intern(), networkInfo.getType());
                    jSONObject.put(m2824("\u0001\u0001\u0000\u0000", new int[]{151, 4, 0, 0}, false).intern(), networkInfo.getTypeName());
                    jSONObject.put(m2812("⯮\uf8a3븬ޫ\uf3c1柈", (-16777211) - Color.rgb(0, 0, 0)).intern(), networkInfo.getSubtype());
                    jSONObject.put(m2824("\u0000\u0001\u0001\u0001", new int[]{155, 4, 0, 0}, true).intern(), networkInfo.getSubtypeName());
                    jSONObject.put(m2812("⯮\uf8a3칝\ue3ee", 3 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), telephonyManager.getNetworkOperator());
                    jSONObject.put(m2824("\u0000\u0001\u0001\u0001", new int[]{159, 4, 133, 0}, false).intern(), telephonyManager.getNetworkOperatorName());
                    jSONObject.put(m2824("\u0001\u0000\u0001\u0001", new int[]{163, 4, 50, 0}, true).intern(), telephonyManager.getNetworkCountryIso());
                    if (z10) {
                        jSONObject.put(m2824("\u0001\u0001\u0001\u0000", new int[]{167, 4, 0, 0}, false).intern(), telephonyManager.getSimOperator());
                        jSONObject.put(m2824("\u0000\u0001\u0001\u0001", new int[]{171, 4, 190, 0}, true).intern(), telephonyManager.getSimOperatorName());
                        f2973 = (f2974 + 67) % 128;
                    }
                }
            }
        } catch (Throwable th2) {
            m.m2983(m2824("\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{1, 11, 0, 10}, false).intern(), m2812("Ꞧ\uf206\uf111鞎崪嚠\ueb07縻\u001b扦乔兇뮞ぺ쑀㨜Ꝫᓗ\uda6f쌧䳟\u0c5c䦱ꤧ溪喑툴ᙼੌﮑ놼蝱\u0ebfᏇ", View.combineMeasuredStates(0, 0) + 33).intern(), th2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r5 != null) goto L18;
     */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static synchronized void m2821(android.content.Context r11) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.kf.m2821(android.content.Context):void");
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m2828(JSONObject jSONObject) {
        try {
            long totalRxBytes = TrafficStats.getTotalRxBytes();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            if (totalRxBytes != -1) {
                long totalRxBytes2 = TrafficStats.getTotalRxBytes();
                jSONObject.put(m2824("\u0000\u0001\u0000\u0001", new int[]{121, 4, 0, 0}, true).intern(), Math.round((1000.0f / (jCurrentTimeMillis2 - jCurrentTimeMillis)) * (totalRxBytes2 - totalRxBytes)));
                jSONObject.put(m2824("\u0000\u0001\u0001\u0000", new int[]{125, 4, 158, 0}, false).intern(), totalRxBytes2);
                f2974 = (f2973 + 93) % 128;
            }
            f2974 = (f2973 + 73) % 128;
        } catch (Throwable th2) {
            m.m2983(m2824("\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{1, 11, 0, 10}, false).intern(), m2812("Ꞧ\uf206\uf111鞎崪嚠\udc9f.\udb8b箭䳟\u0c5c旱ꠘⓄ鞵뎔\uf5b9洎牨尿辕┃⚤\ud8cc㞴믛嵹朸六\uefcb䅉\u242d狂柃퐱", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 35).intern(), th2);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2812(String str, int i10) {
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
                            char c10 = (char) (c4 - (((c5 + i12) ^ ((c5 << 4) + f2977)) ^ ((c5 >>> 5) + f2976)));
                            cArr3[1] = c10;
                            cArr3[0] = (char) (c5 - (((c10 >>> 5) + f2978) ^ ((c10 + i12) ^ ((c10 << 4) + f2981))));
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

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m2827(Context context, JSONObject jSONObject) {
        try {
            if (kh.m2836(context, m2812("洎牨㦙舾╓棃ᗼ者\ue8a6㼓婳⚌럲靉\uf3d9ｊি᭲풅헥✊䁍㟭⸲踶⏗ιٹ썩鹦䐾俱ዪ\ue890흁\uf699", 37 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern())) {
                f2974 = (f2973 + 21) % 128;
                WifiInfo connectionInfo = ((WifiManager) context.getSystemService(m2824("\u0000\u0000\u0000\u0001", new int[]{175, 4, 133, 2}, true).intern())).getConnectionInfo();
                jSONObject.put(m2812("\ude84똱圕\ue27e", 3 - ExpandableListView.getPackedPositionChild(0L)).intern(), connectionInfo.getSupplicantState());
                if (connectionInfo.getSupplicantState() == SupplicantState.COMPLETED) {
                    jSONObject.put(m2824(null, new int[]{179, 4, 139, 3}, true).intern(), connectionInfo.getRssi());
                    jSONObject.put(m2812("\ude84똱븬ޫ", 4 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern(), connectionInfo.getLinkSpeed());
                    f2973 = (f2974 + 37) % 128;
                }
            }
        } catch (Throwable th2) {
            m.m2983(m2824("\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{1, 11, 0, 10}, false).intern(), m2812("Ꞧ\uf206\uf111鞎崪嚠\ueb07縻\u001b扦乔兇ᢀꐜ㛭硳\ueab3쬫䳟\u0c5c䦱ꤧ溪喑툴ᙼੌﮑ놼蝱\u0ebfᏇ", ExpandableListView.getPackedPositionChild(0L) + 32).intern(), th2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0032  */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2818(Intent intent) {
        int intExtra;
        int intExtra2;
        JSONObject jSONObject = new JSONObject();
        if (intent != null) {
            int i10 = f2974 + 23;
            f2973 = i10 % 128;
            int intExtra3 = -1;
            try {
                if (i10 % 2 != 0) {
                    if (intent.hasExtra(m2824("\u0000\u0000\u0001\u0000\u0000\u0000\u0001", new int[]{183, 7, 0, 1}, false).intern())) {
                        intExtra = intent.getIntExtra(m2824("\u0000\u0000\u0001\u0000\u0000\u0000\u0001", new int[]{183, 7, 0, 1}, true).intern(), -1);
                    } else {
                        intExtra = -1;
                    }
                } else if (intent.hasExtra(m2824("\u0000\u0000\u0001\u0000\u0000\u0000\u0001", new int[]{183, 7, 0, 1}, true).intern())) {
                    intExtra = intent.getIntExtra(m2824("\u0000\u0000\u0001\u0000\u0000\u0000\u0001", new int[]{183, 7, 0, 1}, true).intern(), -1);
                } else {
                    intExtra = -1;
                }
                jSONObject.put(m2824("\u0001\u0000\u0000\u0000", new int[]{190, 4, 197, 0}, false).intern(), intExtra);
                if (intent.hasExtra(m2824("\u0001\u0001\u0001\u0001\u0001", new int[]{194, 5, 175, 0}, false).intern())) {
                    int i11 = f2974 + 9;
                    f2973 = i11 % 128;
                    intExtra2 = intent.getIntExtra((i11 % 2 != 0 ? m2824("\u0001\u0001\u0001\u0001\u0001", new int[]{194, 5, 175, 0}, true) : m2824("\u0001\u0001\u0001\u0001\u0001", new int[]{194, 5, 175, 0}, false)).intern(), -1);
                } else {
                    intExtra2 = -1;
                }
                if (intent.hasExtra(m2812("폜㷖鼒㤗柃퐱", ((byte) KeyEvent.getModifierMetaStateMask()) + 6).intern())) {
                    int i12 = f2974 + 55;
                    f2973 = i12 % 128;
                    intExtra3 = intent.getIntExtra(i12 % 2 != 0 ? m2812("폜㷖鼒㤗柃퐱", 5 >>> (ViewConfiguration.getTouchSlop() << 39)).intern() : m2812("폜㷖鼒㤗柃퐱", (ViewConfiguration.getTouchSlop() >> 8) + 5).intern(), -1);
                    f2973 = (f2974 + 95) % 128;
                }
                jSONObject.put(m2812("㚻鰱푡澐", Color.blue(0) + 4).intern(), Math.round((intExtra2 * 100.0f) / intExtra3));
            } catch (Throwable th2) {
                String strIntern = m2824("\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{1, 11, 0, 10}, false).intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m2812("Ꞧ\uf206\uf111鞎崪嚠\ueb07縻\u001b扦乔兇⋨䒐崊釆＼斲ɨ\uedae泩痧ੌﮑ뮹觕·᧙╮Ẕ볼쎌餤\uda21居㨠ꇀ\ue76d", Color.rgb(0, 0, 0) + 16777253).intern());
                sb2.append(th2.getLocalizedMessage());
                m.m2972(strIntern, sb2.toString());
            }
        }
        m2810(jSONObject);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2824(String str, int[] iArr, boolean z10) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (h.f2261) {
            try {
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                char[] cArr = new char[i11];
                System.arraycopy(f2975, i10, cArr, 0, i11);
                if (bArr != null) {
                    char[] cArr2 = new char[i11];
                    h.f2262 = 0;
                    char c4 = 0;
                    while (true) {
                        int i14 = h.f2262;
                        if (i14 >= i11) {
                            break;
                        }
                        if (bArr[i14] == 1) {
                            cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c4);
                        } else {
                            cArr2[i14] = (char) ((cArr[i14] << 1) - c4);
                        }
                        c4 = cArr2[i14];
                        h.f2262 = i14 + 1;
                    }
                    cArr = cArr2;
                }
                if (i13 > 0) {
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr, 0, cArr3, 0, i11);
                    int i15 = i11 - i13;
                    System.arraycopy(cArr3, 0, cArr, i15, i13);
                    System.arraycopy(cArr3, i13, cArr, 0, i15);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    h.f2262 = 0;
                    while (true) {
                        int i16 = h.f2262;
                        if (i16 >= i11) {
                            break;
                        }
                        cArr4[i16] = cArr[(i11 - i16) - 1];
                        h.f2262 = i16 + 1;
                    }
                    cArr = cArr4;
                }
                if (i12 > 0) {
                    h.f2262 = 0;
                    while (true) {
                        int i17 = h.f2262;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr[i17] = (char) (cArr[i17] - iArr[2]);
                        h.f2262 = i17 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
