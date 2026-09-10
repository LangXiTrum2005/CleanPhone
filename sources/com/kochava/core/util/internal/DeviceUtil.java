package com.kochava.core.util.internal;

import android.content.Context;
import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes5.dex */
public final class DeviceUtil {
    public static ConnectivityManager a(Context context) {
        if (context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) != 0) {
            throw new UnsupportedOperationException("Missing permission ACCESS_NETWORK_STATE");
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            return connectivityManager;
        }
        throw new UnsupportedOperationException("Unable to get ConnectivityManager");
    }
}
