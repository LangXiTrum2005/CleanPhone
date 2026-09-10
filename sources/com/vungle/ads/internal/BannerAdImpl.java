package com.vungle.ads.internal;

import android.content.Context;
import com.p004ironsource.d9;
import com.vungle.ads.AdConfig;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.BaseAd;
import com.vungle.ads.BaseAdListener;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.presenter.AdPlayCallback;
import com.vungle.ads.internal.presenter.AdPlayCallbackWrapper;
import com.vungle.ads.internal.util.ThreadUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0003H\u0010¢\u0006\u0002\b\u0011J\u0006\u0010\u0012\u001a\u00020\u0007R\u0014\u0010\u000b\u001a\u00020\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/vungle/ads/internal/BannerAdImpl;", "Lcom/vungle/ads/BaseAd;", "context", "Landroid/content/Context;", "placementId", "", d9.h.O, "Lcom/vungle/ads/VungleAdSize;", "adConfig", "Lcom/vungle/ads/AdConfig;", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/VungleAdSize;Lcom/vungle/ads/AdConfig;)V", "adPlayCallback", "Lcom/vungle/ads/internal/presenter/AdPlayCallbackWrapper;", "getAdPlayCallback$vungle_ads_release", "()Lcom/vungle/ads/internal/presenter/AdPlayCallbackWrapper;", "constructAdInternal", "Lcom/vungle/ads/internal/BannerAdInternal;", "constructAdInternal$vungle_ads_release", "getAdViewSize", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class BannerAdImpl extends BaseAd {
    private final AdPlayCallbackWrapper adPlayCallback;
    private final VungleAdSize adSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerAdImpl(Context context, String placementId, VungleAdSize adSize, AdConfig adConfig) {
        super(context, placementId, adConfig);
        Intrinsics.f(context, "context");
        Intrinsics.f(placementId, "placementId");
        Intrinsics.f(adSize, "adSize");
        Intrinsics.f(adConfig, "adConfig");
        this.adSize = adSize;
        AdInternal adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        Intrinsics.d(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.BannerAdInternal");
        this.adPlayCallback = ((BannerAdInternal) adInternal$vungle_ads_release).wrapCallback$vungle_ads_release(new AdPlayCallback() { // from class: com.vungle.ads.internal.BannerAdImpl$adPlayCallback$1
            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdClick(String id) throws Throwable {
                ThreadUtil threadUtil = ThreadUtil.INSTANCE;
                final BannerAdImpl bannerAdImpl = this.this$0;
                threadUtil.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.internal.BannerAdImpl$adPlayCallback$1$onAdClick$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m3182invoke();
                        return Unit.f43263a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m3182invoke() {
                        BaseAdListener adListener = bannerAdImpl.getAdListener();
                        if (adListener != null) {
                            adListener.onAdClicked(bannerAdImpl);
                        }
                    }
                });
                this.this$0.getDisplayToClickMetric().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getDisplayToClickMetric(), this.this$0.getLogEntry(), (String) null, 4, (Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdEnd(String id) throws Throwable {
                ThreadUtil threadUtil = ThreadUtil.INSTANCE;
                final BannerAdImpl bannerAdImpl = this.this$0;
                threadUtil.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.internal.BannerAdImpl$adPlayCallback$1$onAdEnd$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m3183invoke();
                        return Unit.f43263a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m3183invoke() {
                        BaseAdListener adListener = bannerAdImpl.getAdListener();
                        if (adListener != null) {
                            adListener.onAdEnd(bannerAdImpl);
                        }
                    }
                });
                this.this$0.getShowToCloseMetric().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getShowToCloseMetric(), this.this$0.getLogEntry(), (String) null, 4, (Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdImpression(String id) throws Throwable {
                ThreadUtil threadUtil = ThreadUtil.INSTANCE;
                final BannerAdImpl bannerAdImpl = this.this$0;
                threadUtil.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.internal.BannerAdImpl$adPlayCallback$1$onAdImpression$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m3184invoke();
                        return Unit.f43263a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m3184invoke() {
                        BaseAdListener adListener = bannerAdImpl.getAdListener();
                        if (adListener != null) {
                            adListener.onAdImpression(bannerAdImpl);
                        }
                    }
                });
                this.this$0.getPresentToDisplayMetric().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getPresentToDisplayMetric(), this.this$0.getLogEntry(), (String) null, 4, (Object) null);
                this.this$0.getDisplayToClickMetric().markStart();
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdLeftApplication(String id) throws Throwable {
                ThreadUtil threadUtil = ThreadUtil.INSTANCE;
                final BannerAdImpl bannerAdImpl = this.this$0;
                threadUtil.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.internal.BannerAdImpl$adPlayCallback$1$onAdLeftApplication$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m3185invoke();
                        return Unit.f43263a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m3185invoke() {
                        BaseAdListener adListener = bannerAdImpl.getAdListener();
                        if (adListener != null) {
                            adListener.onAdLeftApplication(bannerAdImpl);
                        }
                    }
                });
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getLeaveApplicationMetric(), this.this$0.getLogEntry(), (String) null, 4, (Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdRewarded(String id) {
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdStart(String id) throws Throwable {
                this.this$0.getSignalManager$vungle_ads_release().increaseSessionDepthCounter();
                this.this$0.getAdInternal$vungle_ads_release().getValidationToPresentMetric().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getAdInternal$vungle_ads_release().getValidationToPresentMetric(), this.this$0.getLogEntry(), (String) null, 4, (Object) null);
                this.this$0.getPresentToDisplayMetric().markStart();
                ThreadUtil threadUtil = ThreadUtil.INSTANCE;
                final BannerAdImpl bannerAdImpl = this.this$0;
                threadUtil.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.internal.BannerAdImpl$adPlayCallback$1$onAdStart$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m3186invoke();
                        return Unit.f43263a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m3186invoke() {
                        BaseAdListener adListener = bannerAdImpl.getAdListener();
                        if (adListener != null) {
                            adListener.onAdStart(bannerAdImpl);
                        }
                    }
                });
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onFailure(final VungleError error) throws Throwable {
                Intrinsics.f(error, "error");
                ThreadUtil threadUtil = ThreadUtil.INSTANCE;
                final BannerAdImpl bannerAdImpl = this.this$0;
                threadUtil.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.internal.BannerAdImpl$adPlayCallback$1$onFailure$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m3187invoke();
                        return Unit.f43263a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m3187invoke() {
                        BaseAdListener adListener = bannerAdImpl.getAdListener();
                        if (adListener != null) {
                            adListener.onAdFailedToPlay(bannerAdImpl, error);
                        }
                    }
                });
                this.this$0.getShowToFailMetric().markEnd();
                AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(this.this$0.getShowToFailMetric(), this.this$0.getLogEntry(), error.getCode() + '-' + error.getErrorMessage());
            }
        });
    }

    /* JADX INFO: renamed from: getAdPlayCallback$vungle_ads_release, reason: from getter */
    public final AdPlayCallbackWrapper getAdPlayCallback() {
        return this.adPlayCallback;
    }

    public final VungleAdSize getAdViewSize() {
        AdInternal adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        Intrinsics.d(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.BannerAdInternal");
        VungleAdSize updatedAdSize = ((BannerAdInternal) adInternal$vungle_ads_release).getUpdatedAdSize();
        return updatedAdSize == null ? this.adSize : updatedAdSize;
    }

    @Override // com.vungle.ads.BaseAd
    public BannerAdInternal constructAdInternal$vungle_ads_release(Context context) {
        Intrinsics.f(context, "context");
        return new BannerAdInternal(context, this.adSize);
    }
}
