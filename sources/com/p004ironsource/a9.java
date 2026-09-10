package com.p004ironsource;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.p004ironsource.mediationsdk.logger.IronLog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class a9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f24266a = "NETWORK_TYPE_WIFI";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f24267b = "NETWORK_TYPE_VPN";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f24268c = "NETWORK_TYPE_ETHERNET";
    public static final String d = "NETWORK_TYPE_UNKNOWN";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f24269e = "notReachable";
    public static final String f = "PHONE_TYPE_NONE";
    public static final String g = "NETWORK_TYPE_GPRS";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f24270h = "NETWORK_TYPE_EDGE";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f24271i = "NETWORK_TYPE_UMTS";
    public static final String j = "NETWORK_TYPE_CDMA";
    public static final String k = "NETWORK_TYPE_EVDO_0";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f24272l = "NETWORK_TYPE_EVDO_A";
    public static final String m = "NETWORK_TYPE_1xRTT";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f24273n = "NETWORK_TYPE_HSDPA";
    public static final String o = "NETWORK_TYPE_HSUPA";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f24274p = "NETWORK_TYPE_HSPA";
    public static final String q = "NETWORK_TYPE_IDEN";
    public static final String r = "NETWORK_TYPE_EVDO_B";
    public static final String s = "NETWORK_TYPE_LTE";
    public static final String t = "NETWORK_TYPE_EHRPD";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f24275u = "NETWORK_TYPE_HSPAP";
    public static final String v = "NETWORK_TYPE_GSM";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f24276w = "NETWORK_TYPE_TD_SCDMA";
    public static final String x = "NETWORK_TYPE_IWLAN";
    public static final String y = "NETWORK_TYPE_LTE_CA";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f24277z = "NETWORK_TYPE_NR";

    public static Network a(Context context) {
        if (context == null) {
            return null;
        }
        return a((ConnectivityManager) context.getSystemService("connectivity"));
    }

    public static String b(Context context) {
        return a(a(context), context);
    }

    private static String c(Context context) {
        String strA = z8.a(context);
        return TextUtils.isEmpty(strA) ? "none" : strA;
    }

    public static String d(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
            Network networkA = a(connectivityManager);
            if (networkA == null) {
                return f24269e;
            }
            try {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(networkA);
                if (networkCapabilities == null) {
                    return d;
                }
                if (networkCapabilities.hasTransport(1)) {
                    return f24266a;
                }
                if (networkCapabilities.hasTransport(0) && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                    return a(activeNetworkInfo.getSubtype());
                }
            } catch (Throwable th) {
                q9.d().a(th);
                IronLog.INTERNAL.error("Error getting network capabilities: " + th);
            }
        }
        return d;
    }

    public static boolean e(Context context) {
        return b(context, a(context)).equals("vpn");
    }

    private static Network a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetwork();
        } catch (Throwable th) {
            q9.d().a(th);
            return null;
        }
    }

    private static String b(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (network == null || context == null) {
            return "";
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) != null) {
                if (networkCapabilities.hasTransport(1)) {
                    return z8.f27869b;
                }
                if (networkCapabilities.hasTransport(0)) {
                    return z8.g;
                }
                if (networkCapabilities.hasTransport(4)) {
                    return "vpn";
                }
                if (networkCapabilities.hasTransport(3)) {
                    return z8.f27871e;
                }
                if (networkCapabilities.hasTransport(5)) {
                    return z8.f27872h;
                }
                if (networkCapabilities.hasTransport(6)) {
                    return z8.f27873i;
                }
                return networkCapabilities.hasTransport(2) ? z8.d : "";
            }
            return "";
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return "";
        }
    }

    private static String a(int i2) {
        switch (i2) {
            case 0:
                return f;
            case 1:
                return g;
            case 2:
                return f24270h;
            case 3:
                return f24271i;
            case 4:
                return j;
            case 5:
                return k;
            case 6:
                return f24272l;
            case 7:
                return m;
            case 8:
                return f24273n;
            case 9:
                return o;
            case 10:
                return f24274p;
            case 11:
                return q;
            case 12:
                return r;
            case 13:
                return s;
            case 14:
                return t;
            case 15:
                return f24275u;
            case 16:
                return v;
            case 17:
                return f24276w;
            case 18:
                return x;
            case 19:
                return y;
            case 20:
                return f24277z;
            default:
                return d;
        }
    }

    public static String a(Network network, Context context) {
        if (context == null) {
            return "none";
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (network != null && connectivityManager != null) {
            try {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                if (networkCapabilities != null) {
                    if (networkCapabilities.hasTransport(1)) {
                        return z8.f27869b;
                    }
                    if (networkCapabilities.hasTransport(0)) {
                        return z8.f27868a;
                    }
                }
                return c(context);
            } catch (Exception e2) {
                q9.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
        }
        return "none";
    }

    public static JSONObject a(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (context == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        if (network != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) != null) {
                    jSONObject.put("networkCapabilities", networkCapabilities.toString());
                    jSONObject.put("downloadSpeed", networkCapabilities.getLinkDownstreamBandwidthKbps());
                    jSONObject.put("uploadSpeed", networkCapabilities.getLinkUpstreamBandwidthKbps());
                    jSONObject.put(d9.i.v, e(context));
                    return jSONObject;
                }
            } catch (Exception e2) {
                q9.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
        }
        return jSONObject;
    }
}
