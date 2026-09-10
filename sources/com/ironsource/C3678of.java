package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.of, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3678of {
    private final JSONObject a;

    public C3678of(JSONObject jSONObject) {
        this.a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    public boolean a() {
        return this.a.optBoolean("uxt", false);
    }

    public boolean b() {
        return this.a.optBoolean(X3.a.o, false);
    }

    public boolean c() {
        return this.a.optBoolean(X3.a.p, false);
    }

    public boolean d() {
        return this.a.optBoolean(X3.a.l, false);
    }

    public boolean e() {
        return this.a.optBoolean(X3.a.n, false);
    }
}
