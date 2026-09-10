package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.FirebaseMessagingServiceListener;
import com.google.firebase.messaging.FirebaseMessagingService;

/* JADX INFO: loaded from: classes2.dex */
public final class AFg1sSDK {
    public final AFc1qSDK getCurrencyIso4217Code;

    public AFg1sSDK(Context context) {
        this.getCurrencyIso4217Code = AFa1ySDK.getRevenue().getMonetizationNetwork(context);
    }

    public static boolean AFAdRevenueData(AFc1qSDK aFc1qSDK) {
        return aFc1qSDK.getMediationNetwork("sentRegisterRequestToAF", false);
    }

    public static boolean getMonetizationNetwork(Context context) {
        if (AppsFlyerLib.getInstance().isStopped()) {
            return false;
        }
        try {
            String str = FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT;
            return AFj1kSDK.L_(context, new Intent("com.google.firebase.MESSAGING_EVENT", null, context, FirebaseMessagingServiceListener.class));
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.UNINSTALL, "An error occurred while trying to verify manifest declarations: ", th);
        }
    }

    public final AFf1aSDK getRevenue() {
        String string;
        String string2;
        String monetizationNetwork = this.getCurrencyIso4217Code.getMonetizationNetwork("afUninstallToken", (String) null);
        long monetizationNetwork2 = this.getCurrencyIso4217Code.getMonetizationNetwork("afUninstallToken_received_time", 0L);
        boolean mediationNetwork = this.getCurrencyIso4217Code.getMediationNetwork("afUninstallToken_queued", false);
        this.getCurrencyIso4217Code.AFAdRevenueData("afUninstallToken_queued", false);
        if (monetizationNetwork == null && (string2 = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            String[] strArrSplit = string2.split(",");
            monetizationNetwork = strArrSplit[strArrSplit.length - 1];
        }
        if (monetizationNetwork2 == 0 && (string = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            String[] strArrSplit2 = string.split(",");
            if (strArrSplit2.length >= 2) {
                try {
                    monetizationNetwork2 = Long.parseLong(strArrSplit2[strArrSplit2.length - 2]);
                } catch (NumberFormatException unused) {
                }
            }
        }
        if (monetizationNetwork != null) {
            return new AFf1aSDK(monetizationNetwork, monetizationNetwork2, mediationNetwork);
        }
        return null;
    }
}
