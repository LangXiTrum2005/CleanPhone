package com.p004ironsource.mediationsdk.sdk;

import com.p004ironsource.mediationsdk.bidding.BiddingDataCallback;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public interface RewardedVideoAdapterInterface extends AdUnitAdapterInterface {
    void collectRewardedVideoBiddingData(JSONObject jSONObject, JSONObject jSONObject2, BiddingDataCallback biddingDataCallback);

    void disposeRewardedVideoAd(JSONObject jSONObject);

    Map<String, Object> getRewardedVideoBiddingData(JSONObject jSONObject, JSONObject jSONObject2);

    void initAndLoadRewardedVideo(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, RewardedVideoSmashListener rewardedVideoSmashListener);

    void initRewardedVideoForDemandOnly(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener);

    void initRewardedVideoWithCallback(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener);

    boolean isRewardedVideoAvailable(JSONObject jSONObject);

    void loadRewardedVideo(JSONObject jSONObject, JSONObject jSONObject2, RewardedVideoSmashListener rewardedVideoSmashListener);

    void loadRewardedVideoForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, RewardedVideoSmashListener rewardedVideoSmashListener);

    void showRewardedVideo(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener);
}
