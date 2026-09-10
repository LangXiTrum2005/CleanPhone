package com.smartdigimkt.s4;

import android.webkit.WebView;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f38182a = "placementType";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38183b = "state";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f38184c = "viewable";
    public static final String d = "currentAppOrientation";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f38185e = "loading";
    public static final String f = "default";
    public static final String g = "expanded";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f38186h = "hidden";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f38187i = "resized";
    public static final String j = "Interstitial";
    public static final String k = "inline";

    /* JADX INFO: renamed from: com.smartdigimkt.s4.a$a, reason: collision with other inner class name */
    public static class C0582a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f38188a = new a();

        private C0582a() {
        }
    }

    public static a a() {
        return C0582a.f38188a;
    }

    public void b(WebView webView, float f2, float f3) {
        a(webView, String.format(Locale.US, "javascript:window.mraidbridge.setScreenSize(%.1f, %.1f);", Float.valueOf(f2), Float.valueOf(f3)));
    }

    public void c(WebView webView, float f2, float f3) {
        a(webView, String.format(Locale.US, "javascript:window.mraidbridge.notifySizeChangeEvent(%.1f, %.1f);", Float.valueOf(f2), Float.valueOf(f3)));
    }

    public void d(WebView webView, String str) {
        try {
            str = URLEncoder.encode(str, "UTF-8");
        } catch (Throwable unused) {
        }
        a(webView, android.support.v4.media.a.n("javascript:window.mraidbridge.setPlacementType(", str, ");"));
    }

    public void a(WebView webView) {
        a(webView, "javascript:window.mraidbridge.fireReadyEvent();");
    }

    public void a(WebView webView, Map<String, Object> map) {
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
        a(webView, android.support.v4.media.a.n("javascript:window.mraidbridge.fireChangeEvent(", string, ");"));
    }

    public void b(WebView webView, float f2, float f3, float f4, float f5) {
        a(webView, String.format(Locale.US, "javascript:window.mraidbridge.setDefaultPosition(%.1f, %.1f, %.1f, %.1f);", Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)));
    }

    public void c(WebView webView, String str) {
        try {
            str = URLEncoder.encode(str, "UTF-8");
        } catch (Throwable unused) {
        }
        a(webView, android.support.v4.media.a.n("javascript:window.mraidbridge.setIsViewable(", str, ");"));
    }

    public void b(WebView webView, String str) {
        try {
            str = URLEncoder.encode(str, "UTF-8");
        } catch (Throwable unused) {
        }
        a(webView, android.support.v4.media.a.n("javascript:window.mraidbridge.nativeCallComplete('", str, "');"));
    }

    public void a(WebView webView, String str, String str2) {
        try {
            str2 = URLEncoder.encode(str2, "UTF-8");
            str = URLEncoder.encode(str, "UTF-8");
        } catch (Throwable unused) {
        }
        a(webView, String.format("javascript:window.mraidbridge.fireErrorEvent('%1s', '%2s');", str2, str));
    }

    public void a(WebView webView, double d2) {
        Locale locale = Locale.US;
        a(webView, "javascript:window.mraidbridge.audioVolumeChange(" + d2 + ");");
    }

    public void a(WebView webView, float f2, float f3) {
        a(webView, String.format(Locale.US, "javascript:window.mraidbridge.setMaxSize(%.1f, %.1f);", Float.valueOf(f2), Float.valueOf(f3)));
    }

    public void a(WebView webView, float f2, float f3, float f4, float f5) {
        a(webView, String.format(Locale.US, "javascript:window.mraidbridge.setCurrentPosition(%.1f, %.1f, %.1f, %.1f);", Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)));
    }

    private void a(WebView webView, String str) {
        if (webView != null) {
            try {
                webView.loadUrl(str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
