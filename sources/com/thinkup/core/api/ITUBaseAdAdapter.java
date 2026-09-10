package com.thinkup.core.api;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.thinkup.core.common.mn.o0.m;
import com.thinkup.core.common.on.n0;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface ITUBaseAdAdapter {
    String closeAd();

    void destory();

    void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener);

    Map<Integer, Class<? extends TUBaseAdAdapter>> getFormatAdapterMap();

    View getMixView();

    Map<String, Object> getNetworkInfoMap();

    String getNetworkName();

    String getNetworkPlacementId();

    String getNetworkSDKVersion();

    m getServerExtraInfo();

    n0 getTrackingInfo();

    boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2);

    void internalFormatShow(Activity activity, ViewGroup viewGroup, TUCommonImpressionListener tUCommonImpressionListener);

    boolean isAdReady();

    void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2);

    void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2, TUCustomLoadListener tUCustomLoadListener);

    void parseGlobalParams(Map<String, Object> map, Map<String, Object> map2);

    void setBiddingListener(TUBiddingListener tUBiddingListener);

    void setLoadListener(TUCustomLoadListener tUCustomLoadListener);

    void setTrackingInfo(n0 n0Var);

    boolean setUserDataConsent(Context context, boolean z2, boolean z3);

    boolean startBiddingRequest(Context context, Map<String, Object> map, Map<String, Object> map2, TUBiddingListener tUBiddingListener);

    boolean supportImpressionCallback();
}
