package com.smartdigimkt.b6;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.q3.d;
import com.smartdigimkt.sdk.basead.ui.web.WebProgressBarView;
import com.smartdigimkt.w6.o;

/* JADX INFO: loaded from: classes5.dex */
public class a extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f33963a;

    public a(b bVar) {
        this.f33963a = bVar;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        b bVar = this.f33963a;
        if (bVar != null) {
            bVar.onWebPageFinish(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        b bVar = this.f33963a;
        if (bVar != null) {
            bVar.onWebPageStart(webView, str);
            WebProgressBarView webProgressBarView = this.f33963a.getWebProgressBarView();
            if (webProgressBarView != null) {
                webProgressBarView.setVisibility(0);
                webProgressBarView.setProgress(0);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i2, String str, String str2) {
        b bVar = this.f33963a;
        if (bVar != null) {
            bVar.onWebPageLoadError(webView, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        b bVar = this.f33963a;
        if (bVar == null) {
            return true;
        }
        bVar.onWebFinish();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!TextUtils.isEmpty(str) && !"about:blank".equals(str)) {
            b bVar = this.f33963a;
            if (bVar != null) {
                bVar.recordRedirectUrl(str);
            }
            b bVar2 = this.f33963a;
            if (bVar2 != null && bVar2.supportDeeplinkJump()) {
                o oVarA = d.a(webView.getContext(), str, this.f33963a.getBaseAdContent());
                if (oVarA.f39602b) {
                    b bVar3 = this.f33963a;
                    if (bVar3 != null) {
                        bVar3.callbackClickResult(oVarA);
                    }
                    return true;
                }
                b bVar4 = this.f33963a;
                if (bVar4 != null) {
                    bVar4.callbackClickResult(oVarA);
                }
                o oVarG = d.g(str);
                b bVar5 = this.f33963a;
                if (bVar5 != null) {
                    bVar5.callbackClickResult(oVarG);
                }
                if (!TextUtils.equals(oVarG.d, str)) {
                    webView.loadUrl(oVarG.d);
                    return true;
                }
            }
            if (!h.e(str)) {
                return true;
            }
        }
        return false;
    }
}
