package com.ironsource;

import android.app.Activity;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.e6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3490e6 implements InterfaceC3651n6 {
    private final Va a;
    private final a b;
    private final LevelPlayAdInfo c;

    /* JADX INFO: renamed from: com.ironsource.e6$a */
    public enum a {
        Created,
        Closed,
        Expired,
        ShowFailed,
        LoadFailed
    }

    public C3490e6(Va adInternal, a status) {
        Intrinsics.checkNotNullParameter(adInternal, "adInternal");
        Intrinsics.checkNotNullParameter(status, "status");
        this.a = adInternal;
        this.b = status;
        String string = adInternal.e().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        this.c = new LevelPlayAdInfo(string, adInternal.h(), adInternal.d().toString(), null, null, null, null, 120, null);
    }

    private final boolean d() {
        if (this.a.h().length() == 0) {
            Va va = this.a;
            String string = this.a.e().toString();
            Intrinsics.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
            Va.a(va, new LevelPlayAdError(string, this.a.h(), LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, "Ad unit ID should be specified"), 0L, 2, null);
            return false;
        }
        if (!this.a.f().g()) {
            Va va2 = this.a;
            String string2 = this.a.e().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "adInternal.adId.toString()");
            Va.a(va2, new LevelPlayAdError(string2, this.a.h(), LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, "Load must be called after init success callback"), 0L, 2, null);
            return false;
        }
        Sa saA = this.a.l().f().a();
        if (saA != null && saA.a(this.a.h(), this.a.d())) {
            return true;
        }
        Va va3 = this.a;
        String string3 = this.a.e().toString();
        Intrinsics.checkNotNullExpressionValue(string3, "adInternal.adId.toString()");
        Va.a(va3, new LevelPlayAdError(string3, this.a.h(), LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID, "Invalid ad unit id"), 0L, 2, null);
        return false;
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void a(Activity activity, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String str2 = this.b == a.Expired ? "Show called on expired ad" : "Show called before load success";
        String string = this.a.e().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        this.a.a(new LevelPlayAdError(string, this.a.h(), LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, str2), this.c);
    }

    @Override // com.ironsource.InterfaceC3651n6
    public LevelPlayAdInfo b() {
        return this.c;
    }

    @Override // com.ironsource.InterfaceC3651n6
    public InterfaceC3591k0 c() {
        return new InterfaceC3591k0.a(this.b == a.Expired ? "ad is invalid due to loading time" : "load ad was not called");
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void loadAd() {
        if (d()) {
            this.a.o();
        }
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void onAdClicked() {
        this.a.b("onAdClicked on " + this.b + " state");
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void onAdClosed() {
        this.a.b("onAdClosed on " + this.b + " state");
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.b("onAdDisplayed on " + this.b + " state");
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.b("onAdInfoChanged on " + this.b + " state");
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void onAdLoadFailed(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.b("onAdLoadFailed on " + this.b + " state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.b("onAdLoaded on " + this.b + " state");
    }

    public /* synthetic */ C3490e6(Va va, a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(va, (i & 2) != 0 ? a.Created : aVar);
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void a(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.b("onAdDisplayFailed on " + this.b + " state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC3651n6
    public void a() {
        this.a.b("onAdExpired on " + this.b + " state");
    }
}
