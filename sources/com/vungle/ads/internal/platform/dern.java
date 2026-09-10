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
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.collections.polloi;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;

/* JADX INFO: compiled from: DeviceCheckUtils.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/vungle/ads/internal/platform/dern;", "", "<init>", "()V", "Landroid/net/ProxyInfo;", "", "isEnabled", "(Landroid/net/ProxyInfo;)Z", "isEmulator", "()Z", "Landroid/content/Context;", "context", "isVpnConnected", "(Landroid/content/Context;)Z", "hasSystemAlertWindowPermission", "", "getSensorCount", "(Landroid/content/Context;)I", "isProxyEnabled", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class dern {
    public static final dern INSTANCE = new dern();

    private dern() {
    }

    private final boolean isEnabled(ProxyInfo proxyInfo) {
        if (proxyInfo == null) {
            return false;
        }
        String host = proxyInfo.getHost();
        return (host != null && host.length() > 0 && proxyInfo.getPort() > 0) || (proxyInfo.getPacFileUrl() != null && !Intrinsics.wireman(proxyInfo.getPacFileUrl(), Uri.EMPTY));
    }

    public final int getSensorCount(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("sensor");
        Intrinsics.competently(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        return ((SensorManager) systemService).getSensorList(-1).size();
    }

    public final boolean hasSystemAlertWindowPermission(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Settings.canDrawOverlays(context);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    /* JADX WARN: Code duplicated, block: B:21:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:6:0x0013  */
    public final boolean isEmulator() {
        String lowerCase;
        String lowerCase2;
        String lowerCase3;
        String lowerCase4;
        String lowerCase5;
        String str = Build.FINGERPRINT;
        String str2 = "";
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (lowerCase == null) {
                lowerCase = "";
            }
        } else {
            lowerCase = "";
        }
        String str3 = Build.MODEL;
        if (str3 != null) {
            lowerCase2 = str3.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (lowerCase2 == null) {
                lowerCase2 = "";
            }
        } else {
            lowerCase2 = "";
        }
        String str4 = Build.PRODUCT;
        if (str4 != null) {
            lowerCase3 = str4.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (lowerCase3 == null) {
                lowerCase3 = "";
            }
        } else {
            lowerCase3 = "";
        }
        String str5 = Build.BRAND;
        if (str5 != null) {
            lowerCase4 = str5.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (lowerCase4 == null) {
                lowerCase4 = "";
            }
        } else {
            lowerCase4 = "";
        }
        String str6 = Build.MANUFACTURER;
        if (str6 != null) {
            lowerCase5 = str6.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase5, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (lowerCase5 == null) {
                lowerCase5 = "";
            }
        } else {
            lowerCase5 = "";
        }
        String str7 = Build.BOARD;
        if (str7 != null) {
            String lowerCase6 = str7.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase6, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (lowerCase6 != null) {
                str2 = lowerCase6;
            }
        }
        String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
        Intrinsics.checkNotNullExpressionValue(SUPPORTED_ABIS, "SUPPORTED_ABIS");
        String lowerCase7 = polloi.lerp(SUPPORTED_ABIS, null, null, null, 0, null, null, 63, null).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase7, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return StringsKt.overspeculate(lowerCase, "generic", false, 2, null) || StringsKt.overspeculate(lowerCase, "emulator", false, 2, null) || StringsKt.overspeculate(lowerCase2, "google_sdk", false, 2, null) || StringsKt.overspeculate(lowerCase2, "emulator", false, 2, null) || StringsKt.overspeculate(lowerCase3, "sdk", false, 2, null) || StringsKt.overspeculate(lowerCase3, "vbox", false, 2, null) || StringsKt.overspeculate(lowerCase4, "generic", false, 2, null) || StringsKt.overspeculate(lowerCase5, "genymotion", false, 2, null) || StringsKt.overspeculate(str2, "nox", false, 2, null) || StringsKt.overspeculate(lowerCase7, "x86", false, 2, null);
    }

    public final boolean isProxyEnabled(Context context) {
        Object objM3351constructorimpl;
        boolean zIsEnabled;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Result.Companion companion = Result.INSTANCE;
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.competently(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                zIsEnabled = false;
            } else {
                Intrinsics.checkNotNullExpressionValue(activeNetwork, "cm.activeNetwork ?: return@runCatching false");
                LinkProperties linkProperties = connectivityManager.getLinkProperties(activeNetwork);
                zIsEnabled = isEnabled(linkProperties != null ? linkProperties.getHttpProxy() : null);
            }
            objM3351constructorimpl = Result.m3351constructorimpl(Boolean.valueOf(zIsEnabled));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m3356isFailureimpl(objM3351constructorimpl)) {
            objM3351constructorimpl = bool;
        }
        return ((Boolean) objM3351constructorimpl).booleanValue();
    }

    public final boolean isVpnConnected(Context context) {
        Object objM3351constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Result.Companion companion = Result.INSTANCE;
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.competently(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network[] allNetworks = connectivityManager.getAllNetworks();
            Intrinsics.checkNotNullExpressionValue(allNetworks, "cm.allNetworks");
            boolean z = false;
            for (Network network : allNetworks) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                    z = true;
                    break;
                }
            }
            objM3351constructorimpl = Result.m3351constructorimpl(Boolean.valueOf(z));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m3356isFailureimpl(objM3351constructorimpl)) {
            objM3351constructorimpl = bool;
        }
        return ((Boolean) objM3351constructorimpl).booleanValue();
    }
}
