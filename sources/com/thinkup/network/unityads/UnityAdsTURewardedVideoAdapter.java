package com.thinkup.network.unityads;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.metadata.PlayerMetaData;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class UnityAdsTURewardedVideoAdapter extends CustomRewardVideoAdapter {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f42626n = "UnityAdsTURewardedVideoAdapter";
    String m;
    String o = "";

    /* JADX INFO: renamed from: com.thinkup.network.unityads.UnityAdsTURewardedVideoAdapter$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] o;

        static {
            int[] iArr = new int[UnityAds.UnityAdsShowCompletionState.values().length];
            o = iArr;
            try {
                iArr[UnityAds.UnityAdsShowCompletionState.COMPLETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                o[UnityAds.UnityAdsShowCompletionState.SKIPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static /* synthetic */ int oom(UnityAdsTURewardedVideoAdapter unityAdsTURewardedVideoAdapter) {
        unityAdsTURewardedVideoAdapter.mDismissType = 2;
        return 2;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
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
        this.o = TUInitMediation.getStringFromMap(map, "placement_id");
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
        if (TextUtils.isEmpty(stringFromMap) || TextUtils.isEmpty(this.o)) {
            TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
            if (tUCustomLoadListener != null) {
                tUCustomLoadListener.onAdLoadError("", "unityads game_id, placement_id is empty!");
                return;
            }
            return;
        }
        PlayerMetaData playerMetaData = new PlayerMetaData(context.getApplicationContext());
        playerMetaData.setServerId(this.mUserId);
        playerMetaData.commit();
        UnityAdsTUInitManager.getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.thinkup.network.unityads.UnityAdsTURewardedVideoAdapter.1
            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onFail(String str) {
                if (((TUBaseAdInternalAdapter) UnityAdsTURewardedVideoAdapter.this).mLoadListener != null) {
                    ((TUBaseAdInternalAdapter) UnityAdsTURewardedVideoAdapter.this).mLoadListener.onAdLoadError("", str);
                }
            }

            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onSuccess() {
                UnityAds.load(UnityAdsTURewardedVideoAdapter.this.o, new UnityAdsLoadOptions(), new IUnityAdsLoadListener() { // from class: com.thinkup.network.unityads.UnityAdsTURewardedVideoAdapter.1.1
                    @Override // com.unity3d.ads.IUnityAdsLoadListener
                    public final void onUnityAdsAdLoaded(String str) {
                        UnityAdsTURewardedVideoAdapter unityAdsTURewardedVideoAdapter = UnityAdsTURewardedVideoAdapter.this;
                        unityAdsTURewardedVideoAdapter.m = str;
                        if (((TUBaseAdInternalAdapter) unityAdsTURewardedVideoAdapter).mLoadListener != null) {
                            ((TUBaseAdInternalAdapter) UnityAdsTURewardedVideoAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                        }
                    }

                    @Override // com.unity3d.ads.IUnityAdsLoadListener
                    public final void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
                        if (((TUBaseAdInternalAdapter) UnityAdsTURewardedVideoAdapter.this).mLoadListener != null) {
                            ((TUBaseAdInternalAdapter) UnityAdsTURewardedVideoAdapter.this).mLoadListener.onAdLoadError(unityAdsLoadError.name(), str2);
                        }
                    }
                });
            }
        });
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return UnityAdsTUInitManager.getInstance().setUserDataConsent(context, z2, z3);
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardVideoAdapter
    public void show(Activity activity) {
        if (activity != null) {
            this.m = null;
            UnityAds.show(activity, this.o, new IUnityAdsShowListener() { // from class: com.thinkup.network.unityads.UnityAdsTURewardedVideoAdapter.2
                @Override // com.unity3d.ads.IUnityAdsShowListener
                public final void onUnityAdsShowClick(String str) {
                    if (((CustomRewardVideoAdapter) UnityAdsTURewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) UnityAdsTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayClicked();
                    }
                }

                @Override // com.unity3d.ads.IUnityAdsShowListener
                public final void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
                    if (((CustomRewardVideoAdapter) UnityAdsTURewardedVideoAdapter.this).mImpressionListener != null) {
                        int i2 = AnonymousClass3.o[unityAdsShowCompletionState.ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2) {
                                return;
                            }
                            UnityAdsTURewardedVideoAdapter.oom(UnityAdsTURewardedVideoAdapter.this);
                            if (((CustomRewardVideoAdapter) UnityAdsTURewardedVideoAdapter.this).mImpressionListener != null) {
                                ((CustomRewardVideoAdapter) UnityAdsTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdClosed();
                                return;
                            }
                            return;
                        }
                        if (((CustomRewardVideoAdapter) UnityAdsTURewardedVideoAdapter.this).mImpressionListener != null) {
                            ((CustomRewardVideoAdapter) UnityAdsTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayEnd();
                        }
                        if (((CustomRewardVideoAdapter) UnityAdsTURewardedVideoAdapter.this).mImpressionListener != null) {
                            ((CustomRewardVideoAdapter) UnityAdsTURewardedVideoAdapter.this).mImpressionListener.onReward();
                        }
                        if (((CustomRewardVideoAdapter) UnityAdsTURewardedVideoAdapter.this).mImpressionListener != null) {
                            ((CustomRewardVideoAdapter) UnityAdsTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdClosed();
                        }
                    }
                }

                @Override // com.unity3d.ads.IUnityAdsShowListener
                public final void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
                    if (((CustomRewardVideoAdapter) UnityAdsTURewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) UnityAdsTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayFailed(unityAdsShowError.name(), str2);
                    }
                    if (((CustomRewardVideoAdapter) UnityAdsTURewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) UnityAdsTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdClosed();
                    }
                }

                @Override // com.unity3d.ads.IUnityAdsShowListener
                public final void onUnityAdsShowStart(String str) {
                    if (((CustomRewardVideoAdapter) UnityAdsTURewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) UnityAdsTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayStart();
                    }
                }
            });
        }
    }
}
