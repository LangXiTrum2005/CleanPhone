package com.ironsource;

import org.json.JSONObject;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3697q {
    private final Boolean a;

    public C3697q(JSONObject adFormatAuctionSettings) {
        Intrinsics.checkNotNullParameter(adFormatAuctionSettings, "adFormatAuctionSettings");
        this.a = adFormatAuctionSettings.has(r.a) ? Boolean.valueOf(adFormatAuctionSettings.optBoolean(r.a)) : null;
    }

    public final Boolean a() {
        return this.a;
    }
}
