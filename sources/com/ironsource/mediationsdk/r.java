package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class r extends a<NativeAdListener> implements NativeAdSmashListener {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, UUID adUnitObjectId) {
        super(abstractAdapter, networkSettings, IronSource.a.NATIVE_AD, adUnitObjectId);
        kotlin.jvm.internal.n.f(adUnitObjectId, "adUnitObjectId");
    }

    @Override // com.ironsource.mediationsdk.a
    public void a(JSONObject config, JSONObject adUnitData, AdData adData) {
        kotlin.jvm.internal.n.f(config, "config");
        kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
        kotlin.jvm.internal.n.f(adData, "adData");
        Integer num = adData.getInt("instanceType");
        if (num == null || num.intValue() != 1) {
            this.f29283a.loadNativeAdForBidding(config, adUnitData, adData.getServerData(), this);
        } else {
            this.f29283a.loadNativeAd(config, adUnitData, this);
        }
    }

    @Override // com.ironsource.mediationsdk.a
    public IronSource.a b() {
        return IronSource.a.NATIVE_AD;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        NativeAdListener nativeAdListener = (NativeAdListener) this.f29284b.get();
        if (nativeAdListener != null) {
            nativeAdListener.onAdClicked();
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose(a("error = " + ironSourceError));
        int errorCode = ironSourceError != null ? ironSourceError.getErrorCode() : 1000;
        String errorMessage = ironSourceError != null ? ironSourceError.getErrorMessage() : null;
        if (errorMessage == null) {
            errorMessage = "";
        }
        if (this.f29284b.get() != null) {
            AdapterErrorType adapterErrorType = a(ironSourceError) ? AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL : AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL;
            NativeAdListener nativeAdListener = (NativeAdListener) this.f29284b.get();
            if (nativeAdListener != null) {
                nativeAdListener.onAdLoadFailed(adapterErrorType, errorCode, errorMessage);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdLoaded(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder) {
        kotlin.jvm.internal.n.f(adapterNativeAdData, "adapterNativeAdData");
        kotlin.jvm.internal.n.f(nativeAdViewBinder, "nativeAdViewBinder");
        IronLog.ADAPTER_CALLBACK.verbose(a());
        NativeAdListener nativeAdListener = (NativeAdListener) this.f29284b.get();
        if (nativeAdListener != null) {
            nativeAdListener.onAdLoadSuccess(adapterNativeAdData, nativeAdViewBinder);
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdShown() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        NativeAdListener nativeAdListener = (NativeAdListener) this.f29284b.get();
        if (nativeAdListener != null) {
            nativeAdListener.onAdOpened();
        }
    }

    @Override // com.ironsource.mediationsdk.a
    public void a(JSONObject config) {
        kotlin.jvm.internal.n.f(config, "config");
        this.f29283a.destroyNativeAd(config);
    }

    @Override // com.ironsource.mediationsdk.a
    public void a(JSONObject jSONObject, JSONObject jSONObject2, BiddingDataCallback biddingDataCallback) {
        kotlin.jvm.internal.n.f(biddingDataCallback, "biddingDataCallback");
        AbstractAdapter abstractAdapter = this.f29283a;
        kotlin.jvm.internal.n.c(jSONObject);
        abstractAdapter.collectNativeAdBiddingData(jSONObject, jSONObject2, biddingDataCallback);
    }

    private final boolean a(IronSourceError ironSourceError) {
        return ironSourceError != null && ironSourceError.getErrorCode() == 706;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdInitFailed(IronSourceError ironSourceError) {
    }
}
