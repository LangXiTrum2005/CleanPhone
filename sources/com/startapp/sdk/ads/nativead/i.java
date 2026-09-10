package com.startapp.sdk.ads.nativead;

import com.startapp.sdk.adsbase.adlisteners.AdEventListener;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f40514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdEventListener f40515c;
    public final /* synthetic */ StartAppNativeAd d;

    public i(StartAppNativeAd startAppNativeAd, int i2, AdEventListener adEventListener) {
        this.d = startAppNativeAd;
        this.f40514b = i2;
        this.f40515c = adEventListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f40513a + 1;
        this.f40513a = i2;
        if (i2 == this.f40514b) {
            this.d.onReceiveAd(this.f40515c);
        }
    }
}
