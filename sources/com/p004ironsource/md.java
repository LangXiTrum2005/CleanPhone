package com.p004ironsource;

import android.app.Activity;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000bH\u0016J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0002H\u0016R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001f¨\u0006\""}, d2 = {"Lcom/ironsource/md;", "Lcom/ironsource/pd;", "", "loadAd", "Landroid/app/Activity;", "activity", "", "placementName", "a", "Lcom/ironsource/h1;", "d", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "c", "adInfo", sv.j, "Lcom/unity3d/mediation/LevelPlayAdError;", "error", sv.f27214b, "onAdInfoChanged", "b", sv.f, sv.g, "Lcom/ironsource/hm;", "Lcom/ironsource/hm;", "adInternal", "Lcom/ironsource/s9;", "Lcom/ironsource/s9;", "currentTimeProvider", "", "J", "loadStartTimestamp", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "<init>", "(Lcom/ironsource/hm;Lcom/ironsource/s9;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class md implements pd {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final hm adInternal;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s9 currentTimeProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long loadStartTimestamp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final LevelPlayAdInfo adInfo;

    public md(hm adInternal, s9 currentTimeProvider) {
        Intrinsics.f(adInternal, "adInternal");
        Intrinsics.f(currentTimeProvider, "currentTimeProvider");
        this.adInternal = adInternal;
        this.currentTimeProvider = currentTimeProvider;
        this.loadStartTimestamp = currentTimeProvider.a();
        String string = adInternal.getCom.ironsource.sdk.controller.f.b.c java.lang.String().toString();
        Intrinsics.e(string, "adInternal.adId.toString()");
        this.adInfo = new LevelPlayAdInfo(string, adInternal.getAdUnitId(), adInternal.getAdFormat().toString(), null, null, null, null, 120, null);
    }

    @Override // com.p004ironsource.pd
    public void a() {
        this.adInternal.a("onAdExpired on loading state");
    }

    @Override // com.p004ironsource.pd
    public void b() {
        this.adInternal.a("onAdDisplayed on loading state");
    }

    @Override // com.p004ironsource.pd
    /* JADX INFO: renamed from: c, reason: from getter */
    public LevelPlayAdInfo getAdInfo() {
        return this.adInfo;
    }

    @Override // com.p004ironsource.pd
    public h1 d() {
        return new h1.a("Ad is loading");
    }

    @Override // com.p004ironsource.pd
    public void loadAd() {
        String string = this.adInternal.getCom.ironsource.sdk.controller.f.b.c java.lang.String().toString();
        Intrinsics.e(string, "adInternal.adId.toString()");
        this.adInternal.a(new LevelPlayAdError(string, this.adInternal.getAdUnitId(), LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED, "Load is already called"), this.currentTimeProvider.a() - this.loadStartTimestamp);
    }

    @Override // com.p004ironsource.pd
    public void onAdClicked() {
        this.adInternal.a("onAdClicked on loading state");
    }

    @Override // com.p004ironsource.pd
    public void onAdClosed() {
        this.adInternal.a("onAdClosed on loading state");
    }

    @Override // com.p004ironsource.pd
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        Intrinsics.f(adInfo, "adInfo");
        this.adInternal.a("onAdInfoChanged on loading state");
    }

    @Override // com.p004ironsource.pd
    public void onAdLoadFailed(LevelPlayAdError error) {
        Intrinsics.f(error, "error");
        this.adInternal.a(error, this.currentTimeProvider.a() - this.loadStartTimestamp);
        this.adInternal.a(hd.a.LoadFailed);
    }

    @Override // com.p004ironsource.pd
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.f(adInfo, "adInfo");
        hm hmVar = this.adInternal;
        hmVar.a(new ld(hmVar, adInfo, this.currentTimeProvider));
        this.adInternal.a(adInfo);
    }

    @Override // com.p004ironsource.pd
    public void a(Activity activity, String placementName) {
        Intrinsics.f(activity, "activity");
        String string = this.adInternal.getCom.ironsource.sdk.controller.f.b.c java.lang.String().toString();
        Intrinsics.e(string, "adInternal.adId.toString()");
        this.adInternal.a(new LevelPlayAdError(string, this.adInternal.getAdUnitId(), LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show is called while loading ad"), this.adInfo);
    }

    @Override // com.p004ironsource.pd
    public void a(LevelPlayAdError error) {
        Intrinsics.f(error, "error");
        this.adInternal.a("onAdDisplayFailed on loading state with error: " + error.getErrorMessage());
    }
}
