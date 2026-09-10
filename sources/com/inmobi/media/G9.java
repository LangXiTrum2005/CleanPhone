package com.inmobi.media;

import android.webkit.WebSettings;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class G9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f22847a;

    public G9(WebView webView) {
        Intrinsics.f(webView, "webView");
        this.f22847a = new WeakReference(webView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebView webView = (WebView) this.f22847a.get();
        WebSettings settings = webView != null ? webView.getSettings() : null;
        if (settings == null) {
            return;
        }
        settings.setBlockNetworkLoads(true);
    }
}
