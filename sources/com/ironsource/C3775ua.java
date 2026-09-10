package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.lang.ref.WeakReference;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ua, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3775ua extends AbstractC3626m implements O2, InterfaceC3809wa {
    private final C3681p0 b;
    private final J2 c;
    private final WeakReference<InterfaceC3852z2> d;
    private LevelPlayAdInfo e;
    private final InterfaceC3792va f;

    public C3775ua(InterfaceC3852z2 listener, C3681p0 adTools, J2 bannerAdProperties, W2 bannerViewContainer) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(bannerAdProperties, "bannerAdProperties");
        Intrinsics.checkNotNullParameter(bannerViewContainer, "bannerViewContainer");
        this.b = adTools;
        this.c = bannerAdProperties;
        this.d = new WeakReference<>(listener);
        this.e = n();
        this.f = Ra.a.a(adTools, bannerViewContainer, adTools.d(bannerAdProperties.c()), bannerAdProperties, this, m(), (64 & 64) != 0 ? new InterfaceC3667o4.a() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L2 a(C3775ua this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.a(this$0.b, this$0.c, z);
    }

    private final N2 m() {
        return new N2() { // from class: com.ironsource.palewise
            @Override // com.ironsource.N2
            public final L2 a(boolean z) {
                return C3775ua.a(this.f23365attabal, z);
            }
        };
    }

    private final LevelPlayAdInfo n() {
        String string = this.c.b().toString();
        Intrinsics.checkNotNullExpressionValue(string, "bannerAdProperties.adId.toString()");
        String strC = this.c.c();
        String string2 = this.c.a().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "bannerAdProperties.adFormat.toString()");
        return new LevelPlayAdInfo(string, strC, string2, null, null, null, null, 120, null);
    }

    public final void b() {
        this.f.b();
    }

    public final void c() {
        this.f.c();
    }

    public final void d() {
        this.f.d();
    }

    @Override // com.ironsource.K0
    public void e() {
        onAdClicked();
    }

    public final void f() {
        this.f.f();
    }

    @Override // com.ironsource.O2
    public /* bridge */ /* synthetic */ Unit g() {
        o();
        return Unit.f29295attabal;
    }

    @Override // com.ironsource.O2
    public /* bridge */ /* synthetic */ Unit h() {
        q();
        return Unit.f29295attabal;
    }

    @Override // com.ironsource.InterfaceC3809wa
    public void i() {
        InterfaceC3852z2 interfaceC3852z2 = this.d.get();
        if (interfaceC3852z2 != null) {
            interfaceC3852z2.a(this.e);
        }
    }

    @Override // com.ironsource.O2
    public /* bridge */ /* synthetic */ Unit j() {
        p();
        return Unit.f29295attabal;
    }

    @Override // com.ironsource.InterfaceC3809wa
    public void k() {
        InterfaceC3852z2 interfaceC3852z2 = this.d.get();
        if (interfaceC3852z2 != null) {
            interfaceC3852z2.c(this.e);
        }
    }

    public void o() {
        onAdLeftApplication();
    }

    @Override // com.ironsource.InterfaceC3809wa
    public void onAdClicked() {
        InterfaceC3852z2 interfaceC3852z2 = this.d.get();
        if (interfaceC3852z2 != null) {
            interfaceC3852z2.d(this.e);
        }
    }

    @Override // com.ironsource.InterfaceC3809wa
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e = adInfo;
        InterfaceC3852z2 interfaceC3852z2 = this.d.get();
        if (interfaceC3852z2 != null) {
            interfaceC3852z2.b(this.e);
        }
    }

    @Override // com.ironsource.InterfaceC3809wa
    public void onAdLeftApplication() {
        InterfaceC3852z2 interfaceC3852z2 = this.d.get();
        if (interfaceC3852z2 != null) {
            interfaceC3852z2.e(this.e);
        }
    }

    @Override // com.ironsource.InterfaceC3809wa
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e = adInfo;
        InterfaceC3852z2 interfaceC3852z2 = this.d.get();
        if (interfaceC3852z2 != null) {
            interfaceC3852z2.a(adInfo, false);
        }
    }

    public void p() {
        k();
    }

    public void q() {
        i();
    }

    private final L2 a(C3681p0 c3681p0, J2 j2, boolean z) {
        IronLog.INTERNAL.verbose();
        return new L2(c3681p0, M2.z.a(j2, l().a(), z), this);
    }

    @Override // com.ironsource.InterfaceC3809wa
    public void b(IronSourceError ironSourceError) {
        InterfaceC3852z2 interfaceC3852z2 = this.d.get();
        if (interfaceC3852z2 != null) {
            String string = this.c.b().toString();
            Intrinsics.checkNotNullExpressionValue(string, "bannerAdProperties.adId.toString()");
            interfaceC3852z2.a(new LevelPlayAdError(ironSourceError, string, this.c.c()));
        }
    }

    @Override // com.ironsource.InterfaceC3809wa
    public void d(IronSourceError ironSourceError) {
        InterfaceC3852z2 interfaceC3852z2 = this.d.get();
        if (interfaceC3852z2 != null) {
            LevelPlayAdInfo levelPlayAdInfo = this.e;
            String string = this.c.b().toString();
            Intrinsics.checkNotNullExpressionValue(string, "bannerAdProperties.adId.toString()");
            interfaceC3852z2.a(levelPlayAdInfo, new LevelPlayAdError(ironSourceError, string, this.c.c()));
        }
    }
}
