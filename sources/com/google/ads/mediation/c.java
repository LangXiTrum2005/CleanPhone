package com.google.ads.mediation;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends InterstitialAdLoadCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractAdViewAdapter f10608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediationInterstitialListener f10609b;

    public c(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.f10608a = abstractAdViewAdapter;
        this.f10609b = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f10609b.onAdFailedToLoad(this.f10608a, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(InterstitialAd interstitialAd) {
        InterstitialAd interstitialAd2 = interstitialAd;
        AbstractAdViewAdapter abstractAdViewAdapter = this.f10608a;
        abstractAdViewAdapter.mInterstitialAd = interstitialAd2;
        MediationInterstitialListener mediationInterstitialListener = this.f10609b;
        interstitialAd2.setFullScreenContentCallback(new d(abstractAdViewAdapter, mediationInterstitialListener));
        mediationInterstitialListener.onAdLoaded(abstractAdViewAdapter);
    }
}
