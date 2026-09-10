package com.ironsource;

import android.app.Activity;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.k6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3597k6 implements InterfaceC3651n6 {
    private final Va a;
    private final InterfaceC3667o4 b;
    private final long c;
    private final LevelPlayAdInfo d;

    public C3597k6(Va adInternal, InterfaceC3667o4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(adInternal, "adInternal");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.a = adInternal;
        this.b = currentTimeProvider;
        this.c = currentTimeProvider.a();
        String string = adInternal.e().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        this.d = new LevelPlayAdInfo(string, adInternal.h(), adInternal.d().toString(), null, null, null, null, 120, null);
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void a(Activity activity, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String string = this.a.e().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        this.a.a(new LevelPlayAdError(string, this.a.h(), LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show is called while loading ad"), this.d);
    }

    @Override // com.ironsource.InterfaceC3651n6
    public LevelPlayAdInfo b() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC3651n6
    public InterfaceC3591k0 c() {
        return new InterfaceC3591k0.a("Ad is loading");
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void loadAd() {
        String string = this.a.e().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        this.a.a(new LevelPlayAdError(string, this.a.h(), LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED, "Load is already called"), this.b.a() - this.c);
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void onAdClicked() {
        this.a.b("onAdClicked on loading state");
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void onAdClosed() {
        this.a.b("onAdClosed on loading state");
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.b("onAdDisplayed on loading state");
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.b("onAdInfoChanged on loading state");
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void onAdLoadFailed(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.a(error, this.b.a() - this.c);
        this.a.a(C3490e6.a.LoadFailed);
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        Va va = this.a;
        va.a(new C3579j6(va, adInfo, this.b));
        this.a.a(adInfo);
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void a() {
        this.a.b("onAdExpired on loading state");
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void a(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.b("onAdDisplayFailed on loading state with error: " + error.getErrorMessage());
    }
}
