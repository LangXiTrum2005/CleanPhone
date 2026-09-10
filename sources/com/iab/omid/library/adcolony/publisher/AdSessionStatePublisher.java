package com.iab.omid.library.adcolony.publisher;

import android.webkit.WebView;
import com.iab.omid.library.adcolony.adsession.AdEvents;
import com.iab.omid.library.adcolony.adsession.AdSessionConfiguration;
import com.iab.omid.library.adcolony.adsession.AdSessionContext;
import com.iab.omid.library.adcolony.adsession.ErrorType;
import com.iab.omid.library.adcolony.adsession.VerificationScriptResource;
import com.iab.omid.library.adcolony.adsession.media.MediaEvents;
import com.iab.omid.library.adcolony.b.e;
import com.iab.omid.library.adcolony.d.d;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AdSessionStatePublisher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.iab.omid.library.adcolony.e.b f21491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AdEvents f21492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MediaEvents f21493c;
    private a d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f21494e;

    public enum a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        i();
        this.f21491a = new com.iab.omid.library.adcolony.e.b(null);
    }

    public void a() {
    }

    public void b() {
        this.f21491a.clear();
    }

    public AdEvents c() {
        return this.f21492b;
    }

    public MediaEvents d() {
        return this.f21493c;
    }

    public boolean e() {
        return this.f21491a.get() != null;
    }

    public void f() {
        e.a().a(getWebView());
    }

    public void g() {
        e.a().b(getWebView());
    }

    public WebView getWebView() {
        return this.f21491a.get();
    }

    public void h() {
        e.a().c(getWebView());
    }

    public void i() {
        this.f21494e = d.a();
        this.d = a.AD_STATE_IDLE;
    }

    public void a(float f) {
        e.a().a(getWebView(), f);
    }

    public void b(String str, long j) {
        if (j >= this.f21494e) {
            a aVar = this.d;
            a aVar2 = a.AD_STATE_NOTVISIBLE;
            if (aVar != aVar2) {
                this.d = aVar2;
                e.a().b(getWebView(), str);
            }
        }
    }

    public void a(WebView webView) {
        this.f21491a = new com.iab.omid.library.adcolony.e.b(webView);
    }

    public void a(AdEvents adEvents) {
        this.f21492b = adEvents;
    }

    public void a(AdSessionConfiguration adSessionConfiguration) {
        e.a().a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    public void a(ErrorType errorType, String str) {
        e.a().a(getWebView(), errorType, str);
    }

    public void a(com.iab.omid.library.adcolony.adsession.a aVar, AdSessionContext adSessionContext) {
        a(aVar, adSessionContext, null);
    }

    public void a(com.iab.omid.library.adcolony.adsession.a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        com.iab.omid.library.adcolony.d.b.a(jSONObject2, "environment", "app");
        com.iab.omid.library.adcolony.d.b.a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        com.iab.omid.library.adcolony.d.b.a(jSONObject2, "deviceInfo", com.iab.omid.library.adcolony.d.a.d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        com.iab.omid.library.adcolony.d.b.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        com.iab.omid.library.adcolony.d.b.a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        com.iab.omid.library.adcolony.d.b.a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        com.iab.omid.library.adcolony.d.b.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        com.iab.omid.library.adcolony.d.b.a(jSONObject4, "libraryVersion", "1.3.30-Adcolony");
        com.iab.omid.library.adcolony.d.b.a(jSONObject4, com.smartdigimkt.f3.b.f35043u, com.iab.omid.library.adcolony.b.d.a().b().getApplicationContext().getPackageName());
        com.iab.omid.library.adcolony.d.b.a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            com.iab.omid.library.adcolony.d.b.a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            com.iab.omid.library.adcolony.d.b.a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            com.iab.omid.library.adcolony.d.b.a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        e.a().a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    public void a(MediaEvents mediaEvents) {
        this.f21493c = mediaEvents;
    }

    public void a(String str) {
        e.a().a(getWebView(), str, (JSONObject) null);
    }

    public void a(String str, long j) {
        if (j >= this.f21494e) {
            this.d = a.AD_STATE_VISIBLE;
            e.a().b(getWebView(), str);
        }
    }

    public void a(String str, JSONObject jSONObject) {
        e.a().a(getWebView(), str, jSONObject);
    }

    public void a(JSONObject jSONObject) {
        e.a().b(getWebView(), jSONObject);
    }

    public void a(boolean z2) {
        if (e()) {
            e.a().c(getWebView(), z2 ? "foregrounded" : "backgrounded");
        }
    }
}
