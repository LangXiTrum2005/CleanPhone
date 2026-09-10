package com.smartdigimkt.sdk.api;

import android.content.Context;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public interface ISDMAdManager {

    public interface BidTokenCallBack {
        void onComplete(JSONObject jSONObject);
    }

    void getBidTokenJSONObject(Map<String, Object> map, BidTokenCallBack bidTokenCallBack);

    JSONObject getDirectlyBidTokenJSONObject(Context context, Map<String, Object> map, Map<String, String> map2);
}
