package com.chartboost.heliumsdk.ad;

import android.util.Size;
import android.view.View;
import com.chartboost.heliumsdk.domain.ChartboostMediationAdException;
import com.p004ironsource.k6;
import com.p004ironsource.sv;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH&J>\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/chartboost/heliumsdk/ad/HeliumBannerAdListener;", "", "onAdCached", "", "placementName", "", "loadId", "winningBidInfo", "", "error", "Lcom/chartboost/heliumsdk/domain/ChartboostMediationAdException;", k6.f25513u, "Landroid/util/Size;", sv.f, "onAdImpressionRecorded", "onAdViewAdded", "child", "Landroid/view/View;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface HeliumBannerAdListener {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void onAdCached(HeliumBannerAdListener heliumBannerAdListener, String placementName, String loadId, Map<String, String> winningBidInfo, ChartboostMediationAdException chartboostMediationAdException, Size bannerSize) {
            Intrinsics.f(placementName, "placementName");
            Intrinsics.f(loadId, "loadId");
            Intrinsics.f(winningBidInfo, "winningBidInfo");
            Intrinsics.f(bannerSize, "bannerSize");
            HeliumBannerAdListener.super.onAdCached(placementName, loadId, winningBidInfo, chartboostMediationAdException, bannerSize);
        }

        @Deprecated
        public static void onAdViewAdded(HeliumBannerAdListener heliumBannerAdListener, String placementName, View view) {
            Intrinsics.f(placementName, "placementName");
            HeliumBannerAdListener.super.onAdViewAdded(placementName, view);
        }
    }

    void onAdCached(String placementName, String loadId, Map<String, String> winningBidInfo, ChartboostMediationAdException error);

    default void onAdCached(String placementName, String loadId, Map<String, String> winningBidInfo, ChartboostMediationAdException error, Size bannerSize) {
        Intrinsics.f(placementName, "placementName");
        Intrinsics.f(loadId, "loadId");
        Intrinsics.f(winningBidInfo, "winningBidInfo");
        Intrinsics.f(bannerSize, "bannerSize");
        onAdCached(placementName, loadId, winningBidInfo, error);
    }

    void onAdClicked(String placementName);

    void onAdImpressionRecorded(String placementName);

    default void onAdViewAdded(String placementName, View child) {
        Intrinsics.f(placementName, "placementName");
    }
}
