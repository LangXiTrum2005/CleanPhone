package com.thinkup.core.express.m;

import android.support.v4.media.a;
import android.webkit.WebView;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class o {
    public static final String m = "state";
    public static final String m0 = "hidden";
    public static final String mm = "Interstitial";
    public static final String mn = "inline";
    public static final String mo = "resized";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f42381n = "viewable";
    public static final String o = "placementType";
    public static final String o0 = "currentAppOrientation";
    public static final String om = "default";
    public static final String on = "expanded";
    public static final String oo = "loading";

    /* JADX INFO: renamed from: com.thinkup.core.express.m.o$o, reason: collision with other inner class name */
    public static class C0696o {
        private static final o o = new o();

        private C0696o() {
        }
    }

    private static void m(WebView webView, float f, float f2) {
        o0(webView, String.format(Locale.US, "javascript:window.mraidbridge.setScreenSize(%.1f, %.1f);", Float.valueOf(f), Float.valueOf(f2)));
    }

    private static void n(WebView webView, float f, float f2) {
        o0(webView, String.format(Locale.US, "javascript:window.mraidbridge.setMaxSize(%.1f, %.1f);", Float.valueOf(f), Float.valueOf(f2)));
    }

    private static o o() {
        return C0696o.o;
    }

    private static void o0(WebView webView, String str) {
        if (webView != null) {
            try {
                webView.loadUrl(str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private static void o(WebView webView) {
        o0(webView, "javascript:window.mraidbridge.fireReadyEvent();");
    }

    private static void m(WebView webView, float f, float f2, float f3, float f4) {
        o0(webView, String.format(Locale.US, "javascript:window.mraidbridge.setCurrentPosition(%.1f, %.1f, %.1f, %.1f);", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)));
    }

    private static void n(WebView webView, String str) {
        try {
            str = URLEncoder.encode(str, "UTF-8");
        } catch (Throwable unused) {
        }
        o0(webView, a.n("javascript:window.mraidbridge.setIsViewable(", str, ");"));
    }

    private static void o(WebView webView, Map<String, Object> map) {
        if (map == null || map.size() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        String string = jSONObject.toString();
        try {
            string = URLEncoder.encode(string, "UTF-8");
        } catch (Throwable unused) {
        }
        o0(webView, a.n("javascript:window.mraidbridge.fireChangeEvent(", string, ");"));
    }

    private static void m(WebView webView, String str) {
        try {
            str = URLEncoder.encode(str, "UTF-8");
        } catch (Throwable unused) {
        }
        o0(webView, a.n("javascript:window.mraidbridge.nativeCallComplete('", str, "');"));
    }

    private static void o(WebView webView, String str, String str2) {
        try {
            str2 = URLEncoder.encode(str2, "UTF-8");
            str = URLEncoder.encode(str, "UTF-8");
        } catch (Throwable unused) {
        }
        o0(webView, String.format("javascript:window.mraidbridge.fireErrorEvent('%1s', '%2s');", str2, str));
    }

    private static void o(WebView webView, float f, float f2) {
        o0(webView, String.format(Locale.US, "javascript:window.mraidbridge.notifySizeChangeEvent(%.1f, %.1f);", Float.valueOf(f), Float.valueOf(f2)));
    }

    private static void o(WebView webView, double d) {
        Locale locale = Locale.US;
        o0(webView, "javascript:window.mraidbridge.audioVolumeChange(" + d + ");");
    }

    private static void o(WebView webView, float f, float f2, float f3, float f4) {
        o0(webView, String.format(Locale.US, "javascript:window.mraidbridge.setDefaultPosition(%.1f, %.1f, %.1f, %.1f);", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)));
    }

    private static void o(WebView webView, String str) {
        try {
            str = URLEncoder.encode(str, "UTF-8");
        } catch (Throwable unused) {
        }
        o0(webView, a.n("javascript:window.mraidbridge.setPlacementType(", str, ");"));
    }
}
