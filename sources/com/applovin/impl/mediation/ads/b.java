package com.applovin.impl.mediation.ads;

import android.view.ViewGroup;
import com.applovin.impl.f3;
import com.applovin.impl.h8;
import com.applovin.impl.i8;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class b implements i8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f8550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f3 f8551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i8 f8552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h8 f8553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a.InterfaceC0010a f8554e;

    public b(f3 f3Var, ViewGroup viewGroup, a.InterfaceC0010a interfaceC0010a, l lVar) {
        this.f8550a = lVar;
        this.f8551b = f3Var;
        this.f8554e = interfaceC0010a;
        this.f8553d = new h8(viewGroup, lVar);
        i8 i8Var = new i8(viewGroup, lVar, this);
        this.f8552c = i8Var;
        i8Var.a(f3Var);
        lVar.Q();
        if (p.a()) {
            lVar.Q().a("MaxNativeAdView", "Created new MaxNativeAdView (" + this + ")");
        }
    }

    public void a() {
        this.f8552c.b();
    }

    public f3 b() {
        return this.f8551b;
    }

    public void c() {
        this.f8550a.Q();
        if (p.a()) {
            this.f8550a.Q().a("MaxNativeAdView", "Handling view attached to window");
        }
        if (this.f8551b.x0().compareAndSet(false, true)) {
            this.f8550a.Q();
            if (p.a()) {
                this.f8550a.Q().a("MaxNativeAdView", "Scheduling impression for ad manually...");
            }
            if (this.f8551b.getNativeAd().isExpired()) {
                p.h("MaxNativeAdView", "Attempting to display an expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            } else {
                this.f8550a.f().a(this.f8551b);
            }
            this.f8550a.Z().processRawAdImpression(this.f8551b, this.f8554e);
        }
    }

    @Override // com.applovin.impl.i8.a
    public void onLogVisibilityImpression() {
        a(this.f8553d.a(this.f8551b));
    }

    private void a(long j10) {
        if (this.f8551b.y0().compareAndSet(false, true)) {
            this.f8550a.Q();
            if (p.a()) {
                this.f8550a.Q().a("MaxNativeAdView", "Scheduling viewability impression for ad...");
            }
            this.f8550a.Z().processViewabilityAdImpressionPostback(this.f8551b, j10, this.f8554e);
        }
    }
}
