package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Build;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import com.unity3d.ads.adplayer.AndroidWebViewClient;

/* JADX INFO: loaded from: classes4.dex */
public final class XK implements Runnable {
    private final C2984aL widget;

    public XK(C2984aL c2984aL) {
        AbstractC2995aW.q(c2984aL, "widget");
        this.widget = c2984aL;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.widget.removeAllViews();
            WebView webView = this.widget.webView;
            if (webView != null) {
                webView.setWebChromeClient(null);
                webView.stopLoading();
                webView.clearHistory();
                if (Build.VERSION.SDK_INT >= 29) {
                    webView.setWebViewRenderProcessClient(null);
                }
                webView.loadUrl(AndroidWebViewClient.BLANK_PAGE);
                webView.removeAllViews();
                ViewParent parent = webView.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(webView);
                }
                webView.destroy();
            }
            this.widget.webView = null;
        } catch (Throwable unused) {
        }
    }
}
