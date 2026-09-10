package com.unity3d.ads.core.data.model;

import com.unity3d.ads.UnityAds;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/data/model/Listeners;", "", "", "placementId", "Lcom/unity3d/ads/UnityAds$UnityAdsShowError;", "error", "message", "Lwj/r;", "onError", "(Ljava/lang/String;Lcom/unity3d/ads/UnityAds$UnityAdsShowError;Ljava/lang/String;)V", "onStart", "(Ljava/lang/String;)V", "onClick", "onRewarded", "Lcom/unity3d/ads/UnityAds$UnityAdsShowCompletionState;", "state", "onComplete", "(Ljava/lang/String;Lcom/unity3d/ads/UnityAds$UnityAdsShowCompletionState;)V", "onLeftApplication", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public interface Listeners {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class DefaultImpls {
        public static void onClick(Listeners listeners, String placementId) {
            n.f(placementId, "placementId");
        }

        public static void onComplete(Listeners listeners, String placementId, UnityAds.UnityAdsShowCompletionState state) {
            n.f(placementId, "placementId");
            n.f(state, "state");
        }

        public static void onError(Listeners listeners, String placementId, UnityAds.UnityAdsShowError error, String message) {
            n.f(placementId, "placementId");
            n.f(error, "error");
            n.f(message, "message");
        }

        public static void onLeftApplication(Listeners listeners, String placementId) {
            n.f(placementId, "placementId");
        }

        public static void onRewarded(Listeners listeners, String placementId) {
            n.f(placementId, "placementId");
        }

        public static void onStart(Listeners listeners, String placementId) {
            n.f(placementId, "placementId");
        }
    }

    void onClick(String placementId);

    void onComplete(String placementId, UnityAds.UnityAdsShowCompletionState state);

    void onError(String placementId, UnityAds.UnityAdsShowError error, String message);

    void onLeftApplication(String placementId);

    void onRewarded(String placementId);

    void onStart(String placementId);
}
