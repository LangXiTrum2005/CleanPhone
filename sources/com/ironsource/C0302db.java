package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;

/* JADX INFO: renamed from: com.ironsource.db, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0302db {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I7 f28468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Ya f28469b;

    /* JADX INFO: renamed from: com.ironsource.db$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a implements InterfaceC0667y0 {
        public a() {
        }

        @Override // com.ironsource.InterfaceC0667y0
        public AbstractC0649x0 a(boolean z10, C0363h0 adProperties) {
            kotlin.jvm.internal.n.f(adProperties, "adProperties");
            return C9.f25859z.a(adProperties, C0302db.this.f28468a.f().a(), z10);
        }
    }

    public C0302db(String adUnitId, Ya.b config, C0506p0 adTools, C0333f6 adControllerFactory, I7 provider, InterfaceC0510p4 currentTimeProvider, C0638w7 idFactory, Z0 adUnitValidator) {
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
        kotlin.jvm.internal.n.f(config, "config");
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(adControllerFactory, "adControllerFactory");
        kotlin.jvm.internal.n.f(provider, "provider");
        kotlin.jvm.internal.n.f(currentTimeProvider, "currentTimeProvider");
        kotlin.jvm.internal.n.f(idFactory, "idFactory");
        kotlin.jvm.internal.n.f(adUnitValidator, "adUnitValidator");
        this.f28468a = provider;
        this.f28469b = new Ya(LevelPlay.AdFormat.INTERSTITIAL, adUnitId, config, adTools, adControllerFactory, adUnitValidator, a(), provider, currentTimeProvider, idFactory);
    }

    public final String b() {
        String string = this.f28469b.e().toString();
        kotlin.jvm.internal.n.e(string, "fullScreenAdInternal.adId.toString()");
        return string;
    }

    public final boolean c() {
        IronLog.API.info("LevelPlayInterstitialAd.isAdReady()");
        return this.f28469b.m();
    }

    public final void d() {
        IronLog.API.info("LevelPlayInterstitialAd.loadAd()");
        this.f28469b.n();
    }

    public final void a(LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
        IronLog.API.info("LevelPlayInterstitialAd.setListener()");
        this.f28469b.a(levelPlayInterstitialAdListener != null ? C0320eb.b(levelPlayInterstitialAdListener) : null);
    }

    public final void a(Activity activity, String str) {
        kotlin.jvm.internal.n.f(activity, "activity");
        IronLog.API.info("LevelPlayInterstitialAd.showAd() placementName: " + str);
        this.f28469b.a(activity, str);
    }

    private final InterfaceC0667y0 a() {
        return new a();
    }
}
