package com.bytedance.sdk.component.adexpress.dynamic.mzz;

import android.support.v4.media.a;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class tvp {
    public static void qdl(String str, JSONObject jSONObject) {
        JSONObject jSONObjectRa = com.bytedance.sdk.component.adexpress.ud.ra(str);
        if (jSONObjectRa == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObjectOptJSONObject = jSONObjectRa.optJSONObject("values");
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        qdl(jSONObjectOptJSONObject, jSONObject);
    }

    public static String ud(String str, String str2) {
        if (!com.bytedance.sdk.component.adexpress.mml.ud()) {
            return qdl.qdl(str);
        }
        if (str.indexOf(46) < 0) {
            str = str.concat(".png");
        }
        return a.D(str2, "static/images/", str);
    }

    public static JSONObject qdl(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObjectRa = com.bytedance.sdk.component.adexpress.ud.ra(str);
        if (jSONObjectRa == null) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return qdl(jSONObject2, jSONObjectRa.optJSONObject("themeValues"), jSONObject);
    }

    private static void qdl(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        if (jSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!jSONObject2.has(next)) {
                try {
                    jSONObject2.put(next, jSONObject.opt(next));
                } catch (JSONException unused) {
                }
            }
        }
    }

    public static JSONObject qdl(JSONObject... jSONObjectArr) {
        JSONObject jSONObject = new JSONObject();
        for (JSONObject jSONObject2 : jSONObjectArr) {
            if (jSONObject2 != null) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        jSONObject.put(next, jSONObject2.opt(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        return jSONObject;
    }

    public static String qdl(String str) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectRa = com.bytedance.sdk.component.adexpress.ud.ra(str);
        if (jSONObjectRa == null || (jSONObjectOptJSONObject = jSONObjectRa.optJSONObject("values")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optString("data");
    }

    public static String qdl(String str, String str2) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectRa = com.bytedance.sdk.component.adexpress.ud.ra(str);
        if (jSONObjectRa == null || (jSONObjectOptJSONObject = jSONObjectRa.optJSONObject("values")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optString(str2);
    }

    public static JSONObject qdl(JSONArray jSONArray) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONArray == null || jSONArray.length() <= 0 || (jSONObjectOptJSONObject = jSONArray.optJSONObject(0)) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optJSONObject("values");
    }
}
