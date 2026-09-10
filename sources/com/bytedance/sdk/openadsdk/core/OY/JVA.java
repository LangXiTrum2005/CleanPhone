package com.bytedance.sdk.openadsdk.core.OY;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class JVA {
    public static void Lxb(String str, int i, String str2, String str3, String str4, com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        if (TextUtils.isEmpty(str2)) {
            str2 = com.bytedance.sdk.openadsdk.core.OY.Lxb(i);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("render_source", str);
            com.bytedance.sdk.openadsdk.core.model.tD.Lxb lxbRW = tDVar.rW();
            if (lxbRW != null) {
                jSONObject.put("tpl_id", lxbRW.lc());
                if ("Web".equals(str)) {
                    if (lxbRW.STP()) {
                        jSONObject.put("engine_version", "v3");
                    } else {
                        jSONObject.put("engine_version", "v1");
                    }
                }
            } else if (tDVar.dR() != null) {
                jSONObject.put("tpl_id", tDVar.dR().Lxb());
                if ("Web".equals(str)) {
                    jSONObject.put("engine_version", "v3");
                }
            }
        } catch (Exception unused) {
        }
        com.bytedance.sdk.openadsdk.STP.lk.Lxb().Lxb(com.bytedance.sdk.openadsdk.STP.Lxb.ZU.LD().Lxb(Lxb(str3)).lk(str4).JXs(tDVar != null ? tDVar.xNP() : "").LD(i).LD(jSONObject.toString()).lc(str2));
    }

    private static int Lxb(String str) {
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
