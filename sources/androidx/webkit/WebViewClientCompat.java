package androidx.webkit;

import a.a;
import android.app.PendingIntent;
import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import no.b;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewClientBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import r4.e;
import rb.c;
import s4.g;
import s4.j;
import s4.m;
import s4.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class WebViewClientCompat extends WebViewClient implements WebViewClientBoundaryInterface {
    private static final String[] sSupportedFeatures = {"VISUAL_STATE_CALLBACK", "RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_HTTP_ERROR", "SHOULD_OVERRIDE_WITH_REDIRECTS", "SAFE_BROWSING_HIT"};

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return sSupportedFeatures;
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, InvocationHandler invocationHandler) {
        j jVar = new j();
        jVar.f50113b = (WebResourceErrorBoundaryInterface) b.e(WebResourceErrorBoundaryInterface.class, invocationHandler);
        onReceivedError(webView, webResourceRequest, jVar);
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i10, InvocationHandler invocationHandler) {
        g gVar = new g();
        gVar.f50109b = (SafeBrowsingResponseBoundaryInterface) b.e(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
        onSafeBrowsingHit(webView, webResourceRequest, i10, gVar);
    }

    public boolean onWebAuthnIntent(WebView webView, PendingIntent pendingIntent, InvocationHandler invocationHandler) {
        return false;
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        j jVar = new j();
        jVar.f50112a = webResourceError;
        onReceivedError(webView, webResourceRequest, jVar);
    }

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i10, SafeBrowsingResponse safeBrowsingResponse) {
        g gVar = new g();
        gVar.f50108a = safeBrowsingResponse;
        onSafeBrowsingHit(webView, webResourceRequest, i10, gVar);
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, e eVar) {
        if (a.x("WEB_RESOURCE_ERROR_GET_CODE") && a.x("WEB_RESOURCE_ERROR_GET_DESCRIPTION") && webResourceRequest.isForMainFrame()) {
            j jVar = (j) eVar;
            if (jVar.f50112a == null) {
                c cVar = n.f50125a;
                jVar.f50112a = (WebResourceError) ((WebkitToCompatConverterBoundaryInterface) cVar.f49529b).convertWebResourceError(Proxy.getInvocationHandler(jVar.f50113b));
            }
            int errorCode = jVar.f50112a.getErrorCode();
            j jVar2 = (j) eVar;
            if (jVar2.f50112a == null) {
                c cVar2 = n.f50125a;
                jVar2.f50112a = (WebResourceError) ((WebkitToCompatConverterBoundaryInterface) cVar2.f49529b).convertWebResourceError(Proxy.getInvocationHandler(jVar2.f50113b));
            }
            onReceivedError(webView, errorCode, jVar2.f50112a.getDescription().toString(), webResourceRequest.getUrl().toString());
        }
    }

    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i10, r4.c cVar) {
        if (a.x("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
            g gVar = (g) cVar;
            gVar.getClass();
            m.f50115a.getClass();
            if (gVar.f50108a == null) {
                c cVar2 = n.f50125a;
                gVar.f50108a = (SafeBrowsingResponse) ((WebkitToCompatConverterBoundaryInterface) cVar2.f49529b).convertSafeBrowsingResponse(Proxy.getInvocationHandler(gVar.f50109b));
            }
            gVar.f50108a.showInterstitial(true);
            return;
        }
        throw m.a();
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onPageCommitVisible(WebView webView, String str) {
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }
}
