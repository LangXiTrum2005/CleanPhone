package com.thinkup.network.adx;

import com.thinkup.core.api.TUBidRequestInfo;
import com.thinkup.core.api.TUInitMediation;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class AdxBidRequestInfo extends TUBidRequestInfo {
    private JSONObject o;

    public AdxBidRequestInfo(JSONObject jSONObject) {
        this.o = jSONObject;
    }

    public void fillLocalExtra(Map<String, Object> map, boolean z2) {
        int intFromMap;
        int intFromMap2;
        if (z2) {
            if (map != null) {
                try {
                    intFromMap = TUInitMediation.getIntFromMap(map, "key_width");
                    intFromMap2 = TUInitMediation.getIntFromMap(map, "key_height");
                } catch (Throwable unused) {
                    return;
                }
            } else {
                intFromMap = -1;
                intFromMap2 = -1;
            }
            if (intFromMap > 0) {
                this.o.put("ad_width", intFromMap);
            }
            if (intFromMap2 > 0) {
                this.o.put("ad_height", intFromMap2);
            }
        }
    }

    @Override // com.thinkup.core.api.TUBidRequestInfo
    public JSONObject toRequestJSONObject() {
        return this.o;
    }
}
