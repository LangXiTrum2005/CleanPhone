package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzb implements CustomEventInterstitialListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomEventAdapter f11309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediationInterstitialListener f11310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CustomEventAdapter f11311c;

    public zzb(CustomEventAdapter customEventAdapter, CustomEventAdapter customEventAdapter2, MediationInterstitialListener mediationInterstitialListener) {
        Objects.requireNonNull(customEventAdapter);
        this.f11311c = customEventAdapter;
        this.f11309a = customEventAdapter2;
        this.f11310b = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClicked() {
        zzo.zzd("Custom event adapter called onAdClicked.");
        this.f11310b.onAdClicked(this.f11309a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClosed() {
        zzo.zzd("Custom event adapter called onAdClosed.");
        this.f11310b.onAdClosed(this.f11309a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(int i10) {
        zzo.zzd("Custom event adapter called onFailedToReceiveAd.");
        this.f11310b.onAdFailedToLoad(this.f11309a, i10);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdLeftApplication() {
        zzo.zzd("Custom event adapter called onAdLeftApplication.");
        this.f11310b.onAdLeftApplication(this.f11309a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventInterstitialListener
    public final void onAdLoaded() {
        zzo.zzd("Custom event adapter called onReceivedAd.");
        this.f11310b.onAdLoaded(this.f11311c);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdOpened() {
        zzo.zzd("Custom event adapter called onAdOpened.");
        this.f11310b.onAdOpened(this.f11309a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(AdError adError) {
        zzo.zzd("Custom event adapter called onFailedToReceiveAd.");
        this.f11310b.onAdFailedToLoad(this.f11309a, adError);
    }
}
