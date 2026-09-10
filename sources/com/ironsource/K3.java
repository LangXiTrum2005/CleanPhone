package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class K3 implements U5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f26389a;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26390a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final boolean f26391b = false;

        private a() {
        }
    }

    public K3(JSONObject jSONObject) {
        this.f26389a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // com.ironsource.U5
    public boolean b() {
        return this.f26389a.optBoolean("clickCheck", false);
    }
}
