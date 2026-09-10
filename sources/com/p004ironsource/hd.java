package com.p004ironsource;

import android.app.Activity;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\rH\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001cR\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001e¨\u0006!"}, d2 = {"Lcom/ironsource/hd;", "Lcom/ironsource/pd;", "", "e", "", "loadAd", "Landroid/app/Activity;", "activity", "", "placementName", "a", "Lcom/ironsource/h1;", "d", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "c", "Lcom/unity3d/mediation/LevelPlayAdError;", "error", "adInfo", sv.j, sv.f27214b, "onAdInfoChanged", "b", sv.f, sv.g, "Lcom/ironsource/hm;", "Lcom/ironsource/hm;", "adInternal", "Lcom/ironsource/hd$a;", "Lcom/ironsource/hd$a;", "status", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "<init>", "(Lcom/ironsource/hm;Lcom/ironsource/hd$a;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class hd implements pd {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final hm adInternal;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a status;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final LevelPlayAdInfo adInfo;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ironsource/hd$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public enum a {
        Created,
        Closed,
        Expired,
        ShowFailed,
        LoadFailed
    }

    public hd(hm adInternal, a status) {
        Intrinsics.f(adInternal, "adInternal");
        Intrinsics.f(status, "status");
        this.adInternal = adInternal;
        this.status = status;
        String string = adInternal.getAdId().toString();
        Intrinsics.e(string, "adInternal.adId.toString()");
        this.adInfo = new LevelPlayAdInfo(string, adInternal.getAdUnitId(), adInternal.getAdFormat().toString(), null, null, null, null, 120, null);
    }

    private final boolean e() {
        if (this.adInternal.getAdUnitId().length() == 0) {
            hm hmVar = this.adInternal;
            String string = this.adInternal.getAdId().toString();
            Intrinsics.e(string, "adInternal.adId.toString()");
            hm.a(hmVar, new LevelPlayAdError(string, this.adInternal.getAdUnitId(), LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, "Ad unit ID should be specified"), 0L, 2, null);
            return false;
        }
        if (!this.adInternal.getAdTools().g()) {
            hm hmVar2 = this.adInternal;
            String string2 = this.adInternal.getAdId().toString();
            Intrinsics.e(string2, "adInternal.adId.toString()");
            hm.a(hmVar2, new LevelPlayAdError(string2, this.adInternal.getAdUnitId(), LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, "Load must be called after init success callback"), 0L, 2, null);
            return false;
        }
        fm fmVarA = this.adInternal.getMediationServicesProvider().t().a();
        if (fmVarA != null && fmVarA.a(this.adInternal.getAdUnitId(), this.adInternal.getAdFormat())) {
            return true;
        }
        hm hmVar3 = this.adInternal;
        String string3 = this.adInternal.getAdId().toString();
        Intrinsics.e(string3, "adInternal.adId.toString()");
        hm.a(hmVar3, new LevelPlayAdError(string3, this.adInternal.getAdUnitId(), LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID, "Invalid ad unit id"), 0L, 2, null);
        return false;
    }

    @Override // com.p004ironsource.pd
    public void a() {
        this.adInternal.a("onAdExpired on " + this.status + " state");
    }

    @Override // com.p004ironsource.pd
    public void b() {
        this.adInternal.a("onAdDisplayed on " + this.status + " state");
    }

    @Override // com.p004ironsource.pd
    /* JADX INFO: renamed from: c, reason: from getter */
    public LevelPlayAdInfo getAdInfo() {
        return this.adInfo;
    }

    @Override // com.p004ironsource.pd
    public h1 d() {
        return new h1.a(this.status == a.Expired ? "ad is invalid due to loading time" : "load ad was not called");
    }

    @Override // com.p004ironsource.pd
    public void loadAd() {
        if (e()) {
            this.adInternal.p();
        }
    }

    @Override // com.p004ironsource.pd
    public void onAdClicked() {
        this.adInternal.a("onAdClicked on " + this.status + " state");
    }

    @Override // com.p004ironsource.pd
    public void onAdClosed() {
        this.adInternal.a("onAdClosed on " + this.status + " state");
    }

    @Override // com.p004ironsource.pd
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        Intrinsics.f(adInfo, "adInfo");
        this.adInternal.a("onAdInfoChanged on " + this.status + " state");
    }

    @Override // com.p004ironsource.pd
    public void onAdLoadFailed(LevelPlayAdError error) {
        Intrinsics.f(error, "error");
        this.adInternal.a("onAdLoadFailed on " + this.status + " state with error: " + error.getErrorMessage());
    }

    @Override // com.p004ironsource.pd
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.f(adInfo, "adInfo");
        this.adInternal.a("onAdLoaded on " + this.status + " state");
    }

    public /* synthetic */ hd(hm hmVar, a aVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(hmVar, (i2 & 2) != 0 ? a.Created : aVar);
    }

    @Override // com.p004ironsource.pd
    public void a(Activity activity, String placementName) {
        Intrinsics.f(activity, "activity");
        String str = this.status == a.Expired ? "Show called on expired ad" : "Show called before load success";
        String string = this.adInternal.getAdId().toString();
        Intrinsics.e(string, "adInternal.adId.toString()");
        this.adInternal.a(new LevelPlayAdError(string, this.adInternal.getAdUnitId(), LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, str), this.adInfo);
    }

    @Override // com.p004ironsource.pd
    public void a(LevelPlayAdError error) {
        Intrinsics.f(error, "error");
        this.adInternal.a("onAdDisplayFailed on " + this.status + " state with error: " + error.getErrorMessage());
    }
}
