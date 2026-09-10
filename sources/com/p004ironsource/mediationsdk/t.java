package com.p004ironsource.mediationsdk;

import com.p004ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.p004ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.p004ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.p004ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import com.p004ironsource.ne;
import com.p004ironsource.xs;
import com.smartdigimkt.q0.b;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003B#\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J \u0010\u0007\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0014J\u0010\u0010\u0007\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0014J$\u0010\u0007\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014J\b\u0010\u0010\u001a\u00020\rH\u0016J\u0012\u0010\u0011\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0012\u0010\u0017\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0018\u001a\u00020\rH\u0016J\b\u0010\u0019\u001a\u00020\rH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0014¨\u0006$"}, d2 = {"Lcom/ironsource/mediationsdk/t;", "Lcom/ironsource/mediationsdk/a;", "Lcom/ironsource/mediationsdk/adunit/adapter/listener/NativeAdListener;", "Lcom/ironsource/mediationsdk/ads/nativead/interfaces/NativeAdSmashListener;", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "", "a", "Lorg/json/JSONObject;", b.i0, "adUnitData", "Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdData;", "adData", "", "Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;", "biddingDataCallback", "onNativeAdInitSuccess", "onNativeAdInitFailed", "Lcom/ironsource/mediationsdk/ads/nativead/AdapterNativeAdData;", "adapterNativeAdData", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/nativead/AdapterNativeAdViewBinder;", "nativeAdViewBinder", "onNativeAdLoaded", "onNativeAdLoadFailed", "onNativeAdShown", "onNativeAdClicked", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "b", "Lcom/ironsource/mediationsdk/AbstractAdapter;", ne.E1, "Lcom/ironsource/mediationsdk/model/NetworkSettings;", xs.f27731b, "Ljava/util/UUID;", "adUnitObjectId", "<init>", "(Lcom/ironsource/mediationsdk/AbstractAdapter;Lcom/ironsource/mediationsdk/model/NetworkSettings;Ljava/util/UUID;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class t extends AbstractC3370a<NativeAdListener> implements NativeAdSmashListener {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, UUID adUnitObjectId) {
        super(abstractAdapter, networkSettings, IronSource.AD_UNIT.NATIVE_AD, adUnitObjectId);
        Intrinsics.f(adUnitObjectId, "adUnitObjectId");
    }

    @Override // com.p004ironsource.mediationsdk.AbstractC3370a
    public void a(JSONObject config) {
        Intrinsics.f(config, "config");
        this.f25732a.destroyNativeAd(config);
    }

    @Override // com.p004ironsource.mediationsdk.AbstractC3370a
    public IronSource.AD_UNIT b() {
        return IronSource.AD_UNIT.NATIVE_AD;
    }

    @Override // com.p004ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        NativeAdListener nativeAdListener = (NativeAdListener) this.f25733b.get();
        if (nativeAdListener != null) {
            nativeAdListener.onAdClicked();
        }
    }

    @Override // com.p004ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdInitFailed(IronSourceError error) {
    }

    @Override // com.p004ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdInitSuccess() {
    }

    @Override // com.p004ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdLoadFailed(IronSourceError error) {
        IronLog.ADAPTER_CALLBACK.verbose(a("error = " + error));
        int errorCode = error != null ? error.getErrorCode() : 1000;
        String errorMessage = error != null ? error.getErrorMessage() : null;
        if (errorMessage == null) {
            errorMessage = "";
        }
        if (this.f25733b.get() != null) {
            AdapterErrorType adapterErrorType = a(error) ? AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL : AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL;
            NativeAdListener nativeAdListener = (NativeAdListener) this.f25733b.get();
            if (nativeAdListener != null) {
                nativeAdListener.onAdLoadFailed(adapterErrorType, errorCode, errorMessage);
            }
        }
    }

    @Override // com.p004ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdLoaded(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder) {
        Intrinsics.f(adapterNativeAdData, "adapterNativeAdData");
        Intrinsics.f(nativeAdViewBinder, "nativeAdViewBinder");
        IronLog.ADAPTER_CALLBACK.verbose(a());
        NativeAdListener nativeAdListener = (NativeAdListener) this.f25733b.get();
        if (nativeAdListener != null) {
            nativeAdListener.onAdLoadSuccess(adapterNativeAdData, nativeAdViewBinder);
        }
    }

    @Override // com.p004ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdShown() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        NativeAdListener nativeAdListener = (NativeAdListener) this.f25733b.get();
        if (nativeAdListener != null) {
            nativeAdListener.onAdOpened();
        }
    }

    @Override // com.p004ironsource.mediationsdk.AbstractC3370a
    public void a(JSONObject config, JSONObject adUnitData, AdData adData) {
        Intrinsics.f(config, "config");
        Intrinsics.f(adUnitData, "adUnitData");
        Intrinsics.f(adData, "adData");
        Integer num = adData.getInt("instanceType");
        if (num == null || num.intValue() != 1) {
            this.f25732a.loadNativeAdForBidding(config, adUnitData, adData.getServerData(), this);
        } else {
            this.f25732a.loadNativeAd(config, adUnitData, this);
        }
    }

    @Override // com.p004ironsource.mediationsdk.AbstractC3370a
    public void a(JSONObject config, JSONObject adData, BiddingDataCallback biddingDataCallback) {
        Intrinsics.f(biddingDataCallback, "biddingDataCallback");
        AbstractAdapter abstractAdapter = this.f25732a;
        Intrinsics.c(config);
        abstractAdapter.collectNativeAdBiddingData(config, adData, biddingDataCallback);
    }

    private final boolean a(IronSourceError error) {
        return error != null && error.getErrorCode() == 706;
    }
}
