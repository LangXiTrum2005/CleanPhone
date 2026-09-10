package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcay extends zzcal {
    private final RewardedInterstitialAdLoadCallback zza;
    private final zzcaz zzb;

    public zzcay(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, zzcaz zzcazVar) {
        this.zza = rewardedInterstitialAdLoadCallback;
        this.zzb = zzcazVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    public final void zze() {
        zzcaz zzcazVar;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback == null || (zzcazVar = this.zzb) == null) {
            return;
        }
        rewardedInterstitialAdLoadCallback.onAdLoaded(zzcazVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    public final void zzf(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }
}
