package com.ironsource;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class L6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f26488b = "userId";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f26489c = "appKey";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static L6 f26490d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f26491a = new JSONObject();

    private L6() {
    }

    public static synchronized L6 a() {
        try {
            if (f26490d == null) {
                f26490d = new L6();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f26490d;
    }

    public synchronized JSONObject b() throws JSONException {
        if (Kb.Y().h().v()) {
            return new JSONObject(this.f26491a.toString());
        }
        return this.f26491a;
    }

    public synchronized void a(Map<String, Object> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                a(str, map.get(str));
            }
        }
    }

    public synchronized void a(String str, Object obj) {
        try {
            this.f26491a.put(str, obj);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
        }
    }

    public synchronized String a(String str) {
        return this.f26491a.optString(str);
    }
}
