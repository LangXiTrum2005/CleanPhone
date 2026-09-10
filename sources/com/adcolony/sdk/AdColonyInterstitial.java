package com.adcolony.sdk;

import android.content.Context;
import android.content.Intent;
import androidx.browser.customtabs.CustomTabsCallback;
import com.p004ironsource.z8;

/* JADX INFO: loaded from: classes.dex */
public class AdColonyInterstitial {
    public static final int ADCOLONY_IAP_ENGAGEMENT_END_CARD = 0;
    public static final int ADCOLONY_IAP_ENGAGEMENT_OVERLAY = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AdColonyInterstitialListener f8916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f f8917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.adcolony.sdk.c f8918c;
    private AdColonyAdOptions d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p0 f8919e;
    private int f;
    private String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f8920h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f8921i;
    private String j;
    private String k;
    private boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f8923n;
    final z0.b o = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private g f8922l = g.REQUESTED;

    public class a implements z0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f8924a;

        public a() {
        }

        @Override // com.adcolony.sdk.z0.b
        public boolean a() {
            return this.f8924a;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                try {
                    if (this.f8924a) {
                        return;
                    }
                    this.f8924a = true;
                    if (com.adcolony.sdk.a.d()) {
                        k kVarB = com.adcolony.sdk.a.b();
                        if (kVarB.I()) {
                            kVarB.a();
                        }
                        new e0.a().a("Ad show failed due to a native timeout (5000 ms). ").a("Interstitial with adSessionId(" + AdColonyInterstitial.this.g + "). ").a("Reloading controller.").a(e0.f9132i);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if ((com.adcolony.sdk.a.a() instanceof AdColonyInterstitialActivity) || AdColonyInterstitial.this.f8916a == null) {
                return;
            }
            AdColonyInterstitial.this.f8916a.onOpened(AdColonyInterstitial.this);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.adcolony.sdk.d f8927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f8928b;

        public c(com.adcolony.sdk.d dVar, String str) {
            this.f8927a = dVar;
            this.f8928b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Context contextA = com.adcolony.sdk.a.a();
            if (contextA instanceof com.adcolony.sdk.b) {
                this.f8927a.a(contextA, c0.b(), this.f8928b);
            } else {
                if (AdColonyInterstitial.this.f8916a != null) {
                    AdColonyInterstitial.this.f8916a.onClosed(AdColonyInterstitial.this);
                    AdColonyInterstitial.this.setListener(null);
                }
                AdColonyInterstitial.this.o();
                AdColonyInterstitial.this.destroy();
                com.adcolony.sdk.a.b().e(false);
            }
            if (AdColonyInterstitial.this.f8918c != null) {
                this.f8927a.a(AdColonyInterstitial.this.f8918c);
                AdColonyInterstitial.this.f8918c = null;
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdColonyInterstitialListener f8930a;

        public d(AdColonyInterstitialListener adColonyInterstitialListener) {
            this.f8930a = adColonyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8930a.onRequestNotFilled(AdColony.a(AdColonyInterstitial.this.getZoneID()));
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdColonyInterstitialListener f8932a;

        public e(AdColonyInterstitialListener adColonyInterstitialListener) {
            this.f8932a = adColonyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8932a.onExpiring(AdColonyInterstitial.this);
        }
    }

    public interface f {
        void a();
    }

    public enum g {
        REQUESTED,
        FILLED,
        NOT_FILLED,
        EXPIRED,
        SHOWN,
        CLOSED
    }

    public AdColonyInterstitial(String str, AdColonyInterstitialListener adColonyInterstitialListener, String str2) {
        this.f8916a = adColonyInterstitialListener;
        this.f8921i = str2;
        this.g = str;
    }

    private boolean k() {
        String strE = com.adcolony.sdk.a.b().s().e();
        String viewNetworkPassFilter = getViewNetworkPassFilter();
        if (viewNetworkPassFilter == null || viewNetworkPassFilter.length() == 0 || viewNetworkPassFilter.equals(strE) || viewNetworkPassFilter.equals("all")) {
            return true;
        }
        if (viewNetworkPassFilter.equals(CustomTabsCallback.ONLINE_EXTRAS_KEY) && (strE.equals(z8.f27869b) || strE.equals("cell"))) {
            return true;
        }
        return viewNetworkPassFilter.equals("offline") && strE.equals("none");
    }

    public void a(boolean z2) {
    }

    public void c(String str) {
    }

    public boolean cancel() {
        if (this.f8918c == null) {
            return false;
        }
        Context contextA = com.adcolony.sdk.a.a();
        if (contextA != null && !(contextA instanceof AdColonyInterstitialActivity)) {
            return false;
        }
        f1 f1VarB = c0.b();
        c0.a(f1VarB, "id", this.f8918c.a());
        new h0("AdSession.on_request_close", this.f8918c.k(), f1VarB).c();
        return true;
    }

    public com.adcolony.sdk.c d() {
        return this.f8918c;
    }

    public boolean destroy() {
        com.adcolony.sdk.a.b().c().f().remove(this.g);
        return true;
    }

    public void e(String str) {
        if (com.adcolony.sdk.a.d()) {
            k kVarB = com.adcolony.sdk.a.b();
            com.adcolony.sdk.d dVarC = kVarB.c();
            z0.b(new b());
            AdColonyZone adColonyZone = kVarB.C().get(this.f8921i);
            if (adColonyZone != null && adColonyZone.isRewarded()) {
                f1 f1Var = new f1();
                c0.b(f1Var, "reward_amount", adColonyZone.getRewardAmount());
                c0.a(f1Var, "reward_name", adColonyZone.getRewardName());
                c0.b(f1Var, "success", true);
                c0.a(f1Var, "zone_id", this.f8921i);
                kVarB.e(new h0("AdColony.v4vc_reward", 0, f1Var));
            }
            z0.b(new c(dVarC, str));
        }
    }

    public int f() {
        return this.f;
    }

    public String g() {
        return this.k;
    }

    public AdColonyInterstitialListener getListener() {
        return this.f8916a;
    }

    public String getViewNetworkPassFilter() {
        return this.f8923n;
    }

    public String getZoneID() {
        return this.f8921i;
    }

    public boolean h() {
        return this.m;
    }

    public boolean i() {
        return this.f8919e != null;
    }

    public boolean isExpired() {
        g gVar = this.f8922l;
        return gVar == g.EXPIRED || gVar == g.SHOWN || gVar == g.CLOSED;
    }

    public boolean j() {
        return this.f8922l == g.FILLED;
    }

    public boolean l() {
        return this.f8922l == g.REQUESTED;
    }

    public boolean m() {
        return this.f8922l == g.SHOWN;
    }

    public boolean n() {
        z0.c(this.o);
        Context contextA = com.adcolony.sdk.a.a();
        if (contextA == null || !com.adcolony.sdk.a.d() || this.o.a()) {
            return false;
        }
        com.adcolony.sdk.a.b().a(this.f8918c);
        com.adcolony.sdk.a.b().a(this);
        z0.a(new Intent(contextA, (Class<?>) AdColonyInterstitialActivity.class));
        return true;
    }

    public void o() {
        f fVar;
        synchronized (this) {
            try {
                r();
                fVar = this.f8917b;
                if (fVar != null) {
                    this.f8917b = null;
                } else {
                    fVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (fVar != null) {
            fVar.a();
        }
    }

    public boolean p() {
        s();
        AdColonyInterstitialListener adColonyInterstitialListener = this.f8916a;
        if (adColonyInterstitialListener == null) {
            return false;
        }
        z0.b(new e(adColonyInterstitialListener));
        return true;
    }

    public boolean q() {
        u();
        AdColonyInterstitialListener adColonyInterstitialListener = this.f8916a;
        if (adColonyInterstitialListener == null) {
            return false;
        }
        z0.b(new d(adColonyInterstitialListener));
        return true;
    }

    public void r() {
        this.f8922l = g.CLOSED;
    }

    public void s() {
        this.f8922l = g.EXPIRED;
    }

    public void setListener(AdColonyInterstitialListener adColonyInterstitialListener) {
        this.f8916a = adColonyInterstitialListener;
    }

    public void setViewNetworkPassFilter(String str) {
        this.f8923n = str;
    }

    public boolean show() {
        boolean z2 = false;
        if (!com.adcolony.sdk.a.d()) {
            return false;
        }
        k kVarB = com.adcolony.sdk.a.b();
        f1 f1VarB = c0.b();
        c0.a(f1VarB, "zone_id", this.f8921i);
        c0.b(f1VarB, "type", 0);
        c0.a(f1VarB, "id", this.g);
        if (m()) {
            c0.b(f1VarB, "request_fail_reason", 24);
            new e0.a().a("This ad object has already been shown. Please request a new ad ").a("via AdColony.requestInterstitial.").a(e0.f);
        } else if (this.f8922l == g.EXPIRED) {
            c0.b(f1VarB, "request_fail_reason", 17);
            new e0.a().a("This ad object has expired. Please request a new ad via AdColony").a(".requestInterstitial.").a(e0.f);
        } else if (kVarB.J()) {
            c0.b(f1VarB, "request_fail_reason", 23);
            new e0.a().a("Can not show ad while an interstitial is already active.").a(e0.f);
        } else if (a(kVarB.C().get(this.f8921i))) {
            c0.b(f1VarB, "request_fail_reason", 11);
        } else if (k()) {
            v();
            com.adcolony.sdk.a.b().e(true);
            z0.a(this.o, 5000L);
            z2 = true;
        } else {
            c0.b(f1VarB, "request_fail_reason", 9);
            new e0.a().a("Tried to show interstitial ad during unacceptable network conditions.").a(e0.f);
        }
        AdColonyAdOptions adColonyAdOptions = this.d;
        if (adColonyAdOptions != null) {
            c0.b(f1VarB, "pre_popup", adColonyAdOptions.f8889a);
            c0.b(f1VarB, "post_popup", this.d.f8890b);
        }
        AdColonyZone adColonyZone = kVarB.C().get(this.f8921i);
        if (adColonyZone != null && adColonyZone.isRewarded() && kVarB.w() == null) {
            new e0.a().a("Rewarded ad: show() called with no reward listener set.").a(e0.f);
        }
        new h0("AdSession.launch_ad_unit", 1, f1VarB).c();
        return z2;
    }

    public void t() {
        this.f8922l = g.FILLED;
    }

    public void u() {
        this.f8922l = g.NOT_FILLED;
    }

    public void v() {
        this.f8922l = g.SHOWN;
    }

    public String b() {
        return this.g;
    }

    public void d(String str) {
        this.k = str;
    }

    public void b(String str) {
        this.j = str;
    }

    public String c() {
        return this.j;
    }

    public boolean a(AdColonyZone adColonyZone) {
        if (adColonyZone != null) {
            if (adColonyZone.getPlayFrequency() <= 1) {
                return false;
            }
            if (adColonyZone.a() == 0) {
                adColonyZone.b(adColonyZone.getPlayFrequency() - 1);
                return false;
            }
            adColonyZone.b(adColonyZone.a() - 1);
        }
        return true;
    }

    public void b(boolean z2) {
        this.m = z2;
    }

    public void a(f fVar) {
        boolean z2;
        synchronized (this) {
            if (this.f8922l == g.CLOSED) {
                z2 = true;
            } else {
                this.f8917b = fVar;
                z2 = false;
            }
        }
        if (z2) {
            fVar.a();
        }
    }

    public void a(f1 f1Var) {
        if (f1Var.b()) {
            return;
        }
        this.f8919e = new p0(f1Var, this.g);
    }

    public p0 e() {
        return this.f8919e;
    }

    public void a(com.adcolony.sdk.c cVar) {
        this.f8918c = cVar;
    }

    public void a(AdColonyAdOptions adColonyAdOptions) {
        this.d = adColonyAdOptions;
    }

    public void a(int i2) {
        this.f = i2;
    }

    public String a() {
        String str = this.f8920h;
        return str == null ? "" : str;
    }

    public void a(String str) {
        this.f8920h = str;
    }
}
