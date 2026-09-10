package com.startapp.sdk.adsbase;

import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.consent.ConsentData;
import com.startapp.sdk.internal.a0;
import com.startapp.sdk.internal.h6;
import com.startapp.sdk.internal.vi;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements AdEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdEventListener f40593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ad f40594b;

    public a(Ad ad, AdEventListener adEventListener) {
        this.f40594b = ad;
        this.f40593a = adEventListener;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad) {
        a0.a(this.f40594b.context, this.f40593a, ad, false);
        String errorMessage = ad != null ? ad.getErrorMessage() : null;
        if (errorMessage == null) {
            errorMessage = "";
        } else if (errorMessage.contains("204")) {
            errorMessage = "NO FILL";
        }
        vi.a(6, this.f40594b.context, android.support.v4.media.a.s(new StringBuilder("Failed to load "), ad != null ? vi.a(ad) : "", " ad: ", errorMessage));
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad) {
        this.f40594b.lastLoadTime = Long.valueOf(System.currentTimeMillis());
        a0.b(this.f40594b.context, this.f40593a, ad, false);
        ConsentData consentData = ad.getConsentData();
        if (consentData != null) {
            ((h6) this.f40594b.consentManager.a()).a(consentData.f(), consentData.e(), consentData.a(), false, true);
        }
        vi.a(4, this.f40594b.context, "Loaded " + vi.a(ad) + " ad with creative ID - " + ad.getAdId());
    }
}
