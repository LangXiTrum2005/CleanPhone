package com.appsflyer.internal;

import android.app.Activity;
import android.net.Uri;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AFi1lSDK implements AFi1oSDK {
    private String getRevenue;

    private static String AFAdRevenueData(Activity activity) {
        Uri uriK_ = AFb1qSDK.k_(activity != null ? activity.getIntent() : null);
        String string = uriK_ != null ? uriK_.toString() : null;
        if (string == null) {
            string = "";
        }
        if (AFAdRevenueData(string)) {
            return null;
        }
        return string;
    }

    @Override // com.appsflyer.internal.AFi1oSDK
    public final String getMediationNetwork(Activity activity) {
        Uri referrer = (activity == null || activity.getIntent() == null) ? null : activity.getReferrer();
        String string = referrer != null ? referrer.toString() : null;
        return string == null ? "" : string;
    }

    @Override // com.appsflyer.internal.AFi1oSDK
    public final void getMonetizationNetwork(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        String str = this.getRevenue;
        if (str == null || str.length() == 0) {
            this.getRevenue = AFAdRevenueData(activity);
        }
    }

    @Override // com.appsflyer.internal.AFi1oSDK
    public final String getRevenue(Activity activity) {
        String str = this.getRevenue;
        this.getRevenue = null;
        return (str == null || str.length() == 0) ? AFAdRevenueData(activity) : str;
    }

    private static boolean AFAdRevenueData(String str) {
        return p002kotlin.text.dovishness.starveling(str, "android-app://", false, 2, null);
    }
}
