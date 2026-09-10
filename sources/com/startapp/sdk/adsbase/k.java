package com.startapp.sdk.adsbase;

import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.internal.e7;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements AdEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f40669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdPreferences f40670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ StartAppAd f40671c;

    public k(StartAppAd startAppAd, i iVar, AdPreferences adPreferences) {
        this.f40671c = startAppAd;
        this.f40669a = iVar;
        this.f40670b = adPreferences;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad) {
        if (e7.a(true, this.f40670b.getAdTag(), false, this.f40671c.g == StartAppAd.AdMode.REWARDED_VIDEO)) {
            this.f40671c.b(this.f40669a, 2);
        } else {
            this.f40669a.onFailedToReceiveAd(ad);
        }
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad) {
        this.f40669a.onReceiveAd(ad);
    }
}
