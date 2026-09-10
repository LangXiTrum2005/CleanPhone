package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: renamed from: com.ironsource.o6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0494o6 implements InterfaceC0530q6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ya f29913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LevelPlayAdInfo f29914b;

    public C0494o6(Ya adInternal, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInternal, "adInternal");
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f29913a = adInternal;
        this.f29914b = adInfo;
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void a(Activity activity, String str) {
        kotlin.jvm.internal.n.f(activity, "activity");
        String string = this.f29913a.e().toString();
        kotlin.jvm.internal.n.e(string, "adInternal.adId.toString()");
        this.f29913a.a(new LevelPlayAdError(string, this.f29913a.h(), LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW, "Ad is already showing"), this.f29914b);
    }

    @Override // com.ironsource.InterfaceC0530q6
    public InterfaceC0416k0 c() {
        return new InterfaceC0416k0.a("ad is showing");
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void loadAd() {
        String string = this.f29913a.e().toString();
        kotlin.jvm.internal.n.e(string, "adInternal.adId.toString()");
        Ya.a(this.f29913a, new LevelPlayAdError(string, this.f29913a.h(), LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, "Load is called while ad is showing"), 0L, 2, null);
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void onAdClicked() {
        this.f29913a.b("onAdClicked on showing state");
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void onAdClosed() {
        this.f29913a.b("onAdClosed on showing state");
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        C0506p0 c0506p0F = this.f29913a.f();
        LevelPlayAdInfo levelPlayAdInfo = new LevelPlayAdInfo(adInfo, this.f29914b.getPlacementName());
        IronLog.INTERNAL.verbose(C0506p0.a(c0506p0F, "onAdDisplayed adInfo: " + levelPlayAdInfo, (String) null, 2, (Object) null));
        c0506p0F.d().h().e();
        Ya ya2 = this.f29913a;
        ya2.a(new C0512p6(ya2, levelPlayAdInfo));
        c0506p0F.d(new ki(28, this, levelPlayAdInfo));
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f29913a.b("onAdInfoChanged on showing state");
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void onAdLoadFailed(LevelPlayAdError error) {
        kotlin.jvm.internal.n.f(error, "error");
        this.f29913a.b("onAdLoadFailed on showing state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f29913a.b("onAdLoaded on showing state");
    }

    @Override // com.ironsource.InterfaceC0530q6
    public LevelPlayAdInfo b() {
        return this.f29914b;
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void a(LevelPlayAdError error) {
        kotlin.jvm.internal.n.f(error, "error");
        this.f29913a.a(a(error, this.f29914b));
        this.f29913a.a(error, this.f29914b);
    }

    private final InterfaceC0530q6 a(LevelPlayAdError levelPlayAdError, LevelPlayAdInfo levelPlayAdInfo) {
        if (C0242a5.f28172a.a(C0271bg.f28309a.a(levelPlayAdError))) {
            Ya ya2 = this.f29913a;
            return new C0458m6(ya2, levelPlayAdInfo, ya2.j());
        }
        return new C0369h6(this.f29913a, C0369h6.a.ShowFailed);
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void a() {
        this.f29913a.b("onAdExpired on showing state");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0494o6 this$0, LevelPlayAdInfo adInfoWithPlacement) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(adInfoWithPlacement, "$adInfoWithPlacement");
        Za zaK = this$0.f29913a.k();
        if (zaK != null) {
            zaK.onAdDisplayed(adInfoWithPlacement);
        }
    }
}
