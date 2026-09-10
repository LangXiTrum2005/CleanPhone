package com.thinkup.network.bigo;

import android.content.Context;
import android.text.TextUtils;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.nativead.unitgroup.api.CustomNativeAdapter;
import java.util.Map;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.NativeAdLoader;
import sg.bigo.ads.api.NativeAdRequest;

/* JADX INFO: loaded from: classes6.dex */
public class BigoTUAdapter extends CustomNativeAdapter {
    private String m;
    private String o;

    /* JADX INFO: renamed from: com.thinkup.network.bigo.BigoTUAdapter$2, reason: invalid class name */
    public class AnonymousClass2 implements AdLoadListener<NativeAd> {
        final /* synthetic */ Context o;

        public AnonymousClass2(Context context) {
            this.o = context;
        }

        @Override // sg.bigo.ads.api.AdLoadListener
        public final void onError(AdError adError) {
            if (((TUBaseAdInternalAdapter) BigoTUAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) BigoTUAdapter.this).mLoadListener.onAdLoadError(String.valueOf(adError.getCode()), adError.getMessage());
            }
        }

        @Override // sg.bigo.ads.api.AdLoadListener
        public final void onAdLoaded(NativeAd nativeAd) {
            BigoTUNativeAd bigoTUNativeAd = new BigoTUNativeAd(this.o, nativeAd);
            if (((TUBaseAdInternalAdapter) BigoTUAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) BigoTUAdapter.this).mLoadListener.onAdCacheLoaded(bigoTUNativeAd);
            }
        }
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) {
        BigoTUInitManager.getInstance().o(context, map, false, tUBidRequestInfoListener);
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
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        String stringFromMap = TUInitMediation.getStringFromMap(map, "app_id");
        this.o = TUInitMediation.getStringFromMap(map, "slot_id");
        if (!TextUtils.isEmpty(stringFromMap) && !TextUtils.isEmpty(this.o)) {
            this.m = TUInitMediation.getStringFromMap(map, "payload");
            final Context applicationContext = context.getApplicationContext();
            BigoTUInitManager.getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.thinkup.network.bigo.BigoTUAdapter.1
                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onFail(String str) {
                    if (((TUBaseAdInternalAdapter) BigoTUAdapter.this).mLoadListener != null) {
                        ((TUBaseAdInternalAdapter) BigoTUAdapter.this).mLoadListener.onAdLoadError("", str);
                    }
                }

                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onSuccess() {
                    BigoTUAdapter.o(BigoTUAdapter.this, applicationContext);
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

    private void o(Context context) {
        NativeAdRequest.Builder builderWithSlotId = new NativeAdRequest.Builder().withSlotId(this.o);
        if (!TextUtils.isEmpty(this.m)) {
            builderWithSlotId.withBid(this.m);
        }
        new NativeAdLoader.Builder().withAdLoadListener((AdLoadListener<NativeAd>) new AnonymousClass2(context)).build().loadAd(builderWithSlotId.build());
    }

    public static /* synthetic */ void o(BigoTUAdapter bigoTUAdapter, Context context) {
        NativeAdRequest.Builder builderWithSlotId = new NativeAdRequest.Builder().withSlotId(bigoTUAdapter.o);
        if (!TextUtils.isEmpty(bigoTUAdapter.m)) {
            builderWithSlotId.withBid(bigoTUAdapter.m);
        }
        new NativeAdLoader.Builder().withAdLoadListener((AdLoadListener<NativeAd>) bigoTUAdapter.new AnonymousClass2(context)).build().loadAd(builderWithSlotId.build());
    }
}
