package com.thinkup.network.inmobi;

import android.text.TextUtils;
import com.thinkup.core.api.TUBidRequestInfo;
import com.thinkup.core.api.TUInitMediation;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class InmobiRequestInfo extends TUBidRequestInfo {
    JSONObject o = new JSONObject();

    public InmobiRequestInfo(String str, Map<String, Object> map) {
        try {
            this.o.put("unit_id", TUInitMediation.getStringFromMap(map, "unit_id"));
            this.o.put("buyeruid", str);
        } catch (Throwable unused) {
        }
    }

    public void fillBannerData(Map<String, Object> map) {
        try {
            String stringFromMap = TUInitMediation.getStringFromMap(map, "size");
            if (TextUtils.isEmpty(stringFromMap)) {
                return;
            }
            String[] strArrSplit = stringFromMap.split("x");
            if (strArrSplit.length == 2) {
                this.o.put("ad_width", Integer.parseInt(strArrSplit[0]));
                this.o.put("ad_height", Integer.parseInt(strArrSplit[1]));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.thinkup.core.api.TUBidRequestInfo
    public JSONObject toRequestJSONObject() {
        return this.o;
    }
}
