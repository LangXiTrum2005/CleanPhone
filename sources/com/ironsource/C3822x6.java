package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.x6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3822x6 implements InterfaceC3856z6 {
    private final C3771u6 a;
    private final C3669o6 b;
    private boolean c;

    public C3822x6(C3771u6 strategy, C3669o6 currentAdUnit, boolean z) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.a = strategy;
        this.b = currentAdUnit;
        this.c = z;
    }

    @Override // com.ironsource.InterfaceC3856z6
    public void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a.a("show called while loading");
    }

    @Override // com.ironsource.InterfaceC3856z6
    public void b(C3669o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (!this.c) {
            this.a.a(new C3805w6(this.a, this.b, null, false));
            return;
        }
        C3669o6 c3669o6A = this.a.b().a(false, this.a.c());
        this.a.a(new C3805w6(this.a, this.b, c3669o6A, true));
        this.a.d().b(adInfo);
        c3669o6A.a(this.a);
    }

    @Override // com.ironsource.InterfaceC3856z6
    public void c(C3669o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("ad info changed while loading");
    }

    @Override // com.ironsource.InterfaceC3856z6
    public void loadAd() {
        if (this.c) {
            this.a.a("load called while loading");
        }
        this.c = true;
    }

    @Override // com.ironsource.InterfaceC3856z6
    public void a(C3669o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("show success while loading");
    }

    @Override // com.ironsource.InterfaceC3856z6
    public void a(C3669o6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.a.a("show failed while loading");
    }

    @Override // com.ironsource.InterfaceC3856z6
    public void a(C3669o6 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.a.a("ad expired while loading");
    }

    @Override // com.ironsource.InterfaceC3856z6
    public void b(C3669o6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.a.a(new C3788v6(this.a));
        if (this.c) {
            this.a.d().a(ironSourceError);
        }
    }
}
