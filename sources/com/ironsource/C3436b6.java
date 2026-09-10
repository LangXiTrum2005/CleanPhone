package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.b6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3436b6 extends AbstractC3626m implements InterfaceC3720r6, InterfaceC3737s6 {
    private final InterfaceC3472d6 b;
    private final C3538h0 c;
    private final InterfaceC3754t6 d;

    public /* synthetic */ C3436b6(InterfaceC3472d6 interfaceC3472d6, C3681p0 c3681p0, C3538h0 c3538h0, InterfaceC3754t6.b bVar, InterfaceC3687p6 interfaceC3687p6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC3472d6, c3681p0, c3538h0, (i & 8) != 0 ? new InterfaceC3754t6.b() : bVar, interfaceC3687p6);
    }

    public final void a(Activity activity, C3461cd c3461cd) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.c.a(c3461cd);
        this.d.a(activity);
    }

    @Override // com.ironsource.InterfaceC3737s6
    public void b(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.b.onAdLoaded(adInfo);
    }

    @Override // com.ironsource.InterfaceC3737s6
    public void c(IronSourceError ironSourceError) {
        InterfaceC3472d6 interfaceC3472d6 = this.b;
        String string = this.c.b().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adProperties.adId.toString()");
        interfaceC3472d6.a(new LevelPlayAdError(ironSourceError, string, this.c.c()));
    }

    @Override // com.ironsource.K0
    public void e() {
        this.b.onAdClicked();
    }

    public final void m() {
        this.d.loadAd();
    }

    @Override // com.ironsource.InterfaceC3737s6
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.b.onAdInfoChanged(adInfo);
    }

    @Override // com.ironsource.InterfaceC3720r6
    public void onClosed() {
        this.b.onAdClosed();
    }

    public C3436b6(InterfaceC3472d6 listener, C3681p0 adTools, C3538h0 adProperties, InterfaceC3754t6.b adUnitStrategyFactory, InterfaceC3687p6 fullscreenAdUnitFactory) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitStrategyFactory, "adUnitStrategyFactory");
        Intrinsics.checkNotNullParameter(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
        this.b = listener;
        this.c = adProperties;
        this.d = adUnitStrategyFactory.a(adTools, adTools.b(adProperties.e(), adProperties.c()), fullscreenAdUnitFactory, this, this);
    }

    @Override // com.ironsource.InterfaceC3737s6
    public void a(IronSourceError ironSourceError) {
        InterfaceC3472d6 interfaceC3472d6 = this.b;
        String string = this.c.b().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adProperties.adId.toString()");
        interfaceC3472d6.onAdLoadFailed(new LevelPlayAdError(ironSourceError, string, this.c.c()));
    }

    @Override // com.ironsource.InterfaceC3737s6
    public void a(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.b.onAdDisplayed(adInfo);
    }

    @Override // com.ironsource.InterfaceC3720r6
    public void a(LevelPlayReward reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        this.b.a(reward);
    }

    @Override // com.ironsource.InterfaceC3737s6
    public void a() {
        this.b.a();
    }
}
