package com.applovin.impl;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p8 {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(WebView webView) {
        ViewParent parent = webView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(webView);
        }
        webView.removeAllViews();
        webView.loadUrl(AndroidWebViewClient.BLANK_PAGE);
        webView.onPause();
        webView.destroyDrawingCache();
        webView.destroy();
    }

    public static void b(WebView webView) {
        if (webView == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new t9(webView, 1));
    }

    public static String c(String str, Map map) {
        String str2;
        str.getClass();
        if (str.equals("com.applovin.external_redirect_success")) {
            str2 = "success";
        } else {
            if (!str.equals("com.applovin.external_redirect_failure")) {
                return null;
            }
            str2 = "failure";
        }
        return a("al_onExternalRedirectEvent", str2, map);
    }

    public static String d(String str, Map map) {
        String str2;
        str.getClass();
        if (str.equals("com.applovin.preload_success")) {
            str2 = "success";
        } else {
            if (!str.equals("com.applovin.preload_failure")) {
                return null;
            }
            str2 = "failure";
        }
        return a("al_onPreloadEvent", str2, map);
    }

    public static String b(String str, Map map) {
        String str2;
        str.getClass();
        switch (str) {
            case "com.applovin.custom_tabs_failure":
                str2 = "failure";
                break;
            case "com.applovin.custom_tabs_hidden":
                str2 = "hidden";
                break;
            case "com.applovin.custom_tabs_shown":
                str2 = "shown";
                break;
            default:
                return null;
        }
        return a("al_onInAppBrowserEvent", str2, map);
    }

    public static String a(String str, Map map) {
        String str2;
        str.getClass();
        if (str.equals("com.applovin.custom_intent_launch_failure")) {
            str2 = "failure";
        } else {
            if (!str.equals("com.applovin.custom_intent_launch_success")) {
                return null;
            }
            str2 = "success";
        }
        return a("al_onCustomIntentLaunchEvent", str2, map);
    }

    public static String a(Map map) {
        return a("al_onWindowInsetsInfoCollectedEvent", "success", map);
    }

    private static String a(String str, String str2, Map map) {
        JSONObject jSONObject;
        try {
            jSONObject = CollectionUtils.toJson(map);
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        StringBuilder sbV = defpackage.e.v("javascript:", str, "('", str2, "',");
        sbV.append(jSONObject);
        sbV.append(");");
        return sbV.toString();
    }

    public static void a(WebView webView, String str, String str2, com.applovin.impl.sdk.l lVar) {
        if (webView == null) {
            return;
        }
        try {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().a(str2, "Forwarding \"" + str + "\" to WebView");
            }
            AppLovinSdkUtils.runOnUiThread(new w9(webView, str, 0));
        } catch (Throwable th2) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().a(str2, "Unable to forward to WebView", th2);
            }
            lVar.E().a(str2, th2, CollectionUtils.hashMap("operation", str));
        }
    }

    public static void a(WebView webView, String str) {
        if (webView == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new w9(webView, str, 1));
    }

    public static u4 a(WebView webView, String str, com.applovin.impl.sdk.l lVar) {
        u4 u4Var = new u4("evaluateJavascript");
        if (webView == null) {
            return u4Var.a("null_webview");
        }
        AppLovinSdkUtils.runOnUiThread(new androidx.fragment.app.d(webView, str, u4Var, 17));
        Long l = (Long) lVar.a(z4.V2);
        if (l.longValue() > 0) {
            l6.a(l.longValue(), u4Var, "timed_out", "evaluateJavascriptTimeout", lVar);
            return u4Var;
        }
        u4Var.b(null);
        return u4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(WebView webView, String str, final u4 u4Var) {
        Objects.requireNonNull(u4Var);
        webView.evaluateJavascript(str, new ValueCallback() { // from class: com.applovin.impl.x9
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                u4Var.b((String) obj);
            }
        });
    }
}
