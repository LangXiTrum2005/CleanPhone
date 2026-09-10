package com.google.android.gms.ads.mediation.customevent;

import android.view.View;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationBannerListener;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zza implements CustomEventBannerListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomEventAdapter f11307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediationBannerListener f11308b;

    public zza(CustomEventAdapter customEventAdapter, MediationBannerListener mediationBannerListener) {
        this.f11307a = customEventAdapter;
        this.f11308b = mediationBannerListener;
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClicked() {
        zzo.zzd("Custom event adapter called onAdClicked.");
        this.f11308b.onAdClicked(this.f11307a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClosed() {
        zzo.zzd("Custom event adapter called onAdClosed.");
        this.f11308b.onAdClosed(this.f11307a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(int i10) {
        zzo.zzd("Custom event adapter called onAdFailedToLoad.");
        this.f11308b.onAdFailedToLoad(this.f11307a, i10);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdLeftApplication() {
        zzo.zzd("Custom event adapter called onAdLeftApplication.");
        this.f11308b.onAdLeftApplication(this.f11307a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventBannerListener
    public final void onAdLoaded(View view) {
        zzo.zzd("Custom event adapter called onAdLoaded.");
        CustomEventAdapter customEventAdapter = this.f11307a;
        customEventAdapter.f11302a = view;
        this.f11308b.onAdLoaded(customEventAdapter);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdOpened() {
        zzo.zzd("Custom event adapter called onAdOpened.");
        this.f11308b.onAdOpened(this.f11307a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(AdError adError) {
        zzo.zzd("Custom event adapter called onAdFailedToLoad.");
        this.f11308b.onAdFailedToLoad(this.f11307a, adError);
    }
}
