package com.chartboost.heliumsdk.ad;

import android.content.Context;
import com.chartboost.heliumsdk.domain.ChartboostMediationAdException;
import com.chartboost.heliumsdk.utils.LogController;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/chartboost/heliumsdk/ad/HeliumInterstitialAd;", "Lcom/chartboost/heliumsdk/ad/HeliumFullscreenAd;", "context", "Landroid/content/Context;", "placementName", "", "heliumFullscreenAdListener", "Lcom/chartboost/heliumsdk/ad/HeliumFullscreenAdListener;", "(Landroid/content/Context;Ljava/lang/String;Lcom/chartboost/heliumsdk/ad/HeliumFullscreenAdListener;)V", "getHeliumFullscreenAdListener", "()Lcom/chartboost/heliumsdk/ad/HeliumFullscreenAdListener;", "setHeliumFullscreenAdListener", "(Lcom/chartboost/heliumsdk/ad/HeliumFullscreenAdListener;)V", "destroy", "", "getAdType", "", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HeliumInterstitialAd extends HeliumFullscreenAd {
    private HeliumFullscreenAdListener heliumFullscreenAdListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeliumInterstitialAd(Context context, String placementName, HeliumFullscreenAdListener heliumFullscreenAdListener) {
        super(context, placementName);
        Intrinsics.f(context, "context");
        Intrinsics.f(placementName, "placementName");
        this.heliumFullscreenAdListener = heliumFullscreenAdListener;
        setListener(new HeliumFullscreenAdListener() { // from class: com.chartboost.heliumsdk.ad.HeliumInterstitialAd.1
            @Override // com.chartboost.heliumsdk.ad.HeliumFullscreenAdListener
            public void onAdCached(String placementName2, String loadId, Map<String, String> winningBidInfo, ChartboostMediationAdException error) {
                Intrinsics.f(placementName2, "placementName");
                Intrinsics.f(loadId, "loadId");
                Intrinsics.f(winningBidInfo, "winningBidInfo");
                HeliumFullscreenAdListener heliumFullscreenAdListener2 = HeliumInterstitialAd.this.getHeliumFullscreenAdListener();
                if (heliumFullscreenAdListener2 != null) {
                    heliumFullscreenAdListener2.onAdCached(placementName2, loadId, winningBidInfo, error);
                }
            }

            @Override // com.chartboost.heliumsdk.ad.HeliumFullscreenAdListener
            public void onAdClicked(String placementName2) {
                Intrinsics.f(placementName2, "placementName");
                HeliumFullscreenAdListener heliumFullscreenAdListener2 = HeliumInterstitialAd.this.getHeliumFullscreenAdListener();
                if (heliumFullscreenAdListener2 != null) {
                    heliumFullscreenAdListener2.onAdClicked(placementName2);
                }
            }

            @Override // com.chartboost.heliumsdk.ad.HeliumFullscreenAdListener
            public void onAdClosed(String placementName2, ChartboostMediationAdException error) {
                Intrinsics.f(placementName2, "placementName");
                HeliumFullscreenAdListener heliumFullscreenAdListener2 = HeliumInterstitialAd.this.getHeliumFullscreenAdListener();
                if (heliumFullscreenAdListener2 != null) {
                    heliumFullscreenAdListener2.onAdClosed(placementName2, error);
                }
            }

            @Override // com.chartboost.heliumsdk.ad.HeliumFullscreenAdListener
            public void onAdImpressionRecorded(String placementName2) {
                Intrinsics.f(placementName2, "placementName");
                HeliumFullscreenAdListener heliumFullscreenAdListener2 = HeliumInterstitialAd.this.getHeliumFullscreenAdListener();
                if (heliumFullscreenAdListener2 != null) {
                    heliumFullscreenAdListener2.onAdImpressionRecorded(placementName2);
                }
            }

            @Override // com.chartboost.heliumsdk.ad.HeliumFullscreenAdListener
            public void onAdRewarded(String placementName2) {
                Intrinsics.f(placementName2, "placementName");
                LogController.INSTANCE.w(placementName2.concat(" Interstitial received rewarded event?"));
            }

            @Override // com.chartboost.heliumsdk.ad.HeliumFullscreenAdListener
            public void onAdShown(String placementName2, ChartboostMediationAdException error) {
                Intrinsics.f(placementName2, "placementName");
                HeliumFullscreenAdListener heliumFullscreenAdListener2 = HeliumInterstitialAd.this.getHeliumFullscreenAdListener();
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
        return 0;
    }

    public final HeliumFullscreenAdListener getHeliumFullscreenAdListener() {
        return this.heliumFullscreenAdListener;
    }

    public final void setHeliumFullscreenAdListener(HeliumFullscreenAdListener heliumFullscreenAdListener) {
        this.heliumFullscreenAdListener = heliumFullscreenAdListener;
    }
}
