package com.bytedance.sdk.openadsdk.JVA.Lxb;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.Lxb.kqm;
import com.bytedance.sdk.openadsdk.core.Ivz;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ebl extends com.bytedance.sdk.component.Lxb.JXs<JSONObject, JSONObject> {
    private final Ivz LD;
    private final String Lxb;

    public ebl(String str, Ivz ivz) {
        this.LD = ivz;
        this.Lxb = str;
    }

    public static void Lxb(kqm kqmVar, Ivz ivz) {
        kqmVar.Lxb("appInfo", new ebl("appInfo", ivz));
        kqmVar.Lxb("adInfo", new ebl("adInfo", ivz));
        kqmVar.Lxb("sendLog", new ebl("sendLog", ivz));
        kqmVar.Lxb("playable_style", new ebl("playable_style", ivz));
        kqmVar.Lxb("getTemplateInfo", new ebl("getTemplateInfo", ivz));
        kqmVar.Lxb("getTeMaiAds", new ebl("getTeMaiAds", ivz));
        kqmVar.Lxb("isViewable", new ebl("isViewable", ivz));
        kqmVar.Lxb("getScreenSize", new ebl("getScreenSize", ivz));
        kqmVar.Lxb("getCloseButtonInfo", new ebl("getCloseButtonInfo", ivz));
        kqmVar.Lxb("getVolume", new ebl("getVolume", ivz));
        kqmVar.Lxb("removeLoading", new ebl("removeLoading", ivz));
        kqmVar.Lxb("sendReward", new ebl("sendReward", ivz));
        kqmVar.Lxb("subscribe_app_ad", new ebl("subscribe_app_ad", ivz));
        kqmVar.Lxb("download_app_ad", new ebl("download_app_ad", ivz));
        kqmVar.Lxb("cancel_download_app_ad", new ebl("cancel_download_app_ad", ivz));
        kqmVar.Lxb("unsubscribe_app_ad", new ebl("unsubscribe_app_ad", ivz));
        kqmVar.Lxb("landscape_click", new ebl("landscape_click", ivz));
        kqmVar.Lxb("clickEvent", new ebl("clickEvent", ivz));
        kqmVar.Lxb("renderDidFinish", new ebl("renderDidFinish", ivz));
        kqmVar.Lxb("dynamicTrack", new ebl("dynamicTrack", ivz));
        kqmVar.Lxb("skipVideo", new ebl("skipVideo", ivz));
        kqmVar.Lxb("muteVideo", new ebl("muteVideo", ivz));
        kqmVar.Lxb("changeVideoState", new ebl("changeVideoState", ivz));
        kqmVar.Lxb("getCurrentVideoState", new ebl("getCurrentVideoState", ivz));
        kqmVar.Lxb("send_temai_product_ids", new ebl("send_temai_product_ids", ivz));
        kqmVar.Lxb("getMaterialMeta", new ebl("getMaterialMeta", ivz));
        kqmVar.Lxb("endcard_load", new ebl("endcard_load", ivz));
        kqmVar.Lxb("pauseWebView", new ebl("pauseWebView", ivz));
        kqmVar.Lxb("pauseWebViewTimers", new ebl("pauseWebViewTimers", ivz));
        kqmVar.Lxb("webview_time_track", new ebl("webview_time_track", ivz));
        kqmVar.Lxb("openPrivacy", new ebl("openPrivacy", ivz));
        kqmVar.Lxb("openAdLandPageLinks", new ebl("openAdLandPageLinks", ivz));
        kqmVar.Lxb("getNativeSiteCustomData", new ebl("getNativeSiteCustomData", ivz));
        kqmVar.Lxb("close", new ebl("close", ivz));
    }

    @Override // com.bytedance.sdk.component.Lxb.JXs
    @Nullable
    public JSONObject Lxb(@NonNull JSONObject jSONObject, @NonNull com.bytedance.sdk.component.Lxb.lc lcVar) throws Exception {
        Ivz.LD ld = new Ivz.LD();
        ld.Lxb = NotificationCompat.CATEGORY_CALL;
        ld.lk = this.Lxb;
        ld.ZU = jSONObject;
        return this.LD.Lxb(ld, 3);
    }
}
