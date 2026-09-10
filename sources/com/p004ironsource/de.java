package com.p004ironsource;

import android.app.Activity;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.m6.a;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/ironsource/de;", "Lcom/ironsource/ie;", "", "loadAd", "Landroid/app/Activity;", "activity", "a", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "adInfo", "b", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "Lcom/ironsource/ce;", "Lcom/ironsource/ce;", a.r.f36787A, "Lcom/ironsource/qd;", "Lcom/ironsource/qd;", "currentAdUnit", "", "c", "Z", "isExpired", "<init>", "(Lcom/ironsource/ce;Lcom/ironsource/qd;Z)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class de implements ie {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ce strategy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final qd currentAdUnit;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isExpired;

    public de(ce strategy, qd qdVar, boolean z2) {
        Intrinsics.f(strategy, "strategy");
        this.strategy = strategy;
        this.currentAdUnit = qdVar;
        this.isExpired = z2;
    }

    @Override // com.p004ironsource.ie
    public void a() {
        this.strategy.a(this.isExpired ? "ad expired on expired ad" : "ad expired before load called");
    }

    @Override // com.p004ironsource.ie
    public void b() {
        this.strategy.a(this.isExpired ? "show success on expired ad" : "show success before load called");
    }

    @Override // com.p004ironsource.ie
    public void loadAd() {
        qd qdVarA = this.strategy.getFactory().a(true, this.strategy.getFullscreenAdUnitListener());
        ce ceVar = this.strategy;
        ceVar.a(new he(ceVar, qdVarA));
        qdVarA.a(this.strategy);
    }

    public /* synthetic */ de(ce ceVar, qd qdVar, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(ceVar, qdVar, (i2 & 4) != 0 ? false : z2);
    }

    @Override // com.p004ironsource.ie
    public void a(Activity activity) {
        Intrinsics.f(activity, "activity");
        this.strategy.getListener().b(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, this.isExpired ? "Show called on expired ad" : "Show called before load success"));
    }

    @Override // com.p004ironsource.ie
    public void b(IronSourceError error) {
        this.strategy.a(this.isExpired ? "show failed on expired ad" : "show failed before load called");
    }

    @Override // com.p004ironsource.ie
    public void a(IronSourceError error) {
        this.strategy.a(this.isExpired ? "load failed on expired ad" : "load failed before load called");
    }

    @Override // com.p004ironsource.ie
    public void b(LevelPlayAdInfo adInfo) {
        Intrinsics.f(adInfo, "adInfo");
        this.strategy.a(this.isExpired ? "load success on expired ad" : "load success before load called");
    }

    @Override // com.p004ironsource.ie
    public void a(LevelPlayAdInfo adInfo) {
        Intrinsics.f(adInfo, "adInfo");
        this.strategy.a(this.isExpired ? "load with better ad on expired ad" : "load success with better ad before load success");
    }
}
