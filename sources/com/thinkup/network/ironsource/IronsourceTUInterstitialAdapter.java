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
import com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter;
import com.thinkup.interstitial.unitgroup.api.CustomInterstitialEventListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoader;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public class IronsourceTUInterstitialAdapter extends CustomInterstitialAdapter implements IronsourceTUEventListener {
    String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    InterstitialAd f42595n;
    private final String o0 = "IronsourceTUInterstitialAdapter";
    String o = "";

    /* JADX INFO: renamed from: com.thinkup.network.ironsource.IronsourceTUInterstitialAdapter$1, reason: invalid class name */
    public class AnonymousClass1 implements MediationInitCallback {
        final /* synthetic */ Context o;

        public AnonymousClass1(Context context) {
            this.o = context;
        }

        @Override // com.thinkup.core.api.MediationInitCallback
        public final void onFail(String str) {
            IronsourceTUInterstitialAdapter.this.notifyLoadFail("", str);
        }

        @Override // com.thinkup.core.api.MediationInitCallback
        public final void onSuccess() {
            try {
                if (!TextUtils.isEmpty(IronsourceTUInterstitialAdapter.this.m)) {
                    IronsourceTUInterstitialAdapter ironsourceTUInterstitialAdapter = IronsourceTUInterstitialAdapter.this;
                    InterstitialAdLoader.loadAd(new InterstitialAdRequest.Builder(ironsourceTUInterstitialAdapter.o, ironsourceTUInterstitialAdapter.m).build(), new InterstitialAdLoaderListener() { // from class: com.thinkup.network.ironsource.IronsourceTUInterstitialAdapter.1.1
                        @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener
                        public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
                            String unused = IronsourceTUInterstitialAdapter.this.o0;
                            Objects.toString(ironSourceError);
                            IronsourceTUInterstitialAdapter.this.notifyLoadFail(String.valueOf(ironSourceError), ironSourceError.getErrorMessage());
                        }

                        @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener
                        public final void onInterstitialAdLoaded(InterstitialAd interstitialAd) {
                            String unused = IronsourceTUInterstitialAdapter.this.o0;
                            Objects.toString(interstitialAd);
                            IronsourceTUInterstitialAdapter.this.f42595n = interstitialAd;
                            interstitialAd.setListener(new InterstitialAdListener() { // from class: com.thinkup.network.ironsource.IronsourceTUInterstitialAdapter.1.1.1
                                @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdListener
                                public final void onInterstitialAdClicked(InterstitialAd interstitialAd2) {
                                    if (((CustomInterstitialAdapter) IronsourceTUInterstitialAdapter.this).mImpressListener != null) {
                                        ((CustomInterstitialAdapter) IronsourceTUInterstitialAdapter.this).mImpressListener.onInterstitialAdClicked();
                                    }
                                }

                                @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdListener
                                public final void onInterstitialAdDismissed(InterstitialAd interstitialAd2) {
                                    if (((CustomInterstitialAdapter) IronsourceTUInterstitialAdapter.this).mImpressListener != null) {
                                        ((CustomInterstitialAdapter) IronsourceTUInterstitialAdapter.this).mImpressListener.onInterstitialAdClose();
                                    }
                                }

                                @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdListener
                                public final void onInterstitialAdFailedToShow(InterstitialAd interstitialAd2, IronSourceError ironSourceError) {
                                    if (((CustomInterstitialAdapter) IronsourceTUInterstitialAdapter.this).mImpressListener != null) {
                                        ((CustomInterstitialAdapter) IronsourceTUInterstitialAdapter.this).mImpressListener.onInterstitialAdVideoError(String.valueOf(ironSourceError), ironSourceError.getErrorMessage());
                                    }
                                }

                                @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdListener
                                public final void onInterstitialAdShown(InterstitialAd interstitialAd2) {
                                    if (((CustomInterstitialAdapter) IronsourceTUInterstitialAdapter.this).mImpressListener != null) {
                                        ((CustomInterstitialAdapter) IronsourceTUInterstitialAdapter.this).mImpressListener.onInterstitialAdShow();
                                    }
                                }
                            });
                            if (((TUBaseAdInternalAdapter) IronsourceTUInterstitialAdapter.this).mLoadListener != null) {
                                ((TUBaseAdInternalAdapter) IronsourceTUInterstitialAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                            }
                        }
                    });
                } else {
                    if (!(this.o instanceof Activity)) {
                        IronsourceTUInterstitialAdapter.this.notifyLoadFail("", "Ironsource activity must be activity.");
                        return;
                    }
                    if (IronSource.isISDemandOnlyInterstitialReady(IronsourceTUInterstitialAdapter.this.o)) {
                        ((TUBaseAdInternalAdapter) IronsourceTUInterstitialAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                        return;
                    }
                    IronsourceTUInitManager ironsourceTUInitManager = IronsourceTUInitManager.getInstance();
                    Activity activity = (Activity) this.o;
                    IronsourceTUInterstitialAdapter ironsourceTUInterstitialAdapter2 = IronsourceTUInterstitialAdapter.this;
                    ironsourceTUInitManager.loadInterstitial(activity, ironsourceTUInterstitialAdapter2.o, ironsourceTUInterstitialAdapter2);
                }
            } catch (Throwable th) {
                IronsourceTUInterstitialAdapter.this.notifyLoadFail("", th.getMessage());
            }
        }
    }

    @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) {
        this.o = TUInitMediation.getStringFromMap(map, "instance_id");
        IronsourceTUInitManager.getInstance().o(context, map, tUBidRequestInfoListener, 3);
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
            return IronSource.isISDemandOnlyInterstitialReady(this.o);
        }
        InterstitialAd interstitialAd = this.f42595n;
        return interstitialAd != null && interstitialAd.isReadyToShow();
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
        IronsourceTUInitManager.getInstance().initSDK(context, map, new AnonymousClass1(context));
    }

    @Override // com.thinkup.network.ironsource.IronsourceTUEventListener
    public void notifyClick() {
        CustomInterstitialEventListener customInterstitialEventListener = this.mImpressListener;
        if (customInterstitialEventListener != null) {
            customInterstitialEventListener.onInterstitialAdClicked();
        }
    }

    @Override // com.thinkup.network.ironsource.IronsourceTUEventListener
    public void notifyClose() {
        IronsourceTUInitManager.getInstance();
        IronsourceTUInitManager.mVideoAdLastShowTime = 0L;
        CustomInterstitialEventListener customInterstitialEventListener = this.mImpressListener;
        if (customInterstitialEventListener != null) {
            customInterstitialEventListener.onInterstitialAdClose();
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
        this.mDismissType = 99;
    }

    @Override // com.thinkup.network.ironsource.IronsourceTUEventListener
    public void notifyPlayStart() {
        CustomInterstitialEventListener customInterstitialEventListener = this.mImpressListener;
        if (customInterstitialEventListener != null) {
            customInterstitialEventListener.onInterstitialAdShow();
        }
        IronsourceTUInitManager.getInstance();
        IronsourceTUInitManager.mVideoAdLastShowTime = 0L;
    }

    @Override // com.thinkup.network.ironsource.IronsourceTUEventListener
    public void notifyReward() {
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return IronsourceTUInitManager.getInstance().setUserDataConsent(context, z2, z3);
    }

    @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter
    public void show(Activity activity) {
        if (TextUtils.isEmpty(this.m)) {
            IronsourceTUInitManager.getInstance().refreshInterstitialDelegate();
            IronsourceTUInitManager.getInstance().o("inter_" + this.o, this);
            IronsourceTUInitManager.getInstance();
            IronsourceTUInitManager.mVideoAdLastShowTime = SystemClock.elapsedRealtime() + 5000;
            IronSource.showISDemandOnlyInterstitial(this.o);
            return;
        }
        InterstitialAd interstitialAd = this.f42595n;
        if (interstitialAd != null && interstitialAd.isReadyToShow()) {
            this.f42595n.show(activity);
            return;
        }
        CustomInterstitialEventListener customInterstitialEventListener = this.mImpressListener;
        if (customInterstitialEventListener != null) {
            customInterstitialEventListener.onInterstitialAdVideoError("", "mInterstitialAd is not ReadyToShow");
        }
    }

    private void o(Context context, Map<String, Object> map) {
        if (TUSDK.isNetworkLogDebug()) {
            IntegrationHelper.validateIntegration(context);
        }
        IronsourceTUInitManager.getInstance().initSDK(context, map, new AnonymousClass1(context));
    }
}
