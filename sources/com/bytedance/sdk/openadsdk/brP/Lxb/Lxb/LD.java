package com.bytedance.sdk.openadsdk.brP.Lxb.Lxb;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.nJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LD {
    public static boolean Lxb(Context context, String str, tD tDVar) {
        String strLxb = nJ.Lxb(tDVar);
        com.bytedance.sdk.openadsdk.core.ZU.Lxb(tDVar, strLxb, 1, null);
        Intent intentLxb = Lxb(context, str);
        if (TextUtils.isEmpty(str) || intentLxb == null) {
            com.bytedance.sdk.openadsdk.core.ZU.Lxb(tDVar, strLxb, -2, tDVar.nTb().ZU());
            return false;
        }
        boolean zOY = nJ.OY(context);
        HashMap mapV = AbstractC3950lJ.v("url", str);
        if (zOY) {
            nJ.LD LD = nJ.LD(context, intentLxb);
            if (LD.LD <= 0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("intent", intentLxb.toString());
                    jSONObject.put("can_query_install", 1);
                } catch (Exception unused) {
                }
                com.bytedance.sdk.openadsdk.core.ZU.Lxb(tDVar, strLxb, -3, jSONObject);
                return false;
            }
            try {
                Lxb(context, tDVar, mapV);
                mapV.put("matched_count", Integer.valueOf(LD.LD));
                ComponentName componentName = LD.Lxb;
                if (componentName != null) {
                    intentLxb.setComponent(componentName);
                }
            } catch (Throwable th) {
                sLN.Lxb("DeepLinkUtils", th.getMessage());
            }
        }
        try {
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tDVar, strLxb, "open_url_app", mapV);
            context.startActivity(intentLxb);
            com.bytedance.sdk.openadsdk.ZU.sLN.Lxb().Lxb(mapV).Lxb(tDVar, strLxb);
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb("dp_start_act_success", tDVar, strLxb, mapV);
            return true;
        } catch (Throwable th2) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("exception", th2.getMessage());
                jSONObject2.put("intent", intentLxb.toString());
                jSONObject2.put("can_query_install", zOY ? 1 : 0);
            } catch (Exception unused2) {
            }
            com.bytedance.sdk.openadsdk.core.ZU.Lxb(tDVar, strLxb, -4, jSONObject2);
            return false;
        }
    }

    private static Intent Lxb(Context context, String str) {
        try {
            Uri uri = Uri.parse(str);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            return intent;
        } catch (Throwable th) {
            sLN.Lxb("DeepLinkUtils", th.getMessage());
            return null;
        }
    }

    private static void Lxb(Context context, tD tDVar, Map<String, Object> map) {
        if (tDVar != null && tDVar.qK() == 0) {
            map.put("auto_click", Boolean.valueOf(!tDVar.ZU()));
        }
        map.put("can_query_install", Integer.valueOf(nJ.OY(context) ? 1 : 0));
    }
}
