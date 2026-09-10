package com.p004ironsource;

import com.p004ironsource.mediationsdk.logger.IronLog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class zk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f27927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f27928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f27929c;
    private String d;

    public zk(JSONObject jSONObject) {
        this.f27927a = jSONObject.optString(d9.f.f24674b);
        this.f27928b = jSONObject.optJSONObject(d9.f.f24675c);
        this.f27929c = jSONObject.optString("success");
        this.d = jSONObject.optString("fail");
    }

    public String a() {
        return this.d;
    }

    public String b() {
        return this.f27927a;
    }

    public JSONObject c() {
        return this.f27928b;
    }

    public String d() {
        return this.f27929c;
    }

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(d9.f.f24674b, this.f27927a);
            jSONObject.put(d9.f.f24675c, this.f27928b);
            jSONObject.put("success", this.f27929c);
            jSONObject.put("fail", this.d);
            return jSONObject;
        } catch (JSONException e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return jSONObject;
        }
    }
}
