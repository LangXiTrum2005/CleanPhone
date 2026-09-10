package com.bytedance.sdk.openadsdk.sf;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.core.fi;
import com.bytedance.sdk.openadsdk.core.model.di;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.utils.ig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ri implements ik {
    private final Map<String, com.bytedance.sdk.openadsdk.ihz.ri.ri.ik> ik = new HashMap();
    private final lr lr;
    private final wjv ri;

    private ri(lr lrVar, wjv wjvVar) {
        this.lr = lrVar;
        this.ri = wjvVar;
    }

    public static ri ri(lr lrVar, wjv wjvVar) {
        return new ri(lrVar, wjvVar);
    }

    @Override // com.bytedance.sdk.openadsdk.sf.ik
    public void ri() {
        this.ik.clear();
    }

    private wjv ri(JSONObject jSONObject, String str) {
        String strRi;
        if (jSONObject == null) {
            return null;
        }
        wjv wjvVar = new wjv();
        wjvVar.fi(jSONObject);
        if (!TextUtils.isEmpty(str)) {
            wjvVar.su(str);
        }
        if (this.ri != null) {
            String strRi2 = wjvVar.tyz() != null ? wjvVar.tyz().ri() : null;
            if (TextUtils.isEmpty(strRi2)) {
                return this.ri;
            }
            di diVarTyz = this.ri.tyz();
            if (diVarTyz != null && strRi2.equals(diVarTyz.ri())) {
                return this.ri;
            }
            JSONObject jSONObject2 = new JSONObject();
            if (diVarTyz != null) {
                try {
                    strRi = diVarTyz.ri();
                } catch (JSONException unused) {
                }
            } else {
                strRi = "null";
            }
            jSONObject2.put("lu", strRi);
            jSONObject2.put("ju", strRi2);
            wjv wjvVar2 = this.ri;
            fi.ri(wjvVar2, ig.ri(wjvVar2), -5, jSONObject2);
            if (diVarTyz != null && strRi2.contains("play.google.com/store") && !strRi2.contains("referrer")) {
                wjvVar.tyz().ri(diVarTyz.ri());
            }
        }
        return wjvVar;
    }

    @Override // com.bytedance.sdk.openadsdk.sf.ik
    public void ri(Context context, JSONObject jSONObject, String str, int i, boolean z) {
        JSONObject jSONObjectOptJSONObject;
        if (context == null || jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) == null) {
            return;
        }
        ri(context, ri(jSONObjectOptJSONObject, str), jSONObjectOptJSONObject, i, z);
    }

    private void ri(Context context, wjv wjvVar, JSONObject jSONObject, int i, boolean z) {
        if (context == null || wjvVar == null || wjvVar.tyz() == null || jSONObject == null || this.lr == null || this.ik.get(wjvVar.tyz().ri()) != null) {
            return;
        }
        String strLr = ig.lr(i);
        if (TextUtils.isEmpty(strLr)) {
            return;
        }
        this.ik.put(wjvVar.tyz().ri(), ri(context, strLr));
    }

    @Override // com.bytedance.sdk.openadsdk.sf.ik
    public void ri(Context context, JSONObject jSONObject, String str) {
        if (context == null || this.ri == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.ihz.ri.ri.ka.ri(context, str).ri(this.ri);
    }

    @Override // com.bytedance.sdk.openadsdk.sf.ik
    public void ri(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) == null) {
            return;
        }
        ri(ri(jSONObjectOptJSONObject, (String) null), jSONObjectOptJSONObject);
    }

    private void ri(wjv wjvVar, JSONObject jSONObject) {
        if (this.lr == null || wjvVar == null || wjvVar.tyz() == null) {
            return;
        }
        String strRi = wjvVar.tyz().ri();
        if (this.ik.containsKey(strRi)) {
            this.ik.remove(strRi);
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "success");
                jSONObject2.put("status", "unsubscribed");
                jSONObject2.put("appad", jSONObject);
                this.lr.ri("app_ad_event", jSONObject2);
            } catch (JSONException e) {
                ac.ik("JsAppAdDownloadManager", e.getMessage());
            }
        }
    }

    private com.bytedance.sdk.openadsdk.ihz.ri.ri.ik ri(Context context, String str) {
        return com.bytedance.sdk.openadsdk.ihz.ri.ri.ka.ri(context, str);
    }
}
