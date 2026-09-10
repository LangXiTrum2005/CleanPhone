package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.bridge.gms.AdvertisingId;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ax, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1776ax implements TC {
    public final /* synthetic */ AdvertisingId A00;
    public final /* synthetic */ C1767ao A01;

    public C1776ax(C1767ao c1767ao, AdvertisingId advertisingId) {
        this.A01 = c1767ao;
        this.A00 = advertisingId;
    }

    @Override // com.facebook.ads.redexgen.core.TC
    public final boolean AAX() {
        return this.A00.isLimitAdTracking();
    }

    @Override // com.facebook.ads.redexgen.core.TC
    public final String getId() {
        return this.A00.getId();
    }
}
