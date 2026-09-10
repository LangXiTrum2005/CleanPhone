package ads_mobile_sdk;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Objects;
import saneness.lerp;

/* JADX INFO: loaded from: classes.dex */
public final class sk1 extends WebViewClient {
    public final /* synthetic */ uk1 a;

    public sk1(uk1 uk1Var) {
        this.a = uk1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        renderProcessGoneDetail.toString();
        Objects.toString(webView);
        if (((WebView) this.a.b.get()) == webView) {
            uk1 uk1Var = this.a;
            uk1Var.getClass();
            uk1Var.b = new lerp(null);
        }
        webView.destroy();
        return true;
    }
}
