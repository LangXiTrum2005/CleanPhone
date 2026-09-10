package com.applovin.impl;

import android.app.Activity;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class z1 extends y1 {
    private final a2 M;
    private i0 N;
    private long O;
    private final AtomicBoolean P;

    public z1(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.l lVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, lVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.M = new a2(this.f10021a, this.f10024d, this.f10022b);
        this.P = new AtomicBoolean();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f10023c.a("AppLovinFullscreenActivity", "Marking ad as fully watched");
        }
        this.P.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G() {
        this.f10036q = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        ArrayList arrayList = new ArrayList();
        com.applovin.impl.adview.g gVar = this.f10031k;
        if (gVar != null) {
            arrayList.add(new j4(gVar, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
        }
        com.applovin.impl.adview.k kVar = this.f10030j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = this.f10030j;
            arrayList.add(new j4(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        this.f10021a.getAdEventTracker().b(b(), arrayList);
    }

    @Override // com.applovin.impl.y1
    public void A() {
        this.M.a(this.l);
        this.f10036q = SystemClock.elapsedRealtime();
        this.P.set(true);
    }

    public void I() {
        long jP;
        long millis = 0;
        if (this.f10021a.O() >= 0 || this.f10021a.P() >= 0) {
            if (this.f10021a.O() >= 0) {
                jP = this.f10021a.O();
            } else {
                if (this.f10021a.S0()) {
                    int iE1 = (int) ((com.applovin.impl.sdk.ad.a) this.f10021a).e1();
                    if (iE1 > 0) {
                        millis = TimeUnit.SECONDS.toMillis(iE1);
                    } else {
                        int iR = (int) this.f10021a.r();
                        if (iR > 0) {
                            millis = TimeUnit.SECONDS.toMillis(iR);
                        }
                    }
                }
                jP = (long) ((((double) this.f10021a.P()) / 100.0d) * millis);
            }
            c(jP);
        }
    }

    @Override // com.applovin.impl.y1
    public void a(ViewGroup viewGroup) {
        this.M.a(this.f10031k, this.f10030j, b(), viewGroup);
        if (((Boolean) this.f10022b.a(z4.f10128d6)).booleanValue() || !a(false)) {
            com.applovin.impl.adview.k kVar = this.f10030j;
            if (kVar != null) {
                kVar.b();
            }
            b().renderAd(this.f10021a);
            a("javascript:al_onPoststitialShow();", this.f10021a.x());
            if (h()) {
                long jC = C();
                this.O = jC;
                if (jC > 0) {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f10023c.a("AppLovinFullscreenActivity", defpackage.e.r(new StringBuilder("Scheduling timer for ad fully watched in "), this.O, "ms..."));
                    }
                    final int i10 = 0;
                    this.N = i0.a(this.O, this.f10022b, new Runnable(this) { // from class: com.applovin.impl.qa

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ z1 f9119b;

                        {
                            this.f9119b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i11 = i10;
                            z1 z1Var = this.f9119b;
                            switch (i11) {
                                case 0:
                                    z1Var.F();
                                    break;
                                case 1:
                                    z1Var.G();
                                    break;
                                default:
                                    z1Var.H();
                                    break;
                            }
                        }
                    });
                }
            }
            if (this.f10031k != null) {
                if (this.f10021a.r() >= 0) {
                    final int i11 = 1;
                    a(this.f10031k, this.f10021a.r(), new Runnable(this) { // from class: com.applovin.impl.qa

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ z1 f9119b;

                        {
                            this.f9119b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i12 = i11;
                            z1 z1Var = this.f9119b;
                            switch (i12) {
                                case 0:
                                    z1Var.F();
                                    break;
                                case 1:
                                    z1Var.G();
                                    break;
                                default:
                                    z1Var.H();
                                    break;
                            }
                        }
                    });
                } else {
                    this.f10031k.setVisibility(0);
                }
            }
            I();
            final int i12 = 2;
            this.f10022b.s0().a(new u6(this.f10022b, "updateMainViewOM", new Runnable(this) { // from class: com.applovin.impl.qa

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ z1 f9119b;

                {
                    this.f9119b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i13 = i12;
                    z1 z1Var = this.f9119b;
                    switch (i13) {
                        case 0:
                            z1Var.F();
                            break;
                        case 1:
                            z1Var.G();
                            break;
                        default:
                            z1Var.H();
                            break;
                    }
                }
            }), f6.b.OTHER, TimeUnit.SECONDS.toMillis(1L));
            p();
            super.c(q7.e(this.f10022b));
        }
    }

    @Override // com.applovin.impl.y1
    public void e() {
        super.e();
        A();
    }

    @Override // com.applovin.impl.y1
    public void f() {
        super.f();
        A();
    }

    @Override // com.applovin.impl.y1
    public void m() {
        super.a(D(), false, E(), -2L);
    }

    @Override // com.applovin.impl.y1
    public void w() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.y1
    public void x() {
        super.x();
        this.P.set(true);
    }

    private long C() {
        com.applovin.impl.sdk.ad.b bVar = this.f10021a;
        if (!(bVar instanceof com.applovin.impl.sdk.ad.a)) {
            return 0L;
        }
        float fE1 = ((com.applovin.impl.sdk.ad.a) bVar).e1();
        if (fE1 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fE1 = this.f10021a.r();
        }
        return (long) ((((double) this.f10021a.y()) / 100.0d) * q7.c(fE1));
    }

    private int D() {
        i0 i0Var;
        int iMin = 100;
        if (h()) {
            if (((Boolean) this.f10022b.a(z4.f10191l1)).booleanValue() && !this.f10021a.hasShown()) {
                return 0;
            }
            if (!E() && (i0Var = this.N) != null) {
                iMin = (int) Math.min(100.0d, ((this.O - i0Var.b()) / this.O) * 100.0d);
            }
            if (com.applovin.impl.sdk.p.a()) {
                this.f10023c.a("AppLovinFullscreenActivity", "Ad engaged at " + iMin + "%");
            }
        }
        return iMin;
    }

    public boolean E() {
        if (!(this.J && this.f10021a.W0()) && h()) {
            return this.P.get();
        }
        return true;
    }

    @Override // com.applovin.impl.y1
    public void v() {
    }

    @Override // com.applovin.impl.y1
    public void a(String str) {
        if (!((Boolean) this.f10022b.a(z4.T6)).booleanValue()) {
            com.applovin.impl.sdk.ad.b bVar = this.f10021a;
            if (bVar != null) {
                bVar.a(str);
            }
            m();
        }
        i0 i0Var = this.N;
        if (i0Var != null) {
            i0Var.a();
            this.N = null;
        }
        super.a(str);
    }

    @Override // com.applovin.impl.y1
    public void b(long j10) {
    }
}
