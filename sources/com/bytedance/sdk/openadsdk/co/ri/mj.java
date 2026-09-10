package com.bytedance.sdk.openadsdk.co.ri;

import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.ironsource.X3;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class mj extends com.bytedance.sdk.component.ri.nr<JSONObject, JSONObject> {
    public static final HashSet<String> ri = new HashSet<>(Arrays.asList("appInfo", "adInfo", "sendLog", "playable_style", "getTemplateInfo", "getTeMaiAds", X3.i.o, "getScreenSize", "getCloseButtonInfo", "getVolume", "removeLoading", "sendReward", "subscribe_app_ad", "download_app_ad", "cancel_download_app_ad", "unsubscribe_app_ad", "landscape_click", "clickEvent", "renderDidFinish", "dynamicTrack", "skipVideo", "muteVideo", "changeVideoState", "getCurrentVideoState", "send_temai_product_ids", "getMaterialMeta", "endcard_load", "pauseWebView", "pauseWebViewTimers", "webview_time_track", "getDownloadStatus", "openPrivacy", "openAdLandPageLinks", "getNativeSiteCustomData", "close"));
    private final dzy lr;

    public mj(dzy dzyVar) {
        this.lr = dzyVar;
    }

    public static void ri(com.bytedance.sdk.component.ri.vr vrVar, dzy dzyVar) {
        vrVar.ri(ri, new mj(dzyVar));
    }

    @Override // com.bytedance.sdk.component.ri.ka
    public JSONObject ri(String str, JSONObject jSONObject, com.bytedance.sdk.component.ri.fi fiVar) throws Exception {
        dzy.lr lrVar = new dzy.lr();
        lrVar.ri = NotificationCompat.CATEGORY_CALL;
        lrVar.ik = str;
        lrVar.ka = jSONObject;
        return this.lr.ri(lrVar, 3);
    }
}
