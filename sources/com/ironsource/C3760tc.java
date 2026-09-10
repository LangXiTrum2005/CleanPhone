package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.ironsource.tc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3760tc {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final JSONObject f;
    private final Map<String, JSONObject> g;
    private final String h;
    private final String i;
    private final boolean j;
    private C3760tc k;
    private final patroclinal.taiyuan l;

    /* JADX INFO: renamed from: com.ironsource.tc$a */
    public static final class a extends Lambda implements Function0<NetworkSettings> {
        public a() {
            super(0);
        }

        @Override // p002kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NetworkSettings invoke() {
            String strJ = C3760tc.this.j();
            String strL = C3760tc.this.l();
            String strH = C3760tc.this.h();
            String strK = C3760tc.this.k();
            JSONObject jSONObjectC = C3760tc.this.c();
            C3760tc c3760tc = C3760tc.this.k;
            JSONObject jSONObjectB = IronSourceUtils.b(jSONObjectC, c3760tc != null ? c3760tc.c() : null);
            JSONObject jSONObjectM = C3760tc.this.m();
            C3760tc c3760tc2 = C3760tc.this.k;
            JSONObject jSONObjectB2 = IronSourceUtils.b(jSONObjectM, c3760tc2 != null ? c3760tc2.m() : null);
            JSONObject jSONObjectE = C3760tc.this.e();
            C3760tc c3760tc3 = C3760tc.this.k;
            JSONObject jSONObjectB3 = IronSourceUtils.b(jSONObjectE, c3760tc3 != null ? c3760tc3.e() : null);
            JSONObject jSONObjectD = C3760tc.this.d();
            C3760tc c3760tc4 = C3760tc.this.k;
            JSONObject jSONObjectB4 = IronSourceUtils.b(jSONObjectD, c3760tc4 != null ? c3760tc4.d() : null);
            JSONObject jSONObjectG = C3760tc.this.g();
            C3760tc c3760tc5 = C3760tc.this.k;
            NetworkSettings networkSettings = new NetworkSettings(strJ, strL, strH, strK, jSONObjectB, jSONObjectB2, jSONObjectB3, jSONObjectB4, IronSourceUtils.b(jSONObjectG, c3760tc5 != null ? c3760tc5.g() : null));
            networkSettings.setIsMultipleInstances(C3760tc.this.o());
            networkSettings.setSubProviderId(C3760tc.this.n());
            networkSettings.setAdSourceNameForEvents(C3760tc.this.b());
            return networkSettings;
        }
    }

    public C3760tc(String providerName, JSONObject networkSettings) {
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
        this.a = providerName;
        this.b = providerName;
        String strOptString = networkSettings.optString(C3777uc.d, providerName);
        Intrinsics.checkNotNullExpressionValue(strOptString, "networkSettings.optStrin…,\n          providerName)");
        this.c = strOptString;
        String strOptString2 = networkSettings.optString(C3777uc.f, strOptString);
        Intrinsics.checkNotNullExpressionValue(strOptString2, "networkSettings.optStrin…roviderTypeForReflection)");
        this.d = strOptString2;
        Object objOpt = networkSettings.opt("providerNetworkKey");
        this.e = objOpt instanceof String ? (String) objOpt : null;
        this.f = networkSettings.optJSONObject("application");
        LevelPlay.AdFormat[] adFormatArrValues = LevelPlay.AdFormat.values();
        ArrayList arrayList = new ArrayList(adFormatArrValues.length);
        for (LevelPlay.AdFormat adFormat : adFormatArrValues) {
            arrayList.add(C3746sf.a(adFormat));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(p002kotlin.ranges.wireman.wireman(p002kotlin.collections.polder.marial(p002kotlin.collections.dovishness.gintrap(arrayList, 10)), 16));
        for (Object obj : arrayList) {
            String str = (String) obj;
            JSONObject jSONObjectOptJSONObject = networkSettings.optJSONObject("adFormats");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject(str) : null;
            if (jSONObjectOptJSONObject2 == null) {
                jSONObjectOptJSONObject2 = new JSONObject();
            }
            linkedHashMap.put(obj, jSONObjectOptJSONObject2);
        }
        this.g = linkedHashMap;
        String strOptString3 = networkSettings.optString("spId", "0");
        Intrinsics.checkNotNullExpressionValue(strOptString3, "networkSettings.optStrin…B_PROVIDER_ID_FIELD, \"0\")");
        this.h = strOptString3;
        String strOptString4 = networkSettings.optString(C3777uc.a);
        Intrinsics.checkNotNullExpressionValue(strOptString4, "networkSettings.optString(AD_SOURCE_NAME_FIELD)");
        this.i = strOptString4;
        this.j = networkSettings.optBoolean(C3777uc.c, false);
        this.l = p002kotlin.saneness.saneness(new a());
    }

    public final String b() {
        return this.i;
    }

    public final JSONObject c() {
        return this.f;
    }

    public final JSONObject d() {
        JSONObject jSONObjectB = IronSourceUtils.b(this.g.get("banner"), this.f);
        Intrinsics.checkNotNullExpressionValue(jSONObjectB, "mergeJsons(\n            …EY], applicationSettings)");
        return jSONObjectB;
    }

    public final JSONObject e() {
        JSONObject jSONObjectB = IronSourceUtils.b(this.g.get("interstitial"), this.f);
        Intrinsics.checkNotNullExpressionValue(jSONObjectB, "mergeJsons(\n            …EY], applicationSettings)");
        return jSONObjectB;
    }

    public final NetworkSettings f() {
        return (NetworkSettings) this.l.getValue();
    }

    public final JSONObject g() {
        JSONObject jSONObjectB = IronSourceUtils.b(this.g.get("nativeAd"), this.f);
        Intrinsics.checkNotNullExpressionValue(jSONObjectB, "mergeJsons(\n            …EY], applicationSettings)");
        return jSONObjectB;
    }

    public final String h() {
        return this.d;
    }

    public final String i() {
        return this.b;
    }

    public final String j() {
        return this.a;
    }

    public final String k() {
        return this.e;
    }

    public final String l() {
        return this.c;
    }

    public final JSONObject m() {
        JSONObject jSONObjectB = IronSourceUtils.b(this.g.get("rewarded"), this.f);
        Intrinsics.checkNotNullExpressionValue(jSONObjectB, "mergeJsons(\n            …     applicationSettings)");
        return jSONObjectB;
    }

    public final String n() {
        return this.h;
    }

    public final boolean o() {
        return this.j;
    }

    public final Map<String, JSONObject> a() {
        return this.g;
    }

    public final void b(C3760tc c3760tc) {
        this.k = c3760tc;
    }
}
