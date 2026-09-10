package com.thinkup.nativead.unitgroup;

import android.content.Context;
import android.view.View;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.ITUAdvertiserInfoOperate;
import com.thinkup.core.api.TUCompViewListener;
import com.thinkup.core.api.TUEventInterface;
import com.thinkup.core.api.TUNetworkConfirmInfo;
import com.thinkup.core.api.TUShakeViewListener;
import com.thinkup.core.common.n.nm;
import com.thinkup.core.common.n.nn;
import com.thinkup.core.common.on.n0;
import com.thinkup.nativead.api.TUNativePrepareInfo;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class o extends BaseAd {
    private static final String TAG = "o";
    protected n0 mAdTrackingInfo;
    protected TUEventInterface mDownloadListener;
    private nm mNativeEventListener;
    private TUNativePrepareInfo nativePrepareInfo;
    public final int NETWORK_UNKNOW = -1;
    protected String mAdSourceType = "0";
    protected int mNetworkType = -1;

    public abstract void bindDislikeListener(View.OnClickListener onClickListener);

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public abstract View getAdIconView();

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public abstract View getAdMediaView(Object... objArr);

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getAdType() {
        return this.mAdSourceType;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public ITUAdvertiserInfoOperate getAdvertiserInfoOperate() {
        return null;
    }

    @Override // com.thinkup.core.api.BaseAd
    public final n0 getDetail() {
        return this.mAdTrackingInfo;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public int getDownloadProgress() {
        return 0;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public int getDownloadStatus() {
        return 0;
    }

    public final TUNativePrepareInfo getNativePrepareInfo() {
        return this.nativePrepareInfo;
    }

    public Object getObject() {
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public View getRoateView(Map<String, Object> map, TUCompViewListener tUCompViewListener) {
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public View getShakeView(int i2, int i3, TUShakeViewListener tUShakeViewListener) {
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public View getSlideView(int i2, int i3, int i4, TUShakeViewListener tUShakeViewListener) {
        return null;
    }

    public final void notifyAdClicked() {
        nm nmVar = this.mNativeEventListener;
        if (nmVar != null) {
            nmVar.onAdClicked(null);
        }
    }

    public final void notifyAdDislikeClick() {
        nm nmVar = this.mNativeEventListener;
        if (nmVar != null) {
            nmVar.onAdDislikeButtonClick();
        }
    }

    public final void notifyAdImpression() {
        nm nmVar = this.mNativeEventListener;
        if (nmVar != null) {
            nmVar.onAdImpressed();
        }
    }

    public final void notifyAdVideoEnd() {
        nm nmVar = this.mNativeEventListener;
        if (nmVar != null) {
            nmVar.onAdVideoEnd();
        }
    }

    public final void notifyAdVideoPlayProgress(int i2) {
        nm nmVar = this.mNativeEventListener;
        if (nmVar != null) {
            nmVar.onAdVideoProgress(i2);
        }
    }

    public final void notifyAdVideoStart() {
        nm nmVar = this.mNativeEventListener;
        if (nmVar != null) {
            nmVar.onAdVideoStart();
        }
    }

    public final void notifyAdVideoVideoPlayFail(String str, String str2) {
        nm nmVar = this.mNativeEventListener;
        if (nmVar == null || !(nmVar instanceof nn)) {
            return;
        }
        ((nn) nmVar).o(str, str2);
    }

    public final void notifyCountDown(int i2) {
    }

    public final void notifyDeeplinkCallback(boolean z2) {
        nm nmVar = this.mNativeEventListener;
        if (nmVar != null) {
            nmVar.onDeeplinkCallback(z2);
        }
    }

    public final void notifyDownloadConfirm(Context context, View view, TUNetworkConfirmInfo tUNetworkConfirmInfo) {
        nm nmVar = this.mNativeEventListener;
        if (nmVar != null) {
            nmVar.onDownloadConfirmCallback(context, view, tUNetworkConfirmInfo);
        }
    }

    public abstract void onPause();

    public abstract void onResume();

    public abstract void prepare(View view, TUNativePrepareInfo tUNativePrepareInfo);

    @Override // com.thinkup.core.api.BaseAd
    public void setDevParams(Map<String, Object> map) {
    }

    public final void setDownloadListener(TUEventInterface tUEventInterface) {
        this.mDownloadListener = tUEventInterface;
    }

    @Override // com.thinkup.core.api.BaseAd
    public void setNativeEventListener(nm nmVar) {
        this.mNativeEventListener = nmVar;
    }

    public final void setNativePrepareInfo(TUNativePrepareInfo tUNativePrepareInfo) {
        this.nativePrepareInfo = tUNativePrepareInfo;
    }

    @Override // com.thinkup.core.api.BaseAd
    public final void setTrackingInfo(n0 n0Var) {
        this.mAdTrackingInfo = n0Var;
    }
}
