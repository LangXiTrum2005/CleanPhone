package com.thinkup.core.api;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.thinkup.core.common.n.m;
import com.thinkup.core.common.n.ooo;
import com.thinkup.core.common.on.n0;
import com.thinkup.core.common.ooo.nn;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class TUBaseAdInternalAdapter extends ooo implements ITUBaseAdAdapter, m.o {
    protected static final int BANNER_FORMAT = 2;
    protected static final int INTERSTITIAL_FORMAT = 3;
    protected static final int NATIVE_FORMAT = 0;
    protected static final int REWARDVIDEO_FORMAT = 1;
    protected static final int SPLASH_FORMAT = 4;
    private static final String TAG = "TUBaseAdInternalAdapter";
    private static final String VERSION_INCOMPTUIBLE_ERROR_MSG = "Adapter version and sdk version are incompatible";
    public TUBiddingListener mBiddingListener;
    protected TUEventInterface mDownloadListener;
    protected TUCustomLoadListener mLoadListener;
    private n0 mTrackingInfo;
    protected com.thinkup.core.common.mn.o0.m serverExtraInfo;
    private final ITUBaseAdAdapter mBaseAdAdapterProxy = new com.thinkup.core.common.mn.o.m(this);
    protected String mUserId = "";
    protected String mUserData = "";
    protected String mScenario = "";
    protected int mDismissType = 0;
    protected int mFetchAdTimeout = 10000;
    protected int mRequestNum = 1;
    protected int carouselShowType = 0;

    private void fillParams(Map<String, Object> map) {
        if (getTrackingInfo() != null) {
            nn.o(map, getTrackingInfo().nmm());
        }
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String closeAd() {
        return this.mBaseAdAdapterProxy.closeAd();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public Map<Integer, Class<? extends TUBaseAdAdapter>> getFormatAdapterMap() {
        return null;
    }

    public JSONObject getInnerBidToken(Context context, Map<String, Object> map, Map<String, String> map2) {
        return null;
    }

    public final Map<String, Object> getInternalNetworkInfoMap() {
        return this.mBaseAdAdapterProxy.getNetworkInfoMap();
    }

    public final String getInternalNetworkName() {
        return this.mBaseAdAdapterProxy.getNetworkName();
    }

    public final String getInternalNetworkPlacementId() {
        return this.mBaseAdAdapterProxy.getNetworkPlacementId();
    }

    public final String getInternalNetworkSDKVersion() {
        return this.mBaseAdAdapterProxy.getNetworkSDKVersion();
    }

    public View getMixView() {
        return null;
    }

    @Deprecated
    public final int getMixedFormatAdType() {
        com.thinkup.core.common.mn.o0.m mVar = this.serverExtraInfo;
        if (mVar != null) {
            return mVar.m();
        }
        return -1;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public final com.thinkup.core.common.mn.o0.m getServerExtraInfo() {
        return this.serverExtraInfo;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public final n0 getTrackingInfo() {
        return this.mTrackingInfo;
    }

    public final void internalDestory() {
        this.mBaseAdAdapterProxy.destory();
    }

    public final void internalGetBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) {
        this.mBaseAdAdapterProxy.getBidRequestInfo(context, map, map2, tUBidRequestInfoListener);
    }

    public final boolean internalInitNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        return this.mBaseAdAdapterProxy.initNetworkObjectByPlacementId(context, map, map2);
    }

    public final boolean internalIsAdReady() {
        return this.mBaseAdAdapterProxy.isAdReady();
    }

    public final void internalLoad(Context context, Map<String, Object> map, Map<String, Object> map2, TUCustomLoadListener tUCustomLoadListener) {
        this.mBaseAdAdapterProxy.loadCustomNetworkAd(context, map, map2, tUCustomLoadListener);
    }

    public final boolean internalSetUserDataConsent(Context context, boolean z2, boolean z3) {
        return this.mBaseAdAdapterProxy.setUserDataConsent(context, z2, z3);
    }

    public final void internalShow(Activity activity, ViewGroup viewGroup, TUCommonImpressionListener tUCommonImpressionListener) {
        this.mBaseAdAdapterProxy.internalFormatShow(activity, viewGroup, tUCommonImpressionListener);
    }

    public final boolean internalStartBiddingRequest(Context context, Map<String, Object> map, Map<String, Object> map2, TUBiddingListener tUBiddingListener) {
        boolean zStartBiddingRequest = this.mBaseAdAdapterProxy.startBiddingRequest(context, map, map2, tUBiddingListener);
        if (!zStartBiddingRequest) {
            this.mBiddingListener = null;
        }
        return zStartBiddingRequest;
    }

    public final boolean isMixBanner() {
        com.thinkup.core.common.mn.o0.m mVar = this.serverExtraInfo;
        return mVar != null && mVar.nm();
    }

    public final boolean isMixFormatAd() {
        com.thinkup.core.common.mn.o0.m mVar = this.serverExtraInfo;
        return mVar != null && mVar.mn();
    }

    public final boolean isMixInterstitial() {
        com.thinkup.core.common.mn.o0.m mVar = this.serverExtraInfo;
        return mVar != null && mVar.nn();
    }

    public final boolean isMixNative() {
        com.thinkup.core.common.mn.o0.m mVar = this.serverExtraInfo;
        return mVar != null && mVar.n0();
    }

    public final boolean isMixSplash() {
        com.thinkup.core.common.mn.o0.m mVar = this.serverExtraInfo;
        return mVar != null && mVar.no();
    }

    public final boolean isNativeMixToBanner() {
        com.thinkup.core.common.mn.o0.m mVar;
        return isMixNative() && (mVar = this.serverExtraInfo) != null && mVar.om();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2, TUCustomLoadListener tUCustomLoadListener) {
    }

    public void notifyWLInfo(int i2, Map<String, Object> map) {
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void parseGlobalParams(Map<String, Object> map, Map<String, Object> map2) {
        try {
            fillParams(map);
            if (map2 != null) {
                this.mUserId = map2.get("user_id") != null ? map2.get("user_id").toString() : "";
                this.mUserData = map2.get(TUAdConst.KEY.USER_CUSTOM_DATA) != null ? map2.get(TUAdConst.KEY.USER_CUSTOM_DATA).toString() : "";
            }
            if (map != null) {
                this.serverExtraInfo = new com.thinkup.core.common.mn.o0.m(map);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void setAdDownloadListener(TUEventInterface tUEventInterface) {
        this.mDownloadListener = tUEventInterface;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void setBiddingListener(TUBiddingListener tUBiddingListener) {
        this.mBiddingListener = tUBiddingListener;
    }

    public final void setCarouselShowType(int i2) {
        this.carouselShowType = i2;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void setLoadListener(TUCustomLoadListener tUCustomLoadListener) {
        this.mLoadListener = tUCustomLoadListener;
    }

    public final void setScenario(String str) {
        this.mScenario = str;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public final void setTrackingInfo(n0 n0Var) {
        this.mTrackingInfo = n0Var;
        this.mBaseAdAdapterProxy.setTrackingInfo(n0Var);
    }

    @Deprecated
    public final void thirdPartyLoad(TUBaseAdAdapter tUBaseAdAdapter, Context context, Map<String, Object> map, Map<String, Object> map2) {
        TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
        if (tUCustomLoadListener != null) {
            tUCustomLoadListener.onAdLoadError("", VERSION_INCOMPTUIBLE_ERROR_MSG);
        }
    }

    @Deprecated
    public final boolean thirdPartyStartBiddingRequest(TUBaseAdAdapter tUBaseAdAdapter, Context context, Map<String, Object> map, Map<String, Object> map2, TUBiddingListener tUBiddingListener) {
        if (tUBiddingListener == null) {
            return false;
        }
        tUBiddingListener.onC2SBiddingResultWithCache(TUBiddingResult.fail(VERSION_INCOMPTUIBLE_ERROR_MSG), null);
        return false;
    }
}
