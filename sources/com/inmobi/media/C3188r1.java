package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdSet;
import java.util.LinkedList;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3188r1 {
    public final AbstractC3039l1 a;
    public final C2959hk b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public final C3164q1 j;

    public C3188r1(AbstractC3039l1 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.a = adUnit;
        this.b = new C2959hk();
        this.j = new C3164q1(this);
    }

    public final String a() {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        com.inmobi.media.ads.network.common.model.Ad ad;
        String telemetryMetadataBlob;
        AdSet adSetR = this.a.r();
        return (adSetR == null || (ads = adSetR.getAds()) == null || (ad = (com.inmobi.media.ads.network.common.model.Ad) CollectionsKt.firstOrNull(ads)) == null || (telemetryMetadataBlob = ad.getTelemetryMetadataBlob()) == null) ? "" : telemetryMetadataBlob;
    }
}
