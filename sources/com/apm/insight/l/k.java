package com.apm.insight.l;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.p004ironsource.z8;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: com.apm.insight.l.k$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10240a;

        static {
            int[] iArr = new int[com.apm.insight.k.e.b.values().length];
            f10240a = iArr;
            try {
                iArr[com.apm.insight.k.e.b.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10240a[com.apm.insight.k.e.b.MOBILE_2G.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10240a[com.apm.insight.k.e.b.MOBILE_3G.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10240a[com.apm.insight.k.e.b.MOBILE_4G.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10240a[com.apm.insight.k.e.b.MOBILE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10240a[com.apm.insight.k.e.b.MOBILE_5G.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static String a(Context context) {
        return a(c(context));
    }

    public static boolean b(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable()) ? false : true;
        } catch (Exception unused) {
        }
    }

    private static com.apm.insight.k.e.b c(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return com.apm.insight.k.e.b.NONE;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (1 == type) {
                    return com.apm.insight.k.e.b.WIFI;
                }
                if (type != 0) {
                    return com.apm.insight.k.e.b.MOBILE;
                }
                int networkType = ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
                if (networkType != 3) {
                    if (networkType == 20) {
                        return com.apm.insight.k.e.b.MOBILE_5G;
                    }
                    if (networkType != 5 && networkType != 6) {
                        switch (networkType) {
                            case 8:
                            case 9:
                            case 10:
                                break;
                            default:
                                switch (networkType) {
                                    case 12:
                                    case 14:
                                    case 15:
                                        break;
                                    case 13:
                                        return com.apm.insight.k.e.b.MOBILE_4G;
                                    default:
                                        return com.apm.insight.k.e.b.MOBILE;
                                }
                                break;
                        }
                    }
                }
                return com.apm.insight.k.e.b.MOBILE_3G;
            }
            return com.apm.insight.k.e.b.NONE;
        } catch (Throwable unused) {
            return com.apm.insight.k.e.b.MOBILE;
        }
    }

    private static String a(com.apm.insight.k.e.b bVar) {
        try {
            switch (AnonymousClass1.f10240a[bVar.ordinal()]) {
                case 1:
                    return z8.f27869b;
                case 2:
                    return "2g";
                case 3:
                    return z8.f27868a;
                case 4:
                    return "4g";
                case 5:
                    return "mobile";
                case 6:
                    return "5g";
                default:
                    return "";
            }
        } catch (Exception unused) {
            return "";
        }
    }
}
