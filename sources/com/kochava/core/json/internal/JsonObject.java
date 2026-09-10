package com.kochava.core.json.internal;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.kochava.core.util.internal.ObjectUtil;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class JsonObject implements JsonObjectApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f28020a;

    public JsonObject(JSONObject jSONObject) {
        this.f28020a = jSONObject;
    }

    public static JsonObject w() {
        return new JsonObject(new JSONObject());
    }

    public static JsonObject x(String str, boolean z2) {
        try {
            return new JsonObject(new JSONObject(str));
        } catch (Exception unused) {
            if (z2) {
                return new JsonObject(new JSONObject());
            }
            return null;
        }
    }

    public final synchronized boolean A(String str, JsonArrayApi jsonArrayApi) {
        return v(jsonArrayApi, str);
    }

    public final synchronized boolean B(long j, String str) {
        return v(Long.valueOf(j), str);
    }

    @Override // com.kochava.core.json.internal.JsonObjectApi
    public final synchronized String a() {
        try {
        } catch (Exception unused) {
            return JsonUtils.EMPTY_JSON;
        }
        return this.f28020a.toString(2);
    }

    @Override // com.kochava.core.json.internal.JsonObjectApi
    public final synchronized void b(JsonObjectApi jsonObjectApi) {
        JSONObject jSONObjectM = jsonObjectApi.m();
        JsonObject jsonObject = new JsonObject(jSONObjectM);
        Iterator<String> itKeys = jSONObjectM.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objU = jsonObject.u(next);
            if (objU != null) {
                v(objU, next);
            }
        }
    }

    @Override // com.kochava.core.json.internal.JsonObjectApi
    public final synchronized JsonObject c() {
        return x(this.f28020a.toString(), true);
    }

    @Override // com.kochava.core.json.internal.JsonObjectApi
    public final synchronized JsonArrayApi d(String str) {
        return ObjectUtil.i(u(str));
    }

    @Override // com.kochava.core.json.internal.JsonObjectApi
    public final synchronized boolean e(String str, JsonElementApi jsonElementApi) {
        return v(jsonElementApi.d(), str);
    }

    public final synchronized boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (JsonObject.class == obj.getClass()) {
                JsonObject jsonObject = (JsonObject) obj;
                if (length() != jsonObject.length()) {
                    return false;
                }
                if (length() == 0) {
                    return true;
                }
                Iterator<String> itKeys = this.f28020a.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object objU = u(next);
                    if (objU == null || !jsonObject.y(objU, next)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.kochava.core.json.internal.JsonObjectApi
    public final synchronized Double f(String str, Double d) {
        return ObjectUtil.g(u(str), d);
    }

    @Override // com.kochava.core.json.internal.JsonObjectApi
    public final synchronized boolean g(String str, String str2) {
        return v(str2, str);
    }

    @Override // com.kochava.core.json.internal.JsonObjectApi
    public final synchronized String getString(String str, String str2) {
        String strN = ObjectUtil.n(u(str));
        if (strN != null) {
            str2 = strN;
        }
        return str2;
    }

    @Override // com.kochava.core.json.internal.JsonObjectApi
    public final synchronized ArrayList h() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> itKeys = this.f28020a.keys();
        while (itKeys.hasNext()) {
            arrayList.add(itKeys.next());
        }
        return arrayList;
    }

    public final synchronized int hashCode() {
        return toString().hashCode();
    }

    @Override // com.kochava.core.json.internal.JsonObjectApi
    public final synchronized boolean i(String str) {
        return this.f28020a.has(str);
    }

    @Override // com.kochava.core.json.internal.JsonObjectApi
    public final synchronized Boolean j(String str, Boolean bool) {
        return ObjectUtil.f(u(str), bool);
    }

    @Override // com.kochava.core.json.internal.JsonObjectApi
    public final synchronized JsonObjectApi k(String str, boolean z2) {
        return ObjectUtil.l(u(str), z2);
    }

    @Override // com.kochava.core.json.internal.JsonObjectApi
    public final synchronized JsonElement l(String str, boolean z2) {
        Object objU = u(str);
        if (objU == null && !z2) {
            return null;
        }
        return JsonElement.i(objU);
    }

    @Override // com.kochava.core.json.internal.JsonObjectApi
    public final synchronized int length() {
        return this.f28020a.length();
    }

    @Override // com.kochava.core.json.internal.JsonObjectApi
    public final synchronized JSONObject m() {
        return this.f28020a;
    }

    @Override // com.kochava.core.json.internal.JsonObjectApi
    public final synchronized Long n(String str, Long l2) {
        return ObjectUtil.m(l2, u(str));
    }

    @Override // com.kochava.core.json.internal.JsonObjectApi
    public final synchronized boolean o(String str, boolean z2) {
        return v(Boolean.valueOf(z2), str);
    }

    @Override // com.kochava.core.json.internal.JsonObjectApi
    public final synchronized JsonElement p() {
        return new JsonElement(this);
    }

    @Override // com.kochava.core.json.internal.JsonObjectApi
    public final synchronized boolean q(double d, String str) {
        return v(Double.valueOf(d), str);
    }

    @Override // com.kochava.core.json.internal.JsonObjectApi
    public final synchronized boolean r(String str, JsonObjectApi jsonObjectApi) {
        return v(jsonObjectApi, str);
    }

    @Override // com.kochava.core.json.internal.JsonObjectApi
    public final synchronized boolean remove(String str) {
        return this.f28020a.remove(str) != null;
    }

    @Override // com.kochava.core.json.internal.JsonObjectApi
    public final synchronized Integer s(Integer num, String str) {
        Integer numH = ObjectUtil.h(u(str));
        if (numH != null) {
            num = numH;
        }
        return num;
    }

    @Override // com.kochava.core.json.internal.JsonObjectApi
    public final synchronized JsonObject t(JsonObjectApi jsonObjectApi) {
        JsonObject jsonObject;
        jsonObject = new JsonObject(new JSONObject());
        JSONObject jSONObjectM = jsonObjectApi.m();
        JsonObject jsonObject2 = new JsonObject(jSONObjectM);
        Iterator<String> itKeys = jSONObjectM.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objU = jsonObject2.u(next);
            if (objU != null && !y(objU, next)) {
                jsonObject.v(objU, next);
            }
        }
        return jsonObject;
    }

    @Override // com.kochava.core.json.internal.JsonObjectApi
    public final synchronized String toString() {
        String string;
        string = this.f28020a.toString();
        if (string == null) {
            string = JsonUtils.EMPTY_JSON;
        }
        return string;
    }

    public final Object u(String str) {
        Object objOpt = this.f28020a.opt(str);
        if (objOpt == null) {
            return null;
        }
        if (objOpt instanceof JSONObject) {
            return new JsonObject((JSONObject) objOpt);
        }
        return objOpt instanceof JSONArray ? new JsonArray((JSONArray) objOpt) : objOpt;
    }

    public final boolean v(Object obj, String str) {
        try {
            JSONObject jSONObject = this.f28020a;
            if (obj instanceof JsonObjectApi) {
                obj = ((JsonObjectApi) obj).m();
            } else if (obj instanceof JsonArrayApi) {
                obj = ((JsonArrayApi) obj).c();
            }
            jSONObject.put(str, obj);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final synchronized boolean y(Object obj, String str) {
        Object objU;
        try {
            objU = u(str);
            if (obj instanceof JsonElementApi) {
                objU = JsonElement.i(objU);
            }
        } catch (Throwable th) {
            throw th;
        }
        return ObjectUtil.c(obj, objU);
    }

    public final synchronized boolean z(int i2, String str) {
        return v(Integer.valueOf(i2), str);
    }
}
