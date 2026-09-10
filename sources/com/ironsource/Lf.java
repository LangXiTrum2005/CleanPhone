package com.ironsource;

import android.content.Context;
import android.os.Handler;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAd;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAd;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Lf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final R8.a f26509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference<TestSuiteActivity> f26510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f26511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference<LevelPlayBannerAdView> f26512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicReference<LevelPlayInterstitialAd> f26513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReference<LevelPlayRewardedAd> f26514f;

    public Lf(TestSuiteActivity activity, Handler handler) {
        kotlin.jvm.internal.n.f(activity, "activity");
        kotlin.jvm.internal.n.f(handler, "handler");
        this.f26509a = Kb.f26413u.a().d();
        this.f26510b = new WeakReference<>(activity);
        this.f26511c = handler;
        this.f26512d = new AtomicReference<>();
        this.f26513e = new AtomicReference<>();
        this.f26514f = new AtomicReference<>();
    }

    public final void a(Tf loadAdConfig, String description, int i10, int i11) {
        kotlin.jvm.internal.n.f(loadAdConfig, "loadAdConfig");
        kotlin.jvm.internal.n.f(description, "description");
        a();
        TestSuiteActivity testSuiteActivityB = b();
        if (testSuiteActivityB != null) {
            this.f26509a.a(loadAdConfig);
            a(loadAdConfig);
            LevelPlayBannerAdView.Config configBuild = new LevelPlayBannerAdView.Config.Builder().setAdSize(Wf.f27610a.b(description, i10, i11)).build();
            AtomicReference<LevelPlayBannerAdView> atomicReference = this.f26512d;
            String strB = loadAdConfig.b();
            if (strB == null) {
                strB = "";
            }
            LevelPlayBannerAdView levelPlayBannerAdView = new LevelPlayBannerAdView(testSuiteActivityB, strB, configBuild);
            levelPlayBannerAdView.setBannerListener(new Mf());
            levelPlayBannerAdView.pauseAutoRefresh();
            levelPlayBannerAdView.loadAd();
            atomicReference.set(levelPlayBannerAdView);
        }
    }

    public final void b(Tf loadAdConfig) {
        kotlin.jvm.internal.n.f(loadAdConfig, "loadAdConfig");
        this.f26509a.a(loadAdConfig);
        a(loadAdConfig);
        AtomicReference<LevelPlayInterstitialAd> atomicReference = this.f26513e;
        String strB = loadAdConfig.b();
        if (strB == null) {
            strB = "";
        }
        LevelPlayInterstitialAd levelPlayInterstitialAd = new LevelPlayInterstitialAd(strB);
        levelPlayInterstitialAd.setListener(new Qf());
        levelPlayInterstitialAd.loadAd();
        atomicReference.set(levelPlayInterstitialAd);
    }

    public final void e() {
        TestSuiteActivity testSuiteActivityB = b();
        if (testSuiteActivityB != null) {
            LevelPlayInterstitialAd levelPlayInterstitialAd = this.f26513e.get();
            kotlin.jvm.internal.n.e(levelPlayInterstitialAd, "interstitialAdRef.get()");
            LevelPlayInterstitialAd.showAd$default(levelPlayInterstitialAd, testSuiteActivityB, null, 2, null);
        }
    }

    public final void f() {
        TestSuiteActivity testSuiteActivityB = b();
        if (testSuiteActivityB != null) {
            LevelPlayRewardedAd levelPlayRewardedAd = this.f26514f.get();
            kotlin.jvm.internal.n.e(levelPlayRewardedAd, "rewardedAdRef.get()");
            LevelPlayRewardedAd.showAd$default(levelPlayRewardedAd, testSuiteActivityB, null, 2, null);
        }
    }

    public final boolean c() {
        LevelPlayInterstitialAd levelPlayInterstitialAd = this.f26513e.get();
        if (levelPlayInterstitialAd != null) {
            return levelPlayInterstitialAd.isAdReady();
        }
        return false;
    }

    public final boolean d() {
        LevelPlayRewardedAd levelPlayRewardedAd = this.f26514f.get();
        if (levelPlayRewardedAd != null) {
            return levelPlayRewardedAd.isAdReady();
        }
        return false;
    }

    public final void c(Tf loadAdConfig) {
        kotlin.jvm.internal.n.f(loadAdConfig, "loadAdConfig");
        this.f26509a.a(loadAdConfig);
        a(loadAdConfig);
        AtomicReference<LevelPlayRewardedAd> atomicReference = this.f26514f;
        String strB = loadAdConfig.b();
        if (strB == null) {
            strB = "";
        }
        LevelPlayRewardedAd levelPlayRewardedAd = new LevelPlayRewardedAd(strB);
        levelPlayRewardedAd.setListener(new Zf());
        levelPlayRewardedAd.loadAd();
        atomicReference.set(levelPlayRewardedAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(TestSuiteActivity testSuiteActivity, LevelPlayBannerAdView it) {
        kotlin.jvm.internal.n.f(testSuiteActivity, "$testSuiteActivity");
        kotlin.jvm.internal.n.f(it, "$it");
        testSuiteActivity.getContainer().removeView(it);
    }

    private final TestSuiteActivity b() {
        return this.f26510b.get();
    }

    public final void a(double d10) {
        LevelPlayBannerAdView levelPlayBannerAdView;
        TestSuiteActivity testSuiteActivityB = b();
        if (testSuiteActivityB == null || (levelPlayBannerAdView = this.f26512d.get()) == null || levelPlayBannerAdView.getParent() != null) {
            return;
        }
        this.f26511c.post(new uh(testSuiteActivityB, levelPlayBannerAdView, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(TestSuiteActivity testSuiteActivity, LevelPlayBannerAdView banner) {
        kotlin.jvm.internal.n.f(testSuiteActivity, "$testSuiteActivity");
        kotlin.jvm.internal.n.f(banner, "$banner");
        testSuiteActivity.getContainer().addView(banner, C0271bg.f28309a.a((Context) testSuiteActivity));
    }

    public final void a() {
        LevelPlayBannerAdView andSet;
        TestSuiteActivity testSuiteActivityB = b();
        if (testSuiteActivityB == null || (andSet = this.f26512d.getAndSet(null)) == null) {
            return;
        }
        andSet.destroy();
        this.f26511c.post(new uh(testSuiteActivityB, andSet, 1));
    }

    private final void a(Tf tf) {
        wj.r rVar;
        String strA = tf.a();
        if (strA != null) {
            com.ironsource.mediationsdk.c.b().a(tf.c(), strA);
            rVar = wj.r.f53297a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            IronLog.INTERNAL.verbose("applyTestMode: adNetworkName is null");
        }
    }
}
