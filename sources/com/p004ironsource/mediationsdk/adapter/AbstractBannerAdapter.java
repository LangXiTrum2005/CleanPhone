package com.p004ironsource.mediationsdk.adapter;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p004ironsource.d9;
import com.p004ironsource.m5;
import com.p004ironsource.mediationsdk.IronSourceBannerLayout;
import com.p004ironsource.mediationsdk.LoadWhileShowSupportState;
import com.p004ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.p004ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.p004ironsource.mediationsdk.sdk.BannerAdapterInterface;
import com.p004ironsource.mediationsdk.sdk.BannerSmashListener;
import com.p004ironsource.ne;
import com.smartdigimkt.q0.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0002\u0010\u0005J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J,\u0010\u0011\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\tH\u0016J,\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u00132\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J,\u0010\u001d\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u00132\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J*\u0010\u001e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J4\u0010!\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\"\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J,\u0010#\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010\u00132\b\u0010\u001f\u001a\u0004\u0018\u00010$2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010%\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010&\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006'"}, d2 = {"Lcom/ironsource/mediationsdk/adapter/AbstractBannerAdapter;", "AdNetworkAdapter", "Lcom/ironsource/mediationsdk/adapter/AbstractAdUnitAdapter;", "Lcom/ironsource/mediationsdk/sdk/BannerAdapterInterface;", ne.E1, "(Ljava/lang/Object;)V", "collectBannerBiddingData", "", b.i0, "Lorg/json/JSONObject;", "adData", "biddingDataCallback", "Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;", d9.g.S, "getAdaptiveHeight", "", "width", "getBannerBiddingData", "", "", "", "getBannerLoadWhileShowSupportState", "Lcom/ironsource/mediationsdk/LoadWhileShowSupportState;", "adUnitSettings", "initBannerForBidding", "appKey", "userId", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;", "initBanners", d9.g.f24684N, "banner", "Lcom/ironsource/mediationsdk/IronSourceBannerLayout;", "loadBannerForBidding", m5.s, "loadBannerForDemandOnlyForBidding", "Lcom/ironsource/mediationsdk/demandOnly/ISDemandOnlyBannerLayout;", "onBannerViewBound", "onBannerViewWillBind", "mediationsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class AbstractBannerAdapter<AdNetworkAdapter> extends AbstractAdUnitAdapter<AdNetworkAdapter> implements BannerAdapterInterface {
    public AbstractBannerAdapter(AdNetworkAdapter adnetworkadapter) {
        super(adnetworkadapter);
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void collectBannerBiddingData(JSONObject config, JSONObject adData, BiddingDataCallback biddingDataCallback) {
        Intrinsics.f(config, "config");
        Intrinsics.f(biddingDataCallback, "biddingDataCallback");
        Map<String, Object> bannerBiddingData = getBannerBiddingData(config, adData);
        if (bannerBiddingData != null) {
            biddingDataCallback.onSuccess(bannerBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void destroyBanner(JSONObject config) {
        Intrinsics.f(config, "config");
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerAdapterInterface
    public int getAdaptiveHeight(int width) {
        return -1;
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerAdapterInterface
    public Map<String, Object> getBannerBiddingData(JSONObject config, JSONObject adData) {
        Intrinsics.f(config, "config");
        return null;
    }

    public LoadWhileShowSupportState getBannerLoadWhileShowSupportState(JSONObject adUnitSettings) {
        return LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void initBannerForBidding(String appKey, String userId, JSONObject config, BannerSmashListener listener) {
        Intrinsics.f(config, "config");
        Intrinsics.f(listener, "listener");
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void initBanners(String appKey, String userId, JSONObject config, BannerSmashListener listener) {
        Intrinsics.f(config, "config");
        Intrinsics.f(listener, "listener");
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBanner(JSONObject config, JSONObject adData, IronSourceBannerLayout banner, BannerSmashListener listener) {
        Intrinsics.f(config, "config");
        Intrinsics.f(banner, "banner");
        Intrinsics.f(listener, "listener");
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBannerForBidding(JSONObject config, JSONObject adData, String serverData, IronSourceBannerLayout banner, BannerSmashListener listener) {
        Intrinsics.f(config, "config");
        Intrinsics.f(banner, "banner");
        Intrinsics.f(listener, "listener");
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBannerForDemandOnlyForBidding(JSONObject config, String serverData, ISDemandOnlyBannerLayout banner, BannerSmashListener listener) {
        Intrinsics.f(config, "config");
        Intrinsics.f(listener, "listener");
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void onBannerViewBound(JSONObject config) {
        Intrinsics.f(config, "config");
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void onBannerViewWillBind(JSONObject config) {
        Intrinsics.f(config, "config");
    }
}
