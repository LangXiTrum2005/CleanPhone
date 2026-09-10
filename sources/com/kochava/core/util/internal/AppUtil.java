package com.kochava.core.util.internal;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.android.gms.common.wrappers.InstantApps;

/* JADX INFO: loaded from: classes5.dex */
public final class AppUtil {
    public static String a(Context context) {
        try {
            int iMyPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return context.getPackageName();
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                if (runningAppProcessInfo != null && runningAppProcessInfo.pid == iMyPid) {
                    return runningAppProcessInfo.processName;
                }
            }
            for (ActivityManager.RunningServiceInfo runningServiceInfo : activityManager.getRunningServices(Integer.MAX_VALUE)) {
                if (runningServiceInfo != null && runningServiceInfo.pid == iMyPid) {
                    return runningServiceInfo.process;
                }
            }
            return context.getPackageName();
        } catch (Throwable unused) {
        }
    }

    public static boolean b(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return context.getPackageManager().isInstantApp();
        }
        try {
            Object objInvoke = InstantApps.class.getMethod("isInstantApp", Context.class).invoke(null, context);
            if (objInvoke instanceof Boolean) {
                return ((Boolean) objInvoke).booleanValue();
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
