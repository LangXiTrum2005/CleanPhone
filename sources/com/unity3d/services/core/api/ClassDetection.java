package com.unity3d.services.core.api;

import com.unity3d.services.core.properties.MadeWithUnityDetector;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class ClassDetection {
    @WebViewExposed
    public static void isMadeWithUnity(WebViewCallback webViewCallback) {
        webViewCallback.invoke(Boolean.valueOf(MadeWithUnityDetector.isMadeWithUnity()));
    }
}
