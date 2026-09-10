package com.adcolony.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class b extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    c f8997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f8998b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f8999c;
    boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f9000e;
    boolean f;
    boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f9001h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f9002i;

    public class a implements j0 {
        public a() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            b.this.a(h0Var);
        }
    }

    public void a(boolean z2) {
        Iterator<Map.Entry<Integer, a1>> it = this.f8997a.m().entrySet().iterator();
        while (it.hasNext() && !isFinishing()) {
            a1 value = it.next().getValue();
            if (!value.f() && value.b().isPlaying()) {
                value.h();
            }
        }
        AdColonyInterstitial adColonyInterstitialJ = com.adcolony.sdk.a.b().j();
        if (adColonyInterstitialJ != null && adColonyInterstitialJ.i() && adColonyInterstitialJ.e().c() != null && z2 && this.f9001h) {
            adColonyInterstitialJ.e().a("pause");
        }
    }

    public void b(boolean z2) {
        Iterator<Map.Entry<Integer, a1>> it = this.f8997a.m().entrySet().iterator();
        while (it.hasNext()) {
            a1 value = it.next().getValue();
            if (!value.f() && !value.b().isPlaying() && !com.adcolony.sdk.a.b().o().b()) {
                value.i();
            }
        }
        AdColonyInterstitial adColonyInterstitialJ = com.adcolony.sdk.a.b().j();
        if (adColonyInterstitialJ == null || !adColonyInterstitialJ.i() || adColonyInterstitialJ.e().c() == null) {
            return;
        }
        if (!(z2 && this.f9001h) && this.f9002i) {
            adColonyInterstitialJ.e().a("resume");
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        f1 f1VarB = c0.b();
        c0.a(f1VarB, "id", this.f8997a.a());
        new h0("AdSession.on_back_button", this.f8997a.k(), f1VarB).c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this instanceof AdColonyInterstitialActivity) {
            a();
        } else {
            ((AdColonyAdViewActivity) this).c();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!com.adcolony.sdk.a.d() || com.adcolony.sdk.a.b().l() == null) {
            finish();
            return;
        }
        k kVarB = com.adcolony.sdk.a.b();
        this.f = false;
        c cVarL = kVarB.l();
        this.f8997a = cVarL;
        cVarL.d(false);
        if (z0.g()) {
            this.f8997a.d(true);
        }
        this.f8997a.a();
        this.f8999c = this.f8997a.k();
        boolean multiWindowEnabled = kVarB.u().getMultiWindowEnabled();
        this.g = multiWindowEnabled;
        if (multiWindowEnabled) {
            getWindow().addFlags(com.p004ironsource.mediationsdk.metadata.a.f25965n);
            getWindow().clearFlags(1024);
        } else {
            getWindow().addFlags(1024);
            getWindow().clearFlags(com.p004ironsource.mediationsdk.metadata.a.f25965n);
        }
        requestWindowFeature(1);
        getWindow().getDecorView().setBackgroundColor(-16777216);
        if (kVarB.u().getKeepScreenOn()) {
            getWindow().addFlags(128);
        }
        ViewParent parent = this.f8997a.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(this.f8997a);
        }
        setContentView(this.f8997a);
        this.f8997a.i().add(com.adcolony.sdk.a.a("AdSession.finish_fullscreen_ad", (j0) new a(), true));
        this.f8997a.j().add("AdSession.finish_fullscreen_ad");
        a(this.f8998b);
        if (this.f8997a.o()) {
            a();
            return;
        }
        f1 f1VarB = c0.b();
        c0.a(f1VarB, "id", this.f8997a.a());
        c0.b(f1VarB, "screen_width", this.f8997a.d());
        c0.b(f1VarB, "screen_height", this.f8997a.b());
        new h0("AdSession.on_fullscreen_ad_started", this.f8997a.k(), f1VarB).c();
        this.f8997a.e(true);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!com.adcolony.sdk.a.d() || this.f8997a == null || this.d || z0.g() || this.f8997a.q()) {
            return;
        }
        f1 f1VarB = c0.b();
        c0.a(f1VarB, "id", this.f8997a.a());
        new h0("AdSession.on_error", this.f8997a.k(), f1VarB).c();
        this.f = true;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        a(this.f9000e);
        this.f9000e = false;
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        a();
        b(this.f9000e);
        this.f9000e = true;
        this.f9002i = true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z2) {
        if (z2 && this.f9000e) {
            com.adcolony.sdk.a.b().x().b(true);
            b(this.f9000e);
            this.f9001h = true;
        } else {
            if (z2 || !this.f9000e) {
                return;
            }
            com.adcolony.sdk.a.b().x().a(true);
            a(this.f9000e);
            this.f9001h = false;
        }
    }

    public void a() {
        k kVarB = com.adcolony.sdk.a.b();
        if (this.f8997a == null) {
            this.f8997a = kVarB.l();
        }
        c cVar = this.f8997a;
        if (cVar == null) {
            return;
        }
        cVar.d(false);
        if (z0.g()) {
            this.f8997a.d(true);
        }
        Rect rectX = this.g ? kVarB.n().x() : kVarB.n().w();
        if (rectX.width() <= 0 || rectX.height() <= 0) {
            return;
        }
        f1 f1VarB = c0.b();
        f1 f1VarB2 = c0.b();
        float fS = kVarB.n().s();
        c0.b(f1VarB2, "width", (int) (rectX.width() / fS));
        c0.b(f1VarB2, "height", (int) (rectX.height() / fS));
        c0.b(f1VarB2, "app_orientation", z0.d(z0.f()));
        c0.b(f1VarB2, "x", 0);
        c0.b(f1VarB2, "y", 0);
        c0.a(f1VarB2, "ad_session_id", this.f8997a.a());
        c0.b(f1VarB, "screen_width", rectX.width());
        c0.b(f1VarB, "screen_height", rectX.height());
        c0.a(f1VarB, "ad_session_id", this.f8997a.a());
        c0.b(f1VarB, "id", this.f8997a.c());
        this.f8997a.setLayoutParams(new FrameLayout.LayoutParams(rectX.width(), rectX.height()));
        this.f8997a.b(rectX.width());
        this.f8997a.a(rectX.height());
        new h0("MRAID.on_size_change", this.f8997a.k(), f1VarB2).c();
        new h0("AdContainer.on_orientation_change", this.f8997a.k(), f1VarB).c();
    }

    public void a(h0 h0Var) {
        int iD = c0.d(h0Var.a(), "status");
        if ((iD == 5 || iD == 0 || iD == 6 || iD == 1) && !this.d) {
            k kVarB = com.adcolony.sdk.a.b();
            r rVarO = kVarB.o();
            kVarB.d(h0Var);
            if (rVarO.a() != null) {
                rVarO.a().dismiss();
                rVarO.a((AlertDialog) null);
            }
            if (!this.f) {
                finish();
            }
            this.d = true;
            ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            kVarB.e(false);
            f1 f1VarB = c0.b();
            c0.a(f1VarB, "id", this.f8997a.a());
            new h0("AdSession.on_close", this.f8997a.k(), f1VarB).c();
            kVarB.a((c) null);
            kVarB.a((AdColonyInterstitial) null);
            kVarB.a((AdColonyAdView) null);
            com.adcolony.sdk.a.b().c().f().remove(this.f8997a.a());
        }
    }

    public void a(int i2) {
        if (i2 == 0) {
            setRequestedOrientation(7);
        } else if (i2 != 1) {
            setRequestedOrientation(4);
        } else {
            setRequestedOrientation(6);
        }
        this.f8998b = i2;
    }
}
