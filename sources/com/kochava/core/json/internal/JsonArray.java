package com.kochava.core.json.internal;

import com.kochava.core.util.internal.ObjectUtil;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class JsonArray implements JsonArrayApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONArray f28016a;

    public JsonArray(JSONArray jSONArray) {
        this.f28016a = jSONArray;
    }

    public static JsonArray g() {
        return new JsonArray(new JSONArray());
    }

    @Override // com.kochava.core.json.internal.JsonArrayApi
    public final synchronized String a() {
        try {
        } catch (Exception unused) {
            return "[]";
        }
        return this.f28016a.toString(2);
    }

    @Override // com.kochava.core.json.internal.JsonArrayApi
    public final synchronized JsonObjectApi b(int i2) {
        return ObjectUtil.l(d(i2), false);
    }

    @Override // com.kochava.core.json.internal.JsonArrayApi
    public final synchronized JSONArray c() {
        return this.f28016a;
    }

    public final Object d(int i2) {
        Object objOpt = this.f28016a.opt(i2);
        if (objOpt == null) {
            return null;
        }
        if (objOpt instanceof JSONObject) {
            return new JsonObject((JSONObject) objOpt);
        }
        return objOpt instanceof JSONArray ? new JsonArray((JSONArray) objOpt) : objOpt;
    }

    public final boolean e(Object obj) {
        JSONArray jSONArray = this.f28016a;
        if (obj instanceof JsonObjectApi) {
            obj = ((JsonObjectApi) obj).m();
        } else if (obj instanceof JsonArrayApi) {
            obj = ((JsonArrayApi) obj).c();
        }
        jSONArray.put(obj);
        return true;
    }

    public final synchronized boolean equals(Object obj) {
        boolean zC;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            try {
                if (JsonArray.class == obj.getClass()) {
                    JsonArray jsonArray = (JsonArray) obj;
                    if (length() != jsonArray.length()) {
                        return false;
                    }
                    if (length() == 0) {
                        return true;
                    }
                    for (int i2 = 0; i2 < length(); i2++) {
                        Object objD = d(i2);
                        if (objD != null) {
                            synchronized (jsonArray) {
                                try {
                                    Object objD2 = jsonArray.d(i2);
                                    if (objD instanceof JsonElementApi) {
                                        objD2 = JsonElement.i(objD2);
                                    }
                                    zC = ObjectUtil.c(objD, objD2);
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            if (zC) {
                            }
                        }
                        return false;
                    }
                    return true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return false;
    }

    public final synchronized boolean f(JsonObjectApi jsonObjectApi) {
        e(jsonObjectApi);
        return true;
    }

    @Override // com.kochava.core.json.internal.JsonArrayApi
    public final synchronized Double getDouble(int i2) {
        return ObjectUtil.g(d(i2), null);
    }

    @Override // com.kochava.core.json.internal.JsonArrayApi
    public final synchronized String getString(int i2) {
        String strN;
        strN = ObjectUtil.n(d(i2));
        if (strN == null) {
            strN = null;
        }
        return strN;
    }

    public final synchronized int hashCode() {
        return toString().hashCode();
    }

    @Override // com.kochava.core.json.internal.JsonArrayApi
    public final synchronized int length() {
        return this.f28016a.length();
    }

    public final synchronized String toString() {
        String string;
        string = this.f28016a.toString();
        if (string == null) {
            string = "[]";
        }
        return string;
    }
}
