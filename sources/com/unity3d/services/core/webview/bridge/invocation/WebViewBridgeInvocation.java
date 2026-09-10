package com.unity3d.services.core.webview.bridge.invocation;

import com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class WebViewBridgeInvocation implements IWebViewBridgeInvocation {
    private static IWebViewBridgeInvocationCallback invocationCallback;
    private ExecutorService _executorService;
    private IWebViewBridgeInvoker _webViewBridgeInvoker;

    public WebViewBridgeInvocation(ExecutorService executorService, IWebViewBridgeInvoker iWebViewBridgeInvoker, IWebViewBridgeInvocationCallback iWebViewBridgeInvocationCallback) {
        this._executorService = executorService;
        invocationCallback = iWebViewBridgeInvocationCallback;
        if (iWebViewBridgeInvoker == null) {
            throw new IllegalArgumentException("webViewBridgeInvoker cannot be null");
        }
        this._webViewBridgeInvoker = iWebViewBridgeInvoker;
    }

    @Override // com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocation
    public synchronized void invoke(String str, String str2, int i10, Object... objArr) {
        this._executorService.submit(new WebViewBridgeInvocationRunnable(invocationCallback, this._webViewBridgeInvoker, str, str2, i10, objArr));
    }
}
