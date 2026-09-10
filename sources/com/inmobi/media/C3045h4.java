package com.inmobi.media;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.h4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3045h4 extends X1 implements InterfaceC3323yb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f23649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23650c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f23651e;
    public final X3 f;
    public final InterfaceC3333z5 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C2963c4 f23652h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f23653i;
    public final AdConfig.RenderingConfig j;
    public final Lazy k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public R6 f23654l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f23655n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3045h4(Context context, long j, String placementType, String impressionId, String creativeId, X3 onLpLifecycleEvent, InterfaceC3333z5 interfaceC3333z5) {
        super(context);
        Intrinsics.f(context, "context");
        Intrinsics.f(placementType, "placementType");
        Intrinsics.f(impressionId, "impressionId");
        Intrinsics.f(creativeId, "creativeId");
        Intrinsics.f(onLpLifecycleEvent, "onLpLifecycleEvent");
        this.f23649b = j;
        this.f23650c = placementType;
        this.d = impressionId;
        this.f23651e = creativeId;
        this.f = onLpLifecycleEvent;
        this.g = interfaceC3333z5;
        this.f23653i = "h4";
        LinkedHashMap linkedHashMap = O2.f23027a;
        this.j = ((AdConfig) AbstractC3174p5.a("ads", "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig", null)).getRendering();
        this.k = LazyKt.b(C2980d4.f23510a);
        setImportantForAccessibility(2);
        getSettings().setJavaScriptEnabled(true);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        C2963c4 c2963c4 = new C2963c4("IN_CUSTOM_EXPAND", new C2997e4(this), new C3013f4(this), new C3029g4(this), interfaceC3333z5);
        setWebViewClient(c2963c4);
        this.f23652h = c2963c4;
        if (getAdConfig().getEnableCookiesOnInAppBrowser()) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this, true);
        }
    }

    private final AdConfig getAdConfig() {
        return (AdConfig) this.k.getX();
    }

    @Override // com.inmobi.media.InterfaceC3323yb
    public final boolean a() {
        String TAG = this.f23653i;
        Intrinsics.e(TAG, "TAG");
        return g();
    }

    @Override // com.inmobi.media.InterfaceC3323yb
    public final boolean d() {
        String TAG = this.f23653i;
        Intrinsics.e(TAG, "TAG");
        return g();
    }

    @Override // com.inmobi.media.X1
    public final M6 f() {
        N6 n6 = new N6(true, "DEFAULT", getAdConfig().getCctEnabled(), false);
        Context context = getContext();
        InterfaceC3333z5 interfaceC3333z5 = this.g;
        Intrinsics.c(context);
        return new M6(context, n6, null, null, this, null, interfaceC3333z5);
    }

    public final boolean g() {
        return !this.j.getAutoRedirectionEnforcement() || ((getViewTouchTimestamp() > (-1L) ? 1 : (getViewTouchTimestamp() == (-1L) ? 0 : -1)) != 0 && ((SystemClock.elapsedRealtime() - getViewTouchTimestamp()) > this.j.getUserTouchResetTime() ? 1 : ((SystemClock.elapsedRealtime() - getViewTouchTimestamp()) == this.j.getUserTouchResetTime() ? 0 : -1)) < 0);
    }

    public final R6 getLandingPageTelemetryControlInfo() {
        return this.f23654l;
    }

    @Override // com.inmobi.media.InterfaceC3323yb
    public long getViewTouchTimestamp() {
        return this.f23649b;
    }

    @Override // android.webkit.WebView
    public final void loadData(String data, String str, String str2) {
        Intrinsics.f(data, "data");
        super.loadData(data, str, str2);
        C2963c4 c2963c4 = this.f23652h;
        if (c2963c4 != null) {
            c2963c4.d = true;
        }
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String url) {
        Intrinsics.f(url, "url");
        super.loadUrl(url);
        C2963c4 c2963c4 = this.f23652h;
        if (c2963c4 != null) {
            c2963c4.d = true;
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onScrollChanged(int i2, int i3, int i4, int i5) {
        if (!this.f23655n) {
            this.f23655n = true;
            X3 x3 = this.f;
            GestureDetectorOnGestureListenerC3005ec.Y0.getClass();
            x3.invoke(Gb.a("IN_CUSTOM_EXPAND", "onScroll"));
        }
        super.onScrollChanged(i2, i3, i4, i5);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        if (!this.m) {
            this.m = true;
            X3 x3 = this.f;
            GestureDetectorOnGestureListenerC3005ec.Y0.getClass();
            x3.invoke(Gb.a("IN_CUSTOM_EXPAND", "onInteraction"));
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setLandingPageTelemetryControlInfo(R6 r6) {
        this.f23654l = r6;
        C2963c4 c2963c4 = this.f23652h;
        if (c2963c4 == null) {
            return;
        }
        c2963c4.j = r6;
        c2963c4.k = new O6(r6, c2963c4);
    }

    public void setViewTouchTimestamp(long j) {
        this.f23649b = j;
    }

    @Override // com.inmobi.media.InterfaceC3323yb
    public final void a(String triggerApi) {
        Intrinsics.f(triggerApi, "triggerApi");
        HashMap map = new HashMap();
        map.put("creativeId", this.f23651e);
        map.put("trigger", triggerApi);
        map.put("impressionId", this.d);
        map.put("adType", this.f23650c);
        Pd pd = Pd.f23077a;
        Pd.b("BlockAutoRedirection", map, Td.SDK);
    }
}
