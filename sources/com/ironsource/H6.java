package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class H6 implements J6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D6 f26235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0547r6 f26236b;

    public H6(D6 strategy, C0547r6 adUnit) {
        kotlin.jvm.internal.n.f(strategy, "strategy");
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        this.f26235a = strategy;
        this.f26236b = adUnit;
    }

    @Override // com.ironsource.J6
    public void a(Activity activity) {
        kotlin.jvm.internal.n.f(activity, "activity");
        this.f26236b.a(activity, this.f26235a);
    }

    @Override // com.ironsource.J6
    public void b(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f26235a.d().onAdInfoChanged(adInfo);
    }

    @Override // com.ironsource.J6
    public void c(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f26235a.a("Ad unit is already loaded");
    }

    @Override // com.ironsource.J6
    public void loadAd() {
        D6 d10 = this.f26235a;
        d10.a(new E6(d10, null, false, 4, null));
        this.f26235a.loadAd();
    }

    @Override // com.ironsource.J6
    public void a(IronSourceError ironSourceError) {
        this.f26235a.a("load failed after ad unit is already loaded");
    }

    @Override // com.ironsource.J6
    public void c(IronSourceError ironSourceError) {
        if (!C0242a5.f28172a.a(ironSourceError)) {
            D6 d10 = this.f26235a;
            d10.a(new E6(d10, null, false, 4, null));
        }
        this.f26235a.d().c(ironSourceError);
    }

    @Override // com.ironsource.J6
    public void a() {
        D6 d10 = this.f26235a;
        d10.a(new E6(d10, null, true));
        this.f26235a.d().a();
    }

    @Override // com.ironsource.J6
    public void a(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f26235a.d().a(adInfo);
        C0547r6 c0547r6A = this.f26235a.b().a(false, this.f26235a.c());
        D6 d10 = this.f26235a;
        d10.a(new G6(d10, this.f26236b, c0547r6A));
        c0547r6A.a(this.f26235a);
    }
}
