package com.thinkup.network.ironsource;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.integration.IntegrationHelper;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.core.api.TUSDK;
import com.thinkup.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdListener;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoader;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public class IronsourceTURewardedVideoAdapter extends CustomRewardVideoAdapter implements IronsourceTUEventListener {
    String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    RewardedAd f42596n;
    private final String o0 = getClass().getSimpleName();
    String o = "";

    /* JADX INFO: renamed from: com.thinkup.network.ironsource.IronsourceTURewardedVideoAdapter$1, reason: invalid class name */
    public class AnonymousClass1 implements MediationInitCallback {
        final /* synthetic */ Context o;

        public AnonymousClass1(Context context) {
            this.o = context;
        }

        @Override // com.thinkup.core.api.MediationInitCallback
        public final void onFail(String str) {
            IronsourceTURewardedVideoAdapter.this.notifyLoadFail("", str);
        }

        @Override // com.thinkup.core.api.MediationInitCallback
        public final void onSuccess() {
            try {
                if (!TextUtils.isEmpty(IronsourceTURewardedVideoAdapter.this.m)) {
                    IronsourceTURewardedVideoAdapter ironsourceTURewardedVideoAdapter = IronsourceTURewardedVideoAdapter.this;
                    RewardedAdLoader.loadAd(new RewardedAdRequest.Builder(ironsourceTURewardedVideoAdapter.o, ironsourceTURewardedVideoAdapter.m).build(), new RewardedAdLoaderListener() { // from class: com.thinkup.network.ironsource.IronsourceTURewardedVideoAdapter.1.1
                        @Override // com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener
                        public final void onRewardedAdLoadFailed(IronSourceError ironSourceError) {
                            String unused = IronsourceTURewardedVideoAdapter.this.o0;
                            Objects.toString(ironSourceError);
                            IronsourceTURewardedVideoAdapter.this.notifyLoadFail(String.valueOf(ironSourceError.getErrorCode()), ironSourceError.getErrorMessage());
                        }

                        @Override // com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener
                        public final void onRewardedAdLoaded(RewardedAd rewardedAd) {
                            String unused = IronsourceTURewardedVideoAdapter.this.o0;
                            Objects.toString(rewardedAd);
                            IronsourceTURewardedVideoAdapter.this.f42596n = rewardedAd;
                            rewardedAd.setListener(new RewardedAdListener() { // from class: com.thinkup.network.ironsource.IronsourceTURewardedVideoAdapter.1.1.1
                                @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
                                public final void onRewardedAdClicked(RewardedAd rewardedAd2) {
                                    if (((CustomRewardVideoAdapter) IronsourceTURewardedVideoAdapter.this).mImpressionListener != null) {
                                        ((CustomRewardVideoAdapter) IronsourceTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayClicked();
                                    }
                                }

                                @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
                                public final void onRewardedAdDismissed(RewardedAd rewardedAd2) {
                                    if (((CustomRewardVideoAdapter) IronsourceTURewardedVideoAdapter.this).mImpressionListener != null) {
                                        ((CustomRewardVideoAdapter) IronsourceTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayEnd();
                                        ((CustomRewardVideoAdapter) IronsourceTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdClosed();
                                    }
                                }

                                @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
                                public final void onRewardedAdFailedToShow(RewardedAd rewardedAd2, IronSourceError ironSourceError) {
                                    if (((CustomRewardVideoAdapter) IronsourceTURewardedVideoAdapter.this).mImpressionListener != null) {
                                        ((CustomRewardVideoAdapter) IronsourceTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayFailed(String.valueOf(ironSourceError.getErrorCode()), ironSourceError.getErrorMessage());
                                    }
                                }

                                @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
                                public final void onRewardedAdShown(RewardedAd rewardedAd2) {
                                    if (((CustomRewardVideoAdapter) IronsourceTURewardedVideoAdapter.this).mImpressionListener != null) {
                                        ((CustomRewardVideoAdapter) IronsourceTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayStart();
                                    }
                                }

                                @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
                                public final void onUserEarnedReward(RewardedAd rewardedAd2) {
                                    if (((CustomRewardVideoAdapter) IronsourceTURewardedVideoAdapter.this).mImpressionListener != null) {
                                        ((CustomRewardVideoAdapter) IronsourceTURewardedVideoAdapter.this).mImpressionListener.onReward();
                                    }
                                }
                            });
                            if (((TUBaseAdInternalAdapter) IronsourceTURewardedVideoAdapter.this).mLoadListener != null) {
                                ((TUBaseAdInternalAdapter) IronsourceTURewardedVideoAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                            }
                        }
                    });
                } else if (!(this.o instanceof Activity)) {
                    IronsourceTURewardedVideoAdapter.this.notifyLoadFail("", "Ironsource context must be activity.");
                    return;
                } else if (IronSource.isISDemandOnlyRewardedVideoAvailable(IronsourceTURewardedVideoAdapter.this.o)) {
                    ((TUBaseAdInternalAdapter) IronsourceTURewardedVideoAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                } else {
                    IronsourceTUInitManager ironsourceTUInitManager = IronsourceTUInitManager.getInstance();
                    Activity activity = (Activity) this.o;
                    IronsourceTURewardedVideoAdapter ironsourceTURewardedVideoAdapter2 = IronsourceTURewardedVideoAdapter.this;
                    ironsourceTUInitManager.loadRewardedVideo(activity, ironsourceTURewardedVideoAdapter2.o, ironsourceTURewardedVideoAdapter2);
                }
                try {
                    Context context = this.o;
                    if (context instanceof Activity) {
                        IronSource.onResume((Activity) context);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                IronsourceTURewardedVideoAdapter.this.notifyLoadFail("", th2.getMessage());
            }
        }
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        IronSource.clearRewardedVideoServerParameters();
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) {
        this.o = TUInitMediation.getStringFromMap(map, "instance_id");
        IronsourceTUInitManager.getInstance().o(context, map, tUBidRequestInfoListener, 1);
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter
    public TUInitMediation getMediationInitManager() {
        return IronsourceTUInitManager.getInstance();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return IronsourceTUInitManager.getInstance().getNetworkName();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.o;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return IronsourceTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public boolean isAdReady() {
        if (TextUtils.isEmpty(this.m)) {
            return IronSource.isISDemandOnlyRewardedVideoAvailable(this.o);
        }
        RewardedAd rewardedAd = this.f42596n;
        return rewardedAd != null && rewardedAd.isReadyToShow();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        String stringFromMap = TUInitMediation.getStringFromMap(map, "app_key");
        this.o = TUInitMediation.getStringFromMap(map, "instance_id");
        this.m = TUInitMediation.getStringFromMap(map, "payload");
        if (TextUtils.isEmpty(stringFromMap) || TextUtils.isEmpty(this.o)) {
            notifyLoadFail("", "Ironsource app_key or instance_id is empty.");
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        IronsourceTUInitManager.getInstance();
        if (jElapsedRealtime < IronsourceTUInitManager.mVideoAdLastShowTime) {
            notifyLoadFail("", "Ironsource can not load while other interstitial or rewarded video showing.");
            return;
        }
        if (TUSDK.isNetworkLogDebug()) {
            IntegrationHelper.validateIntegration(context);
        }
        if (!TextUtils.isEmpty(this.mUserId)) {
            IronSource.setUserId(this.mUserId);
            IronSource.setDynamicUserId(this.mUserId);
        }
        IronsourceTUInitManager.getInstance().initSDK(context, map, new AnonymousClass1(context));
    }

    @Override // com.thinkup.network.ironsource.IronsourceTUEventListener
    public void notifyClick() {
        CustomRewardedVideoEventListener customRewardedVideoEventListener = this.mImpressionListener;
        if (customRewardedVideoEventListener != null) {
            customRewardedVideoEventListener.onRewardedVideoAdPlayClicked();
        }
    }

    @Override // com.thinkup.network.ironsource.IronsourceTUEventListener
    public void notifyClose() {
        IronsourceTUInitManager.getInstance();
        IronsourceTUInitManager.mVideoAdLastShowTime = 0L;
        CustomRewardedVideoEventListener customRewardedVideoEventListener = this.mImpressionListener;
        if (customRewardedVideoEventListener != null) {
            customRewardedVideoEventListener.onRewardedVideoAdPlayEnd();
            this.mImpressionListener.onRewardedVideoAdClosed();
        }
        try {
            if (this.mActivityRef.get() != null) {
                IronSource.onPause(this.mActivityRef.get());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.thinkup.network.ironsource.IronsourceTUEventListener
    public void notifyLoadFail(String str, String str2) {
        TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
        if (tUCustomLoadListener != null) {
            tUCustomLoadListener.onAdLoadError(str, str2);
        }
    }

    @Override // com.thinkup.network.ironsource.IronsourceTUEventListener
    public void notifyLoaded() {
        TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
        if (tUCustomLoadListener != null) {
            tUCustomLoadListener.onAdCacheLoaded(new BaseAd[0]);
        }
    }

    @Override // com.thinkup.network.ironsource.IronsourceTUEventListener
    public void notifyPlayEnd() {
    }

    @Override // com.thinkup.network.ironsource.IronsourceTUEventListener
    public void notifyPlayFail(String str, String str2) {
        IronsourceTUInitManager.getInstance();
        IronsourceTUInitManager.mVideoAdLastShowTime = 0L;
        CustomRewardedVideoEventListener customRewardedVideoEventListener = this.mImpressionListener;
        if (customRewardedVideoEventListener != null) {
            customRewardedVideoEventListener.onRewardedVideoAdPlayFailed(str, str2);
        }
    }

    @Override // com.thinkup.network.ironsource.IronsourceTUEventListener
    public void notifyPlayStart() {
        CustomRewardedVideoEventListener customRewardedVideoEventListener = this.mImpressionListener;
        if (customRewardedVideoEventListener != null) {
            customRewardedVideoEventListener.onRewardedVideoAdPlayStart();
        }
        IronsourceTUInitManager.getInstance();
        IronsourceTUInitManager.mVideoAdLastShowTime = 0L;
    }

    @Override // com.thinkup.network.ironsource.IronsourceTUEventListener
    public void notifyReward() {
        CustomRewardedVideoEventListener customRewardedVideoEventListener = this.mImpressionListener;
        if (customRewardedVideoEventListener != null) {
            customRewardedVideoEventListener.onReward();
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return IronsourceTUInitManager.getInstance().setUserDataConsent(context, z2, z3);
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardVideoAdapter
    public void show(Activity activity) {
        if (!TextUtils.isEmpty(this.m)) {
            RewardedAd rewardedAd = this.f42596n;
            if (rewardedAd != null && rewardedAd.isReadyToShow()) {
                this.f42596n.show(activity);
                return;
            }
            CustomRewardedVideoEventListener customRewardedVideoEventListener = this.mImpressionListener;
            if (customRewardedVideoEventListener != null) {
                customRewardedVideoEventListener.onRewardedVideoAdPlayFailed("", "mRewardedAd is not ReadyToShow");
                return;
            }
            return;
        }
        if (isAdReady()) {
            IronsourceTUInitManager.getInstance().refreshRewardedVideoDelegate();
            IronsourceTUInitManager.getInstance().o("rv_" + this.o, this);
            IronsourceTUInitManager.getInstance();
            IronsourceTUInitManager.mVideoAdLastShowTime = SystemClock.elapsedRealtime() + 5000;
            IronSource.showISDemandOnlyRewardedVideo(this.o);
        }
    }

    private void o(Context context, Map<String, Object> map) {
        if (TUSDK.isNetworkLogDebug()) {
            IntegrationHelper.validateIntegration(context);
        }
        if (!TextUtils.isEmpty(this.mUserId)) {
            IronSource.setUserId(this.mUserId);
            IronSource.setDynamicUserId(this.mUserId);
        }
        IronsourceTUInitManager.getInstance().initSDK(context, map, new AnonymousClass1(context));
    }
}
