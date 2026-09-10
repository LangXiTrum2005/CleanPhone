package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ab, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3423ab {
    private final G7 a;
    private final Va b;

    /* JADX INFO: renamed from: com.ironsource.ab$a */
    public static final class a implements InterfaceC3833y0 {
        public a() {
        }

        @Override // com.ironsource.InterfaceC3833y0
        public AbstractC3816x0 a(boolean z, C3538h0 adProperties) {
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            return C3859z9.z.a(adProperties, C3423ab.this.a.f().a(), z);
        }
    }

    public C3423ab(String adUnitId, Va.b config, C3681p0 adTools, C3454c6 adControllerFactory, G7 provider, InterfaceC3667o4 currentTimeProvider, C3772u7 idFactory, Z0 adUnitValidator) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adControllerFactory, "adControllerFactory");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(idFactory, "idFactory");
        Intrinsics.checkNotNullParameter(adUnitValidator, "adUnitValidator");
        this.a = provider;
        this.b = new Va(LevelPlay.AdFormat.INTERSTITIAL, adUnitId, config, adTools, adControllerFactory, adUnitValidator, a(), provider, currentTimeProvider, idFactory);
    }

    public final String b() {
        String string = this.b.e().toString();
        Intrinsics.checkNotNullExpressionValue(string, "fullScreenAdInternal.adId.toString()");
        return string;
    }

    public final boolean c() {
        IronLog.API.info("LevelPlayInterstitialAd.isAdReady()");
        return this.b.m();
    }

    public final void d() {
        IronLog.API.info("LevelPlayInterstitialAd.loadAd()");
        this.b.n();
    }

    public final void a(LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
        IronLog.API.info("LevelPlayInterstitialAd.setListener()");
        this.b.a(levelPlayInterstitialAdListener != null ? C3441bb.b(levelPlayInterstitialAdListener) : null);
    }

    public final void a(Activity activity, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        IronLog.API.info("LevelPlayInterstitialAd.showAd() placementName: " + str);
        this.b.a(activity, str);
    }

    private final InterfaceC3833y0 a() {
        return new a();
    }
}
