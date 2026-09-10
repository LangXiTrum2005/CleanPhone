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
import com.thinkup.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class HeliumTURewardedVideoAdapter extends CustomRewardVideoAdapter {
    private String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f42580n;
    private ChartboostMediationFullscreenAd o;

    /* JADX INFO: renamed from: com.thinkup.network.helium.HeliumTURewardedVideoAdapter$2, reason: invalid class name */
    public class AnonymousClass2 implements ChartboostMediationFullscreenAdListener {
        public AnonymousClass2() {
        }

        @Override // com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAdListener
        public final void onAdClicked(ChartboostMediationFullscreenAd chartboostMediationFullscreenAd) {
            if (((CustomRewardVideoAdapter) HeliumTURewardedVideoAdapter.this).mImpressionListener != null) {
                ((CustomRewardVideoAdapter) HeliumTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayClicked();
            }
        }

        @Override // com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAdListener
        public final void onAdClosed(ChartboostMediationFullscreenAd chartboostMediationFullscreenAd, ChartboostMediationAdException chartboostMediationAdException) {
            if (((CustomRewardVideoAdapter) HeliumTURewardedVideoAdapter.this).mImpressionListener != null) {
                ((CustomRewardVideoAdapter) HeliumTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayEnd();
                ((CustomRewardVideoAdapter) HeliumTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdClosed();
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
            if (((CustomRewardVideoAdapter) HeliumTURewardedVideoAdapter.this).mImpressionListener != null) {
                ((CustomRewardVideoAdapter) HeliumTURewardedVideoAdapter.this).mImpressionListener.onReward();
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.network.helium.HeliumTURewardedVideoAdapter$3, reason: invalid class name */
    public class AnonymousClass3 implements ChartboostMediationFullscreenAdLoadListener {
        public AnonymousClass3() {
        }

        @Override // com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAdLoadListener
        public final void onAdLoaded(ChartboostMediationFullscreenAdLoadResult chartboostMediationFullscreenAdLoadResult) {
            String message;
            double d;
            String code = "";
            if (chartboostMediationFullscreenAdLoadResult == null) {
                if (((TUBaseAdInternalAdapter) HeliumTURewardedVideoAdapter.this).mLoadListener != null) {
                    ((TUBaseAdInternalAdapter) HeliumTURewardedVideoAdapter.this).mLoadListener.onAdLoadError("", "load RewardVideo ad error");
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
                if (!HeliumTURewardedVideoAdapter.this.f42580n) {
                    if (((TUBaseAdInternalAdapter) HeliumTURewardedVideoAdapter.this).mLoadListener != null) {
                        ((TUBaseAdInternalAdapter) HeliumTURewardedVideoAdapter.this).mLoadListener.onAdLoadError(code, message);
                        return;
                    }
                    return;
                } else {
                    TUBiddingListener tUBiddingListener = HeliumTURewardedVideoAdapter.this.mBiddingListener;
                    if (tUBiddingListener != null) {
                        tUBiddingListener.onC2SBiddingResultWithCache(TUBiddingResult.fail(message), null);
                        return;
                    }
                    return;
                }
            }
            HeliumTURewardedVideoAdapter.this.o = chartboostMediationFullscreenAdLoadResult.getAd();
            Map<String, String> winningBidInfo = HeliumTURewardedVideoAdapter.this.o.getWinningBidInfo();
            if (!HeliumTURewardedVideoAdapter.this.f42580n) {
                if (((TUBaseAdInternalAdapter) HeliumTURewardedVideoAdapter.this).mLoadListener != null) {
                    ((TUBaseAdInternalAdapter) HeliumTURewardedVideoAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
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
                HeliumTURewardedVideoAdapter.this.mBiddingListener.onC2SBiddingResultWithCache(TUBiddingResult.fail("auction-id is empty."), null);
            } else {
                HeliumTURewardedVideoAdapter.this.mBiddingListener.onC2SBiddingResultWithCache(TUBiddingResult.success(d, str, null), null);
            }
        }
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
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
    public void loadCustomNetworkAd(final Context context, Map<String, Object> map, Map<String, Object> map2) {
        this.m = TUInitMediation.getStringFromMap(map, "placement_name");
        HeliumTUInitManager.getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.thinkup.network.helium.HeliumTURewardedVideoAdapter.1
            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onFail(String str) {
                if (!HeliumTURewardedVideoAdapter.this.f42580n) {
                    if (((TUBaseAdInternalAdapter) HeliumTURewardedVideoAdapter.this).mLoadListener != null) {
                        ((TUBaseAdInternalAdapter) HeliumTURewardedVideoAdapter.this).mLoadListener.onAdLoadError("", str);
                    }
                } else {
                    TUBiddingListener tUBiddingListener = HeliumTURewardedVideoAdapter.this.mBiddingListener;
                    if (tUBiddingListener != null) {
                        tUBiddingListener.onC2SBiddingResultWithCache(TUBiddingResult.fail(str), null);
                    }
                }
            }

            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onSuccess() {
                HeliumTURewardedVideoAdapter.o(HeliumTURewardedVideoAdapter.this, context);
            }
        });
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardVideoAdapter
    public void show(Activity activity) {
        ChartboostMediationFullscreenAd chartboostMediationFullscreenAd = this.o;
        if (chartboostMediationFullscreenAd != null) {
            chartboostMediationFullscreenAd.showFullscreenAdFromJava(activity, new ChartboostMediationFullscreenAdShowListener() { // from class: com.thinkup.network.helium.HeliumTURewardedVideoAdapter.4
                @Override // com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAdShowListener
                public final void onAdShown(ChartboostMediationAdShowResult chartboostMediationAdShowResult) {
                    if (chartboostMediationAdShowResult == null) {
                        if (((CustomRewardVideoAdapter) HeliumTURewardedVideoAdapter.this).mImpressionListener != null) {
                            ((CustomRewardVideoAdapter) HeliumTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayFailed("", "showFullscreenAdFromJava error.");
                        }
                    } else if (chartboostMediationAdShowResult.getError() == null) {
                        if (((CustomRewardVideoAdapter) HeliumTURewardedVideoAdapter.this).mImpressionListener != null) {
                            ((CustomRewardVideoAdapter) HeliumTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayStart();
                        }
                    } else if (((CustomRewardVideoAdapter) HeliumTURewardedVideoAdapter.this).mImpressionListener != null) {
                        ChartboostMediationError error = chartboostMediationAdShowResult.getError();
                        ((CustomRewardVideoAdapter) HeliumTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayFailed(error.getCode(), error.getMessage());
                    }
                }
            });
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean startBiddingRequest(Context context, Map<String, Object> map, Map<String, Object> map2, TUBiddingListener tUBiddingListener) {
        this.f42580n = true;
        loadCustomNetworkAd(context, map, map2);
        return true;
    }

    private void o(Context context) {
        HeliumSdk.loadFullscreenAdFromJava(context, new ChartboostMediationAdLoadRequest(this.m, new Keywords()), new AnonymousClass2(), new AnonymousClass3());
    }

    public static /* synthetic */ void o(HeliumTURewardedVideoAdapter heliumTURewardedVideoAdapter, Context context) {
        HeliumSdk.loadFullscreenAdFromJava(context, new ChartboostMediationAdLoadRequest(heliumTURewardedVideoAdapter.m, new Keywords()), heliumTURewardedVideoAdapter.new AnonymousClass2(), heliumTURewardedVideoAdapter.new AnonymousClass3());
    }
}
