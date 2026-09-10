package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzeaz extends RewardedAdLoadCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ zzebh zzb;

    public zzeaz(zzebh zzebhVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzebhVar);
        this.zzb = zzebhVar;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.zzb.zzg(zzebh.zzm(loadAdError));
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(RewardedAd rewardedAd) {
        this.zzb.zzf(this.zza, rewardedAd);
    }
}
