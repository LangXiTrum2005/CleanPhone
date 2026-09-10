package com.bytedance.sdk.openadsdk.rq.qdl;

import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.core.hkc;
import com.p004ironsource.d9;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class jpc extends com.bytedance.sdk.component.qdl.jl<JSONObject, JSONObject> {
    public static final HashSet<String> qdl = new HashSet<>(Arrays.asList("appInfo", "adInfo", "sendLog", "playable_style", "getTemplateInfo", "getTeMaiAds", d9.h.o, "getScreenSize", "getCloseButtonInfo", "getVolume", "removeLoading", "sendReward", "subscribe_app_ad", "download_app_ad", "cancel_download_app_ad", "unsubscribe_app_ad", "landscape_click", "clickEvent", "renderDidFinish", "dynamicTrack", "skipVideo", "muteVideo", "changeVideoState", "getCurrentVideoState", "send_temai_product_ids", "getMaterialMeta", "endcard_load", "pauseWebView", "pauseWebViewTimers", "webview_time_track", "getDownloadStatus", "openPrivacy", "openAdLandPageLinks", "getNativeSiteCustomData", "close"));
    private final hkc ud;

    public jpc(hkc hkcVar) {
        this.ud = hkcVar;
    }

    public static void qdl(com.bytedance.sdk.component.qdl.bjy bjyVar, hkc hkcVar) {
        bjyVar.qdl(qdl, new jpc(hkcVar));
    }

    @Override // com.bytedance.sdk.component.qdl.mml
    public JSONObject qdl(String str, JSONObject jSONObject, com.bytedance.sdk.component.qdl.mzz mzzVar) throws Exception {
        hkc.ud udVar = new hkc.ud();
        udVar.qdl = NotificationCompat.CATEGORY_CALL;
        udVar.lnr = str;
        udVar.mml = jSONObject;
        return this.ud.qdl(udVar, 3);
    }
}
