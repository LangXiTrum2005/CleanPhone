package com.startapp.sdk.internal;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r7 extends AdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s7 f41429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdManagerAdView f41430b;

    public r7(s7 s7Var, AdManagerAdView adManagerAdView) {
        this.f41429a = s7Var;
        this.f41430b = adManagerAdView;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        d0 d0Var = this.f41429a.f41473e;
        if (d0Var != null) {
            d0Var.c();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        d0 d0Var = this.f41429a.f41473e;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError errorCode) {
        Intrinsics.f(errorCode, "errorCode");
        d0 d0Var = this.f41429a.f41473e;
        if (d0Var != null) {
            d0Var.a(errorCode.toString());
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        d0 d0Var = this.f41429a.f41473e;
        if (d0Var != null) {
            d0Var.d();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        d0 d0Var = this.f41429a.f41473e;
        if (d0Var != null) {
            d0Var.a(this.f41430b);
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        d0 d0Var = this.f41429a.f41473e;
        if (d0Var != null) {
            d0Var.a();
        }
    }
}
