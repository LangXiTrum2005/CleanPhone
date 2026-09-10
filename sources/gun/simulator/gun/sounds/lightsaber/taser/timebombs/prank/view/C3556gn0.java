package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Objects;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3556gn0 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4432a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C3556gn0(Object obj, int i) {
        this.f4432a = i;
        this.b = obj;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        int i = this.f4432a;
        Object obj = this.b;
        switch (i) {
            case 0:
                renderProcessGoneDetail.toString();
                Objects.toString(webView);
                C4434qn0 c4434qn0 = (C4434qn0) obj;
                if (c4434qn0.f() == webView) {
                    c4434qn0.b = new Im0(null);
                }
                webView.destroy();
                break;
            case 1:
                renderProcessGoneDetail.toString();
                Objects.toString(webView);
                C4697tn0 c4697tn0 = (C4697tn0) obj;
                if (c4697tn0.q() == webView) {
                    c4697tn0.b(null);
                }
                webView.destroy();
                break;
            default:
                renderProcessGoneDetail.toString();
                Objects.toString(webView);
                C4961wn0 c4961wn0 = (C4961wn0) obj;
                if (c4961wn0.q() == webView) {
                    c4961wn0.b(null);
                }
                webView.destroy();
                break;
        }
        return true;
    }
}
