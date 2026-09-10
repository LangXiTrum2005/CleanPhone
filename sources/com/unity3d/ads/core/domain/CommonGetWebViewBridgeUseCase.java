package com.unity3d.ads.core.domain;

import cn.a0;
import cn.n0;
import cn.w;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.CommonWebViewBridge;
import com.unity3d.ads.adplayer.WebViewBridge;
import com.unity3d.ads.core.log.Logger;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonGetWebViewBridgeUseCase;", "Lcom/unity3d/ads/core/domain/GetWebViewBridgeUseCase;", "Lcn/w;", "dispatcher", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Lcn/w;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/log/Logger;)V", "Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "webViewContainer", "Lcn/a0;", "adPlayerScope", "Lcom/unity3d/ads/adplayer/WebViewBridge;", "invoke", "(Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;Lcn/a0;)Lcom/unity3d/ads/adplayer/WebViewBridge;", "Lcn/w;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/core/log/Logger;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class CommonGetWebViewBridgeUseCase implements GetWebViewBridgeUseCase {
    private final w dispatcher;
    private final Logger logger;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public CommonGetWebViewBridgeUseCase(w dispatcher, SendDiagnosticEvent sendDiagnosticEvent, Logger logger) {
        n.f(dispatcher, "dispatcher");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        n.f(logger, "logger");
        this.dispatcher = dispatcher;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.logger = logger;
    }

    @Override // com.unity3d.ads.core.domain.GetWebViewBridgeUseCase
    public WebViewBridge invoke(AndroidWebViewContainer webViewContainer, a0 adPlayerScope) {
        n.f(webViewContainer, "webViewContainer");
        n.f(adPlayerScope, "adPlayerScope");
        return new CommonWebViewBridge(this.dispatcher, webViewContainer, adPlayerScope, this.sendDiagnosticEvent, this.logger);
    }

    public CommonGetWebViewBridgeUseCase(w wVar, SendDiagnosticEvent sendDiagnosticEvent, Logger logger, int i10, g gVar) {
        this((i10 & 1) != 0 ? n0.f6748a : wVar, sendDiagnosticEvent, logger);
    }
}
