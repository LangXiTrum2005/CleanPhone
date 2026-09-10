package com.thinkup.network.facebook;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.BidderTokenProvider;
import com.thinkup.core.api.TUBidRequestInfo;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class FacebookBidRequestInfo extends TUBidRequestInfo {
    JSONObject m = new JSONObject();
    String o;

    public FacebookBidRequestInfo(Context context, Map<String, Object> map) {
        Object obj;
        try {
            String string = map.get("app_id").toString();
            String string2 = map.get("unit_id").toString();
            this.o = BidderTokenProvider.getBidderToken(context);
            this.m.put("app_id", string);
            this.m.put("unit_id", string2);
            this.m.put("buyeruid", this.o);
            if (!map.containsKey("unit_type") || (obj = map.get("unit_type")) == null) {
                return;
            }
            this.m.put("unit_type", Integer.parseInt(obj.toString()));
        } catch (Throwable unused) {
        }
    }

    public void fillBannerData(Map<String, Object> map) {
        try {
            String string = map.get("size").toString();
            if (TextUtils.isEmpty(string)) {
                return;
            }
            String[] strArrSplit = string.split("x");
            if (strArrSplit.length == 2) {
                int i2 = 0;
                try {
                    Integer.parseInt(strArrSplit[0]);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                try {
                    i2 = Integer.parseInt(strArrSplit[1]);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                this.m.put("ad_height", i2);
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
