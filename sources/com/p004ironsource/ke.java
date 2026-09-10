package com.p004ironsource;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ke {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f25528b = "userId";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f25529c = "appKey";
    private static ke d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f25530a = new JSONObject();

    private ke() {
    }

    public static synchronized ke a() {
        try {
            if (d == null) {
                d = new ke();
            }
        } catch (Throwable th) {
            throw th;
        }
        return d;
    }

    public synchronized JSONObject b() {
        return this.f25530a;
    }

    public synchronized String a(String str) {
        return this.f25530a.optString(str);
    }

    public synchronized void a(String str, Object obj) {
        try {
            this.f25530a.put(str, obj);
        } catch (Exception e2) {
            q9.d().a(e2);
        }
    }

    public synchronized void a(Map<String, Object> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                a(str, map.get(str));
            }
        }
    }
}
