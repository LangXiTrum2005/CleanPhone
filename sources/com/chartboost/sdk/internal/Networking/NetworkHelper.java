package com.chartboost.sdk.internal.Networking;

import com.chartboost.sdk.impl.za;
import com.p004ironsource.dc;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0003\u0010\bJ\u0015\u0010\u0003\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/chartboost/sdk/internal/Networking/NetworkHelper;", "", "", "a", "()Z", "", dc.r, "uri", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "urlString", "(Ljava/lang/String;)Ljava/lang/String;", "b", "Ljava/net/URL;", "c", "(Ljava/lang/String;)Ljava/net/URL;", "debugEndpoint", "Ljava/lang/String;", "isForceSDKToAcceptAllSSLCertsEnabled", "Z", "<init>", "()V", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0})
public final class NetworkHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final NetworkHelper f15777a = new NetworkHelper();
    private static String debugEndpoint;
    private static boolean isForceSDKToAcceptAllSSLCertsEnabled;

    public final String a(String endpoint, String uri) {
        Intrinsics.f(endpoint, "endpoint");
        String str = debugEndpoint;
        if (str != null && str.length() != 0) {
            za.e("normalizedUrl: " + endpoint + " to: " + debugEndpoint, null);
            endpoint = debugEndpoint;
            Intrinsics.c(endpoint);
        }
        if (uri == null || uri.length() == 0) {
            uri = "";
        } else if (!StringsKt.M(uri, "/", false)) {
            uri = "/".concat(uri);
        }
        return android.support.v4.media.a.m(endpoint, uri);
    }

    public final String b(String urlString) {
        Intrinsics.f(urlString, "urlString");
        URL urlC = c(urlString);
        String path = null;
        if (urlC != null) {
            try {
                path = urlC.getPath();
            } catch (Exception e2) {
                za.a("getPathFromUrl: " + urlString + " : " + e2, null);
                path = "";
            }
        }
        return path == null ? "" : path;
    }

    public final URL c(String urlString) {
        Intrinsics.f(urlString, "urlString");
        if (urlString.length() > 0) {
            try {
                return new URL(urlString);
            } catch (Exception e2) {
                za.a("stringToURL: " + urlString + " : " + e2, null);
            }
        }
        return null;
    }

    public final String a(String urlString) {
        String str;
        Intrinsics.f(urlString, "urlString");
        URL urlC = c(urlString);
        if (urlC == null) {
            return "";
        }
        try {
            str = urlC.getProtocol() + "://" + urlC.getHost();
        } catch (Exception e2) {
            za.a("getEndpointFromUrl: " + urlString + " : " + e2, null);
            str = "";
        }
        return str == null ? "" : str;
    }

    public static final boolean a() {
        return isForceSDKToAcceptAllSSLCertsEnabled;
    }
}
