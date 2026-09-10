package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.wn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4961wn0 extends V2 {
    public WebView g;
    public Long h;
    public final Map i;
    public final String j;

    public C4961wn0(String str, Map map, String str2) {
        super(str, 1);
        this.h = null;
        this.i = map;
        this.j = str2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.V2
    public final void c(Jm0 jm0, TN tn) {
        JSONObject jSONObject = new JSONObject();
        Map mapB = tn.b();
        for (String str : mapB.keySet()) {
            C3632hh0 c3632hh0 = (C3632hh0) mapB.get(str);
            c3632hh0.getClass();
            JSONObject jSONObject2 = new JSONObject();
            In0.b(jSONObject2, "vendorKey", c3632hh0.f4464a);
            In0.b(jSONObject2, "resourceUrl", c3632hh0.b.toString());
            In0.b(jSONObject2, "verificationParameters", c3632hh0.c);
            In0.b(jSONObject, str, jSONObject2);
        }
        d(jm0, tn, jSONObject);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.V2
    public final void m() {
        super.m();
        new Handler().postDelayed(new RunnableC3252dN(this), Math.max(4000 - (this.h == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.g = null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.V2
    public final void r() {
        WebView webView = new WebView(C4260oo0.c.f4809a);
        this.g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.g.getSettings().setAllowContentAccess(false);
        this.g.getSettings().setAllowFileAccess(false);
        this.g.setWebViewClient(new C3556gn0(this, 2));
        b(this.g);
        WebView webView2 = this.g;
        if (webView2 != null) {
            String str = this.j;
            if (!TextUtils.isEmpty(str)) {
                try {
                    webView2.evaluateJavascript(str, null);
                } catch (IllegalStateException unused) {
                    webView2.loadUrl("javascript: " + str);
                }
            }
        }
        Map map = this.i;
        for (String str2 : map.keySet()) {
            String externalForm = ((C3632hh0) map.get(str2)).b.toExternalForm();
            WebView webView3 = this.g;
            if (externalForm != null && !TextUtils.isEmpty(str2)) {
                String strReplace = "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", externalForm).replace("%INJECTION_ID%", str2);
                if (webView3 != null && !TextUtils.isEmpty(strReplace)) {
                    try {
                        webView3.evaluateJavascript(strReplace, null);
                    } catch (IllegalStateException unused2) {
                        webView3.loadUrl("javascript: " + strReplace);
                    }
                }
            }
        }
        this.h = Long.valueOf(System.nanoTime());
    }
}
