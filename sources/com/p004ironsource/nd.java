package com.p004ironsource;

import android.app.Activity;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0007H\u0016J\b\u0010\u0016\u001a\u00020\u0007H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/ironsource/nd;", "Lcom/ironsource/pd;", "Lcom/unity3d/mediation/LevelPlayAdError;", "displayError", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "currentAdInfo", "a", "", "loadAd", "Lcom/ironsource/h1;", "d", "Landroid/app/Activity;", "activity", "", "placementName", "error", "adInfo", "onAdInfoChanged", "c", sv.j, sv.f27214b, "b", sv.f, sv.g, "Lcom/ironsource/hm;", "Lcom/ironsource/hm;", "adInternal", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "<init>", "(Lcom/ironsource/hm;Lcom/unity3d/mediation/LevelPlayAdInfo;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class nd implements pd {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final hm adInternal;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final LevelPlayAdInfo adInfo;

    public nd(hm adInternal, LevelPlayAdInfo adInfo) {
        Intrinsics.f(adInternal, "adInternal");
        Intrinsics.f(adInfo, "adInfo");
        this.adInternal = adInternal;
        this.adInfo = adInfo;
    }

    private final pd a(LevelPlayAdError displayError, LevelPlayAdInfo currentAdInfo) {
        if (!cb.f24518a.a(vv.f27547a.a(displayError))) {
            return new hd(this.adInternal, hd.a.ShowFailed);
        }
        hm hmVar = this.adInternal;
        return new ld(hmVar, currentAdInfo, hmVar.getCurrentTimeProvider());
    }

    @Override // com.p004ironsource.pd
    /* JADX INFO: renamed from: c, reason: from getter */
    public LevelPlayAdInfo getAdInfo() {
        return this.adInfo;
    }

    @Override // com.p004ironsource.pd
    public h1 d() {
        return new h1.a("ad is showing");
    }

    @Override // com.p004ironsource.pd
    public void loadAd() {
        String string = this.adInternal.getCom.ironsource.sdk.controller.f.b.c java.lang.String().toString();
        Intrinsics.e(string, "adInternal.adId.toString()");
        hm.a(this.adInternal, new LevelPlayAdError(string, this.adInternal.getAdUnitId(), LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, "Load is called while ad is showing"), 0L, 2, null);
    }

    @Override // com.p004ironsource.pd
    public void onAdClicked() {
        this.adInternal.a("onAdClicked on showing state");
    }

    @Override // com.p004ironsource.pd
    public void onAdClosed() {
        this.adInternal.a("onAdClosed on showing state");
    }

    @Override // com.p004ironsource.pd
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        Intrinsics.f(adInfo, "adInfo");
        this.adInternal.a("onAdInfoChanged on showing state");
    }

    @Override // com.p004ironsource.pd
    public void onAdLoadFailed(LevelPlayAdError error) {
        Intrinsics.f(error, "error");
        this.adInternal.a("onAdLoadFailed on showing state with error: " + error.getErrorMessage());
    }

    @Override // com.p004ironsource.pd
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.f(adInfo, "adInfo");
        this.adInternal.a("onAdLoaded on showing state");
    }

    @Override // com.p004ironsource.pd
    public void a() {
        this.adInternal.a("onAdExpired on showing state");
    }

    @Override // com.p004ironsource.pd
    public void b() {
        m1 adTools = this.adInternal.getAdTools();
        IronLog.INTERNAL.verbose(m1.a(adTools, "onAdDisplayed adInfo: " + this.adInfo, (String) null, 2, (Object) null));
        adTools.getEventSender().getTroubleshoot().e();
        hm hmVar = this.adInternal;
        hmVar.a(new od(hmVar, this.adInfo));
        adTools.e(new D(this, 7));
    }

    @Override // com.p004ironsource.pd
    public void a(Activity activity, String placementName) {
        Intrinsics.f(activity, "activity");
        String string = this.adInternal.getCom.ironsource.sdk.controller.f.b.c java.lang.String().toString();
        Intrinsics.e(string, "adInternal.adId.toString()");
        this.adInternal.a(new LevelPlayAdError(string, this.adInternal.getAdUnitId(), LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW, "Ad is already showing"), this.adInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(nd this$0) {
        Intrinsics.f(this$0, "this$0");
        im listener = this$0.adInternal.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String();
        if (listener != null) {
            listener.onAdDisplayed(this$0.adInfo);
        }
    }

    @Override // com.p004ironsource.pd
    public void a(LevelPlayAdError error) {
        Intrinsics.f(error, "error");
        this.adInternal.a(a(error, this.adInfo));
        this.adInternal.a(error, this.adInfo);
    }
}
