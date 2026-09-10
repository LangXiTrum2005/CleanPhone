package com.bytedance.sdk.openadsdk.rq.qdl;

import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.core.hkc;
import com.p004ironsource.d9;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class wd extends com.bytedance.sdk.component.qdl.mml<JSONObject, JSONObject> {
    private final hkc qdl;
    private final String ud;

    public wd(String str, hkc hkcVar) {
        this.qdl = hkcVar;
        this.ud = str;
    }

    public static void qdl(com.bytedance.sdk.component.qdl.bjy bjyVar, hkc hkcVar) {
        bjyVar.qdl("appInfo", new wd("appInfo", hkcVar));
        bjyVar.qdl("adInfo", new wd("adInfo", hkcVar));
        bjyVar.qdl("sendLog", new wd("sendLog", hkcVar));
        bjyVar.qdl("playable_style", new wd("playable_style", hkcVar));
        bjyVar.qdl("getTemplateInfo", new wd("getTemplateInfo", hkcVar));
        bjyVar.qdl("getTeMaiAds", new wd("getTeMaiAds", hkcVar));
        bjyVar.qdl(d9.h.o, new wd(d9.h.o, hkcVar));
        bjyVar.qdl("getScreenSize", new wd("getScreenSize", hkcVar));
        bjyVar.qdl("getCloseButtonInfo", new wd("getCloseButtonInfo", hkcVar));
        bjyVar.qdl("getVolume", new wd("getVolume", hkcVar));
        bjyVar.qdl("removeLoading", new wd("removeLoading", hkcVar));
        bjyVar.qdl("sendReward", new wd("sendReward", hkcVar));
        bjyVar.qdl("subscribe_app_ad", new wd("subscribe_app_ad", hkcVar));
        bjyVar.qdl("download_app_ad", new wd("download_app_ad", hkcVar));
        bjyVar.qdl("cancel_download_app_ad", new wd("cancel_download_app_ad", hkcVar));
        bjyVar.qdl("unsubscribe_app_ad", new wd("unsubscribe_app_ad", hkcVar));
        bjyVar.qdl("landscape_click", new wd("landscape_click", hkcVar));
        bjyVar.qdl("clickEvent", new wd("clickEvent", hkcVar));
        bjyVar.qdl("renderDidFinish", new wd("renderDidFinish", hkcVar));
        bjyVar.qdl("dynamicTrack", new wd("dynamicTrack", hkcVar));
        bjyVar.qdl("skipVideo", new wd("skipVideo", hkcVar));
        bjyVar.qdl("muteVideo", new wd("muteVideo", hkcVar));
        bjyVar.qdl("changeVideoState", new wd("changeVideoState", hkcVar));
        bjyVar.qdl("getCurrentVideoState", new wd("getCurrentVideoState", hkcVar));
        bjyVar.qdl("send_temai_product_ids", new wd("send_temai_product_ids", hkcVar));
        bjyVar.qdl("getMaterialMeta", new wd("getMaterialMeta", hkcVar));
        bjyVar.qdl("endcard_load", new wd("endcard_load", hkcVar));
        bjyVar.qdl("pauseWebView", new wd("pauseWebView", hkcVar));
        bjyVar.qdl("pauseWebViewTimers", new wd("pauseWebViewTimers", hkcVar));
        bjyVar.qdl("webview_time_track", new wd("webview_time_track", hkcVar));
        bjyVar.qdl("openPrivacy", new wd("openPrivacy", hkcVar));
        bjyVar.qdl("openAdLandPageLinks", new wd("openAdLandPageLinks", hkcVar));
        bjyVar.qdl("getNativeSiteCustomData", new wd("getNativeSiteCustomData", hkcVar));
        bjyVar.qdl("close", new wd("close", hkcVar));
    }

    @Override // com.bytedance.sdk.component.qdl.mml
    public JSONObject qdl(String str, JSONObject jSONObject, com.bytedance.sdk.component.qdl.mzz mzzVar) throws Exception {
        hkc.ud udVar = new hkc.ud();
        udVar.qdl = NotificationCompat.CATEGORY_CALL;
        udVar.lnr = this.ud;
        udVar.mml = jSONObject;
        return this.qdl.qdl(udVar, 3);
    }
}
