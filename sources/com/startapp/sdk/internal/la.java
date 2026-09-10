package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;

/* JADX INFO: loaded from: classes6.dex */
public final class la implements AdEventListener {
    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad) {
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad) {
        com.startapp.sdk.adsbase.e eVar = ma.f41248a;
        if (eVar.f40658e.showAd()) {
            eVar.f40657c = System.currentTimeMillis();
            eVar.d = 0;
        }
    }
}
