package com.startapp.sdk.ads.banner.bannerstandard;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerListener;
import com.startapp.sdk.ads.external.ExternalAdTracking;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.AbstractC3396g;
import com.startapp.sdk.internal.d0;
import com.startapp.sdk.internal.e9;
import com.startapp.sdk.internal.h0;
import com.startapp.sdk.internal.i1;
import com.startapp.sdk.internal.i7;
import com.startapp.sdk.internal.k1;
import com.startapp.sdk.internal.w6;
import java.util.Collections;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40454a = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40455b = AbstractC3396g.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Point f40456c;
    public final /* synthetic */ i7 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AdUnitConfig f40457e;
    public final /* synthetic */ int f;
    public final /* synthetic */ MetaData g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ BannerStandard f40458h;

    public b(BannerStandard bannerStandard, Point point, i7 i7Var, AdUnitConfig adUnitConfig, int i2, MetaData metaData) {
        this.f40458h = bannerStandard;
        this.f40456c = point;
        this.d = i7Var;
        this.f40457e = adUnitConfig;
        this.f = i2;
        this.g = metaData;
    }

    @Override // com.startapp.sdk.internal.d0
    public final void a() {
    }

    @Override // com.startapp.sdk.internal.d0
    public final void b() {
    }

    @Override // com.startapp.sdk.internal.d0
    public final void c() {
        Context context = this.f40458h.getContext();
        BannerStandard bannerStandard = this.f40458h;
        k1.a(context, bannerStandard.listener, (View) bannerStandard, (String) null);
        h0.a(this.f40458h.getContext(), this.g.c(), new ExternalAdTracking(this.f40454a, this.f40458h.getAdTag(), this.f40457e.getSioPrice(), this.f40457e.getBp(), AdPreferences.Placement.INAPP_BANNER, this.f40455b, null, "DISABLED", this.f40456c, "BANNER"));
    }

    @Override // com.startapp.sdk.internal.d0
    public final void d() {
        Context context = this.f40458h.getContext();
        BannerStandard bannerStandard = this.f40458h;
        BannerListener bannerListener = bannerStandard.listener;
        w6.a("onImpression", bannerListener != null, null, null);
        h0.a(bannerListener != null ? new i1(context, bannerListener, bannerStandard) : null);
        e9.a(this.f40458h.getContext(), Collections.singletonList(this.g.B()), (TrackingParams) new ExternalAdTracking(this.f40454a, this.f40458h.getAdTag(), this.f40457e.getSioPrice(), this.f40457e.getBp(), AdPreferences.Placement.INAPP_BANNER, this.f40455b, null, "DISABLED", this.f40456c, "BANNER"));
    }

    @Override // com.startapp.sdk.internal.d0
    public final void a(View view) {
        if (view == null) {
            this.f40458h.sendLoadError("No view returned");
            return;
        }
        this.f40458h.updateBannerView();
        BannerStandard bannerStandard = this.f40458h;
        Point point = this.f40456c;
        bannerStandard.attachAdViewToContainer(view, point.x, point.y);
        Context context = this.f40458h.getContext();
        BannerStandard bannerStandard2 = this.f40458h;
        k1.b(context, bannerStandard2.listener, bannerStandard2, null);
        this.d.a(Boolean.TRUE);
        BannerStandard bannerStandard3 = this.f40458h;
        bannerStandard3.sendInfoAdRequest(true, this.f40454a, this.f40455b, bannerStandard3.getAdPreferences(), this.f40456c, this.f40457e, this.f);
    }

    @Override // com.startapp.sdk.internal.d0
    public final void a(String str) {
        this.f40458h.sendLoadError(str);
        this.d.a(Boolean.FALSE);
        BannerStandard bannerStandard = this.f40458h;
        bannerStandard.sendInfoAdRequest(false, this.f40454a, this.f40455b, bannerStandard.getAdPreferences(), this.f40456c, this.f40457e, this.f);
    }
}
