package com.yolo.networklibrary.common.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Enumeration;

/* JADX INFO: compiled from: NetworkUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public class impromptu {
    public static NetworkInfo attabal(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } catch (NoSuchMethodError e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static boolean beachfront() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                return false;
            }
            for (NetworkInterface networkInterface : Collections.list(networkInterfaces)) {
                if (networkInterface.isUp() && networkInterface.getInterfaceAddresses().size() != 0 && ("tun0".equals(networkInterface.getName()) || "ppp0".equals(networkInterface.getName()))) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int dern(Context context) {
        NetworkInfo networkInfoAttabal;
        if (context == null || (networkInfoAttabal = attabal(context)) == null || !networkInfoAttabal.isConnected()) {
            return 1;
        }
        return wireman(networkInfoAttabal);
    }

    public static boolean marial(Context context) {
        NetworkInfo networkInfoAttabal;
        return (context == null || (networkInfoAttabal = attabal(context)) == null || !networkInfoAttabal.isConnected()) ? false : true;
    }

    public static int saneness(int i) {
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return 3;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return 4;
            case 13:
                return 5;
            default:
                return 1;
        }
    }

    public static int wireman(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return 1;
        }
        int type = networkInfo.getType();
        if (type != 0) {
            return type != 1 ? 1 : 2;
        }
        return saneness(networkInfo.getSubtype());
    }

    public static void competently(Context context) {
    }
}
