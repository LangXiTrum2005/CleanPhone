package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class n extends a<InterstitialAdListener> implements InterstitialSmashListener {
    public n(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, UUID uuid) {
        super(abstractAdapter, networkSettings, IronSource.a.INTERSTITIAL, uuid);
    }

    @Override // com.ironsource.mediationsdk.a
    public void a(JSONObject jSONObject, JSONObject jSONObject2, AdData adData) {
        Integer num = adData.getInt("instanceType");
        if (num == null || num.intValue() != 1) {
            this.f29283a.loadInterstitialForBidding(jSONObject, jSONObject2, adData.getServerData(), this);
        } else {
            this.f29283a.loadInterstitial(jSONObject, jSONObject2, this);
        }
    }

    @Override // com.ironsource.mediationsdk.a
    public boolean b(JSONObject jSONObject) {
        return this.f29283a.isInterstitialReady(jSONObject);
    }

    @Override // com.ironsource.mediationsdk.a
    public void e(JSONObject jSONObject) {
        this.f29283a.showInterstitial(jSONObject, this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f29284b.get() != null) {
            ((InterstitialAdListener) this.f29284b.get()).onAdClicked();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f29284b.get() != null) {
            ((InterstitialAdListener) this.f29284b.get()).onAdClosed();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose(a("error = " + ironSourceError));
        if (this.f29284b.get() != null) {
            ((InterstitialAdListener) this.f29284b.get()).onAdLoadFailed(a(ironSourceError) ? AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL : AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdOpened() {
        onInterstitialAdOpened(new HashMap());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdReady() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f29284b.get() != null) {
            ((InterstitialAdListener) this.f29284b.get()).onAdLoadSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose(a("error = " + ironSourceError));
        if (this.f29284b.get() != null) {
            ((InterstitialAdListener) this.f29284b.get()).onAdShowFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowSucceeded() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
    }

    @Override // com.ironsource.mediationsdk.a
    public IronSource.a b() {
        return IronSource.a.INTERSTITIAL;
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdOpened(Map<String, Object> map) {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f29284b.get() != null) {
            ((InterstitialAdListener) this.f29284b.get()).onAdOpened(map);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowSucceeded(Map<String, Object> map) {
        IronLog.ADAPTER_CALLBACK.verbose(a());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdReady(Map<String, Object> map) {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f29284b.get() != null) {
            ((InterstitialAdListener) this.f29284b.get()).onAdLoadSuccess(map);
        }
    }

    @Override // com.ironsource.mediationsdk.a
    public void a(JSONObject jSONObject, JSONObject jSONObject2, BiddingDataCallback biddingDataCallback) {
        this.f29283a.collectInterstitialBiddingData(jSONObject, jSONObject2, biddingDataCallback);
    }

    @Override // com.ironsource.mediationsdk.a
    public void a(JSONObject jSONObject) {
        this.f29283a.destroyInterstitialAd(jSONObject);
    }

    public boolean a(IronSourceError ironSourceError) {
        return ironSourceError.getErrorCode() == 1158;
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdVisible() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitFailed(IronSourceError ironSourceError) {
    }
}
