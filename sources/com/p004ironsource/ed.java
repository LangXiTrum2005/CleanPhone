package com.p004ironsource;

import android.app.Activity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.model.Placement;
import com.smartdigimkt.m3.h;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B1\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\b\b\u0002\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u0012\u0010\u0010\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006("}, d2 = {"Lcom/ironsource/ed;", "Lcom/ironsource/m;", "Lcom/ironsource/td;", "Lcom/ironsource/ud;", "", "o", "Landroid/app/Activity;", "activity", "Lcom/ironsource/mediationsdk/model/Placement;", "placement", "a", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "adInfo", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "onAdInfoChanged", "b", h.f36614b, "onClosed", "Lcom/unity3d/mediation/rewarded/LevelPlayReward;", "reward", "Lcom/ironsource/gd;", "Lcom/ironsource/gd;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/ironsource/e1;", "c", "Lcom/ironsource/e1;", "adProperties", "Lcom/ironsource/vd;", "d", "Lcom/ironsource/vd;", "adUnitStrategy", "Lcom/ironsource/m1;", "adTools", "Lcom/ironsource/vd$b;", "adUnitStrategyFactory", "Lcom/ironsource/rd;", "fullscreenAdUnitFactory", "<init>", "(Lcom/ironsource/gd;Lcom/ironsource/m1;Lcom/ironsource/e1;Lcom/ironsource/vd$b;Lcom/ironsource/rd;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ed extends AbstractC3368m implements td, ud {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final gd listener;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e1 adProperties;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final vd adUnitStrategy;

    public ed(gd listener, m1 adTools, e1 adProperties, vd.b adUnitStrategyFactory, rd fullscreenAdUnitFactory) {
        Intrinsics.f(listener, "listener");
        Intrinsics.f(adTools, "adTools");
        Intrinsics.f(adProperties, "adProperties");
        Intrinsics.f(adUnitStrategyFactory, "adUnitStrategyFactory");
        Intrinsics.f(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
        this.listener = listener;
        this.adProperties = adProperties;
        this.adUnitStrategy = adUnitStrategyFactory.a(adTools, adTools.b(adProperties.e(), adProperties.getAdUnitId()), fullscreenAdUnitFactory, this, this);
    }

    @Override // com.p004ironsource.ud
    public void a() {
        this.listener.a();
    }

    @Override // com.p004ironsource.ud
    public void b() {
        this.listener.b();
    }

    @Override // com.p004ironsource.i2
    public void h() {
        this.listener.onAdClicked();
    }

    public final void o() {
        this.adUnitStrategy.loadAd();
    }

    @Override // com.p004ironsource.ud
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        Intrinsics.f(adInfo, "adInfo");
        this.listener.onAdInfoChanged(adInfo);
    }

    @Override // com.p004ironsource.td
    public void onClosed() {
        this.listener.onAdClosed();
    }

    public /* synthetic */ ed(gd gdVar, m1 m1Var, e1 e1Var, vd.b bVar, rd rdVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(gdVar, m1Var, e1Var, (i2 & 8) != 0 ? new vd.b() : bVar, rdVar);
    }

    public final void a(Activity activity, Placement placement) {
        Intrinsics.f(activity, "activity");
        this.adProperties.a(placement);
        this.adUnitStrategy.a(activity);
    }

    @Override // com.p004ironsource.ud
    public void b(IronSourceError error) {
        gd gdVar = this.listener;
        String string = this.adProperties.getCom.ironsource.sdk.controller.f.b.c java.lang.String().toString();
        Intrinsics.e(string, "adProperties.adId.toString()");
        gdVar.a(new LevelPlayAdError(error, string, this.adProperties.getAdUnitId()));
    }

    @Override // com.p004ironsource.ud
    public void a(IronSourceError error) {
        gd gdVar = this.listener;
        String string = this.adProperties.getCom.ironsource.sdk.controller.f.b.c java.lang.String().toString();
        Intrinsics.e(string, "adProperties.adId.toString()");
        gdVar.onAdLoadFailed(new LevelPlayAdError(error, string, this.adProperties.getAdUnitId()));
    }

    @Override // com.p004ironsource.ud
    public void a(LevelPlayAdInfo adInfo) {
        Intrinsics.f(adInfo, "adInfo");
        this.listener.onAdLoaded(adInfo);
    }

    @Override // com.p004ironsource.td
    public void a(LevelPlayReward reward) {
        Intrinsics.f(reward, "reward");
        this.listener.a(reward);
    }
}
