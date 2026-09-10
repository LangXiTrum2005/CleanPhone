package com.thinkup.network.bigo;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.thinkup.banner.unitgroup.api.CustomBannerAdapter;
import com.thinkup.banner.unitgroup.api.CustomBannerEventListener;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import java.util.HashMap;
import java.util.Map;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.AdSize;
import sg.bigo.ads.api.BannerAd;
import sg.bigo.ads.api.BannerAdLoader;
import sg.bigo.ads.api.BannerAdRequest;

/* JADX INFO: loaded from: classes6.dex */
public class BigoTUBannerAdapter extends CustomBannerAdapter {
    public static final String TAG = "BigoTUBannerAdapter";
    private BannerAd m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View f42530n;
    private String o;
    private String o0;

    /* JADX INFO: renamed from: com.thinkup.network.bigo.BigoTUBannerAdapter$2, reason: invalid class name */
    public class AnonymousClass2 implements AdLoadListener<BannerAd> {
        public AnonymousClass2() {
        }

        @Override // sg.bigo.ads.api.AdLoadListener
        public final void onError(AdError adError) {
            if (((TUBaseAdInternalAdapter) BigoTUBannerAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) BigoTUBannerAdapter.this).mLoadListener.onAdLoadError(String.valueOf(adError.getCode()), adError.getMessage());
            }
        }

        @Override // sg.bigo.ads.api.AdLoadListener
        public final void onAdLoaded(BannerAd bannerAd) {
            BigoTUBannerAdapter.this.m = bannerAd;
            BigoTUBannerAdapter.this.postOnMainThread(new Runnable() { // from class: com.thinkup.network.bigo.BigoTUBannerAdapter.2.1
                @Override // java.lang.Runnable
                public final void run() {
                    BigoTUBannerAdapter.this.m.setAdInteractionListener(new AdInteractionListener() { // from class: com.thinkup.network.bigo.BigoTUBannerAdapter.2.1.1
                        @Override // sg.bigo.ads.api.AdInteractionListener
                        public final void onAdClicked() {
                            CustomBannerEventListener customBannerEventListener = BigoTUBannerAdapter.this.mImpressionEventListener;
                            if (customBannerEventListener != null) {
                                customBannerEventListener.onBannerAdClicked();
                            }
                        }

                        @Override // sg.bigo.ads.api.AdInteractionListener
                        public final void onAdClosed() {
                        }

                        @Override // sg.bigo.ads.api.AdInteractionListener
                        public final void onAdError(AdError adError) {
                            Log.e(BigoTUBannerAdapter.TAG, "onAdError: " + adError.getCode() + ", " + adError.getMessage());
                        }

                        @Override // sg.bigo.ads.api.AdInteractionListener
                        public final void onAdImpression() {
                            CustomBannerEventListener customBannerEventListener = BigoTUBannerAdapter.this.mImpressionEventListener;
                            if (customBannerEventListener != null) {
                                customBannerEventListener.onBannerAdShow();
                            }
                        }

                        @Override // sg.bigo.ads.api.AdInteractionListener
                        public final void onAdOpened() {
                        }
                    });
                    BigoTUBannerAdapter bigoTUBannerAdapter = BigoTUBannerAdapter.this;
                    bigoTUBannerAdapter.f42530n = bigoTUBannerAdapter.m.adView();
                    if (((TUBaseAdInternalAdapter) BigoTUBannerAdapter.this).mLoadListener != null) {
                        ((TUBaseAdInternalAdapter) BigoTUBannerAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                    }
                }
            });
        }
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        BannerAd bannerAd = this.m;
        if (bannerAd != null) {
            bannerAd.destroy();
            this.m = null;
        }
        this.f42530n = null;
    }

    @Override // com.thinkup.banner.unitgroup.api.CustomBannerAdapter
    public View getBannerView() {
        BannerAd bannerAd = this.m;
        if (bannerAd == null || bannerAd.isExpired()) {
            return null;
        }
        return this.f42530n;
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) {
        BigoTUInitManager.getInstance().o(context, map, true, tUBidRequestInfoListener);
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
    public void loadCustomNetworkAd(Context context, final Map<String, Object> map, Map<String, Object> map2) {
        String stringFromMap = TUInitMediation.getStringFromMap(map, "app_id");
        this.o = TUInitMediation.getStringFromMap(map, "slot_id");
        if (!TextUtils.isEmpty(stringFromMap) && !TextUtils.isEmpty(this.o)) {
            this.o0 = TUInitMediation.getStringFromMap(map, "payload");
            BigoTUInitManager.getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.thinkup.network.bigo.BigoTUBannerAdapter.1
                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onFail(String str) {
                    if (((TUBaseAdInternalAdapter) BigoTUBannerAdapter.this).mLoadListener != null) {
                        ((TUBaseAdInternalAdapter) BigoTUBannerAdapter.this).mLoadListener.onAdLoadError("", str);
                    }
                }

                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onSuccess() {
                    BigoTUBannerAdapter.o(BigoTUBannerAdapter.this, map);
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

    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void o(Map<String, Object> map) {
        byte b2;
        BannerAdRequest.Builder builder = new BannerAdRequest.Builder();
        builder.withSlotId(this.o);
        if (!TextUtils.isEmpty(this.o0)) {
            builder.withBid(this.o0);
        }
        AdSize adSize = AdSize.BANNER;
        try {
            String stringFromMap = TUInitMediation.getStringFromMap(map, "size");
            switch (stringFromMap.hashCode()) {
                case -559799608:
                    if (!stringFromMap.equals("300x250")) {
                        b2 = -1;
                    } else {
                        b2 = 1;
                    }
                    break;
                case -502542422:
                    if (!stringFromMap.equals("320x100")) {
                        b2 = -1;
                    } else {
                        b2 = 0;
                    }
                    break;
                case 1507809854:
                    if (!stringFromMap.equals("320x90")) {
                        b2 = -1;
                    } else {
                        b2 = 2;
                    }
                    break;
                case 1622564786:
                    if (!stringFromMap.equals("728x90")) {
                        b2 = -1;
                    } else {
                        b2 = 3;
                    }
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                adSize = AdSize.MOBILE_LARGE_LEADERBOARD;
            } else if (b2 == 1) {
                adSize = AdSize.MEDIUM_RECTANGLE;
            } else if (b2 == 2) {
                adSize = AdSize.LARGE_BANNER;
            } else if (b2 == 3) {
                adSize = AdSize.LEADERBOARD;
            }
        } catch (Throwable unused) {
        }
        builder.withAdSizes(adSize);
        new BannerAdLoader.Builder().withAdLoadListener((AdLoadListener<BannerAd>) new AnonymousClass2()).build().loadAd(builder.build());
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static /* synthetic */ void o(BigoTUBannerAdapter bigoTUBannerAdapter, Map map) {
        byte b2;
        BannerAdRequest.Builder builder = new BannerAdRequest.Builder();
        builder.withSlotId(bigoTUBannerAdapter.o);
        if (!TextUtils.isEmpty(bigoTUBannerAdapter.o0)) {
            builder.withBid(bigoTUBannerAdapter.o0);
        }
        AdSize adSize = AdSize.BANNER;
        try {
            String stringFromMap = TUInitMediation.getStringFromMap(map, "size");
            switch (stringFromMap.hashCode()) {
                case -559799608:
                    if (!stringFromMap.equals("300x250")) {
                        b2 = -1;
                    } else {
                        b2 = 1;
                    }
                    break;
                case -502542422:
                    if (!stringFromMap.equals("320x100")) {
                        b2 = -1;
                    } else {
                        b2 = 0;
                    }
                    break;
                case 1507809854:
                    if (!stringFromMap.equals("320x90")) {
                        b2 = -1;
                    } else {
                        b2 = 2;
                    }
                    break;
                case 1622564786:
                    if (!stringFromMap.equals("728x90")) {
                        b2 = -1;
                    } else {
                        b2 = 3;
                    }
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                adSize = AdSize.MOBILE_LARGE_LEADERBOARD;
            } else if (b2 == 1) {
                adSize = AdSize.MEDIUM_RECTANGLE;
            } else if (b2 == 2) {
                adSize = AdSize.LARGE_BANNER;
            } else if (b2 == 3) {
                adSize = AdSize.LEADERBOARD;
            }
        } catch (Throwable unused) {
        }
        builder.withAdSizes(adSize);
        new BannerAdLoader.Builder().withAdLoadListener((AdLoadListener<BannerAd>) bigoTUBannerAdapter.new AnonymousClass2()).build().loadAd(builder.build());
    }
}
