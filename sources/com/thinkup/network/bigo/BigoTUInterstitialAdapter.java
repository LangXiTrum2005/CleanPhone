package com.thinkup.network.bigo;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter;
import java.util.HashMap;
import java.util.Map;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.InterstitialAd;
import sg.bigo.ads.api.InterstitialAdLoader;
import sg.bigo.ads.api.InterstitialAdRequest;

/* JADX INFO: loaded from: classes6.dex */
public class BigoTUInterstitialAdapter extends CustomInterstitialAdapter {
    private InterstitialAd m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f42533n;
    private String o;

    /* JADX INFO: renamed from: com.thinkup.network.bigo.BigoTUInterstitialAdapter$3, reason: invalid class name */
    public class AnonymousClass3 implements AdLoadListener<InterstitialAd> {
        public AnonymousClass3() {
        }

        @Override // sg.bigo.ads.api.AdLoadListener
        public final void onError(AdError adError) {
            if (((TUBaseAdInternalAdapter) BigoTUInterstitialAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) BigoTUInterstitialAdapter.this).mLoadListener.onAdLoadError(String.valueOf(adError.getCode()), adError.getMessage());
            }
        }

        @Override // sg.bigo.ads.api.AdLoadListener
        public final void onAdLoaded(InterstitialAd interstitialAd) {
            BigoTUInterstitialAdapter.this.m = interstitialAd;
            if (((TUBaseAdInternalAdapter) BigoTUInterstitialAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) BigoTUInterstitialAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }
    }

    public static /* synthetic */ void mo(BigoTUInterstitialAdapter bigoTUInterstitialAdapter) {
        InterstitialAdRequest.Builder builder = new InterstitialAdRequest.Builder();
        builder.withSlotId(bigoTUInterstitialAdapter.o);
        if (!TextUtils.isEmpty(bigoTUInterstitialAdapter.f42533n)) {
            builder.withBid(bigoTUInterstitialAdapter.f42533n);
        }
        new InterstitialAdLoader.Builder().withAdLoadListener((AdLoadListener<InterstitialAd>) bigoTUInterstitialAdapter.new AnonymousClass3()).build().loadAd(builder.build());
    }

    @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        InterstitialAd interstitialAd = this.m;
        if (interstitialAd != null) {
            interstitialAd.destroy();
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
        InterstitialAd interstitialAd = this.m;
        return (interstitialAd == null || interstitialAd.isExpired()) ? false : true;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        String stringFromMap = TUInitMediation.getStringFromMap(map, "app_id");
        this.o = TUInitMediation.getStringFromMap(map, "slot_id");
        if (!TextUtils.isEmpty(stringFromMap) && !TextUtils.isEmpty(this.o)) {
            this.f42533n = TUInitMediation.getStringFromMap(map, "payload");
            BigoTUInitManager.getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.thinkup.network.bigo.BigoTUInterstitialAdapter.2
                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onFail(String str) {
                    if (((TUBaseAdInternalAdapter) BigoTUInterstitialAdapter.this).mLoadListener != null) {
                        ((TUBaseAdInternalAdapter) BigoTUInterstitialAdapter.this).mLoadListener.onAdLoadError("", str);
                    }
                }

                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onSuccess() {
                    BigoTUInterstitialAdapter.mo(BigoTUInterstitialAdapter.this);
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

    @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter
    public void show(Activity activity) {
        InterstitialAd interstitialAd = this.m;
        if (interstitialAd != null) {
            interstitialAd.setAdInteractionListener(new AdInteractionListener() { // from class: com.thinkup.network.bigo.BigoTUInterstitialAdapter.1
                @Override // sg.bigo.ads.api.AdInteractionListener
                public final void onAdClicked() {
                    if (((CustomInterstitialAdapter) BigoTUInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) BigoTUInterstitialAdapter.this).mImpressListener.onInterstitialAdClicked();
                    }
                }

                @Override // sg.bigo.ads.api.AdInteractionListener
                public final void onAdClosed() {
                    if (((CustomInterstitialAdapter) BigoTUInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) BigoTUInterstitialAdapter.this).mImpressListener.onInterstitialAdClose();
                    }
                }

                @Override // sg.bigo.ads.api.AdInteractionListener
                public final void onAdError(AdError adError) {
                    if (((CustomInterstitialAdapter) BigoTUInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) BigoTUInterstitialAdapter.this).mImpressListener.onInterstitialAdVideoError(String.valueOf(adError.getCode()), adError.getMessage());
                    }
                }

                @Override // sg.bigo.ads.api.AdInteractionListener
                public final void onAdImpression() {
                    if (((CustomInterstitialAdapter) BigoTUInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) BigoTUInterstitialAdapter.this).mImpressListener.onInterstitialAdShow();
                    }
                }

                @Override // sg.bigo.ads.api.AdInteractionListener
                public final void onAdOpened() {
                }
            });
            try {
                this.m.show(activity);
            } catch (Throwable unused) {
                this.m.show();
            }
        }
    }

    private void o() {
        InterstitialAdRequest.Builder builder = new InterstitialAdRequest.Builder();
        builder.withSlotId(this.o);
        if (!TextUtils.isEmpty(this.f42533n)) {
            builder.withBid(this.f42533n);
        }
        new InterstitialAdLoader.Builder().withAdLoadListener((AdLoadListener<InterstitialAd>) new AnonymousClass3()).build().loadAd(builder.build());
    }
}
