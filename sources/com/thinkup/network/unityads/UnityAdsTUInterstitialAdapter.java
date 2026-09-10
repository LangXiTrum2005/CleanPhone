package com.thinkup.network.unityads;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class UnityAdsTUInterstitialAdapter extends CustomInterstitialAdapter {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f42625n = "UnityAdsTUInterstitialAdapter";
    String m;
    String o = "";

    public static /* synthetic */ int on(UnityAdsTUInterstitialAdapter unityAdsTUInterstitialAdapter) {
        unityAdsTUInterstitialAdapter.mDismissType = 99;
        return 99;
    }

    @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return UnityAdsTUInitManager.getInstance().getNetworkName();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.o;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return UnityAdsTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (map == null || !map.containsKey("game_id") || !map.containsKey("placement_id")) {
            return false;
        }
        this.o = (String) map.get("placement_id");
        return true;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public boolean isAdReady() {
        return !TextUtils.isEmpty(this.m);
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        String stringFromMap = TUInitMediation.getStringFromMap(map, "game_id");
        this.o = TUInitMediation.getStringFromMap(map, "placement_id");
        if (!TextUtils.isEmpty(stringFromMap) && !TextUtils.isEmpty(this.o)) {
            UnityAdsTUInitManager.getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.thinkup.network.unityads.UnityAdsTUInterstitialAdapter.1
                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onFail(String str) {
                    if (((TUBaseAdInternalAdapter) UnityAdsTUInterstitialAdapter.this).mLoadListener != null) {
                        ((TUBaseAdInternalAdapter) UnityAdsTUInterstitialAdapter.this).mLoadListener.onAdLoadError("", str);
                    }
                }

                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onSuccess() {
                    UnityAds.load(UnityAdsTUInterstitialAdapter.this.o, new IUnityAdsLoadListener() { // from class: com.thinkup.network.unityads.UnityAdsTUInterstitialAdapter.1.1
                        @Override // com.unity3d.ads.IUnityAdsLoadListener
                        public final void onUnityAdsAdLoaded(String str) {
                            UnityAdsTUInterstitialAdapter unityAdsTUInterstitialAdapter = UnityAdsTUInterstitialAdapter.this;
                            unityAdsTUInterstitialAdapter.m = str;
                            if (((TUBaseAdInternalAdapter) unityAdsTUInterstitialAdapter).mLoadListener != null) {
                                ((TUBaseAdInternalAdapter) UnityAdsTUInterstitialAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                            }
                        }

                        @Override // com.unity3d.ads.IUnityAdsLoadListener
                        public final void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
                            if (((TUBaseAdInternalAdapter) UnityAdsTUInterstitialAdapter.this).mLoadListener != null) {
                                ((TUBaseAdInternalAdapter) UnityAdsTUInterstitialAdapter.this).mLoadListener.onAdLoadError(unityAdsLoadError.name(), str2);
                            }
                        }
                    });
                }
            });
            return;
        }
        TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
        if (tUCustomLoadListener != null) {
            tUCustomLoadListener.onAdLoadError("", "unityads game_id, placement_id is empty!");
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return UnityAdsTUInitManager.getInstance().setUserDataConsent(context, z2, z3);
    }

    @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter
    public void show(Activity activity) {
        if (activity != null) {
            this.m = null;
            UnityAds.show(activity, this.o, new IUnityAdsShowListener() { // from class: com.thinkup.network.unityads.UnityAdsTUInterstitialAdapter.2
                @Override // com.unity3d.ads.IUnityAdsShowListener
                public final void onUnityAdsShowClick(String str) {
                    if (((CustomInterstitialAdapter) UnityAdsTUInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) UnityAdsTUInterstitialAdapter.this).mImpressListener.onInterstitialAdClicked();
                    }
                }

                @Override // com.unity3d.ads.IUnityAdsShowListener
                public final void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
                    if (((CustomInterstitialAdapter) UnityAdsTUInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) UnityAdsTUInterstitialAdapter.this).mImpressListener.onInterstitialAdClose();
                    }
                }

                @Override // com.unity3d.ads.IUnityAdsShowListener
                public final void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
                    UnityAdsTUInterstitialAdapter.on(UnityAdsTUInterstitialAdapter.this);
                    Log.e(UnityAdsTUInterstitialAdapter.f42625n, "onUnityAdsShowFailure: " + unityAdsShowError.name() + ", " + str2);
                    if (((CustomInterstitialAdapter) UnityAdsTUInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) UnityAdsTUInterstitialAdapter.this).mImpressListener.onInterstitialAdVideoError(unityAdsShowError.name(), str2);
                    }
                    if (((CustomInterstitialAdapter) UnityAdsTUInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) UnityAdsTUInterstitialAdapter.this).mImpressListener.onInterstitialAdClose();
                    }
                }

                @Override // com.unity3d.ads.IUnityAdsShowListener
                public final void onUnityAdsShowStart(String str) {
                    if (((CustomInterstitialAdapter) UnityAdsTUInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) UnityAdsTUInterstitialAdapter.this).mImpressListener.onInterstitialAdShow();
                    }
                }
            });
        }
    }
}
