package sg.bigo.ads.common.utils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class l {
    public static String a(Map<?, ?> map) {
        if (k.a(map)) {
            return null;
        }
        try {
            return new JSONObject(map).toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(Map map, Object obj) {
        Object obj2;
        if (map == null || (obj2 = map.get(obj)) == null) {
            return null;
        }
        return obj2 instanceof String ? (String) obj2 : String.valueOf(obj2);
    }

    public static Map<String, String> a(String str) {
        JSONObject jSONObject;
        String strOptString;
        HashMap map = new HashMap();
        if (!q.a((CharSequence) str)) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (next != null && (strOptString = jSONObject.optString(next)) != null) {
                        map.put(next, strOptString);
                    }
                }
            }
        }
        return map;
    }
}
