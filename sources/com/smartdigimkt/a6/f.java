package com.smartdigimkt.a6;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Process;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.v0.k;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes5.dex */
public class f {

    public class a extends WebChromeClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebChromeClient f33715a;

        public a(WebChromeClient webChromeClient) {
            this.f33715a = webChromeClient;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            WebChromeClient webChromeClient = this.f33715a;
            if (webChromeClient != null) {
                webChromeClient.onConsoleMessage(consoleMessage);
            }
            return super.onConsoleMessage(consoleMessage);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            jsResult.confirm();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
            jsResult.confirm();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            jsResult.confirm();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            jsPromptResult.confirm();
            return true;
        }
    }

    public class b implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ GeolocationPermissions.Callback f33716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f33717b;

        public b(GeolocationPermissions.Callback callback, String str) {
            this.f33716a = callback;
            this.f33717b = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            GeolocationPermissions.Callback callback = this.f33716a;
            if (callback != null) {
                callback.invoke(this.f33717b, false, false);
            }
        }
    }

    public class c implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ GeolocationPermissions.Callback f33718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f33719b;

        public c(GeolocationPermissions.Callback callback, String str) {
            this.f33718a = callback;
            this.f33719b = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            GeolocationPermissions.Callback callback = this.f33718a;
            if (callback != null) {
                callback.invoke(this.f33719b, true, false);
            }
        }
    }

    public static void a(WebView webView, boolean z2) {
        if (z2) {
            webView.stopLoading();
            webView.loadUrl("");
        }
        webView.onPause();
    }

    public static void b(WebView webView) {
        a(webView, (WebChromeClient) null);
    }

    public static void a(WebView webView, WebChromeClient webChromeClient) {
        webView.setWebChromeClient(new a(webChromeClient));
    }

    public static void a() {
        CookieManager cookieManager = CookieManager.getInstance();
        if (com.smartdigimkt.s6.d.a(com.smartdigimkt.m6.b.p().k()).a()) {
            cookieManager.setAcceptCookie(true);
            CookieManager.setAcceptFileSchemeCookies(true);
            return;
        }
        cookieManager.setAcceptCookie(false);
        CookieManager.setAcceptFileSchemeCookies(false);
        cookieManager.removeSessionCookies(null);
        cookieManager.removeAllCookies(null);
        cookieManager.flush();
    }

    public static void a(WebView webView) {
        if (webView == null) {
            return;
        }
        CookieManager.getInstance().setAcceptThirdPartyCookies(webView, com.smartdigimkt.s6.d.a(webView.getContext()).a());
    }

    public static void a(WebView webView, Context context, com.smartdigimkt.b6.b bVar) {
        WebSettings settings = webView.getSettings();
        webView.setHorizontalScrollBarEnabled(false);
        webView.setVerticalScrollBarEnabled(false);
        webView.setVerticalScrollBarEnabled(false);
        webView.requestFocus();
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(-1);
        settings.setAllowFileAccess(false);
        settings.setBuiltInZoomControls(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setSavePassword(false);
        settings.setDatabaseEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setMediaPlaybackRequiresUserGesture(false);
        try {
            settings.setMixedContentMode(1);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            Method declaredMethod = WebSettings.class.getDeclaredMethod(com.smartdigimkt.n8.b.a("c2V0TWl4ZWRDb250ZW50TW9kZQ=="), Integer.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(settings, 0);
        } catch (Throwable unused) {
        }
        try {
            Method declaredMethod2 = WebSettings.class.getDeclaredMethod("setDisplayZoomControls", Boolean.TYPE);
            declaredMethod2.setAccessible(true);
            declaredMethod2.invoke(settings, Boolean.FALSE);
        } catch (Exception unused2) {
        }
        settings.setDatabaseEnabled(true);
        String path = context.getDir("database", 0).getPath();
        settings.setDatabasePath(path);
        settings.setGeolocationEnabled(true);
        settings.setGeolocationDatabasePath(path);
        webView.setWebViewClient(new com.smartdigimkt.b6.a(bVar));
    }

    public static void a(Context context) {
        CookieSyncManager.createInstance(context);
        CookieSyncManager.getInstance().startSync();
    }

    public static void a(Context context, String str, GeolocationPermissions.Callback callback) {
        try {
            com.smartdigimkt.s6.c cVarB = com.smartdigimkt.m6.b.p().b();
            if (cVarB != null && cVarB.onGeolocationPermissionsShowPrompt(str, callback)) {
                return;
            }
        } catch (Throwable unused) {
        }
        try {
            if (context.checkPermission("android.permission.ACCESS_FINE_LOCATION", Process.myPid(), Process.myUid()) == 0) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context, h.a(context, "system_dialog", "style"));
                builder.setMessage(context.getString(h.a(context, "location_ask_title", k.f38992h))).setCancelable(true).setPositiveButton(context.getString(h.a(context, "location_allow", k.f38992h)), new c(callback, str)).setNegativeButton(context.getString(h.a(context, "location_deny", k.f38992h)), new b(callback, str));
                builder.create().show();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
