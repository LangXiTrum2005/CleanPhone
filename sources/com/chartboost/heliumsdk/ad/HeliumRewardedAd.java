package com.chartboost.heliumsdk.ad;

import android.content.Context;
import com.chartboost.heliumsdk.domain.CachedAd;
import com.chartboost.heliumsdk.domain.ChartboostMediationAdException;
import com.chartboost.heliumsdk.utils.LogController;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R(\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/chartboost/heliumsdk/ad/HeliumRewardedAd;", "Lcom/chartboost/heliumsdk/ad/HeliumFullscreenAd;", "context", "Landroid/content/Context;", "placementName", "", "heliumFullscreenAdListener", "Lcom/chartboost/heliumsdk/ad/HeliumFullscreenAdListener;", "(Landroid/content/Context;Ljava/lang/String;Lcom/chartboost/heliumsdk/ad/HeliumFullscreenAdListener;)V", "customData", "getCustomData", "()Ljava/lang/String;", "setCustomData", "(Ljava/lang/String;)V", "getHeliumFullscreenAdListener", "()Lcom/chartboost/heliumsdk/ad/HeliumFullscreenAdListener;", "setHeliumFullscreenAdListener", "(Lcom/chartboost/heliumsdk/ad/HeliumFullscreenAdListener;)V", "destroy", "", "getAdType", "", "Constants", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HeliumRewardedAd extends HeliumFullscreenAd {
    private String customData;
    private HeliumFullscreenAdListener heliumFullscreenAdListener;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/chartboost/heliumsdk/ad/HeliumRewardedAd$Constants;", "", "()V", "MAX_CUSTOM_DATA_LENGTH", "", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Constants {
        public static final Constants INSTANCE = new Constants();
        public static final int MAX_CUSTOM_DATA_LENGTH = 1000;

        private Constants() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeliumRewardedAd(Context context, String placementName, HeliumFullscreenAdListener heliumFullscreenAdListener) {
        super(context, placementName);
        Intrinsics.f(context, "context");
        Intrinsics.f(placementName, "placementName");
        this.heliumFullscreenAdListener = heliumFullscreenAdListener;
        setListener(new HeliumFullscreenAdListener() { // from class: com.chartboost.heliumsdk.ad.HeliumRewardedAd.1
            @Override // com.chartboost.heliumsdk.ad.HeliumFullscreenAdListener
            public void onAdCached(String placementName2, String loadId, Map<String, String> winningBidInfo, ChartboostMediationAdException error) {
                Intrinsics.f(placementName2, "placementName");
                Intrinsics.f(loadId, "loadId");
                Intrinsics.f(winningBidInfo, "winningBidInfo");
                HeliumFullscreenAdListener heliumFullscreenAdListener2 = HeliumRewardedAd.this.getHeliumFullscreenAdListener();
                if (heliumFullscreenAdListener2 != null) {
                    heliumFullscreenAdListener2.onAdCached(placementName2, loadId, winningBidInfo, error);
                }
                CachedAd cachedAd = HeliumRewardedAd.this.getCachedAd();
                if (cachedAd == null) {
                    return;
                }
                String customData = HeliumRewardedAd.this.getCustomData();
                if (customData == null) {
                    customData = "";
                }
                cachedAd.setCustomData(customData);
            }

            @Override // com.chartboost.heliumsdk.ad.HeliumFullscreenAdListener
            public void onAdClicked(String placementName2) {
                Intrinsics.f(placementName2, "placementName");
                HeliumFullscreenAdListener heliumFullscreenAdListener2 = HeliumRewardedAd.this.getHeliumFullscreenAdListener();
                if (heliumFullscreenAdListener2 != null) {
                    heliumFullscreenAdListener2.onAdClicked(placementName2);
                }
            }

            @Override // com.chartboost.heliumsdk.ad.HeliumFullscreenAdListener
            public void onAdClosed(String placementName2, ChartboostMediationAdException error) {
                Intrinsics.f(placementName2, "placementName");
                HeliumFullscreenAdListener heliumFullscreenAdListener2 = HeliumRewardedAd.this.getHeliumFullscreenAdListener();
                if (heliumFullscreenAdListener2 != null) {
                    heliumFullscreenAdListener2.onAdClosed(placementName2, error);
                }
            }

            @Override // com.chartboost.heliumsdk.ad.HeliumFullscreenAdListener
            public void onAdImpressionRecorded(String placementName2) {
                Intrinsics.f(placementName2, "placementName");
                HeliumFullscreenAdListener heliumFullscreenAdListener2 = HeliumRewardedAd.this.getHeliumFullscreenAdListener();
                if (heliumFullscreenAdListener2 != null) {
                    heliumFullscreenAdListener2.onAdImpressionRecorded(placementName2);
                }
            }

            @Override // com.chartboost.heliumsdk.ad.HeliumFullscreenAdListener
            public void onAdRewarded(String placementName2) {
                Intrinsics.f(placementName2, "placementName");
                HeliumFullscreenAdListener heliumFullscreenAdListener2 = HeliumRewardedAd.this.getHeliumFullscreenAdListener();
                if (heliumFullscreenAdListener2 != null) {
                    heliumFullscreenAdListener2.onAdRewarded(placementName2);
                }
            }

            @Override // com.chartboost.heliumsdk.ad.HeliumFullscreenAdListener
            public void onAdShown(String placementName2, ChartboostMediationAdException error) {
                Intrinsics.f(placementName2, "placementName");
                HeliumFullscreenAdListener heliumFullscreenAdListener2 = HeliumRewardedAd.this.getHeliumFullscreenAdListener();
                if (heliumFullscreenAdListener2 != null) {
                    heliumFullscreenAdListener2.onAdShown(placementName2, error);
                }
            }
        });
    }

    @Override // com.chartboost.heliumsdk.ad.HeliumFullscreenAd, com.chartboost.heliumsdk.ad.HeliumAd
    public void destroy() {
        super.destroy();
        this.heliumFullscreenAdListener = null;
    }

    @Override // com.chartboost.heliumsdk.ad.HeliumAd
    public int getAdType() {
        return 1;
    }

    public final String getCustomData() {
        return this.customData;
    }

    public final HeliumFullscreenAdListener getHeliumFullscreenAdListener() {
        return this.heliumFullscreenAdListener;
    }

    public final void setCustomData(String str) {
        String str2 = null;
        if (str != null) {
            if (str.length() > 1000) {
                LogController.INSTANCE.w("Failed to set custom data. It is longer than the maximum limit of 1000 characters.");
            }
            if (str.length() > 1000) {
                str = null;
            }
            CachedAd cachedAd = getCachedAd();
            if (cachedAd != null) {
                cachedAd.setCustomData(str == null ? "" : str);
            }
            str2 = str;
        }
        this.customData = str2;
    }

    public final void setHeliumFullscreenAdListener(HeliumFullscreenAdListener heliumFullscreenAdListener) {
        this.heliumFullscreenAdListener = heliumFullscreenAdListener;
    }
}
