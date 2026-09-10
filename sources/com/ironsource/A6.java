package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class A6 implements C6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0655x6 f25615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0547r6 f25616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25617c;

    public A6(C0655x6 strategy, C0547r6 currentAdUnit, boolean z10) {
        kotlin.jvm.internal.n.f(strategy, "strategy");
        kotlin.jvm.internal.n.f(currentAdUnit, "currentAdUnit");
        this.f25615a = strategy;
        this.f25616b = currentAdUnit;
        this.f25617c = z10;
    }

    @Override // com.ironsource.C6
    public void a(Activity activity) {
        kotlin.jvm.internal.n.f(activity, "activity");
        this.f25615a.a("show called while loading");
    }

    @Override // com.ironsource.C6
    public void b(C0547r6 adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        if (!this.f25617c) {
            this.f25615a.a(new C0691z6(this.f25615a, this.f25616b, null, false));
            return;
        }
        C0547r6 c0547r6A = this.f25615a.b().a(false, this.f25615a.c());
        this.f25615a.a(new C0691z6(this.f25615a, this.f25616b, c0547r6A, true));
        this.f25615a.d().b(adInfo);
        c0547r6A.a(this.f25615a);
    }

    @Override // com.ironsource.C6
    public void c(C0547r6 adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f25615a.a("ad info changed while loading");
    }

    @Override // com.ironsource.C6
    public void loadAd() {
        if (this.f25617c) {
            this.f25615a.a("load called while loading");
        }
        this.f25617c = true;
    }

    @Override // com.ironsource.C6
    public void a(C0547r6 adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f25615a.a("show success while loading");
    }

    @Override // com.ironsource.C6
    public void a(C0547r6 adUnit, IronSourceError ironSourceError) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        this.f25615a.a("show failed while loading");
    }

    @Override // com.ironsource.C6
    public void a(C0547r6 adUnit) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        this.f25615a.a("ad expired while loading");
    }

    @Override // com.ironsource.C6
    public void b(C0547r6 adUnit, IronSourceError ironSourceError) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        this.f25615a.a(new C0673y6(this.f25615a));
        if (this.f25617c) {
            this.f25615a.d().a(ironSourceError);
        }
    }
}
