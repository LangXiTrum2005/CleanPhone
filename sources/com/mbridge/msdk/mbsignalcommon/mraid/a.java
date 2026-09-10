package com.mbridge.msdk.mbsignalcommon.mraid;

import android.webkit.WebView;
import defpackage.e;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.mraid.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class C0152a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f34877a = new a();
    }

    public static a a() {
        return C0152a.f34877a;
    }

    public void b(WebView webView, float f10, float f11) {
        a(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setScreenSize(%.1f, %.1f);", Float.valueOf(f10), Float.valueOf(f11)));
    }

    public void c(WebView webView, float f10, float f11) {
        a(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.notifySizeChangeEvent(%.1f, %.1f);", Float.valueOf(f10), Float.valueOf(f11)));
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
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        String string = jSONObject.toString();
        try {
            string = URLEncoder.encode(string, "UTF-8");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        a(webView, e.o("javascript:window.mraidbridge.fireChangeEvent(", string, ");"));
    }

    public void b(WebView webView, float f10, float f11, float f12, float f13) {
        a(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setDefaultPosition(%.1f, %.1f, %.1f, %.1f);", Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(f12), Float.valueOf(f13)));
    }

    public void c(WebView webView, String str) {
        try {
            str = URLEncoder.encode(str, "UTF-8");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        a(webView, e.o("javascript:window.mraidbridge.setIsViewable(", str, ");"));
    }

    public void b(WebView webView, String str) {
        try {
            str = URLEncoder.encode(str, "UTF-8");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        a(webView, e.o("javascript:window.mraidbridge.nativeCallComplete('", str, "');"));
    }

    public void a(WebView webView, String str, String str2) {
        try {
            str2 = URLEncoder.encode(str2, "UTF-8");
            str = URLEncoder.encode(str, "UTF-8");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        a(webView, String.format("javascript:window.mraidbridge.fireErrorEvent('%1s', '%2s');", str2, str));
    }

    public void a(WebView webView, double d10) {
        Locale locale = Locale.CHINA;
        a(webView, "javascript:window.mraidbridge.audioVolumeChange(" + d10 + ");");
    }

    public void a(WebView webView, float f10, float f11) {
        a(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setMaxSize(%.1f, %.1f);", Float.valueOf(f10), Float.valueOf(f11)));
    }

    public void a(WebView webView, float f10, float f11, float f12, float f13) {
        a(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setCurrentPosition(%.1f, %.1f, %.1f, %.1f);", Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(f12), Float.valueOf(f13)));
    }

    private void a(WebView webView, String str) {
        if (webView != null) {
            try {
                webView.loadUrl(str);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }
}
