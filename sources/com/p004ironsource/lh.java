package com.p004ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0007H\u0016R\u0016\u0010\u0010\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/ironsource/lh;", "Lcom/ironsource/kh;", "Lcom/ironsource/kh$a;", "", "configKey", "", "e", "Lorg/json/JSONObject;", "a", "", "c", "(Ljava/lang/String;)Ljava/lang/Boolean;", "", "b", "(Ljava/lang/String;)Ljava/lang/Integer;", "d", "controllerConfig", "", "Lorg/json/JSONObject;", d9.a.f24633b, d9.a.f24634c, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class lh implements kh, kh.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private JSONObject controllerConfig = new JSONObject();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private JSONObject networkConfig = new JSONObject();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private JSONObject epConfig = new JSONObject();

    private final Object e(String configKey) {
        JSONObject jSONObject;
        if (this.epConfig.has(configKey)) {
            jSONObject = this.epConfig;
        } else if (this.networkConfig.has(configKey)) {
            jSONObject = this.networkConfig;
        } else {
            if (!this.controllerConfig.has(configKey)) {
                return null;
            }
            jSONObject = this.controllerConfig;
        }
        return jSONObject.get(configKey);
    }

    @Override // com.p004ironsource.kh
    public JSONObject a(String configKey) {
        Intrinsics.f(configKey, "configKey");
        Object objE = e(configKey);
        if (objE instanceof JSONObject) {
            return (JSONObject) objE;
        }
        return null;
    }

    @Override // com.p004ironsource.kh
    public Integer b(String configKey) {
        Intrinsics.f(configKey, "configKey");
        Object objE = e(configKey);
        if (objE instanceof Integer) {
            return (Integer) objE;
        }
        return null;
    }

    @Override // com.p004ironsource.kh
    public Boolean c(String configKey) {
        Intrinsics.f(configKey, "configKey");
        Object objE = e(configKey);
        if (objE instanceof Boolean) {
            return (Boolean) objE;
        }
        return null;
    }

    @Override // com.p004ironsource.kh
    public String d(String configKey) {
        Intrinsics.f(configKey, "configKey");
        Object objE = e(configKey);
        if (objE instanceof String) {
            return (String) objE;
        }
        return null;
    }

    @Override // com.ironsource.kh.a
    public void a(JSONObject controllerConfig) {
        Intrinsics.f(controllerConfig, "controllerConfig");
        this.controllerConfig = controllerConfig;
        JSONObject jSONObjectOptJSONObject = controllerConfig.optJSONObject(d9.a.f24633b);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        this.networkConfig = jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = this.controllerConfig.optJSONObject(d9.a.f24634c);
        if (jSONObjectOptJSONObject2 == null) {
            jSONObjectOptJSONObject2 = new JSONObject();
        }
        this.epConfig = jSONObjectOptJSONObject2;
    }
}
