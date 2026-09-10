package com.thinkup.network.pangle;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.thinkup.core.api.TUBidRequestInfo;
import com.thinkup.core.api.TUSDKUtils;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class PangleBidRequestInfo extends TUBidRequestInfo {
    JSONObject m = new JSONObject();
    String o;

    public PangleBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, String str, boolean z2) {
        try {
            String string = map.get("app_id").toString();
            String string2 = map.get("slot_id").toString();
            this.o = str;
            this.m.put("app_id", string);
            this.m.put("unit_id", string2);
            this.m.put("buyeruid", str);
            if (z2) {
                PAGBannerSize bannerSize = PangleTUInitManager.getInstance().getBannerSize(context, map, map2);
                int width = bannerSize.getWidth();
                int height = bannerSize.getHeight();
                int iDip2px = TUSDKUtils.dip2px(context, width);
                int iDip2px2 = TUSDKUtils.dip2px(context, height);
                this.m.put("ad_width", iDip2px);
                this.m.put("ad_height", iDip2px2);
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
