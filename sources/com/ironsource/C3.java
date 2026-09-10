package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Boolean f25833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f25834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final H3 f25835c;

    public C3(JSONObject features) {
        kotlin.jvm.internal.n.f(features, "features");
        this.f25833a = features.has("enabled") ? Boolean.valueOf(features.getBoolean("enabled")) : null;
        this.f25834b = features.has("maxImpressions") ? Integer.valueOf(features.getInt("maxImpressions")) : null;
        this.f25835c = features.has("unit") ? H3.f26225c.a(features.optString("unit")) : null;
    }

    public final Boolean a() {
        return this.f25833a;
    }

    public final Integer b() {
        return this.f25834b;
    }

    public final H3 c() {
        return this.f25835c;
    }
}
