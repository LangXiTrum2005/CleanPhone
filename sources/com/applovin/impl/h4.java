package com.applovin.impl;

import android.view.View;
import android.webkit.WebView;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.ErrorType;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final AppLovinAdBase f8064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final com.applovin.impl.sdk.l f8065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final com.applovin.impl.sdk.p f8066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final String f8067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f8068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected AdSession f8069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected AdEvents f8070g;

    public h4(AppLovinAdBase appLovinAdBase) {
        this.f8064a = appLovinAdBase;
        this.f8065b = appLovinAdBase.getSdk();
        this.f8066c = appLovinAdBase.getSdk().Q();
        String string = "AdEventTracker:" + appLovinAdBase.getAdIdNumber();
        if (StringUtils.isValidString(appLovinAdBase.getDspName())) {
            StringBuilder sbJ = d5.u.j(string, ":");
            sbJ.append(appLovinAdBase.getDspName());
            string = sbJ.toString();
        }
        this.f8067d = string;
    }

    public abstract AdSessionConfiguration a();

    public abstract AdSessionContext a(WebView webView);

    public void h() {
        b("track loaded", new i9(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(WebView webView) {
        AdSessionContext adSessionContextA;
        if (!this.f8064a.isOpenMeasurementEnabled()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8066c.d(this.f8067d, "Skip starting session - Open Measurement disabled");
                return;
            }
            return;
        }
        if (this.f8069f != null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8066c.k(this.f8067d, "Attempting to start session again for ad: " + this.f8064a);
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f8066c.a(this.f8067d, "Starting session");
        }
        AdSessionConfiguration adSessionConfigurationA = a();
        if (adSessionConfigurationA == null || (adSessionContextA = a(webView)) == null) {
            return;
        }
        try {
            AdSession adSessionCreateAdSession = AdSession.createAdSession(adSessionConfigurationA, adSessionContextA);
            this.f8069f = adSessionCreateAdSession;
            try {
                this.f8070g = AdEvents.createAdEvents(adSessionCreateAdSession);
                a(this.f8069f);
                this.f8069f.start();
                this.f8068e = true;
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8066c.a(this.f8067d, "Session started");
                }
            } catch (Throwable th2) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8066c.a(this.f8067d, "Failed to create ad events", th2);
                }
            }
        } catch (Throwable th3) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8066c.a(this.f8067d, "Failed to create session", th3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.f8070g.loaded();
    }

    public void a(AdSession adSession) {
    }

    public void c(WebView webView) {
        AppLovinSdkUtils.runOnUiThread(new x8(4, this, webView));
    }

    public void e() {
        c(null);
    }

    public void f() {
        b("stop session", new i9(this, 2));
    }

    public void g() {
        b("track impression event", new i9(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.f8070g.impressionOccurred();
    }

    public void a(View view) {
        b(view, Collections.EMPTY_LIST);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, List list) {
        this.f8069f.registerAdView(view);
        this.f8069f.removeAllFriendlyObstructions();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j4 j4Var = (j4) it.next();
            if (j4Var.c() != null) {
                try {
                    this.f8069f.addFriendlyObstruction(j4Var.c(), j4Var.b(), j4Var.a());
                } catch (Throwable th2) {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f8066c.a(this.f8067d, "Failed to add friendly obstruction (" + j4Var + ")", th2);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        this.f8069f.error(ErrorType.VIDEO, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        try {
            if (this.f8068e) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8066c.a(this.f8067d, "Running operation: " + str);
                }
                runnable.run();
            }
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8066c.a(this.f8067d, "Failed to run operation: " + str, th2);
            }
        }
    }

    public void b(View view, List list) {
        b("update main view: " + view, new androidx.fragment.app.d(this, view, list, 11));
    }

    public void b(String str) {
        b("track error", new x8(5, this, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.f8068e = false;
        this.f8069f.finish();
        this.f8069f = null;
        this.f8070g = null;
    }

    public void b(String str, Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new androidx.fragment.app.d(this, str, runnable, 10));
    }
}
