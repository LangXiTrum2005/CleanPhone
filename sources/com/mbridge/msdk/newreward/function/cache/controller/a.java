package com.mbridge.msdk.newreward.function.cache.controller;

import com.mbridge.msdk.newreward.function.cache.c;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, c> f1613a;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static a f1614a = new a();
    }

    public static a a() {
        return b.f1614a;
    }

    public c b(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        Exception e;
        if (this.f1613a == null) {
            this.f1613a = new HashMap<>();
        }
        if (this.f1613a.containsKey(str)) {
            return this.f1613a.get(str);
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
                } catch (Exception e2) {
                    e = e2;
                    e.getMessage();
                }
            } catch (Exception e3) {
                jSONArray2 = jSONArray;
                e = e3;
            }
            jSONArray = jSONArray2;
        }
        return a(str, jSONArray);
    }

    private a() {
        this.f1613a = new HashMap<>();
    }

    public c a(String str, JSONArray jSONArray) {
        if (this.f1613a == null) {
            this.f1613a = new HashMap<>();
        }
        if (this.f1613a.containsKey(str)) {
            return this.f1613a.get(str);
        }
        c cVar = new c(str, jSONArray);
        this.f1613a.put(str, cVar);
        return cVar;
    }
}
