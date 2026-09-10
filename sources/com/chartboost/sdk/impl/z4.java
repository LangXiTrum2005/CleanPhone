package com.chartboost.sdk.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z4 {
    public static final NetworkInfo a(Context context) {
        ConnectivityManager connectivityManagerB;
        Object objA;
        if (context == null || (connectivityManagerB = b(context)) == null) {
            return null;
        }
        try {
            objA = connectivityManagerB.getActiveNetworkInfo();
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        Throwable thA = Result.a(objA);
        if (thA != null) {
            za.a("Cannot retrieve active network info", thA);
        }
        return (NetworkInfo) (objA instanceof Result.Failure ? null : objA);
    }

    public static final ConnectivityManager b(Context context) {
        Object objA;
        if (context == null) {
            return null;
        }
        try {
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            objA = (ConnectivityManager) systemService;
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        Throwable thA = Result.a(objA);
        if (thA != null) {
            za.a("Cannot retrieve connectivity manager", thA);
        }
        return (ConnectivityManager) (objA instanceof Result.Failure ? null : objA);
    }

    public static final boolean c(Context context) {
        NetworkInfo networkInfoA = a(context);
        return networkInfoA != null && networkInfoA.isConnected() && networkInfoA.getType() == 0;
    }

    public static final boolean d(Context context) {
        NetworkInfo networkInfoA = a(context);
        NetworkCapabilities networkCapabilitiesA = a(context, null, 1, null);
        if (networkCapabilitiesA != null) {
            return networkCapabilitiesA.hasCapability(16);
        }
        return networkInfoA != null && networkInfoA.isConnected();
    }

    public static final boolean e(Context context) {
        NetworkInfo networkInfoA = a(context);
        return networkInfoA != null && networkInfoA.isConnected() && networkInfoA.getType() == 1;
    }

    public static final int f(Context context) {
        NetworkInfo networkInfoA = a(context);
        if (networkInfoA == null || !networkInfoA.isConnected()) {
            return 0;
        }
        return networkInfoA.getSubtype();
    }

    public static final zc g(Context context) {
        NetworkInfo networkInfoA = a(context);
        if (networkInfoA != null) {
            zc zcVarA = networkInfoA.isConnected() ? a(networkInfoA.getType(), networkInfoA.getSubtype()) : zc.UNKNOWN;
            if (zcVarA != null) {
                return zcVarA;
            }
        }
        return zc.UNKNOWN;
    }

    public static final NetworkCapabilities a(Context context, Network network) {
        ConnectivityManager connectivityManagerB;
        Object objA;
        if (context == null || (connectivityManagerB = b(context)) == null) {
            return null;
        }
        if (network == null) {
            try {
                network = connectivityManagerB.getActiveNetwork();
            } catch (Throwable th) {
                objA = ResultKt.a(th);
            }
        }
        objA = connectivityManagerB.getNetworkCapabilities(network);
        Throwable thA = Result.a(objA);
        if (thA != null) {
            za.a("Cannot retrieve network capabilities", thA);
        }
        return (NetworkCapabilities) (objA instanceof Result.Failure ? null : objA);
    }

    public static /* synthetic */ NetworkCapabilities a(Context context, Network network, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            network = null;
        }
        return a(context, network);
    }

    public static final zc a(int i2, int i3) {
        if (i2 != 0) {
            if (i2 != 1) {
                return zc.UNKNOWN;
            }
            return zc.WIFI;
        }
        if (i3 != 20) {
            switch (i3) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return zc.CELLULAR_2G;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return zc.CELLULAR_3G;
                case 13:
                    return zc.CELLULAR_4G;
                default:
                    return zc.CELLULAR_UNKNOWN;
            }
        }
        return zc.CELLULAR_5G;
    }
}
