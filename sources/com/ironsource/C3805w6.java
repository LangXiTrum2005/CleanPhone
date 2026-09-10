package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.w6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3805w6 implements InterfaceC3856z6 {
    private final C3771u6 a;
    private final C3669o6 b;
    private C3669o6 c;
    private boolean d;

    public C3805w6(C3771u6 strategy, C3669o6 currentAdUnit, C3669o6 c3669o6, boolean z) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.a = strategy;
        this.b = currentAdUnit;
        this.c = c3669o6;
        this.d = z;
    }

    @Override // com.ironsource.InterfaceC3856z6
    public void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a.a(new C3839y6(this.a, this.b, this.c));
        this.b.a(activity, this.a);
    }

    @Override // com.ironsource.InterfaceC3856z6
    public void b(C3669o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (Intrinsics.wireman(this.b, adUnit)) {
            this.a.a("load success after current ad is loaded");
        }
    }

    @Override // com.ironsource.InterfaceC3856z6
    public void c(C3669o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (Intrinsics.wireman(adUnit, this.b)) {
            this.a.d().onAdInfoChanged(adInfo);
        }
    }

    @Override // com.ironsource.InterfaceC3856z6
    public void loadAd() {
        Unit unit;
        if (this.d) {
            this.a.a("load called while current ad is loaded");
            return;
        }
        this.d = true;
        LevelPlayAdInfo levelPlayAdInfoE = this.b.e();
        if (levelPlayAdInfoE != null) {
            this.a.d().b(levelPlayAdInfoE);
            unit = Unit.f29295attabal;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.a.a("current ad is loaded without ad info");
        } else if (this.c == null) {
            C3669o6 c3669o6A = this.a.b().a(false, this.a.c());
            this.c = c3669o6A;
            c3669o6A.a(this.a);
        }
    }

    @Override // com.ironsource.InterfaceC3856z6
    public void b(C3669o6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (Intrinsics.wireman(adUnit, this.c)) {
            this.c = null;
        } else {
            this.a.a("load failed after current ad is loaded");
        }
    }

    @Override // com.ironsource.InterfaceC3856z6
    public void a(C3669o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (Intrinsics.wireman(adUnit, this.b)) {
            this.a.a("show success when loaded");
        } else {
            this.a.a("progressive show success while current ad is loaded");
        }
    }

    public /* synthetic */ C3805w6(C3771u6 c3771u6, C3669o6 c3669o6, C3669o6 c3669o7, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3771u6, c3669o6, c3669o7, (i & 8) != 0 ? false : z);
    }

    @Override // com.ironsource.InterfaceC3856z6
    public void a(C3669o6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (Intrinsics.wireman(adUnit, this.b)) {
            this.a.a("show failed when loaded");
        } else {
            this.a.a("progressive show failed while current ad is loaded");
        }
    }

    @Override // com.ironsource.InterfaceC3856z6
    public void a(C3669o6 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (Intrinsics.wireman(adUnit, this.c)) {
            this.c = null;
        } else if (Intrinsics.wireman(adUnit, this.b)) {
            a();
        }
    }

    private final void a() {
        InterfaceC3856z6 c3822x6;
        C3669o6 c3669o6 = this.c;
        if (c3669o6 == null) {
            C3771u6 c3771u6 = this.a;
            c3771u6.a(new C3788v6(c3771u6));
        } else {
            if (c3669o6.e() != null) {
                C3771u6 c3771u7 = this.a;
                C3669o6 c3669o7 = this.c;
                Intrinsics.beachfront(c3669o7);
                c3822x6 = new C3805w6(c3771u7, c3669o7, null, false, 8, null);
            } else {
                C3771u6 c3771u8 = this.a;
                C3669o6 c3669o8 = this.c;
                Intrinsics.beachfront(c3669o8);
                c3822x6 = new C3822x6(c3771u8, c3669o8, false);
            }
            this.a.a(c3822x6);
        }
        this.a.d().a();
    }
}
