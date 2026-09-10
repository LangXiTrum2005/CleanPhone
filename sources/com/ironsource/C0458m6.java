package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: renamed from: com.ironsource.m6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0458m6 implements InterfaceC0530q6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ya f29245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LevelPlayAdInfo f29246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0510p4 f29247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f29248d;

    public C0458m6(Ya adInternal, LevelPlayAdInfo adInfo, InterfaceC0510p4 currentTimeProvider) {
        kotlin.jvm.internal.n.f(adInternal, "adInternal");
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        kotlin.jvm.internal.n.f(currentTimeProvider, "currentTimeProvider");
        this.f29245a = adInternal;
        this.f29246b = adInfo;
        this.f29247c = currentTimeProvider;
        this.f29248d = currentTimeProvider.a();
    }

    private final long d() {
        return this.f29247c.a() - this.f29248d;
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void a(Activity activity, String str) {
        kotlin.jvm.internal.n.f(activity, "activity");
        C0358gd c0358gdA = this.f29245a.f().a(this.f29245a.d(), str);
        LevelPlayAdInfo levelPlayAdInfo = new LevelPlayAdInfo(this.f29246b, str);
        this.f29246b = levelPlayAdInfo;
        Ya ya2 = this.f29245a;
        ya2.a(new C0494o6(ya2, levelPlayAdInfo));
        this.f29245a.c().a(activity, c0358gdA);
    }

    @Override // com.ironsource.InterfaceC0530q6
    public InterfaceC0416k0 c() {
        G3 g3A = this.f29245a.l().g().a(this.f29245a.h());
        return g3A.d() ? InterfaceC0416k0.a.f29011c.a(g3A.e()) : InterfaceC0416k0.b.f29014a;
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void loadAd() {
        this.f29245a.f().d().h().a(Long.valueOf(d()));
        this.f29245a.a(this.f29246b);
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void onAdClicked() {
        this.f29245a.b("onAdClicked on loaded state");
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void onAdClosed() {
        this.f29245a.b("onAdClosed on loaded state");
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f29245a.b("onAdDisplayed on loaded state");
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        C0506p0 c0506p0F = this.f29245a.f();
        IronLog.INTERNAL.verbose(C0506p0.a(c0506p0F, "onAdInfoChanged adInfo: " + adInfo, (String) null, 2, (Object) null));
        c0506p0F.d().h().a(this.f29246b, adInfo);
        this.f29246b = adInfo;
        c0506p0F.d(new ki(26, this, adInfo));
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void onAdLoadFailed(LevelPlayAdError error) {
        kotlin.jvm.internal.n.f(error, "error");
        this.f29245a.b("onAdLoadFailed on loaded state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f29245a.b("onAdLoaded on loaded state");
    }

    @Override // com.ironsource.InterfaceC0530q6
    public LevelPlayAdInfo b() {
        return this.f29246b;
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void a() {
        IronLog.INTERNAL.verbose(C0506p0.a(this.f29245a.f(), "onAdExpired", (String) null, 2, (Object) null));
        this.f29245a.a(C0369h6.a.Expired);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0458m6 this$0, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(adInfo, "$adInfo");
        Za zaK = this$0.f29245a.k();
        if (zaK != null) {
            zaK.onAdInfoChanged(adInfo);
        }
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void a(LevelPlayAdError error) {
        kotlin.jvm.internal.n.f(error, "error");
        this.f29245a.b("onAdDisplayFailed on loaded state with error: " + error.getErrorMessage());
    }
}
