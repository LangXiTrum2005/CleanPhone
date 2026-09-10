package com.bytedance.sdk.openadsdk.exc.qdl.qdl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.mml.exu;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.smartdigimkt.x.g;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class qdl extends mml {
    public qdl(Context context, String str) {
        super(context, str);
    }

    @Override // com.bytedance.sdk.openadsdk.exc.qdl.qdl.mml, com.bytedance.sdk.openadsdk.exc.qdl.qdl.mo
    public boolean qdl(ljh ljhVar) {
        com.bytedance.sdk.openadsdk.core.model.mo moVarFhs;
        HashMap map;
        if (ljhVar == null || (moVarFhs = ljhVar.fhs()) == null) {
            return false;
        }
        if (ljhVar.ikv() == 0) {
            map = new HashMap();
            map.put("dpl_probability_jump", Boolean.valueOf(this.mml >= 11));
        } else {
            map = null;
        }
        return qdl(ljhVar, moVarFhs.lnr(), qdl(), this.qdl, map);
    }

    @Override // com.bytedance.sdk.openadsdk.exc.qdl.qdl.mml
    public boolean ud(ljh ljhVar) {
        com.bytedance.sdk.openadsdk.core.mml.qdl(ljhVar, this.qdl, 1, null);
        if (ljhVar.bo() != null) {
            HashMap map = new HashMap();
            if (ljhVar.ikv() == 0) {
                map.put("dpl_probability_jump", Boolean.valueOf(this.mml >= 11));
            }
            if (qdl(ljhVar.bo().qdl(), qdl(), this.qdl, ljhVar, map)) {
                return true;
            }
            if (!this.ud || this.lnr.get()) {
                this.ud = true;
                qdl(ljhVar, map);
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, this.qdl, "open_fallback_url", map);
            }
        } else {
            com.bytedance.sdk.openadsdk.core.mml.qdl(ljhVar, this.qdl, -1, null);
        }
        return false;
    }

    public static boolean qdl(ljh ljhVar, String str, Context context, String str2, Map<String, Object> map) {
        Intent intentQdl;
        if (ljhVar != null && ljhVar.ab() == 0) {
            return false;
        }
        try {
            if (TextUtils.isEmpty(str) || (intentQdl = gy.qdl(context, str)) == null) {
                return false;
            }
            intentQdl.putExtra("START_ONLY_FOR_ANDROID", true);
            if (!(context instanceof Activity)) {
                intentQdl.addFlags(268435456);
            }
            context.startActivity(intentQdl);
            if (map == null) {
                map = new HashMap<>();
            }
            qdl(ljhVar, map);
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, str2, "click_open", map);
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    private static void qdl(ljh ljhVar, Map<String, Object> map) {
        if (map == null) {
            return;
        }
        if (ljhVar != null && ljhVar.ikv() == 0) {
            map.put("auto_click", Boolean.valueOf(!ljhVar.bjy()));
        }
        map.put("can_query_install", 0);
    }

    public static boolean qdl(String str, Context context, String str2, ljh ljhVar, Map<String, Object> map) {
        Intent intent = null;
        try {
            if (!TextUtils.isEmpty(str)) {
                Uri uri = Uri.parse(str);
                Intent intent2 = new Intent("android.intent.action.VIEW");
                try {
                    intent2.setData(uri);
                    if (!(context instanceof Activity)) {
                        intent2.addFlags(268435456);
                    }
                    if (map == null) {
                        map = new HashMap<>();
                    }
                    qdl(ljhVar, map);
                    map.put("url", str);
                    com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, str2, "open_url_app", map);
                    context.startActivity(intent2);
                    exu.qdl().qdl(map).qdl(ljhVar, str2);
                    com.bytedance.sdk.openadsdk.mml.lnr.qdl("dp_start_act_success", ljhVar, str2, map);
                    return true;
                } catch (Throwable th) {
                    th = th;
                    intent = intent2;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(g.f39715A, th.getMessage());
                        if (intent != null) {
                            jSONObject.put("intent", intent.toString());
                        }
                        jSONObject.put("can_query_install", 0);
                    } catch (Exception unused) {
                    }
                    com.bytedance.sdk.openadsdk.core.mml.qdl(ljhVar, str2, -4, jSONObject);
                    return false;
                }
            }
            com.bytedance.sdk.openadsdk.core.mml.qdl(ljhVar, str2, -2, null);
            return false;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
