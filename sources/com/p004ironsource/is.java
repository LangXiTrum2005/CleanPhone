package com.p004ironsource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class is {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f25369a;

    public is() {
        this.f25369a = new JSONObject();
    }

    public static Object b(Object obj) throws JSONException {
        if (!(obj instanceof Map)) {
            if (!(obj instanceof Iterable)) {
                return obj;
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            return jSONArray;
        }
        JSONObject jSONObject = new JSONObject();
        Map map = (Map) obj;
        for (Object obj2 : map.keySet()) {
            if (obj2 != null) {
                jSONObject.put(obj2.toString(), b(map.get(obj2)));
            }
        }
        return jSONObject;
    }

    private void f(String str) {
        try {
            this.f25369a = new JSONObject(str);
        } catch (Exception e2) {
            q9.d().a(e2);
            this.f25369a = new JSONObject();
        }
    }

    public int a(String str, int i2) {
        return this.f25369a.optInt(str, i2);
    }

    public boolean c(String str) {
        return this.f25369a.optBoolean(str);
    }

    public String d(String str) {
        return this.f25369a.optString(str, null);
    }

    public boolean e(String str) {
        return a().isNull(str);
    }

    public String toString() {
        JSONObject jSONObject = this.f25369a;
        return jSONObject == null ? "" : jSONObject.toString();
    }

    public is(String str) {
        f(str);
    }

    private Object a(Object obj) throws JSONException {
        if (obj == JSONObject.NULL) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return b((JSONObject) obj);
        }
        return obj instanceof JSONArray ? a((JSONArray) obj) : obj;
    }

    public Object b(String str) {
        try {
            return a().get(str);
        } catch (JSONException e2) {
            q9.d().a(e2);
            return null;
        }
    }

    private Map<String, Object> b(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, a(jSONObject.get(next)));
        }
        return map;
    }

    public String a(String str, String str2) {
        return this.f25369a.optString(str, str2);
    }

    public List a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(a(jSONArray.get(i2)));
        }
        return arrayList;
    }

    public void b(String str, String str2) {
        try {
            this.f25369a.put(str, str2);
        } catch (Exception e2) {
            q9.d().a(e2);
        }
    }

    public JSONObject a() {
        return this.f25369a;
    }

    public void a(String str, JSONObject jSONObject) {
        try {
            this.f25369a.put(str, jSONObject);
        } catch (Exception e2) {
            q9.d().a(e2);
        }
    }

    public boolean a(String str) {
        return a().has(str);
    }

    public static boolean a(JSONObject jSONObject) {
        return jSONObject.names() == null;
    }
}
