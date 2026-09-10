package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.AppOpenAd;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbdy extends zzbef {
    private final AppOpenAd.AppOpenAdLoadCallback zza;
    private final String zzb;

    public zzbdy(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, String str) {
        this.zza = appOpenAdLoadCallback;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbeg
    public final void zzb(zzbed zzbedVar) {
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.zza;
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAdLoaded(new zzbdz(zzbedVar, this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbeg
    public final void zzc(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzbeg
    public final void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) {
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.zza;
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }
}
