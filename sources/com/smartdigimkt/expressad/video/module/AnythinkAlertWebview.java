package com.smartdigimkt.expressad.video.module;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.applovin.impl.Z;
import com.smartdigimkt.c3.i;
import com.smartdigimkt.c3.j;
import com.smartdigimkt.expressad.foundation.webview.BrowserView;
import com.smartdigimkt.f3.c;
import com.smartdigimkt.k.b;
import com.smartdigimkt.n.h;

/* JADX INFO: loaded from: classes5.dex */
public class AnythinkAlertWebview extends AnythinkH5EndCardView {
    private String i1;

    public class a extends b {
        public a() {
        }

        @Override // com.smartdigimkt.k.b, com.smartdigimkt.u4.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            h.a().a(webView);
        }

        @Override // com.smartdigimkt.k.b, com.smartdigimkt.u4.c
        public void onReceivedError(WebView webView, int i2, String str, String str2) {
            super.onReceivedError(webView, i2, str, str2);
            AnythinkAlertWebview anythinkAlertWebview = AnythinkAlertWebview.this;
            if (anythinkAlertWebview.B0) {
                return;
            }
            anythinkAlertWebview.B0 = true;
        }

        @Override // com.smartdigimkt.k.b, com.smartdigimkt.u4.c
        public void readyState(WebView webView, int i2) {
            super.readyState(webView, i2);
            AnythinkAlertWebview anythinkAlertWebview = AnythinkAlertWebview.this;
            if (anythinkAlertWebview.B0) {
                return;
            }
            anythinkAlertWebview.A0 = i2 == 1;
        }
    }

    public AnythinkAlertWebview(Context context) {
        super(context);
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkH5EndCardView
    public RelativeLayout.LayoutParams getContentLayoutParams() {
        return Z.g(-1, -1, 13, -1);
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkH5EndCardView
    public String getURL() {
        if (TextUtils.isEmpty(this.I0)) {
            return "";
        }
        String strD = c.b().a(com.smartdigimkt.u.a.f().a(), this.I0, false).d();
        this.i1 = strD;
        return !TextUtils.isEmpty(strD) ? i.a().c(this.i1) : "";
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkH5EndCardView, com.smartdigimkt.x2.f
    public void preLoadData(com.smartdigimkt.y2.b bVar) {
        String url = getURL();
        if (!this.j0 || this.f0 == null || TextUtils.isEmpty(url)) {
            com.smartdigimkt.t2.a aVar = this.i0;
            if (aVar != null) {
                aVar.a(101, "");
                return;
            }
            return;
        }
        BrowserView.DownloadListener downloadListener = new BrowserView.DownloadListener(this.f0);
        downloadListener.setTitle(this.f0.f());
        this.v0.setDownloadListener(downloadListener);
        this.v0.setCampaignId(this.f0.j());
        setCloseVisible(8);
        this.v0.setApiManagerJSFactory(bVar);
        this.v0.setWebViewListener(new a());
        setHtmlSource(j.b().a(url));
        this.A0 = false;
        if (TextUtils.isEmpty(this.z0)) {
            this.v0.loadUrl(url);
        } else {
            this.v0.loadDataWithBaseURL(url, this.z0, "text/html", "UTF-8", null);
        }
        this.v0.setBackgroundColor(0);
        setBackgroundColor(0);
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkH5EndCardView, com.smartdigimkt.x2.h
    public void webviewshow() {
        RelativeLayout relativeLayout = this.t0;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(0);
        }
        super.webviewshow();
    }

    public AnythinkAlertWebview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
