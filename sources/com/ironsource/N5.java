package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class N5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f26643a;

    public N5(JSONObject jSONObject) {
        this.f26643a = jSONObject;
    }

    public final Boolean a(String key) {
        kotlin.jvm.internal.n.f(key, "key");
        JSONObject jSONObject = this.f26643a;
        Object objOpt = jSONObject != null ? jSONObject.opt(key) : null;
        if (objOpt instanceof Boolean) {
            return (Boolean) objOpt;
        }
        return null;
    }

    public final Integer b(String key) {
        kotlin.jvm.internal.n.f(key, "key");
        JSONObject jSONObject = this.f26643a;
        Object objOpt = jSONObject != null ? jSONObject.opt(key) : null;
        if (objOpt instanceof Integer) {
            return (Integer) objOpt;
        }
        return null;
    }

    public final String c(String key) {
        kotlin.jvm.internal.n.f(key, "key");
        JSONObject jSONObject = this.f26643a;
        Object objOpt = jSONObject != null ? jSONObject.opt(key) : null;
        if (objOpt instanceof String) {
            return (String) objOpt;
        }
        return null;
    }
}
