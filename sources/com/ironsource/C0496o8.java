package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.o8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0496o8 implements InterfaceC0478n8, InterfaceC0478n8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f29915a = new JSONObject();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f29916b = new JSONObject();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f29917c = new JSONObject();

    private final Object e(String str) {
        if (this.f29917c.has(str)) {
            return this.f29917c.get(str);
        }
        if (this.f29916b.has(str)) {
            return this.f29916b.get(str);
        }
        if (this.f29915a.has(str)) {
            return this.f29915a.get(str);
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC0478n8
    public JSONObject a(String configKey) {
        kotlin.jvm.internal.n.f(configKey, "configKey");
        Object objE = e(configKey);
        if (objE instanceof JSONObject) {
            return (JSONObject) objE;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC0478n8
    public Integer b(String configKey) {
        kotlin.jvm.internal.n.f(configKey, "configKey");
        Object objE = e(configKey);
        if (objE instanceof Integer) {
            return (Integer) objE;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC0478n8
    public Boolean c(String configKey) {
        kotlin.jvm.internal.n.f(configKey, "configKey");
        Object objE = e(configKey);
        if (objE instanceof Boolean) {
            return (Boolean) objE;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC0478n8
    public String d(String configKey) {
        kotlin.jvm.internal.n.f(configKey, "configKey");
        Object objE = e(configKey);
        if (objE instanceof String) {
            return (String) objE;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC0478n8.a
    public void a(JSONObject controllerConfig) {
        kotlin.jvm.internal.n.f(controllerConfig, "controllerConfig");
        this.f29915a = controllerConfig;
        JSONObject jSONObjectOptJSONObject = controllerConfig.optJSONObject(X3.a.f27667b);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        this.f29916b = jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = this.f29915a.optJSONObject(X3.a.f27668c);
        if (jSONObjectOptJSONObject2 == null) {
            jSONObjectOptJSONObject2 = new JSONObject();
        }
        this.f29917c = jSONObjectOptJSONObject2;
    }
}
