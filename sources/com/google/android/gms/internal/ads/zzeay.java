package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzeay extends InterstitialAdLoadCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ zzebh zzb;

    public zzeay(zzebh zzebhVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzebhVar);
        this.zzb = zzebhVar;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.zzb.zzg(zzebh.zzm(loadAdError));
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(InterstitialAd interstitialAd) {
        this.zzb.zzf(this.zza, interstitialAd);
    }
}
