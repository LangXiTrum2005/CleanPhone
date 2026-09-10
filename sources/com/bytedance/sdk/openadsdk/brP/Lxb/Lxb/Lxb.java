package com.bytedance.sdk.openadsdk.brP.Lxb.Lxb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.ZU.sLN;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.nJ;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb extends ZU {
    public Lxb(Context context, tD tDVar, String str) {
        super(context, tDVar, str);
    }

    @Override // com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.ZU
    public boolean LD() {
        com.bytedance.sdk.openadsdk.core.ZU.Lxb(this.LD, this.lk, 1, null);
        if (this.LD.nTb() != null) {
            HashMap map = new HashMap();
            tD tDVar = this.LD;
            if (tDVar != null && tDVar.qK() == 0) {
                map.put("dpl_probability_jump", Boolean.valueOf(this.lc >= 11));
            }
            if (Lxb(this.LD.nTb().Lxb(), lk(), this.lk, this.LD, map)) {
                return true;
            }
            if (!this.ZU || this.JXs.get()) {
                this.ZU = true;
                Lxb(this.LD, map);
                com.bytedance.sdk.openadsdk.ZU.lk.Lxb(this.LD, this.lk, "open_fallback_url", map);
            }
        } else {
            com.bytedance.sdk.openadsdk.core.ZU.Lxb(this.LD, this.lk, -1, null);
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.ZU, com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lc
    public boolean Lxb() {
        HashMap map;
        if (this.Lxb == null) {
            return false;
        }
        tD tDVar = this.LD;
        if (tDVar == null || tDVar.qK() != 0) {
            map = null;
        } else {
            map = new HashMap();
            map.put("dpl_probability_jump", Boolean.valueOf(this.lc >= 11));
        }
        return Lxb(this.LD, this.Lxb.lk(), lk(), this.lk, map);
    }

    public static boolean Lxb(tD tDVar, String str, Context context, String str2, Map<String, Object> map) {
        Intent intentLxb;
        if (tDVar != null && tDVar.bm() == 0) {
            return false;
        }
        try {
            if (TextUtils.isEmpty(str) || (intentLxb = nJ.Lxb(context, str)) == null) {
                return false;
            }
            intentLxb.putExtra("START_ONLY_FOR_ANDROID", true);
            if (!(context instanceof Activity)) {
                intentLxb.addFlags(268435456);
            }
            context.startActivity(intentLxb);
            if (map == null) {
                map = new HashMap<>();
            }
            Lxb(tDVar, map);
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tDVar, str2, "click_open", map);
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    private static void Lxb(tD tDVar, Map<String, Object> map) {
        if (map == null) {
            return;
        }
        if (tDVar != null && tDVar.qK() == 0) {
            map.put("auto_click", Boolean.valueOf(!tDVar.ZU()));
        }
        map.put("can_query_install", 0);
    }

    public static boolean Lxb(String str, Context context, String str2, tD tDVar, Map<String, Object> map) {
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
                    Lxb(tDVar, map);
                    map.put("url", str);
                    com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tDVar, str2, "open_url_app", map);
                    context.startActivity(intent2);
                    sLN.Lxb().Lxb(map).Lxb(tDVar, str2);
                    com.bytedance.sdk.openadsdk.ZU.lk.Lxb("dp_start_act_success", tDVar, str2, map);
                    return true;
                } catch (Throwable th) {
                    th = th;
                    intent = intent2;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("exception", th.getMessage());
                        if (intent != null) {
                            jSONObject.put("intent", intent.toString());
                        }
                        jSONObject.put("can_query_install", 0);
                    } catch (Exception unused) {
                    }
                    com.bytedance.sdk.openadsdk.core.ZU.Lxb(tDVar, str2, -4, jSONObject);
                    return false;
                }
            }
            com.bytedance.sdk.openadsdk.core.ZU.Lxb(tDVar, str2, -2, null);
            return false;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
