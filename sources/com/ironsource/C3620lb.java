package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.lb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3620lb {
    private final Va a;

    /* JADX INFO: renamed from: com.ironsource.lb$a */
    public static final class a implements InterfaceC3833y0 {
        final /* synthetic */ G7 a;

        public a(G7 g7) {
            this.a = g7;
        }

        @Override // com.ironsource.InterfaceC3833y0
        public AbstractC3816x0 a(boolean z, C3538h0 adProperties) {
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            return Pd.z.a(adProperties, this.a.f().a(), z);
        }
    }

    public C3620lb(String adUnitId, Va.b config, C3681p0 adTools, C3454c6 adControllerFactory, G7 provider, InterfaceC3667o4 currentTimeProvider, C3772u7 idFactory, Z0 adUnitValidator) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adControllerFactory, "adControllerFactory");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(idFactory, "idFactory");
        Intrinsics.checkNotNullParameter(adUnitValidator, "adUnitValidator");
        this.a = new Va(LevelPlay.AdFormat.REWARDED, adUnitId, config, adTools, adControllerFactory, adUnitValidator, a(provider), provider, currentTimeProvider, idFactory);
    }

    public final String a() {
        String string = this.a.e().toString();
        Intrinsics.checkNotNullExpressionValue(string, "fullScreenAdInternal.adId.toString()");
        return string;
    }

    public final boolean b() {
        IronLog.API.info("LevelPlayRewardedAd.isAdReady()");
        return this.a.m();
    }

    public final void c() {
        IronLog.API.info("LevelPlayRewardedAd.loadAd()");
        this.a.n();
    }

    public final void a(Activity activity, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        IronLog.API.info("LevelPlayRewardedAd.showAd() placementName: " + str);
        this.a.a(activity, str);
    }

    public final void a(LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
        IronLog.API.info("LevelPlayRewardedAd.setListener()");
        this.a.a(levelPlayRewardedAdListener != null ? C3638mb.b(levelPlayRewardedAdListener) : null);
    }

    public final LevelPlayReward a(String str) {
        IronLog.API.info("LevelPlayRewardedAd.getReward()");
        return this.a.a(str);
    }

    private final a a(G7 g7) {
        return new a(g7);
    }
}
