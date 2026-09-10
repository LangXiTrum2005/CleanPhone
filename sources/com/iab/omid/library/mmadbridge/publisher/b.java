package com.iab.omid.library.mmadbridge.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.mmadbridge.adsession.AdSessionContext;
import com.iab.omid.library.mmadbridge.adsession.VerificationScriptResource;
import com.iab.omid.library.mmadbridge.internal.g;
import com.iab.omid.library.mmadbridge.internal.h;
import com.iab.omid.library.mmadbridge.utils.c;
import com.iab.omid.library.mmadbridge.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class b extends AdSessionStatePublisher {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WebView f25416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f25417h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f25418i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f25419j;

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

    /* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.publisher.b$b, reason: collision with other inner class name */
    public class RunnableC0031b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WebView f25421a;

        public RunnableC0031b() {
            this.f25421a = b.this.f25416g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f25421a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f25417h = null;
        this.f25418i = map;
        this.f25419j = str2;
    }

    @Override // com.iab.omid.library.mmadbridge.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0031b(), Math.max(4000 - (this.f25417h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f25417h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f25416g = null;
    }

    @Override // com.iab.omid.library.mmadbridge.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void j() {
        WebView webView = new WebView(g.b().a());
        this.f25416g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f25416g.getSettings().setAllowContentAccess(false);
        this.f25416g.getSettings().setAllowFileAccess(false);
        this.f25416g.setWebViewClient(new a());
        a(this.f25416g);
        h.a().c(this.f25416g, this.f25419j);
        for (String str : this.f25418i.keySet()) {
            h.a().d(this.f25416g, this.f25418i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f25417h = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.mmadbridge.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.mmadbridge.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
