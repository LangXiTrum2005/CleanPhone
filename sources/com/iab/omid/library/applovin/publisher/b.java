package com.iab.omid.library.applovin.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.internal.g;
import com.iab.omid.library.applovin.internal.h;
import com.iab.omid.library.applovin.utils.c;
import com.iab.omid.library.applovin.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class b extends AdSessionStatePublisher {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WebView f25148g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f25149h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f25150i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f25151j;

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

    /* JADX INFO: renamed from: com.iab.omid.library.applovin.publisher.b$b, reason: collision with other inner class name */
    public class RunnableC0023b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WebView f25153a;

        public RunnableC0023b() {
            this.f25153a = b.this.f25148g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f25153a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f25149h = null;
        this.f25150i = map;
        this.f25151j = str2;
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0023b(), Math.max(4000 - (this.f25149h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f25149h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f25148g = null;
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void j() {
        WebView webView = new WebView(g.b().a());
        this.f25148g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f25148g.getSettings().setAllowContentAccess(false);
        this.f25148g.getSettings().setAllowFileAccess(false);
        this.f25148g.setWebViewClient(new a());
        a(this.f25148g);
        h.a().c(this.f25148g, this.f25151j);
        for (String str : this.f25150i.keySet()) {
            h.a().d(this.f25148g, this.f25150i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f25149h = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.applovin.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
