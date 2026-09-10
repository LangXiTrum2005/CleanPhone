package com.thinkup.network.vungle;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter;
import com.vungle.ads.AdConfig;
import com.vungle.ads.BaseAd;
import com.vungle.ads.InterstitialAd;
import com.vungle.ads.InterstitialAdListener;
import com.vungle.ads.VungleError;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class VungleTUInterstitialAdapter extends CustomInterstitialAdapter {
    AdConfig m;
    String o;
    InterstitialAd o0;
    private final String om = "VungleTUInterstitialAdapter";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    String f42637n = "";
    InterstitialAdListener oo = new InterstitialAdListener() { // from class: com.thinkup.network.vungle.VungleTUInterstitialAdapter.1
        @Override // com.vungle.ads.BaseAdListener
        public final void onAdClicked(BaseAd baseAd) {
            if (((CustomInterstitialAdapter) VungleTUInterstitialAdapter.this).mImpressListener != null) {
                ((CustomInterstitialAdapter) VungleTUInterstitialAdapter.this).mImpressListener.onInterstitialAdClicked();
            }
        }

        @Override // com.vungle.ads.BaseAdListener
        public final void onAdEnd(BaseAd baseAd) {
            if (((CustomInterstitialAdapter) VungleTUInterstitialAdapter.this).mImpressListener != null) {
                ((CustomInterstitialAdapter) VungleTUInterstitialAdapter.this).mImpressListener.onInterstitialAdVideoEnd();
                ((CustomInterstitialAdapter) VungleTUInterstitialAdapter.this).mImpressListener.onInterstitialAdClose();
            }
        }

        @Override // com.vungle.ads.BaseAdListener
        public final void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
            if (((TUBaseAdInternalAdapter) VungleTUInterstitialAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) VungleTUInterstitialAdapter.this).mLoadListener.onAdLoadError(String.valueOf(vungleError.getCode()), vungleError.getLocalizedMessage());
            }
        }

        @Override // com.vungle.ads.BaseAdListener
        public final void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
            if (((CustomInterstitialAdapter) VungleTUInterstitialAdapter.this).mImpressListener != null) {
                ((CustomInterstitialAdapter) VungleTUInterstitialAdapter.this).mImpressListener.onInterstitialAdVideoError(String.valueOf(vungleError.getCode()), vungleError.getLocalizedMessage());
            }
        }

        @Override // com.vungle.ads.BaseAdListener
        public final void onAdImpression(BaseAd baseAd) {
            if (((CustomInterstitialAdapter) VungleTUInterstitialAdapter.this).mImpressListener != null) {
                ((CustomInterstitialAdapter) VungleTUInterstitialAdapter.this).mImpressListener.onInterstitialAdShow();
            }
        }

        @Override // com.vungle.ads.BaseAdListener
        public final void onAdLeftApplication(BaseAd baseAd) {
        }

        @Override // com.vungle.ads.BaseAdListener
        public final void onAdLoaded(BaseAd baseAd) {
            if (((TUBaseAdInternalAdapter) VungleTUInterstitialAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) VungleTUInterstitialAdapter.this).mLoadListener.onAdCacheLoaded(new com.thinkup.core.api.BaseAd[0]);
            }
        }

        @Override // com.vungle.ads.BaseAdListener
        public final void onAdStart(BaseAd baseAd) {
            if (((CustomInterstitialAdapter) VungleTUInterstitialAdapter.this).mImpressListener != null) {
                ((CustomInterstitialAdapter) VungleTUInterstitialAdapter.this).mImpressListener.onInterstitialAdVideoStart();
            }
        }
    };

    @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        this.m = null;
        this.oo = null;
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) {
        try {
            this.o = (String) map.get("placement_id");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        VungleTUInitManager.getInstance().o(context, map, tUBidRequestInfoListener);
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter
    public TUInitMediation getMediationInitManager() {
        return VungleTUInitManager.getInstance();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return VungleTUInitManager.getInstance().getNetworkName();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.o;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return VungleTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public boolean isAdReady() {
        InterstitialAd interstitialAd = this.o0;
        if (interstitialAd != null) {
            return interstitialAd.canPlayAd().booleanValue();
        }
        return false;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        String str = (String) map.get("app_id");
        this.o = (String) map.get("placement_id");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.o)) {
            TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
            if (tUCustomLoadListener != null) {
                tUCustomLoadListener.onAdLoadError("", "vungle appid & placementId is empty.");
                return;
            }
            return;
        }
        if (map.containsKey("payload")) {
            this.f42637n = map.get("payload").toString();
        }
        this.m = new AdConfig();
        try {
            if (map2.containsKey(TUAdConst.KEY.AD_ORIENTATION)) {
                int i2 = Integer.parseInt(map2.get(TUAdConst.KEY.AD_ORIENTATION).toString());
                if (i2 == 1) {
                    this.m.setAdOrientation(0);
                } else if (i2 == 2) {
                    this.m.setAdOrientation(1);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        final Context applicationContext = context.getApplicationContext();
        VungleTUInitManager.getInstance().initSDK(applicationContext, map, new MediationInitCallback() { // from class: com.thinkup.network.vungle.VungleTUInterstitialAdapter.2
            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onFail(String str2) {
                if (((TUBaseAdInternalAdapter) VungleTUInterstitialAdapter.this).mLoadListener != null) {
                    ((TUBaseAdInternalAdapter) VungleTUInterstitialAdapter.this).mLoadListener.onAdLoadError("", str2);
                }
            }

            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onSuccess() {
                VungleTUInterstitialAdapter.o(VungleTUInterstitialAdapter.this, applicationContext);
            }
        });
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return VungleTUInitManager.getInstance().setUserDataConsent(context, z2, z3);
    }

    @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter
    public void show(Activity activity) throws Throwable {
        InterstitialAd interstitialAd = this.o0;
        if (interstitialAd != null) {
            interstitialAd.play(activity);
        }
    }

    private void o(Context context) {
        try {
            InterstitialAd interstitialAd = new InterstitialAd(context, this.o, this.m);
            this.o0 = interstitialAd;
            interstitialAd.setAdListener(this.oo);
            this.o0.load(this.f42637n);
        } catch (Throwable th) {
            TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
            if (tUCustomLoadListener != null) {
                tUCustomLoadListener.onAdLoadError("", th.getMessage());
            }
        }
    }

    public static /* synthetic */ void o(VungleTUInterstitialAdapter vungleTUInterstitialAdapter, Context context) {
        try {
            InterstitialAd interstitialAd = new InterstitialAd(context, vungleTUInterstitialAdapter.o, vungleTUInterstitialAdapter.m);
            vungleTUInterstitialAdapter.o0 = interstitialAd;
            interstitialAd.setAdListener(vungleTUInterstitialAdapter.oo);
            vungleTUInterstitialAdapter.o0.load(vungleTUInterstitialAdapter.f42637n);
        } catch (Throwable th) {
            TUCustomLoadListener tUCustomLoadListener = vungleTUInterstitialAdapter.mLoadListener;
            if (tUCustomLoadListener != null) {
                tUCustomLoadListener.onAdLoadError("", th.getMessage());
            }
        }
    }
}
