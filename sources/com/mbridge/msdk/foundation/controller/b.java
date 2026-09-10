package com.mbridge.msdk.foundation.controller;

import android.util.Log;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, com.mbridge.msdk.foundation.cache.d> f33424a;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.controller.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class C0119b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static b f33425a = new b();
    }

    public static b a() {
        return C0119b.f33425a;
    }

    public com.mbridge.msdk.foundation.cache.d b(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        Exception e10;
        if (this.f33424a == null) {
            this.f33424a = new HashMap<>();
        }
        if (this.f33424a.containsKey(str)) {
            return this.f33424a.get(str);
        }
        if (jSONArray == null) {
            try {
                jSONArray2 = new JSONArray();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("c_cb", 0);
                    jSONObject.put("t_disc", 0.95d);
                    jSONObject.put("u_disc", 0.95d);
                    jSONObject.put("max_ecppv_diff", 0);
                    jSONObject.put("max_cache_num", 20);
                    jSONObject.put("max_usage_limit", 10);
                    jSONObject.put("time_interval", 7200);
                    jSONArray2.put(jSONObject);
                } catch (Exception e11) {
                    e10 = e11;
                    Log.e("CandidateController", e10.getMessage());
                }
            } catch (Exception e12) {
                jSONArray2 = jSONArray;
                e10 = e12;
            }
            jSONArray = jSONArray2;
        }
        return a(str, jSONArray);
    }

    private b() {
        this.f33424a = new HashMap<>();
    }

    public com.mbridge.msdk.foundation.cache.d a(String str, JSONArray jSONArray) {
        if (this.f33424a == null) {
            this.f33424a = new HashMap<>();
        }
        if (this.f33424a.containsKey(str)) {
            return this.f33424a.get(str);
        }
        com.mbridge.msdk.foundation.cache.d dVar = new com.mbridge.msdk.foundation.cache.d(str, jSONArray);
        this.f33424a.put(str, dVar);
        return dVar;
    }
}
