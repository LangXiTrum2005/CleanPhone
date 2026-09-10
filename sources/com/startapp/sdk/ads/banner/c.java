package com.startapp.sdk.ads.banner;

import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.internal.r1;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements AdEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerRequest.Callback f40468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BannerFormat f40469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdPreferences f40470c;
    public final /* synthetic */ r1 d;

    public c(BannerRequest.Callback callback, BannerFormat bannerFormat, AdPreferences adPreferences, r1 r1Var) {
        this.f40468a = callback;
        this.f40469b = bannerFormat;
        this.f40470c = adPreferences;
        this.d = r1Var;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad) {
        this.f40468a.onFinished(null, String.valueOf(this.d.getErrorMessage()));
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad) {
        this.f40468a.onFinished(new b(this), null);
    }
}
