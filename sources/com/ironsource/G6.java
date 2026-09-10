package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class G6 implements J6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D6 f26133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0547r6 f26134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0547r6 f26135c;

    public G6(D6 strategy, C0547r6 currentAdUnit, C0547r6 progressiveAdUnit) {
        kotlin.jvm.internal.n.f(strategy, "strategy");
        kotlin.jvm.internal.n.f(currentAdUnit, "currentAdUnit");
        kotlin.jvm.internal.n.f(progressiveAdUnit, "progressiveAdUnit");
        this.f26133a = strategy;
        this.f26134b = currentAdUnit;
        this.f26135c = progressiveAdUnit;
    }

    @Override // com.ironsource.J6
    public void a(Activity activity) {
        kotlin.jvm.internal.n.f(activity, "activity");
        this.f26133a.d().c(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_WHILE_LOAD, "Show called while progressive loading another ad"));
    }

    @Override // com.ironsource.J6
    public void b(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f26133a.a("load success with better ad before progressive load success");
    }

    @Override // com.ironsource.J6
    public void c(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        D6 d10 = this.f26133a;
        d10.a(new F6(d10, this.f26134b, this.f26135c, adInfo));
    }

    @Override // com.ironsource.J6
    public void loadAd() {
        D6 d10 = this.f26133a;
        d10.a(new I6(d10, this.f26135c));
    }

    @Override // com.ironsource.J6
    public void a(IronSourceError ironSourceError) {
        D6 d10 = this.f26133a;
        d10.a(new E6(d10, this.f26134b, false, 4, null));
    }

    @Override // com.ironsource.J6
    public void a() {
        this.f26133a.a("ad expired before progressive load success");
    }

    @Override // com.ironsource.J6
    public void a(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f26133a.a("show success before progressive load success");
    }

    @Override // com.ironsource.J6
    public void c(IronSourceError ironSourceError) {
        this.f26133a.a("show failed before progressive load success");
    }
}
