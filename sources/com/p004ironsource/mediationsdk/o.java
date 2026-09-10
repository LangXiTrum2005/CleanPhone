package com.p004ironsource.mediationsdk;

import com.p004ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.p004ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import com.p004ironsource.mediationsdk.sdk.InterstitialSmashListener;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class o extends AbstractC3370a<InterstitialAdListener> implements InterstitialSmashListener {
    public o(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, UUID uuid) {
        super(abstractAdapter, networkSettings, IronSource.AD_UNIT.INTERSTITIAL, uuid);
    }

    @Override // com.p004ironsource.mediationsdk.AbstractC3370a
    public void a(JSONObject jSONObject, JSONObject jSONObject2, AdData adData) {
        Integer num = adData.getInt("instanceType");
        if (num == null || num.intValue() != 1) {
            this.f25732a.loadInterstitialForBidding(jSONObject, jSONObject2, adData.getServerData(), this);
        } else {
            this.f25732a.loadInterstitial(jSONObject, jSONObject2, this);
        }
    }

    @Override // com.p004ironsource.mediationsdk.AbstractC3370a
    public IronSource.AD_UNIT b() {
        return IronSource.AD_UNIT.INTERSTITIAL;
    }

    @Override // com.p004ironsource.mediationsdk.AbstractC3370a
    public boolean c(JSONObject jSONObject) {
        return this.f25732a.isInterstitialReady(jSONObject);
    }

    @Override // com.p004ironsource.mediationsdk.AbstractC3370a
    public void f(JSONObject jSONObject) {
        this.f25732a.showInterstitial(jSONObject, this);
    }

    @Override // com.p004ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f25733b.get() != null) {
            ((InterstitialAdListener) this.f25733b.get()).onAdClicked();
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f25733b.get() != null) {
            ((InterstitialAdListener) this.f25733b.get()).onAdClosed();
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose(a("error = " + ironSourceError));
        if (this.f25733b.get() != null) {
            ((InterstitialAdListener) this.f25733b.get()).onAdLoadFailed(a(ironSourceError) ? AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL : AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f25733b.get() != null) {
            ((InterstitialAdListener) this.f25733b.get()).onAdOpened();
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdReady() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f25733b.get() != null) {
            ((InterstitialAdListener) this.f25733b.get()).onAdLoadSuccess();
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose(a("error = " + ironSourceError));
        if (this.f25733b.get() != null) {
            ((InterstitialAdListener) this.f25733b.get()).onAdShowFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowSucceeded() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f25733b.get() != null) {
            ((InterstitialAdListener) this.f25733b.get()).onAdShowSuccess();
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdVisible() {
    }

    @Override // com.p004ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitFailed(IronSourceError ironSourceError) {
    }

    @Override // com.p004ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitSuccess() {
    }

    @Override // com.p004ironsource.mediationsdk.AbstractC3370a
    public void a(JSONObject jSONObject, JSONObject jSONObject2, BiddingDataCallback biddingDataCallback) {
        this.f25732a.collectInterstitialBiddingData(jSONObject, jSONObject2, biddingDataCallback);
    }

    @Override // com.p004ironsource.mediationsdk.AbstractC3370a
    public void b(JSONObject jSONObject) {
        this.f25732a.disposeInterstitialAd(jSONObject);
    }

    public boolean a(IronSourceError ironSourceError) {
        return ironSourceError.getErrorCode() == 1158;
    }
}
