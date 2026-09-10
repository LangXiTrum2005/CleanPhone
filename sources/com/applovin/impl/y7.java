package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class y7 implements s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10080b;

    private y7(String str, String str2) {
        this.f10079a = str;
        this.f10080b = str2;
    }

    public static y7 a(q8 q8Var, com.applovin.impl.sdk.l lVar) {
        if (q8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            return new y7((String) q8Var.a().get("apiFramework"), q8Var.d());
        } catch (Throwable th2) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().a("VastJavaScriptResource", "Error occurred while initializing", th2);
            }
            lVar.E().a("VastJavaScriptResource", th2);
            return null;
        }
    }

    public String b() {
        return this.f10079a;
    }

    public String c() {
        return this.f10080b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            y7 y7Var = (y7) obj;
            String str = this.f10079a;
            if (str == null ? y7Var.f10079a != null : !str.equals(y7Var.f10079a)) {
                return false;
            }
            String str2 = this.f10080b;
            if (str2 != null) {
                return str2.equals(y7Var.f10080b);
            }
            if (y7Var.f10080b == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f10079a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f10080b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VastJavaScriptResource{apiFramework='");
        sb2.append(this.f10079a);
        sb2.append("', javascriptResourceUrl='");
        return defpackage.e.q(this.f10080b, "'}", sb2);
    }

    public static y7 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (jSONObject == null) {
            return null;
        }
        return new y7(JsonUtils.getString(jSONObject, "api_framework", null), JsonUtils.getString(jSONObject, "javascript_resource_url", null));
    }

    @Override // com.applovin.impl.s4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "api_framework", this.f10079a);
        JsonUtils.putString(jSONObject, "javascript_resource_url", this.f10080b);
        return jSONObject;
    }
}
