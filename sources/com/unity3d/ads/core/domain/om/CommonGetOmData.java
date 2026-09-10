package com.unity3d.ads.core.domain.om;

import ak.f;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006H\u0096Bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/domain/om/CommonGetOmData;", "Lcom/unity3d/ads/core/domain/om/GetOmData;", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "openMeasurementRepository", "<init>", "(Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;)V", "Lcom/unity3d/ads/core/data/model/OMData;", "invoke", "(Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class CommonGetOmData implements GetOmData {
    private final OpenMeasurementRepository openMeasurementRepository;

    public CommonGetOmData(OpenMeasurementRepository openMeasurementRepository) {
        n.f(openMeasurementRepository, "openMeasurementRepository");
        this.openMeasurementRepository = openMeasurementRepository;
    }

    @Override // com.unity3d.ads.core.domain.om.GetOmData
    public Object invoke(f fVar) {
        return this.openMeasurementRepository.getOmData();
    }
}
