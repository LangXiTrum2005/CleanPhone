package com.p004ironsource.mediationsdk;

import com.p004ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.p004ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class z extends AbstractC3370a<RewardedVideoAdListener> implements RewardedVideoSmashListener {
    public z(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, UUID uuid) {
        super(abstractAdapter, networkSettings, IronSource.AD_UNIT.REWARDED_VIDEO, uuid);
    }

    @Override // com.p004ironsource.mediationsdk.AbstractC3370a
    public void a(JSONObject jSONObject, JSONObject jSONObject2, AdData adData) {
        Integer num = adData.getInt("instanceType");
        if (num == null || num.intValue() != 1) {
            this.f25732a.loadRewardedVideoForBidding(jSONObject, jSONObject2, adData.getServerData(), this);
        } else {
            this.f25732a.loadRewardedVideo(jSONObject, jSONObject2, this);
        }
    }

    @Override // com.p004ironsource.mediationsdk.AbstractC3370a
    public IronSource.AD_UNIT b() {
        return IronSource.AD_UNIT.REWARDED_VIDEO;
    }

    @Override // com.p004ironsource.mediationsdk.AbstractC3370a
    public boolean c(JSONObject jSONObject) {
        return this.f25732a.isRewardedVideoAvailable(jSONObject);
    }

    @Override // com.p004ironsource.mediationsdk.AbstractC3370a
    public void f(JSONObject jSONObject) {
        this.f25732a.showRewardedVideo(jSONObject, this);
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f25733b.get() != null) {
            ((RewardedVideoAdListener) this.f25733b.get()).onAdClicked();
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f25733b.get() != null) {
            ((RewardedVideoAdListener) this.f25733b.get()).onAdClosed();
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdEnded() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f25733b.get() != null) {
            ((RewardedVideoAdListener) this.f25733b.get()).onAdEnded();
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f25733b.get() != null) {
            ((RewardedVideoAdListener) this.f25733b.get()).onAdOpened();
            ((RewardedVideoAdListener) this.f25733b.get()).onAdShowSuccess();
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdRewarded() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f25733b.get() != null) {
            ((RewardedVideoAdListener) this.f25733b.get()).onAdRewarded();
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose(a("error = " + ironSourceError));
        if (this.f25733b.get() != null) {
            ((RewardedVideoAdListener) this.f25733b.get()).onAdShowFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdStarted() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f25733b.get() != null) {
            ((RewardedVideoAdListener) this.f25733b.get()).onAdStarted();
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdVisible() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f25733b.get() != null) {
            ((RewardedVideoAdListener) this.f25733b.get()).onAdVisible();
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAvailabilityChanged(boolean z2) {
        IronLog.INTERNAL.verbose(a("available = " + z2));
        if (this.f25733b.get() != null) {
            if (z2) {
                ((RewardedVideoAdListener) this.f25733b.get()).onAdLoadSuccess();
            } else {
                ((RewardedVideoAdListener) this.f25733b.get()).onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, "");
            }
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitSuccess() {
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        AdapterErrorType adapterErrorType;
        IronLog.ADAPTER_CALLBACK.verbose(a("error = " + ironSourceError));
        if (this.f25733b.get() != null) {
            if (b(ironSourceError)) {
                adapterErrorType = AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL;
            } else {
                adapterErrorType = a(ironSourceError) ? AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED : AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL;
            }
            ((RewardedVideoAdListener) this.f25733b.get()).onAdLoadFailed(adapterErrorType, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f25733b.get() != null) {
            ((RewardedVideoAdListener) this.f25733b.get()).onAdLoadSuccess();
        }
    }

    @Override // com.p004ironsource.mediationsdk.AbstractC3370a
    public void a(JSONObject jSONObject, JSONObject jSONObject2, BiddingDataCallback biddingDataCallback) {
        this.f25732a.collectRewardedVideoBiddingData(jSONObject, jSONObject2, biddingDataCallback);
    }

    @Override // com.p004ironsource.mediationsdk.AbstractC3370a
    public void b(JSONObject jSONObject) {
        this.f25732a.disposeRewardedVideoAd(jSONObject);
    }

    private boolean a(IronSourceError ironSourceError) {
        return ironSourceError.getErrorCode() == 1057;
    }

    public boolean b(IronSourceError ironSourceError) {
        return ironSourceError.getErrorCode() == 1058;
    }
}
