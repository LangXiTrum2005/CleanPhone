package com.mbridge.msdk.newreward.function.proxy;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.newreward.function.common.MBridgeSharedPreferenceModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a {
    public static c a() {
        c cVar = new c();
        String string = MBridgeSharedPreferenceModel.getInstance().getString(MBridgeConstans.SP_DYNAMIC_METRICS_REPORT, "");
        if (TextUtils.isEmpty(string)) {
            return cVar;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            int iOptInt = jSONObject.optInt("version", -1);
            if (iOptInt == -1) {
                return cVar;
            }
            String strOptString = jSONObject.optString("name", "");
            JSONArray jSONArray = jSONObject.getJSONArray("report");
            d[] dVarArr = new d[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    if (jSONObject2 != null) {
                        String strOptString2 = jSONObject2.optString("key", "");
                        String strOptString3 = jSONObject2.optString("classname", "");
                        String strOptString4 = jSONObject2.optString("method", "");
                        if (!TextUtils.isEmpty(strOptString2)) {
                            dVarArr[i] = new d(strOptString3, strOptString4, strOptString2);
                        }
                    }
                } catch (JSONException e) {
                    if (MBridgeConstans.DEBUG) {
                        e.printStackTrace();
                    }
                }
            }
            cVar.a(strOptString);
            cVar.a(iOptInt);
            cVar.a(dVarArr);
            return cVar;
        } catch (JSONException e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }
}
