package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.m6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3633m6 implements InterfaceC3651n6 {
    private final Va a;
    private final LevelPlayAdInfo b;

    public C3633m6(Va adInternal, LevelPlayAdInfo adInfo) {
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
        this.a.a(new LevelPlayAdError(string, this.a.h(), LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW, "Ad is already shown"), this.b);
    }

    @Override // com.ironsource.InterfaceC3651n6
    public LevelPlayAdInfo b() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC3651n6
    public InterfaceC3591k0 c() {
        return new InterfaceC3591k0.a("ad is shown");
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void loadAd() {
        String string = this.a.e().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        Va.a(this.a, new LevelPlayAdError(string, this.a.h(), LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, "Load is called while ad is shown"), 0L, 2, null);
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void onAdClicked() {
        IronLog.INTERNAL.verbose(C3681p0.a(this.a.f(), "onAdClicked adInfo: " + this.b, (String) null, 2, (Object) null));
        this.a.f().e(new Runnable() { // from class: com.ironsource.microchemistry
            @Override // java.lang.Runnable
            public final void run() {
                C3633m6.a(this.f23341kowloon);
            }
        });
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void onAdClosed() {
        IronLog.INTERNAL.verbose(C3681p0.a(this.a.f(), "onAdClosed adInfo: " + this.b, (String) null, 2, (Object) null));
        this.a.f().d(new Runnable() { // from class: com.ironsource.fastrack
            @Override // java.lang.Runnable
            public final void run() {
                C3633m6.b(this.f23239kowloon);
            }
        });
        this.a.f().e(new Runnable() { // from class: com.ironsource.cosy
            @Override // java.lang.Runnable
            public final void run() {
                C3633m6.c(this.f23189kowloon);
            }
        });
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.b("onAdDisplayed on shown state");
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.b("onAdInfoChanged on shown state");
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void onAdLoadFailed(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.b("onAdLoadFailed on shown state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.b("onAdLoaded on shown state");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3633m6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a.a(C3490e6.a.Closed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C3633m6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Wa waK = this$0.a.k();
        if (waK != null) {
            waK.onAdClosed(this$0.b);
        }
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void a() {
        this.a.b("onAdExpired on shown state");
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void a(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.b("onAdDisplayFailed on shown state with error: " + error.getErrorMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3633m6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Wa waK = this$0.a.k();
        if (waK != null) {
            waK.onAdClicked(this$0.b);
        }
    }
}
