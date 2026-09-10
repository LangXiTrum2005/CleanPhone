package com.mbridge.msdk.video.module;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.listener.b;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import l1.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class MBridgeAlertWebview extends MBridgeH5EndCardView {
    private String P;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends b {
        public a() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            super.a(webView, i10);
            q0.b("MBridgeAlertWebview", "readyState  :  " + i10);
            MBridgeAlertWebview mBridgeAlertWebview = MBridgeAlertWebview.this;
            if (mBridgeAlertWebview.f37614u) {
                return;
            }
            boolean z10 = i10 == 1;
            mBridgeAlertWebview.f37613t = z10;
            String strE = z10 ? d.e(i10, "readyState state is ") : "";
            MBridgeAlertWebview mBridgeAlertWebview2 = MBridgeAlertWebview.this;
            j.a(mBridgeAlertWebview2.f37559a, mBridgeAlertWebview2.f37560b, mBridgeAlertWebview2.P, MBridgeAlertWebview.this.unitId, i10, strE, 1);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            q0.b("MBridgeAlertWebview", "finish+" + str);
            f.a().a(webView);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            q0.b("MBridgeAlertWebview", "onReceivedError");
            if (MBridgeAlertWebview.this.f37614u) {
                return;
            }
            f2.z("onReceivedError,url:", str2, MBridgeBaseView.TAG);
            MBridgeAlertWebview mBridgeAlertWebview = MBridgeAlertWebview.this;
            j.a(mBridgeAlertWebview.f37559a, mBridgeAlertWebview.f37560b, mBridgeAlertWebview.P, MBridgeAlertWebview.this.unitId, 2, str, 1);
            MBridgeAlertWebview.this.f37614u = true;
        }
    }

    public MBridgeAlertWebview(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public RelativeLayout.LayoutParams getContentLayoutParams() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        return layoutParams;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public String getURL() {
        if (TextUtils.isEmpty(this.unitId)) {
            return "";
        }
        String strC = com.mbridge.msdk.videocommon.setting.b.b().a(c.n().b(), this.unitId, false).c();
        this.P = strC;
        return !TextUtils.isEmpty(strC) ? com.mbridge.msdk.videocommon.download.d.a().a(this.P) : "";
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView, com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        String url = getURL();
        if (!this.f37563e || this.f37560b == null || TextUtils.isEmpty(url)) {
            this.notifyListener.a(InterfaceC0435l1.d.b.f29105b, "");
            return;
        }
        com.mbridge.msdk.foundation.same.webview.a aVar = new com.mbridge.msdk.foundation.same.webview.a(this.f37560b);
        aVar.a(this.f37560b.getAppName());
        this.f37609p.setDownloadListener(aVar);
        this.f37609p.setCampaignId(this.f37560b.getId());
        setCloseVisible(8);
        this.f37609p.setApiManagerJSFactory(bVar);
        this.f37609p.setWebViewListener(new a());
        setHtmlSource(com.mbridge.msdk.videocommon.download.f.a().a(url));
        this.f37613t = false;
        if (TextUtils.isEmpty(this.f37612s)) {
            f2.z("load url:", url, MBridgeBaseView.TAG);
            this.f37609p.loadUrl(url);
        } else {
            q0.a(MBridgeBaseView.TAG, "load html...");
            this.f37609p.loadDataWithBaseURL(url, this.f37612s, "text/html", "UTF-8", null);
        }
        this.f37609p.setBackgroundColor(0);
        setBackgroundColor(0);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView, com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void webviewshow() {
        RelativeLayout relativeLayout = this.f37607n;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(0);
        }
        super.webviewshow();
        j.a(this.f37559a, this.f37560b, this.P, this.unitId, 2, 1);
    }

    public MBridgeAlertWebview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
