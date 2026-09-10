package com.smartdigimkt.sdk.basead.ui.web;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import com.smartdigimkt.a6.f;
import com.smartdigimkt.j7.c;

/* JADX INFO: loaded from: classes6.dex */
public class BaseWebView extends WebView {
    private static boolean f0 = false;
    protected boolean e0;

    public BaseWebView(Context context) {
        super(context);
        b();
    }

    private void a(Context context) {
    }

    private void c() {
        getSettings().setAllowFileAccess(false);
        getSettings().setAllowContentAccess(false);
        getSettings().setAllowFileAccessFromFileURLs(false);
        getSettings().setAllowUniversalAccessFromFileURLs(false);
    }

    public void b() {
        c();
        f.b(this);
        com.smartdigimkt.n8.f.a(this);
        if (f0) {
            return;
        }
        a(getContext());
        f0 = true;
    }

    @Override // android.webkit.WebView
    public void destroy() {
        if (this.e0) {
            return;
        }
        this.e0 = true;
        c.a(this);
        stopLoading();
        setWebChromeClient(null);
        setWebViewClient(null);
        clearHistory();
        clearCache(true);
        getSettings().setJavaScriptEnabled(false);
        loadUrl("about:blank");
        removeAllViews();
        super.destroy();
    }

    public boolean isDestroyed() {
        return this.e0;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        f.a(this);
    }

    public void a() {
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(true);
        getSettings().setCacheMode(-1);
    }

    public BaseWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public BaseWebView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        b();
    }
}
