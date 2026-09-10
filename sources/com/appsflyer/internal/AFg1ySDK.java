package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AFg1ySDK implements AFg1xSDK {
    private final AppsFlyerProperties getMonetizationNetwork;
    private final Context getRevenue;

    public AFg1ySDK(Context context, AppsFlyerProperties appsFlyerProperties) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        this.getRevenue = context;
        this.getMonetizationNetwork = appsFlyerProperties;
    }

    @Override // com.appsflyer.internal.AFg1xSDK
    public final AFf1bSDK getMediationNetwork() {
        String string;
        if (!Boolean.parseBoolean(this.getMonetizationNetwork.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION))) {
            return null;
        }
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.getRevenue);
            int i = defaultSharedPreferences.getInt("IABTCF_gdprApplies", -1);
            int i2 = defaultSharedPreferences.getInt("IABTCF_CmpSdkID", -1);
            int i3 = defaultSharedPreferences.getInt("IABTCF_PolicyVersion", -1);
            int i4 = defaultSharedPreferences.getInt("IABTCF_CmpSdkVersion", -1);
            String str = "";
            if (i == 1 && (string = defaultSharedPreferences.getString(AndroidTcfDataSource.TCF_TCSTRING_KEY, "")) != null) {
                Intrinsics.checkNotNullExpressionValue(string, "");
                str = string;
            }
            return new AFf1bSDK(i3, i, i2, i4, str);
        } catch (Exception e) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.DMA, "TCF data collection exception", e, false, false, false, false, 120, null);
            return null;
        }
    }
}
