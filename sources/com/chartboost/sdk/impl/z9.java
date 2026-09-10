package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.Mediation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class z9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lh f15707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a8 f15708c;
    public final e3 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dj f15709e;
    public final Mediation f;
    public final z2 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final hd f15710h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z6 f15711i;

    public z9(Context context, lh uiPoster, a8 fileCache, e3 templateProxy, dj videoRepository, Mediation mediation, z2 networkService, hd openMeasurementImpressionCallback, z6 eventTracker) {
        Intrinsics.f(context, "context");
        Intrinsics.f(uiPoster, "uiPoster");
        Intrinsics.f(fileCache, "fileCache");
        Intrinsics.f(templateProxy, "templateProxy");
        Intrinsics.f(videoRepository, "videoRepository");
        Intrinsics.f(networkService, "networkService");
        Intrinsics.f(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.f(eventTracker, "eventTracker");
        this.f15706a = context;
        this.f15707b = uiPoster;
        this.f15708c = fileCache;
        this.d = templateProxy;
        this.f15709e = videoRepository;
        this.f = mediation;
        this.g = networkService;
        this.f15710h = openMeasurementImpressionCallback;
        this.f15711i = eventTracker;
    }

    public final h3 a(String location, z adUnit, String adTypeTraitsName, String html, n0 adUnitRendererImpressionCallback, t9 impressionInterface, dk webViewTimeoutInterface, qc nativeBridgeCommand) {
        Intrinsics.f(location, "location");
        Intrinsics.f(adUnit, "adUnit");
        Intrinsics.f(adTypeTraitsName, "adTypeTraitsName");
        Intrinsics.f(html, "html");
        Intrinsics.f(adUnitRendererImpressionCallback, "adUnitRendererImpressionCallback");
        Intrinsics.f(impressionInterface, "impressionInterface");
        Intrinsics.f(webViewTimeoutInterface, "webViewTimeoutInterface");
        Intrinsics.f(nativeBridgeCommand, "nativeBridgeCommand");
        if (adUnit.C().length() > 0) {
            return new bj(this.f15706a, location, adUnit.q(), adTypeTraitsName, this.f15707b, this.f15708c, this.d, this.f15709e, adUnit.B(), this.f, w3.f15454b.a().l(), this.g, html, this.f15710h, adUnitRendererImpressionCallback, impressionInterface, webViewTimeoutInterface, nativeBridgeCommand, this.f15711i, null, 524288, null);
        }
        return adUnit.u() == cf.HTML ? new o2(this.f15706a, location, adUnit.q(), adTypeTraitsName, this.f15708c, this.g, this.f15707b, this.d, this.f, adUnit.e(), adUnit.j(), adUnit.n(), this.f15710h, adUnitRendererImpressionCallback, impressionInterface, webViewTimeoutInterface, adUnit.x(), this.f15711i, null, null, 786432, null) : new u2(this.f15706a, location, adUnit.q(), adTypeTraitsName, this.f15708c, this.g, this.f15707b, this.d, this.f, html, this.f15710h, adUnitRendererImpressionCallback, impressionInterface, webViewTimeoutInterface, nativeBridgeCommand, this.f15711i);
    }
}
