package com.chartboost.heliumsdk.controllers.banners;

import A.I0;
import android.os.SystemClock;
import android.view.View;
import com.chartboost.heliumsdk.HeliumSdk;
import com.chartboost.heliumsdk.Ilrd;
import com.chartboost.heliumsdk.ad.HeliumBannerAd;
import com.chartboost.heliumsdk.ad.HeliumBannerAdListener;
import com.chartboost.heliumsdk.controllers.AdController;
import com.chartboost.heliumsdk.domain.CachedAd;
import com.chartboost.heliumsdk.domain.PartnerAd;
import com.chartboost.heliumsdk.utils.JsonTranslatorKt;
import com.chartboost.heliumsdk.utils.LogController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/chartboost/heliumsdk/controllers/banners/BannerController$swapAd$1$1", "Lcom/chartboost/heliumsdk/controllers/banners/VisibilityTracker$VisibilityTrackerListener;", "onVisibilityThresholdMet", "", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BannerController$swapAd$1$1 implements VisibilityTracker.VisibilityTrackerListener {
    final /* synthetic */ HeliumBannerAd $heliumBannerAd;
    final /* synthetic */ CachedAd $nextAd;
    final /* synthetic */ View $nextBannerAdView;
    final /* synthetic */ PartnerAd $partnerAd;
    final /* synthetic */ BannerController this$0;

    public BannerController$swapAd$1$1(BannerController bannerController, PartnerAd partnerAd, CachedAd cachedAd, View view, HeliumBannerAd heliumBannerAd) {
        this.this$0 = bannerController;
        this.$partnerAd = partnerAd;
        this.$nextAd = cachedAd;
        this.$nextBannerAdView = view;
        this.$heliumBannerAd = heliumBannerAd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onVisibilityThresholdMet$lambda$0(BannerController this$0, String placementName) {
        Unit unit;
        HeliumBannerAdListener heliumBannerAdListener;
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(placementName, "$placementName");
        HeliumBannerAd heliumBannerAd = (HeliumBannerAd) this$0.heliumBannerAdRef.get();
        if (heliumBannerAd == null || (heliumBannerAdListener = heliumBannerAd.getHeliumBannerAdListener()) == null) {
            unit = null;
        } else {
            heliumBannerAdListener.onAdImpressionRecorded(placementName);
            unit = Unit.f43263a;
        }
        if (unit == null) {
            LogController.INSTANCE.e("The Helium SDK Banner listener is detached on onAdImpressionRecorded.");
        }
    }

    @Override // com.chartboost.heliumsdk.controllers.banners.VisibilityTracker.VisibilityTrackerListener
    public void onVisibilityThresholdMet() {
        Unit unit;
        this.this$0.sendShowMetricsData(System.currentTimeMillis(), this.$partnerAd.getRequest().getPartnerId(), this.$nextAd.getAuctionId(), this.$nextAd.getLoadId());
        String bannerAdPlacementName = this.this$0.getBannerAdPlacementName();
        AdController adController$Helium_release = HeliumSdk.INSTANCE.getChartboostMediationInternal$Helium_release().getAdController();
        if (adController$Helium_release != null) {
            adController$Helium_release.incrementBannerImpressionDepth$Helium_release();
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            LogController.INSTANCE.e("Failed to increment banner impression depth due to no ad controller.");
        }
        this.this$0.mainHandler.post(new I0(25, this.this$0, bannerAdPlacementName));
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        BuildersKt.c(CoroutineScopeKt.a(DefaultIoScheduler.f45062Y), null, null, new BannerController$swapAd$1$1$onVisibilityThresholdMet$2(this.$nextAd, this.this$0, this.$nextBannerAdView, this.$heliumBannerAd, null), 3);
        JsonObject ilrdJson = this.$nextAd.getIlrdJson();
        if (ilrdJson != null) {
            BannerController bannerController = this.this$0;
            PartnerAd partnerAd = this.$partnerAd;
            Ilrd ilrd = bannerController.ilrd;
            if (ilrd != null) {
                ilrd.onIlrdReceived$Helium_release(partnerAd.getRequest().getChartboostPlacement(), JsonTranslatorKt.toJSONObject(ilrdJson));
            }
        }
        this.this$0.bannerShownUptimeMillis = SystemClock.uptimeMillis();
        this.this$0.scheduleNextRefresh();
    }
}
