package com.thinkup.network.startapp;

import android.content.Context;
import android.text.TextUtils;
import com.thinkup.core.api.TUBidRequestInfo;
import com.thinkup.core.api.TUInitMediation;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class StartAppBidRequestInfo extends TUBidRequestInfo {
    JSONObject m = new JSONObject();
    String o;

    public StartAppBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, String str, int i2) {
        String[] strArrSplit;
        try {
            String stringFromMap = TUInitMediation.getStringFromMap(map, "app_id");
            String stringFromMap2 = TUInitMediation.getStringFromMap(map, "ad_tag");
            this.o = str;
            this.m.put("app_id", stringFromMap);
            this.m.put("unit_id", stringFromMap2);
            this.m.put("bid_token", str);
            if (i2 == 2) {
                String stringFromMap3 = TUInitMediation.getStringFromMap(map, "size");
                if (TextUtils.isEmpty(stringFromMap3) || (strArrSplit = stringFromMap3.split("x")) == null || strArrSplit.length < 2) {
                    return;
                }
                int iIntValue = Integer.valueOf(strArrSplit[0]).intValue();
                int iIntValue2 = Integer.valueOf(strArrSplit[1]).intValue();
                this.m.put("ad_width", iIntValue);
                this.m.put("ad_height", iIntValue2);
            }
        } catch (Throwable unused) {
        }
    }

    public boolean isValid() {
        return !TextUtils.isEmpty(this.o);
    }

    @Override // com.thinkup.core.api.TUBidRequestInfo
    public JSONObject toRequestJSONObject() {
        return this.m;
    }
}
