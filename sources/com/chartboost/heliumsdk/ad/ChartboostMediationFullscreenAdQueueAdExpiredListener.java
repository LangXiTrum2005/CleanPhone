package com.chartboost.heliumsdk.ad;

import com.chartboost.heliumsdk.domain.ChartboostMediationAdException;
import com.p004ironsource.sv;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001a\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/chartboost/heliumsdk/ad/ChartboostMediationFullscreenAdQueueAdExpiredListener;", "Lcom/chartboost/heliumsdk/ad/ChartboostMediationFullscreenAdListener;", sv.f, "", "ad", "Lcom/chartboost/heliumsdk/ad/ChartboostMediationFullscreenAd;", sv.g, "error", "Lcom/chartboost/heliumsdk/domain/ChartboostMediationAdException;", "onAdImpressionRecorded", sv.f27218i, "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ChartboostMediationFullscreenAdQueueAdExpiredListener extends ChartboostMediationFullscreenAdListener {
    @Override // com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAdListener
    default void onAdClicked(ChartboostMediationFullscreenAd ad) {
        Intrinsics.f(ad, "ad");
    }

    @Override // com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAdListener
    default void onAdClosed(ChartboostMediationFullscreenAd ad, ChartboostMediationAdException error) {
        Intrinsics.f(ad, "ad");
    }

    @Override // com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAdListener
    default void onAdImpressionRecorded(ChartboostMediationFullscreenAd ad) {
        Intrinsics.f(ad, "ad");
    }

    @Override // com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAdListener
    default void onAdRewarded(ChartboostMediationFullscreenAd ad) {
        Intrinsics.f(ad, "ad");
    }
}
