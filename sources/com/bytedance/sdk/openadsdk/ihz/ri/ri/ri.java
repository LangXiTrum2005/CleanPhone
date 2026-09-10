package com.bytedance.sdk.openadsdk.ihz.ri.ri;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.core.fi;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.ka.bgr;
import com.bytedance.sdk.openadsdk.utils.ig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    public static boolean ri(Context context, String str, wjv wjvVar, int i, Map<String, Object> map, boolean z) {
        Map<String, Object> map2 = map;
        String strRi = ig.ri(wjvVar);
        fi.ri(wjvVar, strRi, 1, null);
        Intent intentRi = ri(context, str, wjvVar);
        if (TextUtils.isEmpty(str) || intentRi == null) {
            fi.ri(wjvVar, strRi, -2, wjvVar.lau().ka());
            return false;
        }
        boolean zKa = ig.ka(context);
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        Map<String, Object> map3 = map2;
        if (wjvVar != null && wjvVar.yv() == 0) {
            map3.put("auto_click", Boolean.valueOf(!wjvVar.tan()));
        }
        map3.put("can_query_install", Integer.valueOf(zKa ? 1 : 0));
        map3.put("url", str);
        if (zKa) {
            ig.lr lrVarRi = ig.ri(context, intentRi);
            if (lrVarRi.lr <= 0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("intent", intentRi.toString());
                    jSONObject.put("can_query_install", 1);
                } catch (Exception unused) {
                }
                fi.ri(wjvVar, strRi, -3, jSONObject);
                return false;
            }
            try {
                ri(context, wjvVar, map3);
                map3.put("matched_count", Integer.valueOf(lrVarRi.lr));
                ComponentName componentName = lrVarRi.ri;
                if (componentName != null) {
                    intentRi.setComponent(componentName);
                }
            } catch (Throwable th) {
                ac.ik("DeepLinkUtils", th.getMessage());
            }
        }
        if (nr.ka().jbs()) {
            ig.ri(wjvVar, strRi);
        }
        try {
            com.bytedance.sdk.openadsdk.ka.ik.ri(wjvVar, strRi, "open_url_app", map3);
            context.startActivity(intentRi);
            bgr.ri().ri(map3).ri(wjvVar, strRi);
            com.bytedance.sdk.openadsdk.ka.ik.ri("dp_start_act_success", wjvVar, strRi, map3);
            return true;
        } catch (Throwable th2) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("exception", th2.getMessage());
                jSONObject2.put("intent", intentRi.toString());
                jSONObject2.put("can_query_install", zKa ? 1 : 0);
            } catch (Exception unused2) {
            }
            fi.ri(wjvVar, strRi, -4, jSONObject2);
            if (zKa && !nr.ka().jbs()) {
                com.bytedance.sdk.openadsdk.core.ig.ri(context, wjvVar.smj(), wjvVar, i, strRi, z);
            }
            return false;
        }
    }

    private static Intent ri(Context context, String str, wjv wjvVar) {
        try {
            Uri uri = Uri.parse(str);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            if (wjvVar != null && wjvVar.xz() != null && !TextUtils.isEmpty(wjvVar.xz().ka())) {
                intent.setPackage(wjvVar.xz().ka());
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            return intent;
        } catch (Throwable th) {
            ac.ik("DeepLinkUtils", th.getMessage());
            return null;
        }
    }

    private static void ri(Context context, wjv wjvVar, Map<String, Object> map) {
        if (wjvVar != null && wjvVar.yv() == 0) {
            map.put("auto_click", Boolean.valueOf(!wjvVar.tan()));
        }
        map.put("can_query_install", Integer.valueOf(ig.ka(context) ? 1 : 0));
    }
}
