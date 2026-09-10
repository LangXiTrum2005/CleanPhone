package com.applovin.impl;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.adview.AppLovinFullscreenImmersiveActivity;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y1 implements AppLovinBroadcastManager.Receiver, com.applovin.impl.adview.a.b {
    protected int A;
    protected boolean B;
    private ContentObserver C;
    private Float D;
    protected AppLovinAdClickListener E;
    protected AppLovinAdDisplayListener F;
    protected AppLovinAdVideoPlaybackListener G;
    protected j7 H;
    protected j7 I;
    protected boolean J;
    private final j0 K;
    private boolean L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.ad.b f10021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final com.applovin.impl.sdk.l f10022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final com.applovin.impl.sdk.p f10023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Activity f10024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f10025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Handler f10026f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.b f10027g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.applovin.impl.sdk.j.a f10028h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AppLovinAdView f10029i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected com.applovin.impl.adview.k f10030j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final com.applovin.impl.adview.g f10031k;
    protected final com.applovin.impl.adview.g l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final long f10032m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f10033n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f10034o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f10035p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected long f10036q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected long f10037r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f10038s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f10039t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected int f10040u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected boolean f10041v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f10042w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final ArrayList f10043x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected int f10044y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected int f10045z;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements AppLovinAdDisplayListener {
        public a() {
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.p pVar = y1.this.f10023c;
            if (com.applovin.impl.sdk.p.a()) {
                y1.this.f10023c.a("AppLovinFullscreenActivity", "Web content rendered");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.p pVar = y1.this.f10023c;
            if (com.applovin.impl.sdk.p.a()) {
                y1.this.f10023c.a("AppLovinFullscreenActivity", "Closing from WebView");
            }
            y1.this.a("web_view");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements com.applovin.impl.sdk.j.a {
        public b() {
        }

        @Override // com.applovin.impl.sdk.j.a
        public void a(int i10) {
            y1 y1Var = y1.this;
            if (y1Var.A != com.applovin.impl.sdk.j.f9463h) {
                y1Var.B = true;
            }
            com.applovin.impl.adview.b bVarF = y1Var.f10029i.getController().f();
            if (bVarF == null) {
                com.applovin.impl.sdk.p pVar = y1.this.f10023c;
                if (com.applovin.impl.sdk.p.a()) {
                    y1.this.f10023c.k("AppLovinFullscreenActivity", "Unable to handle ringer mode change: no valid web view.");
                }
            } else if (com.applovin.impl.sdk.j.a(i10) && !com.applovin.impl.sdk.j.a(y1.this.A)) {
                bVarF.a("javascript:al_muteSwitchOn();");
            } else if (i10 == 2) {
                bVarF.a("javascript:al_muteSwitchOff();");
            }
            y1.this.A = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c extends com.applovin.impl.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.l f10048a;

        public c(com.applovin.impl.sdk.l lVar) {
            this.f10048a = lVar;
        }

        private boolean a(Activity activity) {
            return activity.getClass().getName().equals(q7.a(activity.getApplicationContext(), "AppLovinFullscreenActivity", this.f10048a));
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (!y1.this.z() && a(activity)) {
                y1.this.d();
            }
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (y1.this.z() && a(activity)) {
                y1.this.d();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.l f10050a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Handler handler, com.applovin.impl.sdk.l lVar) {
            super(handler);
            this.f10050a = lVar;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            Float fB = this.f10050a.q().b();
            if (fB == null || y1.this.D == null || fB.equals(y1.this.D)) {
                return;
            }
            String str = fB.floatValue() > y1.this.D.floatValue() ? "volume_up" : "volume_down";
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putDouble(jSONObject, "volume", fB.floatValue());
            y1.this.e("javascript:al_onVolumeChangedEvent('" + str + "'," + jSONObject + ");");
            y1.this.D = fB;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e extends com.applovin.impl.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u4 f10052a;

        public e(u4 u4Var) {
            this.f10052a = u4Var;
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (activity instanceof AppLovinFullscreenActivity) {
                this.f10052a.b(null);
                y1.this.f10022b.e().b(this);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface g {
        void a(y1 y1Var);

        void a(String str, Throwable th2);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class h implements AppLovinAdClickListener, View.OnClickListener {
        private h() {
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.p pVar = y1.this.f10023c;
            if (com.applovin.impl.sdk.p.a()) {
                y1.this.f10023c.a("AppLovinFullscreenActivity", "Clicking through graphic");
            }
            v2.a(y1.this.E, appLovinAd);
            y1.this.f10045z++;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            y1 y1Var = y1.this;
            if (view != y1Var.f10031k || !((Boolean) y1Var.f10022b.a(z4.f10108b2)).booleanValue()) {
                com.applovin.impl.sdk.p pVar = y1.this.f10023c;
                if (com.applovin.impl.sdk.p.a()) {
                    y1.this.f10023c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
                    return;
                }
                return;
            }
            y1.f(y1.this);
            if (y1.this.f10021a.K0()) {
                y1.this.e("javascript:al_onCloseButtonTapped(" + y1.this.f10042w + "," + y1.this.f10044y + "," + y1.this.f10045z + ");");
            }
            List listF = y1.this.f10021a.F();
            com.applovin.impl.sdk.p pVar2 = y1.this.f10023c;
            if (com.applovin.impl.sdk.p.a()) {
                y1.this.f10023c.a("AppLovinFullscreenActivity", "Handling close button tap " + y1.this.f10042w + " with multi close delay: " + listF);
            }
            if (listF == null || listF.size() <= y1.this.f10042w) {
                y1.this.a("native_close_button");
                return;
            }
            y1.this.f10043x.add(Long.valueOf(SystemClock.elapsedRealtime() - y1.this.f10036q));
            List listD = y1.this.f10021a.D();
            if (listD != null && listD.size() > y1.this.f10042w) {
                y1 y1Var2 = y1.this;
                y1Var2.f10031k.a((com.applovin.impl.adview.e.a) listD.get(y1Var2.f10042w));
            }
            com.applovin.impl.sdk.p pVar3 = y1.this.f10023c;
            if (com.applovin.impl.sdk.p.a()) {
                y1.this.f10023c.a("AppLovinFullscreenActivity", "Scheduling next close button with delay: " + listF.get(y1.this.f10042w));
            }
            y1.this.f10031k.setVisibility(8);
            y1 y1Var3 = y1.this;
            y1Var3.a(y1Var3.f10031k, ((Integer) listF.get(y1Var3.f10042w)).intValue(), new u9(this, 3));
        }

        public /* synthetic */ h(y1 y1Var, a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            y1.this.f10036q = SystemClock.elapsedRealtime();
        }
    }

    public y1(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.l lVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f10026f = handler;
        this.f10032m = SystemClock.elapsedRealtime();
        this.f10033n = new AtomicBoolean();
        this.f10034o = new AtomicBoolean();
        this.f10036q = -1L;
        this.f10042w = 0;
        this.f10043x = new ArrayList();
        this.f10044y = 0;
        this.f10045z = 0;
        this.A = com.applovin.impl.sdk.j.f9463h;
        this.L = false;
        this.f10021a = bVar;
        this.f10022b = lVar;
        this.f10023c = lVar.Q();
        this.f10024d = activity;
        this.f10025e = bVar.R();
        this.E = appLovinAdClickListener;
        this.F = appLovinAdDisplayListener;
        this.G = appLovinAdVideoPlaybackListener;
        this.K = new j0(lVar);
        h hVar = new h(this, null);
        if (((Boolean) lVar.a(z4.r2)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
        }
        if (((Boolean) lVar.a(z4.f10281x2)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.al_onPoststitialShow_evaluation_error"));
        }
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_shown"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_hidden"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_failure"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_success"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_failure"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_success"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_failure"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_success"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_failure"));
        w1 w1Var = new w1(lVar.A0(), AppLovinAdSize.INTERSTITIAL, activity);
        this.f10029i = w1Var;
        w1Var.setAdClickListener(hVar);
        this.f10029i.setAdDisplayListener(new a());
        bVar.h().putString("ad_view_address", g8.a(this.f10029i));
        this.f10029i.getController().a(this);
        e2 e2Var = new e2(map, lVar);
        if (e2Var.c()) {
            this.f10030j = new com.applovin.impl.adview.k(e2Var, activity);
        }
        lVar.l().trackImpression(bVar);
        List listF = bVar.F();
        if (bVar.r() >= 0 || listF != null) {
            com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.p(), activity);
            this.f10031k = gVar;
            gVar.setVisibility(8);
            gVar.setOnClickListener(hVar);
        } else {
            this.f10031k = null;
        }
        com.applovin.impl.adview.g gVar2 = new com.applovin.impl.adview.g(com.applovin.impl.adview.e.a.WHITE_ON_TRANSPARENT, activity);
        this.l = gVar2;
        gVar2.setOnClickListener(new c9(this, 2));
        if (bVar.R0()) {
            this.f10028h = new b();
        } else {
            this.f10028h = null;
        }
        this.f10027g = new c(lVar);
        if (bVar.N0()) {
            this.D = lVar.q().b();
            this.C = new d(handler, lVar);
            activity.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI.buildUpon().appendPath("volume_music_speaker").build(), false, this.C);
        }
    }

    private void B() {
        if (this.f10028h != null) {
            this.f10022b.q().a(this.f10028h);
        }
        if (this.f10027g != null) {
            this.f10022b.e().a(this.f10027g);
        }
    }

    public static /* synthetic */ int f(y1 y1Var) {
        int i10 = y1Var.f10042w;
        y1Var.f10042w = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean z() {
        return a() >= 0;
    }

    public abstract void A();

    public abstract void a(ViewGroup viewGroup);

    public abstract void b(long j10);

    public abstract void m();

    public void o() {
        j7 j7Var = this.H;
        if (j7Var != null) {
            j7Var.e();
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        switch (action) {
            case "com.applovin.al_onPoststitialShow_evaluation_error":
                e();
                break;
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
            case "com.applovin.render_process_gone":
                if (!this.f10039t) {
                    f();
                    break;
                }
                break;
            case "com.applovin.preload_success":
            case "com.applovin.preload_failure":
                d(action, map);
                break;
        }
    }

    public void p() {
        com.applovin.impl.adview.b bVarF;
        if (this.f10029i == null || !this.f10021a.r0() || (bVarF = this.f10029i.getController().f()) == null) {
            return;
        }
        this.K.a(bVarF, new f());
    }

    public void q() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f10023c.d("AppLovinFullscreenActivity", "onBackPressed()");
        }
        if (this.L) {
            a("back_button");
        }
        if (this.f10021a.K0()) {
            e("javascript:onBackPressed();");
        }
    }

    public void r() {
        AppLovinAdView appLovinAdView = this.f10029i;
        if (appLovinAdView != null) {
            ViewParent parent = appLovinAdView.getParent();
            this.f10029i.destroy();
            this.f10029i = null;
            if ((parent instanceof ViewGroup) && i()) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        m();
        l();
        this.E = null;
        this.F = null;
        this.G = null;
        this.f10024d = null;
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    public void s() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f10023c.d("AppLovinFullscreenActivity", "onPause()");
        }
        d("javascript:al_onAppPaused();");
        n();
    }

    public void t() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f10023c.d("AppLovinFullscreenActivity", "onResume()");
        }
        d("javascript:al_onAppResumed();");
        o();
    }

    public void u() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f10023c.d("AppLovinFullscreenActivity", "onStop()");
        }
    }

    public abstract void v();

    public abstract void w();

    public void x() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f10023c.d("AppLovinFullscreenActivity", "Setting ad fully watched");
        }
        this.J = true;
    }

    public boolean y() {
        return this.f10035p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        com.applovin.impl.sdk.p.h("AppLovinFullscreenActivity", "Dismissing on-screen ad due to " + str);
        try {
            a(str);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.p.c("AppLovinFullscreenActivity", "Failed to dismiss ad.", th2);
            try {
                l();
            } catch (Throwable unused) {
            }
        }
    }

    private void f(String str) {
        if (this.f10034o.get()) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new na(this, str, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        if (this.f10021a.R() <= this.f10025e && !com.applovin.impl.d.d(this.f10024d)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f10023c.d("AppLovinFullscreenActivity", "Ad reshow timed out. Will attempt to bring existing ad activity to front.");
            }
            this.f10035p = false;
            long jC = this.f10021a.c();
            if (jC > 0) {
                a(jC).a(u4.f9831i, new t8(this, 7));
            } else {
                f("app_relaunch_reshow_timed_out");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        if (this.f10021a.x0().getAndSet(true)) {
            return;
        }
        this.f10022b.s0().a((k5) new p6(this.f10021a, this.f10022b), f6.b.OTHER);
    }

    public void e(String str) {
        a(str, 0L);
    }

    public boolean g() {
        return this.f10038s;
    }

    public boolean h() {
        return AppLovinAdType.INCENTIVIZED == this.f10021a.getType();
    }

    public boolean i() {
        return this.f10024d instanceof AppLovinFullscreenActivity;
    }

    public void l() {
        if (!this.f10035p && this.f10034o.compareAndSet(false, true)) {
            v2.b(this.F, this.f10021a);
            this.f10022b.J().b(this.f10021a);
            HashMap map = new HashMap();
            com.applovin.impl.sdk.ad.b bVar = this.f10021a;
            if (bVar != null) {
                CollectionUtils.putStringIfValid("source", bVar.v(), map);
                CollectionUtils.putStringIfValid("details", h2.b(this.f10021a), map);
            }
            this.f10022b.g().a(f2.H, this.f10021a, map);
        }
    }

    public void n() {
        j7 j7Var = this.H;
        if (j7Var != null) {
            j7Var.d();
        }
    }

    public AppLovinAdView b() {
        return this.f10029i;
    }

    public void d(boolean z10) {
        this.f10035p = z10;
    }

    public void e() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f10023c.d("AppLovinFullscreenActivity", "Handling al_onPoststitialShow evaluation error");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class f implements j0.c {
        public f() {
        }

        @Override // com.applovin.impl.j0.c
        public void a(int i10, int i11) {
            Map mapA = h2.a((AppLovinAdImpl) y1.this.f10021a);
            mapA.putAll(h2.a(y1.this.f10021a));
            mapA.put("details", "detection_count=" + i10 + ",total_checks=" + i11);
            y1.this.f10022b.E().d(f2.S0, mapA);
        }

        @Override // com.applovin.impl.j0.c
        public void a(int i10, int i11, int i12) {
            Map mapA = h2.a((AppLovinAdImpl) y1.this.f10021a);
            mapA.putAll(h2.a(y1.this.f10021a));
            mapA.put("details", "detections_to_report=" + i10 + ",detection_count=" + i11 + ",total_checks=" + i12);
            y1.this.f10022b.E().d(f2.T0, mapA);
            if (((Boolean) y1.this.f10022b.a(z4.f10285x6)).booleanValue()) {
                y1.this.x();
            }
            if (((Boolean) y1.this.f10022b.a(z4.Q0)).booleanValue()) {
                y1.this.f10022b.I().c(y1.this.f10021a, com.applovin.impl.sdk.l.p());
            }
            if (((Boolean) y1.this.f10022b.a(z4.f10257t6)).booleanValue()) {
                y1.this.a("black_view_auto_dismiss");
                return;
            }
            y1 y1Var = y1.this;
            y1Var.L = ((Boolean) y1Var.f10022b.a(z4.u6)).booleanValue();
            if (((Boolean) y1.this.f10022b.a(z4.f10271v6)).booleanValue()) {
                y1.this.A();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (z()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f10023c.d("AppLovinFullscreenActivity", "App relaunch detected with launcher activity. Will attempt to re-show the ad");
            }
            this.f10035p = true;
            long jF = this.f10021a.f();
            if (jF < 0) {
                return;
            }
            a(new pa(this, 0), jF);
            return;
        }
        f("app_relaunch");
    }

    public void b(boolean z10) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f10023c.d("AppLovinFullscreenActivity", "onWindowFocusChanged(boolean) - " + z10);
        }
        d("javascript:al_onWindowFocusChanged( " + z10 + " );");
        j7 j7Var = this.I;
        if (j7Var != null) {
            if (z10) {
                j7Var.e();
            } else {
                j7Var.d();
            }
        }
    }

    public void f() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f10023c.d("AppLovinFullscreenActivity", "Handling render process crash");
        }
        this.f10039t = true;
    }

    public static void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, Map map, com.applovin.impl.sdk.l lVar, Activity activity, g gVar) {
        y1 b2Var;
        if (bVar instanceof r7) {
            try {
                b2Var = new b2(bVar, activity, map, lVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th2) {
                gVar.a("Failed to create FullscreenVastVideoAdPresenter with sdk: " + lVar + " and throwable: " + th2.getMessage(), th2);
                return;
            }
        } else if (bVar.hasVideoUrl()) {
            try {
                b2Var = new c2(bVar, activity, map, lVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th3) {
                gVar.a("Failed to create FullscreenVideoAdPresenter with sdk: " + lVar + " and throwable: " + th3.getMessage(), th3);
                return;
            }
        } else {
            try {
                b2Var = new z1(bVar, activity, map, lVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th4) {
                gVar.a("Failed to create FullscreenGraphicAdPresenter with sdk: " + lVar + " and throwable: " + th4.getMessage(), th4);
                return;
            }
        }
        b2Var.B();
        gVar.a(b2Var);
    }

    public void c(boolean z10) {
        a(z10, ((Long) this.f10022b.a(z4.f10233q2)).longValue());
        if (!this.f10021a.q0()) {
            v2.a(this.F, this.f10021a);
        }
        this.f10022b.J().a(this.f10021a);
        if (!this.f10021a.q0() && (this.f10021a.hasVideoUrl() || h())) {
            v2.a(this.G, this.f10021a);
        }
        new p4(this.f10024d).a(this.f10021a);
        this.f10021a.setHasShown(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        com.applovin.impl.adview.b bVarF;
        AppLovinAdView appLovinAdView = this.f10029i;
        if (appLovinAdView == null || (bVarF = appLovinAdView.getController().f()) == null) {
            return;
        }
        bVarF.a(str);
    }

    public void d(String str) {
        if (this.f10021a.t0()) {
            a(str, 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(com.applovin.impl.adview.g gVar, Runnable runnable) {
        g8.a(gVar, 400L, new oa(gVar, runnable, 1));
    }

    private void d(String str, Map map) {
        e(p8.d(str, map));
    }

    private void b(String str, Map map) {
        e(p8.b(str, map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a("backup_close_button");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(com.applovin.impl.adview.g gVar, Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new oa(gVar, runnable, 0));
    }

    public long a() {
        com.applovin.impl.sdk.ad.b bVar = this.f10021a;
        if (bVar == null) {
            return -1L;
        }
        return bVar.g();
    }

    public int c() {
        int iT = this.f10021a.t();
        return (iT <= 0 && ((Boolean) this.f10022b.a(z4.f10224p2)).booleanValue()) ? this.f10040u + 1 : iT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z10, Void r2, Void r3) {
        if (z10) {
            return;
        }
        f("app_relaunch_bring_to_front_failed");
    }

    private u4 a(long j10) {
        u4 u4Var = new u4("bringAdActivityToFront");
        e eVar = new e(u4Var);
        this.f10022b.e().a(eVar);
        Intent intent = new Intent(this.f10024d, (Class<?>) (this.f10021a.H0() ? AppLovinFullscreenImmersiveActivity.class : AppLovinFullscreenActivity.class));
        intent.setFlags(131072);
        this.f10024d.startActivity(intent);
        a(new androidx.fragment.app.d(this, eVar, u4Var, 27), j10);
        return u4Var;
    }

    public void c(long j10) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f10023c.a("AppLovinFullscreenActivity", "Scheduling report reward in " + TimeUnit.MILLISECONDS.toSeconds(j10) + " seconds...");
        }
        this.H = j7.a(j10, this.f10022b, new pa(this, 1));
    }

    private void c(String str, Map map) {
        e(p8.c(str, map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.b bVar, u4 u4Var) {
        this.f10022b.e().b(bVar);
        if (u4Var.d()) {
            return;
        }
        u4Var.a((Object) null);
    }

    public boolean a(boolean z10) {
        List listA = q7.a(z10, this.f10021a, this.f10022b, this.f10024d);
        if (listA.isEmpty()) {
            return false;
        }
        if (((Boolean) this.f10022b.a(z4.X0)).booleanValue() && !q7.a(listA, this.f10021a)) {
            a(listA, (com.applovin.impl.sdk.ad.a) this.f10021a);
            return false;
        }
        String str = "Missing ad resources: " + listA;
        Map mapA = h2.a((AppLovinAdImpl) this.f10021a);
        if (((Boolean) this.f10022b.a(z4.Z5)).booleanValue()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f10023c.b("AppLovinFullscreenActivity", "Dismissing ad due to missing resources: " + listA);
            }
            if (((Boolean) this.f10022b.a(z4.f10119c6)).booleanValue()) {
                AppLovinAdDisplayListener appLovinAdDisplayListener = this.F;
                if (appLovinAdDisplayListener instanceof n2) {
                    v2.a(appLovinAdDisplayListener, "Missing ad resources");
                }
            } else {
                p2.a(this.f10021a, this.F, "Missing ad resources", (Throwable) null, (AppLovinFullscreenActivity) null);
            }
            a("missing_ad_resources");
            a(str, "Failing ad display", mapA);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "missingCachedAdResources");
            CollectionUtils.putStringIfValid("error_message", str, mapHashMap);
            this.f10022b.g().a(f2.G, this.f10021a, mapHashMap);
            return ((Boolean) this.f10022b.a(z4.f10112b6)).booleanValue();
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f10023c.b("AppLovinFullscreenActivity", "Streaming ad due to missing ad resources: " + listA);
        }
        this.f10021a.C0();
        a(str, "Streaming ad", mapA);
        return false;
    }

    private void a(List list, com.applovin.impl.sdk.ad.a aVar) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f10023c.a("AppLovinFullscreenActivity", "Restoring original URLs for missing non-required cached resources: " + list);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        aVar.b(list);
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        CollectionUtils.putStringIfValid("details", list.toString(), mapHashMap);
        this.f10022b.g().a(f2.L, aVar, mapHashMap);
    }

    public void a(p0.a aVar, p0.a aVar2, p0.a aVar3) {
        if (((Boolean) this.f10022b.a(z4.J4)).booleanValue()) {
            HashMap map = new HashMap();
            map.put("orientation", q7.b(this.f10024d));
            if (aVar != null) {
                map.put("display_cutout_insets", aVar.e());
            }
            if (aVar2 != null) {
                map.put("status_bar_insets", aVar2.e());
            }
            if (aVar3 != null) {
                map.put("nav_bar_insets", aVar3.e());
            }
            e(p8.a(map));
        }
    }

    public void a(String str) {
        this.f10038s = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f10032m;
        if (com.applovin.impl.sdk.p.a()) {
            this.f10023c.d("AppLovinFullscreenActivity", "Dismissing ad after " + TimeUnit.MILLISECONDS.toSeconds(jElapsedRealtime) + " seconds from source: " + str);
        }
        com.applovin.impl.sdk.ad.b bVar = this.f10021a;
        if (bVar != null) {
            bVar.getAdEventTracker().f();
        }
        this.f10026f.removeCallbacksAndMessages(null);
        com.applovin.impl.sdk.ad.b bVar2 = this.f10021a;
        a("javascript:al_onPoststitialDismiss();", bVar2 != null ? bVar2.w() : 0L);
        if (((Boolean) this.f10022b.a(z4.T6)).booleanValue()) {
            com.applovin.impl.sdk.ad.b bVar3 = this.f10021a;
            if (bVar3 != null) {
                bVar3.a(str);
            }
            m();
        }
        l();
        this.K.b();
        if (this.f10028h != null) {
            this.f10022b.q().b(this.f10028h);
        }
        if (this.f10027g != null) {
            this.f10022b.e().b(this.f10027g);
        }
        if (this.C != null) {
            this.f10024d.getContentResolver().unregisterContentObserver(this.C);
            this.C = null;
        }
        if (i()) {
            this.f10024d.finish();
            return;
        }
        this.f10022b.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f10022b.Q().a("AppLovinFullscreenActivity", "Fullscreen ad shown in container view dismissed, destroying the presenter.");
        }
        r();
    }

    public void a(Configuration configuration) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f10023c.d("AppLovinFullscreenActivity", "onConfigurationChanged(Configuration) -  " + configuration);
        }
    }

    public void a(int i10, KeyEvent keyEvent) {
        if (this.f10023c == null || !com.applovin.impl.sdk.p.a()) {
            return;
        }
        this.f10023c.d("AppLovinFullscreenActivity", "onKeyDown(int, KeyEvent) -  " + i10 + ", " + keyEvent);
    }

    public void a(String str, long j10) {
        if (j10 < 0 || !StringUtils.isValidString(str)) {
            return;
        }
        a(new na(this, str, 0), j10);
    }

    public void a(com.applovin.impl.adview.g gVar, long j10, Runnable runnable) {
        if (j10 >= ((Long) this.f10022b.a(z4.f10100a2)).longValue()) {
            return;
        }
        this.I = j7.a(TimeUnit.SECONDS.toMillis(j10), this.f10022b, new oa(gVar, runnable, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.adview.g gVar, Runnable runnable) {
        gVar.bringToFront();
        runnable.run();
    }

    public void a(int i10, boolean z10, boolean z11, long j10) {
        if (!this.f10035p && this.f10033n.compareAndSet(false, true)) {
            if (this.f10021a.hasVideoUrl() || h()) {
                v2.a(this.G, this.f10021a, i10, z11);
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f10032m;
            this.f10022b.l().trackVideoEnd(this.f10021a, TimeUnit.MILLISECONDS.toSeconds(jElapsedRealtime), i10, z10);
            long jElapsedRealtime2 = this.f10036q != -1 ? SystemClock.elapsedRealtime() - this.f10036q : -1L;
            this.f10022b.l().trackFullScreenAdClosed(this.f10021a, jElapsedRealtime2, this.f10043x, j10, this.B, this.A);
            if (com.applovin.impl.sdk.p.a()) {
                com.applovin.impl.sdk.p pVar = this.f10023c;
                StringBuilder sb2 = new StringBuilder("Video ad ended at percent: ");
                sb2.append(i10);
                sb2.append("%, elapsedTime: ");
                sb2.append(jElapsedRealtime);
                q4.a.r(sb2, "ms, skipTimeMillis: ", j10, "ms, closeTimeMillis: ");
                pVar.a("AppLovinFullscreenActivity", defpackage.e.r(sb2, jElapsedRealtime2, "ms"));
            }
        }
    }

    private void a(String str, String str2, Map map) {
        HashMap map2 = new HashMap(map);
        CollectionUtils.putStringIfValid("error_message", str, map2);
        CollectionUtils.putStringIfValid("details", str2, map2);
        this.f10022b.E().a(f2.U0, "missingCachedAdResources", map2);
    }

    @Override // com.applovin.impl.adview.a.b
    public void a(com.applovin.impl.adview.a aVar) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f10023c.a("AppLovinFullscreenActivity", "Fully watched from ad web view...");
        }
        this.J = true;
    }

    public void a(boolean z10, long j10) {
        if (this.f10021a.F0()) {
            a(z10 ? "javascript:al_mute();" : "javascript:al_unmute();", j10);
        }
    }

    private void a(String str, Map map) {
        e(p8.a(str, map));
    }

    public void a(Runnable runnable, long j10) {
        AppLovinSdkUtils.runOnUiThreadDelayed(runnable, j10, this.f10026f);
    }
}
