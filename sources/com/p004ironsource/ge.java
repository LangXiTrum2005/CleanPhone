package com.p004ironsource;

import android.app.Activity;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.m6.a;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/ironsource/ge;", "Lcom/ironsource/ie;", "", "loadAd", "Landroid/app/Activity;", "activity", "a", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "adInfo", "b", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "Lcom/ironsource/ce;", "Lcom/ironsource/ce;", a.r.f36787A, "Lcom/ironsource/qd;", "Lcom/ironsource/qd;", "adUnit", "<init>", "(Lcom/ironsource/ce;Lcom/ironsource/qd;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ge implements ie {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ce strategy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final qd adUnit;

    public ge(ce strategy, qd adUnit) {
        Intrinsics.f(strategy, "strategy");
        Intrinsics.f(adUnit, "adUnit");
        this.strategy = strategy;
        this.adUnit = adUnit;
    }

    @Override // com.p004ironsource.ie
    public void a() {
        ce ceVar = this.strategy;
        ceVar.a(new de(ceVar, null, true));
        this.strategy.getListener().a();
    }

    @Override // com.p004ironsource.ie
    public void b() {
        this.strategy.getListener().b();
        qd qdVarA = this.strategy.getFactory().a(false, this.strategy.getFullscreenAdUnitListener());
        ce ceVar = this.strategy;
        ceVar.a(new fe(ceVar, this.adUnit, qdVarA));
        qdVarA.a(this.strategy);
    }

    @Override // com.p004ironsource.ie
    public void loadAd() {
        ce ceVar = this.strategy;
        ceVar.a(new de(ceVar, null, false, 4, null));
        this.strategy.loadAd();
    }

    @Override // com.p004ironsource.ie
    public void a(Activity activity) {
        Intrinsics.f(activity, "activity");
        this.adUnit.a(activity, this.strategy);
    }

    @Override // com.p004ironsource.ie
    public void b(IronSourceError error) {
        if (!cb.f24518a.a(error)) {
            ce ceVar = this.strategy;
            ceVar.a(new de(ceVar, null, false, 4, null));
        }
        this.strategy.getListener().b(error);
    }

    @Override // com.p004ironsource.ie
    public void a(IronSourceError error) {
        this.strategy.a("load failed after ad unit is already loaded");
    }

    @Override // com.p004ironsource.ie
    public void b(LevelPlayAdInfo adInfo) {
        Intrinsics.f(adInfo, "adInfo");
        this.strategy.a("Ad unit is already loaded");
    }

    @Override // com.p004ironsource.ie
    public void a(LevelPlayAdInfo adInfo) {
        Intrinsics.f(adInfo, "adInfo");
        this.strategy.getListener().onAdInfoChanged(adInfo);
    }
}
