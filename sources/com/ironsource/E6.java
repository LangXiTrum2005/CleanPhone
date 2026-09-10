package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class E6 implements J6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D6 f25997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0547r6 f25998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f25999c;

    public E6(D6 strategy, C0547r6 c0547r6, boolean z10) {
        kotlin.jvm.internal.n.f(strategy, "strategy");
        this.f25997a = strategy;
        this.f25998b = c0547r6;
        this.f25999c = z10;
    }

    @Override // com.ironsource.J6
    public void a(Activity activity) {
        kotlin.jvm.internal.n.f(activity, "activity");
        this.f25997a.d().c(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, this.f25999c ? "Show called on expired ad" : "Show called before load success"));
    }

    @Override // com.ironsource.J6
    public void b(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f25997a.a(this.f25999c ? "load with better ad on expired ad" : "load success with better ad before load success");
    }

    @Override // com.ironsource.J6
    public void c(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f25997a.a(this.f25999c ? "load success on expired ad" : "load success before load called");
    }

    @Override // com.ironsource.J6
    public void loadAd() {
        C0547r6 c0547r6A = this.f25997a.b().a(true, this.f25997a.c());
        D6 d10 = this.f25997a;
        d10.a(new I6(d10, c0547r6A));
        c0547r6A.a(this.f25997a);
    }

    @Override // com.ironsource.J6
    public void c(IronSourceError ironSourceError) {
        this.f25997a.a(this.f25999c ? "show failed on expired ad" : "show failed before load called");
    }

    public /* synthetic */ E6(D6 d10, C0547r6 c0547r6, boolean z10, int i10, kotlin.jvm.internal.g gVar) {
        this(d10, c0547r6, (i10 & 4) != 0 ? false : z10);
    }

    @Override // com.ironsource.J6
    public void a(IronSourceError ironSourceError) {
        this.f25997a.a(this.f25999c ? "load failed on expired ad" : "load failed before load called");
    }

    @Override // com.ironsource.J6
    public void a() {
        this.f25997a.a(this.f25999c ? "ad expired on expired ad" : "ad expired before load called");
    }

    @Override // com.ironsource.J6
    public void a(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f25997a.a(this.f25999c ? "show success on expired ad" : "show success before load called");
    }
}
