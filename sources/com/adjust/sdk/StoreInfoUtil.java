package com.adjust.sdk;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class StoreInfoUtil {
    public static String getInitiatingPackageName(Context context) {
        try {
            return context.getPackageManager().getInstallSourceInfo(context.getPackageName()).getInitiatingPackageName();
        } catch (Exception unused) {
            return null;
        }
    }

    public static Boolean getIsSystemApp(Context context) {
        try {
            if ((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 1) != 0) {
                return Boolean.TRUE;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static Boolean getIsUpdatedSystemApp(Context context) {
        try {
            if ((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 128) != 0) {
                return Boolean.TRUE;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static String getOriginatingPackageName(Context context) {
        try {
            return context.getPackageManager().getInstallSourceInfo(context.getPackageName()).getOriginatingPackageName();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getStoreIdFromSystem(Context context) {
        try {
            return context.getPackageManager().getInstallSourceInfo(context.getPackageName()).getInstallingPackageName();
        } catch (Exception unused) {
            return null;
        }
    }

    public static AdjustStoreInfo getStoreInfoFromClient(AdjustConfig adjustConfig, Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return adjustConfig.storeInfo;
            }
            String string = bundle.getString("ADJUST_STORE_NAME");
            if (string != null && !string.isEmpty()) {
                String string2 = bundle.getString("ADJUST_STORE_APP_ID");
                AdjustStoreInfo adjustStoreInfo = new AdjustStoreInfo(string);
                adjustStoreInfo.setStoreAppId(string2);
                return adjustStoreInfo;
            }
            return adjustConfig.storeInfo;
        } catch (Exception unused) {
            return adjustConfig.storeInfo;
        }
    }
}
