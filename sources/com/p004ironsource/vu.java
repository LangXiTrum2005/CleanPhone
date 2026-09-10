package com.p004ironsource;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class vu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f27546a;

    public vu(JSONObject jSONObject) {
        this.f27546a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    public boolean a() {
        return this.f27546a.optBoolean("uxt", false);
    }

    public boolean b() {
        return this.f27546a.optBoolean(d9.a.o, false);
    }

    public boolean c() {
        return this.f27546a.optBoolean(d9.a.f24640p, false);
    }

    public boolean d() {
        return this.f27546a.optBoolean(d9.a.f24638l, false);
    }

    public boolean e() {
        return this.f27546a.optBoolean(d9.a.f24639n, false);
    }
}
