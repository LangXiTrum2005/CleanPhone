package com.applovin.impl;

import android.os.Parcel;
import com.applovin.shadow.okio.Path;
import com.google.android.gms.internal.ads.is1;
import com.google.android.gms.internal.ads.v71;
import com.google.android.gms.internal.ads.wh0;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class ca {
    public static /* synthetic */ int a(Object obj) {
        if (obj instanceof String) {
            return 2;
        }
        if (obj instanceof Boolean) {
            return 1;
        }
        if (obj instanceof Long) {
            return 3;
        }
        if (obj instanceof Double) {
            return 4;
        }
        throw new AssertionError("invalid tag type: ".concat(String.valueOf(obj.getClass())));
    }

    public static /* synthetic */ String b(int i10) {
        switch (i10) {
            case 1:
                return "api-call";
            case 2:
                return "dynamite-enter";
            case 3:
                return "read-from-disk-start";
            case 4:
                return "read-from-disk-end";
            case 5:
                return "client-signals-start";
            case 6:
                return "client-signals-end";
            case 7:
                return "service-connected";
            case 8:
                return "gms-signals-start";
            case 9:
                return "gms-signals-end";
            case 10:
                return "get-signals-sdkcore-start";
            case 11:
                return "get-signals-sdkcore-end";
            case 12:
                return "get-ad-dictionary-sdkcore-start";
            case 13:
                return "get-ad-dictionary-sdkcore-end";
            case 14:
                return "http-response-ready";
            case 15:
                return "scar-preloader-ready";
            case 16:
                return "scar-preloader-processing-done";
            case 17:
                return "normalize-ad-response-start";
            case 18:
                return "normalize-ad-response-end";
            case 19:
                return "binder-call-start";
            case 20:
                return "server-response-parse-start";
            case 21:
                return "rendering-start";
            case 22:
                return "public-api-callback";
            case 23:
                return "rendering-native-ads-native-js-webview-start";
            case 24:
                return "rendering-native-ads-preprocess-start";
            case 25:
                return "rendering-native-ads-preprocess-end";
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                return "rendering-native-assets-loading-start";
            case 27:
                return "rendering-native-assets-loading-end";
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                return "rendering-webview-creation-start";
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                return "rendering-webview-creation-end";
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                return "rendering-ad-component-creation-end";
            case 31:
                return "rendering-configure-webview-start";
            case 32:
                return "rendering-configure-webview-end";
            case 33:
                return "rendering-webview-load-html-start";
            case 34:
                return "rendering-webview-load-html-end";
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                return "type2-fetch-start";
            case 36:
                return "type2-fetch-end";
            case 37:
                return "sod-validation-start";
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                return "sod-validation-end";
            case 39:
                return "sod-cache-key-start";
            case 40:
                return "sod-cache-key-end";
            case 41:
                return "sod-read-and-remove-start";
            case 42:
                return "sod-read-and-remove-end";
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                return "sod-decode-start";
            case 44:
                return "sod-decode-end";
            case 45:
                return "native-assets-loading-basic-start";
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                return "native-assets-loading-basic-end";
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                return "native-assets-loading-image-start";
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                return "native-assets-loading-image-end";
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                return "native-assets-loading-image-composition-start";
            case 50:
                return "native-assets-loading-image-composition-end";
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                return "native-assets-loading-logo-start";
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                return "native-assets-loading-logo-end";
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                return "native-assets-loading-icon-start";
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                return "native-assets-loading-icon-end";
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                return "native-assets-loading-attribution-start";
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                return "native-assets-loading-attribution-end";
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                return "native-assets-loading-video-start";
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                return "native-assets-loading-video-end";
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                return "native-assets-loading-video-composition-start";
            case 60:
                return "native-assets-loading-media-start";
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                return "native-assets-loading-media-end";
            case 62:
                return "native-assets-loading-custom-start";
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                return "native-assets-loading-custom-end";
            case 64:
                return "native-assets-loading-omid-start";
            case 65:
                return "native-assets-loading-omid-end";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String c(int i10) {
        if (i10 == 1) {
            return "htmlDisplay";
        }
        if (i10 == 2) {
            return "nativeDisplay";
        }
        if (i10 == 3) {
            return "video";
        }
        throw null;
    }

    public static /* synthetic */ String d(int i10) {
        if (i10 == 1) {
            return "beginToRender";
        }
        if (i10 == 2) {
            return "definedByJavascript";
        }
        if (i10 == 3) {
            return "onePixel";
        }
        if (i10 == 4) {
            return "unspecified";
        }
        throw null;
    }

    public static int e(int i10, int i11) {
        return String.valueOf(i10).length() + i11;
    }

    public static int f(int i10, int i11, int i12) {
        int i13 = i10 / i11;
        return i13 + i13 + i12;
    }

    public static int g(int i10, int i11, int i12, int i13) {
        return ((i10 + i11) - i12) + i13;
    }

    public static int h(int i10, int i11, int i12, int i13, int i14) {
        return i10 + i11 + i12 + i13 + i14;
    }

    public static int i(int i10, int i11, String str) {
        return str.length() + i10 + i11;
    }

    public static int j(long j10, int i10, int i11) {
        return (Long.hashCode(j10) + i10) * i11;
    }

    public static z4 k(String str, long j10, TimeUnit timeUnit) {
        return z4.a(str, Long.valueOf(timeUnit.toMillis(j10)));
    }

    public static String l(Path path, String str) {
        return str + path;
    }

    public static String m(StringBuilder sb2, String str, int i10, String str2) {
        sb2.append(str);
        sb2.append(i10);
        sb2.append(str2);
        return sb2.toString();
    }

    public static HashMap n(String str, String str2) {
        HashMap map = new HashMap();
        map.put(str, str2);
        return map;
    }

    public static s9.a o(Parcel parcel) {
        s9.a aVarX1 = s9.b.x1(parcel.readStrongBinder());
        parcel.recycle();
        return aVarX1;
    }

    public static void p(int i10, int i11, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(str);
        sb2.append(i11);
        v71.y(str2, sb2.toString());
    }

    public static void q(String str, String str2, String str3) {
        v71.y(str3, str2.concat(String.valueOf(str)));
    }

    public static void r(StringBuilder sb2, String str, int i10, String str2) {
        sb2.append(str);
        sb2.append(i10);
        v71.y(str2, sb2.toString());
    }

    public static void s(p9.b bVar, wh0 wh0Var, String str) {
        bVar.getClass();
        wh0Var.c(System.currentTimeMillis(), str);
    }

    public static int t(int i10, int i11, int i12) {
        return is1.p(i10) + i11 + i12;
    }

    public static int u(int i10, int i11, int i12, int i13) {
        return is1.p(i10) + i11 + i12 + i13;
    }

    public static int v(int i10, int i11, int i12, int i13, int i14) {
        return Math.max(((i10 * i11) / i12) + i13, i14);
    }

    public static int w(int i10, int i11, int i12) {
        return com.google.android.gms.internal.consent_sdk.o5.i(i10) + i11 + i12;
    }

    public static int x(int i10, int i11, int i12, int i13) {
        return com.google.android.gms.internal.consent_sdk.o5.i(i10) + i11 + i12 + i13;
    }

    public static int y(int i10, int i11, int i12) {
        return com.google.android.gms.internal.measurement.x0.p(i10) + i11 + i12;
    }

    public static /* synthetic */ String z(int i10) {
        if (i10 == 1) {
            return "HTML_DISPLAY";
        }
        if (i10 != 2) {
            return i10 != 3 ? "null" : "VIDEO";
        }
        return "NATIVE_DISPLAY";
    }
}
