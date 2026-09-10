package com.mbridge.msdk.config.dynamic.utils;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class e {
    public Map<String, Object> a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap();
        }
        try {
            return a(new JSONObject(str));
        } catch (JSONException e10) {
            q0.b("JSONParser", e10.getMessage(), e10);
            return new HashMap();
        }
    }

    public Map<String, Object> a(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (jSONObject != null && jSONObject.length() != 0) {
            try {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object obj = jSONObject.get(next);
                    if (obj instanceof JSONObject) {
                        linkedHashMap.put(next, a((JSONObject) obj));
                    } else if (obj instanceof JSONArray) {
                        linkedHashMap.put(next, a((JSONArray) obj));
                    } else {
                        linkedHashMap.put(next, obj);
                    }
                }
            } catch (Throwable th2) {
                q0.b("JSONParser", th2.getMessage(), th2);
            }
        }
        return linkedHashMap;
    }

    public List<Object> a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                Object obj = jSONArray.get(i10);
                if (obj instanceof JSONObject) {
                    arrayList.add(a((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    arrayList.add(a((JSONArray) obj));
                } else {
                    arrayList.add(obj);
                }
            } catch (Throwable th2) {
                q0.b("JSONParser", th2.getMessage(), th2);
                return arrayList;
            }
        }
        return arrayList;
    }
}
