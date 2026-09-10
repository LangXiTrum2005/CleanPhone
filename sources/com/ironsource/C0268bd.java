package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.bd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0268bd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Boolean f28300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f28301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final H3 f28302c;

    public C0268bd(JSONObject features) {
        kotlin.jvm.internal.n.f(features, "features");
        this.f28300a = features.has("enabled") ? Boolean.valueOf(features.getBoolean("enabled")) : null;
        this.f28301b = features.has("numOfSeconds") ? Integer.valueOf(features.getInt("numOfSeconds")) : null;
        this.f28302c = H3.Second;
    }

    public final Boolean a() {
        return this.f28300a;
    }

    public final Integer b() {
        return this.f28301b;
    }

    public final H3 c() {
        return this.f28302c;
    }
}
