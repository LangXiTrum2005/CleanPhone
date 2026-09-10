package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.bridge.gms.AdvertisingId;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1804jd implements AnonymousClass89 {
    public final /* synthetic */ AdvertisingId A00;
    public final /* synthetic */ C1803jc A01;

    public C1804jd(C1803jc c1803jc, AdvertisingId advertisingId) {
        this.A01 = c1803jc;
        this.A00 = advertisingId;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass89
    public final boolean AAM() {
        return this.A00.isLimitAdTracking();
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass89
    public final String getId() {
        return this.A00.getId();
    }
}
