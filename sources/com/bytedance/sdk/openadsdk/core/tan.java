package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class tan {
    public static void ri(Context context, boolean z, JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, String str, int i, WebView webView, com.bytedance.sdk.openadsdk.core.widget.fi fiVar) {
        int iOptInt = jSONObject.optInt("landingStyle");
        String strOptString = jSONObject.optString("url");
        String strOptString2 = jSONObject.optString("fallback_url");
        String strOptString3 = jSONObject.optString("title", "");
        boolean z2 = false;
        boolean z3 = jSONObject.optInt("only_loading", 0) == 1;
        try {
            jSONObject.put("is_activity", z);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.ka.ik.ri(wjvVar, str, 1, jSONObject);
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        if (iOptInt == 0) {
            if (webView != null) {
                webView.loadUrl(strOptString);
                com.bytedance.sdk.openadsdk.ka.ik.ri(wjvVar, str, 2, (JSONObject) null);
            } else {
                com.bytedance.sdk.openadsdk.ka.ik.ri(wjvVar, str, -1, (JSONObject) null);
            }
        } else if (iOptInt == 1 || iOptInt == 8) {
            com.bytedance.sdk.openadsdk.slm.ri.lr lrVar = new com.bytedance.sdk.openadsdk.slm.ri.lr();
            lrVar.ri(com.bytedance.sdk.openadsdk.ka.lr.ri.lr);
            lrVar.ri(wjvVar);
            lrVar.lr(str);
            lrVar.ri(-1);
            lrVar.ri(false);
            lrVar.lr(wjvVar.adz());
            com.bytedance.sdk.openadsdk.ka.ik.ri(lrVar);
            com.bytedance.sdk.openadsdk.utils.wjv.ri(context, strOptString, wjvVar, com.bytedance.sdk.openadsdk.ka.lr.ri.lr, true);
        } else {
            if (iOptInt != 2) {
                if (iOptInt == 3) {
                    ac acVar = new ac(wjvVar);
                    acVar.ri(strOptString3);
                    acVar.ri(z3);
                    ig.ri(context, strOptString, wjvVar, i, str, false, acVar);
                }
                if (fiVar == null && z2) {
                    fiVar.ri();
                    return;
                }
            }
            if (!com.bytedance.sdk.openadsdk.utils.wjv.ri(context, strOptString, wjvVar, str)) {
                com.bytedance.sdk.openadsdk.slm.ri.lr lrVar2 = new com.bytedance.sdk.openadsdk.slm.ri.lr();
                lrVar2.ri(com.bytedance.sdk.openadsdk.ka.lr.ri.lr);
                lrVar2.ri(wjvVar);
                lrVar2.lr(str);
                lrVar2.ri(-1);
                lrVar2.ri(false);
                lrVar2.lr(wjvVar.adz());
                com.bytedance.sdk.openadsdk.ka.ik.ri(lrVar2);
                HashMap map = new HashMap();
                map.put("deeplink_url", strOptString);
                map.put("fallback_url", strOptString2);
                map.put("jsb_deeplink", 1);
                com.bytedance.sdk.openadsdk.ka.ik.ri(wjvVar, str, "open_fallback_url", map);
                com.bytedance.sdk.openadsdk.utils.wjv.ri(context, strOptString2, wjvVar, com.bytedance.sdk.openadsdk.ka.lr.ri.lr, true);
            }
        }
        z2 = true;
        if (fiVar == null) {
        }
    }
}
