package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class Jg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f26365a = "errMsg";

    public static JSONObject a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errMsg", str);
            jSONObject.put("adViewId", str2);
            return jSONObject;
        } catch (JSONException e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return jSONObject;
        }
    }
}
