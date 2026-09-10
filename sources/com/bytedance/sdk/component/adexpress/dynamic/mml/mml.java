package com.bytedance.sdk.component.adexpress.dynamic.mml;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class mml {
    public String lnr;
    public String mml;
    public List<qdl> qdl;
    public String ud;

    public static class qdl {
        public int qdl;
        public JSONObject ud;
    }

    public static mml qdl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        mml mmlVar = new mml();
        String strOptString = jSONObject.optString("custom_components");
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(strOptString);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject != null) {
                    qdl qdlVar = new qdl();
                    qdlVar.qdl = jSONObjectOptJSONObject.optInt("id");
                    qdlVar.ud = new JSONObject(jSONObjectOptJSONObject.optString("componentLayout"));
                    arrayList.add(qdlVar);
                }
            }
        } catch (JSONException unused) {
        }
        mmlVar.qdl = arrayList;
        mmlVar.ud = jSONObject.optString("diff_data");
        mmlVar.lnr = jSONObject.optString("style_diff");
        mmlVar.mml = jSONObject.optString("tag_diff");
        return mmlVar;
    }
}
