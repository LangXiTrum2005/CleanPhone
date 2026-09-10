package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.v6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3788v6 implements InterfaceC3856z6 {
    private final C3771u6 a;

    public C3788v6(C3771u6 strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.a = strategy;
    }

    @Override // com.ironsource.InterfaceC3856z6
    public void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a.a("show called before load success");
    }

    @Override // com.ironsource.InterfaceC3856z6
    public void b(C3669o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("load success before load called");
    }

    @Override // com.ironsource.InterfaceC3856z6
    public void c(C3669o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("load success with better ad before load called");
    }

    @Override // com.ironsource.InterfaceC3856z6
    public void loadAd() {
        C3669o6 c3669o6A = this.a.b().a(true, this.a.c());
        this.a.a(new C3822x6(this.a, c3669o6A, true));
        c3669o6A.a(this.a);
    }

    @Override // com.ironsource.InterfaceC3856z6
    public void a(C3669o6 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.a.a("ad expired before load called");
    }

    @Override // com.ironsource.InterfaceC3856z6
    public void b(C3669o6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.a.a("load failed before load called");
    }

    @Override // com.ironsource.InterfaceC3856z6
    public void a(C3669o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("ad display success before load called");
    }

    @Override // com.ironsource.InterfaceC3856z6
    public void a(C3669o6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.a.a("ad display failed before load called");
    }
}
