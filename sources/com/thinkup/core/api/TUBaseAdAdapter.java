package com.thinkup.core.api;

import android.app.Activity;
import android.content.Context;
import android.support.v4.media.a;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.thinkup.core.common.mn.o0.m;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class TUBaseAdAdapter extends TUBaseAdInternalAdapter {
    private void cleanLoadListener() {
        this.mBiddingListener = null;
        this.mLoadListener = null;
    }

    public String getAdCustomExt() {
        m mVar = this.serverExtraInfo;
        return mVar != null ? mVar.o0() : "";
    }

    public Map<String, Object> getAdExtraInfoMap() {
        return null;
    }

    public BaseAd getBaseAdObject(Context context) {
        return null;
    }

    public MediationBidManager getBidManager() {
        return null;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) {
        if (tUBidRequestInfoListener != null) {
            tUBidRequestInfoListener.onFailed(TUBidRequestInfo.NO_SUPPORT_BIDDING_TYPE);
        }
    }

    public final int getDismissType() {
        return this.mDismissType;
    }

    public String getILRD() {
        return null;
    }

    public TUInitMediation getMediationInitManager() {
        return null;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return null;
    }

    public final String getUserCustomData() {
        return this.mUserData;
    }

    public final String getUserId() {
        return this.mUserId;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        return false;
    }

    public void internalFormatShow(Activity activity, ViewGroup viewGroup, TUCommonImpressionListener tUCommonImpressionListener) {
    }

    public final void notifyATLoadFail(String str, String str2) {
        if (this.mBiddingListener != null) {
            this.mBiddingListener.onC2SBiddingResultWithCache(TUBiddingResult.fail(!TextUtils.isEmpty(str) ? a.D(str, com.smartdigimkt.b0.a.U1, str2) : str2), null);
        }
        TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
        if (tUCustomLoadListener != null) {
            tUCustomLoadListener.onAdLoadError(str, str2);
        }
    }

    @Override // com.thinkup.core.common.n.m.o
    public void onCreate(Activity activity) {
    }

    @Override // com.thinkup.core.common.n.m.o
    public void onDestroy(Activity activity) {
    }

    @Override // com.thinkup.core.common.n.m.o
    public void onPause(Activity activity) {
    }

    @Override // com.thinkup.core.common.n.m.o
    public void onResume(Activity activity) {
    }

    @Override // com.thinkup.core.common.n.m.o
    public void onStart(Activity activity) {
    }

    @Override // com.thinkup.core.common.n.m.o
    public void onStop(Activity activity) {
    }

    public void releaseLoadResource() {
        cleanLoadListener();
    }

    public final void setFetchAdTimeout(int i2) {
        this.mFetchAdTimeout = i2;
    }

    public final void setRequestNum(int i2) {
        if (i2 > 0) {
            this.mRequestNum = i2;
        }
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return false;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public boolean startBiddingRequest(Context context, Map<String, Object> map, Map<String, Object> map2, TUBiddingListener tUBiddingListener) {
        return false;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public boolean supportImpressionCallback() {
        return true;
    }

    public final void notifyATLoadFail(String str, String str2, TUBiddingNotice tUBiddingNotice, TUAdConst.CURRENCY currency) {
        if (this.mBiddingListener != null) {
            this.mBiddingListener.onC2SBiddingResultWithCache(TUBiddingResult.fail(!TextUtils.isEmpty(str) ? a.D(str, com.smartdigimkt.b0.a.U1, str2) : str2, tUBiddingNotice, currency), null);
        }
        TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
        if (tUCustomLoadListener != null) {
            tUCustomLoadListener.onAdLoadError(str, str2);
        }
    }
}
