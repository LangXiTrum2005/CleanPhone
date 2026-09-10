package com.p004ironsource;

import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.model.Placement;
import com.p004ironsource.mediationsdk.sdk.LevelPlayBannerListener;
import com.p004ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.p004ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener;
import com.p004ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.p004ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J(\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0002J\u0006\u0010\f\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\u0002R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/ironsource/rv;", "", "", "b", "c", "", "callbackName", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "adUnit", "", "args", "a", "d", "Lcom/ironsource/iv;", "Lcom/ironsource/iv;", "mJavaScriptEvaluator", "javaScriptEvaluator", "<init>", "(Lcom/ironsource/iv;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class rv {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iv mJavaScriptEvaluator;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u000b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\r\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000e"}, d2 = {"com/ironsource/rv$a", "Lcom/ironsource/mediationsdk/sdk/LevelPlayInterstitialListener;", "Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;", "adInfo", "", sv.f27213a, "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", sv.f27214b, sv.f27215c, sv.d, sv.f27216e, sv.f, sv.g, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements LevelPlayInterstitialListener {
        public a() {
        }

        @Override // com.p004ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdClicked(AdInfo adInfo) {
            rv.this.a(sv.f, IronSource.AD_UNIT.INTERSTITIAL, vv.f27547a.a(adInfo));
        }

        @Override // com.p004ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdClosed(AdInfo adInfo) {
            rv.this.a(sv.g, IronSource.AD_UNIT.INTERSTITIAL, vv.f27547a.a(adInfo));
        }

        @Override // com.p004ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdLoadFailed(IronSourceError error) {
            rv.this.a(sv.f27214b, IronSource.AD_UNIT.INTERSTITIAL, vv.f27547a.a(error != null ? error.getErrorMessage() : null));
        }

        @Override // com.p004ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdOpened(AdInfo adInfo) {
            rv.this.a(sv.f27215c, IronSource.AD_UNIT.INTERSTITIAL, vv.f27547a.a(adInfo));
        }

        @Override // com.p004ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdReady(AdInfo adInfo) {
            rv.this.a(sv.f27213a, IronSource.AD_UNIT.INTERSTITIAL, vv.f27547a.a(adInfo));
        }

        @Override // com.p004ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdShowFailed(IronSourceError error, AdInfo adInfo) {
            rv.this.a(sv.f27216e, IronSource.AD_UNIT.INTERSTITIAL, vv.f27547a.a(error != null ? error.getErrorMessage() : null, adInfo));
        }

        @Override // com.p004ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdShowSucceeded(AdInfo adInfo) {
            rv.this.a(sv.d, IronSource.AD_UNIT.INTERSTITIAL, vv.f27547a.a(adInfo));
        }
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\n\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\u0012\u0010\f\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u001c\u0010\r\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u001c\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u001c\u0010\u0011\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\u0012\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\u0013"}, d2 = {"com/ironsource/rv$b", "Lcom/ironsource/mediationsdk/sdk/LevelPlayRewardedVideoManualListener;", "Lcom/ironsource/mediationsdk/sdk/LevelPlayRewardedVideoListener;", "Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;", "adInfo", "", sv.f27213a, "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", sv.f27214b, sv.f27217h, sv.f27220n, sv.f27215c, sv.f27216e, "Lcom/ironsource/mediationsdk/model/Placement;", "placement", sv.f, sv.f27218i, sv.g, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements LevelPlayRewardedVideoManualListener, LevelPlayRewardedVideoListener {
        public b() {
        }

        @Override // com.p004ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener
        public void onAdAvailable(AdInfo adInfo) {
            rv.this.a(sv.f27217h, IronSource.AD_UNIT.REWARDED_VIDEO, vv.f27547a.a(adInfo));
        }

        @Override // com.p004ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
        public void onAdClicked(Placement placement, AdInfo adInfo) {
            rv.this.a(sv.f, IronSource.AD_UNIT.REWARDED_VIDEO, vv.f27547a.a(qv.f26644a.a(placement), adInfo));
        }

        @Override // com.p004ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
        public void onAdClosed(AdInfo adInfo) {
            rv.this.a(sv.g, IronSource.AD_UNIT.REWARDED_VIDEO, vv.f27547a.a(adInfo));
        }

        @Override // com.p004ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener
        public void onAdLoadFailed(IronSourceError error) {
            rv.this.a(sv.f27214b, IronSource.AD_UNIT.REWARDED_VIDEO, vv.f27547a.a(error != null ? error.getErrorMessage() : null));
        }

        @Override // com.p004ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
        public void onAdOpened(AdInfo adInfo) {
            rv.this.a(sv.f27215c, IronSource.AD_UNIT.REWARDED_VIDEO, vv.f27547a.a(adInfo));
        }

        @Override // com.p004ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener
        public void onAdReady(AdInfo adInfo) {
            rv.this.a(sv.f27213a, IronSource.AD_UNIT.REWARDED_VIDEO, vv.f27547a.a(adInfo));
        }

        @Override // com.p004ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
        public void onAdRewarded(Placement placement, AdInfo adInfo) {
            rv.this.a(sv.f27218i, IronSource.AD_UNIT.REWARDED_VIDEO, vv.f27547a.a(qv.f26644a.a(placement), adInfo));
        }

        @Override // com.p004ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
        public void onAdShowFailed(IronSourceError error, AdInfo adInfo) {
            rv.this.a(sv.f27216e, IronSource.AD_UNIT.REWARDED_VIDEO, vv.f27547a.a(error != null ? error.getErrorMessage() : null, adInfo));
        }

        @Override // com.p004ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener
        public void onAdUnavailable() {
            rv.this.a(sv.f27220n, IronSource.AD_UNIT.REWARDED_VIDEO, vv.f27547a.a(new Object[0]));
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\r"}, d2 = {"com/ironsource/rv$c", "Lcom/ironsource/mediationsdk/sdk/LevelPlayBannerListener;", "Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;", "adInfo", "", sv.j, "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", sv.f27214b, sv.f, sv.k, sv.f27219l, sv.m, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class c implements LevelPlayBannerListener {
        public c() {
        }

        @Override // com.p004ironsource.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdClicked(AdInfo adInfo) {
            rv.this.a(sv.f, IronSource.AD_UNIT.BANNER, vv.f27547a.a(adInfo));
        }

        @Override // com.p004ironsource.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdLeftApplication(AdInfo adInfo) {
            rv.this.a(sv.k, IronSource.AD_UNIT.BANNER, vv.f27547a.a(adInfo));
        }

        @Override // com.p004ironsource.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdLoadFailed(IronSourceError error) {
            rv.this.a(sv.f27214b, IronSource.AD_UNIT.BANNER, vv.f27547a.a(error != null ? error.getErrorMessage() : null));
        }

        @Override // com.p004ironsource.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdLoaded(AdInfo adInfo) {
            rv.this.a(sv.j, IronSource.AD_UNIT.BANNER, vv.f27547a.a(adInfo));
        }

        @Override // com.p004ironsource.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdScreenDismissed(AdInfo adInfo) {
            rv.this.a(sv.m, IronSource.AD_UNIT.BANNER, vv.f27547a.a(adInfo));
        }

        @Override // com.p004ironsource.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdScreenPresented(AdInfo adInfo) {
            rv.this.a(sv.f27219l, IronSource.AD_UNIT.BANNER, vv.f27547a.a(adInfo));
        }
    }

    public rv(iv javaScriptEvaluator) {
        Intrinsics.f(javaScriptEvaluator, "javaScriptEvaluator");
        this.mJavaScriptEvaluator = javaScriptEvaluator;
    }

    private final void b() {
        qv qvVar = qv.f26644a;
        qvVar.a((LevelPlayInterstitialListener) null);
        qvVar.a((LevelPlayRewardedVideoBaseListener) null);
        qvVar.a((LevelPlayBannerListener) null);
    }

    private final void c() {
        qv.f26644a.i();
    }

    public final void a() {
        b();
        c();
    }

    public final void d() {
        qv qvVar = qv.f26644a;
        qvVar.a(new a());
        qvVar.a(new b());
        qvVar.a(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String callbackName, IronSource.AD_UNIT adUnit, List<? extends Object> args) {
        this.mJavaScriptEvaluator.a(callbackName, adUnit, args);
    }
}
