package com.p004ironsource.adqualitysdk.sdk;

import android.content.Context;
import com.p004ironsource.adqualitysdk.sdk.i.r;

/* JADX INFO: loaded from: classes5.dex */
public abstract class IronSourceAdQuality {
    public static final String TAG = "ISAdQuality Agent SDK";
    public static final String VERSION = "7.25.2";

    public static IronSourceAdQuality getInstance() {
        return r.m2874();
    }

    public static String getSDKVersion() {
        return "7.25.2";
    }

    public abstract void changeUserId(String str);

    public abstract void initialize(Context context, String str);

    public abstract void initialize(Context context, String str, ISAdQualityConfig iSAdQualityConfig);

    public abstract void sendCustomMediationRevenue(ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue);

    public abstract void setAdListener(ISAdQualityAdListener iSAdQualityAdListener);

    public abstract void setConfig(ISAdQualityConfig iSAdQualityConfig);

    public abstract void setSegment(ISAdQualitySegment iSAdQualitySegment);

    @Deprecated
    public abstract void setUserConsent(boolean z2);

    public abstract void shutdown();
}
