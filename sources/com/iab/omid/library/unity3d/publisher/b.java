package com.iab.omid.library.unity3d.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.unity3d.adsession.AdSessionContext;
import com.iab.omid.library.unity3d.adsession.VerificationScriptResource;
import com.iab.omid.library.unity3d.internal.g;
import com.iab.omid.library.unity3d.utils.c;
import com.iab.omid.library.unity3d.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class b extends AdSessionStatePublisher {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WebView f25543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f25544h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f25545i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f25546j;

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

    /* JADX INFO: renamed from: com.iab.omid.library.unity3d.publisher.b$b, reason: collision with other inner class name */
    public class RunnableC0035b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WebView f25548a;

        public RunnableC0035b() {
            this.f25548a = b.this.f25543g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f25548a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f25544h = null;
        this.f25545i = map;
        this.f25546j = str2;
    }

    @Override // com.iab.omid.library.unity3d.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0035b(), Math.max(4000 - (this.f25544h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f25544h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f25543g = null;
    }

    @Override // com.iab.omid.library.unity3d.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void j() {
        WebView webView = new WebView(com.iab.omid.library.unity3d.internal.f.b().a());
        this.f25543g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f25543g.getSettings().setAllowContentAccess(false);
        this.f25543g.getSettings().setAllowFileAccess(false);
        this.f25543g.setWebViewClient(new a());
        a(this.f25543g);
        g.a().c(this.f25543g, this.f25546j);
        for (String str : this.f25545i.keySet()) {
            g.a().c(this.f25543g, this.f25545i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f25544h = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.unity3d.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.unity3d.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
