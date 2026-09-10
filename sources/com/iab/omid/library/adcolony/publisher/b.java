package com.iab.omid.library.adcolony.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.adcolony.adsession.AdSessionContext;
import com.iab.omid.library.adcolony.adsession.VerificationScriptResource;
import com.iab.omid.library.adcolony.b.e;
import com.iab.omid.library.adcolony.d.d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class b extends AdSessionStatePublisher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WebView f21498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Long f21499b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f21500c;
    private final String d;

    public b(Map<String, VerificationScriptResource> map, String str) {
        this.f21500c = map;
        this.d = str;
    }

    @Override // com.iab.omid.library.adcolony.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new Runnable() { // from class: com.iab.omid.library.adcolony.publisher.b.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final WebView f21502b;

            {
                this.f21502b = b.this.f21498a;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f21502b.destroy();
            }
        }, Math.max(4000 - (this.f21499b == null ? 4000L : TimeUnit.MILLISECONDS.convert(d.a() - this.f21499b.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f21498a = null;
    }

    public void j() {
        WebView webView = new WebView(com.iab.omid.library.adcolony.b.d.a().b());
        this.f21498a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        a(this.f21498a);
        e.a().a(this.f21498a, this.d);
        for (String str : this.f21500c.keySet()) {
            e.a().a(this.f21498a, this.f21500c.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f21499b = Long.valueOf(d.a());
    }

    @Override // com.iab.omid.library.adcolony.publisher.AdSessionStatePublisher
    public void a() {
        super.a();
        j();
    }

    @Override // com.iab.omid.library.adcolony.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.adcolony.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            com.iab.omid.library.adcolony.d.b.a(jSONObject, str, injectedResourcesMap.get(str));
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
