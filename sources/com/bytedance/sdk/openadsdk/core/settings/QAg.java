package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class QAg {
    public static final QAg Lxb = new QAg("");
    private final HashMap<String, Lxb> LD = new HashMap<>();

    public static class Lxb {
        public String JXs;
        public String LD;
        public final String Lxb;
        public int ZU;
        public int lk;

        public Lxb(JSONObject jSONObject) {
            this.Lxb = jSONObject.optString("name");
            this.LD = jSONObject.optString("app_id");
            this.lk = jSONObject.optInt("init_thread", 2);
            this.ZU = jSONObject.optInt("request_after_init", 2);
            this.JXs = jSONObject.optString("class_name");
        }
    }

    public QAg(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    Lxb lxb = new Lxb(jSONObjectOptJSONObject);
                    this.LD.put(lxb.Lxb, lxb);
                }
            }
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.sLN.Lxb("MediationInitConfigs", e.getMessage());
        }
    }
}
