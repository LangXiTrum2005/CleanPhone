package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.wj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4953wj0 extends WebViewRenderProcessClient {
    private InterfaceC5045xl0 errorHandler;

    public C4953wj0(InterfaceC5045xl0 interfaceC5045xl0) {
        this.errorHandler = interfaceC5045xl0;
    }

    @Override // android.webkit.WebViewRenderProcessClient
    public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        AbstractC2995aW.q(webView, "webView");
    }

    @Override // android.webkit.WebViewRenderProcessClient
    public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        AbstractC2995aW.q(webView, "webView");
        C4829vJ c4829vJ = C4917wJ.Companion;
        StringBuilder sb = new StringBuilder("onRenderProcessUnresponsive(Title = ");
        sb.append(webView.getTitle());
        sb.append(", URL = ");
        sb.append(webView.getOriginalUrl());
        sb.append(", (webViewRenderProcess != null) = ");
        sb.append(webViewRenderProcess != null);
        c4829vJ.w("VungleWebClient", sb.toString());
        InterfaceC5045xl0 interfaceC5045xl0 = this.errorHandler;
        if (interfaceC5045xl0 != null) {
            ((C4304pL) interfaceC5045xl0).onRenderProcessUnresponsive(webView, webViewRenderProcess);
        }
    }
}
