package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;

/* JADX INFO: renamed from: com.ironsource.e6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0315e6 extends AbstractC0451m implements InterfaceC0601u6, InterfaceC0619v6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0351g6 f28516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0363h0 f28517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0637w6 f28518d;

    public /* synthetic */ C0315e6(InterfaceC0351g6 interfaceC0351g6, C0506p0 c0506p0, C0363h0 c0363h0, InterfaceC0637w6.b bVar, InterfaceC0565s6 interfaceC0565s6, int i10, kotlin.jvm.internal.g gVar) {
        this(interfaceC0351g6, c0506p0, c0363h0, (i10 & 8) != 0 ? new InterfaceC0637w6.b() : bVar, interfaceC0565s6);
    }

    public final void a(Activity activity, C0358gd c0358gd) {
        kotlin.jvm.internal.n.f(activity, "activity");
        this.f28517c.a(c0358gd);
        this.f28518d.a(activity);
    }

    @Override // com.ironsource.InterfaceC0619v6
    public void b(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f28516b.onAdLoaded(adInfo);
    }

    @Override // com.ironsource.InterfaceC0619v6
    public void c(IronSourceError ironSourceError) {
        InterfaceC0351g6 interfaceC0351g6 = this.f28516b;
        String string = this.f28517c.b().toString();
        kotlin.jvm.internal.n.e(string, "adProperties.adId.toString()");
        interfaceC0351g6.a(new LevelPlayAdError(ironSourceError, string, this.f28517c.c()));
    }

    @Override // com.ironsource.K0
    public void e() {
        this.f28516b.onAdClicked();
    }

    public final void m() {
        this.f28518d.loadAd();
    }

    @Override // com.ironsource.InterfaceC0619v6
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f28516b.onAdInfoChanged(adInfo);
    }

    @Override // com.ironsource.InterfaceC0601u6
    public void onClosed() {
        this.f28516b.onAdClosed();
    }

    public C0315e6(InterfaceC0351g6 listener, C0506p0 adTools, C0363h0 adProperties, InterfaceC0637w6.b adUnitStrategyFactory, InterfaceC0565s6 fullscreenAdUnitFactory) {
        kotlin.jvm.internal.n.f(listener, "listener");
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(adProperties, "adProperties");
        kotlin.jvm.internal.n.f(adUnitStrategyFactory, "adUnitStrategyFactory");
        kotlin.jvm.internal.n.f(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
        this.f28516b = listener;
        this.f28517c = adProperties;
        this.f28518d = adUnitStrategyFactory.a(adTools, adTools.b(adProperties.e(), adProperties.c()), fullscreenAdUnitFactory, this, this);
    }

    @Override // com.ironsource.InterfaceC0619v6
    public void a(IronSourceError ironSourceError) {
        InterfaceC0351g6 interfaceC0351g6 = this.f28516b;
        String string = this.f28517c.b().toString();
        kotlin.jvm.internal.n.e(string, "adProperties.adId.toString()");
        interfaceC0351g6.onAdLoadFailed(new LevelPlayAdError(ironSourceError, string, this.f28517c.c()));
    }

    @Override // com.ironsource.InterfaceC0619v6
    public void a(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f28516b.onAdDisplayed(adInfo);
    }

    @Override // com.ironsource.InterfaceC0601u6
    public void a(LevelPlayReward reward) {
        kotlin.jvm.internal.n.f(reward, "reward");
        this.f28516b.a(reward);
    }

    @Override // com.ironsource.InterfaceC0619v6
    public void a() {
        this.f28516b.a();
    }
}
