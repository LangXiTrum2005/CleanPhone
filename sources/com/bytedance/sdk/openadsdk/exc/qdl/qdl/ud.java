package com.bytedance.sdk.openadsdk.exc.qdl.qdl;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.a;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.mml.exu;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.smartdigimkt.x.g;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ud {
    public static boolean qdl(Context context, String str, ljh ljhVar) {
        String strQdl = gy.qdl(ljhVar);
        com.bytedance.sdk.openadsdk.core.mml.qdl(ljhVar, strQdl, 1, null);
        Intent intentQdl = qdl(context, str);
        if (TextUtils.isEmpty(str) || intentQdl == null) {
            com.bytedance.sdk.openadsdk.core.mml.qdl(ljhVar, strQdl, -2, ljhVar.bo().mml());
            return false;
        }
        boolean zMml = gy.mml(context);
        HashMap mapS = a.s("url", str);
        if (zMml) {
            gy.ud udVarQdl = gy.qdl(context, intentQdl);
            if (udVarQdl.ud <= 0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("intent", intentQdl.toString());
                    jSONObject.put("can_query_install", 1);
                } catch (Exception unused) {
                }
                com.bytedance.sdk.openadsdk.core.mml.qdl(ljhVar, strQdl, -3, jSONObject);
                return false;
            }
            try {
                qdl(context, ljhVar, mapS);
                mapS.put("matched_count", Integer.valueOf(udVarQdl.ud));
                ComponentName componentName = udVarQdl.qdl;
                if (componentName != null) {
                    intentQdl.setComponent(componentName);
                }
            } catch (Throwable th) {
                aaj.lnr("DeepLinkUtils", th.getMessage());
            }
        }
        try {
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, strQdl, "open_url_app", mapS);
            context.startActivity(intentQdl);
            exu.qdl().qdl(mapS).qdl(ljhVar, strQdl);
            com.bytedance.sdk.openadsdk.mml.lnr.qdl("dp_start_act_success", ljhVar, strQdl, mapS);
            return true;
        } catch (Throwable th2) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(g.f39715A, th2.getMessage());
                jSONObject2.put("intent", intentQdl.toString());
                jSONObject2.put("can_query_install", zMml ? 1 : 0);
            } catch (Exception unused2) {
            }
            com.bytedance.sdk.openadsdk.core.mml.qdl(ljhVar, strQdl, -4, jSONObject2);
            return false;
        }
    }

    private static Intent qdl(Context context, String str) {
        try {
            Uri uri = Uri.parse(str);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            return intent;
        } catch (Throwable th) {
            aaj.lnr("DeepLinkUtils", th.getMessage());
            return null;
        }
    }

    private static void qdl(Context context, ljh ljhVar, Map<String, Object> map) {
        if (ljhVar != null && ljhVar.ikv() == 0) {
            map.put("auto_click", Boolean.valueOf(!ljhVar.bjy()));
        }
        map.put("can_query_install", Integer.valueOf(gy.mml(context) ? 1 : 0));
    }
}
