package com.thinkup.network.helium;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.chartboost.heliumsdk.HeliumSdk;
import com.chartboost.heliumsdk.ad.ChartboostMediationAdLoadRequest;
import com.chartboost.heliumsdk.ad.ChartboostMediationAdShowResult;
import com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAd;
import com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAdListener;
import com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAdLoadListener;
import com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAdLoadResult;
import com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAdShowListener;
import com.chartboost.heliumsdk.domain.Bids;
import com.chartboost.heliumsdk.domain.ChartboostMediationAdException;
import com.chartboost.heliumsdk.domain.ChartboostMediationError;
import com.chartboost.heliumsdk.domain.Keywords;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBiddingListener;
import com.thinkup.core.api.TUBiddingResult;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class HeliumTUInterstitialAdapter extends CustomInterstitialAdapter {
    private String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f42578n;
    private ChartboostMediationFullscreenAd o;

    /* JADX INFO: renamed from: com.thinkup.network.helium.HeliumTUInterstitialAdapter$2, reason: invalid class name */
    public class AnonymousClass2 implements ChartboostMediationFullscreenAdListener {
        public AnonymousClass2() {
        }

        @Override // com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAdListener
        public final void onAdClicked(ChartboostMediationFullscreenAd chartboostMediationFullscreenAd) {
            if (((CustomInterstitialAdapter) HeliumTUInterstitialAdapter.this).mImpressListener != null) {
                ((CustomInterstitialAdapter) HeliumTUInterstitialAdapter.this).mImpressListener.onInterstitialAdClicked();
            }
        }

        @Override // com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAdListener
        public final void onAdClosed(ChartboostMediationFullscreenAd chartboostMediationFullscreenAd, ChartboostMediationAdException chartboostMediationAdException) {
            if (((CustomInterstitialAdapter) HeliumTUInterstitialAdapter.this).mImpressListener != null) {
                ((CustomInterstitialAdapter) HeliumTUInterstitialAdapter.this).mImpressListener.onInterstitialAdClose();
            }
        }

        @Override // com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAdListener
        public final void onAdExpired(ChartboostMediationFullscreenAd chartboostMediationFullscreenAd) {
        }

        @Override // com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAdListener
        public final void onAdImpressionRecorded(ChartboostMediationFullscreenAd chartboostMediationFullscreenAd) {
        }

        @Override // com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAdListener
        public final void onAdRewarded(ChartboostMediationFullscreenAd chartboostMediationFullscreenAd) {
        }
    }

    /* JADX INFO: renamed from: com.thinkup.network.helium.HeliumTUInterstitialAdapter$3, reason: invalid class name */
    public class AnonymousClass3 implements ChartboostMediationFullscreenAdLoadListener {
        public AnonymousClass3() {
        }

        @Override // com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAdLoadListener
        public final void onAdLoaded(ChartboostMediationFullscreenAdLoadResult chartboostMediationFullscreenAdLoadResult) {
            String message;
            double d;
            String code = "";
            if (chartboostMediationFullscreenAdLoadResult == null) {
                if (((TUBaseAdInternalAdapter) HeliumTUInterstitialAdapter.this).mLoadListener != null) {
                    ((TUBaseAdInternalAdapter) HeliumTUInterstitialAdapter.this).mLoadListener.onAdLoadError("", "load Interstitial ad error");
                    return;
                }
                return;
            }
            if (chartboostMediationFullscreenAdLoadResult.getAd() == null || chartboostMediationFullscreenAdLoadResult.getError() != null) {
                ChartboostMediationError error = chartboostMediationFullscreenAdLoadResult.getError();
                if (error != null) {
                    code = error.getCode();
                    message = error.getMessage();
                } else {
                    message = "load ad error";
                }
                if (!HeliumTUInterstitialAdapter.this.f42578n) {
                    if (((TUBaseAdInternalAdapter) HeliumTUInterstitialAdapter.this).mLoadListener != null) {
                        ((TUBaseAdInternalAdapter) HeliumTUInterstitialAdapter.this).mLoadListener.onAdLoadError(code, message);
                        return;
                    }
                    return;
                } else {
                    TUBiddingListener tUBiddingListener = HeliumTUInterstitialAdapter.this.mBiddingListener;
                    if (tUBiddingListener != null) {
                        tUBiddingListener.onC2SBiddingResultWithCache(TUBiddingResult.fail(message), null);
                        return;
                    }
                    return;
                }
            }
            HeliumTUInterstitialAdapter.this.o = chartboostMediationFullscreenAdLoadResult.getAd();
            Map<String, String> winningBidInfo = HeliumTUInterstitialAdapter.this.o.getWinningBidInfo();
            if (!HeliumTUInterstitialAdapter.this.f42578n) {
                if (((TUBaseAdInternalAdapter) HeliumTUInterstitialAdapter.this).mLoadListener != null) {
                    ((TUBaseAdInternalAdapter) HeliumTUInterstitialAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                    return;
                }
                return;
            }
            try {
                d = Double.parseDouble(winningBidInfo.get("price"));
            } catch (Throwable unused) {
                d = 0.0d;
            }
            String str = winningBidInfo.get(Bids.AUCTION_ID_KEY);
            if (TextUtils.isEmpty(str) || d == 0.0d) {
                HeliumTUInterstitialAdapter.this.mBiddingListener.onC2SBiddingResultWithCache(TUBiddingResult.fail("auction-id is empty."), null);
            } else {
                HeliumTUInterstitialAdapter.this.mBiddingListener.onC2SBiddingResultWithCache(TUBiddingResult.success(d, str, null), null);
            }
        }
    }

    @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        this.o = null;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return HeliumTUInitManager.getInstance().getNetworkName();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.m;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return HeliumTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public boolean isAdReady() {
        return this.o != null;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(final Context context, final Map<String, Object> map, Map<String, Object> map2) {
        this.m = TUInitMediation.getStringFromMap(map, "placement_name");
        HeliumTUInitManager.getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.thinkup.network.helium.HeliumTUInterstitialAdapter.1
            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onFail(String str) {
                if (!HeliumTUInterstitialAdapter.this.f42578n) {
                    if (((TUBaseAdInternalAdapter) HeliumTUInterstitialAdapter.this).mLoadListener != null) {
                        ((TUBaseAdInternalAdapter) HeliumTUInterstitialAdapter.this).mLoadListener.onAdLoadError("", str);
                    }
                } else {
                    TUBiddingListener tUBiddingListener = HeliumTUInterstitialAdapter.this.mBiddingListener;
                    if (tUBiddingListener != null) {
                        tUBiddingListener.onC2SBiddingResultWithCache(TUBiddingResult.fail(str), null);
                    }
                }
            }

            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onSuccess() {
                HeliumTUInterstitialAdapter.o(HeliumTUInterstitialAdapter.this, context);
            }
        });
    }

    @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter
    public void show(Activity activity) {
        ChartboostMediationFullscreenAd chartboostMediationFullscreenAd = this.o;
        if (chartboostMediationFullscreenAd != null) {
            chartboostMediationFullscreenAd.showFullscreenAdFromJava(activity, new ChartboostMediationFullscreenAdShowListener() { // from class: com.thinkup.network.helium.HeliumTUInterstitialAdapter.4
                @Override // com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAdShowListener
                public final void onAdShown(ChartboostMediationAdShowResult chartboostMediationAdShowResult) {
                    if (chartboostMediationAdShowResult == null) {
                        if (((CustomInterstitialAdapter) HeliumTUInterstitialAdapter.this).mImpressListener != null) {
                            ((CustomInterstitialAdapter) HeliumTUInterstitialAdapter.this).mImpressListener.onInterstitialAdVideoError("", "showFullscreenAdFromJava error.");
                        }
                    } else if (chartboostMediationAdShowResult.getError() == null) {
                        if (((CustomInterstitialAdapter) HeliumTUInterstitialAdapter.this).mImpressListener != null) {
                            ((CustomInterstitialAdapter) HeliumTUInterstitialAdapter.this).mImpressListener.onInterstitialAdShow();
                        }
                    } else if (((CustomInterstitialAdapter) HeliumTUInterstitialAdapter.this).mImpressListener != null) {
                        ChartboostMediationError error = chartboostMediationAdShowResult.getError();
                        ((CustomInterstitialAdapter) HeliumTUInterstitialAdapter.this).mImpressListener.onInterstitialAdVideoError(error.getCode(), error.getMessage());
                    }
                }
            });
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean startBiddingRequest(Context context, Map<String, Object> map, Map<String, Object> map2, TUBiddingListener tUBiddingListener) {
        this.f42578n = true;
        loadCustomNetworkAd(context, map, map2);
        return true;
    }

    private void o(Context context) {
        HeliumSdk.loadFullscreenAdFromJava(context, new ChartboostMediationAdLoadRequest(this.m, new Keywords()), new AnonymousClass2(), new AnonymousClass3());
    }

    public static /* synthetic */ void o(HeliumTUInterstitialAdapter heliumTUInterstitialAdapter, Context context) {
        HeliumSdk.loadFullscreenAdFromJava(context, new ChartboostMediationAdLoadRequest(heliumTUInterstitialAdapter.m, new Keywords()), heliumTUInterstitialAdapter.new AnonymousClass2(), heliumTUInterstitialAdapter.new AnonymousClass3());
    }
}
