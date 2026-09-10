package com.google.android.gms.internal.ads;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w30 extends v30 {
    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean zDidCrash = renderProcessGoneDetail.didCrash();
        return this.f14694a.H(renderProcessGoneDetail.rendererPriorityAtExit(), zDidCrash);
    }
}
