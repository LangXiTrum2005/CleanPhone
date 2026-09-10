package com.iab.omid.library.chartboost.publisher;

import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.chartboost.adsession.AdSessionContext;
import com.iab.omid.library.chartboost.adsession.VerificationScriptResource;
import com.iab.omid.library.chartboost.internal.g;
import com.iab.omid.library.chartboost.internal.h;
import com.iab.omid.library.chartboost.utils.c;
import com.iab.omid.library.chartboost.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class b extends AdSessionStatePublisher {
    private WebView g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f21881h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f21882i;
    private final String j;

    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
            if (b.this.getWebView() == webView) {
                Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                b.this.a((WebView) null);
            }
            webView.destroy();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.chartboost.publisher.b$b, reason: collision with other inner class name */
    public class RunnableC0227b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WebView f21884a;

        public RunnableC0227b() {
            this.f21884a = b.this.g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f21884a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f21881h = null;
        this.f21882i = map;
        this.j = str2;
    }

    @Override // com.iab.omid.library.chartboost.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0227b(), Math.max(4000 - (this.f21881h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f21881h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.g = null;
    }

    @Override // com.iab.omid.library.chartboost.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    public void j() {
        WebView webView = new WebView(g.b().a());
        this.g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.g.getSettings().setAllowContentAccess(false);
        this.g.getSettings().setAllowFileAccess(false);
        this.g.setWebViewClient(new a());
        a(this.g);
        h.a().c(this.g, this.j);
        for (String str : this.f21882i.keySet()) {
            h.a().d(this.g, this.f21882i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f21881h = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.chartboost.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.chartboost.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
