package com.bytedance.sdk.component.adexpress.dynamic.JXs;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class QAg {
    public static String LD(String str, String str2) {
        if (!com.bytedance.sdk.component.adexpress.ZU.LD()) {
            return Lxb.Lxb(str);
        }
        if (str.indexOf(46) < 0) {
            str = str.concat(".png");
        }
        return DM.i(str2, "static/images/", str);
    }

    public static void Lxb(String str, JSONObject jSONObject) {
        JSONObject jSONObjectLv = com.bytedance.sdk.component.adexpress.LD.Lv(str);
        if (jSONObjectLv == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObjectOptJSONObject = jSONObjectLv.optJSONObject("values");
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        Lxb(jSONObjectOptJSONObject, jSONObject);
    }

    public static JSONObject Lxb(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObjectLv = com.bytedance.sdk.component.adexpress.LD.Lv(str);
        if (jSONObjectLv == null) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return Lxb(jSONObject2, jSONObjectLv.optJSONObject("themeValues"), jSONObject);
    }

    private static void Lxb(JSONObject jSONObject, JSONObject jSONObject2) {
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

    public static JSONObject Lxb(JSONObject... jSONObjectArr) {
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

    public static String Lxb(String str) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectLv = com.bytedance.sdk.component.adexpress.LD.Lv(str);
        if (jSONObjectLv == null || (jSONObjectOptJSONObject = jSONObjectLv.optJSONObject("values")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optString("data");
    }

    public static String Lxb(String str, String str2) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectLv = com.bytedance.sdk.component.adexpress.LD.Lv(str);
        if (jSONObjectLv == null || (jSONObjectOptJSONObject = jSONObjectLv.optJSONObject("values")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optString(str2);
    }

    public static JSONObject Lxb(JSONArray jSONArray) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONArray == null || jSONArray.length() <= 0 || (jSONObjectOptJSONObject = jSONArray.optJSONObject(0)) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optJSONObject("values");
    }
}
