package com.bytedance.sdk.component.adexpress.dynamic.fi;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class jbs {
    public static String lr(String str, String str2) {
        if (!com.bytedance.sdk.component.adexpress.ka.lr()) {
            return ri.ri(str);
        }
        if (str.indexOf(46) < 0) {
            str = str + ".png";
        }
        return str2 + "static/images/" + str;
    }

    public static void ri(String str, JSONObject jSONObject) {
        JSONObject jSONObjectZk = com.bytedance.sdk.component.adexpress.lr.zk(str);
        if (jSONObjectZk == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObjectOptJSONObject = jSONObjectZk.optJSONObject("values");
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        ri(jSONObjectOptJSONObject, jSONObject);
    }

    public static JSONObject ri(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObjectZk = com.bytedance.sdk.component.adexpress.lr.zk(str);
        if (jSONObjectZk == null) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return ri(jSONObject2, jSONObjectZk.optJSONObject("themeValues"), jSONObject);
    }

    private static void ri(JSONObject jSONObject, JSONObject jSONObject2) {
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

    public static JSONObject ri(JSONObject... jSONObjectArr) {
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

    public static String ri(String str) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectZk = com.bytedance.sdk.component.adexpress.lr.zk(str);
        if (jSONObjectZk == null || (jSONObjectOptJSONObject = jSONObjectZk.optJSONObject("values")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optString("data");
    }

    public static String ri(String str, String str2) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectZk = com.bytedance.sdk.component.adexpress.lr.zk(str);
        if (jSONObjectZk == null || (jSONObjectOptJSONObject = jSONObjectZk.optJSONObject("values")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optString(str2);
    }

    public static JSONObject ri(JSONArray jSONArray) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONArray == null || jSONArray.length() <= 0 || (jSONObjectOptJSONObject = jSONArray.optJSONObject(0)) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optJSONObject("values");
    }
}
