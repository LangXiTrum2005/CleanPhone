package com.iab.omid.library.inmobi.publisher;

import android.webkit.WebView;
import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.ErrorType;
import com.iab.omid.library.inmobi.adsession.VerificationScriptResource;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;
import com.iab.omid.library.inmobi.internal.g;
import com.iab.omid.library.inmobi.internal.h;
import com.iab.omid.library.inmobi.utils.c;
import com.iab.omid.library.inmobi.utils.f;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AdSessionStatePublisher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f21975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.iab.omid.library.inmobi.weakreference.b f21976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AdEvents f21977c;
    private MediaEvents d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f21978e;
    private long f;

    public enum a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        a();
        this.f21975a = str;
        this.f21976b = new com.iab.omid.library.inmobi.weakreference.b(null);
    }

    public void a() {
        this.f = f.b();
        this.f21978e = a.AD_STATE_IDLE;
    }

    public void b() {
        this.f21976b.clear();
    }

    public AdEvents c() {
        return this.f21977c;
    }

    public MediaEvents d() {
        return this.d;
    }

    public boolean e() {
        return this.f21976b.get() != null;
    }

    public void f() {
        h.a().a(getWebView(), this.f21975a);
    }

    public void g() {
        h.a().b(getWebView(), this.f21975a);
    }

    public WebView getWebView() {
        return this.f21976b.get();
    }

    public void h() {
        a((JSONObject) null);
    }

    public void i() {
    }

    public void a(float f) {
        h.a().a(getWebView(), this.f21975a, f);
    }

    public void b(String str, long j) {
        if (j >= this.f) {
            this.f21978e = a.AD_STATE_VISIBLE;
            h.a().b(getWebView(), this.f21975a, str);
        }
    }

    public void a(WebView webView) {
        this.f21976b = new com.iab.omid.library.inmobi.weakreference.b(webView);
    }

    public void b(boolean z2) {
        if (e()) {
            h.a().a(getWebView(), this.f21975a, z2 ? "locked" : "unlocked");
        }
    }

    public void a(AdEvents adEvents) {
        this.f21977c = adEvents;
    }

    public void a(AdSessionConfiguration adSessionConfiguration) {
        h.a().a(getWebView(), this.f21975a, adSessionConfiguration.toJsonObject());
    }

    public void a(ErrorType errorType, String str) {
        h.a().a(getWebView(), this.f21975a, errorType, str);
    }

    public void a(com.iab.omid.library.inmobi.adsession.a aVar, AdSessionContext adSessionContext) {
        a(aVar, adSessionContext, null);
    }

    public void a(com.iab.omid.library.inmobi.adsession.a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String strC = aVar.c();
        JSONObject jSONObject2 = new JSONObject();
        c.a(jSONObject2, "environment", "app");
        c.a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        c.a(jSONObject2, "deviceInfo", com.iab.omid.library.inmobi.utils.b.d());
        c.a(jSONObject2, "deviceCategory", com.iab.omid.library.inmobi.utils.a.a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        c.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        c.a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        c.a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        c.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        c.a(jSONObject4, "libraryVersion", "1.5.5-Inmobi");
        c.a(jSONObject4, com.smartdigimkt.f3.b.f35043u, g.b().a().getApplicationContext().getPackageName());
        c.a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            c.a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            c.a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        if (adSessionContext.getUniversalAdId() != null) {
            c.a(jSONObject2, "universalAdId", adSessionContext.getUniversalAdId());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            c.a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        h.a().a(getWebView(), strC, jSONObject2, jSONObject5, jSONObject);
    }

    public void a(MediaEvents mediaEvents) {
        this.d = mediaEvents;
    }

    public void a(String str) {
        a(str, (JSONObject) null);
    }

    public void a(String str, long j) {
        if (j >= this.f) {
            a aVar = this.f21978e;
            a aVar2 = a.AD_STATE_NOTVISIBLE;
            if (aVar != aVar2) {
                this.f21978e = aVar2;
                h.a().b(getWebView(), this.f21975a, str);
            }
        }
    }

    public void a(String str, JSONObject jSONObject) {
        h.a().a(getWebView(), this.f21975a, str, jSONObject);
    }

    public void a(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        h.a().a(getWebView(), jSONObject);
    }

    public void a(JSONObject jSONObject) {
        h.a().b(getWebView(), this.f21975a, jSONObject);
    }

    public void a(boolean z2) {
        if (e()) {
            h.a().c(getWebView(), this.f21975a, z2 ? "foregrounded" : "backgrounded");
        }
    }
}
