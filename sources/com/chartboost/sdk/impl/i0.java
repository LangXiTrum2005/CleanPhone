package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2 f14138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f14139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14140c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f14141e;
    public String f;

    public i0(b2 base64Wrapper) {
        Intrinsics.f(base64Wrapper, "base64Wrapper");
        this.f14138a = base64Wrapper;
        this.f14139b = "";
        this.d = "";
        this.f14141e = "";
        this.f = "";
    }

    public final z a(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            throw new JSONException("Missing response");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map linkedHashMap2 = new LinkedHashMap();
        JSONObject jSONObject2 = jSONObject.getJSONObject(com.ironsource.d9.h.K);
        JSONArray jSONArray = jSONObject2.getJSONArray("elements");
        Intrinsics.e(jSONArray, "getJSONArray(...)");
        a(jSONArray, linkedHashMap, linkedHashMap2);
        String string = jSONObject2.getString("template");
        Intrinsics.e(string, "getString(...)");
        String strOptString = jSONObject.optString("name");
        String string2 = jSONObject.getString("ad_id");
        String str = this.f14141e;
        String strOptString2 = jSONObject.optString("baseurl");
        ea eaVarC = c(jSONObject.optJSONObject("infoicon"));
        String string3 = jSONObject.getString("cgn");
        String string4 = jSONObject.getString(com.smartdigimkt.x.t.o1);
        String strOptString3 = jSONObject.optString("media-type");
        String str2 = this.f14139b;
        String strA = j0.a(str2);
        String string5 = jSONObject.getString("link");
        String strOptString4 = jSONObject.optString("deep-link");
        String string6 = jSONObject.getString("to");
        int i2 = this.f14140c;
        String str3 = this.d;
        p1 p1Var = (p1) linkedHashMap.get("body");
        if (p1Var == null) {
            throw new IllegalStateException("WebView AdUnit does not have a template html body asset");
        }
        cf cfVarA = cf.f13602c.a(jSONObject.optString("renderingengine"));
        List listA = a(jSONObject.optJSONArray("scripts"));
        Map mapB = b(jSONObject.optJSONObject("events"));
        kb kbVarA = j0.a(jSONObject.optInt("mtype"));
        c4 c4VarA = c4.f13578c.a(jSONObject.optInt("clkp"));
        String str4 = this.f;
        Intrinsics.c(strOptString);
        Intrinsics.c(string2);
        Intrinsics.c(strOptString2);
        Intrinsics.c(string3);
        Intrinsics.c(string4);
        Intrinsics.c(strOptString3);
        Intrinsics.c(string5);
        Intrinsics.c(strOptString4);
        Intrinsics.c(string6);
        return new z(strOptString, string2, strOptString2, str, eaVarC, string3, string4, strOptString3, linkedHashMap, str2, strA, string5, strOptString4, string6, i2, str3, string, p1Var, linkedHashMap2, cfVarA, listA, mapB, null, null, kbVarA, c4VarA, str4, 12582912, null);
    }

    public final Map b(JSONObject jSONObject) throws JSONException {
        Iterator<String> itKeys;
        HashMap map = new HashMap();
        if (jSONObject != null && (itKeys = jSONObject.keys()) != null) {
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONArray jSONArray = jSONObject.getJSONArray(next);
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    String string = jSONArray.getString(i2);
                    Intrinsics.e(string, "getString(...)");
                    arrayList.add(string);
                }
                Intrinsics.c(next);
                map.put(next, arrayList);
            }
        }
        return map;
    }

    public final ea c(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new ea(null, null, null, null, null, null, 63, null);
        }
        String strOptString = jSONObject.optString("imageurl");
        Intrinsics.e(strOptString, "optString(...)");
        String strOptString2 = jSONObject.optString("clickthroughUrl");
        Intrinsics.e(strOptString2, "optString(...)");
        return new ea(strOptString, strOptString2, ea.b.f13802c.a(jSONObject.optInt("position")), d(jSONObject.optJSONObject("margin")), d(jSONObject.optJSONObject("padding")), d(jSONObject.optJSONObject("size")));
    }

    public final ea.a d(JSONObject jSONObject) {
        return jSONObject != null ? new ea.a(jSONObject.optDouble("w"), jSONObject.optDouble(com.smartdigimkt.m3.h.f36614b)) : new ea.a(0.0d, 0.0d, 3, null);
    }

    public final void a(JSONArray jSONArray, Map map, Map map2) throws JSONException {
        for (JSONObject jSONObject : w7.asList(jSONArray)) {
            String string = jSONObject.getString("name");
            String string2 = jSONObject.getString("type");
            String string3 = jSONObject.getString("value");
            String strOptString = jSONObject.optString("param");
            if (string2 != null) {
                int iHashCode = string2.hashCode();
                if (iHashCode != -1333900842) {
                    if (iHashCode != 3213227) {
                        if (iHashCode == 106436749 && string2.equals("param")) {
                            Intrinsics.c(strOptString);
                            Intrinsics.c(string3);
                            map2.put(strOptString, string3);
                            if (string != null) {
                                int iHashCode2 = string.hashCode();
                                if (iHashCode2 != -1422292723) {
                                    if (iHashCode2 != -1389119727) {
                                        if (iHashCode2 != -878282975) {
                                            if (iHashCode2 == -315925656 && string.equals("reward_amount")) {
                                                a(string3);
                                            }
                                        } else if (string.equals("reward_currency")) {
                                            this.d = string3;
                                        }
                                    } else if (string.equals("impression_id")) {
                                        this.f14141e = string3;
                                    }
                                } else if (string.equals("adm.js")) {
                                    this.f = this.f14138a.b(string3);
                                }
                            }
                        }
                    } else {
                        if (string2.equals("html")) {
                            Intrinsics.c(strOptString);
                            if (strOptString.length() == 0) {
                                strOptString = "body";
                            }
                        }
                        Intrinsics.c(strOptString);
                        map.put(strOptString, new p1(string2, string, string3));
                    }
                } else if (string2.equals("preCachedVideo")) {
                    Intrinsics.c(string3);
                    this.f14139b = string3;
                }
            }
            Intrinsics.c(strOptString);
            if (strOptString.length() == 0) {
                strOptString = string;
            }
            Intrinsics.c(strOptString);
            map.put(strOptString, new p1(string2, string, string3));
        }
    }

    public final void a(String str) {
        int i2;
        try {
            i2 = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            i2 = 0;
        }
        this.f14140c = i2;
    }

    public final List a(JSONArray jSONArray) {
        List listAsList;
        return (jSONArray == null || (listAsList = w7.asList(jSONArray)) == null) ? EmptyList.X : listAsList;
    }
}
