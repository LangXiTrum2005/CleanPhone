package com.chartboost.sdk.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s2 {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f15085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f15086b;

        public a(String str, Object obj) {
            this.f15085a = str;
            this.f15086b = obj;
        }
    }

    public static JSONObject a(a... aVarArr) {
        JSONObject jSONObject = new JSONObject();
        for (a aVar : aVarArr) {
            a(jSONObject, aVar.f15085a, aVar.f15086b);
        }
        return jSONObject;
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e2) {
            za.b("put (" + str + ")", e2);
        }
    }

    public static JSONObject a(JSONObject jSONObject, String... strArr) {
        for (String str : strArr) {
            if (jSONObject == null) {
                break;
            }
            jSONObject = jSONObject.optJSONObject(str);
        }
        return jSONObject;
    }

    public static a a(String str, Object obj) {
        return new a(str, obj);
    }
}
