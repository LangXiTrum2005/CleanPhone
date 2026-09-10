package com.thinkup.network.unityads;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.thinkup.banner.unitgroup.api.CustomBannerAdapter;
import com.thinkup.banner.unitgroup.api.CustomBannerEventListener;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class UnityAdsTUBannerAdapter extends CustomBannerAdapter {
    BannerView m;
    String o = "";

    /* JADX INFO: renamed from: com.thinkup.network.unityads.UnityAdsTUBannerAdapter$2, reason: invalid class name */
    public class AnonymousClass2 implements BannerView.IListener {
        public AnonymousClass2() {
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public final void onBannerClick(BannerView bannerView) {
            CustomBannerEventListener customBannerEventListener = UnityAdsTUBannerAdapter.this.mImpressionEventListener;
            if (customBannerEventListener != null) {
                customBannerEventListener.onBannerAdClicked();
            }
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public final void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo) {
            if (((TUBaseAdInternalAdapter) UnityAdsTUBannerAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) UnityAdsTUBannerAdapter.this).mLoadListener.onAdLoadError(bannerErrorInfo.errorCode.name(), bannerErrorInfo.errorMessage);
            }
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public final void onBannerLeftApplication(BannerView bannerView) {
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public final void onBannerLoaded(BannerView bannerView) {
            UnityAdsTUBannerAdapter unityAdsTUBannerAdapter = UnityAdsTUBannerAdapter.this;
            unityAdsTUBannerAdapter.m = bannerView;
            if (((TUBaseAdInternalAdapter) unityAdsTUBannerAdapter).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) UnityAdsTUBannerAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public final void onBannerShown(BannerView bannerView) {
            CustomBannerEventListener customBannerEventListener = UnityAdsTUBannerAdapter.this.mImpressionEventListener;
            if (customBannerEventListener != null) {
                customBannerEventListener.onBannerAdShow();
            }
        }
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        BannerView bannerView = this.m;
        if (bannerView != null) {
            bannerView.setListener(null);
            this.m.destroy();
            this.m = null;
        }
    }

    @Override // com.thinkup.banner.unitgroup.api.CustomBannerAdapter
    public View getBannerView() {
        return this.m;
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

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(final Context context, final Map<String, Object> map, final Map<String, Object> map2) {
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
        if (context instanceof Activity) {
            UnityAdsTUInitManager.getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.thinkup.network.unityads.UnityAdsTUBannerAdapter.1
                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onFail(String str) {
                    if (((TUBaseAdInternalAdapter) UnityAdsTUBannerAdapter.this).mLoadListener != null) {
                        ((TUBaseAdInternalAdapter) UnityAdsTUBannerAdapter.this).mLoadListener.onAdLoadError("", str);
                    }
                }

                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onSuccess() {
                    UnityAdsTUBannerAdapter.o(UnityAdsTUBannerAdapter.this, (Activity) context, map, map2);
                }
            });
            return;
        }
        TUCustomLoadListener tUCustomLoadListener2 = this.mLoadListener;
        if (tUCustomLoadListener2 != null) {
            tUCustomLoadListener2.onAdLoadError("", "UnityAds context must be activity.");
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return UnityAdsTUInitManager.getInstance().setUserDataConsent(context, z2, z3);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    private void o(Activity activity, Map<String, Object> map, Map<String, Object> map2) {
        byte b2;
        UnityBannerSize unityBannerSize;
        String stringFromMap = TUInitMediation.getStringFromMap(map, "size");
        int iO = o(activity, activity.getResources().getDisplayMetrics().widthPixels);
        int iHashCode = stringFromMap.hashCode();
        if (iHashCode != 1507809730) {
            if (iHashCode != 1540371324) {
                if (iHashCode == 1622564786 && stringFromMap.equals("728x90")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (stringFromMap.equals("468x60")) {
                b2 = 0;
            } else {
                b2 = -1;
            }
        } else if (stringFromMap.equals("320x50")) {
            b2 = 2;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            unityBannerSize = new UnityBannerSize(iO > 0 ? Math.min(468, iO) : 468, 60);
        } else if (b2 != 1) {
            int iMin = Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE;
            if (iO > 0) {
                iMin = Math.min(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, iO);
            }
            unityBannerSize = new UnityBannerSize(iMin, 50);
        } else {
            unityBannerSize = new UnityBannerSize(iO > 0 ? Math.min(728, iO) : 728, 90);
        }
        if (map2 != null) {
            int intFromMap = TUInitMediation.getIntFromMap(map2, "key_width", -1);
            int intFromMap2 = TUInitMediation.getIntFromMap(map2, "key_height", -1);
            if (intFromMap > 0 && intFromMap2 > 0) {
                unityBannerSize = new UnityBannerSize(iO > 0 ? Math.min(o(activity, intFromMap), iO) : o(activity, intFromMap), o(activity, intFromMap2));
            }
        }
        BannerView bannerView = new BannerView(activity, this.o, unityBannerSize);
        bannerView.setListener(new AnonymousClass2());
        bannerView.load();
    }

    private static int o(Context context, float f) {
        float f2 = context.getResources().getDisplayMetrics().density;
        if (f2 <= 0.0f) {
            f2 = 1.0f;
        }
        return (int) ((f / f2) + 0.5f);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    public static /* synthetic */ void o(UnityAdsTUBannerAdapter unityAdsTUBannerAdapter, Activity activity, Map map, Map map2) {
        byte b2;
        UnityBannerSize unityBannerSize;
        int iO;
        String stringFromMap = TUInitMediation.getStringFromMap(map, "size");
        int iO2 = o(activity, activity.getResources().getDisplayMetrics().widthPixels);
        int iHashCode = stringFromMap.hashCode();
        if (iHashCode != 1507809730) {
            if (iHashCode != 1540371324) {
                if (iHashCode == 1622564786 && stringFromMap.equals("728x90")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (stringFromMap.equals("468x60")) {
                b2 = 0;
            } else {
                b2 = -1;
            }
        } else if (stringFromMap.equals("320x50")) {
            b2 = 2;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            unityBannerSize = new UnityBannerSize(iO2 > 0 ? Math.min(468, iO2) : 468, 60);
        } else if (b2 != 1) {
            int iMin = Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE;
            if (iO2 > 0) {
                iMin = Math.min(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, iO2);
            }
            unityBannerSize = new UnityBannerSize(iMin, 50);
        } else {
            unityBannerSize = new UnityBannerSize(iO2 > 0 ? Math.min(728, iO2) : 728, 90);
        }
        if (map2 != null) {
            int intFromMap = TUInitMediation.getIntFromMap(map2, "key_width", -1);
            int intFromMap2 = TUInitMediation.getIntFromMap(map2, "key_height", -1);
            if (intFromMap > 0 && intFromMap2 > 0) {
                if (iO2 > 0) {
                    iO = Math.min(o(activity, intFromMap), iO2);
                } else {
                    iO = o(activity, intFromMap);
                }
                unityBannerSize = new UnityBannerSize(iO, o(activity, intFromMap2));
            }
        }
        BannerView bannerView = new BannerView(activity, unityAdsTUBannerAdapter.o, unityBannerSize);
        bannerView.setListener(unityAdsTUBannerAdapter.new AnonymousClass2());
        bannerView.load();
    }
}
