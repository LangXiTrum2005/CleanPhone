package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.j6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3579j6 implements InterfaceC3651n6 {
    private final Va a;
    private LevelPlayAdInfo b;
    private final InterfaceC3667o4 c;
    private final long d;

    public C3579j6(Va adInternal, LevelPlayAdInfo adInfo, InterfaceC3667o4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(adInternal, "adInternal");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.a = adInternal;
        this.b = adInfo;
        this.c = currentTimeProvider;
        this.d = currentTimeProvider.a();
    }

    private final long d() {
        return this.c.a() - this.d;
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void a(Activity activity, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C3461cd c3461cdA = this.a.f().a(this.a.d(), str);
        LevelPlayAdInfo levelPlayAdInfo = new LevelPlayAdInfo(this.b, str);
        this.b = levelPlayAdInfo;
        Va va = this.a;
        va.a(new C3615l6(va, levelPlayAdInfo));
        this.a.c().a(activity, c3461cdA);
    }

    @Override // com.ironsource.InterfaceC3651n6
    public LevelPlayAdInfo b() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC3651n6
    public InterfaceC3591k0 c() {
        G3 g3A = this.a.l().g().a(this.a.h());
        return g3A.d() ? InterfaceC3591k0.a.c.a(g3A.e()) : InterfaceC3591k0.b.a;
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void loadAd() {
        this.a.f().e().h().a(Long.valueOf(d()));
        this.a.a(this.b);
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void onAdClicked() {
        this.a.b("onAdClicked on loaded state");
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void onAdClosed() {
        this.a.b("onAdClosed on loaded state");
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.b("onAdDisplayed on loaded state");
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void onAdInfoChanged(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C3681p0 c3681p0F = this.a.f();
        IronLog.INTERNAL.verbose(C3681p0.a(c3681p0F, "onAdInfoChanged adInfo: " + adInfo, (String) null, 2, (Object) null));
        c3681p0F.e().h().a(this.b, adInfo);
        this.b = adInfo;
        c3681p0F.e(new Runnable() { // from class: com.ironsource.basify
            @Override // java.lang.Runnable
            public final void run() {
                C3579j6.a(this.f23148kowloon, adInfo);
            }
        });
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void onAdLoadFailed(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.b("onAdLoadFailed on loaded state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.b("onAdLoaded on loaded state");
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void a() {
        IronLog.INTERNAL.verbose(C3681p0.a(this.a.f(), "onAdExpired", (String) null, 2, (Object) null));
        this.a.a(C3490e6.a.Expired);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3579j6 this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Wa waK = this$0.a.k();
        if (waK != null) {
            waK.onAdInfoChanged(adInfo);
        }
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void a(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.b("onAdDisplayFailed on loaded state with error: " + error.getErrorMessage());
    }
}
