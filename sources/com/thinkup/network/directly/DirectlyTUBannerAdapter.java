package com.thinkup.network.directly;

import android.content.Context;
import com.smartdigimkt.sdk.api.SDMSDK;
import com.thinkup.network.adx.AdxTUBannerAdapter;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class DirectlyTUBannerAdapter extends AdxTUBannerAdapter {
    @Override // com.thinkup.core.api.TUBaseAdInternalAdapter
    public JSONObject getInnerBidToken(Context context, Map<String, Object> map, Map<String, String> map2) {
        return SDMSDK.getInstance().getSDMAdManager().getDirectlyBidTokenJSONObject(context, map, map2);
    }

    @Override // com.thinkup.network.adx.AdxTUBannerAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return "Directly";
    }
}
