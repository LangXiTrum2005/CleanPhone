package com.kochava.tracker.attribution;

import com.kochava.core.json.internal.JsonObjectApi;

/* JADX INFO: loaded from: classes5.dex */
public final class InstallAttribution implements InstallAttributionApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonObjectApi f28097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f28098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f28099c;

    public InstallAttribution(JsonObjectApi jsonObjectApi, boolean z2, boolean z3) {
        this.f28097a = jsonObjectApi;
        this.f28098b = z2;
        this.f28099c = z3;
    }

    @Override // com.kochava.tracker.attribution.InstallAttributionApi
    public final boolean a() {
        return this.f28099c;
    }

    @Override // com.kochava.tracker.attribution.InstallAttributionApi
    public final boolean b() {
        return this.f28098b;
    }
}
