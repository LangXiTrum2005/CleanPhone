package com.unity3d.ads.core.domain;

import com.unity3d.services.UnityAdsConstants;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¨\u0006\u0006"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetSafeguardedInitializationPolicy;", "Lcom/unity3d/ads/core/domain/GetSafeguardedInitializationPolicy;", "()V", "invoke", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicy;", "requestPolicy", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidGetSafeguardedInitializationPolicy implements GetSafeguardedInitializationPolicy {
    @Override // com.unity3d.ads.core.domain.GetSafeguardedInitializationPolicy
    public NativeConfigurationOuterClass.RequestPolicy invoke(NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
        n.f(requestPolicy, "requestPolicy");
        NativeConfigurationOuterClass.RequestRetryPolicy retryPolicy = requestPolicy.getRetryPolicy();
        NativeConfigurationOuterClass.RequestTimeoutPolicy timeoutPolicy = requestPolicy.getTimeoutPolicy();
        NativeConfigurationOuterClass.RequestPolicy requestPolicyBuild = NativeConfigurationOuterClass.RequestPolicy.newBuilder(requestPolicy).setRetryPolicy(NativeConfigurationOuterClass.RequestRetryPolicy.newBuilder(retryPolicy).setMaxDuration(Math.max(5000, retryPolicy.getMaxDuration())).setRetryWaitBase(Math.max(0, retryPolicy.getRetryWaitBase())).setRetryMaxInterval(Math.max(0, retryPolicy.getRetryMaxInterval())).setRetryScalingFactor(Math.max(0.1f, retryPolicy.getRetryScalingFactor())).setRetryJitterPct(Math.min(100.0f, Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, retryPolicy.getRetryJitterPct())))).setTimeoutPolicy(NativeConfigurationOuterClass.RequestTimeoutPolicy.newBuilder(timeoutPolicy).setConnectTimeoutMs(Math.max(1000, timeoutPolicy.getConnectTimeoutMs())).setReadTimeoutMs(Math.max(1000, timeoutPolicy.getReadTimeoutMs())).setWriteTimeoutMs(Math.max(1000, timeoutPolicy.getWriteTimeoutMs())).setOverallTimeoutMs(Math.max(1000, timeoutPolicy.getOverallTimeoutMs()))).build();
        n.e(requestPolicyBuild, "newBuilder(requestPolicy…  )\n            ).build()");
        return requestPolicyBuild;
    }
}
