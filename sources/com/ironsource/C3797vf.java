package com.ironsource;

import android.content.Context;
import android.os.Handler;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAd;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAd;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.vf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3797vf {
    private final P8.a a;
    private final WeakReference<TestSuiteActivity> b;
    private final Handler c;
    private final AtomicReference<LevelPlayBannerAdView> d;
    private final AtomicReference<LevelPlayInterstitialAd> e;
    private final AtomicReference<LevelPlayRewardedAd> f;

    public C3797vf(TestSuiteActivity activity, Handler handler) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.a = Gb.s.a().d();
        this.b = new WeakReference<>(activity);
        this.c = handler;
        this.d = new AtomicReference<>();
        this.e = new AtomicReference<>();
        this.f = new AtomicReference<>();
    }

    public final void a(Df loadAdConfig) {
        Intrinsics.checkNotNullParameter(loadAdConfig, "loadAdConfig");
        this.a.a(loadAdConfig);
        AtomicReference<LevelPlayInterstitialAd> atomicReference = this.e;
        String strA = loadAdConfig.a();
        if (strA == null) {
            strA = "";
        }
        LevelPlayInterstitialAd levelPlayInterstitialAd = new LevelPlayInterstitialAd(strA);
        levelPlayInterstitialAd.setListener(new Af());
        levelPlayInterstitialAd.loadAd();
        atomicReference.set(levelPlayInterstitialAd);
    }

    public final void b(Df loadAdConfig) {
        Intrinsics.checkNotNullParameter(loadAdConfig, "loadAdConfig");
        this.a.a(loadAdConfig);
        AtomicReference<LevelPlayRewardedAd> atomicReference = this.f;
        String strA = loadAdConfig.a();
        if (strA == null) {
            strA = "";
        }
        LevelPlayRewardedAd levelPlayRewardedAd = new LevelPlayRewardedAd(strA);
        levelPlayRewardedAd.setListener(new Jf());
        levelPlayRewardedAd.loadAd();
        atomicReference.set(levelPlayRewardedAd);
    }

    public final boolean c() {
        LevelPlayInterstitialAd levelPlayInterstitialAd = this.e.get();
        if (levelPlayInterstitialAd != null) {
            return levelPlayInterstitialAd.isAdReady();
        }
        return false;
    }

    public final boolean d() {
        LevelPlayRewardedAd levelPlayRewardedAd = this.f.get();
        if (levelPlayRewardedAd != null) {
            return levelPlayRewardedAd.isAdReady();
        }
        return false;
    }

    public final void e() {
        TestSuiteActivity testSuiteActivityB = b();
        if (testSuiteActivityB != null) {
            LevelPlayInterstitialAd levelPlayInterstitialAd = this.e.get();
            Intrinsics.checkNotNullExpressionValue(levelPlayInterstitialAd, "interstitialAdRef.get()");
            LevelPlayInterstitialAd.showAd$default(levelPlayInterstitialAd, testSuiteActivityB, null, 2, null);
        }
    }

    public final void f() {
        TestSuiteActivity testSuiteActivityB = b();
        if (testSuiteActivityB != null) {
            LevelPlayRewardedAd levelPlayRewardedAd = this.f.get();
            Intrinsics.checkNotNullExpressionValue(levelPlayRewardedAd, "rewardedAdRef.get()");
            LevelPlayRewardedAd.showAd$default(levelPlayRewardedAd, testSuiteActivityB, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(TestSuiteActivity testSuiteActivity, LevelPlayBannerAdView it) {
        Intrinsics.checkNotNullParameter(testSuiteActivity, "$testSuiteActivity");
        Intrinsics.checkNotNullParameter(it, "$it");
        testSuiteActivity.getContainer().removeView(it);
    }

    public final void a(Df loadAdConfig, String description, int i, int i2) {
        Intrinsics.checkNotNullParameter(loadAdConfig, "loadAdConfig");
        Intrinsics.checkNotNullParameter(description, "description");
        a();
        TestSuiteActivity testSuiteActivityB = b();
        if (testSuiteActivityB != null) {
            this.a.a(loadAdConfig);
            LevelPlayBannerAdView.Config configBuild = new LevelPlayBannerAdView.Config.Builder().setAdSize(Gf.a.b(description, i, i2)).build();
            AtomicReference<LevelPlayBannerAdView> atomicReference = this.d;
            String strA = loadAdConfig.a();
            if (strA == null) {
                strA = "";
            }
            LevelPlayBannerAdView levelPlayBannerAdView = new LevelPlayBannerAdView(testSuiteActivityB, strA, configBuild);
            levelPlayBannerAdView.setBannerListener(new C3814wf());
            levelPlayBannerAdView.pauseAutoRefresh();
            levelPlayBannerAdView.loadAd();
            atomicReference.set(levelPlayBannerAdView);
        }
    }

    private final TestSuiteActivity b() {
        return this.b.get();
    }

    public final void a(double d) {
        final LevelPlayBannerAdView levelPlayBannerAdView;
        final TestSuiteActivity testSuiteActivityB = b();
        if (testSuiteActivityB == null || (levelPlayBannerAdView = this.d.get()) == null || levelPlayBannerAdView.getParent() != null) {
            return;
        }
        this.c.post(new Runnable() { // from class: com.ironsource.untruth
            @Override // java.lang.Runnable
            public final void run() {
                C3797vf.a(testSuiteActivityB, levelPlayBannerAdView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(TestSuiteActivity testSuiteActivity, LevelPlayBannerAdView banner) {
        Intrinsics.checkNotNullParameter(testSuiteActivity, "$testSuiteActivity");
        Intrinsics.checkNotNullParameter(banner, "$banner");
        testSuiteActivity.getContainer().addView(banner, Lf.a.a((Context) testSuiteActivity));
    }

    public final void a() {
        final LevelPlayBannerAdView andSet;
        final TestSuiteActivity testSuiteActivityB = b();
        if (testSuiteActivityB == null || (andSet = this.d.getAndSet(null)) == null) {
            return;
        }
        andSet.destroy();
        this.c.post(new Runnable() { // from class: com.ironsource.murrine
            @Override // java.lang.Runnable
            public final void run() {
                C3797vf.b(testSuiteActivityB, andSet);
            }
        });
    }
}
