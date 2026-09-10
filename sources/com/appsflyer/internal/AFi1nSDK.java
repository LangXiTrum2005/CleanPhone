package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.appsflyer.AFLogger;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AFi1nSDK extends AFi1qSDK {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFi1nSDK(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // com.appsflyer.internal.AFi1qSDK
    public final String AFAdRevenueData() {
        ConnectivityManager connectivityManager = this.getMonetizationNetwork;
        if (connectivityManager != null) {
            if (AFi1qSDK.v_(connectivityManager.getNetworkInfo(1))) {
                return "WIFI";
            }
            if (AFi1qSDK.v_(connectivityManager.getNetworkInfo(0))) {
                return "MOBILE";
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    return type != 1 ? "unknown" : "WIFI";
                }
                return "MOBILE";
            }
        }
        return "unknown";
    }

    @Override // com.appsflyer.internal.AFi1qSDK
    public final boolean getMediationNetwork() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            Intrinsics.checkNotNullExpressionValue(networkInterfaces, "");
            ArrayList<NetworkInterface> list = Collections.list(networkInterfaces);
            Intrinsics.checkNotNullExpressionValue(list, "");
            if (list == null || !list.isEmpty()) {
                for (NetworkInterface networkInterface : list) {
                    if (networkInterface.isUp() && Intrinsics.wireman(networkInterface.getName(), "tun0")) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e) {
            AFLogger.afErrorLog("Failed collecting ivc data", e);
            return false;
        }
    }
}
