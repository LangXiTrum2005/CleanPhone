package com.mbridge.msdk.newreward.function.command.receiver.concretereceiver;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class f implements com.mbridge.msdk.newreward.function.command.receiver.e {
    public Object a(Object obj) {
        if (obj == null) {
            return null;
        }
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map == null) {
            return null;
        }
        com.mbridge.msdk.newreward.adapter.e eVar = (com.mbridge.msdk.newreward.adapter.e) map.get("adapter_model");
        long jLongValue = ((Long) map.get("last_response_empty_time")).longValue();
        if (eVar == null) {
            return null;
        }
        HashMap map2 = new HashMap();
        if (TextUtils.isEmpty(eVar.f()) && eVar.O() != null && eVar.O().c() != null) {
            if (System.currentTimeMillis() - jLongValue < eVar.O().c().p() * 1000) {
                map2.put("error_code", "-1");
                map2.put(NotificationCompat.CATEGORY_MESSAGE, "EXCEPTION_RETURN_EMPTY");
                return map2;
            }
        }
        com.mbridge.msdk.foundation.same.net.e eVarB = com.mbridge.msdk.foundation.same.net.utils.c.b().b(eVar.e(), eVar.R(), eVar.G(), eVar.f(), eVar.d() + "");
        if (eVarB != null) {
            try {
                JSONObject jSONObject = new JSONObject(eVarB.c.toString());
                jSONObject.optInt(NotificationCompat.CATEGORY_STATUS);
                jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
                map2.put("error_code", jSONObject.optInt(NotificationCompat.CATEGORY_STATUS) + "");
                map2.put(NotificationCompat.CATEGORY_MESSAGE, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
            } catch (JSONException e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
        return map2;
    }
}
