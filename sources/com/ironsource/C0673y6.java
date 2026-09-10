package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: renamed from: com.ironsource.y6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0673y6 implements C6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0655x6 f31292a;

    public C0673y6(C0655x6 strategy) {
        kotlin.jvm.internal.n.f(strategy, "strategy");
        this.f31292a = strategy;
    }

    @Override // com.ironsource.C6
    public void a(Activity activity) {
        kotlin.jvm.internal.n.f(activity, "activity");
        this.f31292a.a("show called before load success");
    }

    @Override // com.ironsource.C6
    public void b(C0547r6 adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f31292a.a("load success before load called");
    }

    @Override // com.ironsource.C6
    public void c(C0547r6 adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f31292a.a("load success with better ad before load called");
    }

    @Override // com.ironsource.C6
    public void loadAd() {
        C0547r6 c0547r6A = this.f31292a.b().a(true, this.f31292a.c());
        this.f31292a.a(new A6(this.f31292a, c0547r6A, true));
        c0547r6A.a(this.f31292a);
    }

    @Override // com.ironsource.C6
    public void a(C0547r6 adUnit) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        this.f31292a.a("ad expired before load called");
    }

    @Override // com.ironsource.C6
    public void b(C0547r6 adUnit, IronSourceError ironSourceError) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        this.f31292a.a("load failed before load called");
    }

    @Override // com.ironsource.C6
    public void a(C0547r6 adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f31292a.a("ad display success before load called");
    }

    @Override // com.ironsource.C6
    public void a(C0547r6 adUnit, IronSourceError ironSourceError) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        this.f31292a.a("ad display failed before load called");
    }
}
