package sg.bigo.ads.core.h;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes7.dex */
public abstract class d extends WebViewClient {
    public abstract void a(RenderProcessGoneDetail renderProcessGoneDetail);

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (webView instanceof b) {
            b bVar = (b) webView;
            if (bVar.g) {
                return;
            }
            bVar.g = true;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webView instanceof b) {
            ((b) webView).a(2, webResourceRequest, webResourceError == null ? -1 : webResourceError.getErrorCode(), webResourceError == null ? null : webResourceError.getDescription());
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webView instanceof b) {
            ((b) webView).a(1, webResourceRequest, webResourceResponse == null ? -1 : webResourceResponse.getStatusCode(), webResourceResponse == null ? null : webResourceResponse.getReasonPhrase());
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        a(renderProcessGoneDetail);
        return true;
    }
}
