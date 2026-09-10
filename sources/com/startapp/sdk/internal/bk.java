package com.startapp.sdk.internal;

import android.util.Log;
import android.webkit.WebView;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class bk extends xa {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.video.c f40844b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(com.startapp.sdk.ads.video.c cVar) {
        super(cVar);
        this.f40844b = cVar;
    }

    @Override // com.startapp.sdk.internal.xa, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (webView == null || str == null) {
            return;
        }
        webView.getContext();
        WeakHashMap weakHashMap = vi.f41589a;
        Log.println(2, "StartAppSDK", "Post-roll received callback onPageFinished()");
        this.f40844b.p0.postDelayed(new ak(this), AdsCommonMetaData.k().F().b() * 1000);
    }
}
