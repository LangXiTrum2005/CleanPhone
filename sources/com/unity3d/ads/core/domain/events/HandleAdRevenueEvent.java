package com.unity3d.ads.core.domain.events;

import ak.f;
import ck.c;
import ck.e;
import com.unity3d.ads.core.data.repository.AdRevenueRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086Bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/core/domain/events/HandleAdRevenueEvent;", "", "Lcom/unity3d/ads/core/data/repository/AdRevenueRepository;", "adRevenueRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/domain/events/GetAdRevenueEventData;", "getAdRevenueEventData", "<init>", "(Lcom/unity3d/ads/core/data/repository/AdRevenueRepository;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/domain/events/GetAdRevenueEventData;)V", "Lcom/unity3d/ads/core/data/model/AdRevenueData;", "data", "Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;", "mediationProvider", "Lcom/unity3d/ads/core/data/model/AdRevenueOrigin;", "origin", "Lwj/r;", "invoke", "(Lcom/unity3d/ads/core/data/model/AdRevenueData;Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;Lcom/unity3d/ads/core/data/model/AdRevenueOrigin;Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/repository/AdRevenueRepository;", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "Lcom/unity3d/ads/core/domain/events/GetAdRevenueEventData;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class HandleAdRevenueEvent {
    private final AdRevenueRepository adRevenueRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetAdRevenueEventData getAdRevenueEventData;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.HandleAdRevenueEvent$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.core.domain.events.HandleAdRevenueEvent", f = "HandleAdRevenueEvent.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE, 32}, m = "invoke")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HandleAdRevenueEvent.this.invoke(null, null, null, this);
        }
    }

    public HandleAdRevenueEvent(AdRevenueRepository adRevenueRepository, DeviceInfoRepository deviceInfoRepository, GetAdRevenueEventData getAdRevenueEventData) {
        n.f(adRevenueRepository, "adRevenueRepository");
        n.f(deviceInfoRepository, "deviceInfoRepository");
        n.f(getAdRevenueEventData, "getAdRevenueEventData");
        this.adRevenueRepository = adRevenueRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.getAdRevenueEventData = getAdRevenueEventData;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c6, code lost:
    
        if (r8.emit(r7, r0) == r4) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(com.unity3d.ads.core.data.model.AdRevenueData r8, gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider r9, com.unity3d.ads.core.data.model.AdRevenueOrigin r10, ak.f r11) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.HandleAdRevenueEvent.invoke(com.unity3d.ads.core.data.model.AdRevenueData, gatewayprotocol.v1.ClientInfoOuterClass$MediationProvider, com.unity3d.ads.core.data.model.AdRevenueOrigin, ak.f):java.lang.Object");
    }
}
