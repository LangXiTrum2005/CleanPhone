package com.ironsource;

import org.json.JSONObject;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.m8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3635m8 implements InterfaceC3617l8, InterfaceC3617l8.a {
    private JSONObject a = new JSONObject();
    private JSONObject b = new JSONObject();
    private JSONObject c = new JSONObject();

    private final Object e(String str) {
        if (this.c.has(str)) {
            return this.c.get(str);
        }
        if (this.b.has(str)) {
            return this.b.get(str);
        }
        if (this.a.has(str)) {
            return this.a.get(str);
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC3617l8
    public JSONObject a(String configKey) {
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        Object objE = e(configKey);
        if (objE instanceof JSONObject) {
            return (JSONObject) objE;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC3617l8
    public Integer b(String configKey) {
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        Object objE = e(configKey);
        if (objE instanceof Integer) {
            return (Integer) objE;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC3617l8
    public Boolean c(String configKey) {
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        Object objE = e(configKey);
        if (objE instanceof Boolean) {
            return (Boolean) objE;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC3617l8
    public String d(String configKey) {
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        Object objE = e(configKey);
        if (objE instanceof String) {
            return (String) objE;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC3617l8.a
    public void a(JSONObject controllerConfig) {
        Intrinsics.checkNotNullParameter(controllerConfig, "controllerConfig");
        this.a = controllerConfig;
        JSONObject jSONObjectOptJSONObject = controllerConfig.optJSONObject(X3.a.b);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        this.b = jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = this.a.optJSONObject(X3.a.c);
        if (jSONObjectOptJSONObject2 == null) {
            jSONObjectOptJSONObject2 = new JSONObject();
        }
        this.c = jSONObjectOptJSONObject2;
    }
}
