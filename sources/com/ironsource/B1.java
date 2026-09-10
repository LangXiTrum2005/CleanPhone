package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class B1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Gb f25681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final I1 f25682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f25683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F1 f25684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final M1 f25685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C0686z1 f25686f;

    public B1(JSONObject applicationConfigurations) {
        kotlin.jvm.internal.n.f(applicationConfigurations, "applicationConfigurations");
        JSONObject jSONObjectOptJSONObject = applicationConfigurations.optJSONObject(D1.f25916a);
        this.f25681a = new Gb(jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject);
        JSONObject jSONObjectOptJSONObject2 = applicationConfigurations.optJSONObject("events");
        this.f25682b = new I1(jSONObjectOptJSONObject2 == null ? new JSONObject() : jSONObjectOptJSONObject2);
        this.f25683c = applicationConfigurations.optBoolean(D1.f25922g, false);
        JSONObject jSONObjectOptJSONObject3 = applicationConfigurations.optJSONObject(D1.f25923h);
        this.f25684d = new F1(jSONObjectOptJSONObject3 == null ? new JSONObject() : jSONObjectOptJSONObject3);
        JSONObject jSONObjectOptJSONObject4 = applicationConfigurations.optJSONObject("settings");
        this.f25685e = new M1(jSONObjectOptJSONObject4 == null ? new JSONObject() : jSONObjectOptJSONObject4);
        JSONObject jSONObjectOptJSONObject5 = applicationConfigurations.optJSONObject(D1.f25921f);
        this.f25686f = new C0686z1(jSONObjectOptJSONObject5 == null ? new JSONObject() : jSONObjectOptJSONObject5);
    }

    public final C0686z1 a() {
        return this.f25686f;
    }

    public final F1 b() {
        return this.f25684d;
    }

    public final I1 c() {
        return this.f25682b;
    }

    public final M1 d() {
        return this.f25685e;
    }

    public final boolean e() {
        return this.f25683c;
    }

    public final Gb f() {
        return this.f25681a;
    }
}
