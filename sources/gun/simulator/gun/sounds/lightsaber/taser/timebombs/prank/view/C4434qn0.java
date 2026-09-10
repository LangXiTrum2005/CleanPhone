package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.qn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4434qn0 extends W2 {
    public WebView g;
    public Long h;
    public final Map i;
    public final String j;

    public C4434qn0(String str, Map map, String str2) {
        super(str);
        this.h = null;
        this.i = map;
        this.j = str2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W2
    public final void a(C3203cn0 c3203cn0, TN tn) {
        JSONObject jSONObject = new JSONObject();
        Map mapB = tn.b();
        for (String str : mapB.keySet()) {
            C3719ih0 c3719ih0 = (C3719ih0) mapB.get(str);
            c3719ih0.getClass();
            JSONObject jSONObject2 = new JSONObject();
            En0.b(jSONObject2, "vendorKey", c3719ih0.f4515a);
            En0.b(jSONObject2, "resourceUrl", c3719ih0.b.toString());
            En0.b(jSONObject2, "verificationParameters", c3719ih0.c);
            En0.b(jSONObject, str, jSONObject2);
        }
        b(c3203cn0, tn, jSONObject);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W2
    public final void e() {
        super.e();
        new Handler().postDelayed(new RunnableC3252dN(this), Math.max(4000 - (this.h == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.g = null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W2
    public final void g() {
        WebView webView = new WebView(C4260oo0.d.f4809a);
        this.g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.g.getSettings().setAllowContentAccess(false);
        this.g.getSettings().setAllowFileAccess(false);
        this.g.setWebViewClient(new C3556gn0(this, 0));
        this.b = new Im0(this.g);
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
            String externalForm = ((C3719ih0) map.get(str2)).b.toExternalForm();
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
