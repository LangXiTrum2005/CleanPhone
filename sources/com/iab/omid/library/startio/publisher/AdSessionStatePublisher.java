package com.iab.omid.library.startio.publisher;

import android.webkit.WebView;
import com.iab.omid.library.startio.adsession.AdEvents;
import com.iab.omid.library.startio.adsession.AdSessionConfiguration;
import com.iab.omid.library.startio.adsession.AdSessionContext;
import com.iab.omid.library.startio.adsession.ErrorType;
import com.iab.omid.library.startio.adsession.VerificationScriptResource;
import com.iab.omid.library.startio.adsession.media.MediaEvents;
import com.iab.omid.library.startio.internal.g;
import com.iab.omid.library.startio.internal.h;
import com.iab.omid.library.startio.utils.c;
import com.iab.omid.library.startio.utils.f;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AdSessionStatePublisher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f22271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.iab.omid.library.startio.weakreference.b f22272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AdEvents f22273c;
    private MediaEvents d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f22274e;
    private long f;

    public enum a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        a();
        this.f22271a = str;
        this.f22272b = new com.iab.omid.library.startio.weakreference.b(null);
    }

    public void a() {
        this.f = f.b();
        this.f22274e = a.AD_STATE_IDLE;
    }

    public void b() {
        this.f22272b.clear();
    }

    public AdEvents c() {
        return this.f22273c;
    }

    public MediaEvents d() {
        return this.d;
    }

    public boolean e() {
        return this.f22272b.get() != null;
    }

    public void f() {
        h.a().a(getWebView(), this.f22271a);
    }

    public void g() {
        h.a().b(getWebView(), this.f22271a);
    }

    public WebView getWebView() {
        return this.f22272b.get();
    }

    public void h() {
        a((JSONObject) null);
    }

    public void i() {
    }

    public void a(float f) {
        h.a().a(getWebView(), this.f22271a, f);
    }

    public void b(String str, long j) {
        if (j >= this.f) {
            this.f22274e = a.AD_STATE_VISIBLE;
            h.a().a(getWebView(), this.f22271a, str);
        }
    }

    public void a(WebView webView) {
        this.f22272b = new com.iab.omid.library.startio.weakreference.b(webView);
    }

    public void a(AdEvents adEvents) {
        this.f22273c = adEvents;
    }

    public void a(AdSessionConfiguration adSessionConfiguration) {
        h.a().a(getWebView(), this.f22271a, adSessionConfiguration.toJsonObject());
    }

    public void a(ErrorType errorType, String str) {
        h.a().a(getWebView(), this.f22271a, errorType, str);
    }

    public void a(com.iab.omid.library.startio.adsession.a aVar, AdSessionContext adSessionContext) {
        a(aVar, adSessionContext, null);
    }

    public void a(com.iab.omid.library.startio.adsession.a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        c.a(jSONObject2, "environment", "app");
        c.a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        c.a(jSONObject2, "deviceInfo", com.iab.omid.library.startio.utils.b.d());
        c.a(jSONObject2, "deviceCategory", com.iab.omid.library.startio.utils.a.a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        c.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        c.a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        c.a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        c.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        c.a(jSONObject4, "libraryVersion", "1.4.12-Startio");
        c.a(jSONObject4, com.smartdigimkt.f3.b.f35043u, g.b().a().getApplicationContext().getPackageName());
        c.a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            c.a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            c.a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            c.a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        h.a().a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    public void a(MediaEvents mediaEvents) {
        this.d = mediaEvents;
    }

    public void a(String str) {
        a(str, (JSONObject) null);
    }

    public void a(String str, long j) {
        if (j >= this.f) {
            a aVar = this.f22274e;
            a aVar2 = a.AD_STATE_NOTVISIBLE;
            if (aVar != aVar2) {
                this.f22274e = aVar2;
                h.a().a(getWebView(), this.f22271a, str);
            }
        }
    }

    public void a(String str, JSONObject jSONObject) {
        h.a().a(getWebView(), this.f22271a, str, jSONObject);
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
        h.a().b(getWebView(), this.f22271a, jSONObject);
    }

    public void a(boolean z2) {
        if (e()) {
            h.a().b(getWebView(), this.f22271a, z2 ? "foregrounded" : "backgrounded");
        }
    }
}
