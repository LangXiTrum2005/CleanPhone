package com.applovin.impl;

import android.app.Activity;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class b2 extends c2 {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private final r7 f7540n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private final Set f7541o0;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements c1.b {
        public a() {
        }

        @Override // com.applovin.impl.c1.b
        public void a() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(b2.this.f7627e0 - ((long) (b2.this.P.getDuration() - b2.this.P.getCurrentPosition())));
            int iC = b2.this.C();
            HashSet hashSet = new HashSet();
            for (b8 b8Var : new HashSet(b2.this.f7541o0)) {
                if (b8Var.a(seconds, iC)) {
                    hashSet.add(b8Var);
                    b2.this.f7541o0.remove(b8Var);
                }
            }
            b2.this.a(hashSet);
            if (iC >= 25 && iC < 50) {
                b2.this.f7540n0.getAdEventTracker().x();
                return;
            }
            if (iC >= 50 && iC < 75) {
                b2.this.f7540n0.getAdEventTracker().y();
            } else if (iC >= 75) {
                b2.this.f7540n0.getAdEventTracker().C();
            }
        }

        @Override // com.applovin.impl.c1.b
        public boolean b() {
            return !b2.this.f7629h0;
        }
    }

    public b2(final com.applovin.impl.sdk.ad.b bVar, final Activity activity, Map map, final com.applovin.impl.sdk.l lVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, lVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        HashSet hashSet = new HashSet();
        this.f7541o0 = hashSet;
        r7 r7Var = (r7) bVar;
        this.f7540n0 = r7Var;
        if (r7Var.n1()) {
            ImageView imageViewA = x7.a(r7Var.h1().e(), activity, lVar);
            this.W = imageViewA;
            imageViewA.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.u8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9852a.a(bVar, lVar, activity, view);
                }
            });
        }
        r7.d dVar = r7.d.VIDEO;
        hashSet.addAll(r7Var.a(dVar, c8.f7667a));
        a(r7.d.IMPRESSION);
        a(dVar, "creativeView");
        r7Var.getAdEventTracker().g();
    }

    private void V() {
        if (!G() || this.f7541o0.isEmpty()) {
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f10023c.k("AppLovinFullscreenActivity", "Firing " + this.f7541o0.size() + " un-fired video progress trackers when video was completed.");
        }
        a(this.f7541o0);
    }

    @Override // com.applovin.impl.c2
    public void D() {
        a(r7.d.VIDEO, "skip");
        this.f7540n0.getAdEventTracker().B();
        super.D();
    }

    @Override // com.applovin.impl.c2
    public void E() {
        super.E();
        r7 r7Var = this.f7540n0;
        if (r7Var != null) {
            r7Var.getAdEventTracker().i();
        }
    }

    @Override // com.applovin.impl.c2
    public void N() {
        long jP;
        int iR;
        long millis = 0;
        if (this.f7540n0.O() >= 0 || this.f7540n0.P() >= 0) {
            if (this.f7540n0.O() >= 0) {
                jP = this.f7540n0.O();
            } else {
                r7 r7Var = this.f7540n0;
                e8 e8VarL1 = r7Var.l1();
                if (e8VarL1 == null || e8VarL1.d() <= 0) {
                    long j10 = this.f7627e0;
                    if (j10 > 0) {
                        millis = j10;
                    }
                } else {
                    millis = TimeUnit.SECONDS.toMillis(e8VarL1.d());
                }
                if (r7Var.S0() && (iR = (int) r7Var.r()) > 0) {
                    millis += TimeUnit.SECONDS.toMillis(iR);
                }
                jP = (long) ((((double) this.f7540n0.P()) / 100.0d) * millis);
            }
            c(jP);
        }
    }

    @Override // com.applovin.impl.c2
    public void Q() {
        super.Q();
        r7 r7Var = this.f7540n0;
        if (r7Var != null) {
            r7Var.getAdEventTracker().j();
        }
    }

    @Override // com.applovin.impl.c2
    public void R() {
        V();
        if (!d8.a(this.f7540n0)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f10023c.a("AppLovinFullscreenActivity", "VAST ad does not have valid companion ad - dismissing...");
            }
            a("no_valid_companion_ad");
        } else {
            if (this.f7629h0) {
                return;
            }
            a(r7.d.COMPANION, "creativeView");
            this.f7540n0.getAdEventTracker().w();
            super.R();
        }
    }

    @Override // com.applovin.impl.c2
    public void T() {
        super.T();
        a(r7.d.VIDEO, this.f7626d0 ? CampaignEx.JSON_NATIVE_VIDEO_MUTE : CampaignEx.JSON_NATIVE_VIDEO_UNMUTE);
        this.f7540n0.getAdEventTracker().b(this.f7626d0);
    }

    @Override // com.applovin.impl.c2
    public void d(long j10) {
        super.d(j10);
        this.f7540n0.getAdEventTracker().b(TimeUnit.MILLISECONDS.toSeconds(j10), q7.e(this.f10022b));
    }

    @Override // com.applovin.impl.c2
    public void g(String str) {
        a(r7.d.ERROR, w7.MEDIA_FILE_ERROR);
        this.f7540n0.getAdEventTracker().b(str);
        super.g(str);
    }

    @Override // com.applovin.impl.y1
    public void s() {
        super.s();
        a(this.f7629h0 ? r7.d.COMPANION : r7.d.VIDEO, CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
        this.f7540n0.getAdEventTracker().z();
    }

    @Override // com.applovin.impl.y1
    public void t() {
        super.t();
        a(this.f7629h0 ? r7.d.COMPANION : r7.d.VIDEO, CampaignEx.JSON_NATIVE_VIDEO_RESUME);
        this.f7540n0.getAdEventTracker().A();
    }

    @Override // com.applovin.impl.c2, com.applovin.impl.y1
    public void v() {
        this.f7623a0.c();
        super.v();
    }

    @Override // com.applovin.impl.c2, com.applovin.impl.y1
    public void w() {
        a((ViewGroup) null);
    }

    private boolean U() {
        return this.W != null && this.f7540n0.n1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.l lVar, Activity activity, View view) {
        Uri uriC = this.f7540n0.h1().c();
        if (uriC != null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f10023c.a("AppLovinFullscreenActivity", "Industry Icon clicked, opening URL: " + uriC);
            }
            a(r7.d.INDUSTRY_ICON_CLICK);
            if (bVar.isCustomTabsEnabled()) {
                lVar.A().a(uriC, b().getController(), activity);
            } else {
                n7.b(uriC, bVar, activity, lVar);
            }
        }
    }

    @Override // com.applovin.impl.c2, com.applovin.impl.y1
    public void a(String str) {
        if (this.f7540n0 != null) {
            a(r7.d.VIDEO, CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
            a(r7.d.COMPANION, CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
        }
        super.a(str);
    }

    @Override // com.applovin.impl.c2, com.applovin.impl.y1
    public void a(ViewGroup viewGroup) {
        super.a(viewGroup);
        if (U()) {
            a(r7.d.INDUSTRY_ICON_IMPRESSION);
            this.W.setVisibility(0);
        }
        this.f7623a0.a("PROGRESS_TRACKING", TimeUnit.SECONDS.toMillis(1L), new a());
        ArrayList arrayList = new ArrayList();
        com.applovin.impl.a aVar = this.Q;
        if (aVar != null) {
            arrayList.add(new j4(aVar, FriendlyObstructionPurpose.OTHER, "video stream buffering indicator"));
        }
        com.applovin.impl.adview.g gVar = this.R;
        if (gVar != null) {
            arrayList.add(new j4(gVar, FriendlyObstructionPurpose.CLOSE_AD, "skip button"));
        }
        k0 k0Var = this.S;
        if (k0Var != null) {
            arrayList.add(new j4(k0Var, FriendlyObstructionPurpose.OTHER, "countdown clock"));
        }
        ProgressBar progressBar = this.U;
        if (progressBar != null) {
            arrayList.add(new j4(progressBar, FriendlyObstructionPurpose.OTHER, "progress bar"));
        }
        ProgressBar progressBar2 = this.V;
        if (progressBar2 != null) {
            arrayList.add(new j4(progressBar2, FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        ImageView imageView = this.T;
        if (imageView != null) {
            arrayList.add(new j4(imageView, FriendlyObstructionPurpose.VIDEO_CONTROLS, "mute button"));
        }
        com.applovin.impl.adview.k kVar = this.f10030j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = this.f10030j;
            arrayList.add(new j4(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        this.f7540n0.getAdEventTracker().b(this.P, arrayList);
    }

    @Override // com.applovin.impl.c2
    public void a(MotionEvent motionEvent) {
        a(r7.d.VIDEO_CLICK);
        this.f7540n0.getAdEventTracker().v();
        super.a(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Set set) {
        a(set, w7.UNSPECIFIED);
    }

    private void a(r7.d dVar) {
        a(dVar, w7.UNSPECIFIED);
    }

    private void a(r7.d dVar, String str) {
        a(dVar, str, w7.UNSPECIFIED);
    }

    private void a(r7.d dVar, w7 w7Var) {
        a(dVar, "", w7Var);
    }

    private void a(r7.d dVar, String str, w7 w7Var) {
        a(this.f7540n0.a(dVar, str), w7Var);
    }

    private void a(Set set, w7 w7Var) {
        if (set == null || set.isEmpty()) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.P.getCurrentPosition());
        f8 f8VarM1 = this.f7540n0.m1();
        Uri uriD = f8VarM1 != null ? f8VarM1.d() : null;
        if (com.applovin.impl.sdk.p.a()) {
            this.f10023c.a("AppLovinFullscreenActivity", "Firing " + set.size() + " tracker(s): " + set);
        }
        d8.a(set, seconds, uriD, w7Var, this.f10022b);
    }
}
