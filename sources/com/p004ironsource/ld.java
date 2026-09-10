package com.p004ironsource;

import android.app.Activity;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.model.Placement;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u001e\u001a\u00020\u001c¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\rH\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001f¨\u0006#"}, d2 = {"Lcom/ironsource/ld;", "Lcom/ironsource/pd;", "", "e", "", "loadAd", "Landroid/app/Activity;", "activity", "", "placementName", "a", "Lcom/ironsource/h1;", "d", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "c", "adInfo", "onAdInfoChanged", sv.j, "Lcom/unity3d/mediation/LevelPlayAdError;", "error", sv.f27214b, "b", sv.f, sv.g, "Lcom/ironsource/hm;", "Lcom/ironsource/hm;", "adInternal", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "Lcom/ironsource/s9;", "Lcom/ironsource/s9;", "currentTimeProvider", "J", "loadSuccessTimestamp", "<init>", "(Lcom/ironsource/hm;Lcom/unity3d/mediation/LevelPlayAdInfo;Lcom/ironsource/s9;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ld implements pd {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final hm adInternal;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private LevelPlayAdInfo adInfo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final s9 currentTimeProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long loadSuccessTimestamp;

    public ld(hm adInternal, LevelPlayAdInfo adInfo, s9 currentTimeProvider) {
        Intrinsics.f(adInternal, "adInternal");
        Intrinsics.f(adInfo, "adInfo");
        Intrinsics.f(currentTimeProvider, "currentTimeProvider");
        this.adInternal = adInternal;
        this.adInfo = adInfo;
        this.currentTimeProvider = currentTimeProvider;
        this.loadSuccessTimestamp = currentTimeProvider.a();
    }

    private final long e() {
        return this.currentTimeProvider.a() - this.loadSuccessTimestamp;
    }

    @Override // com.p004ironsource.pd
    public void a() {
        IronLog.INTERNAL.verbose(m1.a(this.adInternal.getAdTools(), "onAdExpired", (String) null, 2, (Object) null));
        this.adInternal.a(hd.a.Expired);
    }

    @Override // com.p004ironsource.pd
    /* JADX INFO: renamed from: c, reason: from getter */
    public LevelPlayAdInfo getAdInfo() {
        return this.adInfo;
    }

    @Override // com.p004ironsource.pd
    public h1 d() {
        n8 n8VarA = this.adInternal.getMediationServicesProvider().u().a(this.adInternal.getAdUnitId());
        return n8VarA.d() ? h1.a.INSTANCE.a(n8VarA.e()) : h1.b.f25188a;
    }

    @Override // com.p004ironsource.pd
    public void loadAd() {
        this.adInternal.getAdTools().getEventSender().getTroubleshoot().a(Long.valueOf(e()));
        this.adInternal.a(this.adInfo);
    }

    @Override // com.p004ironsource.pd
    public void onAdClicked() {
        this.adInternal.a("onAdClicked on loaded state");
    }

    @Override // com.p004ironsource.pd
    public void onAdClosed() {
        this.adInternal.a("onAdClosed on loaded state");
    }

    @Override // com.p004ironsource.pd
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        Intrinsics.f(adInfo, "adInfo");
        m1 adTools = this.adInternal.getAdTools();
        IronLog.INTERNAL.verbose(m1.a(adTools, "onAdInfoChanged adInfo: " + adInfo, (String) null, 2, (Object) null));
        adTools.getEventSender().getTroubleshoot().a(this.adInfo, adInfo);
        this.adInfo = adInfo;
        adTools.e(new G0(13, this, adInfo));
    }

    @Override // com.p004ironsource.pd
    public void onAdLoadFailed(LevelPlayAdError error) {
        Intrinsics.f(error, "error");
        this.adInternal.a("onAdLoadFailed on loaded state with error: " + error.getErrorMessage());
    }

    @Override // com.p004ironsource.pd
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.f(adInfo, "adInfo");
        this.adInternal.a("onAdLoaded on loaded state");
    }

    @Override // com.p004ironsource.pd
    public void a(Activity activity, String placementName) {
        Intrinsics.f(activity, "activity");
        Placement placementA = this.adInternal.getAdTools().a(this.adInternal.getAdFormat(), placementName);
        LevelPlayAdInfo levelPlayAdInfo = new LevelPlayAdInfo(this.adInfo, placementName);
        this.adInfo = levelPlayAdInfo;
        hm hmVar = this.adInternal;
        hmVar.a(new nd(hmVar, levelPlayAdInfo));
        this.adInternal.d().a(activity, placementA);
    }

    @Override // com.p004ironsource.pd
    public void b() {
        this.adInternal.a("onAdDisplayed on loaded state");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ld this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(adInfo, "$adInfo");
        im listener = this$0.adInternal.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String();
        if (listener != null) {
            listener.onAdInfoChanged(adInfo);
        }
    }

    @Override // com.p004ironsource.pd
    public void a(LevelPlayAdError error) {
        Intrinsics.f(error, "error");
        this.adInternal.a("onAdDisplayFailed on loaded state with error: " + error.getErrorMessage());
    }
}
