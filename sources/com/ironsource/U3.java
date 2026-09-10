package com.ironsource;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class U3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f27279a = "NETWORK_TYPE_WIFI";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f27280b = "NETWORK_TYPE_VPN";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f27281c = "NETWORK_TYPE_ETHERNET";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f27282d = "NETWORK_TYPE_UNKNOWN";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f27283e = "notReachable";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f27284f = "PHONE_TYPE_NONE";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f27285g = "NETWORK_TYPE_GPRS";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f27286h = "NETWORK_TYPE_EDGE";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f27287i = "NETWORK_TYPE_UMTS";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f27288j = "NETWORK_TYPE_CDMA";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f27289k = "NETWORK_TYPE_EVDO_0";
    public static final String l = "NETWORK_TYPE_EVDO_A";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f27290m = "NETWORK_TYPE_1xRTT";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f27291n = "NETWORK_TYPE_HSDPA";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f27292o = "NETWORK_TYPE_HSUPA";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f27293p = "NETWORK_TYPE_HSPA";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f27294q = "NETWORK_TYPE_IDEN";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f27295r = "NETWORK_TYPE_EVDO_B";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f27296s = "NETWORK_TYPE_LTE";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f27297t = "NETWORK_TYPE_EHRPD";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f27298u = "NETWORK_TYPE_HSPAP";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f27299v = "NETWORK_TYPE_GSM";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f27300w = "NETWORK_TYPE_TD_SCDMA";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f27301x = "NETWORK_TYPE_IWLAN";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f27302y = "NETWORK_TYPE_LTE_CA";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f27303z = "NETWORK_TYPE_NR";

    @SuppressLint({"MissingPermission"})
    public static String a(Network network, Context context) {
        if (context == null) {
            return "none";
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (network != null && connectivityManager != null) {
            try {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                if (networkCapabilities == null) {
                    return c(context);
                }
                if (networkCapabilities.hasTransport(1)) {
                    return T3.f27210b;
                }
                return networkCapabilities.hasTransport(0) ? T3.f27209a : c(context);
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }
        return "none";
    }

    public static String b(Context context) {
        return a(a(context), context);
    }

    private static String c(Context context) {
        String strA = T3.a(context);
        return TextUtils.isEmpty(strA) ? "none" : strA;
    }

    public static String d(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
            Network networkA = a(connectivityManager);
            if (networkA == null) {
                return f27283e;
            }
            try {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(networkA);
                if (networkCapabilities == null) {
                    return f27282d;
                }
                if (networkCapabilities.hasTransport(1)) {
                    return f27279a;
                }
                if (networkCapabilities.hasTransport(0) && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                    return a(activeNetworkInfo.getSubtype());
                }
            } catch (Throwable th2) {
                C0474n4.d().a(th2);
                IronLog.INTERNAL.error("Error getting network capabilities: " + th2);
            }
        }
        return f27282d;
    }

    public static boolean e(Context context) {
        return b(context, a(context)).equals("vpn");
    }

    @SuppressLint({"MissingPermission"})
    private static String b(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (network != null && context != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) != null) {
                    if (networkCapabilities.hasTransport(1)) {
                        return T3.f27210b;
                    }
                    if (networkCapabilities.hasTransport(0)) {
                        return T3.f27215g;
                    }
                    if (networkCapabilities.hasTransport(4)) {
                        return "vpn";
                    }
                    if (networkCapabilities.hasTransport(3)) {
                        return T3.f27213e;
                    }
                    if (networkCapabilities.hasTransport(5)) {
                        return T3.f27216h;
                    }
                    if (networkCapabilities.hasTransport(6)) {
                        return T3.f27217i;
                    }
                    if (networkCapabilities.hasTransport(2)) {
                        return T3.f27212d;
                    }
                }
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }
        return "";
    }

    @SuppressLint({"MissingPermission"})
    public static Network a(Context context) {
        if (context == null) {
            return null;
        }
        return a((ConnectivityManager) context.getSystemService("connectivity"));
    }

    @SuppressLint({"MissingPermission"})
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
                    jSONObject.put(X3.j.f27864v, e(context));
                    return jSONObject;
                }
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }
        return jSONObject;
    }

    private static String a(int i10) {
        switch (i10) {
            case 0:
                return f27284f;
            case 1:
                return f27285g;
            case 2:
                return f27286h;
            case 3:
                return f27287i;
            case 4:
                return f27288j;
            case 5:
                return f27289k;
            case 6:
                return l;
            case 7:
                return f27290m;
            case 8:
                return f27291n;
            case 9:
                return f27292o;
            case 10:
                return f27293p;
            case 11:
                return f27294q;
            case 12:
                return f27295r;
            case 13:
                return f27296s;
            case 14:
                return f27297t;
            case 15:
                return f27298u;
            case 16:
                return f27299v;
            case 17:
                return f27300w;
            case 18:
                return f27301x;
            case 19:
                return f27302y;
            case 20:
                return f27303z;
            default:
                return f27282d;
        }
    }

    @Nullable
    private static Network a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetwork();
        } catch (Throwable th2) {
            C0474n4.d().a(th2);
            return null;
        }
    }
}
