package com.bytedance.sdk.openadsdk.core.jbs;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class sf {
    public static void ri(String str, int i, String str2, String str3, String str4, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        if (TextUtils.isEmpty(str2)) {
            str2 = com.bytedance.sdk.openadsdk.core.jbs.ri(i);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("render_source", str);
            com.bytedance.sdk.openadsdk.core.model.wjv.ri riVarSez = wjvVar.sez();
            if (riVarSez != null) {
                jSONObject.put("tpl_id", riVarSez.ka());
                if ("Web".equals(str)) {
                    if (riVarSez.co()) {
                        jSONObject.put("engine_version", "v3");
                    } else {
                        jSONObject.put("engine_version", "v1");
                    }
                }
            } else if (wjvVar.zv() != null) {
                jSONObject.put("tpl_id", wjvVar.zv().ri());
                if ("Web".equals(str)) {
                    jSONObject.put("engine_version", "v3");
                }
            }
        } catch (Exception unused) {
        }
        com.bytedance.sdk.openadsdk.slm.ka.ri().ri(com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri(ri(str3)).ik(str4).fi(wjvVar != null ? wjvVar.jf() : "").lr(i).lr(jSONObject.toString()).di(str2));
    }

    private static int ri(String str) {
        str.getClass();
        switch (str) {
            case "banner_ad":
                return 1;
            case "rewarded_video":
                return 7;
            case "open_ad":
                return 3;
            case "fullscreen_interstitial_ad":
                return 8;
            case "interaction":
                return 2;
            default:
                return 5;
        }
    }
}
