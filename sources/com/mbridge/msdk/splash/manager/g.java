package com.mbridge.msdk.splash.manager;

import android.net.http.SslError;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.splash.view.MBSplashView;
import com.mbridge.msdk.splash.view.MBSplashWebview;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f35869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f35870b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f35871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MBSplashView f35872b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CampaignEx f35873c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f35874d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f35875e;

        public a(c cVar, MBSplashView mBSplashView, CampaignEx campaignEx, String str, long j10) {
            this.f35871a = cVar;
            this.f35872b = mBSplashView;
            this.f35873c = campaignEx;
            this.f35874d = str;
            this.f35875e = j10;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            super.a(webView, i10);
            c cVar = this.f35871a;
            if (cVar != null) {
                cVar.a(i10);
            }
            if (i10 == 1) {
                g.this.f35869a = true;
                this.f35872b.setH5Ready(true);
                com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f35873c, this.f35874d, "", this.f35875e, 1);
                com.mbridge.msdk.splash.report.a.a(1, "", this.f35874d, this.f35873c);
                return;
            }
            g.this.f35869a = false;
            this.f35872b.setH5Ready(false);
            com.mbridge.msdk.splash.report.a.a(2, "readyState 2", this.f35874d, this.f35873c);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f35873c, this.f35874d, "readyState 2", this.f35875e, 3);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            c cVar = this.f35871a;
            if (cVar != null) {
                cVar.a();
            }
            g.this.f35870b = true;
            if (!this.f35873c.isHasMBTplMark()) {
                this.f35872b.setH5Ready(true);
                com.mbridge.msdk.splash.report.a.a(1, "", this.f35874d, this.f35873c);
                com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f35873c, this.f35874d, "", this.f35875e, 1);
            }
            com.mbridge.msdk.splash.signal.c.a(webView);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            c cVar = this.f35871a;
            if (cVar != null) {
                cVar.onError(str);
            }
            g.this.b();
            this.f35872b.setH5Ready(false);
            com.mbridge.msdk.splash.report.a.a(2, "error code:" + i10 + str, this.f35874d, this.f35873c);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f35873c, this.f35874d, defpackage.e.h(i10, "error code:", str), this.f35875e, 3);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            c cVar = this.f35871a;
            if (cVar != null) {
                cVar.onError(sslError.toString());
            }
            g.this.b();
            this.f35872b.setH5Ready(false);
            com.mbridge.msdk.splash.report.a.a(2, "error url:" + sslError.getUrl(), this.f35874d, this.f35873c);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f35873c, this.f35874d, "error url:" + sslError.getUrl(), this.f35875e, 3);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final g f35877a = new g(null);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface c {
        void a();

        void a(int i10);

        void onError(String str);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f35878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f35879b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CampaignEx f35880c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f35881d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f35882e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f35883f;

        public void a(String str) {
            this.f35881d = str;
        }

        public void b(String str) {
            this.f35878a = str;
        }

        public String c() {
            return this.f35881d;
        }

        public String d() {
            return this.f35878a;
        }

        public String e() {
            return this.f35879b;
        }

        public boolean f() {
            return this.f35882e;
        }

        public CampaignEx a() {
            return this.f35880c;
        }

        public int b() {
            return this.f35883f;
        }

        public void c(String str) {
            this.f35879b = str;
        }

        public void a(CampaignEx campaignEx) {
            this.f35880c = campaignEx;
        }

        public void a(boolean z10) {
            this.f35882e = z10;
        }

        public void a(int i10) {
            this.f35883f = i10;
        }
    }

    public /* synthetic */ g(a aVar) {
        this();
    }

    private g() {
        this.f35869a = false;
        this.f35870b = false;
    }

    public static g a() {
        return b.f35877a;
    }

    public void b() {
        this.f35869a = false;
        this.f35870b = false;
    }

    public void a(MBSplashView mBSplashView, d dVar, c cVar) {
        String requestId;
        if (mBSplashView == null || dVar == null) {
            return;
        }
        String strE = dVar.e();
        String strD = dVar.d();
        CampaignEx campaignExA = dVar.a();
        String strC = dVar.c();
        boolean zF = dVar.f();
        int iB = dVar.b();
        MBSplashWebview splashWebview = mBSplashView.getSplashWebview();
        if (splashWebview == null) {
            return;
        }
        com.mbridge.msdk.splash.signal.b bVar = new com.mbridge.msdk.splash.signal.b(mBSplashView.getContext(), strD, strE);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignExA);
        bVar.a(arrayList);
        bVar.a(zF ? 1 : 0);
        bVar.b(iB);
        mBSplashView.setSplashSignalCommunicationImpl(bVar);
        if (TextUtils.isEmpty(campaignExA.getRequestId())) {
            requestId = campaignExA.getRequestIdNotice();
        } else {
            requestId = campaignExA.getRequestId();
        }
        String requestId2 = splashWebview.getRequestId();
        q0.b("WebViewRenderManager", "CampaignEx RequestId = " + requestId + " WebView RequestId = " + requestId2);
        if (!TextUtils.isEmpty(requestId2) && requestId2.equals(requestId) && (this.f35869a || this.f35870b)) {
            mBSplashView.setH5Ready(true);
            if (cVar != null) {
                cVar.a(1);
                return;
            }
            return;
        }
        b();
        splashWebview.setRequestId(requestId);
        com.mbridge.msdk.splash.report.a.b(strE, campaignExA);
        long jCurrentTimeMillis = System.currentTimeMillis();
        splashWebview.setWebViewListener(new a(cVar, mBSplashView, campaignExA, strE, jCurrentTimeMillis));
        if (!splashWebview.isDestoryed()) {
            splashWebview.loadUrl(strC);
        } else {
            mBSplashView.setH5Ready(false);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignExA, strE, "webview had destory", jCurrentTimeMillis, 3);
        }
    }
}
