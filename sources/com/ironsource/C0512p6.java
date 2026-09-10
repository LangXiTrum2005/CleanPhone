package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: renamed from: com.ironsource.p6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0512p6 implements InterfaceC0530q6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ya f29973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LevelPlayAdInfo f29974b;

    public C0512p6(Ya adInternal, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInternal, "adInternal");
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f29973a = adInternal;
        this.f29974b = adInfo;
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void a(Activity activity, String str) {
        kotlin.jvm.internal.n.f(activity, "activity");
        String string = this.f29973a.e().toString();
        kotlin.jvm.internal.n.e(string, "adInternal.adId.toString()");
        this.f29973a.a(new LevelPlayAdError(string, this.f29973a.h(), LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW, "Ad is already shown"), this.f29974b);
    }

    @Override // com.ironsource.InterfaceC0530q6
    public LevelPlayAdInfo b() {
        return this.f29974b;
    }

    @Override // com.ironsource.InterfaceC0530q6
    public InterfaceC0416k0 c() {
        return new InterfaceC0416k0.a("ad is shown");
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void loadAd() {
        String string = this.f29973a.e().toString();
        kotlin.jvm.internal.n.e(string, "adInternal.adId.toString()");
        Ya.a(this.f29973a, new LevelPlayAdError(string, this.f29973a.h(), LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, "Load is called while ad is shown"), 0L, 2, null);
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void onAdClicked() {
        IronLog.INTERNAL.verbose(C0506p0.a(this.f29973a.f(), "onAdClicked adInfo: " + this.f29974b, (String) null, 2, (Object) null));
        this.f29973a.f().d(new mi(this, 2));
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void onAdClosed() {
        IronLog.INTERNAL.verbose(C0506p0.a(this.f29973a.f(), "onAdClosed adInfo: " + this.f29974b, (String) null, 2, (Object) null));
        this.f29973a.f().c(new mi(this, 0));
        this.f29973a.f().d(new mi(this, 1));
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f29973a.b("onAdDisplayed on shown state");
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f29973a.b("onAdInfoChanged on shown state");
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void onAdLoadFailed(LevelPlayAdError error) {
        kotlin.jvm.internal.n.f(error, "error");
        this.f29973a.b("onAdLoadFailed on shown state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f29973a.b("onAdLoaded on shown state");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C0512p6 this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.f29973a.a(C0369h6.a.Closed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C0512p6 this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        Za zaK = this$0.f29973a.k();
        if (zaK != null) {
            zaK.onAdClosed(this$0.f29974b);
        }
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void a() {
        this.f29973a.b("onAdExpired on shown state");
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void a(LevelPlayAdError error) {
        kotlin.jvm.internal.n.f(error, "error");
        this.f29973a.b("onAdDisplayFailed on shown state with error: " + error.getErrorMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0512p6 this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        Za zaK = this$0.f29973a.k();
        if (zaK != null) {
            zaK.onAdClicked(this$0.f29974b);
        }
    }
}
