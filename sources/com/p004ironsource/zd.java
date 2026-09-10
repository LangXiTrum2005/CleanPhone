package com.p004ironsource;

import android.app.Activity;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.m6.a;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u001a\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u001a\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/ironsource/zd;", "Lcom/ironsource/be;", "", "loadAd", "Landroid/app/Activity;", "activity", "a", "Lcom/ironsource/qd;", "adUnit", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "adInfo", "b", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "Lcom/ironsource/wd;", "Lcom/ironsource/wd;", a.r.f36787A, "Lcom/ironsource/qd;", "currentAdUnit", "", "c", "Z", "isPublisherLoad", "<init>", "(Lcom/ironsource/wd;Lcom/ironsource/qd;Z)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class zd implements be {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wd strategy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final qd currentAdUnit;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isPublisherLoad;

    public zd(wd strategy, qd currentAdUnit, boolean z2) {
        Intrinsics.f(strategy, "strategy");
        Intrinsics.f(currentAdUnit, "currentAdUnit");
        this.strategy = strategy;
        this.currentAdUnit = currentAdUnit;
        this.isPublisherLoad = z2;
    }

    @Override // com.p004ironsource.be
    public void a(Activity activity) {
        Intrinsics.f(activity, "activity");
        this.strategy.a("show called while loading");
    }

    @Override // com.p004ironsource.be
    public void b(qd adUnit) {
        Intrinsics.f(adUnit, "adUnit");
        this.strategy.a("show success while loading");
    }

    @Override // com.p004ironsource.be
    public void loadAd() {
        if (this.isPublisherLoad) {
            this.strategy.a("load called while loading");
        }
        this.isPublisherLoad = true;
    }

    @Override // com.p004ironsource.be
    public void a(qd adUnit) {
        Intrinsics.f(adUnit, "adUnit");
        this.strategy.a("ad expired while loading");
    }

    @Override // com.p004ironsource.be
    public void b(qd adUnit, IronSourceError error) {
        Intrinsics.f(adUnit, "adUnit");
        this.strategy.a(new xd(this.strategy));
        if (this.isPublisherLoad) {
            this.strategy.getListener().a(error);
        }
    }

    @Override // com.p004ironsource.be
    public void a(qd adUnit, IronSourceError error) {
        Intrinsics.f(adUnit, "adUnit");
        this.strategy.a("show failed while loading");
    }

    @Override // com.p004ironsource.be
    public void b(qd adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.f(adUnit, "adUnit");
        Intrinsics.f(adInfo, "adInfo");
        if (!this.isPublisherLoad) {
            this.strategy.a(new yd(this.strategy, this.currentAdUnit, null, false));
            return;
        }
        qd qdVarA = this.strategy.getFactory().a(false, this.strategy.getFullscreenAdUnitListener());
        this.strategy.a(new yd(this.strategy, this.currentAdUnit, qdVarA, true));
        this.strategy.getListener().a(adInfo);
        qdVarA.a(this.strategy);
    }

    @Override // com.p004ironsource.be
    public void a(qd adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.f(adUnit, "adUnit");
        Intrinsics.f(adInfo, "adInfo");
        this.strategy.a("ad info changed while loading");
    }
}
