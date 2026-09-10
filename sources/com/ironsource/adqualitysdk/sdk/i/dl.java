package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class dl {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f1750 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char[] f1751 = {'s', 26684, 53474, 14526, 41302, 'a', 26667, 53473, 14511, 41302, 2316, 29141, 55691, 'm', 26668, 53503, 14521, 41281, 2335, 29125, 29356, 6899, 41529, 19057, 54155, 19140, 8862, 39510, 29204, 60401, 17343, 'm', 26668, 53478, 14515, 41291, 2313, 29125, '\n', 26691};

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static long f1752 = -5139470497520129975L;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1753;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private Map<String, dh> f1754;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private Map<String, dz> f1755;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f1756;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private List<dm> f1757;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1758;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f1759;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private List<String> f1760;

    public dl(final String str, String str2, JSONObject jSONObject) {
        this.f1758 = eb.m2127(str2);
        this.f1759 = eb.m2127(jSONObject.optString(m2016((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 5).intern()));
        this.f1756 = jSONObject.optBoolean(m2016((char) View.MeasureSpec.getMode(0), 5 - (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.indexOf("", "", 0) + 8).intern());
        this.f1760 = m2015(kj.m2866(jSONObject.optJSONArray(m2016((char) (Color.rgb(0, 0, 0) + 16777216), 13 - (ViewConfiguration.getWindowTouchSlop() >> 8), 7 - ((Process.getThreadPriority(0) + 20) >> 6)).intern()), new kj.e<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.dl.1
            @Override // com.ironsource.adqualitysdk.sdk.i.kj.e
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ String mo542(JSONArray jSONArray, int i10) {
                return eb.m2127(jSONArray.optString(i10));
            }
        }));
        this.f1757 = m2015(kj.m2866(jSONObject.optJSONArray(m2016((char) (29407 - View.MeasureSpec.getMode(0)), (-16777196) - Color.rgb(0, 0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 4).intern()), new kj.e<dm>() { // from class: com.ironsource.adqualitysdk.sdk.i.dl.2
            @Override // com.ironsource.adqualitysdk.sdk.i.kj.e
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ dm mo542(JSONArray jSONArray, int i10) {
                return new dm(jSONArray.optJSONObject(i10));
            }
        }));
        this.f1754 = m2014(kj.m2860(jSONObject.optJSONObject(m2016((char) (19105 - ((Process.getThreadPriority(0) + 20) >> 6)), 24 - TextUtils.indexOf((CharSequence) "", '0'), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 6).intern()), new kj.a<dh>() { // from class: com.ironsource.adqualitysdk.sdk.i.dl.4
            @Override // com.ironsource.adqualitysdk.sdk.i.kj.a
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ dh mo541(JSONObject jSONObject2, String str3) {
                return new dh(jSONObject2.optJSONObject(str3));
            }
        }));
        final dz[] dzVarArr = {null};
        this.f1755 = m2014(kj.m2860(jSONObject.optJSONObject(m2016((char) (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.getTrimmedLength("") + 31, (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 7).intern()), new kj.a<dz>() { // from class: com.ironsource.adqualitysdk.sdk.i.dl.5
            @Override // com.ironsource.adqualitysdk.sdk.i.kj.a
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ dz mo541(JSONObject jSONObject2, String str3) {
                dz dzVar = new dz(str, dl.m2017(dl.this), str3, jSONObject2.optJSONObject(str3), dzVarArr[0]);
                dzVarArr[0] = dzVar;
                return dzVar;
            }
        }));
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static <K, V> Map<K, V> m2014(Map<K, V> map) {
        if (map != null) {
            f1750 = (f1753 + 17) % 128;
            return map;
        }
        HashMap map2 = new HashMap();
        int i10 = f1750 + 15;
        f1753 = i10 % 128;
        if (i10 % 2 == 0) {
            return map2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static <T> List<T> m2015(List<T> list) {
        int i10 = (f1753 + 89) % 128;
        f1750 = i10;
        if (list == null) {
            return new ArrayList();
        }
        int i11 = i10 + 33;
        f1753 = i11 % 128;
        if (i11 % 2 == 0) {
            return list;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m2017(dl dlVar) {
        int i10 = (f1753 + 27) % 128;
        f1750 = i10;
        String str = dlVar.f1758;
        f1753 = (i10 + InterfaceC0435l1.d.b.f29114k) % 128;
        return str;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList(this.f1755.values());
        Collections.sort(arrayList, new Comparator<dz>() { // from class: com.ironsource.adqualitysdk.sdk.i.dl.3
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(dz dzVar, dz dzVar2) {
                return dzVar.m2112() - dzVar2.m2112();
            }
        });
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f1753 = (f1750 + 69) % 128;
            sb2.append(((dz) it.next()).toString());
            sb2.append(m2016((char) (ViewConfiguration.getTouchSlop() >> 8), TextUtils.indexOf((CharSequence) "", '0') + 39, 2 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern());
            f1753 = (f1750 + 61) % 128;
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final List<dm> m2018() {
        int i10 = f1750 + 41;
        f1753 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f1757;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final Map<String, dh> m2019() {
        int i10 = f1750;
        Map<String, dh> map = this.f1754;
        f1753 = (i10 + 33) % 128;
        return map;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final Map<String, dz> m2020() {
        int i10 = f1753;
        Map<String, dz> map = this.f1755;
        f1750 = (i10 + 23) % 128;
        return map;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m2021() {
        int i10 = f1750 + 3;
        f1753 = i10 % 128;
        int i11 = i10 % 2;
        boolean z10 = this.f1756;
        if (i11 != 0) {
            int i12 = 52 / 0;
        }
        return z10;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m2022() {
        int i10 = f1753 + 71;
        int i11 = i10 % 128;
        f1750 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        String str = this.f1759;
        f1753 = (i11 + 23) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final List<String> m2023() {
        int i10 = (f1753 + 89) % 128;
        f1750 = i10;
        List<String> list = this.f1760;
        int i11 = i10 + 97;
        f1753 = i11 % 128;
        if (i11 % 2 == 0) {
            return list;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m2024() {
        int i10 = f1753;
        String str = this.f1758;
        f1750 = (i10 + 97) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2016(char c4, int i10, int i11) {
        String str;
        synchronized (c.f1153) {
            try {
                char[] cArr = new char[i11];
                c.f1154 = 0;
                while (true) {
                    int i12 = c.f1154;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f1751[i10 + i12]) ^ (((long) i12) * f1752)) ^ ((long) c4));
                        c.f1154 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
