package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Qd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f27107b;

    public Qd(JSONObject features, String nameKey, String amountKey) {
        kotlin.jvm.internal.n.f(features, "features");
        kotlin.jvm.internal.n.f(nameKey, "nameKey");
        kotlin.jvm.internal.n.f(amountKey, "amountKey");
        this.f27106a = features.has(nameKey) ? features.getString(nameKey) : null;
        this.f27107b = features.has(amountKey) ? Integer.valueOf(features.getInt(amountKey)) : null;
    }

    public final Integer a() {
        return this.f27107b;
    }

    public final String b() {
        return this.f27106a;
    }
}
