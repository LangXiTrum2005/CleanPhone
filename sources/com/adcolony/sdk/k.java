package com.adcolony.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.iab.omid.library.adcolony.Omid;
import com.iab.omid.library.adcolony.adsession.Partner;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p004ironsource.qt;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
class k {
    static String Z = "https://adc3-launch.adcolony.com/v4/launch";
    private static volatile String a0 = "";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f9191A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f9192B;
    private boolean C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f9193E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f9194F;
    private boolean G;
    private boolean H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f9195I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f9196J;
    private boolean K;
    private boolean L;
    private int M;
    private Application.ActivityLifecycleCallbacks O;
    private boolean T;
    private int X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private i0 f9204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.adcolony.sdk.t f9205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private t0 f9206c;
    private com.adcolony.sdk.d d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.adcolony.sdk.r f9207e;
    private com.adcolony.sdk.w f;
    private x0 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private v0 f9208h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private g0 f9209i;
    private com.adcolony.sdk.q j;
    private m0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.adcolony.sdk.c f9210l;
    private com.adcolony.sdk.z m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private AdColonyAdView f9211n;
    private AdColonyInterstitial o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AdColonyRewardListener f9212p;
    private AdColonyAppOptions r;
    private h0 s;
    private f1 t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f9214w;
    private String x;
    private String y;
    private HashMap<String, AdColonyCustomMessageListener> q = new HashMap<>();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private HashMap<String, AdColonyZone> f9213u = new HashMap<>();
    private HashMap<Integer, c1> v = new HashMap<>();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f9215z = "";
    private com.adcolony.sdk.f D = new com.adcolony.sdk.f();

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f9197N = 1;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private Partner f9198P = null;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private f1 f9199Q = new f1();

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private long f9200R = 500;
    private long S = 500;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private long f9201U = 20000;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private long f9202V = 300000;
    private long W = MBInterstitialActivity.WEB_LOAD_TIME;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private boolean f9203Y = false;

    public class a implements j0 {
        public a(k kVar) {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            f1 f1VarB = c0.b();
            c0.b(f1VarB, "crc32", z0.a(c0.h(h0Var.a(), "data")));
            h0Var.a(f1VarB).c();
        }
    }

    public class a0 implements j0 {
        public a0() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            k.this.a(true, true);
        }
    }

    public class b implements j0 {
        public b(k kVar) {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            int iD = c0.d(h0Var.a(), "number");
            f1 f1VarB = c0.b();
            c0.a(f1VarB, "uuids", z0.a(iD));
            h0Var.a(f1VarB).c();
        }
    }

    public class b0 implements j0 {
        public b0(k kVar) {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            f1 f1VarB = c0.b();
            c0.a(f1VarB, "sha1", z0.b(c0.h(h0Var.a(), "data")));
            h0Var.a(f1VarB).c();
        }
    }

    public class c implements j0 {

        public class a implements com.adcolony.sdk.y<String> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h0 f9218a;

            public a(h0 h0Var) {
                this.f9218a = h0Var;
            }

            @Override // com.adcolony.sdk.y
            public void a(String str) {
                f1 f1VarB = c0.b();
                c0.a(f1VarB, "advertiser_id", k.this.n().f());
                c0.b(f1VarB, "limit_ad_tracking", k.this.n().A());
                this.f9218a.a(f1VarB).c();
            }

            @Override // com.adcolony.sdk.y
            public void a(Throwable th) {
                new e0.a().a("Device.query_advertiser_info").a(" failed with error: ").a(Log.getStackTraceString(th)).a(e0.g);
            }
        }

        public c() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            k.this.n().a(com.adcolony.sdk.a.a(), new a(h0Var));
        }
    }

    public class d implements j0 {
        public d() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            s0 s0VarA = k.this.q().a();
            k.this.n().c(c0.h(h0Var.a(), "version"));
            if (s0VarA != null) {
                s0VarA.e(k.this.n().o());
            }
        }
    }

    public class e implements j0 {
        public e() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            k.this.f9199Q = c0.f(h0Var.a(), "signals");
        }
    }

    public class f implements j0 {

        public class a implements com.adcolony.sdk.x<com.adcolony.sdk.o.b> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h0 f9223a;

            public a(f fVar, h0 h0Var) {
                this.f9223a = h0Var;
            }

            @Override // com.adcolony.sdk.x
            public void a(com.adcolony.sdk.o.b bVar) {
                f1 f1VarB = c0.b();
                if (bVar != null) {
                    c0.a(f1VarB, "odt", bVar.b());
                }
                this.f9223a.a(f1VarB).c();
            }
        }

        public f() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (k.this.G()) {
                o0.c().a(new a(this, h0Var), k.this.g());
                return;
            }
            com.adcolony.sdk.o.b bVarB = o0.c().b();
            f1 f1VarB = c0.b();
            if (bVarB != null) {
                c0.a(f1VarB, "odt", bVarB.b());
            }
            h0Var.a(f1VarB).c();
        }
    }

    public class g implements j0 {
        public g(k kVar) {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            o0.c().a();
        }
    }

    public class h implements j0 {
        public h() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            k.this.m.a(h0Var);
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Context contextA = com.adcolony.sdk.a.a();
            if (!k.this.L && contextA != null) {
                try {
                    Omid.activate(contextA.getApplicationContext());
                    k.this.L = true;
                } catch (IllegalArgumentException unused) {
                    new e0.a().a("IllegalArgumentException when activating Omid").a(e0.f9132i);
                    k.this.L = false;
                }
            }
            if (k.this.L && k.this.f9198P == null) {
                try {
                    k.this.f9198P = Partner.createPartner("AdColony", "4.8.0");
                } catch (IllegalArgumentException unused2) {
                    new e0.a().a("IllegalArgumentException when creating Omid Partner").a(e0.f9132i);
                    k.this.L = false;
                }
            }
        }
    }

    public class j implements Runnable {

        public class a implements com.adcolony.sdk.s.a {
            public a() {
            }

            @Override // com.adcolony.sdk.s.a
            public void a(com.adcolony.sdk.s sVar, h0 h0Var, Map<String, List<String>> map) {
                k.this.a(sVar);
            }
        }

        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f1 f1VarB = c0.b();
            c0.a(f1VarB, "url", k.Z);
            c0.a(f1VarB, "content_type", "application/json");
            c0.a(f1VarB, "content", k.this.n().t().toString());
            c0.a(f1VarB, "url", k.Z);
            if (k.this.f9203Y) {
                f1 f1VarB2 = c0.b();
                c0.a(f1VarB2, "request", "la-req-01");
                c0.a(f1VarB2, qt.f26623n, "la-res-01");
                c0.a(f1VarB, "dictionaries_mapping", f1VarB2);
            }
            k.this.f9205b.a(new com.adcolony.sdk.s(new h0("WebServices.post", 0, f1VarB), new a()));
        }
    }

    /* JADX INFO: renamed from: com.adcolony.sdk.k$k, reason: collision with other inner class name */
    public class C0016k implements com.adcolony.sdk.v.c {
        public C0016k(k kVar) {
        }

        @Override // com.adcolony.sdk.v.c
        public void a() {
            o0.c().d();
        }
    }

    public class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f9228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0 f9229b;

        public l(Context context, h0 h0Var) {
            this.f9228a = context;
            this.f9229b = h0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.adcolony.sdk.j jVarA = com.adcolony.sdk.j.a(this.f9228a.getApplicationContext(), this.f9229b);
            k.this.v.put(Integer.valueOf(jVarA.getAdc3ModuleId()), jVarA);
        }
    }

    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.adcolony.sdk.a.b().x().f()) {
                k.this.K();
            }
        }
    }

    public class n implements com.adcolony.sdk.s.a {
        public n() {
        }

        @Override // com.adcolony.sdk.s.a
        public void a(com.adcolony.sdk.s sVar, h0 h0Var, Map<String, List<String>> map) {
            k.this.N();
        }
    }

    public class o implements Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.L();
        }
    }

    public class p implements AdColonyInterstitial.f {
        public p() {
        }

        @Override // com.adcolony.sdk.AdColonyInterstitial.f
        public void a() {
            k.this.b();
        }
    }

    public class q implements AdColonyAdView.c {
        public q() {
        }

        @Override // com.adcolony.sdk.AdColonyAdView.c
        public void a() {
            k.this.b();
        }
    }

    public class r implements com.adcolony.sdk.x<n0> {
        public r(k kVar) {
        }

        @Override // com.adcolony.sdk.x
        public void a(n0 n0Var) {
            o0.c().a(n0Var);
        }
    }

    public class s implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h0 f9236a;

        public s(h0 h0Var) {
            this.f9236a = h0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.f9212p.onReward(new AdColonyReward(this.f9236a));
        }
    }

    public class t implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set<Integer> f9238a = new HashSet();

        public t() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (!k.this.f9206c.f()) {
                k.this.f9206c.c(true);
            }
            com.adcolony.sdk.a.a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            com.adcolony.sdk.a.d = false;
            k.this.f9206c.d(false);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            ScheduledExecutorService scheduledExecutorService;
            this.f9238a.add(Integer.valueOf(activity.hashCode()));
            com.adcolony.sdk.a.d = true;
            com.adcolony.sdk.a.a(activity);
            s0 s0VarA = k.this.q().a();
            Context contextA = com.adcolony.sdk.a.a();
            if (contextA == null || !k.this.f9206c.e() || !(contextA instanceof com.adcolony.sdk.b) || ((com.adcolony.sdk.b) contextA).d) {
                com.adcolony.sdk.a.a(activity);
                if (k.this.s != null) {
                    if (!Objects.equals(c0.h(k.this.s.a(), "m_origin"), "")) {
                        k.this.s.a(k.this.s.a()).c();
                    }
                    k.this.s = null;
                }
                k.this.f9192B = false;
                k.this.f9206c.g(false);
                if (k.this.f9193E && !k.this.f9206c.f()) {
                    k.this.f9206c.c(true);
                }
                k.this.f9206c.d(true);
                k.this.f9207e.c();
                if (s0VarA == null || (scheduledExecutorService = s0VarA.f9362b) == null || scheduledExecutorService.isShutdown() || s0VarA.f9362b.isTerminated()) {
                    AdColony.a(activity, com.adcolony.sdk.a.b().r);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            k.this.f9206c.e(true);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            this.f9238a.remove(Integer.valueOf(activity.hashCode()));
            if (this.f9238a.isEmpty()) {
                k.this.f9206c.e(false);
            }
        }
    }

    public class u implements j0 {
        public u() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            k.this.c(h0Var);
        }
    }

    public class v implements j0 {
        public v() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            k.this.a(h0Var);
        }
    }

    public class w implements j0 {
        public w() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            s0 s0VarA = k.this.q().a();
            k.this.D.a(true);
            if (k.this.f9196J) {
                f1 f1VarB = c0.b();
                f1 f1VarB2 = c0.b();
                c0.a(f1VarB2, "app_version", z0.c());
                c0.a(f1VarB, "app_bundle_info", f1VarB2);
                new h0("AdColony.on_update", 1, f1VarB).c();
                k.this.f9196J = false;
            }
            if (k.this.K) {
                new h0("AdColony.on_install", 1).c();
            }
            f1 f1VarA = h0Var.a();
            if (s0VarA != null) {
                s0VarA.f(c0.h(f1VarA, "app_session_id"));
            }
            if (AdColonyEventTracker.a()) {
                AdColonyEventTracker.b();
            }
            Integer numI = f1VarA.i("base_download_threads");
            if (numI != null) {
                k.this.f9205b.a(numI.intValue());
            }
            Integer numI2 = f1VarA.i("concurrent_requests");
            if (numI2 != null) {
                k.this.f9205b.b(numI2.intValue());
            }
            Integer numI3 = f1VarA.i("threads_keep_alive_time");
            if (numI3 != null) {
                k.this.f9205b.c(numI3.intValue());
            }
            double dH = f1VarA.h("thread_pool_scaling_factor");
            if (!Double.isNaN(dH)) {
                k.this.f9205b.a(dH);
            }
            k.this.m.b();
            k.this.M();
        }
    }

    public class x implements j0 {
        public x() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            k.this.b(h0Var);
        }
    }

    public class y implements j0 {
        public y() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            k.this.e(h0Var);
        }
    }

    public class z implements j0 {
        public z() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            k.this.f(h0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        new Thread(new j()).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean L() {
        this.f9204a.a();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        f1 f1VarB = c0.b();
        c0.a(f1VarB, "type", "AdColony.on_configuration_completed");
        e1 e1Var = new e1();
        Iterator<String> it = C().keySet().iterator();
        while (it.hasNext()) {
            e1Var.b(it.next());
        }
        f1 f1VarB2 = c0.b();
        c0.a(f1VarB2, "zone_ids", e1Var);
        c0.a(f1VarB, PglCryptUtils.KEY_MESSAGE, f1VarB2);
        new h0("CustomMessage.controller_send", 0, f1VarB).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() {
        if (!a(this.x) && !com.adcolony.sdk.l.H) {
            new e0.a().a("Downloaded controller sha1 does not match, retrying.").a(e0.f);
            S();
            return;
        }
        if (!this.f9194F && !this.f9195I) {
            z0.b(new o());
        }
        if (this.f9194F && this.f9195I) {
            Q();
        }
    }

    private void O() {
        Context contextA = com.adcolony.sdk.a.a();
        if (contextA == null || this.O != null) {
            return;
        }
        this.O = new t();
        (contextA instanceof Application ? (Application) contextA : ((Activity) contextA).getApplication()).registerActivityLifecycleCallbacks(this.O);
    }

    private void S() {
        if (!com.adcolony.sdk.a.b().x().f()) {
            new e0.a().a("Max launch server download attempts hit, or AdColony is no longer").a(" active.").a(e0.g);
            return;
        }
        int i2 = this.M + 1;
        this.M = i2;
        this.f9197N = Math.min(this.f9197N * i2, 120);
        z0.a(new m(), ((long) this.f9197N) * 1000);
    }

    public x0 A() {
        if (this.g == null) {
            x0 x0Var = new x0();
            this.g = x0Var;
            x0Var.a();
        }
        return this.g;
    }

    public HashMap<Integer, c1> B() {
        return this.v;
    }

    public HashMap<String, AdColonyZone> C() {
        return this.f9213u;
    }

    public boolean D() {
        return this.r != null;
    }

    public boolean E() {
        return this.f9192B;
    }

    public boolean F() {
        return this.C;
    }

    public boolean G() {
        return this.T;
    }

    public boolean H() {
        return this.f9203Y;
    }

    public boolean I() {
        return this.D.a();
    }

    public boolean J() {
        return this.f9191A;
    }

    public void P() {
        this.D.a(false);
        this.d.b();
        Object option = this.r.getOption("force_ad_id");
        if ((option instanceof String) && !((String) option).isEmpty()) {
            R();
        }
        AdColony.a(com.adcolony.sdk.a.a(), this.r);
        T();
        this.f9213u.clear();
        this.f9204a.a();
    }

    public void Q() {
        this.X = 0;
        for (AdColonyInterstitial adColonyInterstitial : this.d.f().values()) {
            if (adColonyInterstitial.m()) {
                this.X++;
                adColonyInterstitial.a(new p());
            }
        }
        for (AdColonyAdView adColonyAdView : this.d.d().values()) {
            this.X++;
            adColonyAdView.setOnDestroyListenerOrCall(new q());
        }
        if (this.X == 0) {
            P();
        }
    }

    public void R() {
        synchronized (this.d.f()) {
            try {
                Iterator<AdColonyInterstitial> it = this.d.f().values().iterator();
                while (it.hasNext()) {
                    it.next().p();
                }
                this.d.f().clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void T() {
        a(1);
        Iterator<c1> it = this.v.values().iterator();
        while (it.hasNext()) {
            this.f9204a.b(it.next());
        }
        this.v.clear();
    }

    public AdColonyAppOptions u() {
        if (this.r == null) {
            this.r = new AdColonyAppOptions();
        }
        return this.r;
    }

    public String v() {
        return a0;
    }

    public AdColonyRewardListener w() {
        return this.f9212p;
    }

    public t0 x() {
        if (this.f9206c == null) {
            t0 t0Var = new t0();
            this.f9206c = t0Var;
            t0Var.d();
        }
        return this.f9206c;
    }

    public long y() {
        return this.f9200R;
    }

    public v0 z() {
        if (this.f9208h == null) {
            v0 v0Var = new v0();
            this.f9208h = v0Var;
            v0Var.e();
        }
        return this.f9208h;
    }

    public String f() {
        return this.f9215z;
    }

    public long g() {
        return this.S;
    }

    public long h() {
        return this.f9202V;
    }

    public long i() {
        return this.W;
    }

    public AdColonyInterstitial j() {
        return this.o;
    }

    public AdColonyAdView k() {
        return this.f9211n;
    }

    public com.adcolony.sdk.c l() {
        return this.f9210l;
    }

    public HashMap<String, AdColonyCustomMessageListener> m() {
        return this.q;
    }

    public com.adcolony.sdk.q n() {
        if (this.j == null) {
            com.adcolony.sdk.q qVar = new com.adcolony.sdk.q();
            this.j = qVar;
            qVar.M();
        }
        return this.j;
    }

    public com.adcolony.sdk.r o() {
        if (this.f9207e == null) {
            this.f9207e = new com.adcolony.sdk.r();
        }
        return this.f9207e;
    }

    public com.adcolony.sdk.w p() {
        if (this.f == null) {
            com.adcolony.sdk.w wVar = new com.adcolony.sdk.w();
            this.f = wVar;
            wVar.b();
        }
        return this.f;
    }

    public g0 q() {
        if (this.f9209i == null) {
            g0 g0Var = new g0();
            this.f9209i = g0Var;
            g0Var.c();
        }
        return this.f9209i;
    }

    public i0 r() {
        if (this.f9204a == null) {
            i0 i0Var = new i0();
            this.f9204a = i0Var;
            i0Var.a();
        }
        return this.f9204a;
    }

    public m0 s() {
        if (this.k == null) {
            this.k = new m0();
        }
        return this.k;
    }

    public Partner t() {
        return this.f9198P;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(h0 h0Var) {
        AdColonyZone adColonyZone;
        if (this.C) {
            return;
        }
        String strH = c0.h(h0Var.a(), "zone_id");
        if (this.f9213u.containsKey(strH)) {
            adColonyZone = this.f9213u.get(strH);
        } else {
            AdColonyZone adColonyZone2 = new AdColonyZone(strH);
            this.f9213u.put(strH, adColonyZone2);
            adColonyZone = adColonyZone2;
        }
        adColonyZone.a(h0Var);
    }

    public void d(h0 h0Var) {
        this.s = h0Var;
    }

    public boolean e(h0 h0Var) {
        if (this.f9212p == null) {
            return false;
        }
        z0.b(new s(h0Var));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(h0 h0Var) {
        Context contextA = com.adcolony.sdk.a.a();
        if (contextA == null) {
            return false;
        }
        try {
            int iJ = h0Var.a().j("id");
            if (iJ > 0) {
                a(iJ);
            }
            z0.b(new l(contextA, h0Var));
            return true;
        } catch (RuntimeException e2) {
            new e0.a().a(e2.toString() + ": during WebView initialization.").a(" Disabling AdColony.").a(e0.f9131h);
            AdColony.disable();
            return false;
        }
    }

    public void b(boolean z2) {
        this.D.a(false);
        this.C = z2;
    }

    public void d(boolean z2) {
        this.f9193E = z2;
    }

    public long d() {
        return this.f9201U;
    }

    public void e(boolean z2) {
        this.f9191A = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(h0 h0Var) {
        f1 f1VarB = this.r.b();
        c0.a(f1VarB, "app_id", this.r.a());
        f1 f1VarB2 = c0.b();
        c0.a(f1VarB2, "options", f1VarB);
        h0Var.a(f1VarB2).c();
    }

    public f1 e() {
        return this.f9199Q;
    }

    public void a(AdColonyAppOptions adColonyAppOptions, boolean z2) {
        this.C = z2;
        this.r = adColonyAppOptions;
        this.f9204a = new i0();
        new com.adcolony.sdk.m();
        com.adcolony.sdk.q qVar = new com.adcolony.sdk.q();
        this.j = qVar;
        qVar.M();
        com.adcolony.sdk.t tVar = new com.adcolony.sdk.t();
        this.f9205b = tVar;
        tVar.a();
        t0 t0Var = new t0();
        this.f9206c = t0Var;
        t0Var.d();
        com.adcolony.sdk.d dVar = new com.adcolony.sdk.d();
        this.d = dVar;
        dVar.h();
        this.f9207e = new com.adcolony.sdk.r();
        com.adcolony.sdk.w wVar = new com.adcolony.sdk.w();
        this.f = wVar;
        wVar.b();
        g0 g0Var = new g0();
        this.f9209i = g0Var;
        g0Var.c();
        v0 v0Var = new v0();
        this.f9208h = v0Var;
        v0Var.e();
        x0 x0Var = new x0();
        this.g = x0Var;
        x0Var.a();
        this.k = new m0();
        this.m = new com.adcolony.sdk.z();
        this.k.b();
        AdColony.a(com.adcolony.sdk.a.a(), adColonyAppOptions);
        if (!z2) {
            this.G = new File(android.support.v4.media.a.r(new StringBuilder(), this.f9208h.a(), "026ae9c9824b3e483fa6c71fa88f57ae27816141")).exists();
            boolean zExists = new File(android.support.v4.media.a.r(new StringBuilder(), this.f9208h.a(), "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5")).exists();
            this.H = zExists;
            this.f9194F = this.G && zExists && c0.h(c0.c(android.support.v4.media.a.r(new StringBuilder(), this.f9208h.a(), "026ae9c9824b3e483fa6c71fa88f57ae27816141")), "sdkVersion").equals(this.j.I());
            com.adcolony.sdk.v.a().a(new C0016k(this));
            if (this.G) {
                f1 f1VarC = c0.c(android.support.v4.media.a.r(new StringBuilder(), this.f9208h.a(), "026ae9c9824b3e483fa6c71fa88f57ae27816141"));
                this.t = f1VarC;
                b(f1VarC);
            }
            a(this.f9194F);
            O();
        }
        com.adcolony.sdk.a.a("Module.load", new u());
        com.adcolony.sdk.a.a("Module.unload", new v());
        com.adcolony.sdk.a.a("AdColony.on_configured", new w());
        com.adcolony.sdk.a.a("AdColony.get_app_info", new x());
        com.adcolony.sdk.a.a("AdColony.v4vc_reward", new y());
        com.adcolony.sdk.a.a("AdColony.zone_info", new z());
        com.adcolony.sdk.a.a("AdColony.probe_launch_server", new a0());
        com.adcolony.sdk.a.a("Crypto.sha1", new b0(this));
        com.adcolony.sdk.a.a("Crypto.crc32", new a(this));
        com.adcolony.sdk.a.a("Crypto.uuid", new b(this));
        com.adcolony.sdk.a.a("Device.query_advertiser_info", new c());
        com.adcolony.sdk.a.a("AdColony.controller_version", new d());
        com.adcolony.sdk.a.a("AdColony.provide_signals", new e());
        com.adcolony.sdk.a.a("AdColony.odt_calculate", new f());
        com.adcolony.sdk.a.a("AdColony.odt_cache", new g(this));
        com.adcolony.sdk.a.a("AdColony.heartbeat", new h());
        int iB = z0.b(this.f9208h);
        this.f9196J = iB == 1;
        this.K = iB == 2;
        z0.b(new i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        int i2 = this.X - 1;
        this.X = i2;
        if (i2 == 0) {
            P();
        }
    }

    private void b(f1 f1Var) {
        if (!com.adcolony.sdk.l.H) {
            f1 f1VarF = c0.f(f1Var, "logging");
            g0.f9148h = c0.a(f1VarF, "send_level", 1);
            g0.f = c0.b(f1VarF, "log_private");
            g0.g = c0.a(f1VarF, "print_level", 3);
            this.f9209i.b(c0.a(f1VarF, "modules"));
            this.f9209i.c(c0.e(f1VarF, "included_fields"));
        }
        f1 f1VarF2 = c0.f(f1Var, TtmlNode.TAG_METADATA);
        n().a(f1VarF2);
        x().a(c0.d(f1VarF2, "session_timeout"));
        a0 = c0.h(f1Var, "pie");
        this.f9215z = c0.h(c0.f(f1Var, "controller"), "version");
        this.f9200R = c0.a(f1VarF2, "signals_timeout", this.f9200R);
        this.S = c0.a(f1VarF2, "calculate_odt_timeout", this.S);
        this.T = c0.a(f1VarF2, "async_odt_query", this.T);
        this.f9201U = c0.a(f1VarF2, "ad_request_timeout", this.f9201U);
        this.f9202V = c0.a(f1VarF2, "controller_heartbeat_interval", this.f9202V);
        this.W = c0.a(f1VarF2, "controller_heartbeat_timeout", this.W);
        this.f9203Y = c0.a(f1VarF2, "enable_compression", false);
        com.adcolony.sdk.v.a().a(f1VarF2.n("odt_config"), new r(this));
    }

    private boolean c(f1 f1Var) {
        if (f1Var == null) {
            return false;
        }
        try {
            try {
                f1 f1VarF = c0.f(f1Var, "controller");
                this.f9214w = c0.h(f1VarF, "url");
                this.x = c0.h(f1VarF, "sha1");
                this.y = c0.h(f1Var, "status");
                b(f1Var);
                if (AdColonyEventTracker.a()) {
                    AdColonyEventTracker.b();
                }
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            new File(this.f9208h.a() + "026ae9c9824b3e483fa6c71fa88f57ae27816141").delete();
        }
        if (this.y.equals("disable") && !com.adcolony.sdk.l.H) {
            try {
                new File(this.f9208h.a() + "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5").delete();
            } catch (Exception unused3) {
            }
            new e0.a().a("Launch server response with disabled status. Disabling AdColony ").a("until next launch.").a(e0.g);
            AdColony.disable();
            return false;
        }
        if ((!this.f9214w.equals("") && !this.y.equals("")) || com.adcolony.sdk.l.H) {
            return true;
        }
        new e0.a().a("Missing controller status or URL. Disabling AdColony until next ").a("launch.").a(e0.f9132i);
        return false;
    }

    public void b(AdColonyAppOptions adColonyAppOptions) {
        this.r = adColonyAppOptions;
    }

    public void c(boolean z2) {
        this.f9192B = z2;
    }

    public com.adcolony.sdk.d c() {
        if (this.d == null) {
            com.adcolony.sdk.d dVar = new com.adcolony.sdk.d();
            this.d = dVar;
            dVar.h();
        }
        return this.d;
    }

    private boolean a(boolean z2) {
        return a(z2, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(boolean z2, boolean z3) {
        if (!com.adcolony.sdk.a.c()) {
            return false;
        }
        this.f9195I = z3;
        this.f9194F = z2;
        if (z2 && !z3) {
            if (!L()) {
                return false;
            }
            this.f9195I = true;
        }
        K();
        return true;
    }

    private boolean a(f1 f1Var) {
        if (!this.f9194F) {
            return true;
        }
        f1 f1Var2 = this.t;
        if (f1Var2 != null && c0.h(c0.f(f1Var2, "controller"), "sha1").equals(c0.h(c0.f(f1Var, "controller"), "sha1"))) {
            return false;
        }
        new e0.a().a("Controller sha1 does not match, downloading new controller.").a(e0.g);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(h0 h0Var) {
        a(c0.d(h0Var.a(), "id"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.adcolony.sdk.s sVar) {
        if (sVar.f9359n) {
            f1 f1VarA = c0.a(sVar.m, "Parsing launch response");
            c0.a(f1VarA, "sdkVersion", n().I());
            c0.j(f1VarA, android.support.v4.media.a.r(new StringBuilder(), this.f9208h.a(), "026ae9c9824b3e483fa6c71fa88f57ae27816141"));
            if (!c(f1VarA)) {
                if (this.f9194F) {
                    return;
                }
                new e0.a().a("Incomplete or disabled launch server response. ").a("Disabling AdColony until next launch.").a(e0.f9131h);
                b(true);
                return;
            }
            if (a(f1VarA)) {
                f1 f1VarB = c0.b();
                c0.a(f1VarB, "url", this.f9214w);
                c0.a(f1VarB, "filepath", android.support.v4.media.a.r(new StringBuilder(), this.f9208h.a(), "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5"));
                this.f9205b.a(new com.adcolony.sdk.s(new h0("WebServices.download", 0, f1VarB), new n()));
            }
            this.t = f1VarA;
            return;
        }
        S();
    }

    private boolean a(String str) {
        Context contextA = com.adcolony.sdk.a.a();
        if (contextA == null) {
            return false;
        }
        File file = new File(contextA.getFilesDir().getAbsolutePath() + "/adc3/7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5");
        if (file.exists()) {
            return z0.a(str, file);
        }
        return false;
    }

    public void a() {
        this.d.a();
        P();
    }

    public void a(AdColonyAppOptions adColonyAppOptions) {
        this.D.a(false);
        this.d.b();
        R();
        AdColony.a(com.adcolony.sdk.a.a(), adColonyAppOptions);
        T();
        this.f9213u.clear();
        this.r = adColonyAppOptions;
        this.f9204a.a();
        a(true, true);
    }

    public boolean a(k0 k0Var) {
        this.v.remove(Integer.valueOf(k0Var.getAdc3ModuleId()));
        return this.f9204a.b(k0Var);
    }

    public boolean a(int i2) {
        this.v.remove(Integer.valueOf(i2));
        return this.f9204a.b(i2);
    }

    public void a(AdColonyRewardListener adColonyRewardListener) {
        this.f9212p = adColonyRewardListener;
    }

    public void a(com.adcolony.sdk.c cVar) {
        this.f9210l = cVar;
    }

    public void a(AdColonyAdView adColonyAdView) {
        this.f9211n = adColonyAdView;
    }

    public void a(AdColonyInterstitial adColonyInterstitial) {
        this.o = adColonyInterstitial;
    }

    public void a(long j2) {
        this.D.a(j2);
    }
}
