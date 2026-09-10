package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f3179 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char f3180 = 39880;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char f3181 = 64686;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f3182 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f3183 = 62486;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f3184 = 18272;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Map<String, y> f3187 = new HashMap();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Map<String, ac> f3185 = new HashMap();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Map<String, ad> f3186 = new HashMap();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Map m3076(w wVar) {
        int i10 = (f3182 + 87) % 128;
        f3179 = i10;
        Map<String, ac> map = wVar.f3185;
        int i11 = i10 + 99;
        f3182 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 54 / 0;
        }
        return map;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m3077(JSONObject jSONObject) {
        f3179 = (f3182 + InterfaceC0435l1.d.b.f29114k) % 128;
        String strM3080 = m3080(jSONObject);
        int i10 = f3179 + InterfaceC0435l1.d.b.f29114k;
        f3182 = i10 % 128;
        if (i10 % 2 == 0) {
            return strM3080;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Map m3079(w wVar) {
        int i10 = f3179;
        f3182 = (i10 + 63) % 128;
        Map<String, y> map = wVar.f3187;
        int i11 = i10 + 21;
        f3182 = i11 % 128;
        if (i11 % 2 == 0) {
            return map;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Map m3081(w wVar) {
        int i10 = (f3179 + 93) % 128;
        f3182 = i10;
        Map<String, ad> map = wVar.f3186;
        int i11 = i10 + 47;
        f3179 = i11 % 128;
        if (i11 % 2 != 0) {
            return map;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m3078(String str, int i10) {
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
                            char c10 = (char) (c4 - (((c5 + i12) ^ ((c5 << 4) + f3180)) ^ ((c5 >>> 5) + f3181)));
                            cArr3[1] = c10;
                            cArr3[0] = (char) (c5 - (((c10 >>> 5) + f3184) ^ ((c10 + i12) ^ ((c10 << 4) + f3183))));
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

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m3082() {
        p.m2998(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.w.1
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                ArrayList arrayList = new ArrayList(w.m3079(w.this).values());
                w.m3079(w.this).clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((y) it.next()).m3146();
                }
            }
        });
        int i10 = f3179 + InterfaceC0435l1.d.b.f29112i;
        f3182 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 51 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m3085(final JSONObject jSONObject, final v vVar) {
        p.m2998(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.w.4
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                String strM3077 = w.m3077(jSONObject);
                ac acVar = (ac) w.m3076(w.this).get(strM3077);
                if (acVar == null) {
                    acVar = new ac(jSONObject);
                    w.m3076(w.this).put(strM3077, acVar);
                } else {
                    acVar.m211(jSONObject);
                }
                acVar.m3075((t) vVar);
            }
        });
        f3179 = (f3182 + 21) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m3087(final JSONObject jSONObject, final l lVar, final js jsVar, final ja jaVar) {
        p.m2998(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.w.3
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                String strM3077 = w.m3077(jSONObject);
                y yVar = (y) w.m3079(w.this).get(strM3077);
                if (yVar == null) {
                    yVar = new y(jSONObject, jaVar);
                    w.m3079(w.this).put(strM3077, yVar);
                } else {
                    yVar.m3093(jaVar);
                    yVar.m3147(jSONObject);
                }
                yVar.m3075((t) lVar);
                yVar.m3148((jr) jsVar);
            }
        });
        f3179 = (f3182 + 125) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m3083(JSONObject jSONObject, q qVar) {
        f3179 = (f3182 + 123) % 128;
        m3088(jSONObject, qVar, null);
        int i10 = f3182 + 97;
        f3179 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m3084() {
        p.m2998(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.w.5
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                ArrayList arrayList = new ArrayList(w.m3076(w.this).values());
                w.m3076(w.this).clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ac) it.next()).m212();
                }
            }
        });
        f3179 = (f3182 + 77) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m3088(final JSONObject jSONObject, final q qVar, final jc jcVar) {
        p.m2998(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.w.2
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                String strM3077 = w.m3077(jSONObject);
                ad adVar = (ad) w.m3081(w.this).get(strM3077);
                if (adVar == null) {
                    adVar = new ad(jSONObject, jcVar);
                    w.m3081(w.this).put(strM3077, adVar);
                } else {
                    adVar.m243(jSONObject, jcVar);
                }
                adVar.m3075(qVar);
            }
        });
        int i10 = f3179 + 15;
        f3182 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 31 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m3086() {
        p.m2998(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.w.10
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                ArrayList arrayList = new ArrayList(w.m3081(w.this).values());
                w.m3081(w.this).clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ad) it.next()).m245();
                }
            }
        });
        int i10 = f3182 + 7;
        f3179 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m3080(JSONObject jSONObject) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(jSONObject.optString(m3078("味쥢ꃏ䠙뜋\ud972抩\udc58襣噪滖掱귇㨃", 14 - Drawable.resolveOpacity(0, 0)).intern()));
        sb2.append(m3078("䙺솢", 1 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern());
        sb2.append(jSONObject.optString(m3078("ﭬ턚噟㛳낚쫑嚝揗㙯檣볚쾮㟇ચ", 14 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern()));
        sb2.append(jSONObject.optString(m3078("嚝揗ﺹ쾡ּ脳神㺱䮆蕚䘋쎛詰뽬", View.MeasureSpec.getMode(0) + 13).intern()));
        sb2.append(jSONObject.optString(m3078("ﭬ턚㎆㬸ﺹ쾡ּ脳神㺱䮆蕚䘋쎛詰뽬", 14 - TextUtils.lastIndexOf("", '0', 0)).intern()));
        String string = sb2.toString();
        int i10 = f3182 + InterfaceC0435l1.d.b.f29105b;
        f3179 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 63 / 0;
        }
        return string;
    }
}
