package com.applovin.mediation;

import androidx.annotation.Nullable;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface MaxAd {
    @Nullable
    @Deprecated
    String getAdReviewCreativeId();

    String getAdUnitId();

    String getAdValue(String str);

    String getAdValue(String str, String str2);

    @Nullable
    String getCreativeId();

    @Nullable
    String getDspId();

    @Nullable
    String getDspName();

    MaxAdFormat getFormat();

    @Nullable
    MaxNativeAd getNativeAd();

    String getNetworkName();

    String getNetworkPlacement();

    String getPlacement();

    long getRequestLatencyMillis();

    double getRevenue();

    String getRevenuePrecision();

    AppLovinSdkUtils.Size getSize();

    MaxAdWaterfallInfo getWaterfall();
}
