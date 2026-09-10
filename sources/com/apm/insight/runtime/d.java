package com.apm.insight.runtime;

import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HashMap<String, d> f10321a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f10322b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f10323c = null;
    private boolean d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f10324e;

    private d(JSONObject jSONObject, String str) {
        this.f10324e = str;
        a(jSONObject);
        f10321a.put(this.f10324e, this);
        com.apm.insight.a.a((Object) "after update aid ".concat(String.valueOf(str)));
    }

    private void a(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        this.f10322b = jSONObject;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("error_module")) == null) {
            return;
        }
        this.d = jSONObjectOptJSONObject.optInt("switcher") == 1 && jSONObjectOptJSONObject.optInt("err_sampling_rate") == 1;
    }

    public static JSONObject b(String str) {
        d dVar = f10321a.get(str);
        if (dVar != null) {
            return dVar.f10322b;
        }
        return null;
    }

    public static d c(String str) {
        return f10321a.get(str);
    }

    public static long d(String str) {
        d dVar = f10321a.get(str);
        if (dVar == null) {
            return com.thinkup.core.common.om.n.m;
        }
        try {
            return Long.decode(com.apm.insight.a.a(dVar.f10322b, "over_all", "get_settings_interval")).longValue() * 1000;
        } catch (Throwable unused) {
            return com.thinkup.core.common.om.n.m;
        }
    }

    public static boolean e(String str) {
        JSONObject jSONObject;
        d dVar = f10321a.get(str);
        return (dVar == null || (jSONObject = dVar.f10322b) == null || 1 != com.apm.insight.a.a(jSONObject, 0, "crash_module", "switcher")) ? false : true;
    }

    public static boolean f(String str) {
        JSONObject jSONObject;
        d dVar = f10321a.get(str);
        return (dVar == null || (jSONObject = dVar.f10322b) == null || 1 != com.apm.insight.a.a(jSONObject, 0, "crash_module", "switcher")) ? false : true;
    }

    public static boolean g(String str) {
        JSONObject jSONObject;
        d dVar = f10321a.get(str);
        return (dVar == null || (jSONObject = dVar.f10322b) == null || 1 != com.apm.insight.a.a(jSONObject, 0, "crash_module", "switcher")) ? false : true;
    }

    public final boolean a() {
        if (this.f10322b == null) {
            return false;
        }
        return this.d;
    }

    public static boolean a(String str) {
        return f10321a.get(str) != null;
    }

    public static void a(String str, JSONObject jSONObject) {
        d dVar = f10321a.get(str);
        if (dVar != null) {
            dVar.a(jSONObject);
        } else {
            new d(jSONObject, str);
        }
    }
}
