package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uh f14762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final la f14763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d4 f14764c;
    public final g4 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s4 f14765e;
    public final v9 f;
    public final hd g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l1 f14766h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k6 f14767i;
    public final h3 j;
    public final n9 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final z f14768l;
    public final y m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f14769n;
    public final u9 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h9 f14770p;
    public final n0 q;
    public final z6 r;

    public o9(uh urlResolver, la intentResolver, d4 clickRequest, g4 clickTracking, s4 completeRequest, v9 mediaType, hd openMeasurementImpressionCallback, l1 appRequest, k6 downloader, h3 viewProtocol, n9 impressionCounter, z adUnit, y adTypeTraits, String location, u9 impressionCallback, h9 impressionClickCallback, n0 adUnitRendererImpressionCallback, z6 eventTracker) {
        Intrinsics.f(urlResolver, "urlResolver");
        Intrinsics.f(intentResolver, "intentResolver");
        Intrinsics.f(clickRequest, "clickRequest");
        Intrinsics.f(clickTracking, "clickTracking");
        Intrinsics.f(completeRequest, "completeRequest");
        Intrinsics.f(mediaType, "mediaType");
        Intrinsics.f(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.f(appRequest, "appRequest");
        Intrinsics.f(downloader, "downloader");
        Intrinsics.f(viewProtocol, "viewProtocol");
        Intrinsics.f(impressionCounter, "impressionCounter");
        Intrinsics.f(adUnit, "adUnit");
        Intrinsics.f(adTypeTraits, "adTypeTraits");
        Intrinsics.f(location, "location");
        Intrinsics.f(impressionCallback, "impressionCallback");
        Intrinsics.f(impressionClickCallback, "impressionClickCallback");
        Intrinsics.f(adUnitRendererImpressionCallback, "adUnitRendererImpressionCallback");
        Intrinsics.f(eventTracker, "eventTracker");
        this.f14762a = urlResolver;
        this.f14763b = intentResolver;
        this.f14764c = clickRequest;
        this.d = clickTracking;
        this.f14765e = completeRequest;
        this.f = mediaType;
        this.g = openMeasurementImpressionCallback;
        this.f14766h = appRequest;
        this.f14767i = downloader;
        this.j = viewProtocol;
        this.k = impressionCounter;
        this.f14768l = adUnit;
        this.m = adTypeTraits;
        this.f14769n = location;
        this.o = impressionCallback;
        this.f14770p = impressionClickCallback;
        this.q = adUnitRendererImpressionCallback;
        this.r = eventTracker;
    }

    public final y a() {
        return this.m;
    }

    public final z b() {
        return this.f14768l;
    }

    public final n0 c() {
        return this.q;
    }

    public final l1 d() {
        return this.f14766h;
    }

    public final d4 e() {
        return this.f14764c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9)) {
            return false;
        }
        o9 o9Var = (o9) obj;
        return Intrinsics.a(this.f14762a, o9Var.f14762a) && Intrinsics.a(this.f14763b, o9Var.f14763b) && Intrinsics.a(this.f14764c, o9Var.f14764c) && Intrinsics.a(this.d, o9Var.d) && Intrinsics.a(this.f14765e, o9Var.f14765e) && this.f == o9Var.f && Intrinsics.a(this.g, o9Var.g) && Intrinsics.a(this.f14766h, o9Var.f14766h) && Intrinsics.a(this.f14767i, o9Var.f14767i) && Intrinsics.a(this.j, o9Var.j) && Intrinsics.a(this.k, o9Var.k) && Intrinsics.a(this.f14768l, o9Var.f14768l) && Intrinsics.a(this.m, o9Var.m) && Intrinsics.a(this.f14769n, o9Var.f14769n) && Intrinsics.a(this.o, o9Var.o) && Intrinsics.a(this.f14770p, o9Var.f14770p) && Intrinsics.a(this.q, o9Var.q) && Intrinsics.a(this.r, o9Var.r);
    }

    public final g4 f() {
        return this.d;
    }

    public final s4 g() {
        return this.f14765e;
    }

    public final k6 h() {
        return this.f14767i;
    }

    public int hashCode() {
        return this.r.hashCode() + ((this.q.hashCode() + ((this.f14770p.hashCode() + ((this.o.hashCode() + androidx.datastore.preferences.protobuf.a.b(this.f14769n, (this.m.hashCode() + ((this.f14768l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.f14767i.hashCode() + ((this.f14766h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.f14765e.hashCode() + ((this.d.hashCode() + ((this.f14764c.hashCode() + ((this.f14763b.hashCode() + (this.f14762a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31)) * 31);
    }

    public final z6 i() {
        return this.r;
    }

    public final u9 j() {
        return this.o;
    }

    public final h9 k() {
        return this.f14770p;
    }

    public final n9 l() {
        return this.k;
    }

    public final la m() {
        return this.f14763b;
    }

    public final String n() {
        return this.f14769n;
    }

    public final v9 o() {
        return this.f;
    }

    public final hd p() {
        return this.g;
    }

    public final uh q() {
        return this.f14762a;
    }

    public final h3 r() {
        return this.j;
    }

    public String toString() {
        return "ImpressionDependency(urlResolver=" + this.f14762a + ", intentResolver=" + this.f14763b + ", clickRequest=" + this.f14764c + ", clickTracking=" + this.d + ", completeRequest=" + this.f14765e + ", mediaType=" + this.f + ", openMeasurementImpressionCallback=" + this.g + ", appRequest=" + this.f14766h + ", downloader=" + this.f14767i + ", viewProtocol=" + this.j + ", impressionCounter=" + this.k + ", adUnit=" + this.f14768l + ", adTypeTraits=" + this.m + ", location=" + this.f14769n + ", impressionCallback=" + this.o + ", impressionClickCallback=" + this.f14770p + ", adUnitRendererImpressionCallback=" + this.q + ", eventTracker=" + this.r + ")";
    }
}
