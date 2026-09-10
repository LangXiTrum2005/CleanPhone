package com.p004ironsource.mediationsdk;

import android.view.View;
import android.widget.FrameLayout;
import com.p004ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.p004ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import com.p004ironsource.mediationsdk.sdk.BannerSmashListener;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class j extends AbstractC3370a<BannerAdListener> implements BannerSmashListener {
    public j(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, UUID uuid) {
        super(abstractAdapter, networkSettings, IronSource.AD_UNIT.BANNER, uuid);
    }

    @Override // com.p004ironsource.mediationsdk.AbstractC3370a
    public void a(JSONObject jSONObject) {
        this.f25732a.destroyBanner(jSONObject);
    }

    @Override // com.p004ironsource.mediationsdk.AbstractC3370a
    public IronSource.AD_UNIT b() {
        return IronSource.AD_UNIT.BANNER;
    }

    @Override // com.p004ironsource.mediationsdk.AbstractC3370a
    public void d(JSONObject jSONObject) {
        this.f25732a.onBannerViewBound(jSONObject);
    }

    @Override // com.p004ironsource.mediationsdk.AbstractC3370a
    public void e(JSONObject jSONObject) {
        this.f25732a.onBannerViewWillBind(jSONObject);
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f25733b.get() != null) {
            ((BannerAdListener) this.f25733b.get()).onAdClicked();
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLeftApplication() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f25733b.get() != null) {
            ((BannerAdListener) this.f25733b.get()).onAdLeftApplication();
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose(a("error = " + ironSourceError));
        if (this.f25733b.get() != null) {
            ((BannerAdListener) this.f25733b.get()).onAdLoadFailed(a(ironSourceError) ? AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL : AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f25733b.get() != null) {
            ((BannerAdListener) this.f25733b.get()).onAdLoadSuccess(view, layoutParams);
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenDismissed() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f25733b.get() != null) {
            ((BannerAdListener) this.f25733b.get()).onAdScreenDismissed();
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenPresented() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f25733b.get() != null) {
            ((BannerAdListener) this.f25733b.get()).onAdScreenPresented();
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f25733b.get() != null) {
            ((BannerAdListener) this.f25733b.get()).onAdOpened();
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitFailed(IronSourceError ironSourceError) {
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitSuccess() {
    }

    @Override // com.p004ironsource.mediationsdk.AbstractC3370a
    public void a(JSONObject jSONObject, JSONObject jSONObject2, AdData adData) {
        Integer num = adData.getInt("instanceType");
        IronSourceBannerLayout ironSourceBannerLayout = (IronSourceBannerLayout) adData.getAdUnitData().get("bannerLayout");
        if (num == null || num.intValue() != 1) {
            this.f25732a.loadBannerForBidding(jSONObject, jSONObject2, adData.getServerData(), ironSourceBannerLayout, this);
        } else {
            this.f25732a.loadBanner(jSONObject, jSONObject2, ironSourceBannerLayout, this);
        }
    }

    @Override // com.p004ironsource.mediationsdk.AbstractC3370a
    public void a(JSONObject jSONObject, JSONObject jSONObject2, BiddingDataCallback biddingDataCallback) {
        this.f25732a.collectBannerBiddingData(jSONObject, jSONObject2, biddingDataCallback);
    }

    public boolean a(IronSourceError ironSourceError) {
        return ironSourceError.getErrorCode() == 606;
    }
}
