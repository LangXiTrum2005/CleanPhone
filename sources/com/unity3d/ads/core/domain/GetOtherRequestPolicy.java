package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0006H\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/core/domain/GetOtherRequestPolicy;", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "invoke", "Lcom/unity3d/ads/gatewayclient/RequestPolicy;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class GetOtherRequestPolicy implements GetRequestPolicy {
    private final SessionRepository sessionRepository;

    public GetOtherRequestPolicy(SessionRepository sessionRepository) {
        n.f(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
    }

    @Override // com.unity3d.ads.core.domain.GetRequestPolicy
    public RequestPolicy invoke() {
        return new RequestPolicy(this.sessionRepository.getNativeConfiguration().getOtherPolicy().getRetryPolicy().getMaxDuration(), this.sessionRepository.getNativeConfiguration().getOtherPolicy().getRetryPolicy().getRetryMaxInterval(), this.sessionRepository.getNativeConfiguration().getOtherPolicy().getRetryPolicy().getRetryWaitBase(), this.sessionRepository.getNativeConfiguration().getOtherPolicy().getRetryPolicy().getRetryJitterPct(), this.sessionRepository.getNativeConfiguration().getOtherPolicy().getRetryPolicy().getRetryScalingFactor(), this.sessionRepository.getNativeConfiguration().getOtherPolicy().getTimeoutPolicy().getConnectTimeoutMs(), this.sessionRepository.getNativeConfiguration().getOtherPolicy().getTimeoutPolicy().getReadTimeoutMs(), this.sessionRepository.getNativeConfiguration().getOtherPolicy().getTimeoutPolicy().getWriteTimeoutMs(), this.sessionRepository.getNativeConfiguration().getOtherPolicy().getTimeoutPolicy().getOverallTimeoutMs(), this.sessionRepository.getNativeConfiguration().getOtherPolicy().getRetryPolicy().getShouldStoreLocally());
    }
}
