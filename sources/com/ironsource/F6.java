package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class F6 implements J6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D6 f26061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0547r6 f26062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0547r6 f26063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private LevelPlayAdInfo f26064d;

    public F6(D6 strategy, C0547r6 currentAdUnit, C0547r6 progressiveAdUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(strategy, "strategy");
        kotlin.jvm.internal.n.f(currentAdUnit, "currentAdUnit");
        kotlin.jvm.internal.n.f(progressiveAdUnit, "progressiveAdUnit");
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f26061a = strategy;
        this.f26062b = currentAdUnit;
        this.f26063c = progressiveAdUnit;
        this.f26064d = adInfo;
    }

    @Override // com.ironsource.J6
    public void a(Activity activity) {
        kotlin.jvm.internal.n.f(activity, "activity");
        this.f26061a.d().c(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show called before load success"));
    }

    @Override // com.ironsource.J6
    public void b(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f26064d = adInfo;
    }

    @Override // com.ironsource.J6
    public void c(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f26061a.a("load success on progressive ad unit is already loaded");
    }

    @Override // com.ironsource.J6
    public void loadAd() {
        this.f26061a.d().b(this.f26064d);
        D6 d10 = this.f26061a;
        d10.a(new H6(d10, this.f26063c));
    }

    @Override // com.ironsource.J6
    public void c(IronSourceError ironSourceError) {
        this.f26061a.a("show failed on progressive ad unit that already loaded");
    }

    @Override // com.ironsource.J6
    public void a(IronSourceError ironSourceError) {
        this.f26061a.a("load failed on progressive ad unit that already loaded");
    }

    @Override // com.ironsource.J6
    public void a() {
        D6 d10 = this.f26061a;
        d10.a(new E6(d10, this.f26062b, true));
    }

    @Override // com.ironsource.J6
    public void a(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f26061a.a("show success on progressive ad unit that already loaded");
    }
}
