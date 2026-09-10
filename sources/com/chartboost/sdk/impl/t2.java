package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t2 {
    public static final Boolean a(JSONObject jSONObject, String name) {
        Intrinsics.f(jSONObject, "<this>");
        Intrinsics.f(name, "name");
        try {
            return Boolean.valueOf(jSONObject.getBoolean(name));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final JSONObject a(JSONObject jSONObject, String name, Object obj) {
        Intrinsics.f(jSONObject, "<this>");
        Intrinsics.f(name, "name");
        try {
            jSONObject.put(name, obj);
            return jSONObject;
        } catch (JSONException e2) {
            za.b("put (" + name + ")" + e2, (Throwable) null, 2, (Object) null);
            return jSONObject;
        }
    }

    public static final byte[] a(JSONArray jSONArray) {
        Intrinsics.f(jSONArray, "<this>");
        String string = jSONArray.toString();
        Intrinsics.e(string, "toString(...)");
        byte[] bytes = string.getBytes(Charsets.f44691a);
        Intrinsics.e(bytes, "getBytes(...)");
        return bytes;
    }
}
