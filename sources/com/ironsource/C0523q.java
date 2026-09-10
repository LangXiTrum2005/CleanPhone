package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0523q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Boolean f30036a;

    public C0523q(JSONObject adFormatAuctionSettings) {
        kotlin.jvm.internal.n.f(adFormatAuctionSettings, "adFormatAuctionSettings");
        this.f30036a = adFormatAuctionSettings.has(r.f30124a) ? Boolean.valueOf(adFormatAuctionSettings.optBoolean(r.f30124a)) : null;
    }

    public final Boolean a() {
        return this.f30036a;
    }
}
