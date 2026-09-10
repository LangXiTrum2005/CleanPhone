package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class O3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0594u f26684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0594u f26685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final T2 f26686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rb f26687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final B1 f26688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<LevelPlay.AdFormat, C0594u> f26689f;

    public O3(JSONObject configurations) {
        kotlin.jvm.internal.n.f(configurations, "configurations");
        C0594u c0594u = new C0594u(a(configurations, "rewarded"));
        this.f26684a = c0594u;
        C0594u c0594u2 = new C0594u(a(configurations, "interstitial"));
        this.f26685b = c0594u2;
        this.f26686c = new T2(a(configurations, "banner"));
        this.f26687d = new Rb(a(configurations, "nativeAd"));
        JSONObject jSONObjectOptJSONObject = configurations.optJSONObject("application");
        this.f26688e = new B1(jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject);
        this.f26689f = xj.b0.Q(new wj.f(LevelPlay.AdFormat.INTERSTITIAL, c0594u2), new wj.f(LevelPlay.AdFormat.REWARDED, c0594u));
    }

    public final Map<LevelPlay.AdFormat, C0594u> a() {
        return this.f26689f;
    }

    public final B1 b() {
        return this.f26688e;
    }

    public final T2 c() {
        return this.f26686c;
    }

    public final Rb d() {
        return this.f26687d;
    }

    private final JSONObject a(JSONObject jSONObject, String str) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("adFormats");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject(str) : null;
        return jSONObjectOptJSONObject2 == null ? new JSONObject() : jSONObjectOptJSONObject2;
    }
}
