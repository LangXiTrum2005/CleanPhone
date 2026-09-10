package com.smartdigimkt.sdk.api.business.omsdk;

import android.content.Context;
import android.webkit.WebView;
import com.smartdigimkt.k5.b;
import com.smartdigimkt.v6.a;
import com.smartdigimkt.w6.f;

/* JADX INFO: loaded from: classes6.dex */
public interface IOmsdkHandler {
    b createNativeAdSession(Context context, boolean z2, f fVar, a aVar);

    b createWebViewAdSession(Context context, WebView webView, f fVar, a aVar);

    String getOmsdkVersion();

    String injectScriptContentIntoHtml(String str, f fVar, a aVar);

    boolean supportOmsdk();
}
