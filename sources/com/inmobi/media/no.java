package com.inmobi.media;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class no extends WebViewClient {
    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail renderProcessGoneDetail) {
        Intrinsics.checkNotNullParameter(view, "view");
        return oo.a(view, renderProcessGoneDetail, "safe_web_view");
    }
}
