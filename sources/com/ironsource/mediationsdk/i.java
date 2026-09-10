package com.ironsource.mediationsdk;

import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.K2;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class i extends a<BannerAdListener> implements BannerSmashListener {
    public i(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, UUID uuid) {
        super(abstractAdapter, networkSettings, IronSource.a.BANNER, uuid);
    }

    @Override // com.ironsource.mediationsdk.a
    public void a(JSONObject jSONObject, JSONObject jSONObject2, AdData adData) {
        Integer num = adData.getInt("instanceType");
        o oVar = (o) adData.getAdUnitData().get(K2.f26381t);
        if (oVar == null) {
            IronLog.INTERNAL.error(a("Banner layout is null, cannot load banner ad"));
            if (this.f29284b.get() != null) {
                ((BannerAdListener) this.f29284b.get()).onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, IronSourceError.ERROR_BN_LOAD_NO_CONFIG, "Banner layout is null");
                return;
            }
            return;
        }
        if (num == null || num.intValue() != 1) {
            this.f29283a.loadBannerForBidding(jSONObject, jSONObject2, adData.getServerData(), oVar.getSize(), this);
        } else {
            this.f29283a.loadBanner(jSONObject, jSONObject2, oVar.getSize(), this);
        }
    }

    @Override // com.ironsource.mediationsdk.a
    public IronSource.a b() {
        return IronSource.a.BANNER;
    }

    @Override // com.ironsource.mediationsdk.a
    public void c(JSONObject jSONObject) {
        this.f29283a.onBannerViewBound(jSONObject);
    }

    @Override // com.ironsource.mediationsdk.a
    public void d(JSONObject jSONObject) {
        this.f29283a.onBannerViewWillBind(jSONObject);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f29284b.get() != null) {
            ((BannerAdListener) this.f29284b.get()).onAdClicked();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLeftApplication() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f29284b.get() != null) {
            ((BannerAdListener) this.f29284b.get()).onAdLeftApplication();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose(a("error = " + ironSourceError));
        if (this.f29284b.get() != null) {
            ((BannerAdListener) this.f29284b.get()).onAdLoadFailed(a(ironSourceError) ? AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL : AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        onBannerAdLoaded(view, layoutParams, new HashMap());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenDismissed() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f29284b.get() != null) {
            ((BannerAdListener) this.f29284b.get()).onAdScreenDismissed();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenPresented() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f29284b.get() != null) {
            ((BannerAdListener) this.f29284b.get()).onAdScreenPresented();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown() {
        onBannerAdShown(new HashMap());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams, Map<String, Object> map) {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f29284b.get() != null) {
            ((BannerAdListener) this.f29284b.get()).onAdLoadSuccess(view, layoutParams, map);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown(Map<String, Object> map) {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f29284b.get() != null) {
            ((BannerAdListener) this.f29284b.get()).onAdOpened(map);
        }
    }

    @Override // com.ironsource.mediationsdk.a
    public void a(JSONObject jSONObject) {
        this.f29283a.destroyBanner(jSONObject);
    }

    @Override // com.ironsource.mediationsdk.a
    public void a(JSONObject jSONObject, JSONObject jSONObject2, BiddingDataCallback biddingDataCallback) {
        this.f29283a.collectBannerBiddingData(jSONObject, jSONObject2, biddingDataCallback);
    }

    public boolean a(IronSourceError ironSourceError) {
        return ironSourceError.getErrorCode() == 606;
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitFailed(IronSourceError ironSourceError) {
    }
}
