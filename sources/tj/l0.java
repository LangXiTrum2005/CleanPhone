package tj;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class l0 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebView f50860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f50861b;

    public l0(m0 m0Var, WebView webView) {
        this.f50861b = m0Var;
        this.f50860a = webView;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        WebViewClient webViewClient = this.f50861b.f50868a;
        WebView webView2 = this.f50860a;
        if (webViewClient.shouldOverrideUrlLoading(webView2, webResourceRequest)) {
            return true;
        }
        webView2.loadUrl(webResourceRequest.getUrl().toString());
        return true;
    }
}
