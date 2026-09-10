package com.ironsource.mediationsdk.ads.nativead.interfaces;

import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.sdk.AdUnitAdapterInterface;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface NativeAdAdapterInterface extends AdUnitAdapterInterface {
    void collectNativeAdBiddingData(JSONObject jSONObject, JSONObject jSONObject2, BiddingDataCallback biddingDataCallback);

    void destroyNativeAd(JSONObject jSONObject);

    Map<String, Object> getNativeAdBiddingData(JSONObject jSONObject, JSONObject jSONObject2);

    void initNativeAdForBidding(String str, String str2, JSONObject jSONObject, NativeAdSmashListener nativeAdSmashListener);

    void initNativeAds(String str, String str2, JSONObject jSONObject, NativeAdSmashListener nativeAdSmashListener);

    void loadNativeAd(JSONObject jSONObject, JSONObject jSONObject2, NativeAdSmashListener nativeAdSmashListener);

    void loadNativeAdForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, NativeAdSmashListener nativeAdSmashListener);
}
