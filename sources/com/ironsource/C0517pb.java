package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;

/* JADX INFO: renamed from: com.ironsource.pb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0517pb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ya f30008a;

    /* JADX INFO: renamed from: com.ironsource.pb$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a implements InterfaceC0667y0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ I7 f30009a;

        public a(I7 i10) {
            this.f30009a = i10;
        }

        @Override // com.ironsource.InterfaceC0667y0
        public AbstractC0649x0 a(boolean z10, C0363h0 adProperties) {
            kotlin.jvm.internal.n.f(adProperties, "adProperties");
            return C0287ce.f28376z.a(adProperties, this.f30009a.f().a(), z10);
        }
    }

    public C0517pb(String adUnitId, Ya.b config, C0506p0 adTools, C0333f6 adControllerFactory, I7 provider, InterfaceC0510p4 currentTimeProvider, C0638w7 idFactory, Z0 adUnitValidator) {
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
        kotlin.jvm.internal.n.f(config, "config");
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(adControllerFactory, "adControllerFactory");
        kotlin.jvm.internal.n.f(provider, "provider");
        kotlin.jvm.internal.n.f(currentTimeProvider, "currentTimeProvider");
        kotlin.jvm.internal.n.f(idFactory, "idFactory");
        kotlin.jvm.internal.n.f(adUnitValidator, "adUnitValidator");
        this.f30008a = new Ya(LevelPlay.AdFormat.REWARDED, adUnitId, config, adTools, adControllerFactory, adUnitValidator, a(provider), provider, currentTimeProvider, idFactory);
    }

    public final String a() {
        String string = this.f30008a.e().toString();
        kotlin.jvm.internal.n.e(string, "fullScreenAdInternal.adId.toString()");
        return string;
    }

    public final boolean b() {
        IronLog.API.info("LevelPlayRewardedAd.isAdReady()");
        return this.f30008a.m();
    }

    public final void c() {
        IronLog.API.info("LevelPlayRewardedAd.loadAd()");
        this.f30008a.n();
    }

    public final void a(Activity activity, String str) {
        kotlin.jvm.internal.n.f(activity, "activity");
        IronLog.API.info("LevelPlayRewardedAd.showAd() placementName: " + str);
        this.f30008a.a(activity, str);
    }

    public final void a(LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
        IronLog.API.info("LevelPlayRewardedAd.setListener()");
        this.f30008a.a(levelPlayRewardedAdListener != null ? C0535qb.b(levelPlayRewardedAdListener) : null);
    }

    public final LevelPlayReward a(String str) {
        IronLog.API.info("LevelPlayRewardedAd.getReward()");
        return this.f30008a.a(str);
    }

    private final a a(I7 i10) {
        return new a(i10);
    }
}
