package com.thinkup.network.vungle;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.thinkup.core.api.ErrorCode;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.splashad.unitgroup.api.CustomSplashAdapter;
import com.vungle.ads.AdConfig;
import com.vungle.ads.BaseAd;
import com.vungle.ads.InterstitialAd;
import com.vungle.ads.InterstitialAdListener;
import com.vungle.ads.VungleError;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class VungleTUSplashAdapter extends CustomSplashAdapter {
    AdConfig m;
    String o;
    InterstitialAd o0;
    private final String om = "VungleTUSplashAdapter";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    String f42640n = "";
    InterstitialAdListener oo = new InterstitialAdListener() { // from class: com.thinkup.network.vungle.VungleTUSplashAdapter.1
        @Override // com.vungle.ads.BaseAdListener
        public final void onAdClicked(BaseAd baseAd) {
            if (((CustomSplashAdapter) VungleTUSplashAdapter.this).mImpressionListener != null) {
                ((CustomSplashAdapter) VungleTUSplashAdapter.this).mImpressionListener.onSplashAdClicked();
            }
        }

        @Override // com.vungle.ads.BaseAdListener
        public final void onAdEnd(BaseAd baseAd) {
            if (((CustomSplashAdapter) VungleTUSplashAdapter.this).mImpressionListener != null) {
                ((CustomSplashAdapter) VungleTUSplashAdapter.this).mImpressionListener.onSplashAdDismiss();
            }
        }

        @Override // com.vungle.ads.BaseAdListener
        public final void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
            if (((TUBaseAdInternalAdapter) VungleTUSplashAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) VungleTUSplashAdapter.this).mLoadListener.onAdLoadError(String.valueOf(vungleError.getCode()), vungleError.getLocalizedMessage());
            }
        }

        @Override // com.vungle.ads.BaseAdListener
        public final void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
            VungleTUSplashAdapter.mn(VungleTUSplashAdapter.this);
            if (((CustomSplashAdapter) VungleTUSplashAdapter.this).mImpressionListener != null) {
                ((CustomSplashAdapter) VungleTUSplashAdapter.this).mImpressionListener.onSplashAdShowFail(ErrorCode.getErrorCode(ErrorCode.adShowError, String.valueOf(vungleError.getCode()), vungleError.getLocalizedMessage()));
                ((CustomSplashAdapter) VungleTUSplashAdapter.this).mImpressionListener.onSplashAdDismiss();
            }
        }

        @Override // com.vungle.ads.BaseAdListener
        public final void onAdImpression(BaseAd baseAd) {
            if (((CustomSplashAdapter) VungleTUSplashAdapter.this).mImpressionListener != null) {
                ((CustomSplashAdapter) VungleTUSplashAdapter.this).mImpressionListener.onSplashAdShow();
            }
        }

        @Override // com.vungle.ads.BaseAdListener
        public final void onAdLeftApplication(BaseAd baseAd) {
        }

        @Override // com.vungle.ads.BaseAdListener
        public final void onAdLoaded(BaseAd baseAd) {
            if (((TUBaseAdInternalAdapter) VungleTUSplashAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) VungleTUSplashAdapter.this).mLoadListener.onAdCacheLoaded(new com.thinkup.core.api.BaseAd[0]);
            }
        }

        @Override // com.vungle.ads.BaseAdListener
        public final void onAdStart(BaseAd baseAd) {
        }
    };

    public static /* synthetic */ int mn(VungleTUSplashAdapter vungleTUSplashAdapter) {
        vungleTUSplashAdapter.mDismissType = 99;
        return 99;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
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

    @Override // com.thinkup.core.api.TUBaseAdInternalAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public Map<Integer, Class<? extends TUBaseAdAdapter>> getFormatAdapterMap() {
        HashMap map = new HashMap();
        map.put(0, VungleTUAdapter.class);
        return map;
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
            this.f42640n = map.get("payload").toString();
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
        VungleTUInitManager.getInstance().initSDK(applicationContext, map, new MediationInitCallback() { // from class: com.thinkup.network.vungle.VungleTUSplashAdapter.2
            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onFail(String str2) {
                if (((TUBaseAdInternalAdapter) VungleTUSplashAdapter.this).mLoadListener != null) {
                    ((TUBaseAdInternalAdapter) VungleTUSplashAdapter.this).mLoadListener.onAdLoadError("", str2);
                }
            }

            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onSuccess() {
                VungleTUSplashAdapter.o(VungleTUSplashAdapter.this, applicationContext);
            }
        });
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return VungleTUInitManager.getInstance().setUserDataConsent(context, z2, z3);
    }

    @Override // com.thinkup.splashad.unitgroup.api.CustomSplashAdapter
    public void show(Activity activity, ViewGroup viewGroup) throws Throwable {
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
            this.o0.load(this.f42640n);
        } catch (Throwable th) {
            TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
            if (tUCustomLoadListener != null) {
                tUCustomLoadListener.onAdLoadError("", th.getMessage());
            }
        }
    }

    public static /* synthetic */ void o(VungleTUSplashAdapter vungleTUSplashAdapter, Context context) {
        try {
            InterstitialAd interstitialAd = new InterstitialAd(context, vungleTUSplashAdapter.o, vungleTUSplashAdapter.m);
            vungleTUSplashAdapter.o0 = interstitialAd;
            interstitialAd.setAdListener(vungleTUSplashAdapter.oo);
            vungleTUSplashAdapter.o0.load(vungleTUSplashAdapter.f42640n);
        } catch (Throwable th) {
            TUCustomLoadListener tUCustomLoadListener = vungleTUSplashAdapter.mLoadListener;
            if (tUCustomLoadListener != null) {
                tUCustomLoadListener.onAdLoadError("", th.getMessage());
            }
        }
    }
}
