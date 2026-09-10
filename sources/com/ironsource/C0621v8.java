package com.ironsource;

import android.util.Base64;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.v8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0621v8 implements G7 {
    @Override // com.ironsource.G7
    public String a(Map<String, Object> map) {
        try {
            return "data=" + Base64.encodeToString(new JSONObject().put(B5.R, B5.S).put("data", new JSONObject(map)).toString().getBytes(), 2);
        } catch (JSONException e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return "";
        }
    }
}
