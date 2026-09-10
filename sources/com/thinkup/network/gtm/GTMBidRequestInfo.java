package com.thinkup.network.gtm;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.mbbid.out.BidManager;
import com.thinkup.core.api.TUBidRequestInfo;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class GTMBidRequestInfo extends TUBidRequestInfo {
    JSONObject m = new JSONObject();
    String o;

    public GTMBidRequestInfo(Context context, Map<String, Object> map, String str) {
        try {
            String string = map.get("appid").toString();
            String string2 = map.get("unitid").toString();
            this.o = BidManager.getBuyerUid(context);
            this.m.put("app_id", string);
            this.m.put("unit_id", string2);
            this.m.put("buyeruid", this.o);
            this.m.put("display_manager_ver", str);
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
                this.m.put("ad_width", Integer.parseInt(strArrSplit[0]));
                this.m.put("ad_height", Integer.parseInt(strArrSplit[1]));
            }
        } catch (Throwable unused) {
        }
    }

    public void fillNativeExpressData(Map<String, Object> map, Map<String, Object> map2) {
        int i2;
        try {
            if (TextUtils.equals(map.containsKey("unit_type") ? map.get("unit_type").toString() : "", "1")) {
                int i3 = 0;
                try {
                    i2 = Integer.parseInt(map2.get("key_width").toString());
                    try {
                        i3 = Integer.parseInt(map2.get("key_height").toString());
                    } catch (Throwable th) {
                        th = th;
                        th.printStackTrace();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i2 = 0;
                }
                if (i2 <= 0 || i3 <= 0) {
                    return;
                }
                this.m.put("ad_width", i2);
                this.m.put("ad_height", i3);
            }
        } catch (Throwable th3) {
            th3.printStackTrace();
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
