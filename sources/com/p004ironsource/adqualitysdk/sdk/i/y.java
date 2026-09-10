package com.p004ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class y {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f3061 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f3062 = -1199201337393076760L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f3063;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Map<String, v> f3066 = new HashMap();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Map<String, aa> f3064 = new HashMap();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Map<String, z> f3065 = new HashMap();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Map m3007(y yVar) {
        int i2 = f3063;
        f3061 = (i2 + 55) % 128;
        Map<String, aa> map = yVar.f3064;
        int i3 = i2 + 93;
        f3061 = i3 % 128;
        if (i3 % 2 != 0) {
            return map;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Map m3008(y yVar) {
        int i2 = f3063;
        int i3 = i2 + 119;
        f3061 = i3 % 128;
        int i4 = i3 % 2;
        Map<String, v> map = yVar.f3066;
        if (i4 == 0) {
            throw null;
        }
        f3061 = (i2 + 5) % 128;
        return map;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Map m3011(y yVar) {
        int i2 = f3063 + 43;
        f3061 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, z> map = yVar.f3065;
        if (i3 != 0) {
            return map;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m3012(JSONObject jSONObject) {
        int i2 = f3061 + 95;
        f3063 = i2 % 128;
        if (i2 % 2 == 0) {
            return m3010(jSONObject);
        }
        m3010(jSONObject);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m3015(final JSONObject jSONObject, final u uVar) {
        s.m2922(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.y.1
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                String strM3012 = y.m3012(jSONObject);
                aa aaVar = (aa) y.m3007(y.this).get(strM3012);
                if (aaVar == null) {
                    aaVar = new aa(jSONObject);
                    y.m3007(y.this).put(strM3012, aaVar);
                } else {
                    aaVar.m233(jSONObject);
                }
                aaVar.m3006((p) uVar);
            }
        });
        f3061 = (f3063 + 111) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m3013() {
        s.m2922(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.y.5
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                ArrayList arrayList = new ArrayList(y.m3008(y.this).values());
                y.m3008(y.this).clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((v) it.next()).m2951();
                }
            }
        });
        int i2 = f3061 + 107;
        f3063 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m3014() {
        s.m2922(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.y.3
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                ArrayList arrayList = new ArrayList(y.m3007(y.this).values());
                y.m3007(y.this).clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((aa) it.next()).m228();
                }
            }
        });
        int i2 = f3063 + 121;
        f3061 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m3017(final JSONObject jSONObject, final t tVar, final is isVar) {
        s.m2922(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.y.2
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                String strM3012 = y.m3012(jSONObject);
                z zVar = (z) y.m3011(y.this).get(strM3012);
                if (zVar == null) {
                    zVar = new z(jSONObject, isVar);
                    y.m3011(y.this).put(strM3012, zVar);
                } else {
                    zVar.m3037(jSONObject, isVar);
                }
                zVar.m3006(tVar);
            }
        });
        int i2 = f3061 + 19;
        f3063 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m3018(final JSONObject jSONObject, final l lVar, final jf jfVar, final iq iqVar) {
        s.m2922(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.y.4
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                String strM3012 = y.m3012(jSONObject);
                v vVar = (v) y.m3008(y.this).get(strM3012);
                if (vVar == null) {
                    vVar = new v(jSONObject, iqVar);
                    y.m3008(y.this).put(strM3012, vVar);
                } else {
                    vVar.m2978(iqVar);
                    vVar.m2958(jSONObject);
                }
                vVar.m3006((p) lVar);
                vVar.m2955(jfVar);
            }
        });
        int i2 = f3063 + 81;
        f3061 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m3009(String str, int i2) {
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
                        cArr2[i3] = (char) (((long) (cArr[i3] ^ (g.f2056 * i3))) ^ f3062);
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

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m3016() {
        s.m2922(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.y.9
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                ArrayList arrayList = new ArrayList(y.m3011(y.this).values());
                y.m3011(y.this).clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((z) it.next()).m3038();
                }
            }
        });
        f3061 = (f3063 + 93) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m3019(JSONObject jSONObject, t tVar) {
        int i2 = f3063 + 57;
        f3061 = i2 % 128;
        int i3 = i2 % 2;
        m3017(jSONObject, tVar, null);
        if (i3 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m3010(JSONObject jSONObject) {
        StringBuilder sb = new StringBuilder();
        sb.append(jSONObject.optString(m3009("▁좁ﾒ\ue298醓蒹ꮣ庭䶹炸柀૮㧙Ⳋ", 60679 - TextUtils.getTrimmedLength("")).intern()));
        sb.append(m3009("◆", 32490 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern());
        sb.append(jSONObject.optString(m3009("▉﮷駟뼺嵰犦ჼ㘜푄\uf582诨꤀佁浲", 56891 - View.resolveSize(0, 0)).intern()));
        sb.append(jSONObject.optString(m3009("▞\udc1c횷쥈쏟얕ﰧ\uf6d0\ue973\ue323\ue5ab鰺雑", (ViewConfiguration.getJumpTapTimeout() >> 16) + 63901).intern()));
        sb.append(jSONObject.optString(m3009("▉캽\uf3dc\ue412襉뉪ꚍ䯓簁愢ੱ㺽⏅퓸藍", 60209 - View.resolveSizeAndState(0, 0, 0)).intern()));
        String string = sb.toString();
        int i2 = f3063 + 47;
        f3061 = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        throw null;
    }
}
