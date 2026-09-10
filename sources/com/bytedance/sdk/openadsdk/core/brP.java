package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class brP {
    public static void Lxb(Context context, boolean z, JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.tD tDVar, String str, int i, WebView webView, com.bytedance.sdk.openadsdk.core.widget.lc lcVar) {
        int iOptInt = jSONObject.optInt("landingStyle");
        String strOptString = jSONObject.optString("url");
        String strOptString2 = jSONObject.optString("fallback_url");
        try {
            jSONObject.put("is_activity", z);
        } catch (JSONException unused) {
        }
        boolean z2 = true;
        com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tDVar, str, 1, jSONObject);
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        if (iOptInt == 0) {
            if (webView != null) {
                webView.loadUrl(strOptString);
                com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tDVar, str, 2, (JSONObject) null);
            } else {
                com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tDVar, str, -1, (JSONObject) null);
            }
        } else if (iOptInt == 1 || iOptInt == 8) {
            com.bytedance.sdk.openadsdk.STP.Lxb.LD ld = new com.bytedance.sdk.openadsdk.STP.Lxb.LD();
            ld.Lxb(com.bytedance.sdk.openadsdk.ZU.LD.Lxb.LD);
            ld.Lxb(tDVar);
            ld.LD(str);
            ld.Lxb(-1);
            ld.Lxb(false);
            ld.LD(tDVar.sRq());
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(ld);
            com.bytedance.sdk.openadsdk.utils.DY.Lxb(context, strOptString, tDVar, com.bytedance.sdk.openadsdk.ZU.LD.Lxb.LD);
        } else if (iOptInt == 2) {
            if (!com.bytedance.sdk.openadsdk.utils.DY.LD(context, strOptString, tDVar, str)) {
                com.bytedance.sdk.openadsdk.STP.Lxb.LD ld2 = new com.bytedance.sdk.openadsdk.STP.Lxb.LD();
                ld2.Lxb(com.bytedance.sdk.openadsdk.ZU.LD.Lxb.LD);
                ld2.Lxb(tDVar);
                ld2.LD(str);
                ld2.Lxb(-1);
                ld2.Lxb(false);
                ld2.LD(tDVar.sRq());
                com.bytedance.sdk.openadsdk.ZU.lk.Lxb(ld2);
                HashMap map = new HashMap();
                map.put("deeplink_url", strOptString);
                map.put("fallback_url", strOptString2);
                map.put("jsb_deeplink", 1);
                com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tDVar, str, "open_fallback_url", map);
                com.bytedance.sdk.openadsdk.utils.DY.Lxb(context, strOptString2, tDVar, com.bytedance.sdk.openadsdk.ZU.LD.Lxb.LD);
            }
        } else if (iOptInt != 3) {
            z2 = false;
        } else if (xan.LD(context, strOptString, tDVar, i, str, false)) {
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tDVar, str, 3, (JSONObject) null);
        } else {
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tDVar, str, -2, (JSONObject) null);
        }
        if (lcVar == null || !z2) {
            return;
        }
        lcVar.Lxb();
    }
}
