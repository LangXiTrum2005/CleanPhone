package com.p004ironsource;

import com.p004ironsource.mediationsdk.logger.IronLog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ex {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f24948a = "errMsg";

    public static JSONObject a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errMsg", str);
            jSONObject.put("adViewId", str2);
            return jSONObject;
        } catch (JSONException e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return jSONObject;
        }
    }
}
