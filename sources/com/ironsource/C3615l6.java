package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.l6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3615l6 implements InterfaceC3651n6 {
    private final Va a;
    private final LevelPlayAdInfo b;

    public C3615l6(Va adInternal, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInternal, "adInternal");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a = adInternal;
        this.b = adInfo;
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void a(Activity activity, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String string = this.a.e().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        this.a.a(new LevelPlayAdError(string, this.a.h(), LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW, "Ad is already showing"), this.b);
    }

    @Override // com.ironsource.InterfaceC3651n6
    public LevelPlayAdInfo b() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC3651n6
    public InterfaceC3591k0 c() {
        return new InterfaceC3591k0.a("ad is showing");
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void loadAd() {
        String string = this.a.e().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        Va.a(this.a, new LevelPlayAdError(string, this.a.h(), LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, "Load is called while ad is showing"), 0L, 2, null);
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void onAdClicked() {
        this.a.b("onAdClicked on showing state");
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void onAdClosed() {
        this.a.b("onAdClosed on showing state");
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C3681p0 c3681p0F = this.a.f();
        final LevelPlayAdInfo levelPlayAdInfo = new LevelPlayAdInfo(adInfo, this.b.getPlacementName());
        IronLog.INTERNAL.verbose(C3681p0.a(c3681p0F, "onAdDisplayed adInfo: " + levelPlayAdInfo, (String) null, 2, (Object) null));
        c3681p0F.e().h().e();
        Va va = this.a;
        va.a(new C3633m6(va, levelPlayAdInfo));
        c3681p0F.e(new Runnable() { // from class: com.ironsource.osteal
            @Override // java.lang.Runnable
            public final void run() {
                C3615l6.a(this.f23361kowloon, levelPlayAdInfo);
            }
        });
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.b("onAdInfoChanged on showing state");
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void onAdLoadFailed(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.b("onAdLoadFailed on showing state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.b("onAdLoaded on showing state");
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void a(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.a(a(error, this.b));
        this.a.a(error, this.b);
    }

    private final InterfaceC3651n6 a(LevelPlayAdError levelPlayAdError, LevelPlayAdInfo levelPlayAdInfo) {
        if (Z4.a.a(Lf.a.a(levelPlayAdError))) {
            Va va = this.a;
            return new C3579j6(va, levelPlayAdInfo, va.j());
        }
        return new C3490e6(this.a, C3490e6.a.ShowFailed);
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void a() {
        this.a.b("onAdExpired on showing state");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3615l6 this$0, LevelPlayAdInfo adInfoWithPlacement) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfoWithPlacement, "$adInfoWithPlacement");
        Wa waK = this$0.a.k();
        if (waK != null) {
            waK.onAdDisplayed(adInfoWithPlacement);
        }
    }
}
