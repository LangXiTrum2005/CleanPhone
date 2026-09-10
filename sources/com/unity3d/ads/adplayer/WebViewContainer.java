package com.unity3d.ads.adplayer;

import ak.f;
import fn.y0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/unity3d/ads/adplayer/WebViewContainer;", "", "", "url", "Lwj/r;", "loadUrl", "(Ljava/lang/String;Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/adplayer/HandlerType;", "handlerType", "Lorg/json/JSONArray;", "arguments", "evaluateJavascript", "(Lcom/unity3d/ads/adplayer/HandlerType;Lorg/json/JSONArray;Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/adplayer/WebViewBridge;", "webViewBridgeInterface", "name", "addJavascriptInterface", "(Lcom/unity3d/ads/adplayer/WebViewBridge;Ljava/lang/String;Lak/f;)Ljava/lang/Object;", "destroy", "(Lak/f;)Ljava/lang/Object;", "Lfn/y0;", "Landroid/view/InputEvent;", "getLastInputEvent", "()Lfn/y0;", "lastInputEvent", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public interface WebViewContainer {
    Object addJavascriptInterface(WebViewBridge webViewBridge, String str, f fVar);

    Object destroy(f fVar);

    Object evaluateJavascript(HandlerType handlerType, JSONArray jSONArray, f fVar);

    y0 getLastInputEvent();

    Object loadUrl(String str, f fVar);
}
