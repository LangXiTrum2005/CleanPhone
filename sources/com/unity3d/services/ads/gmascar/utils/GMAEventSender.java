package com.unity3d.services.ads.gmascar.utils;

import androidx.annotation.NonNull;
import com.unity3d.scar.adapter.common.b;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class GMAEventSender implements IEventSender {
    private final IEventSender _eventSender;

    public GMAEventSender() {
        this(SharedInstances.INSTANCE.getWebViewEventSender());
    }

    @Override // com.unity3d.services.core.webview.bridge.IEventSender
    public boolean canSend() {
        return this._eventSender.canSend();
    }

    public void send(b bVar, Object... objArr) {
        this._eventSender.sendEvent(WebViewEventCategory.GMA, bVar, objArr);
    }

    @Override // com.unity3d.services.core.webview.bridge.IEventSender
    public boolean sendEvent(@NonNull Enum<?> r2, @NonNull Enum<?> r3, @NonNull Object... objArr) {
        return this._eventSender.sendEvent(r2, r3, objArr);
    }

    public void sendVersion(String str) {
        this._eventSender.sendEvent(WebViewEventCategory.INIT_GMA, b.f38562f, str);
    }

    public GMAEventSender(IEventSender iEventSender) {
        this._eventSender = iEventSender;
    }
}
