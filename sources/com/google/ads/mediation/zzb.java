package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.mediation.MediationBannerListener;

/* JADX INFO: loaded from: classes3.dex */
final class zzb extends AdListener implements AppEventListener, com.google.android.gms.ads.internal.client.zza {
    public final AbstractAdViewAdapter X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final MediationBannerListener f16666Y;

    public zzb(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
        this.X = abstractAdViewAdapter;
        this.f16666Y = mediationBannerListener;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        this.f16666Y.onAdClicked(this.X);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f16666Y.onAdClosed(this.X);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f16666Y.onAdFailedToLoad(this.X, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.f16666Y.onAdLoaded(this.X);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f16666Y.onAdOpened(this.X);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        this.f16666Y.zza(this.X, str, str2);
    }
}
