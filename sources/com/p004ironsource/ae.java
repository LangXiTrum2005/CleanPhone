package com.p004ironsource;

import android.app.Activity;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.m6.a;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\n\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001a\u0010\u001bJ\u0014\u0010\u0005\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\u001a\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/ironsource/ae;", "Lcom/ironsource/be;", "Lcom/ironsource/td;", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "a", "", "loadAd", "Landroid/app/Activity;", "activity", "Lcom/ironsource/qd;", "adUnit", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "adInfo", "b", h.f36614b, "Lcom/unity3d/mediation/rewarded/LevelPlayReward;", "reward", "onClosed", "Lcom/ironsource/wd;", "Lcom/ironsource/wd;", a.r.f36787A, "Lcom/ironsource/qd;", "currentAdUnit", "c", "nextAdUnit", "<init>", "(Lcom/ironsource/wd;Lcom/ironsource/qd;Lcom/ironsource/qd;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ae implements be, td {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wd strategy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final qd currentAdUnit;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private qd nextAdUnit;

    public ae(wd strategy, qd currentAdUnit, qd qdVar) {
        Intrinsics.f(strategy, "strategy");
        Intrinsics.f(currentAdUnit, "currentAdUnit");
        this.strategy = strategy;
        this.currentAdUnit = currentAdUnit;
        this.nextAdUnit = qdVar;
        currentAdUnit.a(this);
    }

    public static /* synthetic */ be a(ae aeVar, IronSourceError ironSourceError, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            ironSourceError = null;
        }
        return aeVar.a(ironSourceError);
    }

    @Override // com.p004ironsource.be
    public void b(qd adUnit, IronSourceError error) {
        Intrinsics.f(adUnit, "adUnit");
        if (adUnit == this.nextAdUnit) {
            this.nextAdUnit = null;
        } else {
            this.strategy.a("load failed while current ad is showing");
        }
    }

    @Override // com.p004ironsource.i2
    public void h() {
        this.strategy.getFullscreenAdUnitListener().h();
    }

    @Override // com.p004ironsource.be
    public void loadAd() {
        this.strategy.a("load called while showing");
    }

    @Override // com.p004ironsource.td
    public void onClosed() {
        this.strategy.a(a(this, null, 1, null));
        this.strategy.getFullscreenAdUnitListener().onClosed();
    }

    private final be a(IronSourceError error) {
        if (cb.f24518a.a(error)) {
            return new yd(this.strategy, this.currentAdUnit, this.nextAdUnit, true);
        }
        qd qdVar = this.nextAdUnit;
        if (qdVar == null) {
            return new xd(this.strategy);
        }
        return qdVar.e() != null ? new yd(this.strategy, qdVar, null, false, 8, null) : new zd(this.strategy, qdVar, false);
    }

    @Override // com.p004ironsource.be
    public void b(qd adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.f(adUnit, "adUnit");
        Intrinsics.f(adInfo, "adInfo");
        if (adUnit == this.currentAdUnit) {
            this.strategy.a("load success while current ad is showing");
        }
    }

    @Override // com.p004ironsource.be
    public void a(Activity activity) {
        Intrinsics.f(activity, "activity");
        this.strategy.a("show called while showing");
    }

    @Override // com.p004ironsource.be
    public void b(qd adUnit) {
        Intrinsics.f(adUnit, "adUnit");
        if (adUnit.equals(this.currentAdUnit)) {
            this.strategy.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String().b();
        } else {
            this.strategy.a("progressive show success while showing current ad");
        }
    }

    @Override // com.p004ironsource.be
    public void a(qd adUnit) {
        Intrinsics.f(adUnit, "adUnit");
        if (adUnit == this.nextAdUnit) {
            this.nextAdUnit = null;
        } else {
            this.strategy.a("ad expired while current ad is showing");
        }
    }

    @Override // com.p004ironsource.be
    public void a(qd adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.f(adUnit, "adUnit");
        Intrinsics.f(adInfo, "adInfo");
        if (adUnit == this.currentAdUnit) {
            this.strategy.a("ad info changed while current ad is showing");
        }
    }

    @Override // com.p004ironsource.td
    public void a(LevelPlayReward reward) {
        Intrinsics.f(reward, "reward");
        this.strategy.getFullscreenAdUnitListener().a(reward);
    }

    @Override // com.p004ironsource.be
    public void a(qd adUnit, IronSourceError error) {
        Intrinsics.f(adUnit, "adUnit");
        if (!adUnit.equals(this.currentAdUnit)) {
            this.strategy.a("progressive show failed while showing current ad");
            return;
        }
        this.strategy.a(a(error));
        this.strategy.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String().b(error);
    }
}
