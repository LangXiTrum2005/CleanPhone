package com.p004ironsource;

import android.app.Activity;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.m6.a;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u001a\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u001a\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/ironsource/yd;", "Lcom/ironsource/be;", "", "a", "loadAd", "Landroid/app/Activity;", "activity", "Lcom/ironsource/qd;", "adUnit", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "adInfo", "b", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "Lcom/ironsource/wd;", "Lcom/ironsource/wd;", a.r.f36787A, "Lcom/ironsource/qd;", "currentAdUnit", "c", "nextAdUnit", "", "d", "Z", "isPublisherLoad", "<init>", "(Lcom/ironsource/wd;Lcom/ironsource/qd;Lcom/ironsource/qd;Z)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class yd implements be {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wd strategy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final qd currentAdUnit;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private qd nextAdUnit;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isPublisherLoad;

    public yd(wd strategy, qd currentAdUnit, qd qdVar, boolean z2) {
        Intrinsics.f(strategy, "strategy");
        Intrinsics.f(currentAdUnit, "currentAdUnit");
        this.strategy = strategy;
        this.currentAdUnit = currentAdUnit;
        this.nextAdUnit = qdVar;
        this.isPublisherLoad = z2;
    }

    private final void a() {
        be zdVar;
        wd wdVar;
        qd qdVar = this.nextAdUnit;
        if (qdVar == null) {
            wdVar = this.strategy;
            zdVar = new xd(wdVar);
        } else {
            if (qdVar.e() != null) {
                wd wdVar2 = this.strategy;
                qd qdVar2 = this.nextAdUnit;
                Intrinsics.c(qdVar2);
                zdVar = new yd(wdVar2, qdVar2, null, false, 8, null);
            } else {
                wd wdVar3 = this.strategy;
                qd qdVar3 = this.nextAdUnit;
                Intrinsics.c(qdVar3);
                zdVar = new zd(wdVar3, qdVar3, false);
            }
            wdVar = this.strategy;
        }
        wdVar.a(zdVar);
        this.strategy.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String().a();
    }

    @Override // com.p004ironsource.be
    public void b(qd adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.f(adUnit, "adUnit");
        Intrinsics.f(adInfo, "adInfo");
        if (Intrinsics.a(this.currentAdUnit, adUnit)) {
            this.strategy.a("load success after current ad is loaded");
        }
    }

    @Override // com.p004ironsource.be
    public void loadAd() {
        Unit unit;
        if (this.isPublisherLoad) {
            this.strategy.a("load called while current ad is loaded");
            return;
        }
        this.isPublisherLoad = true;
        LevelPlayAdInfo levelPlayAdInfoE = this.currentAdUnit.e();
        if (levelPlayAdInfoE != null) {
            this.strategy.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String().a(levelPlayAdInfoE);
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.strategy.a("current ad is loaded without ad info");
        } else if (this.nextAdUnit == null) {
            qd qdVarA = this.strategy.getFactory().a(false, this.strategy.getFullscreenAdUnitListener());
            this.nextAdUnit = qdVarA;
            qdVarA.a(this.strategy);
        }
    }

    public /* synthetic */ yd(wd wdVar, qd qdVar, qd qdVar2, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(wdVar, qdVar, qdVar2, (i2 & 8) != 0 ? false : z2);
    }

    @Override // com.p004ironsource.be
    public void a(Activity activity) {
        Intrinsics.f(activity, "activity");
        this.strategy.a(new ae(this.strategy, this.currentAdUnit, this.nextAdUnit));
        this.currentAdUnit.a(activity, this.strategy);
    }

    @Override // com.p004ironsource.be
    public void b(qd adUnit) {
        wd wdVar;
        String str;
        Intrinsics.f(adUnit, "adUnit");
        if (adUnit.equals(this.currentAdUnit)) {
            wdVar = this.strategy;
            str = "show success when loaded";
        } else {
            wdVar = this.strategy;
            str = "progressive show success while current ad is loaded";
        }
        wdVar.a(str);
    }

    @Override // com.p004ironsource.be
    public void a(qd adUnit) {
        Intrinsics.f(adUnit, "adUnit");
        if (adUnit.equals(this.nextAdUnit)) {
            this.nextAdUnit = null;
        } else if (adUnit.equals(this.currentAdUnit)) {
            a();
        }
    }

    @Override // com.p004ironsource.be
    public void b(qd adUnit, IronSourceError error) {
        Intrinsics.f(adUnit, "adUnit");
        if (adUnit.equals(this.nextAdUnit)) {
            this.nextAdUnit = null;
        } else {
            this.strategy.a("load failed after current ad is loaded");
        }
    }

    @Override // com.p004ironsource.be
    public void a(qd adUnit, IronSourceError error) {
        wd wdVar;
        String str;
        Intrinsics.f(adUnit, "adUnit");
        if (adUnit.equals(this.currentAdUnit)) {
            wdVar = this.strategy;
            str = "show failed when loaded";
        } else {
            wdVar = this.strategy;
            str = "progressive show failed while current ad is loaded";
        }
        wdVar.a(str);
    }

    @Override // com.p004ironsource.be
    public void a(qd adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.f(adUnit, "adUnit");
        Intrinsics.f(adInfo, "adInfo");
        if (adUnit.equals(this.currentAdUnit)) {
            this.strategy.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String().onAdInfoChanged(adInfo);
        }
    }
}
