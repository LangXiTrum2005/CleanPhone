package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class J3 implements U5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f26331a;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26332a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final boolean f26333b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f26334c = "curlError";

        private a() {
        }
    }

    public J3(JSONObject jSONObject) {
        this.f26331a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // com.ironsource.U5
    public boolean b() {
        return this.f26331a.optBoolean("enabled", false);
    }

    public final boolean d() {
        return this.f26331a.optBoolean("closeActivity", true);
    }

    public final boolean e() {
        return this.f26331a.optBoolean("reportController", true);
    }
}
