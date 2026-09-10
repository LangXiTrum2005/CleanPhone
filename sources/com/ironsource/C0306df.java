package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.df, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0306df {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private EnumC0324ef f28473a;

    public C0306df(JSONObject config) {
        kotlin.jvm.internal.n.f(config, "config");
        this.f28473a = EnumC0324ef.f28546b.a(config.optInt(X3.a.f27684t, EnumC0324ef.CurrentlyLoadedAds.b()));
    }

    public final EnumC0324ef a() {
        return this.f28473a;
    }
}
