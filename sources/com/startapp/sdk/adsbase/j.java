package com.startapp.sdk.adsbase;

import com.startapp.sdk.ads.external.config.ExternalConfig;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements AdEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f40667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StartAppAd f40668b;

    public j(StartAppAd startAppAd, i iVar) {
        this.f40668b = startAppAd;
        this.f40667a = iVar;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad) {
        ExternalConfig externalConfigU = MetaData.E().u();
        if (externalConfigU == null || !externalConfigU.getLoadInnerAdIfNoExternal()) {
            this.f40667a.onFailedToReceiveAd(this.f40668b);
        } else {
            StartAppAd.a(this.f40668b, this.f40667a);
        }
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad) {
        this.f40667a.onReceiveAd(ad);
    }
}
