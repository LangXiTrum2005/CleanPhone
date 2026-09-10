package com.smartdigimkt.t1;

import android.net.http.SslError;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.smartdigimkt.expressad.splash.js.SplashJSBridgeImpl;
import com.smartdigimkt.expressad.splash.js.SplashJsUtils;
import com.smartdigimkt.expressad.splash.view.ATSplashView;
import com.smartdigimkt.expressad.splash.view.ATSplashWebview;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f38662c = "WebViewRenderManager";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f38663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f38664b;

    public class a extends com.smartdigimkt.k.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f38665b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ATSplashView f38666c;
        final /* synthetic */ com.smartdigimkt.x.d d;

        public a(c cVar, ATSplashView aTSplashView, com.smartdigimkt.x.d dVar) {
            this.f38665b = cVar;
            this.f38666c = aTSplashView;
            this.d = dVar;
        }

        @Override // com.smartdigimkt.k.b, com.smartdigimkt.u4.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            c cVar = this.f38665b;
            if (cVar != null) {
                cVar.a();
            }
            g.this.f38664b = true;
            if (!this.d.I2()) {
                this.f38666c.setH5Ready(true);
            }
            SplashJsUtils.fireOnJSBridgeConnected(webView);
        }

        @Override // com.smartdigimkt.k.b, com.smartdigimkt.u4.c
        public void onReceivedError(WebView webView, int i2, String str, String str2) {
            super.onReceivedError(webView, i2, str, str2);
            c cVar = this.f38665b;
            if (cVar != null) {
                cVar.a(str);
            }
            g.this.b();
            this.f38666c.setH5Ready(false);
        }

        @Override // com.smartdigimkt.k.b, com.smartdigimkt.u4.c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            c cVar = this.f38665b;
            if (cVar != null) {
                cVar.a(sslError.toString());
            }
            g.this.b();
            this.f38666c.setH5Ready(false);
        }

        @Override // com.smartdigimkt.k.b, com.smartdigimkt.u4.c
        public void readyState(WebView webView, int i2) {
            super.readyState(webView, i2);
            c cVar = this.f38665b;
            if (cVar != null) {
                cVar.a(i2);
            }
            if (i2 == 1) {
                g.this.f38663a = true;
                this.f38666c.setH5Ready(true);
            } else {
                g.this.f38663a = false;
                this.f38666c.setH5Ready(false);
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final g f38668a = new g(null);
    }

    public interface c {
        void a();

        void a(int i2);

        void a(String str);
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f38669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f38670b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.smartdigimkt.x.d f38671c;
        private String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f38672e;
        private int f;
        private boolean g;

        public void a(String str) {
            this.d = str;
        }

        public void b(boolean z2) {
            this.g = z2;
        }

        public String c() {
            return this.d;
        }

        public String d() {
            return this.f38669a;
        }

        public String e() {
            return this.f38670b;
        }

        public boolean f() {
            return this.f38672e;
        }

        public boolean g() {
            return this.g;
        }

        public com.smartdigimkt.x.d a() {
            return this.f38671c;
        }

        public void b(String str) {
            this.f38669a = str;
        }

        public void c(String str) {
            this.f38670b = str;
        }

        public void a(com.smartdigimkt.x.d dVar) {
            this.f38671c = dVar;
        }

        public int b() {
            return this.f;
        }

        public void a(boolean z2) {
            this.f38672e = z2;
        }

        public void a(int i2) {
            this.f = i2;
        }
    }

    public /* synthetic */ g(a aVar) {
        this();
    }

    private g() {
        this.f38663a = false;
        this.f38664b = false;
    }

    public static g a() {
        return b.f38668a;
    }

    public void b() {
        this.f38663a = false;
        this.f38664b = false;
    }

    public void a(ATSplashView aTSplashView, d dVar, c cVar) {
        String strN1;
        if (aTSplashView == null || dVar == null) {
            return;
        }
        String strE = dVar.e();
        String strD = dVar.d();
        com.smartdigimkt.x.d dVarA = dVar.a();
        String strC = dVar.c();
        boolean zF = dVar.f();
        int iB = dVar.b();
        ATSplashWebview splashWebview = aTSplashView.getSplashWebview();
        if (splashWebview == null) {
            return;
        }
        SplashJSBridgeImpl splashJSBridgeImpl = new SplashJSBridgeImpl(aTSplashView.getContext(), strD, strE);
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVarA);
        splashJSBridgeImpl.setCampaignList(arrayList);
        splashJSBridgeImpl.setAllowSkip(zF ? 1 : 0);
        splashJSBridgeImpl.setCountdownS(iB);
        aTSplashView.setSplashJSBridgeImpl(splashJSBridgeImpl);
        if (TextUtils.isEmpty(dVarA.N1())) {
            strN1 = dVarA.O1();
        } else {
            strN1 = dVarA.N1();
        }
        String requestId = splashWebview.getRequestId();
        if (!TextUtils.isEmpty(requestId) && requestId.equals(strN1) && (this.f38663a || this.f38664b)) {
            aTSplashView.setH5Ready(true);
            if (cVar != null) {
                cVar.a(1);
                return;
            }
            return;
        }
        b();
        splashWebview.setRequestId(strN1);
        System.currentTimeMillis();
        splashWebview.setWebViewListener(new a(cVar, aTSplashView, dVarA));
        if (!splashWebview.isDestroyed()) {
            splashWebview.loadUrl(strC);
        } else {
            aTSplashView.setH5Ready(false);
        }
    }
}
