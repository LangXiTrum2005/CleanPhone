package com.thinkup.network.bigo;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import com.smartdigimkt.v0.k;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.ErrorCode;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.splashad.unitgroup.api.CustomSplashAdapter;
import java.util.HashMap;
import java.util.Map;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.SplashAd;
import sg.bigo.ads.api.SplashAdInteractionListener;
import sg.bigo.ads.api.SplashAdLoader;
import sg.bigo.ads.api.SplashAdRequest;

/* JADX INFO: loaded from: classes6.dex */
public class BigoTUSplashAdapter extends CustomSplashAdapter {
    public static final String TAG = "BigoTUSplashAdapter";
    private SplashAd m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f42536n;
    private String o;

    /* JADX INFO: renamed from: com.thinkup.network.bigo.BigoTUSplashAdapter$3, reason: invalid class name */
    public class AnonymousClass3 implements AdLoadListener<SplashAd> {
        public AnonymousClass3() {
        }

        @Override // sg.bigo.ads.api.AdLoadListener
        public final void onError(AdError adError) {
            if (((TUBaseAdInternalAdapter) BigoTUSplashAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) BigoTUSplashAdapter.this).mLoadListener.onAdLoadError(String.valueOf(adError.getCode()), adError.getMessage());
            }
        }

        @Override // sg.bigo.ads.api.AdLoadListener
        public final void onAdLoaded(SplashAd splashAd) {
            BigoTUSplashAdapter.this.m = splashAd;
            if (((TUBaseAdInternalAdapter) BigoTUSplashAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) BigoTUSplashAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }
    }

    public static /* synthetic */ int o(BigoTUSplashAdapter bigoTUSplashAdapter) {
        bigoTUSplashAdapter.mDismissType = 2;
        return 2;
    }

    public static /* synthetic */ int o0(BigoTUSplashAdapter bigoTUSplashAdapter) {
        bigoTUSplashAdapter.mDismissType = 3;
        return 3;
    }

    public static /* synthetic */ int on(BigoTUSplashAdapter bigoTUSplashAdapter) {
        bigoTUSplashAdapter.mDismissType = 99;
        return 99;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        SplashAd splashAd = this.m;
        if (splashAd != null) {
            splashAd.destroy();
            this.m = null;
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) {
        BigoTUInitManager.getInstance().o(context, map, false, tUBidRequestInfoListener);
    }

    @Override // com.thinkup.core.api.TUBaseAdInternalAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public Map<Integer, Class<? extends TUBaseAdAdapter>> getFormatAdapterMap() {
        HashMap map = new HashMap();
        map.put(0, BigoTUAdapter.class);
        map.put(3, BigoTUInterstitialAdapter.class);
        return map;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return BigoTUInitManager.getInstance().getNetworkName();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.o;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return BigoTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public boolean isAdReady() {
        SplashAd splashAd = this.m;
        return (splashAd == null || splashAd.isExpired()) ? false : true;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, final Map<String, Object> map2) {
        String stringFromMap = TUInitMediation.getStringFromMap(map, "app_id");
        this.o = TUInitMediation.getStringFromMap(map, "slot_id");
        if (!TextUtils.isEmpty(stringFromMap) && !TextUtils.isEmpty(this.o)) {
            this.f42536n = TUInitMediation.getStringFromMap(map, "payload");
            final Context applicationContext = context.getApplicationContext();
            BigoTUInitManager.getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.thinkup.network.bigo.BigoTUSplashAdapter.2
                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onFail(String str) {
                    if (((TUBaseAdInternalAdapter) BigoTUSplashAdapter.this).mLoadListener != null) {
                        ((TUBaseAdInternalAdapter) BigoTUSplashAdapter.this).mLoadListener.onAdLoadError("", str);
                    }
                }

                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onSuccess() {
                    BigoTUSplashAdapter.o(BigoTUSplashAdapter.this, applicationContext, map2);
                }
            });
        } else {
            TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
            if (tUCustomLoadListener != null) {
                tUCustomLoadListener.onAdLoadError("", "Bigo: app_id or slot_id is empty");
            }
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return BigoTUInitManager.getInstance().setUserDataConsent(context, z2, z3);
    }

    @Override // com.thinkup.splashad.unitgroup.api.CustomSplashAdapter
    public void show(Activity activity, ViewGroup viewGroup) {
        SplashAd splashAd = this.m;
        if (splashAd != null) {
            splashAd.setAdInteractionListener(new SplashAdInteractionListener() { // from class: com.thinkup.network.bigo.BigoTUSplashAdapter.1
                @Override // sg.bigo.ads.api.AdInteractionListener
                public final void onAdClicked() {
                    if (((CustomSplashAdapter) BigoTUSplashAdapter.this).mImpressionListener != null) {
                        ((CustomSplashAdapter) BigoTUSplashAdapter.this).mImpressionListener.onSplashAdClicked();
                    }
                }

                @Override // sg.bigo.ads.api.AdInteractionListener
                public final void onAdClosed() {
                }

                @Override // sg.bigo.ads.api.AdInteractionListener
                public final void onAdError(AdError adError) {
                    BigoTUSplashAdapter.on(BigoTUSplashAdapter.this);
                    Log.e(BigoTUSplashAdapter.TAG, "show failed, onAdError: " + adError.getCode() + ", " + adError.getMessage());
                    if (((CustomSplashAdapter) BigoTUSplashAdapter.this).mImpressionListener != null) {
                        ((CustomSplashAdapter) BigoTUSplashAdapter.this).mImpressionListener.onSplashAdShowFail(ErrorCode.getErrorCode(ErrorCode.adShowError, String.valueOf(adError.getCode()), adError.getMessage()));
                    }
                }

                @Override // sg.bigo.ads.api.SplashAdInteractionListener
                public final void onAdFinished() {
                    BigoTUSplashAdapter.o0(BigoTUSplashAdapter.this);
                    if (((CustomSplashAdapter) BigoTUSplashAdapter.this).mImpressionListener != null) {
                        ((CustomSplashAdapter) BigoTUSplashAdapter.this).mImpressionListener.onSplashAdDismiss();
                    }
                }

                @Override // sg.bigo.ads.api.AdInteractionListener
                public final void onAdImpression() {
                    if (((CustomSplashAdapter) BigoTUSplashAdapter.this).mImpressionListener != null) {
                        ((CustomSplashAdapter) BigoTUSplashAdapter.this).mImpressionListener.onSplashAdShow();
                    }
                }

                @Override // sg.bigo.ads.api.AdInteractionListener
                public final void onAdOpened() {
                }

                @Override // sg.bigo.ads.api.SplashAdInteractionListener
                public final void onAdSkipped() {
                    BigoTUSplashAdapter.o(BigoTUSplashAdapter.this);
                    if (((CustomSplashAdapter) BigoTUSplashAdapter.this).mImpressionListener != null) {
                        ((CustomSplashAdapter) BigoTUSplashAdapter.this).mImpressionListener.onSplashAdDismiss();
                    }
                }
            });
            this.m.showInAdContainer(viewGroup);
        }
    }

    private void o(Context context, Map<String, Object> map) {
        String resourceTypeName;
        String str;
        SplashAdRequest.Builder builderWithSlotId = new SplashAdRequest.Builder().withSlotId(this.o);
        if (!TextUtils.isEmpty(this.f42536n)) {
            builderWithSlotId.withBid(this.f42536n);
        }
        String stringFromMap = TUInitMediation.getStringFromMap(map, "app_name");
        if (!TextUtils.isEmpty(stringFromMap)) {
            builderWithSlotId.withAppName(stringFromMap);
        }
        int intFromMap = TUInitMediation.getIntFromMap(map, TUAdConst.KEY.APP_LOGO_ID, -1);
        if (intFromMap > 0) {
            Resources resources = context.getResources();
            String resourceName = "";
            if (resources == null) {
                str = "";
            } else {
                try {
                    resourceTypeName = resources.getResourceTypeName(intFromMap);
                    try {
                        resourceName = resources.getResourceName(intFromMap);
                    } catch (Resources.NotFoundException unused) {
                    }
                } catch (Resources.NotFoundException unused2) {
                    resourceTypeName = "";
                }
                str = resourceName;
                resourceName = resourceTypeName;
            }
            if (!TextUtils.isEmpty(resourceName) && !TextUtils.isEmpty(str) && (resourceName.contains("mipmap") || resourceName.contains(k.d))) {
                builderWithSlotId.withAppLogo(intFromMap);
            }
        }
        new SplashAdLoader.Builder().withAdLoadListener((AdLoadListener<SplashAd>) new AnonymousClass3()).build().loadAd(builderWithSlotId.build());
    }

    public static /* synthetic */ void o(BigoTUSplashAdapter bigoTUSplashAdapter, Context context, Map map) {
        String resourceTypeName;
        String str;
        SplashAdRequest.Builder builderWithSlotId = new SplashAdRequest.Builder().withSlotId(bigoTUSplashAdapter.o);
        if (!TextUtils.isEmpty(bigoTUSplashAdapter.f42536n)) {
            builderWithSlotId.withBid(bigoTUSplashAdapter.f42536n);
        }
        String stringFromMap = TUInitMediation.getStringFromMap(map, "app_name");
        if (!TextUtils.isEmpty(stringFromMap)) {
            builderWithSlotId.withAppName(stringFromMap);
        }
        int intFromMap = TUInitMediation.getIntFromMap(map, TUAdConst.KEY.APP_LOGO_ID, -1);
        if (intFromMap > 0) {
            Resources resources = context.getResources();
            String resourceName = "";
            if (resources == null) {
                str = "";
            } else {
                try {
                    resourceTypeName = resources.getResourceTypeName(intFromMap);
                    try {
                        resourceName = resources.getResourceName(intFromMap);
                    } catch (Resources.NotFoundException unused) {
                    }
                } catch (Resources.NotFoundException unused2) {
                    resourceTypeName = "";
                }
                str = resourceName;
                resourceName = resourceTypeName;
            }
            if (!TextUtils.isEmpty(resourceName) && !TextUtils.isEmpty(str) && (resourceName.contains("mipmap") || resourceName.contains(k.d))) {
                builderWithSlotId.withAppLogo(intFromMap);
            }
        }
        new SplashAdLoader.Builder().withAdLoadListener((AdLoadListener<SplashAd>) bigoTUSplashAdapter.new AnonymousClass3()).build().loadAd(builderWithSlotId.build());
    }
}
