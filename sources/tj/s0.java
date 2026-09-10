package tj;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.z8;
import com.google.android.gms.internal.measurement.nf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class s0 extends WebViewClient {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f50904c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f50905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f50906b = false;

    public s0(l lVar) {
        this.f50905a = lVar;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z10) {
        this.f50905a.f50859a.x(new com.applovin.impl.sdk.v(this, webView, str, z10));
    }

    @Override // android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        this.f50905a.f50859a.x(new bc.r(this, webView, message, message2, 22));
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        this.f50905a.f50859a.x(new q0(this, webView, str, 1));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        this.f50905a.f50859a.x(new q0(this, webView, str, 3));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.f50905a.f50859a.x(new q0(this, webView, str, 2));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f50905a.f50859a.x(new q0(this, webView, str, 0));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        this.f50905a.f50859a.x(new ld.f(this, webView, clientCertRequest, 8));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.f50905a.f50859a.x(new bc.r(this, webView, webResourceRequest, webResourceError, 24));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.f50905a.f50859a.x(new z8(this, webView, httpAuthHandler, str, str2, 10));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.f50905a.f50859a.x(new bc.r(this, webView, webResourceRequest, webResourceResponse, 25));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        this.f50905a.f50859a.x(new z8(this, webView, str, str2, str3, 9));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.f50905a.f50859a.x(new bc.r(this, webView, sslErrorHandler, sslError, 23));
    }

    @Override // android.webkit.WebViewClient
    public final void onScaleChanged(final WebView webView, final float f10, final float f11) {
        this.f50905a.f50859a.x(new Runnable() { // from class: tj.r0
            @Override // java.lang.Runnable
            public final void run() {
                s0 s0Var = this.f50898a;
                l lVar = s0Var.f50905a;
                double d10 = f10;
                double d11 = f11;
                bh.a aVar = new bh.a(26);
                lVar.getClass();
                WebView viewArg = webView;
                kotlin.jvm.internal.n.f(viewArg, "viewArg");
                nf nfVar = lVar.f50859a;
                nfVar.getClass();
                if (((c) nfVar.f23783c).d(s0Var)) {
                    new k5.g((xi.f) nfVar.f23782b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onScaleChanged", nfVar.e(), (Object) null).y(xj.o.Q(s0Var, viewArg, Double.valueOf(d10), Double.valueOf(d11)), new g0(aVar, 14));
                } else {
                    q4.a.p("missing-instance-error", "Callback to `WebViewClient.onScaleChanged` failed because native instance was not in the instance manager.", "");
                }
            }
        });
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        this.f50905a.f50859a.x(new ld.f(this, webView, webResourceRequest, 9));
        return webResourceRequest.isForMainFrame() && this.f50906b;
    }

    @Override // android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
    }
}
