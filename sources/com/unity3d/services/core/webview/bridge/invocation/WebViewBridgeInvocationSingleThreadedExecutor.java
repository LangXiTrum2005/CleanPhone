package com.unity3d.services.core.webview.bridge.invocation;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class WebViewBridgeInvocationSingleThreadedExecutor {
    private static WebViewBridgeInvocationSingleThreadedExecutor instance;
    private ExecutorService _ExecutorService = Executors.newSingleThreadExecutor();

    private WebViewBridgeInvocationSingleThreadedExecutor() {
    }

    public static WebViewBridgeInvocationSingleThreadedExecutor getInstance() {
        if (instance == null) {
            instance = new WebViewBridgeInvocationSingleThreadedExecutor();
        }
        return instance;
    }

    public ExecutorService getExecutorService() {
        return this._ExecutorService;
    }
}
