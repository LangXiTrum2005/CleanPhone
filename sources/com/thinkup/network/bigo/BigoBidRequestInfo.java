package com.thinkup.network.bigo;

import android.text.TextUtils;
import com.thinkup.core.api.TUBidRequestInfo;
import com.thinkup.core.api.TUInitMediation;
import java.util.Map;
import org.json.JSONObject;
import sg.bigo.ads.BigoAdSdk;

/* JADX INFO: loaded from: classes6.dex */
public class BigoBidRequestInfo extends TUBidRequestInfo {
    JSONObject m = new JSONObject();
    String o;

    public BigoBidRequestInfo(Map<String, Object> map) {
        try {
            String stringFromMap = TUInitMediation.getStringFromMap(map, "app_id");
            String stringFromMap2 = TUInitMediation.getStringFromMap(map, "slot_id");
            this.o = BigoAdSdk.getBidderToken();
            this.m.put("app_id", stringFromMap);
            this.m.put("unit_id", stringFromMap2);
            this.m.put("bid_token", this.o);
        } catch (Throwable unused) {
        }
    }

    public void fillBannerData(Map<String, Object> map) {
        int i2;
        try {
            String stringFromMap = TUInitMediation.getStringFromMap(map, "size");
            if (TextUtils.isEmpty(stringFromMap)) {
                return;
            }
            String[] strArrSplit = stringFromMap.split("x");
            if (strArrSplit.length == 2) {
                int i3 = 0;
                try {
                    i2 = Integer.parseInt(strArrSplit[0]);
                } catch (Throwable th) {
                    th.printStackTrace();
                    i2 = 0;
                }
                try {
                    i3 = Integer.parseInt(strArrSplit[1]);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                this.m.put("ad_width", i2);
                this.m.put("ad_height", i3);
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
