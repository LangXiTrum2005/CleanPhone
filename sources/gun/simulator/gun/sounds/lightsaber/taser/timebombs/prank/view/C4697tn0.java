package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4697tn0 extends V2 {
    public WebView g;
    public Long h;
    public final Map i;
    public final String j;

    public C4697tn0(String str, Map map, String str2) {
        super(str, 0);
        this.h = null;
        this.i = map;
        this.j = str2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.V2
    public final void e(C3026an0 c3026an0, P2 p2) {
        JSONObject jSONObject = new JSONObject();
        Map mapUnmodifiableMap = Collections.unmodifiableMap(p2.d);
        Iterator it = mapUnmodifiableMap.keySet().iterator();
        if (it.hasNext()) {
            AbstractC3950lJ.z(mapUnmodifiableMap.get((String) it.next()));
            throw null;
        }
        f(c3026an0, p2, jSONObject);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.V2
    public final void m() {
        super.m();
        new Handler().postDelayed(new RunnableC3252dN(this), Math.max(4000 - (this.h == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.g = null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.V2
    public final void r() {
        WebView webView = new WebView(C4260oo0.b.f4809a);
        this.g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.g.getSettings().setAllowContentAccess(false);
        this.g.getSettings().setAllowFileAccess(false);
        this.g.setWebViewClient(new C3556gn0(this, 1));
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
        Iterator it = map.keySet().iterator();
        if (it.hasNext()) {
            AbstractC3950lJ.z(map.get((String) it.next()));
            throw null;
        }
        this.h = Long.valueOf(System.nanoTime());
    }
}
