package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.a3;
import com.applovin.impl.e3;
import com.applovin.impl.f5;
import com.applovin.impl.f6;
import com.applovin.impl.k5;
import com.applovin.impl.m3;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.t3;
import com.applovin.impl.u4;
import com.applovin.impl.u6;
import com.applovin.impl.z4;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdViewAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdViewAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f8702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f8703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f8704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m3 f8705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f8706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private MaxAdapter f8707g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f8708h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a3 f8709i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private View f8710j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MaxNativeAd f8711k;
    private MaxNativeAdView l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ViewGroup f8712m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private MaxAdapterResponseParameters f8714o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f8718s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f8701a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final b f8713n = new b(this, null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AtomicBoolean f8715p = new AtomicBoolean(true);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AtomicBoolean f8716q = new AtomicBoolean(false);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final AtomicBoolean f8717r = new AtomicBoolean(false);

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements MaxSignalCollectionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f5 f8719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u4 f8720b;

        public a(f5 f5Var, u4 u4Var) {
            this.f8719a = f5Var;
            this.f8720b = u4Var;
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
        public void onSignalCollected(String str) {
            if (this.f8719a.y() && TextUtils.isEmpty(str)) {
                this.f8720b.a(new MaxErrorImpl("Signal is not a valid string"));
            } else {
                this.f8720b.b(str);
            }
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
        public void onSignalCollectionFailed(String str) {
            this.f8720b.a(new MaxErrorImpl(str));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements MaxInterstitialAdapterListener, MaxAppOpenAdapterListener, MaxRewardedAdapterListener, MaxAdViewAdapterListener, MaxNativeAdAdapterListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MediationServiceImpl.b f8722a;

        private b() {
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked() {
            onAdViewAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdCollapsed() {
            onAdViewAdCollapsed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onAdViewAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed() {
            onAdViewAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdExpanded() {
            onAdViewAdExpanded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden() {
            onAdViewAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoadFailed(MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.p unused = h.this.f8703c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f8703c.k("MediationAdapterWrapper", h.this.f8706f + ": adview ad ad failed to load with error: " + maxAdapterError);
            }
            a("onAdViewAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view) {
            onAdViewAdLoaded(view, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdClicked() {
            onAppOpenAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onAppOpenAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayed() {
            onAppOpenAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdHidden() {
            onAppOpenAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoadFailed(MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.p unused = h.this.f8703c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f8703c.k("MediationAdapterWrapper", h.this.f8706f + ": app open ad failed to load with error: " + maxAdapterError);
            }
            a("onAppOpenAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoaded() {
            onAppOpenAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked() {
            onInterstitialAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onInterstitialAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed() {
            onInterstitialAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden() {
            onInterstitialAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoadFailed(MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.p unused = h.this.f8703c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f8703c.k("MediationAdapterWrapper", h.this.f8706f + ": interstitial ad failed to load with error " + maxAdapterError);
            }
            a("onInterstitialAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded() {
            onInterstitialAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdClicked() {
            onNativeAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdDisplayed(Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f8703c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f8703c.d("MediationAdapterWrapper", h.this.f8706f + ": native ad displayed with extra info: " + bundle);
            }
            a("onNativeAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoadFailed(MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.p unused = h.this.f8703c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f8703c.k("MediationAdapterWrapper", h.this.f8706f + ": native ad ad failed to load with error: " + maxAdapterError);
            }
            a("onNativeAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoaded(MaxNativeAd maxNativeAd, Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f8703c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f8703c.d("MediationAdapterWrapper", h.this.f8706f + ": native ad loaded with extra info: " + bundle);
            }
            h.this.f8711k = maxNativeAd;
            c("onNativeAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked() {
            onRewardedAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onRewardedAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed() {
            onRewardedAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden() {
            onRewardedAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoadFailed(MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.p unused = h.this.f8703c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f8703c.k("MediationAdapterWrapper", h.this.f8706f + ": rewarded ad failed to load with error: " + maxAdapterError);
            }
            a("onRewardedAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded() {
            onRewardedAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onUserRewarded(MaxReward maxReward) {
            onUserRewarded(maxReward, null);
        }

        public /* synthetic */ b(h hVar, a aVar) {
            this();
        }

        private void b(String str, Bundle bundle) {
            if (h.this.f8709i.x().compareAndSet(false, true)) {
                a(str, this.f8722a, new t(this, bundle, 2));
            }
        }

        private void c(String str, Bundle bundle) {
            if (!h.this.f8709i.x().get()) {
                h.this.f8717r.set(true);
                a(str, this.f8722a, new t(this, bundle, 0));
                return;
            }
            com.applovin.impl.sdk.p unused = h.this.f8703c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f8703c.b("MediationAdapterWrapper", h.this.f8706f + ": blocking ad loaded callback for " + h.this.f8709i + " since onAdHidden() has been called");
            }
            h.this.f8702b.u().a(h.this.f8709i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(Bundle bundle) {
            this.f8722a.a(h.this.f8709i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(Bundle bundle) {
            this.f8722a.a(h.this.f8709i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(Bundle bundle) {
            this.f8722a.a(h.this.f8709i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(Bundle bundle) {
            this.f8722a.c(h.this.f8709i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(Bundle bundle) {
            this.f8722a.c(h.this.f8709i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i(Bundle bundle) {
            this.f8722a.e(h.this.f8709i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j(Bundle bundle) {
            if (h.this.f8716q.compareAndSet(false, true)) {
                this.f8722a.f(h.this.f8709i, bundle);
            }
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked(Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f8703c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f8703c.d("MediationAdapterWrapper", h.this.f8706f + ": adview ad clicked with extra info: " + bundle);
            }
            a("onAdViewAdClicked", this.f8722a, new t(this, bundle, 3));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdCollapsed(Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f8703c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f8703c.d("MediationAdapterWrapper", h.this.f8706f + ": adview ad collapsed");
            }
            a("onAdViewAdCollapsed", this.f8722a, new v(this, 0));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f8703c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f8703c.k("MediationAdapterWrapper", h.this.f8706f + ": adview ad failed to display with error: " + maxAdapterError);
            }
            a("onAdViewAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed(Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f8703c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f8703c.d("MediationAdapterWrapper", h.this.f8706f + ": adview ad displayed with extra info: " + bundle);
            }
            a("onAdViewAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdExpanded(Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f8703c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f8703c.d("MediationAdapterWrapper", h.this.f8706f + ": adview ad expanded");
            }
            a("onAdViewAdExpanded", this.f8722a, new t(this, bundle, 9));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden(Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f8703c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f8703c.d("MediationAdapterWrapper", h.this.f8706f + ": adview ad hidden with extra info: " + bundle);
            }
            b("onAdViewAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view, Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f8703c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f8703c.d("MediationAdapterWrapper", h.this.f8706f + ": adview ad loaded with extra info: " + bundle);
            }
            h.this.f8710j = view;
            c("onAdViewAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdClicked(Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f8703c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f8703c.d("MediationAdapterWrapper", h.this.f8706f + ": app open ad clicked with extra info: " + bundle);
            }
            a("onAppOpenAdClicked", this.f8722a, new t(this, bundle, 8));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f8703c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f8703c.k("MediationAdapterWrapper", h.this.f8706f + ": app open ad display failed with error: " + maxAdapterError);
            }
            a("onAppOpenAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayed(Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f8703c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f8703c.d("MediationAdapterWrapper", h.this.f8706f + ": app open ad displayed with extra info: " + bundle);
            }
            a("onAppOpenAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdHidden(Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f8703c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f8703c.d("MediationAdapterWrapper", h.this.f8706f + ": app open ad hidden with extra info: " + bundle);
            }
            b("onAppOpenAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoaded(Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f8703c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f8703c.d("MediationAdapterWrapper", h.this.f8706f + ": app open ad loaded with extra info: " + bundle);
            }
            c("onAppOpenAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked(Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f8703c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f8703c.d("MediationAdapterWrapper", h.this.f8706f + ": interstitial ad clicked with extra info: " + bundle);
            }
            a("onInterstitialAdClicked", this.f8722a, new t(this, bundle, 7));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f8703c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f8703c.k("MediationAdapterWrapper", h.this.f8706f + ": interstitial ad failed to display with error " + maxAdapterError);
            }
            a("onInterstitialAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed(Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f8703c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f8703c.d("MediationAdapterWrapper", h.this.f8706f + ": interstitial ad displayed with extra info: " + bundle);
            }
            a("onInterstitialAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden(Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f8703c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f8703c.d("MediationAdapterWrapper", h.this.f8706f + ": interstitial ad hidden with extra info " + bundle);
            }
            b("onInterstitialAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded(Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f8703c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f8703c.d("MediationAdapterWrapper", h.this.f8706f + ": interstitial ad loaded with extra info: " + bundle);
            }
            c("onInterstitialAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdClicked(Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f8703c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f8703c.d("MediationAdapterWrapper", h.this.f8706f + ": native ad clicked");
            }
            a("onNativeAdClicked", this.f8722a, new t(this, bundle, 1));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked(Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f8703c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f8703c.d("MediationAdapterWrapper", h.this.f8706f + ": rewarded ad clicked with extra info: " + bundle);
            }
            a("onRewardedAdClicked", this.f8722a, new t(this, bundle, 4));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f8703c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f8703c.k("MediationAdapterWrapper", h.this.f8706f + ": rewarded ad display failed with error: " + maxAdapterError);
            }
            a("onRewardedAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed(Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f8703c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f8703c.d("MediationAdapterWrapper", h.this.f8706f + ": rewarded ad displayed with extra info: " + bundle);
            }
            a("onRewardedAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden(Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f8703c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f8703c.d("MediationAdapterWrapper", h.this.f8706f + ": rewarded ad hidden with extra info: " + bundle);
            }
            b("onRewardedAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded(Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f8703c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f8703c.d("MediationAdapterWrapper", h.this.f8706f + ": rewarded ad loaded with extra info: " + bundle);
            }
            c("onRewardedAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onUserRewarded(MaxReward maxReward, Bundle bundle) {
            if (h.this.f8709i instanceof e3) {
                e3 e3Var = (e3) h.this.f8709i;
                if (e3Var.w0().compareAndSet(false, true)) {
                    com.applovin.impl.sdk.p unused = h.this.f8703c;
                    if (com.applovin.impl.sdk.p.a()) {
                        h.this.f8703c.d("MediationAdapterWrapper", h.this.f8706f + ": user was rewarded: " + maxReward);
                    }
                    a("onUserRewarded", this.f8722a, new w(this, e3Var, maxReward, bundle, 0));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(Bundle bundle) {
            this.f8722a.d(h.this.f8709i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(MediationServiceImpl.b bVar) {
            if (bVar != null) {
                this.f8722a = bVar;
                return;
            }
            throw new IllegalArgumentException("No listener specified");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(Bundle bundle) {
            this.f8722a.a(h.this.f8709i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, MaxError maxError) {
            if (h.this.f8709i.x().get()) {
                com.applovin.impl.sdk.p unused = h.this.f8703c;
                if (com.applovin.impl.sdk.p.a()) {
                    h.this.f8703c.b("MediationAdapterWrapper", h.this.f8706f + ": blocking ad load failed callback for " + h.this.f8709i + " since onAdHidden() has been called");
                }
                h.this.f8702b.u().a(h.this.f8709i, str);
                return;
            }
            a(str, this.f8722a, new s(0, this, maxError));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxError maxError) {
            if (h.this.f8716q.compareAndSet(false, true)) {
                this.f8722a.onAdLoadFailed(h.this.f8708h, maxError);
            }
        }

        private void a(String str, Bundle bundle) {
            if (h.this.f8709i.x().get()) {
                com.applovin.impl.sdk.p unused = h.this.f8703c;
                if (com.applovin.impl.sdk.p.a()) {
                    h.this.f8703c.b("MediationAdapterWrapper", h.this.f8706f + ": blocking ad displayed callback for " + h.this.f8709i + " since onAdHidden() has been called");
                }
                h.this.f8702b.u().a(h.this.f8709i, str);
                return;
            }
            if (!((Boolean) h.this.f8702b.a(t3.D8)).booleanValue()) {
                if (h.this.f8709i.u().compareAndSet(false, true)) {
                    a(str, this.f8722a, new t(this, bundle, 6));
                    return;
                }
                return;
            }
            a(str, this.f8722a, new t(this, bundle, 5));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, MaxError maxError, Bundle bundle) {
            if (h.this.f8709i.x().get()) {
                com.applovin.impl.sdk.p unused = h.this.f8703c;
                if (com.applovin.impl.sdk.p.a()) {
                    h.this.f8703c.b("MediationAdapterWrapper", h.this.f8706f + ": blocking ad display failed callback for " + h.this.f8709i + " since onAdHidden() has been called");
                }
                h.this.f8702b.u().a(h.this.f8709i, str);
                return;
            }
            a(str, this.f8722a, new u(this, maxError, bundle, 0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxError maxError, Bundle bundle) {
            this.f8722a.a(h.this.f8709i, maxError, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(e3 e3Var, MaxReward maxReward, Bundle bundle) {
            this.f8722a.a(e3Var, maxReward, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Bundle bundle) {
            this.f8722a.a(h.this.f8709i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            this.f8722a.onAdCollapsed(h.this.f8709i);
        }

        private void a(String str, MaxAdListener maxAdListener, Runnable runnable) {
            h.this.f8701a.post(new w(this, runnable, maxAdListener, str, 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Runnable runnable, MaxAdListener maxAdListener, String str) {
            try {
                runnable.run();
            } catch (Throwable th2) {
                com.applovin.impl.sdk.p.c("MediationAdapterWrapper", l1.d.g("Failed to forward call (", str, ") to ", maxAdListener != null ? maxAdListener.getClass().getName() : null), th2);
                h.this.f8702b.E().a("MediationAdapterWrapper", str, th2, CollectionUtils.hashMap("adapter_class", h.this.f8705e.b()));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class c implements MaxAdapter.OnCompletionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.l f8724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final m3 f8725b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f8726c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final MaxAdapter.OnCompletionListener f8727d;

        public c(com.applovin.impl.sdk.l lVar, m3 m3Var, long j10, MaxAdapter.OnCompletionListener onCompletionListener) {
            this.f8724a = lVar;
            this.f8725b = m3Var;
            this.f8726c = j10;
            this.f8727d = onCompletionListener;
        }

        @Override // com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener
        public void onCompletion(MaxAdapter.InitializationStatus initializationStatus, String str) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new u(this, initializationStatus, str, 1), this.f8725b.h());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAdapter.InitializationStatus initializationStatus, String str) {
            this.f8724a.U().a(this.f8725b, SystemClock.elapsedRealtime() - this.f8726c, initializationStatus, str);
            MaxAdapter.OnCompletionListener onCompletionListener = this.f8727d;
            if (onCompletionListener != null) {
                onCompletionListener.onCompletion(initializationStatus, str);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d extends k5 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final WeakReference f8728g;

        public /* synthetic */ d(h hVar, a aVar) {
            this();
        }

        private void b(a3 a3Var) {
            if (a3Var != null) {
                this.f8297a.b0().a(a3Var);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (h.this.f8716q.get()) {
                return;
            }
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.b(this.f8298b, h.this.f8706f + " is timing out " + h.this.f8709i + "...");
            }
            b(h.this.f8709i);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-5101, "Adapter timed out");
            b bVar = (b) this.f8728g.get();
            if (bVar != null) {
                bVar.a(this.f8298b, maxErrorImpl);
            }
        }

        private d() {
            super("TaskTimeoutMediatedAd", h.this.f8702b);
            this.f8728g = new WeakReference(h.this.f8713n);
        }
    }

    public h(m3 m3Var, MaxAdapter maxAdapter, boolean z10, com.applovin.impl.sdk.l lVar) {
        if (m3Var == null) {
            throw new IllegalArgumentException("No adapter name specified");
        }
        if (maxAdapter == null) {
            throw new IllegalArgumentException("No adapter specified");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f8704d = m3Var.c();
        this.f8707g = maxAdapter;
        this.f8702b = lVar;
        this.f8703c = lVar.Q();
        this.f8705e = m3Var;
        this.f8706f = maxAdapter.getClass().getSimpleName();
        this.f8718s = z10;
    }

    public String toString() {
        return defpackage.e.q(this.f8706f, "'}", new StringBuilder("MediationAdapterWrapper{adapterTag='"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        a("destroy");
        MaxAdapter maxAdapter = this.f8707g;
        if (maxAdapter != null) {
            this.f8707g = null;
            maxAdapter.onDestroy();
        } else if (com.applovin.impl.sdk.p.a()) {
            this.f8703c.k("MediationAdapterWrapper", "Mediation adapter '" + this.f8706f + "' is already destroyed");
        }
        this.f8710j = null;
        this.f8711k = null;
        this.l = null;
        this.f8712m = null;
    }

    public ViewGroup h() {
        return this.f8712m;
    }

    public String i() {
        MaxAdapter maxAdapter = this.f8707g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getSdkVersion();
        } catch (Throwable th2) {
            com.applovin.impl.sdk.p.c("MediationAdapterWrapper", "Failed to get adapter's SDK version for " + this.f8704d, th2);
            this.f8702b.E().a("MediationAdapterWrapper", "sdk_version", th2, CollectionUtils.hashMap("adapter_class", this.f8705e.b()));
            a("sdk_version");
            this.f8702b.V().a(this.f8705e.b(), "sdk_version", this.f8709i);
            return null;
        }
    }

    public boolean j() {
        return this.f8716q.get() && this.f8717r.get();
    }

    public boolean k() {
        return this.f8715p.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxAppOpenAdapter) this.f8707g).loadAppOpenAd(maxAdapterResponseParameters, activity, this.f8713n);
    }

    public MediationServiceImpl.b c() {
        return this.f8713n.f8722a;
    }

    public View d() {
        return this.f8710j;
    }

    public MaxNativeAd e() {
        return this.f8711k;
    }

    public MaxNativeAdView f() {
        return this.l;
    }

    public String g() {
        return this.f8704d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxRewardedAdapter) this.f8707g).loadRewardedAd(maxAdapterResponseParameters, activity, this.f8713n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MediationAdapterBase) this.f8707g).loadNativeAd(maxAdapterResponseParameters, activity, this.f8713n);
    }

    public void a(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        b(MobileAdsBridgeBase.initializeMethodName, new w(this, onCompletionListener, maxAdapterInitializationParameters, activity, 3));
    }

    public void b(a3 a3Var, final Activity activity) {
        Runnable runnable;
        if (a(a3Var, activity)) {
            if (a3Var.getFormat() == MaxAdFormat.INTERSTITIAL) {
                final int i10 = 0;
                runnable = new Runnable(this) { // from class: com.applovin.impl.mediation.q

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h f8776b;

                    {
                        this.f8776b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                this.f8776b.a(activity);
                                break;
                            case 1:
                                this.f8776b.b(activity);
                                break;
                            default:
                                this.f8776b.c(activity);
                                break;
                        }
                    }
                };
            } else if (a3Var.getFormat() == MaxAdFormat.APP_OPEN) {
                final int i11 = 1;
                runnable = new Runnable(this) { // from class: com.applovin.impl.mediation.q

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h f8776b;

                    {
                        this.f8776b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                this.f8776b.a(activity);
                                break;
                            case 1:
                                this.f8776b.b(activity);
                                break;
                            default:
                                this.f8776b.c(activity);
                                break;
                        }
                    }
                };
            } else if (a3Var.getFormat() == MaxAdFormat.REWARDED) {
                final int i12 = 2;
                runnable = new Runnable(this) { // from class: com.applovin.impl.mediation.q

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h f8776b;

                    {
                        this.f8776b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                this.f8776b.a(activity);
                                break;
                            case 1:
                                this.f8776b.b(activity);
                                break;
                            default:
                                this.f8776b.c(activity);
                                break;
                        }
                    }
                };
            } else {
                throw new IllegalStateException("Failed to show " + a3Var + ": " + a3Var.getFormat() + " is not a supported ad format");
            }
            a(runnable, a3Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MaxAdapter.OnCompletionListener onCompletionListener, MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (com.applovin.impl.sdk.p.a()) {
            this.f8703c.a("MediationAdapterWrapper", "Initializing " + this.f8706f + " on thread: " + Thread.currentThread() + " with 'run_on_ui_thread' value: " + this.f8705e.r());
        }
        this.f8707g.initialize(maxAdapterInitializationParameters, activity, new c(this.f8702b, this.f8705e, jElapsedRealtime, onCompletionListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Activity activity) {
        ((MaxRewardedAdapter) this.f8707g).showRewardedAd(this.f8714o, activity, this.f8713n);
    }

    public void a(String str, a3 a3Var) {
        this.f8708h = str;
        this.f8709i = a3Var;
    }

    public void a(MaxNativeAdView maxNativeAdView) {
        this.l = maxNativeAdView;
    }

    public void a(ViewGroup viewGroup) {
        this.f8712m = viewGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Activity activity) {
        ((MaxAppOpenAdapter) this.f8707g).showAppOpenAd(this.f8714o, activity, this.f8713n);
    }

    public void a(String str, final MaxAdapterResponseParameters maxAdapterResponseParameters, a3 a3Var, final Activity activity, MediationServiceImpl.b bVar) {
        h hVar;
        Runnable wVar;
        if (a3Var != null) {
            if (!this.f8715p.get()) {
                String str2 = "Mediation adapter '" + this.f8706f + "' was disabled due to earlier failures. Loading ads with this adapter is disabled.";
                com.applovin.impl.sdk.p.h("MediationAdapterWrapper", str2);
                bVar.onAdLoadFailed(str, new MaxErrorImpl(-1, str2));
                return;
            }
            this.f8714o = maxAdapterResponseParameters;
            this.f8713n.a(bVar);
            MaxAdFormat format = a3Var.getFormat();
            if (format == MaxAdFormat.INTERSTITIAL) {
                final int i10 = 0;
                wVar = new Runnable(this) { // from class: com.applovin.impl.mediation.r

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h f8779b;

                    {
                        this.f8779b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                this.f8779b.a(maxAdapterResponseParameters, activity);
                                break;
                            case 1:
                                this.f8779b.b(maxAdapterResponseParameters, activity);
                                break;
                            case 2:
                                this.f8779b.c(maxAdapterResponseParameters, activity);
                                break;
                            default:
                                this.f8779b.d(maxAdapterResponseParameters, activity);
                                break;
                        }
                    }
                };
            } else if (format == MaxAdFormat.APP_OPEN) {
                final int i11 = 1;
                wVar = new Runnable(this) { // from class: com.applovin.impl.mediation.r

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h f8779b;

                    {
                        this.f8779b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                this.f8779b.a(maxAdapterResponseParameters, activity);
                                break;
                            case 1:
                                this.f8779b.b(maxAdapterResponseParameters, activity);
                                break;
                            case 2:
                                this.f8779b.c(maxAdapterResponseParameters, activity);
                                break;
                            default:
                                this.f8779b.d(maxAdapterResponseParameters, activity);
                                break;
                        }
                    }
                };
            } else if (format == MaxAdFormat.REWARDED) {
                final int i12 = 2;
                wVar = new Runnable(this) { // from class: com.applovin.impl.mediation.r

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h f8779b;

                    {
                        this.f8779b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                this.f8779b.a(maxAdapterResponseParameters, activity);
                                break;
                            case 1:
                                this.f8779b.b(maxAdapterResponseParameters, activity);
                                break;
                            case 2:
                                this.f8779b.c(maxAdapterResponseParameters, activity);
                                break;
                            default:
                                this.f8779b.d(maxAdapterResponseParameters, activity);
                                break;
                        }
                    }
                };
            } else {
                if (format == MaxAdFormat.NATIVE) {
                    final int i13 = 3;
                    wVar = new Runnable(this) { // from class: com.applovin.impl.mediation.r

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ h f8779b;

                        {
                            this.f8779b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i13) {
                                case 0:
                                    this.f8779b.a(maxAdapterResponseParameters, activity);
                                    break;
                                case 1:
                                    this.f8779b.b(maxAdapterResponseParameters, activity);
                                    break;
                                case 2:
                                    this.f8779b.c(maxAdapterResponseParameters, activity);
                                    break;
                                default:
                                    this.f8779b.d(maxAdapterResponseParameters, activity);
                                    break;
                            }
                        }
                    };
                } else if (format.isAdViewAd()) {
                    hVar = this;
                    wVar = new w(hVar, maxAdapterResponseParameters, format, activity, 4);
                } else {
                    throw new IllegalStateException("Failed to load " + a3Var + ": " + a3Var.getFormat() + " is not a supported ad format");
                }
                hVar.a("load_ad", format, new u(hVar, a3Var, wVar, 3));
                return;
            }
            hVar = this;
            hVar.a("load_ad", format, new u(hVar, a3Var, wVar, 3));
            return;
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(ViewGroup viewGroup, androidx.lifecycle.o oVar, Activity activity) {
        ((MaxRewardedAdViewAdapter) this.f8707g).showRewardedAd(this.f8714o, viewGroup, oVar, activity, this.f8713n);
    }

    public String b() {
        MaxAdapter maxAdapter = this.f8707g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getAdapterVersion();
        } catch (Throwable th2) {
            com.applovin.impl.sdk.p.c("MediationAdapterWrapper", "Failed to get adapter version for " + this.f8704d, th2);
            this.f8702b.E().a("MediationAdapterWrapper", "adapter_version", th2, CollectionUtils.hashMap("adapter_class", this.f8705e.b()));
            a("adapter_version");
            this.f8702b.V().a(this.f8705e.b(), "adapter_version", this.f8709i);
            return null;
        }
    }

    private void b(String str, Runnable runnable) {
        a(str, (MaxAdFormat) null, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxInterstitialAdapter) this.f8707g).loadInterstitialAd(maxAdapterResponseParameters, activity, this.f8713n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity) {
        ((MaxAdViewAdapter) this.f8707g).loadAdViewAd(maxAdapterResponseParameters, maxAdFormat, activity, this.f8713n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(a3 a3Var, Runnable runnable) {
        a(this.f8705e, a3Var);
        try {
            runnable.run();
        } catch (Throwable th2) {
            String str = "Failed to start loading ad for " + this.f8704d + " due to: " + th2;
            com.applovin.impl.sdk.p.h("MediationAdapterWrapper", str);
            this.f8713n.a("load_ad", new MaxErrorImpl(-1, str));
            this.f8702b.E().a("MediationAdapterWrapper", "load_ad", th2, CollectionUtils.hashMap("adapter_class", this.f8705e.b()));
            a("load_ad");
            this.f8702b.V().a(this.f8705e.b(), "load_ad", this.f8709i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity) {
        ((MaxInterstitialAdapter) this.f8707g).showInterstitialAd(this.f8714o, activity, this.f8713n);
    }

    public void a(a3 a3Var, final ViewGroup viewGroup, final androidx.lifecycle.o oVar, final Activity activity) {
        final h hVar;
        Runnable runnable;
        if (a(a3Var, activity)) {
            if (a3Var.getFormat() == MaxAdFormat.INTERSTITIAL) {
                final int i10 = 1;
                runnable = new Runnable(this) { // from class: com.applovin.impl.mediation.p

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h f8771b;

                    {
                        this.f8771b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                this.f8771b.b(viewGroup, oVar, activity);
                                break;
                            default:
                                this.f8771b.a(viewGroup, oVar, activity);
                                break;
                        }
                    }
                };
                hVar = this;
            } else if (a3Var.getFormat() == MaxAdFormat.REWARDED) {
                hVar = this;
                final int i11 = 0;
                runnable = new Runnable(hVar) { // from class: com.applovin.impl.mediation.p

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h f8771b;

                    {
                        this.f8771b = hVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                this.f8771b.b(viewGroup, oVar, activity);
                                break;
                            default:
                                this.f8771b.a(viewGroup, oVar, activity);
                                break;
                        }
                    }
                };
            } else {
                throw new IllegalStateException("Failed to show " + a3Var + ": " + a3Var.getFormat() + " is not a supported ad format");
            }
            hVar.a(runnable, a3Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ViewGroup viewGroup, androidx.lifecycle.o oVar, Activity activity) {
        ((MaxInterstitialAdViewAdapter) this.f8707g).showInterstitialAd(this.f8714o, viewGroup, oVar, activity, this.f8713n);
    }

    private boolean a(a3 a3Var, Activity activity) {
        if (a3Var != null) {
            if (a3Var.B() == null) {
                com.applovin.impl.sdk.p.h("MediationAdapterWrapper", "Adapter has been garbage collected");
                this.f8713n.a("ad_show", new MaxErrorImpl(-1, "Adapter has been garbage collected"), (Bundle) null);
                return false;
            }
            if (a3Var.B() == this) {
                if (activity == null && MaxAdFormat.APP_OPEN != a3Var.getFormat()) {
                    throw new IllegalArgumentException("No activity specified");
                }
                if (!this.f8715p.get()) {
                    String str = "Mediation adapter '" + this.f8706f + "' is disabled. Showing ads with this adapter is disabled.";
                    com.applovin.impl.sdk.p.h("MediationAdapterWrapper", str);
                    this.f8713n.a("ad_show", new MaxErrorImpl(-1, str), (Bundle) null);
                    return false;
                }
                if (j()) {
                    return true;
                }
                throw new IllegalStateException(defpackage.e.q(this.f8706f, "' does not have an ad loaded. Please load an ad first", new StringBuilder("Mediation adapter '")));
            }
            throw new IllegalArgumentException("Mediated ad belongs to a different adapter");
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    private void a(Runnable runnable, a3 a3Var) {
        a3Var.g0();
        a("show_ad", a3Var.getFormat(), new s(4, this, runnable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th2) {
            String str = "Failed to start displaying ad for " + this.f8704d + " due to: " + th2;
            com.applovin.impl.sdk.p.h("MediationAdapterWrapper", str);
            this.f8713n.a("show_ad", new MaxErrorImpl(-1, str), (Bundle) null);
            this.f8702b.E().a("MediationAdapterWrapper", "show_ad", th2, CollectionUtils.hashMap("adapter_class", this.f8705e.b()));
            a("show_ad");
            this.f8702b.V().a(this.f8705e.b(), "show_ad", this.f8709i);
        }
    }

    public void a(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, f5 f5Var, Activity activity, u4 u4Var) {
        if (u4Var != null) {
            if (!this.f8715p.get()) {
                com.applovin.impl.sdk.p.h("MediationAdapterWrapper", "Mediation adapter '" + this.f8706f + "' is disabled. Signal collection ads with this adapter is disabled.");
                u4Var.a(new MaxErrorImpl(defpackage.e.q(this.f8706f, ") is disabled", new StringBuilder("The adapter ("))));
                return;
            }
            MaxAdapter maxAdapter = this.f8707g;
            if (maxAdapter instanceof MaxSignalProvider) {
                b("collect_signal", new l(this, (MaxSignalProvider) maxAdapter, maxAdapterSignalCollectionParameters, activity, f5Var, u4Var));
                return;
            } else {
                u4Var.a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_NOT_SUPPORTED, defpackage.e.q(this.f8706f, ") does not support signal collection", new StringBuilder("The adapter ("))));
                return;
            }
        }
        throw new IllegalArgumentException("No callback specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MaxSignalProvider maxSignalProvider, MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, f5 f5Var, u4 u4Var) {
        try {
            maxSignalProvider.collectSignal(maxAdapterSignalCollectionParameters, activity, new a(f5Var, u4Var));
        } catch (Throwable th2) {
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl("Failed signal collection for " + this.f8704d + " due to: " + th2);
            com.applovin.impl.sdk.p.h("MediationAdapterWrapper", maxErrorImpl.getMessage());
            u4Var.a(maxErrorImpl);
            this.f8702b.E().a("MediationAdapterWrapper", "collect_signal", th2, CollectionUtils.hashMap("adapter_class", this.f8705e.b()));
            a("collect_signal");
            this.f8702b.V().a(this.f8705e.b(), "collect_signal", this.f8709i);
        }
        if (!u4Var.d() && f5Var.m() == 0) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8703c.a("MediationAdapterWrapper", "Failing signal collection " + f5Var + " since it has 0 timeout");
            }
            u4Var.a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_TIMEOUT, defpackage.e.q(this.f8706f, ") has 0 timeout", new StringBuilder("The adapter ("))));
        }
    }

    public void a() {
        if (this.f8718s) {
            return;
        }
        b("destroy", new v(this, 1));
    }

    private void a(m3 m3Var, a3 a3Var) {
        a(new d(this, null), m3Var, a3Var);
    }

    private void a(k5 k5Var, m3 m3Var, a3 a3Var) {
        long jM = m3Var.m();
        if (jM <= 0) {
            if (com.applovin.impl.sdk.p.a()) {
                com.applovin.impl.sdk.p pVar = this.f8703c;
                StringBuilder sb2 = new StringBuilder("Non-positive timeout set for ");
                if (a3Var != null) {
                    m3Var = a3Var;
                }
                sb2.append(m3Var);
                sb2.append(", not scheduling a timeout");
                pVar.a("MediationAdapterWrapper", sb2.toString());
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            com.applovin.impl.sdk.p pVar2 = this.f8703c;
            StringBuilder sbL = wi.d.l(jM, "Setting timeout ", "ms for ");
            if (a3Var != null) {
                m3Var = a3Var;
            }
            sbL.append(m3Var);
            pVar2.a("MediationAdapterWrapper", sbL.toString());
        }
        this.f8702b.s0().a(k5Var, f6.b.TIMEOUT, jM);
    }

    private void a(String str) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f8703c.d("MediationAdapterWrapper", q4.a.j(new StringBuilder("Marking "), this.f8706f, " as disabled due to: ", str));
        }
        this.f8715p.set(false);
    }

    private void a(String str, MaxAdFormat maxAdFormat, Runnable runnable) {
        u uVar = new u(this, str, runnable, 2);
        if (a(str, maxAdFormat)) {
            this.f8701a.post(uVar);
            return;
        }
        StringBuilder sbJ = d5.u.j(str, ":");
        sbJ.append(this.f8705e.c());
        u6 u6Var = new u6(this.f8702b, sbJ.toString(), uVar);
        if (((Boolean) this.f8702b.a(z4.Z)).booleanValue()) {
            this.f8702b.s0().a(u6Var, this.f8705e);
        } else {
            this.f8702b.s0().a(u6Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        try {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8703c.a("MediationAdapterWrapper", this.f8706f + ": running " + str + "...");
            }
            runnable.run();
            if (com.applovin.impl.sdk.p.a()) {
                this.f8703c.a("MediationAdapterWrapper", this.f8706f + ": finished " + str + "");
            }
        } catch (Throwable th2) {
            StringBuilder sbK = d5.u.k("Failed operation ", str, " for ");
            sbK.append(this.f8704d);
            com.applovin.impl.sdk.p.c("MediationAdapterWrapper", sbK.toString(), th2);
            a("fail_" + str);
            if (!str.equals("destroy")) {
                this.f8702b.V().a(this.f8705e.b(), str, this.f8709i);
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("is_wrapper", com.ironsource.mediationsdk.metadata.a.f29610g);
            CollectionUtils.putStringIfValid("adapter_class", this.f8705e.b(), mapHashMap);
            this.f8702b.E().a("MediationAdapterWrapper", str, th2, mapHashMap);
        }
    }

    private boolean a(String str, MaxAdFormat maxAdFormat) {
        Boolean boolJ0;
        Boolean boolL0;
        Boolean boolK0;
        MaxAdapter maxAdapter = this.f8707g;
        if (maxAdapter == null) {
            return this.f8705e.r();
        }
        if (MobileAdsBridgeBase.initializeMethodName.equals(str)) {
            Boolean boolShouldInitializeOnUiThread = maxAdapter.shouldInitializeOnUiThread();
            if (boolShouldInitializeOnUiThread != null) {
                return boolShouldInitializeOnUiThread.booleanValue();
            }
        } else if ("collect_signal".equals(str)) {
            Boolean boolShouldCollectSignalsOnUiThread = maxAdapter.shouldCollectSignalsOnUiThread();
            if (boolShouldCollectSignalsOnUiThread != null) {
                return boolShouldCollectSignalsOnUiThread.booleanValue();
            }
        } else if ("load_ad".equals(str) && maxAdFormat != null) {
            a3 a3Var = this.f8709i;
            if (a3Var != null && (boolK0 = a3Var.k0()) != null) {
                return boolK0.booleanValue();
            }
            Boolean boolShouldLoadAdsOnUiThread = maxAdapter.shouldLoadAdsOnUiThread(maxAdFormat);
            if (boolShouldLoadAdsOnUiThread != null) {
                return boolShouldLoadAdsOnUiThread.booleanValue();
            }
        } else if ("show_ad".equals(str) && maxAdFormat != null) {
            a3 a3Var2 = this.f8709i;
            if (a3Var2 != null && (boolL0 = a3Var2.l0()) != null) {
                return boolL0.booleanValue();
            }
            Boolean boolShouldShowAdsOnUiThread = maxAdapter.shouldShowAdsOnUiThread(maxAdFormat);
            if (boolShouldShowAdsOnUiThread != null) {
                return boolShouldShowAdsOnUiThread.booleanValue();
            }
        } else if ("destroy".equals(str)) {
            a3 a3Var3 = this.f8709i;
            if (a3Var3 != null && (boolJ0 = a3Var3.j0()) != null) {
                return boolJ0.booleanValue();
            }
            Boolean boolShouldDestroyOnUiThread = maxAdapter.shouldDestroyOnUiThread();
            if (boolShouldDestroyOnUiThread != null) {
                return boolShouldDestroyOnUiThread.booleanValue();
            }
            return true;
        }
        return this.f8705e.r();
    }
}
