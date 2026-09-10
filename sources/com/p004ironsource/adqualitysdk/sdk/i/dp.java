package com.p004ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.View;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class dp {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1735 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static long f1736 = 5895669425122557311L;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1737 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private Map<String, dt> f1738;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private Map<String, Cdo> f1739;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private List<dn> f1740;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private boolean f1741;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1742;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private List<String> f1743;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f1744;

    public dp(final String str, String str2, JSONObject jSONObject) {
        this.f1744 = dw.m2051(str2);
        this.f1742 = dw.m2051(jSONObject.optString(m1963("봌菫샍ƹ䚉", 16097 - ExpandableListView.getPackedPositionGroup(0L)).intern()));
        this.f1741 = jSONObject.optBoolean(m1963("봞䙐䮖䳬倹喟廒成", 64333 - ExpandableListView.getPackedPositionType(0L)).intern());
        this.f1743 = m1964(kc.m2764(jSONObject.optJSONArray(m1963("봒妵瑌ጐ⾦쩦\ue116", 58543 - TextUtils.indexOf("", "")).intern()), new kc.b<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.dp.5
            @Override // com.ironsource.adqualitysdk.sdk.i.kc.b
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ String mo535(JSONArray jSONArray, int i2) {
                return dw.m2051(jSONArray.optString(i2));
            }
        }));
        this.f1740 = m1964(kc.m2764(jSONObject.optJSONArray(m1963("봌ս췅鐿岓", TextUtils.lastIndexOf("", '0') + 47208).intern()), new kc.b<dn>() { // from class: com.ironsource.adqualitysdk.sdk.i.dp.3
            @Override // com.ironsource.adqualitysdk.sdk.i.kc.b
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ dn mo535(JSONArray jSONArray, int i2) {
                return new dn(jSONArray.optJSONObject(i2));
            }
        }));
        this.f1739 = m1965(kc.m2765(jSONObject.optJSONObject(m1963("봚\ue166ׄꡜ첷猧", View.MeasureSpec.makeMeasureSpec(0, 0) + 23663).intern()), new kc.c<Cdo>() { // from class: com.ironsource.adqualitysdk.sdk.i.dp.1
            @Override // com.ironsource.adqualitysdk.sdk.i.kc.c
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ Cdo mo534(JSONObject jSONObject2, String str3) {
                return new Cdo(jSONObject2.optJSONObject(str3));
            }
        }));
        this.f1738 = m1965(kc.m2765(jSONObject.optJSONObject(m1963("봒樻ፉ㡴\ue194躾럊", TextUtils.lastIndexOf("", '0', 0) + 55074).intern()), new kc.c<dt>() { // from class: com.ironsource.adqualitysdk.sdk.i.dp.2
            @Override // com.ironsource.adqualitysdk.sdk.i.kc.c
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ dt mo534(JSONObject jSONObject2, String str3) {
                return new dt(str, str3, jSONObject2.optJSONObject(str3));
            }
        }));
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static <T> List<T> m1964(List<T> list) {
        if (list != null) {
            f1737 = (f1735 + 33) % 128;
            return list;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = f1737 + 7;
        f1735 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 34 / 0;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static <K, V> Map<K, V> m1965(Map<K, V> map) {
        int i2 = f1735 + 31;
        f1737 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 22 / 0;
            if (map != null) {
                return map;
            }
        } else if (map != null) {
            return map;
        }
        HashMap map2 = new HashMap();
        f1735 = (f1737 + 25) % 128;
        return map2;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final List<dn> m1966() {
        int i2 = (f1735 + 101) % 128;
        f1737 = i2;
        List<dn> list = this.f1740;
        int i3 = i2 + 95;
        f1735 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 94 / 0;
        }
        return list;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final Map<String, Cdo> m1967() {
        int i2 = (f1737 + 125) % 128;
        f1735 = i2;
        Map<String, Cdo> map = this.f1739;
        f1737 = (i2 + 77) % 128;
        return map;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m1969() {
        int i2 = f1735 + 101;
        int i3 = i2 % 128;
        f1737 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.f1742;
        f1735 = (i3 + 49) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final Map<String, dt> m1971() {
        Map<String, dt> map;
        int i2 = f1737;
        int i3 = i2 + 117;
        f1735 = i3 % 128;
        if (i3 % 2 != 0) {
            map = this.f1738;
            int i4 = 4 / 0;
        } else {
            map = this.f1738;
        }
        f1735 = (i2 + 33) % 128;
        return map;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m1972() {
        int i2 = (f1735 + 19) % 128;
        f1737 = i2;
        boolean z2 = this.f1741;
        int i3 = i2 + 111;
        f1735 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 9 / 0;
        }
        return z2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final List<String> m1968() {
        int i2 = f1737 + 111;
        f1735 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f1743;
        }
        int i3 = 58 / 0;
        return this.f1743;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1963(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2055) {
            try {
                g.f2056 = i2;
                char[] cArr2 = new char[cArr.length];
                g.f2054 = 0;
                while (true) {
                    int i3 = g.f2054;
                    if (i3 < cArr.length) {
                        cArr2[i3] = (char) (((long) (cArr[i3] ^ (g.f2056 * i3))) ^ f1736);
                        g.f2054++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m1970() {
        String str;
        int i2 = f1737;
        int i3 = i2 + 93;
        f1735 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.f1744;
            int i4 = 78 / 0;
        } else {
            str = this.f1744;
        }
        f1735 = (i2 + 33) % 128;
        return str;
    }
}
