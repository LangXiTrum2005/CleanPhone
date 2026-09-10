package com.ironsource.adqualitysdk.sdk;

import android.content.Context;
import com.ironsource.adqualitysdk.sdk.i.s;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class IronSourceAdQuality {

    @Deprecated
    public static final String TAG = "ISAdQuality Agent SDK";

    @Deprecated
    public static final String VERSION = "9.5.1";

    @Deprecated
    public static IronSourceAdQuality getInstance() {
        return s.m3035();
    }

    @Deprecated
    public static String getSDKVersion() {
        return "9.5.1";
    }

    @Deprecated
    public abstract void changeUserId(String str);

    @Deprecated
    public abstract void initialize(Context context, String str);

    @Deprecated
    public abstract void initialize(Context context, String str, ISAdQualityConfig iSAdQualityConfig);

    @Deprecated
    public abstract void sendCustomMediationRevenue(ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue);

    @Deprecated
    public abstract void setAdListener(ISAdQualityAdListener iSAdQualityAdListener);

    @Deprecated
    public abstract void setConfig(ISAdQualityConfig iSAdQualityConfig);

    @Deprecated
    public abstract void setMetaData(String str, String str2);

    @Deprecated
    public abstract void setSegment(ISAdQualitySegment iSAdQualitySegment);

    @Deprecated
    public abstract void setUserConsent(boolean z10);

    @Deprecated
    public abstract void shutdown();
}
