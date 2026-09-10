package com.p004ironsource;

import android.content.Context;
import android.os.Handler;
import com.p004ironsource.mediationsdk.testSuite.TestSuiteActivity;
import com.smartdigimkt.h5.f;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAd;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAd;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010(\u001a\u00020\u0004\u0012\u0006\u0010)\u001a\u00020\u001d¢\u0006\u0004\b*\u0010+J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\r\u001a\u00020\bH\u0016R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00040\u00040\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001eR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\"R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"¨\u0006,"}, d2 = {"Lcom/ironsource/mv;", "Lcom/ironsource/dv$c;", "Lcom/ironsource/dv$d;", "Lcom/ironsource/dv$b;", "Lcom/ironsource/mediationsdk/testSuite/TestSuiteActivity;", f.j, "Lcom/ironsource/jv;", "loadAdConfig", "", "a", "", "e", "c", "b", "d", "", "description", "", "width", "height", "", "marginPercentageFromTop", "Lcom/ironsource/ni$a;", "Lcom/ironsource/ni$a;", "testSuiteLoadAdConfigService", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "Ljava/lang/ref/WeakReference;", "mTestSuiteActivityWeakReference", "Landroid/os/Handler;", "Landroid/os/Handler;", "mHandler", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/unity3d/mediation/banner/LevelPlayBannerAdView;", "Ljava/util/concurrent/atomic/AtomicReference;", "bannerRef", "Lcom/unity3d/mediation/interstitial/LevelPlayInterstitialAd;", "interstitialAdRef", "Lcom/unity3d/mediation/rewarded/LevelPlayRewardedAd;", "rewardedAdRef", "activity", "handler", "<init>", "(Lcom/ironsource/mediationsdk/testSuite/TestSuiteActivity;Landroid/os/Handler;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class mv implements dv.c, dv.d, dv.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ni.a testSuiteLoadAdConfigService;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final WeakReference<TestSuiteActivity> mTestSuiteActivityWeakReference;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Handler mHandler;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AtomicReference<LevelPlayBannerAdView> bannerRef;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference<LevelPlayInterstitialAd> interstitialAdRef;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AtomicReference<LevelPlayRewardedAd> rewardedAdRef;

    public mv(TestSuiteActivity activity, Handler handler) {
        Intrinsics.f(activity, "activity");
        Intrinsics.f(handler, "handler");
        this.testSuiteLoadAdConfigService = on.INSTANCE.a().s();
        this.mTestSuiteActivityWeakReference = new WeakReference<>(activity);
        this.mHandler = handler;
        this.bannerRef = new AtomicReference<>();
        this.interstitialAdRef = new AtomicReference<>();
        this.rewardedAdRef = new AtomicReference<>();
    }

    private final TestSuiteActivity f() {
        return this.mTestSuiteActivityWeakReference.get();
    }

    @Override // com.ironsource.dv.b
    public void a(double marginPercentageFromTop) {
        LevelPlayBannerAdView levelPlayBannerAdView;
        TestSuiteActivity testSuiteActivityF = f();
        if (testSuiteActivityF == null || (levelPlayBannerAdView = this.bannerRef.get()) == null || levelPlayBannerAdView.getParent() != null) {
            return;
        }
        this.mHandler.post(new W(testSuiteActivityF, levelPlayBannerAdView, 1));
    }

    @Override // com.ironsource.dv.b
    public void b() {
        LevelPlayBannerAdView andSet;
        TestSuiteActivity testSuiteActivityF = f();
        if (testSuiteActivityF == null || (andSet = this.bannerRef.getAndSet(null)) == null) {
            return;
        }
        andSet.destroy();
        this.mHandler.post(new W(testSuiteActivityF, andSet, 0));
    }

    @Override // com.ironsource.dv.c
    public boolean e() {
        LevelPlayInterstitialAd levelPlayInterstitialAd = this.interstitialAdRef.get();
        if (levelPlayInterstitialAd != null) {
            return levelPlayInterstitialAd.isAdReady();
        }
        return false;
    }

    @Override // com.ironsource.dv.c
    public void a(jv loadAdConfig) {
        Intrinsics.f(loadAdConfig, "loadAdConfig");
        this.testSuiteLoadAdConfigService.a(loadAdConfig);
        AtomicReference<LevelPlayInterstitialAd> atomicReference = this.interstitialAdRef;
        String mAdUnitId = loadAdConfig.getMAdUnitId();
        if (mAdUnitId == null) {
            mAdUnitId = "";
        }
        LevelPlayInterstitialAd levelPlayInterstitialAd = new LevelPlayInterstitialAd(mAdUnitId);
        levelPlayInterstitialAd.setListener(new ov());
        levelPlayInterstitialAd.loadAd();
        atomicReference.set(levelPlayInterstitialAd);
    }

    @Override // com.ironsource.dv.d
    public void b(jv loadAdConfig) {
        Intrinsics.f(loadAdConfig, "loadAdConfig");
        this.testSuiteLoadAdConfigService.a(loadAdConfig);
        AtomicReference<LevelPlayRewardedAd> atomicReference = this.rewardedAdRef;
        String mAdUnitId = loadAdConfig.getMAdUnitId();
        if (mAdUnitId == null) {
            mAdUnitId = "";
        }
        LevelPlayRewardedAd levelPlayRewardedAd = new LevelPlayRewardedAd(mAdUnitId);
        levelPlayRewardedAd.setListener(new pv());
        levelPlayRewardedAd.loadAd();
        atomicReference.set(levelPlayRewardedAd);
    }

    @Override // com.ironsource.dv.c
    public void c() {
        TestSuiteActivity testSuiteActivityF = f();
        if (testSuiteActivityF != null) {
            LevelPlayInterstitialAd levelPlayInterstitialAd = this.interstitialAdRef.get();
            Intrinsics.e(levelPlayInterstitialAd, "interstitialAdRef.get()");
            LevelPlayInterstitialAd.showAd$default(levelPlayInterstitialAd, testSuiteActivityF, null, 2, null);
        }
    }

    @Override // com.ironsource.dv.d
    public void d() {
        TestSuiteActivity testSuiteActivityF = f();
        if (testSuiteActivityF != null) {
            LevelPlayRewardedAd levelPlayRewardedAd = this.rewardedAdRef.get();
            Intrinsics.e(levelPlayRewardedAd, "rewardedAdRef.get()");
            LevelPlayRewardedAd.showAd$default(levelPlayRewardedAd, testSuiteActivityF, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(TestSuiteActivity testSuiteActivity, LevelPlayBannerAdView it) {
        Intrinsics.f(testSuiteActivity, "$testSuiteActivity");
        Intrinsics.f(it, "$it");
        testSuiteActivity.getContainer().removeView(it);
    }

    @Override // com.ironsource.dv.b
    public void a(jv loadAdConfig, String description, int width, int height) {
        Intrinsics.f(loadAdConfig, "loadAdConfig");
        Intrinsics.f(description, "description");
        b();
        TestSuiteActivity testSuiteActivityF = f();
        if (testSuiteActivityF != null) {
            this.testSuiteLoadAdConfigService.a(loadAdConfig);
            LevelPlayBannerAdView.Config configBuild = new LevelPlayBannerAdView.Config.Builder().setAdSize(qv.f26644a.b(description, width, height)).build();
            AtomicReference<LevelPlayBannerAdView> atomicReference = this.bannerRef;
            String mAdUnitId = loadAdConfig.getMAdUnitId();
            if (mAdUnitId == null) {
                mAdUnitId = "";
            }
            LevelPlayBannerAdView levelPlayBannerAdView = new LevelPlayBannerAdView(testSuiteActivityF, mAdUnitId, configBuild);
            levelPlayBannerAdView.setBannerListener(new nv());
            levelPlayBannerAdView.pauseAutoRefresh();
            levelPlayBannerAdView.loadAd();
            atomicReference.set(levelPlayBannerAdView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(TestSuiteActivity testSuiteActivity, LevelPlayBannerAdView banner) {
        Intrinsics.f(testSuiteActivity, "$testSuiteActivity");
        Intrinsics.f(banner, "$banner");
        testSuiteActivity.getContainer().addView(banner, vv.f27547a.a((Context) testSuiteActivity));
    }

    @Override // com.ironsource.dv.d
    public boolean a() {
        LevelPlayRewardedAd levelPlayRewardedAd = this.rewardedAdRef.get();
        if (levelPlayRewardedAd != null) {
            return levelPlayRewardedAd.isAdReady();
        }
        return false;
    }
}
