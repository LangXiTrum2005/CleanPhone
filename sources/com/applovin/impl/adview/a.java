package com.applovin.impl.adview;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.b5;
import com.applovin.impl.e2;
import com.applovin.impl.f2;
import com.applovin.impl.f6;
import com.applovin.impl.g8;
import com.applovin.impl.h2;
import com.applovin.impl.h4;
import com.applovin.impl.j4;
import com.applovin.impl.n2;
import com.applovin.impl.o1;
import com.applovin.impl.p8;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u6;
import com.applovin.impl.v2;
import com.applovin.impl.v4;
import com.applovin.impl.x2;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class a implements AppLovinCommunicatorSubscriber, AppLovinBroadcastManager.Receiver {
    private volatile AppLovinAdLoadListener A;
    private volatile AppLovinAdDisplayListener B;
    private volatile AppLovinAdViewEventListener C;
    private volatile AppLovinAdClickListener D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f7421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewGroup f7422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.applovin.impl.sdk.l f7423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AppLovinAdServiceImpl f7424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.applovin.impl.sdk.p f7425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AppLovinCommunicator f7426f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f7427g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AppLovinAdSize f7429i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f7430j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private u.l f7431k;
    private com.applovin.impl.adview.c l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private e f7432m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.applovin.impl.adview.b f7433n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private WebView f7434o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private k f7435p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Runnable f7436q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Runnable f7437r;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f7428h = defpackage.e.w();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile com.applovin.impl.sdk.ad.b f7438s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile AppLovinAd f7439t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private f f7440u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private f f7441v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final AtomicReference f7442w = new AtomicReference();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final AtomicBoolean f7443x = new AtomicBoolean();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private volatile boolean f7444y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private volatile boolean f7445z = false;

    /* JADX INFO: renamed from: com.applovin.impl.adview.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class C0000a extends v4 {
        public C0000a() {
        }

        @Override // com.applovin.impl.v4
        public Map a() {
            return CollectionUtils.hashMap("name", "AdViewController:GAWebView");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface b {
        void a(a aVar);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f7433n != null) {
                a.this.f7433n.setVisibility(8);
            }
        }

        public /* synthetic */ c(a aVar, C0000a c0000a) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements Runnable {

        /* JADX INFO: renamed from: com.applovin.impl.adview.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class C0001a implements k.a {
            public C0001a() {
            }

            @Override // com.applovin.impl.adview.k.a
            public void a() {
                a.this.f7433n.addView(a.this.f7435p, new ViewGroup.LayoutParams(-1, -1));
            }

            @Override // com.applovin.impl.adview.k.a
            public void b() {
                com.applovin.impl.sdk.p unused = a.this.f7425e;
                if (com.applovin.impl.sdk.p.a()) {
                    a.this.f7425e.b("AppLovinAdView", "Watermark failed to render.");
                }
            }
        }

        private d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f7438s != null) {
                if (a.this.f7433n == null) {
                    com.applovin.impl.sdk.p.h("AppLovinAdView", "Unable to render advertisement for ad #" + a.this.f7438s.getAdIdNumber() + ". Please make sure you are not calling AppLovinAdView.destroy() prematurely.");
                    v2.a(a.this.C, a.this.f7438s, (AppLovinAdView) null, AppLovinAdViewDisplayErrorCode.WEBVIEW_NOT_FOUND);
                    HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "renderTask");
                    CollectionUtils.putStringIfValid("error_message", "Ad view failed to render due to null adView", mapHashMap);
                    a.this.f7423c.g().a(f2.G, a.this.f7438s, mapHashMap);
                    return;
                }
                a.this.v();
                com.applovin.impl.sdk.p unused = a.this.f7425e;
                if (com.applovin.impl.sdk.p.a()) {
                    a.this.f7425e.a("AppLovinAdView", "Rendering advertisement ad for #" + a.this.f7438s.getAdIdNumber() + "...");
                }
                a.b(a.this.f7433n, a.this.f7438s.getSize());
                if (a.this.f7435p != null) {
                    g8.c(a.this.f7435p);
                    a.this.f7435p = null;
                }
                e2 e2Var = new e2(a.this.f7428h, a.this.f7423c);
                if (e2Var.c()) {
                    a.this.f7435p = new k(e2Var, a.this.f7421a);
                    a.this.f7435p.a(new C0001a());
                }
                a.this.f7433n.setAdHtmlLoaded(false);
                a.this.f7433n.a(a.this.f7438s);
                if (a.this.f7438s.getSize() == AppLovinAdSize.INTERSTITIAL || a.this.f7445z) {
                    return;
                }
                a.this.f7438s.setHasShown(true);
            }
        }

        public /* synthetic */ d(a aVar, C0000a c0000a) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class e implements AppLovinAdLoadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f7450a;

        public e(a aVar, com.applovin.impl.sdk.l lVar) {
            if (aVar == null) {
                throw new IllegalArgumentException("No view specified");
            }
            if (lVar == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            this.f7450a = aVar;
        }

        private a a() {
            return this.f7450a;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            a aVarA = a();
            if (aVarA != null) {
                aVarA.b(appLovinAd);
            } else {
                com.applovin.impl.sdk.p.h("AppLovinAdView", "Ad view has been garbage collected by the time an ad was received");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i10) {
            a aVarA = a();
            if (aVarA != null) {
                aVarA.b(i10);
            }
        }
    }

    private void E() {
        if (this.f7425e != null && com.applovin.impl.sdk.p.a() && com.applovin.impl.sdk.p.a()) {
            this.f7425e.a("AppLovinAdView", "Destroying...");
        }
        p8.b(this.f7433n);
        this.f7433n = null;
        p8.b(this.f7434o);
        this.f7434o = null;
        this.f7431k = null;
        this.A = null;
        this.B = null;
        this.D = null;
        this.C = null;
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f7445z = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        com.applovin.impl.sdk.ad.b bVar = this.f7438s;
        x2 x2Var = new x2();
        x2Var.a().a(bVar).a(i());
        if (!q7.a(bVar.getSize())) {
            x2Var.a().a("Fullscreen Ad Properties").b(bVar);
        }
        x2Var.a(this.f7423c);
        x2Var.a();
        if (com.applovin.impl.sdk.p.a()) {
            this.f7425e.a("AppLovinAdView", x2Var.toString());
        }
    }

    private void x() {
        if (this.f7438s.L0()) {
            int iC = this.f7423c.q().c();
            if (com.applovin.impl.sdk.j.a(iC)) {
                this.f7433n.a("javascript:al_muteSwitchOn();");
            } else if (iC == 2) {
                this.f7433n.a("javascript:al_muteSwitchOff();");
            }
        }
    }

    private void y() {
        if (q7.a(this.f7429i)) {
            if (((Boolean) this.f7423c.a(z4.I1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
            if (((Boolean) this.f7423c.a(z4.J1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_shown"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_hidden"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_failure"));
            }
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_success"));
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_failure"));
            if (((Boolean) this.f7423c.a(z4.K1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_success"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_failure"));
            }
            if (((Boolean) this.f7423c.a(z4.L1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_success"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_failure"));
            }
        }
    }

    public void A() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f7425e.a("AppLovinAdView", "AdView fully watched...");
        }
        b bVar = this.f7427g;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public void B() {
        y();
        if (this.f7438s != null) {
            com.applovin.impl.g.a(this.f7433n, this.f7423c);
        }
        b("javascript:al_onAttachedToWindow();");
    }

    public void C() {
        if (this.f7444y) {
            if (this.f7438s == null || !this.f7438s.V0()) {
                v2.b(this.B, this.f7438s);
            }
            if (this.f7438s != null && this.f7438s.isOpenMeasurementEnabled() && q7.a(this.f7438s.getSize())) {
                this.f7438s.getAdEventTracker().f();
            }
            if (this.f7433n != null && this.f7440u != null) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f7425e.a("AppLovinAdView", "onDetachedFromWindowCalled with expanded ad present");
                }
                c();
            } else if (com.applovin.impl.sdk.p.a()) {
                this.f7425e.a("AppLovinAdView", "onDetachedFromWindowCalled without an expanded ad present");
            }
            b("javascript:al_onDetachedFromWindow();");
        }
    }

    public void D() {
        if (!this.f7444y || this.f7445z) {
            return;
        }
        this.f7445z = true;
    }

    public void F() {
        if (this.f7444y) {
            AppLovinAd appLovinAd = (AppLovinAd) this.f7442w.getAndSet(null);
            if (appLovinAd != null) {
                c(appLovinAd);
            }
            this.f7445z = false;
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "a";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("crash_applovin_ad_webview".equals(appLovinCommunicatorMessage.getTopic())) {
            a(new n(this, 4));
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        switch (action) {
            case "com.applovin.custom_intent_launch_failure":
            case "com.applovin.custom_intent_launch_success":
                a(action, map);
                break;
            case "com.applovin.external_redirect_success":
            case "com.applovin.external_redirect_failure":
                c(action, map);
                break;
            case "com.applovin.custom_tabs_failure":
            case "com.applovin.custom_tabs_hidden":
            case "com.applovin.custom_tabs_shown":
                b(action, map);
                break;
            case "com.applovin.application_paused":
                m();
                break;
            case "com.applovin.application_resumed":
                n();
                break;
            case "com.applovin.preload_success":
            case "com.applovin.preload_failure":
                d(action, map);
                break;
        }
    }

    public void w() {
        if ((this.f7421a instanceof o1) && this.f7438s != null && this.f7438s.K() == com.applovin.impl.sdk.ad.b.EnumC0016b.DISMISS) {
            ((o1) this.f7421a).dismiss("postitial_click");
        }
    }

    public void z() {
        if (this.f7440u != null || this.f7441v != null) {
            a();
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f7425e.a("AppLovinAdView", "Ad: " + this.f7438s + " closed.");
        }
        a(this.f7437r);
        v2.b(this.B, this.f7438s);
        this.f7438s = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(View view, AppLovinAdSize appLovinAdSize) {
        int iApplyDimension;
        if (view == null) {
            return;
        }
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        AppLovinAdSize appLovinAdSize2 = AppLovinAdSize.INTERSTITIAL;
        int iApplyDimension2 = -1;
        if (appLovinAdSize == appLovinAdSize2 || appLovinAdSize == AppLovinAdSize.BANNER) {
            iApplyDimension = -1;
        } else {
            iApplyDimension = appLovinAdSize.getWidth() == -1 ? displayMetrics.widthPixels : (int) TypedValue.applyDimension(1, appLovinAdSize.getWidth(), displayMetrics);
        }
        if (appLovinAdSize != appLovinAdSize2 && appLovinAdSize != AppLovinAdSize.BANNER) {
            iApplyDimension2 = appLovinAdSize.getHeight() == -1 ? displayMetrics.heightPixels : (int) TypedValue.applyDimension(1, appLovinAdSize.getHeight(), displayMetrics);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        layoutParams.width = iApplyDimension;
        layoutParams.height = iApplyDimension2;
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(13);
        }
        view.setLayoutParams(layoutParams);
    }

    private void c() {
        a(new n(this, 2));
    }

    private void m() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f7425e.a("AppLovinAdView", "handleApplicationPaused()");
        }
        b("javascript:al_onAppPaused();");
    }

    private void n() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f7425e.a("AppLovinAdView", "handleApplicationResumed()");
        }
        b("javascript:al_onAppResumed();");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        this.f7433n.loadDataWithBaseURL("/", "<html></html>", "text/html", null, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        com.applovin.impl.adview.b bVar;
        d();
        if (this.f7422b == null || (bVar = this.f7433n) == null || bVar.getParent() != null) {
            return;
        }
        this.f7422b.addView(this.f7433n);
        b(this.f7433n, this.f7438s.getSize());
        if (this.f7438s.isOpenMeasurementEnabled()) {
            this.f7438s.getAdEventTracker().a((View) this.f7433n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        if (this.f7433n != null && this.f7440u != null) {
            a();
        }
        E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        if (this.f7440u != null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f7425e.a("AppLovinAdView", "Detaching expanded ad: " + this.f7440u.b());
            }
            this.f7441v = this.f7440u;
            this.f7440u = null;
            a(this.f7429i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        com.applovin.impl.sdk.ad.a aVarB;
        f fVar = this.f7441v;
        if (fVar == null && this.f7440u == null) {
            return;
        }
        if (fVar != null) {
            aVarB = fVar.b();
            this.f7441v.dismiss();
            this.f7441v = null;
        } else {
            aVarB = this.f7440u.b();
            this.f7440u.dismiss();
            this.f7440u = null;
        }
        v2.a(this.C, aVarB, (AppLovinAdView) this.f7422b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        f().loadUrl("chrome://crash");
    }

    public AppLovinAdViewEventListener e() {
        return this.C;
    }

    public com.applovin.impl.adview.b f() {
        return this.f7433n;
    }

    public com.applovin.impl.sdk.ad.b g() {
        return this.f7438s;
    }

    public u.l h() {
        return this.f7431k;
    }

    public AppLovinAdView i() {
        return (AppLovinAdView) this.f7422b;
    }

    public com.applovin.impl.sdk.l j() {
        return this.f7423c;
    }

    public AppLovinAdSize k() {
        return this.f7429i;
    }

    public String l() {
        return this.f7430j;
    }

    public void u() {
        if (this.f7423c == null || this.f7432m == null || this.f7421a == null || !this.f7444y) {
            com.applovin.impl.sdk.p.i("AppLovinAdView", "Unable to load next ad: AppLovinAdView is not initialized.");
        } else {
            this.f7424d.loadNextAd(this.f7430j, this.f7429i, this.f7432m);
        }
    }

    private void d() {
        a(new n(this, 0));
    }

    public void c(int i10) {
        String strA = g8.a(i10);
        if (com.applovin.impl.sdk.p.a()) {
            this.f7425e.a("AppLovinAdView", "onWindowVisibilityChanged( " + strA + " )");
        }
        b(defpackage.e.o("javascript:al_onWindowVisibilityChanged( ", strA, " );"));
    }

    private void d(String str, Map map) {
        a(p8.d(str, map));
    }

    public void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.A = appLovinAdLoadListener;
    }

    public void a(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.B = appLovinAdDisplayListener;
    }

    public void a(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        this.C = appLovinAdViewEventListener;
    }

    public void a(AppLovinAdClickListener appLovinAdClickListener) {
        this.D = appLovinAdClickListener;
    }

    private void a(AppLovinAdView appLovinAdView, com.applovin.impl.sdk.l lVar, AppLovinAdSize appLovinAdSize, String str, Context context) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (appLovinAdSize != null) {
            this.f7423c = lVar;
            this.f7424d = lVar.l();
            this.f7425e = lVar.Q();
            this.f7426f = AppLovinCommunicator.getInstance(context);
            this.f7429i = appLovinAdSize;
            this.f7430j = str;
            if (!(context instanceof AppLovinFullscreenActivity)) {
                context = context.getApplicationContext();
            }
            this.f7421a = context;
            this.f7422b = appLovinAdView;
            this.l = new com.applovin.impl.adview.c(this, lVar);
            C0000a c0000a = null;
            this.f7437r = new c(this, c0000a);
            this.f7436q = new d(this, c0000a);
            this.f7432m = new e(this, lVar);
            a(appLovinAdSize);
            return;
        }
        throw new IllegalArgumentException("No ad size specified");
    }

    public void c(AppLovinAd appLovinAd) {
        a(appLovinAd, (String) null);
    }

    public void c(WebView webView) {
        a(webView, (String) null);
    }

    private void c(String str, Map map) {
        a(p8.c(str, map));
    }

    public void c(Uri uri) {
        if (this.f7438s != null && this.f7438s.u0() && this.f7434o == null) {
            String queryParameter = uri.getQueryParameter("tracking_id");
            if (TextUtils.isEmpty(queryParameter)) {
                this.f7423c.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f7423c.Q().b("AppLovinAdView", "Invalid tracking id. Cannot initialize GA");
                    return;
                }
                return;
            }
            WebView webView = new WebView(this.f7421a);
            this.f7434o = webView;
            webView.setWebViewClient(new C0000a());
            this.f7434o.getSettings().setJavaScriptEnabled(true);
            this.f7434o.loadDataWithBaseURL((String) this.f7423c.a(z4.f10213n7), "<html><head><link rel=\"icon\" href=\"data:,\"><G-SCRIPT_TAG></head><body></body></html>".replace("<G-SCRIPT_TAG>", "<script src='https://www.googletagmanager.com/gtag/js?id=<G-TRACKING_ID>'></script><script>window.dataLayer = window.dataLayer || [];function gtag(){dataLayer.push(arguments);}gtag('js', new Date());gtag('config', '<G-TRACKING_ID>')</script>".replace("<G-TRACKING_ID>", queryParameter)), "text/html", "UTF-8", null);
        }
    }

    public void b() {
        a(new n(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(WebView webView) {
        this.f7438s.getAdEventTracker().c(webView);
        k kVar = this.f7435p;
        if (kVar != null && kVar.a()) {
            h4 adEventTracker = this.f7438s.getAdEventTracker();
            k kVar2 = this.f7435p;
            adEventTracker.b(webView, Collections.singletonList(new j4(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier())));
        } else {
            this.f7438s.getAdEventTracker().a((View) webView);
        }
        this.f7438s.getAdEventTracker().h();
        this.f7438s.getAdEventTracker().g();
    }

    public void a(AppLovinAdSize appLovinAdSize) {
        try {
            com.applovin.impl.adview.b bVar = new com.applovin.impl.adview.b(this.l, this.f7423c, this.f7421a);
            this.f7433n = bVar;
            bVar.setBackgroundColor(0);
            this.f7433n.setWillNotCacheDrawing(false);
            this.f7422b.setBackgroundColor(0);
            this.f7422b.addView(this.f7433n);
            b(this.f7433n, appLovinAdSize);
            if (!this.f7444y) {
                a(this.f7437r);
            }
            a(new n(this, 5));
            this.f7444y = true;
        } catch (Throwable th2) {
            com.applovin.impl.sdk.p.c("AppLovinAdView", "Failed to initialize AdWebView", th2);
            this.f7423c.E().a("AppLovinAdView", "initAdWebView", th2);
            this.f7443x.set(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(MotionEvent motionEvent) {
        a aVar;
        if (this.f7440u == null && (this.f7438s instanceof com.applovin.impl.sdk.ad.a) && this.f7433n != null) {
            com.applovin.impl.sdk.ad.a aVar2 = (com.applovin.impl.sdk.ad.a) this.f7438s;
            Context context = this.f7421a;
            Activity activityB = context instanceof Activity ? (Activity) context : g8.b(this.f7433n, this.f7423c);
            if (activityB != null && !activityB.isFinishing()) {
                ViewGroup viewGroup = this.f7422b;
                if (viewGroup != null) {
                    viewGroup.removeView(this.f7433n);
                }
                f fVar = new f(aVar2, this.f7433n, activityB, this.f7423c);
                this.f7440u = fVar;
                fVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.adview.p
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        this.f7523a.a(dialogInterface);
                    }
                });
                this.f7440u.show();
                v2.c(this.C, this.f7438s, (AppLovinAdView) this.f7422b);
                if (this.f7438s.isOpenMeasurementEnabled()) {
                    this.f7438s.getAdEventTracker().a((View) this.f7440u.c());
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.p.h("AppLovinAdView", "Unable to expand ad. No Activity found.");
            Uri uriB1 = aVar2.b1();
            if (uriB1 != null) {
                aVar = this;
                this.f7424d.trackAndLaunchClick(aVar2, i(), aVar, uriB1, motionEvent);
            } else {
                aVar = this;
            }
            aVar.f7433n.a("javascript:al_onFailedExpand();");
        }
    }

    public void a(AppLovinAdView appLovinAdView, Context context, AppLovinAdSize appLovinAdSize, String str, AppLovinSdk appLovinSdk, AttributeSet attributeSet) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (context == null) {
            com.applovin.impl.sdk.p.h("AppLovinAdView", "Unable to build AppLovinAdView: no context provided. Please use a different constructor for this view.");
            return;
        }
        if (appLovinAdSize == null && (appLovinAdSize = com.applovin.impl.s.a(attributeSet)) == null) {
            appLovinAdSize = AppLovinAdSize.BANNER;
        }
        AppLovinAdSize appLovinAdSize2 = appLovinAdSize;
        if (appLovinSdk == null) {
            appLovinSdk = AppLovinSdk.getInstance(context);
        }
        if (appLovinSdk != null) {
            a(appLovinAdView, appLovinSdk.a(), appLovinAdSize2, str, context);
            if (com.applovin.impl.s.b(attributeSet)) {
                u();
            }
        }
    }

    public void b(AppLovinAd appLovinAd) {
        if (appLovinAd != null) {
            if (!this.f7445z) {
                c(appLovinAd);
            } else {
                this.f7442w.set(appLovinAd);
                if (com.applovin.impl.sdk.p.a()) {
                    this.f7425e.a("AppLovinAdView", "Ad view has paused when an ad was received, ad saved for later");
                }
            }
            a(new b2.o(8, this, appLovinAd));
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f7425e.b("AppLovinAdView", "No provided when to the view controller");
        }
        b(-1);
    }

    public void a(String str, Object obj) {
        this.f7428h.put(str, obj);
    }

    public void a(boolean z10) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f7425e.a("AppLovinAdView", "onWindowFocusChanged( " + z10 + " )");
        }
        b("javascript:al_onWindowFocusChanged( " + z10 + " );");
    }

    public void a(AppLovinAd appLovinAd, String str) {
        if (appLovinAd != null) {
            q7.b(appLovinAd, this.f7423c);
            if (this.f7444y) {
                if (appLovinAd.getSize() != AppLovinAdSize.INTERSTITIAL) {
                    Map mapA = h2.a((AppLovinAdImpl) appLovinAd);
                    CollectionUtils.putStringIfValid("source", "renderAd", mapA);
                    this.f7423c.g().d(f2.D, mapA);
                }
                com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) q7.a(appLovinAd, this.f7423c);
                if (bVar == null) {
                    com.applovin.impl.sdk.p.h("AppLovinAdView", "Unable to retrieve the loaded ad: " + appLovinAd);
                    v2.a(this.B, "Unable to retrieve the loaded ad");
                    Map mapA2 = h2.a((AppLovinAdImpl) appLovinAd);
                    CollectionUtils.putStringIfValid("source", "noAdToRender", mapA2);
                    CollectionUtils.putStringIfValid("error_message", "Unable to retrieve the loaded ad", mapA2);
                    this.f7423c.g().d(f2.G, mapA2);
                    return;
                }
                if (bVar == this.f7438s) {
                    com.applovin.impl.sdk.p.h("AppLovinAdView", "Attempting to show ad again: " + bVar);
                    if (((Boolean) this.f7423c.a(z4.M1)).booleanValue()) {
                        if (this.B instanceof n2) {
                            v2.a(this.B, "Attempting to show ad again");
                        } else if (!q7.c(this.f7423c)) {
                            this.f7423c.g().a(f2.f7836a1, bVar, CollectionUtils.hashMap("source", "attemptingAdReRender"));
                        } else {
                            throw new IllegalStateException("Attempting to show ad again");
                        }
                    }
                    HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "attemptingAdReRender");
                    CollectionUtils.putStringIfValid("error_message", "Attempting to show ad again", mapHashMap);
                    this.f7423c.g().a(f2.G, bVar, mapHashMap);
                    return;
                }
                if (com.applovin.impl.sdk.p.a()) {
                    this.f7425e.a("AppLovinAdView", "Rendering ad #" + bVar.getAdIdNumber() + " (" + bVar.getSize() + ")");
                }
                v2.b(this.B, this.f7438s);
                if (this.f7438s != null && this.f7438s.isOpenMeasurementEnabled()) {
                    this.f7438s.getAdEventTracker().f();
                }
                this.f7442w.set(null);
                this.f7439t = null;
                this.f7438s = bVar;
                if (this.f7438s.isCustomTabsEnabled()) {
                    this.f7431k = this.f7423c.A().a(this);
                    this.f7423c.A().b(this.f7438s.getCustomTabsWarmupUrls(), this.f7431k);
                }
                if (!this.f7445z && q7.a(this.f7429i)) {
                    this.f7423c.l().trackImpression(bVar);
                }
                if (this.f7440u != null) {
                    c();
                }
                a(this.f7436q);
                return;
            }
            com.applovin.impl.sdk.p.i("AppLovinAdView", "Unable to render ad: AppLovinAdView is not initialized.");
            return;
        }
        throw new IllegalArgumentException("No ad specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i10) {
        if (!this.f7445z) {
            a(this.f7437r);
        }
        a(new o(i10, 0, this));
    }

    private void b(String str) {
        if (((Boolean) this.f7423c.a(z4.I1)).booleanValue()) {
            a(str);
        }
    }

    private void b(String str, Map map) {
        a(p8.b(str, map));
    }

    public void b(Uri uri) {
        if (this.f7438s == null || !this.f7438s.u0()) {
            return;
        }
        if (this.f7434o == null) {
            this.f7423c.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f7423c.Q().a("AppLovinAdView", "GA is not initialized. Cannot fire GA event");
                return;
            }
            return;
        }
        String queryParameter = uri.getQueryParameter("event_name");
        String queryParameter2 = uri.getQueryParameter("event_params_json");
        if (TextUtils.isEmpty(queryParameter)) {
            this.f7423c.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f7423c.Q().a("AppLovinAdView", "Invalid GA event name. Cannot fire GA event");
                return;
            }
            return;
        }
        a(new androidx.fragment.app.d(this, queryParameter2, queryParameter, 6));
    }

    public void a(WebView webView, String str) {
        if (this.f7438s == null) {
            return;
        }
        a(new t(webView, 2));
        if (!((Boolean) this.f7423c.a(z4.C6)).booleanValue() || (str != null && str.startsWith(this.f7438s.k()))) {
            try {
                if (this.f7438s != this.f7439t) {
                    this.f7439t = this.f7438s;
                    x();
                    this.f7433n.setAdHtmlLoaded(true);
                    if (this.B != null) {
                        this.f7423c.z().d(this.f7438s);
                        if (this.f7438s.q0()) {
                            this.f7423c.g().a(f2.F, this.f7438s, CollectionUtils.hashMap("details", h2.b(this.f7438s)));
                        } else {
                            this.f7423c.g().a(f2.E, this.f7438s, CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - this.f7438s.z())));
                            v2.a(this.B, this.f7438s);
                        }
                        if (this.f7438s.M0()) {
                            String str2 = (String) this.f7423c.r0().a(b5.T, "");
                            JSONObject jSONObject = new JSONObject();
                            JsonUtils.putString(jSONObject, "template_browser_package_name", str2);
                            this.f7433n.a("javascript:al_onAdViewRendered(" + jSONObject + ");");
                        } else {
                            this.f7433n.a("javascript:al_onAdViewRendered();");
                        }
                        if (this.f7438s.q0()) {
                            this.f7433n.a("javascript:al_onAdRestored( '" + this.f7438s.X() + "' );");
                        }
                    }
                    if ((this.f7438s instanceof com.applovin.impl.sdk.ad.a) && this.f7438s.isOpenMeasurementEnabled()) {
                        this.f7423c.s0().a(new u6(this.f7423c, "StartOMSDK", new b2.o(7, this, webView)), f6.b.OTHER, 500L);
                    }
                }
            } catch (Throwable th2) {
                com.applovin.impl.sdk.p.c("AppLovinAdView", "Exception while notifying ad display listener", th2);
                com.applovin.impl.sdk.l lVar = this.f7423c;
                if (lVar != null) {
                    lVar.E().a("AppLovinAdView", "onAdHtmlLoaded", th2);
                }
            }
        }
    }

    public void a(MotionEvent motionEvent) {
        a(new b2.o(6, this, motionEvent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface) {
        a();
    }

    public void a() {
        a(new n(this, 1));
    }

    public void a(Uri uri) {
        Context context = this.f7421a;
        Activity activityB = context instanceof Activity ? (Activity) context : g8.b(this.f7433n, this.f7423c);
        if (activityB instanceof AppLovinFullscreenActivity) {
            AppLovinFullscreenActivity appLovinFullscreenActivity = (AppLovinFullscreenActivity) activityB;
            boolean booleanQueryParameter = uri.getBooleanQueryParameter("hide_status_bar", appLovinFullscreenActivity.isHidingStatusBar());
            boolean booleanQueryParameter2 = uri.getBooleanQueryParameter("hide_navigation_bar", appLovinFullscreenActivity.isHidingNavigationBar());
            appLovinFullscreenActivity.configureSystemUiBars(booleanQueryParameter, booleanQueryParameter2, uri.getBooleanQueryParameter("hide_no_bar", (booleanQueryParameter || booleanQueryParameter2) ? false : true), uri.getBooleanQueryParameter("allow_ad_rendering_within_display_cutout", appLovinFullscreenActivity.isAllowingAdRenderingWithinDisplayCutout()));
        }
    }

    public void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, Uri uri, MotionEvent motionEvent) {
        a aVar;
        com.applovin.impl.sdk.ad.b bVar2;
        if (appLovinAdView != null) {
            aVar = this;
            bVar2 = bVar;
            this.f7424d.trackAndLaunchClick(bVar2, appLovinAdView, aVar, uri, motionEvent);
        } else {
            aVar = this;
            bVar2 = bVar;
            if (com.applovin.impl.sdk.p.a()) {
                aVar.f7425e.b("AppLovinAdView", "Unable to process ad click - AppLovinAdView destroyed prematurely");
            }
        }
        v2.a(aVar.D, bVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinAd appLovinAd) {
        if (this.f7443x.compareAndSet(true, false)) {
            a(this.f7429i);
        }
        try {
            if (this.A != null) {
                this.A.adReceived(appLovinAd);
            }
        } catch (Throwable th2) {
            com.applovin.impl.sdk.p.h("AppLovinAdView", "Exception while running ad load callback: " + th2.getMessage());
            com.applovin.impl.sdk.l lVar = this.f7423c;
            if (lVar != null) {
                lVar.E().a("AppLovinAdView", "notifyAdLoadedCallback", th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i10) {
        try {
            if (this.A != null) {
                this.A.failedToReceiveAd(i10);
            }
        } catch (Throwable th2) {
            com.applovin.impl.sdk.p.c("AppLovinAdView", "Exception while running app load callback", th2);
            com.applovin.impl.sdk.l lVar = this.f7423c;
            if (lVar != null) {
                lVar.E().a("AppLovinAdView", "notifyAdLoadFailedCallback", th2);
            }
        }
    }

    private void a(Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(runnable);
    }

    public void a(b bVar) {
        this.f7427g = bVar;
    }

    private void a(String str, Map map) {
        a(p8.a(str, map));
    }

    private void a(String str) {
        if (this.f7438s == null || this.f7433n == null || !q7.a(this.f7438s.getSize()) || !StringUtils.isValidString(str)) {
            return;
        }
        this.f7433n.a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2) {
        String strO;
        if (StringUtils.isValidString(str)) {
            strO = l1.d.h("gtag('event', '", str2, "', ", str, ");");
        } else {
            strO = defpackage.e.o("gtag('event', '", str2, "')");
        }
        if (((Boolean) this.f7423c.a(z4.U2)).booleanValue()) {
            p8.a(this.f7434o, strO, this.f7423c);
        } else {
            p8.a(this.f7434o, strO);
        }
    }
}
