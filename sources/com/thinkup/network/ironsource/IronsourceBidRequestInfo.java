package com.thinkup.network.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.p004ironsource.mediationsdk.IronSource;
import com.thinkup.core.api.TUBidRequestInfo;
import com.thinkup.core.api.TUSDKUtils;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class IronsourceBidRequestInfo extends TUBidRequestInfo {
    JSONObject m = new JSONObject();
    String o;

    public IronsourceBidRequestInfo(Context context, Map<String, Object> map) {
        try {
            String string = map.get("app_key").toString();
            String string2 = map.get("instance_id").toString();
            this.o = IronSource.getISDemandOnlyBiddingData(context);
            this.m.put("app_key", string);
            this.m.put("unit_id", string2);
            this.m.put("bid_token", this.o);
        } catch (Throwable unused) {
        }
    }

    public void fillAdSize(Context context, Map<String, Object> map, int i2) {
        JSONObject jSONObject = this.m;
        if (jSONObject == null) {
            return;
        }
        try {
            if (i2 != 1) {
                if (i2 == 2) {
                    String string = map.get("size").toString();
                    if (TextUtils.isEmpty(string) || !string.contains("x")) {
                        return;
                    }
                    String[] strArrSplit = string.split("x");
                    int i3 = Integer.parseInt(strArrSplit[0]);
                    int i4 = Integer.parseInt(strArrSplit[1]);
                    this.m.put("ad_width", i3);
                    this.m.put("ad_height", i4);
                    return;
                }
                if (i2 != 3) {
                    return;
                }
            }
            jSONObject.put("ad_width", TUSDKUtils.px2dip(context, context.getResources().getDisplayMetrics().widthPixels));
            this.m.put("ad_height", TUSDKUtils.px2dip(context, context.getResources().getDisplayMetrics().heightPixels));
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
