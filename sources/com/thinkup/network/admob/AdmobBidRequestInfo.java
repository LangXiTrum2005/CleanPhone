package com.thinkup.network.admob;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.thinkup.core.api.TUBidRequestInfo;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class AdmobBidRequestInfo extends TUBidRequestInfo {
    JSONObject o;

    public AdmobBidRequestInfo(Context context, String str, Map<String, Object> map, Map<String, Object> map2, AdFormat adFormat) {
        try {
            this.o = new JSONObject();
            this.o.put("unit_id", map.get("unit_id").toString());
            this.o.put("buyeruid", str);
            if (adFormat == AdFormat.BANNER) {
                AdSize adSizeO = AdmobTUConst.o(context, map2, map);
                int width = (adSizeO == null || adSizeO.getWidth() <= 0) ? Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE : adSizeO.getWidth();
                int height = (adSizeO == null || adSizeO.getHeight() <= 0) ? 50 : adSizeO.getHeight();
                this.o.put("ad_width", width);
                this.o.put("ad_height", height);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.thinkup.core.api.TUBidRequestInfo
    public JSONObject toRequestJSONObject() {
        return this.o;
    }
}
