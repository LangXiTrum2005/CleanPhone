package com.iab.omid.library.bigosg.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.bigosg.adsession.AdSessionContext;
import com.iab.omid.library.bigosg.adsession.VerificationScriptResource;
import com.iab.omid.library.bigosg.b.e;
import com.iab.omid.library.bigosg.d.d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class b extends AdSessionStatePublisher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WebView f21691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Long f21692b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, VerificationScriptResource> f21693c;
    private final String d;

    public b(Map<String, VerificationScriptResource> map, String str) {
        this.f21693c = map;
        this.d = str;
    }

    @Override // com.iab.omid.library.bigosg.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new Runnable() { // from class: com.iab.omid.library.bigosg.publisher.b.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private WebView f21695b;

            {
                this.f21695b = b.this.f21691a;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f21695b.destroy();
            }
        }, Math.max(4000 - (this.f21692b == null ? 4000L : TimeUnit.MILLISECONDS.convert(d.a() - this.f21692b.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f21691a = null;
    }

    public void j() {
        WebView webView = new WebView(com.iab.omid.library.bigosg.b.d.a().b());
        this.f21691a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        a(this.f21691a);
        e.a().a(this.f21691a, this.d);
        for (String str : this.f21693c.keySet()) {
            e.a().a(this.f21691a, this.f21693c.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f21692b = Long.valueOf(d.a());
    }

    @Override // com.iab.omid.library.bigosg.publisher.AdSessionStatePublisher
    public void a() {
        super.a();
        j();
    }

    @Override // com.iab.omid.library.bigosg.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.bigosg.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            com.iab.omid.library.bigosg.d.b.a(jSONObject, str, injectedResourcesMap.get(str));
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
