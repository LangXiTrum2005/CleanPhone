package com.vungle.ads.internal.platform;

import android.content.Context;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.ProxyInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\b*\u0004\u0018\u00010\rH\u0002¨\u0006\u000e"}, d2 = {"Lcom/vungle/ads/internal/platform/DeviceCheckUtils;", "", "()V", "getSensorCount", "", "context", "Landroid/content/Context;", "hasSystemAlertWindowPermission", "", "isEmulator", "isProxyEnabled", "isVpnConnected", "isEnabled", "Landroid/net/ProxyInfo;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DeviceCheckUtils {
    public static final DeviceCheckUtils INSTANCE = new DeviceCheckUtils();

    private DeviceCheckUtils() {
    }

    private final boolean isEnabled(ProxyInfo proxyInfo) {
        if (proxyInfo == null) {
            return false;
        }
        String host = proxyInfo.getHost();
        return (host != null && host.length() > 0 && proxyInfo.getPort() > 0) || (proxyInfo.getPacFileUrl() != null && !Intrinsics.a(proxyInfo.getPacFileUrl(), Uri.EMPTY));
    }

    public final int getSensorCount(Context context) {
        Intrinsics.f(context, "context");
        Object systemService = context.getSystemService("sensor");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        return ((SensorManager) systemService).getSensorList(-1).size();
    }

    public final boolean hasSystemAlertWindowPermission(Context context) {
        Intrinsics.f(context, "context");
        return Settings.canDrawOverlays(context);
    }

    public final boolean isEmulator() {
        String lowerCase;
        String lowerCase2;
        String lowerCase3;
        String lowerCase4;
        String lowerCase5;
        String str = Build.FINGERPRINT;
        String lowerCase6 = "";
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        } else {
            lowerCase = "";
        }
        String str2 = Build.MODEL;
        if (str2 != null) {
            lowerCase2 = str2.toLowerCase(Locale.ROOT);
            Intrinsics.e(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        } else {
            lowerCase2 = "";
        }
        String str3 = Build.PRODUCT;
        if (str3 != null) {
            lowerCase3 = str3.toLowerCase(Locale.ROOT);
            Intrinsics.e(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        } else {
            lowerCase3 = "";
        }
        String str4 = Build.BRAND;
        if (str4 != null) {
            lowerCase4 = str4.toLowerCase(Locale.ROOT);
            Intrinsics.e(lowerCase4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        } else {
            lowerCase4 = "";
        }
        String str5 = Build.MANUFACTURER;
        if (str5 != null) {
            lowerCase5 = str5.toLowerCase(Locale.ROOT);
            Intrinsics.e(lowerCase5, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        } else {
            lowerCase5 = "";
        }
        String str6 = Build.BOARD;
        if (str6 != null) {
            lowerCase6 = str6.toLowerCase(Locale.ROOT);
            Intrinsics.e(lowerCase6, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        }
        String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
        Intrinsics.e(SUPPORTED_ABIS, "SUPPORTED_ABIS");
        String lowerCase7 = ArraysKt.I(SUPPORTED_ABIS, null, null, null, 63).toLowerCase(Locale.ROOT);
        Intrinsics.e(lowerCase7, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return StringsKt.l(lowerCase, "generic", false) || StringsKt.l(lowerCase, "emulator", false) || StringsKt.l(lowerCase2, "google_sdk", false) || StringsKt.l(lowerCase2, "emulator", false) || StringsKt.l(lowerCase3, "sdk", false) || StringsKt.l(lowerCase3, "vbox", false) || StringsKt.l(lowerCase4, "generic", false) || StringsKt.l(lowerCase5, "genymotion", false) || StringsKt.l(lowerCase6, "nox", false) || StringsKt.l(lowerCase7, "x86", false);
    }

    public final boolean isProxyEnabled(Context context) {
        Object objA;
        boolean zIsEnabled;
        Intrinsics.f(context, "context");
        try {
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                zIsEnabled = false;
            } else {
                LinkProperties linkProperties = connectivityManager.getLinkProperties(activeNetwork);
                zIsEnabled = isEnabled(linkProperties != null ? linkProperties.getHttpProxy() : null);
            }
            objA = Boolean.valueOf(zIsEnabled);
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        Object obj = Boolean.FALSE;
        if (objA instanceof Result.Failure) {
            objA = obj;
        }
        return ((Boolean) objA).booleanValue();
    }

    public final boolean isVpnConnected(Context context) {
        Object objA;
        Intrinsics.f(context, "context");
        try {
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network[] allNetworks = connectivityManager.getAllNetworks();
            Intrinsics.e(allNetworks, "cm.allNetworks");
            boolean z2 = false;
            for (Network network : allNetworks) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                    z2 = true;
                    break;
                }
            }
            objA = Boolean.valueOf(z2);
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        Object obj = Boolean.FALSE;
        if (objA instanceof Result.Failure) {
            objA = obj;
        }
        return ((Boolean) objA).booleanValue();
    }
}
