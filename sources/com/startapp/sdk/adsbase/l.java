package com.startapp.sdk.adsbase;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import com.startapp.sdk.ads.external.ExternalAdTracking;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.AbstractC3396g;
import com.startapp.sdk.internal.d0;
import com.startapp.sdk.internal.e9;
import com.startapp.sdk.internal.h0;
import com.startapp.sdk.internal.nj;
import com.startapp.sdk.internal.u;
import com.startapp.sdk.internal.v;
import com.startapp.sdk.internal.w;
import com.startapp.sdk.internal.w6;
import com.startapp.sdk.internal.y;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40672a = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40673b = AbstractC3396g.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f40674c;
    public final /* synthetic */ AdEventListener d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AdUnitConfig f40675e;
    public final /* synthetic */ int f;
    public final /* synthetic */ MetaData g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Point f40676h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ StartAppAd f40677i;

    public l(StartAppAd startAppAd, AdEventListener adEventListener, AdUnitConfig adUnitConfig, int i2, MetaData metaData, Point point) {
        this.f40677i = startAppAd;
        this.d = adEventListener;
        this.f40675e = adUnitConfig;
        this.f = i2;
        this.g = metaData;
        this.f40676h = point;
        this.f40674c = startAppAd.g == StartAppAd.AdMode.REWARDED_VIDEO;
    }

    @Override // com.startapp.sdk.internal.d0
    public final void a(View view) {
        this.d.onReceiveAd(this.f40677i);
        StartAppAd startAppAd = this.f40677i;
        StartAppAd.a(startAppAd, true, this.f40672a, this.f40673b, startAppAd.f40587h, this.f40675e, this.f);
    }

    @Override // com.startapp.sdk.internal.d0
    public final void b() {
        this.f40677i.f = null;
        StartAppAd startAppAd = this.f40677i;
        Context context = startAppAd.context;
        AdDisplayListener adDisplayListener = startAppAd.j;
        w6.a("adHidden", adDisplayListener != null, null, null);
        h0.a(adDisplayListener != null ? new u(context, adDisplayListener, startAppAd) : null);
    }

    @Override // com.startapp.sdk.internal.d0
    public final void c() {
        StartAppAd startAppAd = this.f40677i;
        Context context = startAppAd.context;
        AdDisplayListener adDisplayListener = startAppAd.j;
        w6.a("onClicked", adDisplayListener != null, null, null);
        h0.a(adDisplayListener != null ? new w(context, adDisplayListener, startAppAd) : null);
        Context context2 = this.f40677i.context;
        String strC = this.g.c();
        String str = this.f40672a;
        String adTag = this.f40677i.f40587h.getAdTag();
        String sioPrice = this.f40675e.getSioPrice();
        String bp = this.f40675e.getBp();
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_OVERLAY;
        String str2 = this.f40673b;
        Boolean boolValueOf = Boolean.valueOf(this.f40674c);
        boolean z2 = this.f40674c;
        h0.a(context2, strC, new ExternalAdTracking(str, adTag, sioPrice, bp, placement, str2, boolValueOf, z2 ? "FORCED" : "ENABLED", this.f40676h, z2 ? "VIDEO" : "INTERSTITIAL"));
    }

    @Override // com.startapp.sdk.internal.d0
    public final void d() {
        this.f40677i.f = null;
        StartAppAd startAppAd = this.f40677i;
        Context context = startAppAd.context;
        AdDisplayListener adDisplayListener = startAppAd.j;
        w6.a("onShow", adDisplayListener != null, null, null);
        h0.a(adDisplayListener != null ? new v(context, adDisplayListener, startAppAd) : null);
        Context context2 = this.f40677i.context;
        List listSingletonList = Collections.singletonList(this.g.B());
        String str = this.f40672a;
        String adTag = this.f40677i.f40587h.getAdTag();
        String sioPrice = this.f40675e.getSioPrice();
        String bp = this.f40675e.getBp();
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_OVERLAY;
        String str2 = this.f40673b;
        Boolean boolValueOf = Boolean.valueOf(this.f40674c);
        boolean z2 = this.f40674c;
        e9.a(context2, listSingletonList, (TrackingParams) new ExternalAdTracking(str, adTag, sioPrice, bp, placement, str2, boolValueOf, z2 ? "FORCED" : "ENABLED", this.f40676h, z2 ? "VIDEO" : "INTERSTITIAL"));
    }

    public final void e() {
        StartAppAd startAppAd = this.f40677i;
        y.a(startAppAd.context, startAppAd.j, startAppAd);
    }

    public final void f() {
        StartAppAd startAppAd = this.f40677i;
        Context context = startAppAd.context;
        com.startapp.sdk.adsbase.adlisteners.VideoListener videoListener = startAppAd.f40588i;
        w6.a("onVideoCompleted", videoListener != null, null, null);
        h0.a(videoListener != null ? new nj(videoListener, context) : null);
    }

    @Override // com.startapp.sdk.internal.d0
    public final void a(String str) {
        this.f40677i.f = null;
        this.d.onFailedToReceiveAd(this.f40677i);
        StartAppAd startAppAd = this.f40677i;
        StartAppAd.a(startAppAd, false, this.f40672a, this.f40673b, startAppAd.f40587h, this.f40675e, this.f);
    }

    @Override // com.startapp.sdk.internal.d0
    public final void a() {
        this.f40677i.f = null;
    }
}
