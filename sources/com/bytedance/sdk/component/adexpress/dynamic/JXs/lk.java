package com.bytedance.sdk.component.adexpress.dynamic.JXs;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lk {
    public JSONObject Lxb(List<com.bytedance.sdk.component.adexpress.dynamic.ZU.ZU.Lxb> list, int i, JSONObject jSONObject) {
        com.bytedance.sdk.component.adexpress.dynamic.ZU.ZU.Lxb next;
        JSONObject jSONObject2;
        if (list == null || list.size() <= 0) {
            return null;
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.ZU.ZU.Lxb> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next != null && next.Lxb == i) {
                break;
            }
        }
        if (next == null || (jSONObject2 = next.LD) == null) {
            return null;
        }
        return Lxb(jSONObject2, jSONObject);
    }

    private static JSONObject Lxb(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("customComponentDefaultValues");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("values");
            Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObjectOptJSONObject.put(next, jSONObjectOptJSONObject2.opt(next));
            }
            Iterator<String> itKeys2 = jSONObject.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                if (!TextUtils.equals(next2, "customComponentDefaultValues")) {
                    if (TextUtils.equals(next2, "values")) {
                        jSONObject3.put(next2, jSONObjectOptJSONObject);
                    } else {
                        jSONObject3.put(next2, jSONObject.opt(next2));
                    }
                }
            }
            jSONObject3.put("type", "vessel");
            JSONObject jSONObjectOptJSONObject3 = jSONObject2.optJSONObject("values");
            JSONObject jSONObjectOptJSONObject4 = jSONObject3.optJSONObject("values");
            if (jSONObjectOptJSONObject3 != null && jSONObjectOptJSONObject4 != null) {
                Iterator<String> itKeys3 = jSONObjectOptJSONObject3.keys();
                while (itKeys3.hasNext()) {
                    String next3 = itKeys3.next();
                    if (!"clickArea".equals(next3)) {
                        jSONObjectOptJSONObject4.put(next3, jSONObjectOptJSONObject3.opt(next3));
                    }
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObject3;
    }
}
