package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class Bf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f25753a;

    public Bf(JSONObject jSONObject) {
        this.f25753a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    public boolean a() {
        return this.f25753a.optBoolean("uxt", false);
    }

    public boolean b() {
        return this.f25753a.optBoolean(X3.a.f27679o, false);
    }

    public boolean c() {
        return this.f25753a.optBoolean(X3.a.f27680p, false);
    }

    public boolean d() {
        return this.f25753a.optBoolean(X3.a.l, false);
    }

    public boolean e() {
        return this.f25753a.optBoolean(X3.a.f27678n, false);
    }
}
