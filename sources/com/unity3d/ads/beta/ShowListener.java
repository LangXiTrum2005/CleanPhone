package com.unity3d.ads.beta;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006J\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\tH&¢\u0006\u0002\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\rH&¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/beta/ShowListener;", "UnityAd", "", "showClick", "", "unityAd", "(Ljava/lang/Object;)V", "showComplete", "state", "Lcom/unity3d/ads/beta/ShowFinishState;", "(Ljava/lang/Object;Lcom/unity3d/ads/beta/ShowFinishState;)V", "showFailed", "error", "Lcom/unity3d/ads/beta/UnityAdsError;", "(Ljava/lang/Object;Lcom/unity3d/ads/beta/UnityAdsError;)V", "showImpression", "showStart", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ShowListener<UnityAd> {
    void showClick(UnityAd unityAd);

    void showComplete(UnityAd unityAd, ShowFinishState state);

    void showFailed(UnityAd unityAd, UnityAdsError error);

    void showImpression(UnityAd unityAd);

    void showStart(UnityAd unityAd);
}
