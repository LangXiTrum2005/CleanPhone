package com.ironsource.mediationsdk.adapter;

import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import java.util.Map;
import kotlin.jvm.internal.n;
import org.json.JSONObject;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractRewardedVideoAdapter<AdNetworkAdapter> extends AbstractAdUnitAdapter<AdNetworkAdapter> implements RewardedVideoAdapterInterface {
    public AbstractRewardedVideoAdapter(AdNetworkAdapter adnetworkadapter) {
        super(adnetworkadapter);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void collectRewardedVideoBiddingData(JSONObject config, JSONObject jSONObject, BiddingDataCallback biddingDataCallback) {
        r rVar;
        n.f(config, "config");
        n.f(biddingDataCallback, "biddingDataCallback");
        Map<String, Object> rewardedVideoBiddingData = getRewardedVideoBiddingData(config, jSONObject);
        if (rewardedVideoBiddingData != null) {
            biddingDataCallback.onSuccess(rewardedVideoBiddingData);
            rVar = r.f53297a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public Map<String, Object> getRewardedVideoBiddingData(JSONObject config, JSONObject jSONObject) {
        n.f(config, "config");
        return null;
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initAndLoadRewardedVideo(String str, String str2, JSONObject config, JSONObject jSONObject, RewardedVideoSmashListener listener) {
        n.f(config, "config");
        n.f(listener, "listener");
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoForDemandOnly(String str, String str2, JSONObject config, RewardedVideoSmashListener listener) {
        n.f(config, "config");
        n.f(listener, "listener");
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoWithCallback(String str, String str2, JSONObject config, RewardedVideoSmashListener listener) {
        n.f(config, "config");
        n.f(listener, "listener");
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public boolean isRewardedVideoAvailable(JSONObject config) {
        n.f(config, "config");
        return false;
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideo(JSONObject config, JSONObject jSONObject, RewardedVideoSmashListener listener) {
        n.f(config, "config");
        n.f(listener, "listener");
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideoForBidding(JSONObject config, JSONObject jSONObject, String str, RewardedVideoSmashListener listener) {
        n.f(config, "config");
        n.f(listener, "listener");
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void showRewardedVideo(JSONObject config, RewardedVideoSmashListener listener) {
        n.f(config, "config");
        n.f(listener, "listener");
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void destroyRewardedVideoAd(JSONObject jSONObject) {
    }
}
