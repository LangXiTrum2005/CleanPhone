package com.p004ironsource;

import android.app.Activity;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.m6.a;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/ironsource/ee;", "Lcom/ironsource/ie;", "", "loadAd", "Landroid/app/Activity;", "activity", "a", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "adInfo", "b", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "Lcom/ironsource/ce;", "Lcom/ironsource/ce;", a.r.f36787A, "Lcom/ironsource/qd;", "Lcom/ironsource/qd;", "currentAdUnit", "c", "progressiveAdUnit", "d", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "<init>", "(Lcom/ironsource/ce;Lcom/ironsource/qd;Lcom/ironsource/qd;Lcom/unity3d/mediation/LevelPlayAdInfo;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ee implements ie {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ce strategy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final qd currentAdUnit;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final qd progressiveAdUnit;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private LevelPlayAdInfo adInfo;

    public ee(ce strategy, qd currentAdUnit, qd progressiveAdUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.f(strategy, "strategy");
        Intrinsics.f(currentAdUnit, "currentAdUnit");
        Intrinsics.f(progressiveAdUnit, "progressiveAdUnit");
        Intrinsics.f(adInfo, "adInfo");
        this.strategy = strategy;
        this.currentAdUnit = currentAdUnit;
        this.progressiveAdUnit = progressiveAdUnit;
        this.adInfo = adInfo;
    }

    @Override // com.p004ironsource.ie
    public void a() {
        ce ceVar = this.strategy;
        ceVar.a(new de(ceVar, this.currentAdUnit, true));
    }

    @Override // com.p004ironsource.ie
    public void b() {
        this.strategy.a("show success on progressive ad unit that already loaded");
    }

    @Override // com.p004ironsource.ie
    public void loadAd() {
        this.strategy.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String().a(this.adInfo);
        ce ceVar = this.strategy;
        ceVar.a(new ge(ceVar, this.progressiveAdUnit));
    }

    @Override // com.p004ironsource.ie
    public void a(Activity activity) {
        Intrinsics.f(activity, "activity");
        this.strategy.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String().b(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show called before load success"));
    }

    @Override // com.p004ironsource.ie
    public void b(IronSourceError error) {
        this.strategy.a("show failed on progressive ad unit that already loaded");
    }

    @Override // com.p004ironsource.ie
    public void a(IronSourceError error) {
        this.strategy.a("load failed on progressive ad unit that already loaded");
    }

    @Override // com.p004ironsource.ie
    public void b(LevelPlayAdInfo adInfo) {
        Intrinsics.f(adInfo, "adInfo");
        this.strategy.a("load success on progressive ad unit is already loaded");
    }

    @Override // com.p004ironsource.ie
    public void a(LevelPlayAdInfo adInfo) {
        Intrinsics.f(adInfo, "adInfo");
        this.adInfo = adInfo;
    }
}
