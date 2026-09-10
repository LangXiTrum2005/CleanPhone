package com.startapp.sdk.internal;

import android.view.View;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m7 extends AdManagerInterstitialAdLoadCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p7 f41242a;

    public m7(p7 p7Var) {
        this.f41242a = p7Var;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError adError) {
        Intrinsics.f(adError, "adError");
        p7 p7Var = this.f41242a;
        p7Var.d = null;
        p7Var.f41352e = null;
        com.startapp.sdk.adsbase.l lVar = p7Var.f41351c;
        if (lVar != null) {
            lVar.a(adError.toString());
        }
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(AdManagerInterstitialAd adManagerInterstitialAd) {
        AdManagerInterstitialAd interstitialAd = adManagerInterstitialAd;
        Intrinsics.f(interstitialAd, "interstitialAd");
        p7 p7Var = this.f41242a;
        p7Var.f41352e = null;
        p7Var.d = interstitialAd;
        com.startapp.sdk.adsbase.l lVar = p7Var.f41351c;
        if (lVar != null) {
            lVar.a((View) null);
        }
    }
}
