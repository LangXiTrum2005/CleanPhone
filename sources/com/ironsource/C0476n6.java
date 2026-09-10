package com.ironsource;

import android.app.Activity;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: renamed from: com.ironsource.n6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0476n6 implements InterfaceC0530q6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ya f29831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0510p4 f29832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f29833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LevelPlayAdInfo f29834d;

    public C0476n6(Ya adInternal, InterfaceC0510p4 currentTimeProvider) {
        kotlin.jvm.internal.n.f(adInternal, "adInternal");
        kotlin.jvm.internal.n.f(currentTimeProvider, "currentTimeProvider");
        this.f29831a = adInternal;
        this.f29832b = currentTimeProvider;
        this.f29833c = currentTimeProvider.a();
        String string = adInternal.e().toString();
        kotlin.jvm.internal.n.e(string, "adInternal.adId.toString()");
        this.f29834d = new LevelPlayAdInfo(string, adInternal.h(), adInternal.d().toString(), null, null, null, null, 120, null);
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void a(Activity activity, String str) {
        kotlin.jvm.internal.n.f(activity, "activity");
        String string = this.f29831a.e().toString();
        kotlin.jvm.internal.n.e(string, "adInternal.adId.toString()");
        this.f29831a.a(new LevelPlayAdError(string, this.f29831a.h(), LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show is called while loading ad"), this.f29834d);
    }

    @Override // com.ironsource.InterfaceC0530q6
    public LevelPlayAdInfo b() {
        return this.f29834d;
    }

    @Override // com.ironsource.InterfaceC0530q6
    public InterfaceC0416k0 c() {
        return new InterfaceC0416k0.a("Ad is loading");
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void loadAd() {
        String string = this.f29831a.e().toString();
        kotlin.jvm.internal.n.e(string, "adInternal.adId.toString()");
        this.f29831a.a(new LevelPlayAdError(string, this.f29831a.h(), LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED, "Load is already called"), this.f29832b.a() - this.f29833c);
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void onAdClicked() {
        this.f29831a.b("onAdClicked on loading state");
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void onAdClosed() {
        this.f29831a.b("onAdClosed on loading state");
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f29831a.b("onAdDisplayed on loading state");
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f29831a.b("onAdInfoChanged on loading state");
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void onAdLoadFailed(LevelPlayAdError error) {
        kotlin.jvm.internal.n.f(error, "error");
        this.f29831a.a(error, this.f29832b.a() - this.f29833c);
        this.f29831a.a(C0369h6.a.LoadFailed);
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        Ya ya2 = this.f29831a;
        ya2.a(new C0458m6(ya2, adInfo, this.f29832b));
        this.f29831a.a(adInfo);
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void a() {
        this.f29831a.b("onAdExpired on loading state");
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void a(LevelPlayAdError error) {
        kotlin.jvm.internal.n.f(error, "error");
        this.f29831a.b("onAdDisplayFailed on loading state with error: " + error.getErrorMessage());
    }
}
