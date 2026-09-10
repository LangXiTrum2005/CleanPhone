package com.thinkup.network.vungle;

import android.content.Context;
import com.thinkup.core.api.TUBidRequestInfo;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class VungleBidRequestInfo extends TUBidRequestInfo {
    JSONObject o = new JSONObject();

    public VungleBidRequestInfo(Context context, Map<String, Object> map, String str) {
        try {
            String string = map.get("account_id").toString();
            String string2 = map.get("app_id").toString();
            String string3 = map.get("placement_id").toString();
            this.o.put("app_id", string2);
            this.o.put("unit_id", string3);
            this.o.put("account_id", string);
            this.o.put("bid_token", str);
        } catch (Throwable unused) {
        }
    }

    @Override // com.thinkup.core.api.TUBidRequestInfo
    public JSONObject toRequestJSONObject() {
        return this.o;
    }
}
