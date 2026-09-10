package com.bytedance.sdk.component.adexpress.dynamic.ZU;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ZU {
    public String LD;
    public List<Lxb> Lxb;
    public String ZU;
    public String lk;

    public static class Lxb {
        public JSONObject LD;
        public int Lxb;
    }

    public static ZU Lxb(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        ZU zu = new ZU();
        String strOptString = jSONObject.optString("custom_components");
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(strOptString);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    Lxb lxb = new Lxb();
                    lxb.Lxb = jSONObjectOptJSONObject.optInt("id");
                    lxb.LD = new JSONObject(jSONObjectOptJSONObject.optString("componentLayout"));
                    arrayList.add(lxb);
                }
            }
        } catch (JSONException unused) {
        }
        zu.Lxb = arrayList;
        zu.LD = jSONObject.optString("diff_data");
        zu.lk = jSONObject.optString("style_diff");
        zu.ZU = jSONObject.optString("tag_diff");
        return zu;
    }
}
