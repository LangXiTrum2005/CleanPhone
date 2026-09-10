package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.oa, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0498oa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f29930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f29931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f29932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f29933d;

    public C0498oa(JSONObject jSONObject) {
        this.f29930a = jSONObject.optString(X3.g.f27746b);
        this.f29931b = jSONObject.optJSONObject(X3.g.f27747c);
        this.f29932c = jSONObject.optString("success");
        this.f29933d = jSONObject.optString(X3.g.f27749e);
    }

    public String a() {
        return this.f29933d;
    }

    public String b() {
        return this.f29930a;
    }

    public JSONObject c() {
        return this.f29931b;
    }

    public String d() {
        return this.f29932c;
    }

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(X3.g.f27746b, this.f29930a);
            jSONObject.put(X3.g.f27747c, this.f29931b);
            jSONObject.put("success", this.f29932c);
            jSONObject.put(X3.g.f27749e, this.f29933d);
            return jSONObject;
        } catch (JSONException e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return jSONObject;
        }
    }
}
