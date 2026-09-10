package com.unity3d.ads;

import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@UnityAdsExperimental
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/ShowListener;", "UnityAd", "", "unityAd", "Lwj/r;", "onStarted", "(Ljava/lang/Object;)V", "onClicked", "Lcom/unity3d/ads/ShowFinishState;", "state", "onCompleted", "(Ljava/lang/Object;Lcom/unity3d/ads/ShowFinishState;)V", "Lcom/unity3d/ads/UnityAdsError;", "error", "onFailed", "(Ljava/lang/Object;Lcom/unity3d/ads/UnityAdsError;)V", "Lcom/unity3d/ads/InterstitialShowListener;", "Lcom/unity3d/ads/RewardedShowListener;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public interface ShowListener<UnityAd> {
    void onClicked(UnityAd unityAd);

    void onCompleted(UnityAd unityAd, ShowFinishState state);

    void onFailed(UnityAd unityAd, UnityAdsError error);

    void onStarted(UnityAd unityAd);
}
