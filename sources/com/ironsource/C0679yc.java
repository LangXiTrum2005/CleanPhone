package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.yc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0679yc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f31314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f31315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f31316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final JSONObject f31317f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<String, JSONObject> f31318g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f31319h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f31320i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f31321j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private C0679yc f31322k;
    private final wj.d l;

    /* JADX INFO: renamed from: com.ironsource.yc$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a extends kotlin.jvm.internal.o implements jk.a {
        public a() {
            super(0);
        }

        @Override // jk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NetworkSettings invoke() {
            String strJ = C0679yc.this.j();
            String strL = C0679yc.this.l();
            String strH = C0679yc.this.h();
            String strK = C0679yc.this.k();
            JSONObject jSONObjectC = C0679yc.this.c();
            C0679yc c0679yc = C0679yc.this.f31322k;
            JSONObject jSONObjectB = IronSourceUtils.b(jSONObjectC, c0679yc != null ? c0679yc.c() : null);
            JSONObject jSONObjectM = C0679yc.this.m();
            C0679yc c0679yc2 = C0679yc.this.f31322k;
            JSONObject jSONObjectB2 = IronSourceUtils.b(jSONObjectM, c0679yc2 != null ? c0679yc2.m() : null);
            JSONObject jSONObjectE = C0679yc.this.e();
            C0679yc c0679yc3 = C0679yc.this.f31322k;
            JSONObject jSONObjectB3 = IronSourceUtils.b(jSONObjectE, c0679yc3 != null ? c0679yc3.e() : null);
            JSONObject jSONObjectD = C0679yc.this.d();
            C0679yc c0679yc4 = C0679yc.this.f31322k;
            JSONObject jSONObjectB4 = IronSourceUtils.b(jSONObjectD, c0679yc4 != null ? c0679yc4.d() : null);
            JSONObject jSONObjectG = C0679yc.this.g();
            C0679yc c0679yc5 = C0679yc.this.f31322k;
            NetworkSettings networkSettings = new NetworkSettings(strJ, strL, strH, strK, jSONObjectB, jSONObjectB2, jSONObjectB3, jSONObjectB4, IronSourceUtils.b(jSONObjectG, c0679yc5 != null ? c0679yc5.g() : null));
            networkSettings.setIsMultipleInstances(C0679yc.this.o());
            networkSettings.setSubProviderId(C0679yc.this.n());
            networkSettings.setAdSourceNameForEvents(C0679yc.this.b());
            return networkSettings;
        }
    }

    public C0679yc(String providerName, JSONObject networkSettings) {
        kotlin.jvm.internal.n.f(providerName, "providerName");
        kotlin.jvm.internal.n.f(networkSettings, "networkSettings");
        this.f31312a = providerName;
        this.f31313b = providerName;
        String strOptString = networkSettings.optString(C0697zc.f31355d, providerName);
        kotlin.jvm.internal.n.e(strOptString, "networkSettings.optStrin…,\n          providerName)");
        this.f31314c = strOptString;
        String strOptString2 = networkSettings.optString(C0697zc.f31357f, strOptString);
        kotlin.jvm.internal.n.e(strOptString2, "networkSettings.optStrin…roviderTypeForReflection)");
        this.f31315d = strOptString2;
        Object objOpt = networkSettings.opt("providerNetworkKey");
        this.f31316e = objOpt instanceof String ? (String) objOpt : null;
        this.f31317f = networkSettings.optJSONObject("application");
        LevelPlay.AdFormat[] adFormatArrValues = LevelPlay.AdFormat.values();
        ArrayList arrayList = new ArrayList(adFormatArrValues.length);
        for (LevelPlay.AdFormat adFormat : adFormatArrValues) {
            arrayList.add(If.a(adFormat));
        }
        int iO = xj.b0.O(xj.p.W(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iO < 16 ? 16 : iO);
        for (Object obj : arrayList) {
            String str = (String) obj;
            JSONObject jSONObjectOptJSONObject = networkSettings.optJSONObject("adFormats");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject(str) : null;
            if (jSONObjectOptJSONObject2 == null) {
                jSONObjectOptJSONObject2 = new JSONObject();
            }
            linkedHashMap.put(obj, jSONObjectOptJSONObject2);
        }
        this.f31318g = linkedHashMap;
        String strOptString3 = networkSettings.optString("spId", "0");
        kotlin.jvm.internal.n.e(strOptString3, "networkSettings.optStrin…B_PROVIDER_ID_FIELD, \"0\")");
        this.f31319h = strOptString3;
        String strOptString4 = networkSettings.optString(C0697zc.f31352a);
        kotlin.jvm.internal.n.e(strOptString4, "networkSettings.optString(AD_SOURCE_NAME_FIELD)");
        this.f31320i = strOptString4;
        this.f31321j = networkSettings.optBoolean(C0697zc.f31354c, false);
        this.l = r9.b.u(new a());
    }

    public final String b() {
        return this.f31320i;
    }

    public final JSONObject c() {
        return this.f31317f;
    }

    public final JSONObject d() {
        JSONObject jSONObjectB = IronSourceUtils.b(this.f31318g.get("banner"), this.f31317f);
        kotlin.jvm.internal.n.e(jSONObjectB, "mergeJsons(\n            …EY], applicationSettings)");
        return jSONObjectB;
    }

    public final JSONObject e() {
        JSONObject jSONObjectB = IronSourceUtils.b(this.f31318g.get("interstitial"), this.f31317f);
        kotlin.jvm.internal.n.e(jSONObjectB, "mergeJsons(\n            …EY], applicationSettings)");
        return jSONObjectB;
    }

    public final NetworkSettings f() {
        return (NetworkSettings) this.l.getValue();
    }

    public final JSONObject g() {
        JSONObject jSONObjectB = IronSourceUtils.b(this.f31318g.get("nativeAd"), this.f31317f);
        kotlin.jvm.internal.n.e(jSONObjectB, "mergeJsons(\n            …EY], applicationSettings)");
        return jSONObjectB;
    }

    public final String h() {
        return this.f31315d;
    }

    public final String i() {
        return this.f31313b;
    }

    public final String j() {
        return this.f31312a;
    }

    public final String k() {
        return this.f31316e;
    }

    public final String l() {
        return this.f31314c;
    }

    public final JSONObject m() {
        JSONObject jSONObjectB = IronSourceUtils.b(this.f31318g.get("rewarded"), this.f31317f);
        kotlin.jvm.internal.n.e(jSONObjectB, "mergeJsons(\n            …     applicationSettings)");
        return jSONObjectB;
    }

    public final String n() {
        return this.f31319h;
    }

    public final boolean o() {
        return this.f31321j;
    }

    public final Map<String, JSONObject> a() {
        return this.f31318g;
    }

    public final void b(C0679yc c0679yc) {
        this.f31322k = c0679yc;
    }
}
