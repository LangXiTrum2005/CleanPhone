package com.unity3d.ads.adplayer;

import ak.f;
import androidx.core.app.NotificationCompat;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import fn.r0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH¦@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ=\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00122\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0012\"\u00020\u0001H¦@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R1\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b8&@&X¦\u000eø\u0001\u0000¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lcom/unity3d/ads/adplayer/WebViewBridge;", "", "", "message", "Lwj/r;", "handleInvocation", "(Ljava/lang/String;)V", "callbackId", "callbackStatus", "rawParameters", "handleCallback", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/unity3d/ads/adplayer/model/WebViewEvent;", NotificationCompat.CATEGORY_EVENT, "sendEvent", "(Lcom/unity3d/ads/adplayer/model/WebViewEvent;Lak/f;)Ljava/lang/Object;", "className", "method", "", "params", "request", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Lak/f;)Ljava/lang/Object;", "Lfn/r0;", "Lcom/unity3d/ads/adplayer/Invocation;", "getOnInvocation", "()Lfn/r0;", "onInvocation", "", "Lkotlin/Function0;", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "getExposedFunctions", "()Ljava/util/Map;", "setExposedFunctions", "(Ljava/util/Map;)V", "exposedFunctions", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public interface WebViewBridge {
    Map<String, jk.a> getExposedFunctions();

    r0 getOnInvocation();

    void handleCallback(String callbackId, String callbackStatus, String rawParameters);

    void handleInvocation(String message);

    Object request(String str, String str2, Object[] objArr, f fVar);

    Object sendEvent(WebViewEvent webViewEvent, f fVar);

    void setExposedFunctions(Map<String, ? extends jk.a> map);
}
