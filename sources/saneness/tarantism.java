package saneness;

import ads_mobile_sdk.g6;
import ads_mobile_sdk.gq0;
import ads_mobile_sdk.ip0;
import ads_mobile_sdk.iq0;
import ads_mobile_sdk.jk0;
import ads_mobile_sdk.pq0;
import ads_mobile_sdk.vq0;
import android.net.Uri;
import android.webkit.WebView;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class tarantism extends pq0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tarantism(gerenuk jsContext, gq0 gmaWebView, kotlinx.coroutines.saran backgroundScope, ip0 gmaUtil, g6 adSpamClient, jk0 flags) {
        super(jsContext, gmaWebView, backgroundScope, gmaUtil, adSpamClient, flags);
        Intrinsics.checkNotNullParameter(jsContext, "jsContext");
        Intrinsics.checkNotNullParameter(gmaWebView, "gmaWebView");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        Intrinsics.checkNotNullParameter(adSpamClient, "adSpamClient");
        Intrinsics.checkNotNullParameter(flags, "flags");
    }

    @Override // ads_mobile_sdk.pq0, android.webkit.WebViewClient
    public final void onLoadResource(WebView view, String url) throws InterruptedException {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        Uri uri = Uri.parse(url);
        pq0.s.getClass();
        if (!midian.attabal(uri)) {
            kotlinx.coroutines.cutely.wireman(this.c, null, null, new vq0(this, url, null), 3, null);
        } else {
            Intrinsics.checkNotNullParameter(uri, "uri");
            kotlinx.coroutines.taiyuan.saneness(null, new iq0(this, uri, null), 1, null);
        }
    }
}
