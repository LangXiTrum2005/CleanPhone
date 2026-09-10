package com.startapp.sdk.ads.banner;

import android.graphics.Point;
import android.view.View;
import com.startapp.sdk.ads.external.ExternalAdTracking;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.AbstractC3396g;
import com.startapp.sdk.internal.d0;
import com.startapp.sdk.internal.e9;
import com.startapp.sdk.internal.h0;
import com.startapp.sdk.internal.n1;
import java.util.Collections;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BannerListener f40471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f40472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f40473c = UUID.randomUUID().toString();
    public final String d = AbstractC3396g.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BannerRequest.Callback f40474e;
    public final /* synthetic */ AdPreferences f;
    public final /* synthetic */ Point g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AdUnitConfig f40475h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f40476i;
    public final /* synthetic */ MetaData j;
    public final /* synthetic */ BannerRequest k;

    public d(BannerRequest bannerRequest, BannerRequest.Callback callback, AdPreferences adPreferences, Point point, AdUnitConfig adUnitConfig, int i2, MetaData metaData) {
        this.k = bannerRequest;
        this.f40474e = callback;
        this.f = adPreferences;
        this.g = point;
        this.f40475h = adUnitConfig;
        this.f40476i = i2;
        this.j = metaData;
    }

    @Override // com.startapp.sdk.internal.d0
    public final void a() {
    }

    @Override // com.startapp.sdk.internal.d0
    public final void b() {
    }

    @Override // com.startapp.sdk.internal.d0
    public final void c() {
        BannerListener bannerListener = this.f40471a;
        if (bannerListener != null) {
            bannerListener.onClick(this.f40472b);
        }
        h0.a(this.k.context, this.j.c(), new ExternalAdTracking(this.f40473c, this.k.adPreferences.getAdTag(), this.f40475h.getSioPrice(), this.f40475h.getBp(), AdPreferences.Placement.INAPP_BANNER, this.d, null, "DISABLED", this.g, "BANNER"));
    }

    @Override // com.startapp.sdk.internal.d0
    public final void d() {
        BannerListener bannerListener = this.f40471a;
        if (bannerListener != null) {
            bannerListener.onImpression(this.f40472b);
        }
        e9.a(this.k.context, Collections.singletonList(this.j.B()), (TrackingParams) new ExternalAdTracking(this.f40473c, this.k.adPreferences.getAdTag(), this.f40475h.getSioPrice(), this.f40475h.getBp(), AdPreferences.Placement.INAPP_BANNER, this.d, null, "DISABLED", this.g, "BANNER"));
    }

    @Override // com.startapp.sdk.internal.d0
    public final void a(View view) {
        if (view == null) {
            this.f40474e.onFinished(null, "No view returned");
        } else {
            this.f40474e.onFinished(new n1(this, view), null);
            this.k.sendInfoAdRequest(true, this.f40473c, this.d, this.f, this.g, this.f40475h, this.f40476i);
        }
    }

    @Override // com.startapp.sdk.internal.d0
    public final void a(String str) {
        this.f40474e.onFinished(null, str);
        this.k.sendInfoAdRequest(false, this.f40473c, this.d, this.f, this.g, this.f40475h, this.f40476i);
    }
}
