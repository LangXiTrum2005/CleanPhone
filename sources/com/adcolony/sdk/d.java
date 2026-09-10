package com.adcolony.sdk;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.vungle.ads.internal.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<String, Runnable> f9080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap<String, com.adcolony.sdk.c> f9081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, AdColonyInterstitial> f9082c;
    private ConcurrentHashMap<String, AdColonyAdViewListener> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ConcurrentHashMap<String, AdColonyAdViewListener> f9083e;
    private Map<String, AdColonyAdView> f;
    private final Object g = new Object();

    public class a implements j0 {
        public a() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            d.this.e(h0Var);
        }
    }

    public class b implements j0 {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h0 f9086a;

            public a(h0 h0Var) {
                this.f9086a = h0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                AdColonyInterstitial adColonyInterstitial = (AdColonyInterstitial) d.this.f9082c.get(c0.h(this.f9086a.a(), "id"));
                if (adColonyInterstitial == null || adColonyInterstitial.getListener() == null) {
                    return;
                }
                adColonyInterstitial.getListener().onAudioStopped(adColonyInterstitial);
            }
        }

        public b() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            z0.b(new a(h0Var));
        }
    }

    public class c implements j0 {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h0 f9089a;

            public a(h0 h0Var) {
                this.f9089a = h0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                AdColonyInterstitial adColonyInterstitial = (AdColonyInterstitial) d.this.f9082c.get(c0.h(this.f9089a.a(), "id"));
                if (adColonyInterstitial == null || adColonyInterstitial.getListener() == null) {
                    return;
                }
                adColonyInterstitial.getListener().onAudioStarted(adColonyInterstitial);
            }
        }

        public c() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            z0.b(new a(h0Var));
        }
    }

    /* JADX INFO: renamed from: com.adcolony.sdk.d$d, reason: collision with other inner class name */
    public class C0015d implements j0 {
        public C0015d() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            d.this.i(h0Var);
        }
    }

    public class e implements j0 {
        public e() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            d.this.h(h0Var);
        }
    }

    public class f implements j0 {
        public f() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            d.this.g(h0Var);
        }
    }

    public class g implements j0 {
        public g(d dVar) {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            f1 f1VarB = c0.b();
            c0.b(f1VarB, "success", true);
            h0Var.a(f1VarB).c();
        }
    }

    public class h implements j0 {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h0 f9094a;

            public a(h hVar, h0 h0Var) {
                this.f9094a = h0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                h0 h0Var = this.f9094a;
                h0Var.a(h0Var.a()).c();
            }
        }

        public h(d dVar) {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            z0.b(new a(this, h0Var));
        }
    }

    public class i implements j0 {
        public i(d dVar) {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            o0.c().a(h0Var);
        }
    }

    public class j implements Runnable {
        public j(d dVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.adcolony.sdk.r rVarO = com.adcolony.sdk.a.b().o();
            if (rVarO.a() != null) {
                rVarO.a().dismiss();
                rVarO.a((AlertDialog) null);
            }
        }
    }

    public class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f9095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0 f9096b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AdColonyAdViewListener f9097c;
        final /* synthetic */ String d;

        public k(Context context, h0 h0Var, AdColonyAdViewListener adColonyAdViewListener, String str) {
            this.f9095a = context;
            this.f9096b = h0Var;
            this.f9097c = adColonyAdViewListener;
            this.d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            AdColonyAdView adColonyAdView;
            try {
                adColonyAdView = new AdColonyAdView(this.f9095a, this.f9096b, this.f9097c);
            } catch (RuntimeException e2) {
                new e0.a().a(e2.toString()).a(e0.f9132i);
                adColonyAdView = null;
            }
            synchronized (d.this.g) {
                try {
                    if (d.this.f9083e.remove(this.d) == null) {
                        return;
                    }
                    if (adColonyAdView == null) {
                        d.this.a(this.f9097c);
                        return;
                    }
                    d.this.f.put(this.d, adColonyAdView);
                    adColonyAdView.setOmidManager(this.f9097c.b());
                    adColonyAdView.e();
                    this.f9097c.a((p0) null);
                    this.f9097c.onRequestFilled(adColonyAdView);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public class l implements j0 {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h0 f9100a;

            public a(h0 h0Var) {
                this.f9100a = h0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.c(this.f9100a);
            }
        }

        public l() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            z0.b(new a(h0Var));
        }
    }

    public class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h0 f9102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdColonyInterstitial f9103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AdColonyInterstitialListener f9104c;

        public m(d dVar, h0 h0Var, AdColonyInterstitial adColonyInterstitial, AdColonyInterstitialListener adColonyInterstitialListener) {
            this.f9102a = h0Var;
            this.f9103b = adColonyInterstitial;
            this.f9104c = adColonyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            f1 f1VarA = this.f9102a.a();
            if (this.f9103b.e() == null) {
                this.f9103b.a(c0.f(f1VarA, "iab"));
            }
            this.f9103b.a(c0.h(f1VarA, "ad_id"));
            this.f9103b.c(c0.h(f1VarA, "creative_id"));
            this.f9103b.setViewNetworkPassFilter(c0.h(f1VarA, "view_network_pass_filter"));
            p0 p0VarE = this.f9103b.e();
            if (p0VarE != null && p0VarE.d() != 2) {
                try {
                    p0VarE.a();
                } catch (IllegalArgumentException unused) {
                    new e0.a().a("IllegalArgumentException when creating omid session").a(e0.f9132i);
                }
            }
            this.f9104c.onRequestFilled(this.f9103b);
        }
    }

    public class n implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdColonyAdViewListener f9105a;

        public n(d dVar, AdColonyAdViewListener adColonyAdViewListener) {
            this.f9105a = adColonyAdViewListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            AdColonyAdViewListener adColonyAdViewListener = this.f9105a;
            adColonyAdViewListener.onRequestNotFilled(AdColony.a(adColonyAdViewListener.c()));
            if (com.adcolony.sdk.a.c()) {
                return;
            }
            new e0.a().a("RequestNotFilled called for AdView due to a missing context. ").a(e0.f9132i);
        }
    }

    public class o implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f9106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f9107b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f9108c;

        public o(String str, String str2, long j) {
            this.f9106a = str;
            this.f9107b = str2;
            this.f9108c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f9080a.remove(this.f9106a);
            AdColonyAdViewListener adColonyAdViewListener = (AdColonyAdViewListener) d.this.d.remove(this.f9106a);
            if (adColonyAdViewListener != null) {
                adColonyAdViewListener.onRequestNotFilled(AdColony.a(this.f9107b));
                f1 f1VarB = c0.b();
                c0.a(f1VarB, "id", this.f9106a);
                c0.a(f1VarB, "zone_id", this.f9107b);
                c0.b(f1VarB, "type", 1);
                c0.b(f1VarB, "request_fail_reason", 26);
                new h0("AdSession.on_request_failure", 1, f1VarB).c();
                new e0.a().a("RequestNotFilled called due to a native timeout. ").a(android.support.v4.media.a.j(com.adcolony.sdk.a.b().d(), " ms. ", new StringBuilder("Timeout set to: "))).a(android.support.v4.media.a.j(this.f9108c, " ms. ", new StringBuilder("AdView request time allowed: "))).a(android.support.v4.media.a.r(new StringBuilder("AdView with adSessionId("), this.f9106a, ") - request failed.")).a(e0.f9132i);
            }
        }
    }

    public class p implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f9109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f9110b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f9111c;

        public p(String str, String str2, long j) {
            this.f9109a = str;
            this.f9110b = str2;
            this.f9111c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f9080a.remove(this.f9109a);
            AdColonyInterstitial adColonyInterstitial = (AdColonyInterstitial) d.this.f9082c.remove(this.f9109a);
            AdColonyInterstitialListener listener = adColonyInterstitial == null ? null : adColonyInterstitial.getListener();
            if (listener != null) {
                listener.onRequestNotFilled(AdColony.a(this.f9110b));
                f1 f1VarB = c0.b();
                c0.a(f1VarB, "id", this.f9109a);
                c0.a(f1VarB, "zone_id", this.f9110b);
                c0.b(f1VarB, "type", 0);
                c0.b(f1VarB, "request_fail_reason", 26);
                new h0("AdSession.on_request_failure", 1, f1VarB).c();
                new e0.a().a("RequestNotFilled called due to a native timeout. ").a(android.support.v4.media.a.j(com.adcolony.sdk.a.b().d(), " ms. ", new StringBuilder("Timeout set to: "))).a(android.support.v4.media.a.j(this.f9111c, " ms. ", new StringBuilder("Interstitial request time allowed: "))).a(android.support.v4.media.a.r(new StringBuilder("Interstitial with adSessionId("), this.f9109a, ") - request failed.")).a(e0.f9132i);
            }
        }
    }

    public class q implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdColonyInterstitialListener f9112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdColonyInterstitial f9113b;

        public q(d dVar, AdColonyInterstitialListener adColonyInterstitialListener, AdColonyInterstitial adColonyInterstitial) {
            this.f9112a = adColonyInterstitialListener;
            this.f9113b = adColonyInterstitial;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.adcolony.sdk.a.b().e(false);
            this.f9112a.onClosed(this.f9113b);
        }
    }

    public class r implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f9114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b1 f9115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.adcolony.sdk.c f9116c;

        public r(String str, b1 b1Var, com.adcolony.sdk.c cVar) {
            this.f9114a = str;
            this.f9115b = b1Var;
            this.f9116c = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                AdColonyInterstitial adColonyInterstitial = d.this.f().get(this.f9114a);
                AdColonyAdView adColonyAdView = d.this.d().get(this.f9114a);
                p0 p0VarE = adColonyInterstitial == null ? null : adColonyInterstitial.e();
                if (p0VarE == null && adColonyAdView != null) {
                    p0VarE = adColonyAdView.getOmidManager();
                }
                int iD = p0VarE == null ? -1 : p0VarE.d();
                if (p0VarE == null || iD != 2) {
                    return;
                }
                p0VarE.a(this.f9115b);
                p0VarE.a(this.f9116c);
            } catch (IllegalArgumentException unused) {
                new e0.a().a("IllegalArgumentException when creating omid session").a(e0.f9132i);
            }
        }
    }

    public class s implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.adcolony.sdk.c f9117a;

        public s(d dVar, com.adcolony.sdk.c cVar) {
            this.f9117a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i2 = 0; i2 < this.f9117a.i().size(); i2++) {
                com.adcolony.sdk.a.b(this.f9117a.j().get(i2), this.f9117a.i().get(i2));
            }
            this.f9117a.j().clear();
            this.f9117a.i().clear();
            this.f9117a.removeAllViews();
            com.adcolony.sdk.c cVar = this.f9117a;
            cVar.f9047z = null;
            cVar.y = null;
            for (b1 b1Var : cVar.n().values()) {
                if (!(b1Var instanceof com.adcolony.sdk.e)) {
                    if (b1Var instanceof c1) {
                        com.adcolony.sdk.a.b().a((c1) b1Var);
                    } else {
                        b1Var.l();
                    }
                }
            }
            for (a1 a1Var : this.f9117a.m().values()) {
                a1Var.j();
                a1Var.k();
            }
            this.f9117a.m().clear();
            this.f9117a.l().clear();
            this.f9117a.n().clear();
            this.f9117a.h().clear();
            this.f9117a.e().clear();
            this.f9117a.f().clear();
            this.f9117a.g().clear();
            this.f9117a.m = true;
        }
    }

    public class t implements j0 {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h0 f9119a;

            public a(h0 h0Var) {
                this.f9119a = h0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.d(this.f9119a);
            }
        }

        public t() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            z0.b(new a(h0Var));
        }
    }

    public class u implements j0 {
        public u() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            d.this.k(h0Var);
        }
    }

    public class v implements j0 {
        public v() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            d.this.j(h0Var);
        }
    }

    public class w implements j0 {
        public w() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            d.this.f(h0Var);
        }
    }

    public class x implements j0 {
        public x() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            d.this.l(h0Var);
        }
    }

    public class y implements j0 {
        public y() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            d.this.b(h0Var);
        }
    }

    public class z implements j0 {
        public z() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            d.this.a(h0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(h0 h0Var) {
        String strH = c0.h(h0Var.a(), "id");
        f1 f1VarB = c0.b();
        c0.a(f1VarB, "id", strH);
        Context contextA = com.adcolony.sdk.a.a();
        if (contextA == null) {
            c0.b(f1VarB, "has_audio", false);
            h0Var.a(f1VarB).c();
            return false;
        }
        boolean zB = z0.b(z0.a(contextA));
        double dA = z0.a(z0.a(contextA));
        c0.b(f1VarB, "has_audio", zB);
        c0.a(f1VarB, "volume", dA);
        h0Var.a(f1VarB).c();
        return zB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j(h0 h0Var) {
        f1 f1VarA = h0Var.a();
        String strB = h0Var.b();
        String strH = c0.h(f1VarA, "ad_session_id");
        int iD = c0.d(f1VarA, "view_id");
        com.adcolony.sdk.c cVar = this.f9081b.get(strH);
        if (cVar == null) {
            a(strB, strH);
            return false;
        }
        View view = cVar.e().get(Integer.valueOf(iD));
        if (view == null) {
            a(strB, android.support.v4.media.a.h(iD, ""));
            return false;
        }
        cVar.removeView(view);
        cVar.addView(view, view.getLayoutParams());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean k(h0 h0Var) {
        f1 f1VarA = h0Var.a();
        String strB = h0Var.b();
        String strH = c0.h(f1VarA, "ad_session_id");
        int iD = c0.d(f1VarA, "view_id");
        com.adcolony.sdk.c cVar = this.f9081b.get(strH);
        if (cVar == null) {
            a(strB, strH);
            return false;
        }
        View view = cVar.e().get(Integer.valueOf(iD));
        if (view == null) {
            a(strB, android.support.v4.media.a.h(iD, ""));
            return false;
        }
        view.bringToFront();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean l(h0 h0Var) {
        f1 f1VarA = h0Var.a();
        String strH = c0.h(f1VarA, "id");
        AdColonyInterstitial adColonyInterstitial = this.f9082c.get(strH);
        AdColonyAdView adColonyAdView = this.f.get(strH);
        int iA = c0.a(f1VarA, "orientation", -1);
        boolean z2 = adColonyAdView != null;
        if (adColonyInterstitial == null && !z2) {
            a(h0Var.b(), strH);
            return false;
        }
        c0.a(c0.b(), "id", strH);
        if (adColonyInterstitial != null) {
            adColonyInterstitial.a(iA);
            adColonyInterstitial.n();
        }
        return true;
    }

    public void h() {
        this.f9080a = new ConcurrentHashMap<>();
        this.f9081b = new HashMap<>();
        this.f9082c = new ConcurrentHashMap<>();
        this.d = new ConcurrentHashMap<>();
        this.f9083e = new ConcurrentHashMap<>();
        this.f = androidx.datastore.preferences.protobuf.a.r();
        com.adcolony.sdk.a.a("AdContainer.create", new l());
        com.adcolony.sdk.a.a("AdContainer.destroy", new t());
        com.adcolony.sdk.a.a("AdContainer.move_view_to_index", new u());
        com.adcolony.sdk.a.a("AdContainer.move_view_to_front", new v());
        com.adcolony.sdk.a.a("AdSession.finish_fullscreen_ad", new w());
        com.adcolony.sdk.a.a("AdSession.start_fullscreen_ad", new x());
        com.adcolony.sdk.a.a("AdSession.ad_view_available", new y());
        com.adcolony.sdk.a.a("AdSession.ad_view_unavailable", new z());
        com.adcolony.sdk.a.a("AdSession.expiring", new a());
        com.adcolony.sdk.a.a("AdSession.audio_stopped", new b());
        com.adcolony.sdk.a.a("AdSession.audio_started", new c());
        com.adcolony.sdk.a.a("AdSession.interstitial_available", new C0015d());
        com.adcolony.sdk.a.a("AdSession.interstitial_unavailable", new e());
        com.adcolony.sdk.a.a("AdSession.has_audio", new f());
        com.adcolony.sdk.a.a("WebView.prepare", new g(this));
        com.adcolony.sdk.a.a("AdSession.expanded", new h(this));
        com.adcolony.sdk.a.a("AdColony.odt_event", new i(this));
    }

    public boolean i(h0 h0Var) {
        f1 f1VarA = h0Var.a();
        String strH = c0.h(f1VarA, "id");
        AdColonyInterstitial adColonyInterstitial = this.f9082c.get(strH);
        if (adColonyInterstitial == null || adColonyInterstitial.j()) {
            return false;
        }
        AdColonyInterstitialListener listener = adColonyInterstitial.getListener();
        if (listener == null) {
            a(h0Var.b(), strH);
            return false;
        }
        z0.c(this.f9080a.remove(strH));
        if (!com.adcolony.sdk.a.c()) {
            a(adColonyInterstitial);
            return false;
        }
        adColonyInterstitial.t();
        adColonyInterstitial.a(c0.h(f1VarA, "ad_id"));
        adColonyInterstitial.c(c0.h(f1VarA, "creative_id"));
        adColonyInterstitial.d(c0.h(f1VarA, "ad_request_id"));
        z0.b(new m(this, h0Var, adColonyInterstitial, listener));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(h0 h0Var) {
        String strH = c0.h(h0Var.a(), "ad_session_id");
        com.adcolony.sdk.c cVar = this.f9081b.get(strH);
        if (cVar == null) {
            a(h0Var.b(), strH);
            return false;
        }
        a(cVar);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f(h0 h0Var) {
        f1 f1VarA = h0Var.a();
        int iD = c0.d(f1VarA, "status");
        if (iD == 5 || iD == 1 || iD == 0 || iD == 6) {
            return false;
        }
        String strH = c0.h(f1VarA, "id");
        AdColonyInterstitial adColonyInterstitialRemove = this.f9082c.remove(strH);
        AdColonyInterstitialListener listener = adColonyInterstitialRemove == null ? null : adColonyInterstitialRemove.getListener();
        if (listener == null) {
            a(h0Var.b(), strH);
            return false;
        }
        z0.b(new q(this, listener, adColonyInterstitialRemove));
        adColonyInterstitialRemove.o();
        adColonyInterstitialRemove.a((com.adcolony.sdk.c) null);
        return true;
    }

    public boolean b(h0 h0Var) {
        String strH = c0.h(h0Var.a(), "id");
        AdColonyAdViewListener adColonyAdViewListenerRemove = this.d.remove(strH);
        if (adColonyAdViewListenerRemove == null) {
            a(h0Var.b(), strH);
            return false;
        }
        this.f9083e.put(strH, adColonyAdViewListenerRemove);
        z0.c(this.f9080a.remove(strH));
        Context contextA = com.adcolony.sdk.a.a();
        if (contextA == null) {
            a(adColonyAdViewListenerRemove);
            return false;
        }
        z0.b(new k(contextA, h0Var, adColonyAdViewListenerRemove, strH));
        return true;
    }

    public boolean c(h0 h0Var) {
        Context contextA = com.adcolony.sdk.a.a();
        if (contextA == null) {
            return false;
        }
        f1 f1VarA = h0Var.a();
        String strH = c0.h(f1VarA, "ad_session_id");
        com.adcolony.sdk.c cVar = new com.adcolony.sdk.c(contextA.getApplicationContext(), strH);
        cVar.j(h0Var);
        this.f9081b.put(strH, cVar);
        if (c0.d(f1VarA, "width") == 0) {
            AdColonyInterstitial adColonyInterstitial = this.f9082c.get(strH);
            if (adColonyInterstitial == null) {
                a(h0Var.b(), strH);
                return false;
            }
            adColonyInterstitial.a(cVar);
        } else {
            cVar.c(false);
        }
        f1 f1VarB = c0.b();
        c0.b(f1VarB, "success", true);
        h0Var.a(f1VarB).c();
        return true;
    }

    public boolean e(h0 h0Var) {
        f1 f1VarA = h0Var.a();
        String strH = c0.h(f1VarA, "id");
        if (c0.d(f1VarA, "type") != 0) {
            return true;
        }
        AdColonyInterstitial adColonyInterstitialRemove = this.f9082c.remove(strH);
        if (com.adcolony.sdk.a.c() && adColonyInterstitialRemove != null && adColonyInterstitialRemove.p()) {
            z0.b(new j(this));
            return true;
        }
        a(h0Var.b(), strH);
        return true;
    }

    public boolean a(h0 h0Var) {
        String strH = c0.h(h0Var.a(), "id");
        AdColonyAdViewListener adColonyAdViewListenerRemove = this.d.remove(strH);
        if (adColonyAdViewListenerRemove == null) {
            a(h0Var.b(), strH);
            return false;
        }
        z0.c(this.f9080a.remove(strH));
        a(adColonyAdViewListenerRemove);
        return true;
    }

    public Map<String, AdColonyAdView> d() {
        return this.f;
    }

    public void a() {
        for (AdColonyInterstitial adColonyInterstitial : this.f9082c.values()) {
            if (adColonyInterstitial != null && adColonyInterstitial.m()) {
                adColonyInterstitial.e("Controller was reloaded and current ad was closed");
                return;
            }
        }
    }

    public ConcurrentHashMap<String, AdColonyAdViewListener> e() {
        return this.d;
    }

    public void b() {
        HashSet hashSet = new HashSet();
        synchronized (this.g) {
            try {
                Iterator<String> it = this.f9083e.keySet().iterator();
                while (it.hasNext()) {
                    AdColonyAdViewListener adColonyAdViewListenerRemove = this.f9083e.remove(it.next());
                    if (adColonyAdViewListenerRemove != null) {
                        hashSet.add(adColonyAdViewListenerRemove);
                    }
                }
                Iterator<String> it2 = this.d.keySet().iterator();
                while (it2.hasNext()) {
                    AdColonyAdViewListener adColonyAdViewListenerRemove2 = this.d.remove(it2.next());
                    if (adColonyAdViewListenerRemove2 != null) {
                        hashSet.add(adColonyAdViewListenerRemove2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            a((AdColonyAdViewListener) it3.next());
        }
        for (String str : this.f9082c.keySet()) {
            AdColonyInterstitial adColonyInterstitial = this.f9082c.get(str);
            if (adColonyInterstitial != null && adColonyInterstitial.l()) {
                this.f9082c.remove(str);
                a(adColonyInterstitial);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AdColonyAdViewListener adColonyAdViewListener) {
        z0.b(new n(this, adColonyAdViewListener));
    }

    public ConcurrentHashMap<String, AdColonyInterstitial> f() {
        return this.f9082c;
    }

    public List<AdColonyInterstitial> g() {
        ArrayList arrayList = new ArrayList();
        for (AdColonyInterstitial adColonyInterstitial : f().values()) {
            if (!adColonyInterstitial.isExpired()) {
                arrayList.add(adColonyInterstitial);
            }
        }
        return arrayList;
    }

    private void a(AdColonyInterstitial adColonyInterstitial) {
        adColonyInterstitial.q();
        if (com.adcolony.sdk.a.c()) {
            return;
        }
        new e0.a().a("RequestNotFilled called due to a missing context. ").a("Interstitial with adSessionId(" + adColonyInterstitial.b() + ").").a(e0.f9132i);
    }

    public HashMap<String, com.adcolony.sdk.c> c() {
        return this.f9081b;
    }

    public void a(String str, AdColonyAdViewListener adColonyAdViewListener, AdColonyAdSize adColonyAdSize, AdColonyAdOptions adColonyAdOptions, long j2) {
        f1 f1Var;
        String strA = z0.a();
        float fS = com.adcolony.sdk.a.b().n().s();
        f1 f1VarB = c0.b();
        c0.a(f1VarB, "zone_id", str);
        c0.b(f1VarB, "type", 1);
        c0.b(f1VarB, "width_pixels", (int) (adColonyAdSize.getWidth() * fS));
        c0.b(f1VarB, "height_pixels", (int) (adColonyAdSize.getHeight() * fS));
        c0.b(f1VarB, "width", adColonyAdSize.getWidth());
        c0.b(f1VarB, "height", adColonyAdSize.getHeight());
        c0.a(f1VarB, "id", strA);
        if (adColonyAdOptions != null && (f1Var = adColonyAdOptions.d) != null) {
            c0.a(f1VarB, "options", f1Var);
        }
        adColonyAdViewListener.a(str);
        adColonyAdViewListener.a(adColonyAdSize);
        this.d.put(strA, adColonyAdViewListener);
        this.f9080a.put(strA, new o(strA, str, j2));
        new h0("AdSession.on_request", 1, f1VarB).c();
        z0.a(this.f9080a.get(strA), j2);
    }

    public boolean h(h0 h0Var) {
        String strH = c0.h(h0Var.a(), "id");
        AdColonyInterstitial adColonyInterstitialRemove = this.f9082c.remove(strH);
        if ((adColonyInterstitialRemove == null ? null : adColonyInterstitialRemove.getListener()) == null) {
            a(h0Var.b(), strH);
            return false;
        }
        z0.c(this.f9080a.remove(strH));
        a(adColonyInterstitialRemove);
        return true;
    }

    public void a(String str, AdColonyInterstitialListener adColonyInterstitialListener, AdColonyAdOptions adColonyAdOptions, long j2) {
        String strA = z0.a();
        com.adcolony.sdk.k kVarB = com.adcolony.sdk.a.b();
        AdColonyInterstitial adColonyInterstitial = new AdColonyInterstitial(strA, adColonyInterstitialListener, str);
        f1 f1VarB = c0.b();
        c0.a(f1VarB, "zone_id", str);
        c0.b(f1VarB, Constants.TEMPLATE_TYPE_FULLSCREEN, true);
        Rect rectW = kVarB.n().w();
        c0.b(f1VarB, "width", rectW.width());
        c0.b(f1VarB, "height", rectW.height());
        c0.b(f1VarB, "type", 0);
        c0.a(f1VarB, "id", strA);
        if (adColonyAdOptions != null && adColonyAdOptions.d != null) {
            adColonyInterstitial.a(adColonyAdOptions);
            c0.a(f1VarB, "options", adColonyAdOptions.d);
        }
        this.f9082c.put(strA, adColonyInterstitial);
        this.f9080a.put(strA, new p(strA, str, j2));
        new h0("AdSession.on_request", 1, f1VarB).c();
        z0.a(this.f9080a.get(strA), j2);
    }

    public void a(Context context, f1 f1Var, String str) {
        h0 h0Var = new h0("AdSession.finish_fullscreen_ad", 0);
        c0.b(f1Var, "status", 1);
        h0Var.b(f1Var);
        new e0.a().a(str).a(e0.f9131h);
        ((com.adcolony.sdk.b) context).a(h0Var);
    }

    public void a(b1 b1Var, String str, com.adcolony.sdk.c cVar) {
        z0.b(new r(str, b1Var, cVar));
    }

    public void a(com.adcolony.sdk.c cVar) {
        z0.b(new s(this, cVar));
        AdColonyAdView adColonyAdView = this.f.get(cVar.a());
        if (adColonyAdView == null || adColonyAdView.d()) {
            this.f9081b.remove(cVar.a());
            cVar.y = null;
        }
    }

    public void a(String str, String str2) {
        new e0.a().a("Message '").a(str).a("' sent with invalid id: ").a(str2).a(e0.f9131h);
    }

    public AdColonyAdView a(String str) {
        AdColonyAdView adColonyAdViewRemove;
        synchronized (this.g) {
            adColonyAdViewRemove = this.f.remove(str);
        }
        return adColonyAdViewRemove;
    }
}
