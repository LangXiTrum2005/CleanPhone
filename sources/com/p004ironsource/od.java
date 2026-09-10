package com.p004ironsource;

import android.app.Activity;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000bH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0002H\u0016R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/ironsource/od;", "Lcom/ironsource/pd;", "", "loadAd", "Lcom/ironsource/h1;", "d", "Landroid/app/Activity;", "activity", "", "placementName", "a", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "c", "adInfo", "onAdInfoChanged", sv.j, "Lcom/unity3d/mediation/LevelPlayAdError;", "error", sv.f27214b, "b", sv.f, sv.g, "Lcom/ironsource/hm;", "Lcom/ironsource/hm;", "adInternal", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "<init>", "(Lcom/ironsource/hm;Lcom/unity3d/mediation/LevelPlayAdInfo;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class od implements pd {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final hm adInternal;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final LevelPlayAdInfo adInfo;

    public od(hm adInternal, LevelPlayAdInfo adInfo) {
        Intrinsics.f(adInternal, "adInternal");
        Intrinsics.f(adInfo, "adInfo");
        this.adInternal = adInternal;
        this.adInfo = adInfo;
    }

    @Override // com.p004ironsource.pd
    public void a() {
        this.adInternal.a("onAdExpired on shown state");
    }

    @Override // com.p004ironsource.pd
    public void b() {
        this.adInternal.a("onAdDisplayed on shown state");
    }

    @Override // com.p004ironsource.pd
    /* JADX INFO: renamed from: c, reason: from getter */
    public LevelPlayAdInfo getAdInfo() {
        return this.adInfo;
    }

    @Override // com.p004ironsource.pd
    public void loadAd() {
        String string = this.adInternal.getCom.ironsource.sdk.controller.f.b.c java.lang.String().toString();
        Intrinsics.e(string, "adInternal.adId.toString()");
        hm.a(this.adInternal, new LevelPlayAdError(string, this.adInternal.getAdUnitId(), LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, "Load is called while ad is shown"), 0L, 2, null);
    }

    @Override // com.p004ironsource.pd
    public void onAdClicked() {
        IronLog.INTERNAL.verbose(m1.a(this.adInternal.getAdTools(), "onAdClicked adInfo: " + this.adInfo, (String) null, 2, (Object) null));
        this.adInternal.getAdTools().e(new X(this, 2));
    }

    @Override // com.p004ironsource.pd
    public void onAdClosed() {
        IronLog.INTERNAL.verbose(m1.a(this.adInternal.getAdTools(), "onAdClosed adInfo: " + this.adInfo, (String) null, 2, (Object) null));
        this.adInternal.getAdTools().d(new X(this, 0));
        this.adInternal.getAdTools().e(new X(this, 1));
    }

    @Override // com.p004ironsource.pd
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        Intrinsics.f(adInfo, "adInfo");
        this.adInternal.a("onAdInfoChanged on shown state");
    }

    @Override // com.p004ironsource.pd
    public void onAdLoadFailed(LevelPlayAdError error) {
        Intrinsics.f(error, "error");
        this.adInternal.a("onAdLoadFailed on shown state with error: " + error.getErrorMessage());
    }

    @Override // com.p004ironsource.pd
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.f(adInfo, "adInfo");
        this.adInternal.a("onAdLoaded on shown state");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(od this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.adInternal.a(hd.a.Closed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(od this$0) {
        Intrinsics.f(this$0, "this$0");
        im listener = this$0.adInternal.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String();
        if (listener != null) {
            listener.onAdClosed(this$0.adInfo);
        }
    }

    @Override // com.p004ironsource.pd
    public void a(Activity activity, String placementName) {
        Intrinsics.f(activity, "activity");
        String string = this.adInternal.getCom.ironsource.sdk.controller.f.b.c java.lang.String().toString();
        Intrinsics.e(string, "adInternal.adId.toString()");
        this.adInternal.a(new LevelPlayAdError(string, this.adInternal.getAdUnitId(), LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW, "Ad is already shown"), this.adInfo);
    }

    @Override // com.p004ironsource.pd
    public h1 d() {
        return new h1.a("ad is shown");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(od this$0) {
        Intrinsics.f(this$0, "this$0");
        im listener = this$0.adInternal.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String();
        if (listener != null) {
            listener.onAdClicked(this$0.adInfo);
        }
    }

    @Override // com.p004ironsource.pd
    public void a(LevelPlayAdError error) {
        Intrinsics.f(error, "error");
        this.adInternal.a("onAdDisplayFailed on shown state with error: " + error.getErrorMessage());
    }
}
