package com.p004ironsource.mediationsdk.adapter;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p004ironsource.d9;
import com.p004ironsource.m5;
import com.p004ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.p004ironsource.mediationsdk.sdk.InterstitialAdapterInterface;
import com.p004ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.p004ironsource.ne;
import com.smartdigimkt.q0.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0002\u0010\u0005J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J,\u0010\u000e\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J,\u0010\u0012\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J,\u0010\u0017\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\tH\u0016J\"\u0010\u001a\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J,\u0010\u001b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u001d\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016¨\u0006\u001e"}, d2 = {"Lcom/ironsource/mediationsdk/adapter/AbstractInterstitialAdapter;", "AdNetworkAdapter", "Lcom/ironsource/mediationsdk/adapter/AbstractAdUnitAdapter;", "Lcom/ironsource/mediationsdk/sdk/InterstitialAdapterInterface;", ne.E1, "(Ljava/lang/Object;)V", "collectInterstitialBiddingData", "", b.i0, "Lorg/json/JSONObject;", "adData", "biddingDataCallback", "Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;", "disposeInterstitialAd", "getInterstitialBiddingData", "", "", "", d9.g.f24679B, "appKey", "userId", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;", "initInterstitialForBidding", "isInterstitialReady", "", d9.g.f24680E, "loadInterstitialForBidding", m5.s, d9.g.H, "mediationsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class AbstractInterstitialAdapter<AdNetworkAdapter> extends AbstractAdUnitAdapter<AdNetworkAdapter> implements InterstitialAdapterInterface {
    public AbstractInterstitialAdapter(AdNetworkAdapter adnetworkadapter) {
        super(adnetworkadapter);
    }

    @Override // com.p004ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void collectInterstitialBiddingData(JSONObject config, JSONObject adData, BiddingDataCallback biddingDataCallback) {
        Intrinsics.f(config, "config");
        Intrinsics.f(biddingDataCallback, "biddingDataCallback");
        Map<String, Object> interstitialBiddingData = getInterstitialBiddingData(config, adData);
        if (interstitialBiddingData != null) {
            biddingDataCallback.onSuccess(interstitialBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void disposeInterstitialAd(JSONObject config) {
    }

    @Override // com.p004ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public Map<String, Object> getInterstitialBiddingData(JSONObject config, JSONObject adData) {
        Intrinsics.f(config, "config");
        return null;
    }

    @Override // com.p004ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void initInterstitial(String appKey, String userId, JSONObject config, InterstitialSmashListener listener) {
        Intrinsics.f(config, "config");
        Intrinsics.f(listener, "listener");
    }

    @Override // com.p004ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void initInterstitialForBidding(String appKey, String userId, JSONObject config, InterstitialSmashListener listener) {
        Intrinsics.f(config, "config");
        Intrinsics.f(listener, "listener");
    }

    @Override // com.p004ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public boolean isInterstitialReady(JSONObject config) {
        Intrinsics.f(config, "config");
        return false;
    }

    @Override // com.p004ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void loadInterstitial(JSONObject config, JSONObject adData, InterstitialSmashListener listener) {
        Intrinsics.f(config, "config");
        Intrinsics.f(listener, "listener");
    }

    @Override // com.p004ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void loadInterstitialForBidding(JSONObject config, JSONObject adData, String serverData, InterstitialSmashListener listener) {
        Intrinsics.f(config, "config");
        Intrinsics.f(listener, "listener");
    }

    @Override // com.p004ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void showInterstitial(JSONObject config, InterstitialSmashListener listener) {
        Intrinsics.f(config, "config");
        Intrinsics.f(listener, "listener");
    }
}
