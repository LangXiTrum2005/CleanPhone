package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ed {
    public static final List a(JSONObject jSONObject) {
        List<JSONObject> listAsListSkipNull;
        ni niVar;
        Intrinsics.f(jSONObject, "<this>");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("verification");
        if (jSONArrayOptJSONArray == null || (listAsListSkipNull = w7.asListSkipNull(jSONArrayOptJSONArray)) == null) {
            return EmptyList.X;
        }
        ArrayList arrayList = new ArrayList();
        for (JSONObject jSONObject2 : listAsListSkipNull) {
            try {
                String string = jSONObject2.getString("url");
                Intrinsics.e(string, "getString(...)");
                String string2 = jSONObject2.getString("vendor");
                Intrinsics.e(string2, "getString(...)");
                String string3 = jSONObject2.getString("params");
                Intrinsics.e(string3, "getString(...)");
                niVar = new ni(string, string2, string3);
            } catch (Exception unused) {
                niVar = null;
            }
            if (niVar != null) {
                arrayList.add(niVar);
            }
        }
        return arrayList;
    }

    public static final dd b(JSONObject config) {
        Intrinsics.f(config, "config");
        List listA = a(config);
        JSONObject jSONObjectOptJSONObject = config.optJSONObject("viewabilitySettings");
        if (jSONObjectOptJSONObject != null) {
            return new dd(config.optBoolean("enabled", false), config.optBoolean("verificationEnabled", false), jSONObjectOptJSONObject.optInt("minVisibleDips", 1), jSONObjectOptJSONObject.optInt("minVisibleDurationMs", 0), jSONObjectOptJSONObject.optLong("visibilityCheckIntervalMs", 100L), jSONObjectOptJSONObject.optInt("traversalLimit", 25), listA);
        }
        return new dd(config.optBoolean("enabled", false), config.optBoolean("verificationEnabled", false), 0, 0, 0L, 0, listA, 60, null);
    }
}
