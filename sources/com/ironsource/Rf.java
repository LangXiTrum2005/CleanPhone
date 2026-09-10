package com.ironsource;

import android.webkit.JavascriptInterface;
import com.unity3d.mediation.LevelPlay;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Rf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lf f27150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Sf f27151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final S8 f27152c;

    public Rf(Lf adsManager, S8 uiLifeCycleListener, Sf javaScriptEvaluator) {
        kotlin.jvm.internal.n.f(adsManager, "adsManager");
        kotlin.jvm.internal.n.f(uiLifeCycleListener, "uiLifeCycleListener");
        kotlin.jvm.internal.n.f(javaScriptEvaluator, "javaScriptEvaluator");
        this.f27150a = adsManager;
        this.f27151b = javaScriptEvaluator;
        this.f27152c = uiLifeCycleListener;
    }

    private final void a(String str, LevelPlay.AdFormat adFormat, List<? extends Object> list) {
        this.f27151b.a(str, adFormat, list);
    }

    @JavascriptInterface
    public final void addBannerAdToScreen(double d10) {
        this.f27150a.a(d10);
    }

    @JavascriptInterface
    public final void closeTestSuite() {
        destroyBannerAd();
        this.f27152c.onClosed();
    }

    @JavascriptInterface
    public final void destroyBannerAd() {
        this.f27150a.a();
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
        a("isInterstitialReady", LevelPlay.AdFormat.INTERSTITIAL, C0271bg.f28309a.a(Boolean.valueOf(this.f27150a.c())));
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
        a("isRewardedVideoReady", LevelPlay.AdFormat.REWARDED, C0271bg.f28309a.a(Boolean.valueOf(this.f27150a.d())));
    }

    @JavascriptInterface
    public final void loadBannerAd(String adNetwork, boolean z10, boolean z11, String description, int i10, int i11) {
        kotlin.jvm.internal.n.f(adNetwork, "adNetwork");
        kotlin.jvm.internal.n.f(description, "description");
        loadBannerAd(null, adNetwork, z10, z11, description, i10, i11);
    }

    @JavascriptInterface
    public final void loadInterstitialAd(String adNetwork, boolean z10, boolean z11) {
        kotlin.jvm.internal.n.f(adNetwork, "adNetwork");
        loadInterstitialAd(null, adNetwork, z10, z11);
    }

    @JavascriptInterface
    public final void loadRewardedVideoAd(String adNetwork, boolean z10, boolean z11) {
        kotlin.jvm.internal.n.f(adNetwork, "adNetwork");
        loadRewardedVideoAd(null, adNetwork, z10, z11);
    }

    @JavascriptInterface
    public final void onDataLoaded() {
        this.f27152c.onUIReady();
    }

    @JavascriptInterface
    public final void showInterstitialAd() {
        this.f27150a.e();
    }

    @JavascriptInterface
    public final void showRewardedVideoAd() {
        this.f27150a.f();
    }

    @JavascriptInterface
    public final void loadBannerAd(String str, String adNetwork, boolean z10, boolean z11, String description, int i10, int i11) {
        kotlin.jvm.internal.n.f(adNetwork, "adNetwork");
        kotlin.jvm.internal.n.f(description, "description");
        this.f27150a.a(new Tf(adNetwork, z10, Boolean.valueOf(z11), str), description, i10, i11);
    }

    @JavascriptInterface
    public final void loadInterstitialAd(String str, String adNetwork, boolean z10, boolean z11) {
        kotlin.jvm.internal.n.f(adNetwork, "adNetwork");
        this.f27150a.b(new Tf(adNetwork, z10, Boolean.valueOf(z11), str));
    }

    @JavascriptInterface
    public final void loadRewardedVideoAd(String str, String adNetwork, boolean z10, boolean z11) {
        kotlin.jvm.internal.n.f(adNetwork, "adNetwork");
        this.f27150a.c(new Tf(adNetwork, z10, Boolean.valueOf(z11), str));
    }
}
