package com.startapp.sdk.adsbase;

import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.internal.a0;
import com.startapp.sdk.internal.ii;
import com.startapp.sdk.internal.y6;
import com.startapp.sdk.internal.z6;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements AdEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdEventListener f40665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StartAppAd f40666b;

    public i(StartAppAd startAppAd, AdEventListener adEventListener) {
        this.f40666b = startAppAd;
        this.f40665a = adEventListener;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad) {
        ((z6) ((y6) this.f40666b.eventTracer.a())).c(this.f40666b, ii.g);
        ((z6) ((y6) this.f40666b.eventTracer.a())).b(this.f40666b, ii.f41104a);
        StartAppAd startAppAd = this.f40666b;
        a0.a(startAppAd.context, this.f40665a, startAppAd, false);
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad) {
        ((z6) ((y6) this.f40666b.eventTracer.a())).c(this.f40666b, ii.f);
        ((z6) ((y6) this.f40666b.eventTracer.a())).b(this.f40666b, ii.f41104a);
        StartAppAd startAppAd = this.f40666b;
        a0.b(startAppAd.context, this.f40665a, startAppAd, false);
    }
}
