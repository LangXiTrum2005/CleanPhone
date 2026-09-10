package com.ironsource;

import android.util.Base64;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.t8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3756t8 implements E7 {
    @Override // com.ironsource.E7
    public String a(Map<String, Object> map) {
        try {
            return String.format("%s=%s", "data", Base64.encodeToString(new JSONObject().put(A5.R, A5.S).put("data", new JSONObject(map)).toString().getBytes(), 2));
        } catch (JSONException e) {
            C3631m4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }
}
