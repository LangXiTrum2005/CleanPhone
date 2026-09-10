package com.applovin.impl;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.sdk.utils.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v4 extends WebViewClient {
    public abstract Map a();

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("top_main_method", "onRenderProcessGone");
        mapHashMap.putAll(a());
        if (p0.e()) {
            mapHashMap.put("source", renderProcessGoneDetail.didCrash() ? "crash" : "non_crash");
            mapHashMap.put("details", "renderer_priority_at_exit=" + renderProcessGoneDetail.rendererPriorityAtExit());
        }
        com.applovin.impl.sdk.l lVar = com.applovin.impl.sdk.l.E0;
        if (lVar != null) {
            com.applovin.impl.sdk.l.E0.E().a(f2.f7860j1, mapHashMap, ((Long) lVar.a(z4.f10269v3)).longValue());
        }
        com.applovin.impl.sdk.p.g("RenderProcessGoneHandlingWebViewClient", "onRenderProcessGone() handled");
        return true;
    }
}
