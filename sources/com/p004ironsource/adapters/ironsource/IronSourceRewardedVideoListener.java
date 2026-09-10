package com.p004ironsource.adapters.ironsource;

import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.a;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.p004ironsource.mediationsdk.utils.ErrorBuilder;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.p004ironsource.np;
import com.p004ironsource.zj;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class IronSourceRewardedVideoListener implements np {
    public final String AD_VISIBLE_EVENT_NAME = "impressions";
    private final String mDemandSourceName;
    boolean mIsRvDemandOnly;
    RewardedVideoSmashListener mListener;

    public IronSourceRewardedVideoListener(RewardedVideoSmashListener rewardedVideoSmashListener, String str, boolean z2) {
        this.mDemandSourceName = str;
        this.mListener = rewardedVideoSmashListener;
        this.mIsRvDemandOnly = z2;
    }

    @Override // com.p004ironsource.np
    public void onInterstitialAdRewarded(String str, int i2) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        StringBuilder sb = new StringBuilder();
        a.C(sb, this.mDemandSourceName, " rewardedVideoListener demandSourceId=", str, " amount=");
        sb.append(i2);
        ironLog.verbose(sb.toString());
        this.mListener.onRewardedVideoAdRewarded();
    }

    @Override // com.p004ironsource.np
    public void onInterstitialClick() {
        com.google.firebase.crashlytics.internal.model.a.y(new StringBuilder(), this.mDemandSourceName, " rewardedVideoListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onRewardedVideoAdClicked();
    }

    @Override // com.p004ironsource.np
    public void onInterstitialClose() {
        com.google.firebase.crashlytics.internal.model.a.y(new StringBuilder(), this.mDemandSourceName, " rewardedVideoListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onRewardedVideoAdClosed();
    }

    @Override // com.p004ironsource.np
    public void onInterstitialEventNotificationReceived(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " rewardedVideoListener eventName = " + str);
        if ("impressions".equals(str)) {
            this.mListener.onRewardedVideoAdVisible();
        }
    }

    @Override // com.p004ironsource.np
    public void onInterstitialInitFailed(String str) {
        com.google.firebase.crashlytics.internal.model.a.y(new StringBuilder(), this.mDemandSourceName, " rewardedVideoListener", IronLog.ADAPTER_CALLBACK);
    }

    @Override // com.p004ironsource.np
    public void onInterstitialInitSuccess() {
        com.google.firebase.crashlytics.internal.model.a.y(new StringBuilder(), this.mDemandSourceName, " rewardedVideoListener", IronLog.ADAPTER_CALLBACK);
    }

    @Override // com.p004ironsource.np
    public void onInterstitialLoadFailed(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " rewardedVideoListener " + str);
        this.mListener.onRewardedVideoLoadFailed(ErrorBuilder.buildLoadFailedError(str));
        if (this.mIsRvDemandOnly) {
            return;
        }
        this.mListener.onRewardedVideoAvailabilityChanged(false);
    }

    @Override // com.p004ironsource.np
    public void onInterstitialLoadSuccess(zj zjVar) {
        com.google.firebase.crashlytics.internal.model.a.y(new StringBuilder(), this.mDemandSourceName, " rewardedVideoListener", IronLog.ADAPTER_CALLBACK);
        if (this.mIsRvDemandOnly) {
            this.mListener.onRewardedVideoLoadSuccess();
        } else {
            this.mListener.onRewardedVideoAvailabilityChanged(true);
        }
    }

    @Override // com.p004ironsource.np
    public void onInterstitialOpen() {
        com.google.firebase.crashlytics.internal.model.a.y(new StringBuilder(), this.mDemandSourceName, " rewardedVideoListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onRewardedVideoAdOpened();
    }

    @Override // com.p004ironsource.np
    public void onInterstitialShowFailed(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + "rewardedVideoListener " + str);
        this.mListener.onRewardedVideoAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT, str));
    }

    @Override // com.p004ironsource.np
    public void onInterstitialShowSuccess() {
        com.google.firebase.crashlytics.internal.model.a.y(new StringBuilder(), this.mDemandSourceName, " rewardedVideoListener", IronLog.ADAPTER_CALLBACK);
    }
}
