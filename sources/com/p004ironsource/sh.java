package com.p004ironsource;

import android.util.Base64;
import com.p004ironsource.mediationsdk.logger.IronLog;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class sh implements dg {
    @Override // com.p004ironsource.dg
    public String a(Map<String, Object> map) {
        try {
            return "data=" + Base64.encodeToString(new JSONObject().put(dc.f24777Q, dc.f24778R).put("data", new JSONObject(map)).toString().getBytes(), 2);
        } catch (JSONException e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return "";
        }
    }
}
