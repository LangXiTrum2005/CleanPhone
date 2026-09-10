package com.thinkup.core.basead.ui.web;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.thinkup.core.common.n.oom;
import com.thinkup.core.common.ooo.moo;
import com.thinkup.core.common.ooo.nn;

/* JADX INFO: loaded from: classes6.dex */
public class BaseWebView extends WebView {
    private static boolean m = false;
    protected boolean o;

    public BaseWebView(Context context) {
        super(context);
        o();
    }

    private void m() {
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(true);
        getSettings().setCacheMode(-1);
    }

    private void n() {
        getSettings().setAllowFileAccess(false);
        getSettings().setAllowContentAccess(false);
        getSettings().setAllowFileAccessFromFileURLs(false);
        getSettings().setAllowUniversalAccessFromFileURLs(false);
    }

    private static void o(Context context) {
    }

    @Override // android.webkit.WebView
    public void destroy() {
        if (this.o) {
            return;
        }
        this.o = true;
        moo.o((View) this);
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
        return this.o;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        CookieManager.getInstance().setAcceptThirdPartyCookies(this, oom.o(getContext()).m());
    }

    private void o() {
        n();
        com.thinkup.core.basead.ui.o.o.o(this);
        nn.o(this);
        if (m) {
            return;
        }
        o(getContext());
        m = true;
    }

    public BaseWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o();
    }

    public BaseWebView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        o();
    }
}
