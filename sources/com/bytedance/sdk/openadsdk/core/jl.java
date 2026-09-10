package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class jl {
    public static void qdl(Context context, boolean z2, JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, String str, int i2, WebView webView, com.bytedance.sdk.openadsdk.core.widget.mzz mzzVar) {
        int iOptInt = jSONObject.optInt("landingStyle");
        String strOptString = jSONObject.optString("url");
        String strOptString2 = jSONObject.optString("fallback_url");
        String strOptString3 = jSONObject.optString("title", "");
        boolean z3 = false;
        boolean z4 = jSONObject.optInt("only_loading", 0) == 1;
        try {
            jSONObject.put("is_activity", z2);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, str, 1, jSONObject);
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        if (iOptInt == 0) {
            if (webView != null) {
                webView.loadUrl(strOptString);
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, str, 2, (JSONObject) null);
            } else {
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, str, -1, (JSONObject) null);
            }
        } else if (iOptInt == 1 || iOptInt == 8) {
            com.bytedance.sdk.openadsdk.bjy.qdl.ud udVar = new com.bytedance.sdk.openadsdk.bjy.qdl.ud();
            udVar.qdl(com.bytedance.sdk.openadsdk.mml.ud.qdl.ud);
            udVar.qdl(ljhVar);
            udVar.ud(str);
            udVar.qdl(-1);
            udVar.qdl(false);
            udVar.ud(ljhVar.ygv());
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(udVar);
            com.bytedance.sdk.openadsdk.utils.oth.qdl(context, strOptString, ljhVar, com.bytedance.sdk.openadsdk.mml.ud.qdl.ud);
        } else {
            if (iOptInt != 2) {
                if (iOptInt == 3) {
                    exc excVar = new exc(ljhVar);
                    excVar.qdl(strOptString3);
                    excVar.qdl(z4);
                    fco.qdl(context, strOptString, ljhVar, i2, str, false, excVar);
                }
                if (mzzVar == null && z3) {
                    mzzVar.qdl();
                    return;
                }
            }
            if (!com.bytedance.sdk.openadsdk.utils.oth.ud(context, strOptString, ljhVar, str)) {
                com.bytedance.sdk.openadsdk.bjy.qdl.ud udVar2 = new com.bytedance.sdk.openadsdk.bjy.qdl.ud();
                udVar2.qdl(com.bytedance.sdk.openadsdk.mml.ud.qdl.ud);
                udVar2.qdl(ljhVar);
                udVar2.ud(str);
                udVar2.qdl(-1);
                udVar2.qdl(false);
                udVar2.ud(ljhVar.ygv());
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(udVar2);
                HashMap map = new HashMap();
                map.put("deeplink_url", strOptString);
                map.put("fallback_url", strOptString2);
                map.put("jsb_deeplink", 1);
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, str, "open_fallback_url", map);
                com.bytedance.sdk.openadsdk.utils.oth.qdl(context, strOptString2, ljhVar, com.bytedance.sdk.openadsdk.mml.ud.qdl.ud);
            }
        }
        z3 = true;
        if (mzzVar == null) {
        }
    }
}
