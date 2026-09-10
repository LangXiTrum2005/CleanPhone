package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.y6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3839y6 implements InterfaceC3856z6, InterfaceC3720r6 {
    private final C3771u6 a;
    private final C3669o6 b;
    private C3669o6 c;

    public C3839y6(C3771u6 strategy, C3669o6 currentAdUnit, C3669o6 c3669o6) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.a = strategy;
        this.b = currentAdUnit;
        this.c = c3669o6;
        currentAdUnit.a(this);
    }

    @Override // com.ironsource.InterfaceC3856z6
    public void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a.a("show called while showing");
    }

    @Override // com.ironsource.InterfaceC3856z6
    public void b(C3669o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (adUnit == this.b) {
            this.a.a("load success while current ad is showing");
        }
    }

    @Override // com.ironsource.InterfaceC3856z6
    public void c(C3669o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (adUnit == this.b) {
            this.a.a("ad info changed while current ad is showing");
        }
    }

    @Override // com.ironsource.K0
    public void e() {
        this.a.c().e();
    }

    @Override // com.ironsource.InterfaceC3856z6
    public void loadAd() {
        this.a.a("load called while showing");
    }

    @Override // com.ironsource.InterfaceC3720r6
    public void onClosed() {
        this.a.a(a(this, null, 1, null));
        this.a.c().onClosed();
    }

    @Override // com.ironsource.InterfaceC3856z6
    public void a(C3669o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (Intrinsics.wireman(adUnit, this.b)) {
            this.a.d().a(adInfo);
        } else {
            this.a.a("progressive show success while showing current ad");
        }
    }

    @Override // com.ironsource.InterfaceC3856z6
    public void b(C3669o6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (adUnit == this.c) {
            this.c = null;
        } else {
            this.a.a("load failed while current ad is showing");
        }
    }

    @Override // com.ironsource.InterfaceC3856z6
    public void a(C3669o6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (!Intrinsics.wireman(adUnit, this.b)) {
            this.a.a("progressive show failed while showing current ad");
            return;
        }
        this.a.a(a(ironSourceError));
        this.a.d().c(ironSourceError);
    }

    @Override // com.ironsource.InterfaceC3856z6
    public void a(C3669o6 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (adUnit == this.c) {
            this.c = null;
        } else {
            this.a.a("ad expired while current ad is showing");
        }
    }

    @Override // com.ironsource.InterfaceC3720r6
    public void a(LevelPlayReward reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        this.a.c().a(reward);
    }

    public static /* synthetic */ InterfaceC3856z6 a(C3839y6 c3839y6, IronSourceError ironSourceError, int i, Object obj) {
        if ((i & 1) != 0) {
            ironSourceError = null;
        }
        return c3839y6.a(ironSourceError);
    }

    private final InterfaceC3856z6 a(IronSourceError ironSourceError) {
        if (Z4.a.a(ironSourceError)) {
            return new C3805w6(this.a, this.b, this.c, true);
        }
        C3669o6 c3669o6 = this.c;
        if (c3669o6 == null) {
            return new C3788v6(this.a);
        }
        if (c3669o6.e() != null) {
            return new C3805w6(this.a, c3669o6, null, false, 8, null);
        }
        return new C3822x6(this.a, c3669o6, false);
    }
}
