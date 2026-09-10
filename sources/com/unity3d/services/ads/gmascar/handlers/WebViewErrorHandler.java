package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.c;
import com.unity3d.scar.adapter.common.i;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class WebViewErrorHandler implements c {
    private final IEventSender _eventSender;

    public WebViewErrorHandler() {
        this(SharedInstances.INSTANCE.getWebViewEventSender());
    }

    public WebViewErrorHandler(IEventSender iEventSender) {
        this._eventSender = iEventSender;
    }

    @Override // com.unity3d.scar.adapter.common.c
    public void handleError(i iVar) {
        this._eventSender.sendEvent(WebViewEventCategory.valueOf(iVar.getDomain()), iVar.getErrorCategory(), iVar.getErrorArguments());
    }
}
