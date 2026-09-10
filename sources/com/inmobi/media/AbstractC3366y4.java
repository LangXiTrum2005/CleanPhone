package com.inmobi.media;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import p002kotlin.jvm.internal.Intrinsics;
import picketboat.saneness;

/* JADX INFO: renamed from: com.inmobi.media.y4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3366y4 {
    public static final Pe a() {
        Context context = Ji.a;
        if (context == null) {
            return Pe.UNAVAILABLE;
        }
        try {
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.competently(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type != 1) {
                        return Pe.SLOW;
                    }
                    Object systemService2 = context.getApplicationContext().getSystemService(com.ironsource.T3.b);
                    Intrinsics.competently(systemService2, "null cannot be cast to non-null type android.net.wifi.WifiManager");
                    int linkSpeed = ((WifiManager) systemService2).getConnectionInfo().getLinkSpeed();
                    if (linkSpeed >= 10) {
                        return Pe.FAST;
                    }
                    return linkSpeed >= 2 ? Pe.MEDIUM : Pe.SLOW;
                }
                Intrinsics.checkNotNullParameter(context, "context");
                if (saneness.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") != 0) {
                    return Pe.UNAVAILABLE;
                }
                Object systemService3 = context.getSystemService("phone");
                Intrinsics.competently(systemService3, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                int networkType = ((TelephonyManager) systemService3).getNetworkType();
                if (networkType == 1 || networkType == 2 || networkType == 4 || networkType == 7 || networkType == 11 || networkType == 16) {
                    return Pe.SLOW;
                }
                return (networkType == 18 || networkType == 20) ? Pe.FAST : Pe.MEDIUM;
            }
            return Pe.UNAVAILABLE;
        } catch (SecurityException unused) {
            return Pe.UNAVAILABLE;
        }
    }
}
