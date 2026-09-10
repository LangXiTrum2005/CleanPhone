package com.ironsource.mediationsdk.adapter;

import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.sdk.BannerAdapterInterface;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import java.util.Map;
import kotlin.jvm.internal.n;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBannerAdapter<AdNetworkAdapter> extends AbstractAdUnitAdapter<AdNetworkAdapter> implements BannerAdapterInterface {
    public AbstractBannerAdapter(AdNetworkAdapter adnetworkadapter) {
        super(adnetworkadapter);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void collectBannerBiddingData(JSONObject config, JSONObject jSONObject, BiddingDataCallback biddingDataCallback) {
        n.f(config, "config");
        n.f(biddingDataCallback, "biddingDataCallback");
        Map<String, Object> bannerBiddingData = getBannerBiddingData(config, jSONObject);
        if (bannerBiddingData != null) {
            biddingDataCallback.onSuccess(bannerBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void destroyBanner(JSONObject config) {
        n.f(config, "config");
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public int getAdaptiveHeight(int i10) {
        return -1;
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public Map<String, Object> getBannerBiddingData(JSONObject config, JSONObject jSONObject) {
        n.f(config, "config");
        return null;
    }

    public LoadWhileShowSupportState getBannerLoadWhileShowSupportState(JSONObject jSONObject) {
        return LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void initBannerForBidding(String str, String str2, JSONObject config, BannerSmashListener listener) {
        n.f(config, "config");
        n.f(listener, "listener");
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void initBanners(String str, String str2, JSONObject config, BannerSmashListener listener) {
        n.f(config, "config");
        n.f(listener, "listener");
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBanner(JSONObject config, JSONObject jSONObject, ISBannerSize iSBannerSize, BannerSmashListener listener) {
        n.f(config, "config");
        n.f(listener, "listener");
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBannerForBidding(JSONObject config, JSONObject jSONObject, String str, ISBannerSize iSBannerSize, BannerSmashListener listener) {
        n.f(config, "config");
        n.f(listener, "listener");
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBannerForDemandOnlyForBidding(JSONObject config, String str, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, BannerSmashListener listener) {
        n.f(config, "config");
        n.f(listener, "listener");
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void onBannerViewBound(JSONObject config) {
        n.f(config, "config");
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void onBannerViewWillBind(JSONObject config) {
        n.f(config, "config");
    }
}
