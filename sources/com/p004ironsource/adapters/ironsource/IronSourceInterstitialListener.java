package com.p004ironsource.adapters.ironsource;

import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.a;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.p004ironsource.mediationsdk.utils.ErrorBuilder;
import com.p004ironsource.np;
import com.p004ironsource.zj;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class IronSourceInterstitialListener implements np {
    public final String AD_VISIBLE_EVENT_NAME = "impressions";
    private final String mDemandSourceName;
    private final InterstitialSmashListener mListener;

    public IronSourceInterstitialListener(InterstitialSmashListener interstitialSmashListener, String str) {
        this.mDemandSourceName = str;
        this.mListener = interstitialSmashListener;
    }

    @Override // com.p004ironsource.np
    public void onInterstitialAdRewarded(String str, int i2) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        StringBuilder sb = new StringBuilder();
        a.C(sb, this.mDemandSourceName, " interstitialListener demandSourceId=", str, " amount=");
        sb.append(i2);
        ironLog.verbose(sb.toString());
    }

    @Override // com.p004ironsource.np
    public void onInterstitialClick() {
        com.google.firebase.crashlytics.internal.model.a.y(new StringBuilder(), this.mDemandSourceName, " interstitialListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onInterstitialAdClicked();
    }

    @Override // com.p004ironsource.np
    public void onInterstitialClose() {
        com.google.firebase.crashlytics.internal.model.a.y(new StringBuilder(), this.mDemandSourceName, " interstitialListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onInterstitialAdClosed();
    }

    @Override // com.p004ironsource.np
    public void onInterstitialEventNotificationReceived(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener eventName = " + str);
        if ("impressions".equals(str)) {
            this.mListener.onInterstitialAdVisible();
        }
    }

    @Override // com.p004ironsource.np
    public void onInterstitialInitFailed(String str) {
        com.google.firebase.crashlytics.internal.model.a.y(new StringBuilder(), this.mDemandSourceName, " interstitialListener", IronLog.ADAPTER_CALLBACK);
    }

    @Override // com.p004ironsource.np
    public void onInterstitialInitSuccess() {
        com.google.firebase.crashlytics.internal.model.a.y(new StringBuilder(), this.mDemandSourceName, " interstitialListener", IronLog.ADAPTER_CALLBACK);
    }

    @Override // com.p004ironsource.np
    public void onInterstitialLoadFailed(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener " + str);
        this.mListener.onInterstitialAdLoadFailed(ErrorBuilder.buildLoadFailedError(str));
    }

    @Override // com.p004ironsource.np
    public void onInterstitialLoadSuccess(zj zjVar) {
        com.google.firebase.crashlytics.internal.model.a.y(new StringBuilder(), this.mDemandSourceName, " interstitialListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onInterstitialAdReady();
    }

    @Override // com.p004ironsource.np
    public void onInterstitialOpen() {
        com.google.firebase.crashlytics.internal.model.a.y(new StringBuilder(), this.mDemandSourceName, " interstitialListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onInterstitialAdOpened();
    }

    @Override // com.p004ironsource.np
    public void onInterstitialShowFailed(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener " + str);
        this.mListener.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError("Interstitial", str));
    }

    @Override // com.p004ironsource.np
    public void onInterstitialShowSuccess() {
        com.google.firebase.crashlytics.internal.model.a.y(new StringBuilder(), this.mDemandSourceName, " interstitialListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onInterstitialAdShowSucceeded();
    }
}
