package com.smartdigimkt.x1;

import android.text.TextUtils;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.g1.d;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f39863a = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f39864b = 2000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f39865c = 3000;
    public static final int d = 3000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f39866e = 5000;
    public static final int f = 6000;
    private static final int g = 600;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f39867h = 700;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f39868i = 800;
    private static final int j = 900;

    public static int a(int i2, String str) {
        int i3;
        try {
            if (!TextUtils.isEmpty(str)) {
                if (str.startsWith("errorCode: ") && str.length() > 16) {
                    return Integer.parseInt(str.substring(11, 15));
                }
                if (str.equals("do not have sorceList")) {
                    i3 = IronSourceError.ERROR_BN_LOAD_AFTER_LONG_INITIATION;
                } else if (str.equals("Network error,UnknownHostException")) {
                    i3 = IronSourceError.ERROR_BN_INIT_FAILED_AFTER_LOAD;
                } else if (str.equals("v3 is timeout")) {
                    i3 = IronSourceError.ERROR_BN_LOAD_WHILE_LONG_INITIATION;
                } else if (str.equals("Current unit is loading!") || str.equals("current unit is loading")) {
                    i3 = IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED;
                } else if (str.equals("Network error,I/O exception response null")) {
                    i3 = IronSourceError.ERROR_BN_LOAD_EXCEPTION;
                } else if (str.equals("Network error,ConnectException")) {
                    i3 = 606;
                } else if (str.equals("Network error,socket timeout exception")) {
                    i3 = IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT;
                } else if (str.equals("Network error,disconnected network exception")) {
                    i3 = 608;
                } else if (str.equals("Network error,timeout exception")) {
                    i3 = IronSourceError.ERROR_BN_INSTANCE_RELOAD_TIMEOUT;
                } else if (str.startsWith("Network error,please check state code")) {
                    i3 = 610;
                } else if (str.equals("Network error,I/O exception contents null")) {
                    i3 = IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_ADAPTER;
                } else if (str.equals("Network unknown error")) {
                    i3 = IronSourceError.ERROR_BN_INSTANCE_INIT_EXCEPTION;
                } else if (str.equals("Network error,I/O exception")) {
                    i3 = IronSourceError.ERROR_BN_RELOAD_SKIP_INVISIBLE;
                } else if (str.equals("web env is not support")) {
                    i3 = IronSourceError.ERROR_BN_RELOAD_SKIP_BACKGROUND;
                } else if (str.equals("Network error,unknown")) {
                    i3 = IronSourceError.ERROR_BN_LOAD_NO_CONFIG;
                } else if (str.equals("Network error，sslp exception")) {
                    i3 = IronSourceError.ERROR_BN_UNSUPPORTED_SIZE;
                } else if (str.startsWith("Cast exception, return data")) {
                    i3 = IronSourceError.ERROR_BN_BANNER_CONTAINER_IS_NULL;
                } else if (str.equals("REQUEST_TIMEOUT")) {
                    i3 = IronSourceError.ERROR_NT_LOAD_AFTER_LONG_INITIATION;
                } else if (str.startsWith("The server returns an exception")) {
                    i3 = IronSourceError.ERROR_NT_INIT_FAILED_AFTER_LOAD;
                } else if (str.equals(d.f35347U) || str.equals("Need show campaign list is NULL!")) {
                    i3 = IronSourceError.ERROR_NT_LOAD_WHILE_LONG_INITIATION;
                } else if (str.startsWith("load no ad")) {
                    i3 = 704;
                } else if (str.equals("EXCEPTION_UNIT_NOT_FOUND_IN_APP")) {
                    i3 = IronSourceError.ERROR_NT_LOAD_EXCEPTION;
                } else if (str.equals("EXCEPTION_UNIT_BIDDING_TYPE_ERROR")) {
                    i3 = IronSourceError.ERROR_NT_LOAD_NO_FILL;
                } else if (str.equals("No video campaign")) {
                    i3 = IronSourceError.ERROR_NT_INSTANCE_INIT_TIMEOUT;
                } else if (str.equals("EXCEPTION_RETURN_EMPTY")) {
                    i3 = IronSourceError.ERROR_NT_INSTANCE_LOAD_TIMEOUT;
                } else if (str.equals("EXCEPTION_APP_PLATFORM_ERROR")) {
                    i3 = 709;
                } else if (str.equals("EXCEPTION_SERVICE_REQUEST_OS_VERSION_REQUIRED")) {
                    i3 = 710;
                } else if (str.equals(com.smartdigimkt.x0.a.f39857c)) {
                    i3 = 801;
                } else if (str.equals("resource load timeout is tpl: false")) {
                    i3 = com.smartdigimkt.d2.a.s;
                } else if (str.startsWith("resource download failed")) {
                    i3 = 803;
                } else if (str.equals("temp preload success but isReady false")) {
                    i3 = 804;
                } else if (str.equals("temp resource download failed")) {
                    i3 = 805;
                } else if (str.equals("tpl temp resource download failed")) {
                    i3 = 806;
                } else if (str.equals("resource load timeout is tpl: true")) {
                    i3 = 807;
                } else if (str.startsWith("https://") || str.startsWith("http://")) {
                    i3 = 808;
                } else if (str.equals("mraid resource write fail")) {
                    i3 = 809;
                } else if (str.startsWith("data save failed:")) {
                    i3 = 810;
                } else if (str.equals("resource load timeout")) {
                    i3 = 811;
                } else if (str.startsWith("tpl temp preload failed")) {
                    i3 = 812;
                }
                return i2 + i3;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return i2;
    }

    public static int b(int i2, String str) {
        return i2 + 900;
    }
}
