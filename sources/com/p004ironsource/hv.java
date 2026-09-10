package com.p004ironsource;

import android.webkit.JavascriptInterface;
import com.p004ironsource.mediationsdk.IronSource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010+\u001a\u00020 \u0012\u0006\u0010,\u001a\u00020'\u0012\u0006\u0010-\u001a\u00020#¢\u0006\u0004\b.\u0010/J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0002J \u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0007J*\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0007J\b\u0010\u0010\u001a\u00020\bH\u0007J\b\u0010\u0011\u001a\u00020\bH\u0007J \u0010\u0012\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0007J*\u0010\u0012\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0007J\b\u0010\u0013\u001a\u00020\bH\u0007J\b\u0010\u0014\u001a\u00020\bH\u0007J8\u0010\u0019\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0007JB\u0010\u0019\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0007J\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007J\b\u0010\u001d\u001a\u00020\bH\u0007J\b\u0010\u001e\u001a\u00020\bH\u0007J\b\u0010\u001f\u001a\u00020\bH\u0007R\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u00060"}, d2 = {"Lcom/ironsource/hv;", "", "", "callbackName", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "adUnit", "", "args", "", "a", "adNetwork", "", "isBidding", "isTest", "loadInterstitialAd", "adUnitId", "isInterstitialReady", "showInterstitialAd", "loadRewardedVideoAd", "isRewardedVideoReady", "showRewardedVideoAd", "description", "", "width", "height", "loadBannerAd", "", "marginPercentageFromTop", "addBannerAdToScreen", "destroyBannerAd", "onDataLoaded", "closeTestSuite", "Lcom/ironsource/dv;", "Lcom/ironsource/dv;", "mAdsManager", "Lcom/ironsource/iv;", "b", "Lcom/ironsource/iv;", "mJavaScriptEvaluator", "Lcom/ironsource/oi;", "c", "Lcom/ironsource/oi;", "mUILifeCycleListener", "adsManager", "uiLifeCycleListener", "javaScriptEvaluator", "<init>", "(Lcom/ironsource/dv;Lcom/ironsource/oi;Lcom/ironsource/iv;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class hv {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final dv mAdsManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iv mJavaScriptEvaluator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final oi mUILifeCycleListener;

    public hv(dv adsManager, oi uiLifeCycleListener, iv javaScriptEvaluator) {
        Intrinsics.f(adsManager, "adsManager");
        Intrinsics.f(uiLifeCycleListener, "uiLifeCycleListener");
        Intrinsics.f(javaScriptEvaluator, "javaScriptEvaluator");
        this.mAdsManager = adsManager;
        this.mJavaScriptEvaluator = javaScriptEvaluator;
        this.mUILifeCycleListener = uiLifeCycleListener;
    }

    private final void a(String callbackName, IronSource.AD_UNIT adUnit, List<? extends Object> args) {
        this.mJavaScriptEvaluator.a(callbackName, adUnit, args);
    }

    @JavascriptInterface
    public final void addBannerAdToScreen(double marginPercentageFromTop) {
        this.mAdsManager.getBnManager().a(marginPercentageFromTop);
    }

    @JavascriptInterface
    public final void closeTestSuite() {
        destroyBannerAd();
        this.mUILifeCycleListener.onClosed();
    }

    @JavascriptInterface
    public final void destroyBannerAd() {
        this.mAdsManager.getBnManager().b();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @JavascriptInterface
    public final void isInterstitialReady() {
        a("isInterstitialReady", IronSource.AD_UNIT.INTERSTITIAL, vv.f27547a.a(Boolean.valueOf(this.mAdsManager.getIsManager().e())));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @JavascriptInterface
    public final void isRewardedVideoReady() {
        a("isRewardedVideoReady", IronSource.AD_UNIT.REWARDED_VIDEO, vv.f27547a.a(Boolean.valueOf(this.mAdsManager.getRvManager().a())));
    }

    @JavascriptInterface
    public final void loadBannerAd(String adUnitId, String adNetwork, boolean isBidding, boolean isTest, String description, int width, int height) {
        Intrinsics.f(adNetwork, "adNetwork");
        Intrinsics.f(description, "description");
        this.mAdsManager.getBnManager().a(new jv(adNetwork, isBidding, Boolean.valueOf(isTest), adUnitId), description, width, height);
    }

    @JavascriptInterface
    public final void loadInterstitialAd(String adUnitId, String adNetwork, boolean isBidding, boolean isTest) {
        Intrinsics.f(adNetwork, "adNetwork");
        this.mAdsManager.getIsManager().a(new jv(adNetwork, isBidding, Boolean.valueOf(isTest), adUnitId));
    }

    @JavascriptInterface
    public final void loadRewardedVideoAd(String adUnitId, String adNetwork, boolean isBidding, boolean isTest) {
        Intrinsics.f(adNetwork, "adNetwork");
        this.mAdsManager.getRvManager().b(new jv(adNetwork, isBidding, Boolean.valueOf(isTest), adUnitId));
    }

    @JavascriptInterface
    public final void onDataLoaded() {
        this.mUILifeCycleListener.onUIReady();
    }

    @JavascriptInterface
    public final void showInterstitialAd() {
        this.mAdsManager.getIsManager().c();
    }

    @JavascriptInterface
    public final void showRewardedVideoAd() {
        this.mAdsManager.getRvManager().d();
    }

    @JavascriptInterface
    public final void loadBannerAd(String adNetwork, boolean isBidding, boolean isTest, String description, int width, int height) {
        Intrinsics.f(adNetwork, "adNetwork");
        Intrinsics.f(description, "description");
        loadBannerAd(null, adNetwork, isBidding, isTest, description, width, height);
    }

    @JavascriptInterface
    public final void loadInterstitialAd(String adNetwork, boolean isBidding, boolean isTest) {
        Intrinsics.f(adNetwork, "adNetwork");
        loadInterstitialAd(null, adNetwork, isBidding, isTest);
    }

    @JavascriptInterface
    public final void loadRewardedVideoAd(String adNetwork, boolean isBidding, boolean isTest) {
        Intrinsics.f(adNetwork, "adNetwork");
        loadRewardedVideoAd(null, adNetwork, isBidding, isTest);
    }
}
