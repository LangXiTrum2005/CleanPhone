package com.unity3d.services.analytics.core.api;

import com.unity3d.services.analytics.interfaces.AnalyticsError;
import com.unity3d.services.analytics.interfaces.IAnalytics;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class Analytics {
    public static IAnalytics analyticsInterface;

    @WebViewExposed
    public static void addExtras(final String str, WebViewCallback webViewCallback) {
        if (analyticsInterface == null) {
            webViewCallback.error(AnalyticsError.API_NOT_FOUND, str);
        } else {
            Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.analytics.core.api.Analytics.1
                @Override // java.lang.Runnable
                public void run() {
                    Analytics.analyticsInterface.onAddExtras(str);
                }
            });
            webViewCallback.invoke(new Object[0]);
        }
    }

    public static void setAnalyticsInterface(IAnalytics iAnalytics) {
        analyticsInterface = iAnalytics;
    }
}
