package com.thinkup.network.startapp;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerCreator;
import com.startapp.sdk.ads.banner.BannerFormat;
import com.startapp.sdk.ads.banner.BannerListener;
import com.startapp.sdk.ads.banner.BannerRequest;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.thinkup.banner.unitgroup.api.CustomBannerAdapter;
import com.thinkup.banner.unitgroup.api.CustomBannerEventListener;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class StartAppTUBannerAdapter extends CustomBannerAdapter {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    View f42620n;
    BannerRequest.Callback o0;
    BannerListener oo;
    String o = "";
    String m = "";

    /* JADX INFO: renamed from: com.thinkup.network.startapp.StartAppTUBannerAdapter$1, reason: invalid class name */
    public class AnonymousClass1 implements BannerRequest.Callback {
        final /* synthetic */ Context o;

        public AnonymousClass1(Context context) {
            this.o = context;
        }

        @Override // com.startapp.sdk.ads.banner.BannerRequest.Callback
        public final void onFinished(BannerCreator bannerCreator, String str) {
            if (bannerCreator != null) {
                StartAppTUBannerAdapter.this.oo = new BannerListener() { // from class: com.thinkup.network.startapp.StartAppTUBannerAdapter.1.1
                    @Override // com.startapp.sdk.ads.banner.BannerListener
                    public final void onClick(View view) {
                        CustomBannerEventListener customBannerEventListener = StartAppTUBannerAdapter.this.mImpressionEventListener;
                        if (customBannerEventListener != null) {
                            customBannerEventListener.onBannerAdClicked();
                        }
                    }

                    @Override // com.startapp.sdk.ads.banner.BannerListener
                    public final void onFailedToReceiveAd(View view) {
                    }

                    @Override // com.startapp.sdk.ads.banner.BannerListener
                    public final void onImpression(View view) {
                        CustomBannerEventListener customBannerEventListener = StartAppTUBannerAdapter.this.mImpressionEventListener;
                        if (customBannerEventListener != null) {
                            customBannerEventListener.onBannerAdShow();
                        }
                    }

                    @Override // com.startapp.sdk.ads.banner.BannerListener
                    public final void onReceiveAd(View view) {
                    }
                };
                StartAppTUBannerAdapter.this.f42620n = bannerCreator.create(this.o.getApplicationContext(), StartAppTUBannerAdapter.this.oo);
                StartAppTUBannerAdapter startAppTUBannerAdapter = StartAppTUBannerAdapter.this;
                if (startAppTUBannerAdapter.f42620n != null) {
                    if (((TUBaseAdInternalAdapter) startAppTUBannerAdapter).mLoadListener != null) {
                        ((TUBaseAdInternalAdapter) StartAppTUBannerAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                        return;
                    }
                    return;
                }
                str = "StartApp BannerView = null";
            }
            if (((TUBaseAdInternalAdapter) StartAppTUBannerAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) StartAppTUBannerAdapter.this).mLoadListener.onAdLoadError("", "StartApp Banner failed: ".concat(String.valueOf(str)));
            }
        }
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        this.o0 = null;
        this.oo = null;
        View view = this.f42620n;
        if (view instanceof BannerStandard) {
            ((BannerStandard) view).setBannerListener(null);
            this.f42620n = null;
        }
    }

    @Override // com.thinkup.banner.unitgroup.api.CustomBannerAdapter
    public View getBannerView() {
        return this.f42620n;
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) {
        StartAppTUInitManager.getInstance().o(context, map, map2, tUBidRequestInfoListener, 2);
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return StartAppTUInitManager.getInstance().getNetworkName();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.o;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return StartAppTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        BannerFormat bannerFormat;
        String stringFromMap = TUInitMediation.getStringFromMap(map, "app_id");
        this.o = TUInitMediation.getStringFromMap(map, "ad_tag");
        String stringFromMap2 = TUInitMediation.getStringFromMap(map, "size");
        this.m = TUInitMediation.getStringFromMap(map, "payload");
        if (TextUtils.isEmpty(stringFromMap)) {
            TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
            if (tUCustomLoadListener != null) {
                tUCustomLoadListener.onAdLoadError("", "app_id could not be null.");
                return;
            }
            return;
        }
        Context applicationContext = context.getApplicationContext();
        StartAppTUInitManager.getInstance().initSDK(applicationContext, map);
        AdPreferences adPreferences = new AdPreferences();
        if (!TextUtils.isEmpty(this.o)) {
            adPreferences.setAdTag(this.o);
        }
        StartAppTUInitManager.getInstance();
        StartAppTUInitManager.o(adPreferences, map);
        stringFromMap2.getClass();
        switch (stringFromMap2) {
            case "300x157":
                bannerFormat = BannerFormat.COVER;
                break;
            case "300x250":
                bannerFormat = BannerFormat.MREC;
                break;
            case "320x50":
                bannerFormat = BannerFormat.BANNER;
                break;
            default:
                bannerFormat = BannerFormat.BANNER;
                break;
        }
        this.o0 = new AnonymousClass1(applicationContext);
        new BannerRequest(applicationContext).setAdFormat(bannerFormat).setAdPreferences(adPreferences).load(this.o0, !TextUtils.isEmpty(this.m) ? this.m : null);
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return StartAppTUInitManager.getInstance().setUserDataConsent(context, z2, z3);
    }

    private void o(Context context, AdPreferences adPreferences, BannerFormat bannerFormat) {
        this.o0 = new AnonymousClass1(context);
        new BannerRequest(context).setAdFormat(bannerFormat).setAdPreferences(adPreferences).load(this.o0, !TextUtils.isEmpty(this.m) ? this.m : null);
    }
}
