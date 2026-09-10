package com.unity3d.ads.adplayer.model;

import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u001a\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0010\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/unity3d/ads/adplayer/model/WebViewEvent;", "", "category", "", "getCategory", "()Ljava/lang/String;", "name", "getName", "parameters", "", "getParameters", "()[Ljava/lang/Object;", "Lcom/unity3d/ads/adplayer/model/OnActivityDestroyedEvent;", "Lcom/unity3d/ads/adplayer/model/OnAllowedPiiChangeEvent;", "Lcom/unity3d/ads/adplayer/model/OnBroadcastEvent;", "Lcom/unity3d/ads/adplayer/model/OnDownloadProgressEvent;", "Lcom/unity3d/ads/adplayer/model/OnFocusChangeEvent;", "Lcom/unity3d/ads/adplayer/model/OnGmaEvent;", "Lcom/unity3d/ads/adplayer/model/OnMuteChangeEvent;", "Lcom/unity3d/ads/adplayer/model/OnOfferwallEvent;", "Lcom/unity3d/ads/adplayer/model/OnPrivacyFsmChangeEvent;", "Lcom/unity3d/ads/adplayer/model/OnScarBannerEvent;", "Lcom/unity3d/ads/adplayer/model/OnStorageEvent;", "Lcom/unity3d/ads/adplayer/model/OnUserConsentChangeEvent;", "Lcom/unity3d/ads/adplayer/model/OnVisibilityChangeEvent;", "Lcom/unity3d/ads/adplayer/model/OnVolumeChangeEvent;", "Lcom/unity3d/ads/adplayer/model/OnWebRequestComplete;", "Lcom/unity3d/ads/adplayer/model/OnWebRequestFailed;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public interface WebViewEvent {
    String getCategory();

    String getName();

    Object[] getParameters();
}
