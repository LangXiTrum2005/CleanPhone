package com.startapp.sdk.ads.nativead;

import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.internal.a0;
import com.startapp.sdk.internal.ii;
import com.startapp.sdk.internal.qd;
import com.startapp.sdk.internal.y6;
import com.startapp.sdk.internal.z6;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements AdEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qd f40516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NativeAdPreferences f40517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdEventListener f40518c;
    public final /* synthetic */ StartAppNativeAd d;

    public j(StartAppNativeAd startAppNativeAd, qd qdVar, NativeAdPreferences nativeAdPreferences, AdEventListener adEventListener) {
        this.d = startAppNativeAd;
        this.f40516a = qdVar;
        this.f40517b = nativeAdPreferences;
        this.f40518c = adEventListener;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad) {
        if (ad != null) {
            this.d.setErrorMessage(ad.getErrorMessage());
        }
        ((z6) ((y6) ((Ad) this.d).eventTracer.a())).c(this.d, ii.g);
        ((z6) ((y6) ((Ad) this.d).eventTracer.a())).b(this.d, ii.f41105b);
        a0.a(((Ad) this.d).context, this.f40518c, this.d, false);
        this.d.loading.set(false);
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad) {
        this.d.initNativeAdList(this.f40516a, this.f40517b, this.f40518c);
    }
}
