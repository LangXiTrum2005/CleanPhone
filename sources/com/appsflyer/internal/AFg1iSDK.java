package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import com.appsflyer.AFLogger;

/* JADX INFO: loaded from: classes2.dex */
public final class AFg1iSDK {
    public static boolean getMonetizationNetwork(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return context.getPackageManager().isInstantApp();
        }
        try {
            context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
            return true;
        } catch (ClassNotFoundException e) {
            AFLogger.afErrorLogForExcManagerOnly("InstantAppsRuntime not found", e, true);
            return false;
        }
    }
}
