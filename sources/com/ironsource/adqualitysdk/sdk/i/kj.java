package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class kj {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f3008 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f3009 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f3010 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f3011 = 62518;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f3012;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface a<T> {
        /* JADX INFO: renamed from: ｋ */
        T mo541(JSONObject jSONObject, String str);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface e<T> {
        /* JADX INFO: renamed from: ﾒ */
        T mo542(JSONArray jSONArray, int i10);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static <T> List<T> m2852(JSONArray jSONArray) {
        List<T> listM2866 = m2866(jSONArray, new e<T>() { // from class: com.ironsource.adqualitysdk.sdk.i.kj.3
            @Override // com.ironsource.adqualitysdk.sdk.i.kj.e
            /* JADX INFO: renamed from: ﾒ */
            public final T mo542(JSONArray jSONArray2, int i10) {
                return (T) jSONArray2.opt(i10);
            }
        });
        f3009 = (f3008 + 123) % 128;
        return listM2866;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static JSONObject m2855(JSONObject jSONObject) {
        int i10 = f3009 + 99;
        f3008 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject jSONObjectM2865 = m2865(jSONObject, false);
        int i12 = f3008 + 53;
        f3009 = i12 % 128;
        if (i12 % 2 != 0) {
            return jSONObjectM2865;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2861(JSONObject jSONObject, JSONObject jSONObject2, boolean z10) {
        int i10 = f3008 + 83;
        f3009 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject2.keys();
        f3009 = (f3008 + 85) % 128;
        while (itKeys.hasNext()) {
            int i11 = f3008 + 87;
            f3009 = i11 % 128;
            if (i11 % 2 == 0) {
                String next = itKeys.next();
                jSONObject.put(next, jSONObject2.opt(next));
                throw null;
            }
            String next2 = itKeys.next();
            try {
                jSONObject.put(next2, jSONObject2.opt(next2));
                f3008 = (f3009 + 99) % 128;
            } catch (JSONException unused) {
            }
        }
        if (z10) {
            jSONObject.remove(is.f2604);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020 A[Catch: JSONException -> 0x0034, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0034, blocks: (B:8:0x0015, B:10:0x0020), top: B:19:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:13:0x0031 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    /* JADX WARN: Code duplicated, block: B:19:0x0015 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static JSONObject m2865(JSONObject jSONObject, boolean z10) {
        JSONObject jSONObject2;
        int i10;
        int i11 = f3009 + 47;
        f3008 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 65 / 0;
            if (jSONObject != null) {
                try {
                    jSONObject2 = new JSONObject(jSONObject.toString());
                    if (z10) {
                        jSONObject2.remove(is.f2604);
                    }
                    i10 = f3008 + 5;
                    f3009 = i10 % 128;
                    if (i10 % 2 != 0) {
                        return jSONObject2;
                    }
                    throw null;
                } catch (JSONException unused) {
                }
            }
        } else if (jSONObject != null) {
            jSONObject2 = new JSONObject(jSONObject.toString());
            if (z10) {
                jSONObject2.remove(is.f2604);
            }
            i10 = f3008 + 5;
            f3009 = i10 % 128;
            if (i10 % 2 != 0) {
                return jSONObject2;
            }
            throw null;
        }
        return new JSONObject();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m2869(JSONObject jSONObject, JSONObject jSONObject2) {
        f3009 = (f3008 + 1) % 128;
        m2861(jSONObject, jSONObject2, false);
        f3008 = (f3009 + 25) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2854(JSONObject jSONObject, int i10, List<String> list) {
        f3008 = (f3009 + 75) % 128;
        try {
            JSONArray jSONArrayNames = jSONObject.names();
            if (jSONArrayNames != null) {
                f3008 = (f3009 + 79) % 128;
                for (int i11 = 0; i11 < jSONArrayNames.length(); i11++) {
                    int i12 = f3008 + 31;
                    f3009 = i12 % 128;
                    if (i12 % 2 == 0) {
                        jSONArrayNames.optString(i11);
                        throw null;
                    }
                    String strOptString = jSONArrayNames.optString(i11);
                    if (list == null || !list.contains(strOptString)) {
                        m2868(jSONObject, strOptString, i10);
                    }
                }
            }
            int i13 = f3008 + 71;
            f3009 = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
        } catch (JSONException e10) {
            m.m2983(m2862((char) (TextUtils.lastIndexOf("", '0') + 1), "\u0000\u0000\u0000\u0000", "䀜ᯕహ剈", "鮶댺뚀萸䵎マ魴❍쟿", 958125376 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), m2862((char) (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), "\u0000\u0000\u0000\u0000", "ᶷ끂썿⿍", "\uf746\uf6bc㗤쵧㫡攒᮲῍\ue668\uf5ee䶣\u074c喧悈誨窼얹ㄎ팥\ud7a6\ueb82", 2142257693 - KeyEvent.getDeadChar(0, 0)).intern(), e10);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m2856(JSONArray jSONArray, int i10) throws JSONException {
        int i11 = f3008 + 97;
        f3009 = i11 % 128;
        int i12 = i11 % 2 == 0 ? 1 : 0;
        while (i12 < jSONArray.length()) {
            int i13 = f3009 + 33;
            f3008 = i13 % 128;
            if (i13 % 2 != 0) {
                m2853(jSONArray, i12, i10);
                i12 += 100;
            } else {
                m2853(jSONArray, i12, i10);
                i12++;
            }
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static <T> List<T> m2866(JSONArray jSONArray, e<T> eVar) {
        f3008 = (f3009 + 117) % 128;
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            T tMo542 = eVar.mo542(jSONArray, i10);
            if (tMo542 != null) {
                int i11 = f3008 + 85;
                f3009 = i11 % 128;
                if (i11 % 2 == 0) {
                    arrayList.add(tMo542);
                    throw null;
                }
                arrayList.add(tMo542);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static List<String> m2863(JSONObject jSONObject, String str, List<String> list) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray != null) {
            return m2858(jSONArrayOptJSONArray);
        }
        int i10 = (f3008 + 73) % 128;
        f3009 = i10;
        int i11 = i10 + 115;
        f3008 = i11 % 128;
        if (i11 % 2 == 0) {
            return list;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static JSONObject m2864(int i10, int i11, long j10, long j11) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (j10 > -1) {
                f3009 = (f3008 + 39) % 128;
                jSONObject.put(m2862((char) (45963 - View.MeasureSpec.getSize(0)), "\u0000\u0000\u0000\u0000", "→\uf26c謝妳", "塡", 502426657 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), i10);
                jSONObject.put(m2862((char) (50150 - TextUtils.indexOf("", "", 0, 0)), "\u0000\u0000\u0000\u0000", "ℤ㱩\ue658\ue2c3", "搽", TextUtils.lastIndexOf("", '0', 0) + 1480354082).intern(), i11);
                jSONObject.put(m2862((char) (45758 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), "\u0000\u0000\u0000\u0000", "ꪺ䞮붱캲", "紉", Gravity.getAbsoluteGravity(0, 0) - 1320702294).intern(), j10);
                jSONObject.put(m2862((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 26743), "\u0000\u0000\u0000\u0000", "ㄍ䐼磆꽨", "葃", (-968606671) - KeyEvent.keyCodeFromString("")).intern(), j11);
            } else {
                jSONObject.put(m2862((char) ((TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 45963), "\u0000\u0000\u0000\u0000", "→\uf26c謝妳", "塡", 502426657 - (ViewConfiguration.getEdgeSlop() >> 16)).intern(), -1);
                jSONObject.put(m2862((char) (50150 - (ViewConfiguration.getPressedStateDuration() >> 16)), "\u0000\u0000\u0000\u0000", "ℤ㱩\ue658\ue2c3", "搽", TextUtils.indexOf("", "") + 1480354081).intern(), -1);
                jSONObject.put(m2862((char) ((ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 45756), "\u0000\u0000\u0000\u0000", "ꪺ䞮붱캲", "紉", TextUtils.getOffsetBefore("", 0) - 1320702294).intern(), -1);
                jSONObject.put(m2862((char) (26744 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), "\u0000\u0000\u0000\u0000", "ㄍ䐼磆꽨", "葃", (-968606671) - View.resolveSizeAndState(0, 0, 0)).intern(), -1);
                f3009 = (f3008 + 37) % 128;
            }
        } catch (JSONException e10) {
            m.m2983(m2862((char) (Color.rgb(0, 0, 0) + 16777216), "\u0000\u0000\u0000\u0000", "䀜ᯕహ剈", "鮶댺뚀萸䵎マ魴❍쟿", 958125376 - (ViewConfiguration.getScrollBarSize() >> 8)).intern(), m2862((char) (43701 - KeyEvent.getDeadChar(0, 0)), "\u0000\u0000\u0000\u0000", "\uf8da㟴딨\ueaaa", "瀁圫햍讓됟춭澥\ueb7d手്朄뱇ႆ⒘羽ﰴ낯ӓ㊷ᯚ譜\uddab\ue98fꞚ\ua95c跡ᘰ\uf15f\uebf6", 674755832 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), e10);
        }
        int i12 = f3008 + 121;
        f3009 = i12 % 128;
        if (i12 % 2 != 0) {
            return jSONObject;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m2867(JSONObject jSONObject, int i10) {
        f3008 = (f3009 + 43) % 128;
        m2854(jSONObject, i10, (List<String>) null);
        f3008 = (f3009 + 41) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m2868(JSONObject jSONObject, String str, int i10) throws JSONException {
        String strM2857 = m2857(jSONObject.opt(str), i10);
        if (strM2857 != null) {
            int i11 = f3008 + 37;
            f3009 = i11 % 128;
            if (i11 % 2 != 0) {
                if (strM2857.equals("")) {
                    f3008 = (f3009 + 37) % 128;
                    strM2857 = null;
                }
                jSONObject.put(str, strM2857);
                return;
            }
            strM2857.equals("");
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m2853(JSONArray jSONArray, int i10, int i11) throws JSONException {
        f3008 = (f3009 + 97) % 128;
        String strM2857 = m2857(jSONArray.opt(i10), i11);
        if (strM2857 != null) {
            jSONArray.put(i10, strM2857);
            f3009 = (f3008 + 23) % 128;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static List<String> m2858(JSONArray jSONArray) {
        int i10 = f3008;
        f3009 = (i10 + 11) % 128;
        if (jSONArray == null) {
            f3009 = (i10 + 119) % 128;
            return null;
        }
        List<String> listM2852 = m2852(jSONArray);
        f3008 = (f3009 + 85) % 128;
        return listM2852;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2857(Object obj, int i10) throws JSONException {
        if (obj instanceof JSONObject) {
            f3008 = (f3009 + 91) % 128;
            m2867((JSONObject) obj, i10);
            f3008 = (f3009 + 5) % 128;
        } else if (obj instanceof JSONArray) {
            int i11 = f3009 + 45;
            f3008 = i11 % 128;
            if (i11 % 2 != 0) {
                m2856((JSONArray) obj, i10);
                throw null;
            }
            m2856((JSONArray) obj, i10);
        } else if (obj instanceof String) {
            f3008 = (f3009 + 43) % 128;
            String str = (String) obj;
            if (str.length() > i10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str.substring(0, i10));
                return f2.m(sb2, m2862((char) ((ViewConfiguration.getTouchSlop() >> 8) + 57798), "\u0000\u0000\u0000\u0000", "䭠뢾욬듡", "\uf4de啴ố쇬\ud8ec\uee1cᘃ◑\uf6b3ꊕ﵂ᔩ噚럯", KeyEvent.getMaxKeyCode() >> 16));
            }
            f3009 = (f3008 + 91) % 128;
            return str;
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2862(char c4, String str, String str2, String str3, int i10) {
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
                        cArr6[i15] = (char) (((((long) (c10 ^ cArr[i15])) ^ f3010) ^ ((long) f3012)) ^ ((long) f3011));
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

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Map<String, String> m2859(JSONObject jSONObject) {
        Map<String, String> mapM2860 = m2860(jSONObject, new a<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.kj.1
            @Override // com.ironsource.adqualitysdk.sdk.i.kj.a
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ String mo541(JSONObject jSONObject2, String str) {
                return jSONObject2.optString(str, null);
            }
        });
        f3008 = (f3009 + 39) % 128;
        return mapM2860;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static <T> Map<String, T> m2860(JSONObject jSONObject, a<T> aVar) {
        if (jSONObject != null) {
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            f3009 = (f3008 + 55) % 128;
            while (itKeys.hasNext()) {
                f3008 = (f3009 + 97) % 128;
                String next = itKeys.next();
                map.put(next, aVar.mo541(jSONObject, next));
            }
            return map;
        }
        int i10 = f3009 + InterfaceC0435l1.d.b.f29107d;
        f3008 = i10 % 128;
        if (i10 % 2 == 0) {
            return null;
        }
        throw null;
    }
}
