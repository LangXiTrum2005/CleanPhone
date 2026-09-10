package com.iab.omid.library.startio.utils;

import android.webkit.WebView;
import androidx.webkit.WebViewCompat;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class i {
    public void a(WebView webView, String str) {
        WebViewCompat.f(webView, str);
    }

    public void a(WebView webView, String str, Set<String> set, WebViewCompat.WebMessageListener webMessageListener) {
        WebViewCompat.a(webView, str, set, webMessageListener);
    }
}
