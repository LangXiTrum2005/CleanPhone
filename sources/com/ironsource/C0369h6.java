package com.ironsource;

import android.app.Activity;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: renamed from: com.ironsource.h6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0369h6 implements InterfaceC0530q6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ya f28771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f28772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LevelPlayAdInfo f28773c;

    /* JADX INFO: renamed from: com.ironsource.h6$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum a {
        Created,
        Closed,
        Expired,
        ShowFailed,
        LoadFailed
    }

    public C0369h6(Ya adInternal, a status) {
        kotlin.jvm.internal.n.f(adInternal, "adInternal");
        kotlin.jvm.internal.n.f(status, "status");
        this.f28771a = adInternal;
        this.f28772b = status;
        String string = adInternal.e().toString();
        kotlin.jvm.internal.n.e(string, "adInternal.adId.toString()");
        this.f28773c = new LevelPlayAdInfo(string, adInternal.h(), adInternal.d().toString(), null, null, null, null, 120, null);
    }

    private final boolean d() {
        if (this.f28771a.h().length() == 0) {
            Ya ya2 = this.f28771a;
            String string = this.f28771a.e().toString();
            kotlin.jvm.internal.n.e(string, "adInternal.adId.toString()");
            Ya.a(ya2, new LevelPlayAdError(string, this.f28771a.h(), LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, "Ad unit ID should be specified"), 0L, 2, null);
            return false;
        }
        if (!this.f28771a.f().f()) {
            Ya ya3 = this.f28771a;
            String string2 = this.f28771a.e().toString();
            kotlin.jvm.internal.n.e(string2, "adInternal.adId.toString()");
            Ya.a(ya3, new LevelPlayAdError(string2, this.f28771a.h(), LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, "Load must be called after init success callback"), 0L, 2, null);
            return false;
        }
        Va vaA = this.f28771a.l().f().a();
        if (vaA != null && vaA.a(this.f28771a.h(), this.f28771a.d())) {
            return true;
        }
        Ya ya4 = this.f28771a;
        String string3 = this.f28771a.e().toString();
        kotlin.jvm.internal.n.e(string3, "adInternal.adId.toString()");
        Ya.a(ya4, new LevelPlayAdError(string3, this.f28771a.h(), LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID, "Invalid ad unit id"), 0L, 2, null);
        return false;
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void a(Activity activity, String str) {
        kotlin.jvm.internal.n.f(activity, "activity");
        String str2 = this.f28772b == a.Expired ? "Show called on expired ad" : "Show called before load success";
        String string = this.f28771a.e().toString();
        kotlin.jvm.internal.n.e(string, "adInternal.adId.toString()");
        this.f28771a.a(new LevelPlayAdError(string, this.f28771a.h(), LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, str2), this.f28773c);
    }

    @Override // com.ironsource.InterfaceC0530q6
    public LevelPlayAdInfo b() {
        return this.f28773c;
    }

    @Override // com.ironsource.InterfaceC0530q6
    public InterfaceC0416k0 c() {
        return new InterfaceC0416k0.a(this.f28772b == a.Expired ? "ad is invalid due to loading time" : "load ad was not called");
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void loadAd() {
        if (d()) {
            this.f28771a.o();
        }
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void onAdClicked() {
        this.f28771a.b("onAdClicked on " + this.f28772b + " state");
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void onAdClosed() {
        this.f28771a.b("onAdClosed on " + this.f28772b + " state");
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f28771a.b("onAdDisplayed on " + this.f28772b + " state");
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f28771a.b("onAdInfoChanged on " + this.f28772b + " state");
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void onAdLoadFailed(LevelPlayAdError error) {
        kotlin.jvm.internal.n.f(error, "error");
        this.f28771a.b("onAdLoadFailed on " + this.f28772b + " state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f28771a.b("onAdLoaded on " + this.f28772b + " state");
    }

    public /* synthetic */ C0369h6(Ya ya2, a aVar, int i10, kotlin.jvm.internal.g gVar) {
        this(ya2, (i10 & 2) != 0 ? a.Created : aVar);
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void a(LevelPlayAdError error) {
        kotlin.jvm.internal.n.f(error, "error");
        this.f28771a.b("onAdDisplayFailed on " + this.f28772b + " state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC0530q6
    public void a() {
        this.f28771a.b("onAdExpired on " + this.f28772b + " state");
    }
}
