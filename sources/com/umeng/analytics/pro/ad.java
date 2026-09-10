package com.umeng.analytics.pro;

import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ad extends ab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f2484a;
    private String b;

    public ad(String str, ArrayList<ac> arrayList) {
        super(str, arrayList);
        this.f2484a = "";
        this.b = "";
    }

    @Override // com.umeng.analytics.pro.ab, com.umeng.analytics.pro.aj
    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObjectA = super.a(str, jSONObject);
        if (jSONObjectA != null) {
            try {
                jSONObjectA.put(com.umeng.ccg.a.v, this.f2484a);
                jSONObjectA.put(com.umeng.ccg.a.w, this.b);
            } catch (Throwable unused) {
            }
        }
        return jSONObjectA;
    }

    @Override // com.umeng.analytics.pro.ab, com.umeng.analytics.pro.aj
    public void b(String str, JSONObject jSONObject) {
        super.b(str, jSONObject);
        if (jSONObject.has(com.umeng.ccg.a.w)) {
            d(jSONObject.optString(com.umeng.ccg.a.w));
        }
        if (jSONObject.has(com.umeng.ccg.a.v)) {
            c(jSONObject.optString(com.umeng.ccg.a.v));
        }
    }

    public void c(String str) {
        this.f2484a = str;
    }

    public String d() {
        return this.f2484a;
    }

    public String e() {
        return this.b;
    }

    public void d(String str) {
        this.b = str;
    }
}
