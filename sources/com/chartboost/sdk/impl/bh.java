package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f13533a = EmptyList.X;

    public static final List a(JSONObject jSONObject) {
        List listAsList;
        List listA;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("blacklist");
        return (jSONArrayOptJSONArray == null || (listAsList = w7.asList(jSONArrayOptJSONArray)) == null || (listA = gh.a(listAsList)) == null) ? f13533a : listA;
    }

    public static final ah b(JSONObject jSONObject) {
        Intrinsics.f(jSONObject, "<this>");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("tracking");
        if (jSONObjectOptJSONObject == null) {
            return new ah(false, null, null, 0, 0, false, 0, 127, null);
        }
        boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("enabled", false);
        String strOptString = jSONObjectOptJSONObject.optString(com.p004ironsource.dc.r, "https://ssp-events.chartboost.com/track/sdk");
        int iOptInt = jSONObjectOptJSONObject.optInt("eventLimit", 10);
        int iOptInt2 = jSONObjectOptJSONObject.optInt("windowDuration", 60);
        boolean zOptBoolean2 = jSONObjectOptJSONObject.optBoolean("persistenceEnabled", true);
        int iOptInt3 = jSONObjectOptJSONObject.optInt("persistenceMaxEvents", 100);
        List listA = a(jSONObjectOptJSONObject);
        Intrinsics.c(strOptString);
        return new ah(zOptBoolean, listA, strOptString, iOptInt, iOptInt2, zOptBoolean2, iOptInt3);
    }

    public static final List a() {
        return f13533a;
    }
}
