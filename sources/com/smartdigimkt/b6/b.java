package com.smartdigimkt.b6;

import android.webkit.WebView;
import com.smartdigimkt.sdk.basead.ui.web.WebProgressBarView;
import com.smartdigimkt.w6.f;
import com.smartdigimkt.w6.o;

/* JADX INFO: loaded from: classes5.dex */
public interface b {
    void callbackClickResult(o oVar);

    f getBaseAdContent();

    WebProgressBarView getWebProgressBarView();

    void onWebFinish();

    void onWebPageFinish(WebView webView, String str);

    void onWebPageLoadError(WebView webView, String str);

    void onWebPageStart(WebView webView, String str);

    void recordRedirectUrl(String str);

    boolean supportDeeplinkJump();
}
