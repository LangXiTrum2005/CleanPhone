package com.p004ironsource;

import android.app.Activity;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.m6.a;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u001a\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u001a\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/ironsource/xd;", "Lcom/ironsource/be;", "", "loadAd", "Landroid/app/Activity;", "activity", "a", "Lcom/ironsource/qd;", "adUnit", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "adInfo", "b", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "Lcom/ironsource/wd;", "Lcom/ironsource/wd;", a.r.f36787A, "<init>", "(Lcom/ironsource/wd;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class xd implements be {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wd strategy;

    public xd(wd strategy) {
        Intrinsics.f(strategy, "strategy");
        this.strategy = strategy;
    }

    @Override // com.p004ironsource.be
    public void a(Activity activity) {
        Intrinsics.f(activity, "activity");
        this.strategy.a("show called before load success");
    }

    @Override // com.p004ironsource.be
    public void b(qd adUnit) {
        Intrinsics.f(adUnit, "adUnit");
        this.strategy.a("ad display success before load called");
    }

    @Override // com.p004ironsource.be
    public void loadAd() {
        qd qdVarA = this.strategy.getFactory().a(true, this.strategy.getFullscreenAdUnitListener());
        this.strategy.a(new zd(this.strategy, qdVarA, true));
        qdVarA.a(this.strategy);
    }

    @Override // com.p004ironsource.be
    public void a(qd adUnit) {
        Intrinsics.f(adUnit, "adUnit");
        this.strategy.a("ad expired before load called");
    }

    @Override // com.p004ironsource.be
    public void b(qd adUnit, IronSourceError error) {
        Intrinsics.f(adUnit, "adUnit");
        this.strategy.a("load failed before load called");
    }

    @Override // com.p004ironsource.be
    public void a(qd adUnit, IronSourceError error) {
        Intrinsics.f(adUnit, "adUnit");
        this.strategy.a("ad display failed before load called");
    }

    @Override // com.p004ironsource.be
    public void b(qd adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.f(adUnit, "adUnit");
        Intrinsics.f(adInfo, "adInfo");
        this.strategy.a("load success before load called");
    }

    @Override // com.p004ironsource.be
    public void a(qd adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.f(adUnit, "adUnit");
        Intrinsics.f(adInfo, "adInfo");
        this.strategy.a("load success with better ad before load called");
    }
}
