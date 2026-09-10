package com.unity3d.ads.core.data.repository;

import fn.g;
import fn.m0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidAdRevenueRepository;", "Lcom/unity3d/ads/core/data/repository/AdRevenueRepository;", "<init>", "()V", "Lfn/m0;", "Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequest;", "adRevenueEvents", "Lfn/m0;", "getAdRevenueEvents", "()Lfn/m0;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidAdRevenueRepository implements AdRevenueRepository {
    private final m0 adRevenueEvents = g.a(0, 64, en.a.f40123b);

    @Override // com.unity3d.ads.core.data.repository.AdRevenueRepository
    public m0 getAdRevenueEvents() {
        return this.adRevenueEvents;
    }
}
