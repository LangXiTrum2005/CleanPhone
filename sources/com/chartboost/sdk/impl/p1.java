package com.chartboost.sdk.impl;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14799c;

    public p1(String str, String str2, String str3) {
        this.f14797a = str;
        this.f14798b = str2;
        this.f14799c = str3;
    }

    public static Map a(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        if (jSONObject == null) {
            za.a("deserializeAssets assetsJson is null", null);
            return map;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            Iterator<String> itKeys2 = jSONObject2.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                JSONObject jSONObject3 = jSONObject2.getJSONObject(next2);
                map.put(next2, new p1(next, jSONObject3.getString("filename"), jSONObject3.getString("url")));
            }
        }
        return map;
    }

    public static Map b(JSONObject jSONObject, int i2) {
        HashMap map = new HashMap();
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("cache_assets");
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if ("templates".equals(next)) {
                        map.putAll(a(jSONObject2, i2));
                    } else {
                        map.putAll(a(jSONObject2, next));
                    }
                }
            } catch (JSONException e2) {
                za.b("v2PrefetchToAssets: " + e2, null);
            }
        }
        return map;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Asset{directory='");
        sb.append(this.f14797a);
        sb.append("', filename='");
        sb.append(this.f14798b);
        sb.append("', url='");
        return android.support.v4.media.a.r(sb, this.f14799c, "'}");
    }

    public File a(File file) {
        if (this.f14797a != null && this.f14798b != null) {
            String str = this.f14797a + "/" + this.f14798b;
            try {
                return new File(file, str);
            } catch (Exception e2) {
                za.a("Cannot create file for path: " + str + ". Error: " + e2, null);
            }
        } else {
            za.a("Cannot create file. Directory or filename is null.", null);
        }
        return null;
    }

    public String a() {
        return this.f14799c;
    }

    public static Map a(JSONObject jSONObject, String str) throws JSONException {
        HashMap map = new HashMap();
        if (jSONObject != null && str != null) {
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                String string = jSONObject2.getString("name");
                map.put(string, new p1(str, string, jSONObject2.getString("value")));
            }
        }
        return map;
    }

    public static Map a(JSONObject jSONObject, int i2) throws JSONException {
        JSONArray jSONArrayOptJSONArray;
        HashMap map = new HashMap();
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray("templates")) != null) {
            int iMin = Math.min(i2, jSONArrayOptJSONArray.length());
            for (int i3 = 0; i3 < iMin; i3++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i3);
                Iterator it = a(jSONObject2 != null ? a(jSONObject2.getJSONArray("elements")) : null).entrySet().iterator();
                while (it.hasNext()) {
                    p1 p1Var = (p1) ((Map.Entry) it.next()).getValue();
                    map.put(p1Var.f14798b, p1Var);
                }
            }
        }
        return map;
    }

    public static JSONObject a(JSONArray jSONArray) throws JSONException {
        JSONObject jSONObjectA = s2.a(new s2.a[0]);
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                String strOptString = jSONObject.optString("name");
                String strOptString2 = jSONObject.optString("type");
                String strOptString3 = jSONObject.optString("value");
                String strOptString4 = jSONObject.optString("param");
                if (!"param".equals(strOptString2) && strOptString4.isEmpty()) {
                    JSONObject jSONObjectOptJSONObject = jSONObjectA.optJSONObject(strOptString2);
                    if (jSONObjectOptJSONObject == null) {
                        jSONObjectOptJSONObject = s2.a(new s2.a[0]);
                        jSONObjectA.put(strOptString2, jSONObjectOptJSONObject);
                    }
                    jSONObjectOptJSONObject.put("html".equals(strOptString2) ? "body" : strOptString, s2.a(s2.a("filename", strOptString), s2.a("url", strOptString3)));
                }
            }
        }
        return jSONObjectA;
    }
}
