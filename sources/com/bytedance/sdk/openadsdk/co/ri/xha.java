package com.bytedance.sdk.openadsdk.co.ri;

import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.ironsource.X3;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class xha extends com.bytedance.sdk.component.ri.ka<JSONObject, JSONObject> {
    private final String lr;
    private final dzy ri;

    public xha(String str, dzy dzyVar) {
        this.ri = dzyVar;
        this.lr = str;
    }

    public static void ri(com.bytedance.sdk.component.ri.vr vrVar, dzy dzyVar) {
        vrVar.ri("appInfo", new xha("appInfo", dzyVar));
        vrVar.ri("adInfo", new xha("adInfo", dzyVar));
        vrVar.ri("sendLog", new xha("sendLog", dzyVar));
        vrVar.ri("playable_style", new xha("playable_style", dzyVar));
        vrVar.ri("getTemplateInfo", new xha("getTemplateInfo", dzyVar));
        vrVar.ri("getTeMaiAds", new xha("getTeMaiAds", dzyVar));
        vrVar.ri(X3.i.o, new xha(X3.i.o, dzyVar));
        vrVar.ri("getScreenSize", new xha("getScreenSize", dzyVar));
        vrVar.ri("getCloseButtonInfo", new xha("getCloseButtonInfo", dzyVar));
        vrVar.ri("getVolume", new xha("getVolume", dzyVar));
        vrVar.ri("removeLoading", new xha("removeLoading", dzyVar));
        vrVar.ri("sendReward", new xha("sendReward", dzyVar));
        vrVar.ri("subscribe_app_ad", new xha("subscribe_app_ad", dzyVar));
        vrVar.ri("download_app_ad", new xha("download_app_ad", dzyVar));
        vrVar.ri("cancel_download_app_ad", new xha("cancel_download_app_ad", dzyVar));
        vrVar.ri("unsubscribe_app_ad", new xha("unsubscribe_app_ad", dzyVar));
        vrVar.ri("landscape_click", new xha("landscape_click", dzyVar));
        vrVar.ri("clickEvent", new xha("clickEvent", dzyVar));
        vrVar.ri("renderDidFinish", new xha("renderDidFinish", dzyVar));
        vrVar.ri("dynamicTrack", new xha("dynamicTrack", dzyVar));
        vrVar.ri("skipVideo", new xha("skipVideo", dzyVar));
        vrVar.ri("muteVideo", new xha("muteVideo", dzyVar));
        vrVar.ri("changeVideoState", new xha("changeVideoState", dzyVar));
        vrVar.ri("getCurrentVideoState", new xha("getCurrentVideoState", dzyVar));
        vrVar.ri("send_temai_product_ids", new xha("send_temai_product_ids", dzyVar));
        vrVar.ri("getMaterialMeta", new xha("getMaterialMeta", dzyVar));
        vrVar.ri("endcard_load", new xha("endcard_load", dzyVar));
        vrVar.ri("pauseWebView", new xha("pauseWebView", dzyVar));
        vrVar.ri("pauseWebViewTimers", new xha("pauseWebViewTimers", dzyVar));
        vrVar.ri("webview_time_track", new xha("webview_time_track", dzyVar));
        vrVar.ri("openPrivacy", new xha("openPrivacy", dzyVar));
        vrVar.ri("openAdLandPageLinks", new xha("openAdLandPageLinks", dzyVar));
        vrVar.ri("getNativeSiteCustomData", new xha("getNativeSiteCustomData", dzyVar));
        vrVar.ri("close", new xha("close", dzyVar));
    }

    @Override // com.bytedance.sdk.component.ri.ka
    public JSONObject ri(String str, JSONObject jSONObject, com.bytedance.sdk.component.ri.fi fiVar) throws Exception {
        dzy.lr lrVar = new dzy.lr();
        lrVar.ri = NotificationCompat.CATEGORY_CALL;
        lrVar.ik = this.lr;
        lrVar.ka = jSONObject;
        return this.ri.ri(lrVar, 3);
    }
}
