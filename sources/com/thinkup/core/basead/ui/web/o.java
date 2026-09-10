package com.thinkup.core.basead.ui.web;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.thinkup.core.common.on.oo0o;
import com.thinkup.core.common.ooo.o00;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends WebViewClient {
    private m o;

    public o(m mVar) {
        this.o = mVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        m mVar = this.o;
        if (mVar != null) {
            mVar.o(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        m mVar = this.o;
        if (mVar != null) {
            mVar.m(str);
            WebProgressBarView webProgressBarViewO = this.o.o();
            if (webProgressBarViewO != null) {
                webProgressBarViewO.setVisibility(0);
                webProgressBarViewO.setProgress(0);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        m mVar = this.o;
        if (mVar != null) {
            mVar.n(str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        m mVar = this.o;
        if (mVar == null) {
            return true;
        }
        mVar.m();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!TextUtils.isEmpty(str) && !"about:blank".equals(str)) {
            m mVar = this.o;
            if (mVar != null) {
                mVar.o(str);
            }
            m mVar2 = this.o;
            if (mVar2 != null && mVar2.n()) {
                oo0o oo0oVarO = com.thinkup.core.basead.o.n.o(webView.getContext(), str, this.o.o0());
                if (oo0oVarO.no) {
                    m mVar3 = this.o;
                    if (mVar3 != null) {
                        mVar3.o(oo0oVarO);
                    }
                    return true;
                }
                m mVar4 = this.o;
                if (mVar4 != null) {
                    mVar4.o(oo0oVarO);
                }
                oo0o oo0oVarO2 = com.thinkup.core.basead.o.n.o(str);
                m mVar5 = this.o;
                if (mVar5 != null) {
                    mVar5.o(oo0oVarO2);
                }
                if (!TextUtils.equals(oo0oVarO2.nn, str)) {
                    webView.loadUrl(oo0oVarO2.nn);
                    return true;
                }
            }
            if (!o00.o0(str)) {
                return true;
            }
        }
        return false;
    }
}
