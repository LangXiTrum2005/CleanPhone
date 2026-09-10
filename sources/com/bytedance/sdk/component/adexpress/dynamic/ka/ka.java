package com.bytedance.sdk.component.adexpress.dynamic.ka;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ka {
    public String ik;
    public String ka;
    public String lr;
    public List<ri> ri;

    public static class ri {
        public JSONObject lr;
        public int ri;
    }

    public static ka ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        ka kaVar = new ka();
        String strOptString = jSONObject.optString("custom_components");
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(strOptString);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    ri riVar = new ri();
                    riVar.ri = jSONObjectOptJSONObject.optInt("id");
                    riVar.lr = new JSONObject(jSONObjectOptJSONObject.optString("componentLayout"));
                    arrayList.add(riVar);
                }
            }
        } catch (JSONException unused) {
        }
        kaVar.ri = arrayList;
        kaVar.lr = jSONObject.optString("diff_data");
        kaVar.ik = jSONObject.optString("style_diff");
        kaVar.ka = jSONObject.optString("tag_diff");
        return kaVar;
    }
}
