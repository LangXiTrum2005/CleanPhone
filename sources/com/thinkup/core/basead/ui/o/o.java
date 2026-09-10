package com.thinkup.core.basead.ui.o;

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
import com.smartdigimkt.v0.k;
import com.thinkup.core.basead.ui.web.m;
import com.thinkup.core.common.n.o0m;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.n.oom;
import com.thinkup.core.common.ooo.mm;
import com.thinkup.core.common.ooo.o00;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public final class o {

    /* JADX INFO: renamed from: com.thinkup.core.basead.ui.o.o$1, reason: invalid class name */
    public class AnonymousClass1 extends WebChromeClient {
        final /* synthetic */ WebChromeClient o;

        public AnonymousClass1(WebChromeClient webChromeClient) {
            this.o = webChromeClient;
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            WebChromeClient webChromeClient = this.o;
            if (webChromeClient != null) {
                webChromeClient.onConsoleMessage(consoleMessage);
            }
            return super.onConsoleMessage(consoleMessage);
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            jsResult.confirm();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
            jsResult.confirm();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            jsResult.confirm();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            jsPromptResult.confirm();
            return true;
        }
    }

    private static void m(WebView webView) {
        CookieManager.getInstance().setAcceptThirdPartyCookies(webView, oom.o(webView.getContext()).m());
    }

    private static void o(WebView webView, boolean z2) {
        if (z2) {
            webView.stopLoading();
            webView.loadUrl("");
        }
        webView.onPause();
    }

    private static void o(WebView webView, WebChromeClient webChromeClient) {
        webView.setWebChromeClient(new AnonymousClass1(webChromeClient));
    }

    private static void o() {
        CookieManager cookieManager = CookieManager.getInstance();
        if (oom.o(o0n.m().on()).m()) {
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

    public static void o(WebView webView, Context context, m mVar) {
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
            Method declaredMethod = WebSettings.class.getDeclaredMethod(mm.m("c2V0TWl4ZWRDb250ZW50TW9kZQ=="), Integer.TYPE);
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
        webView.setWebViewClient(new com.thinkup.core.basead.ui.web.o(mVar));
    }

    private static void o(Context context) {
        CookieSyncManager.createInstance(context);
        CookieSyncManager.getInstance().startSync();
    }

    public static void o(Context context, final String str, final GeolocationPermissions.Callback callback) {
        try {
            o0m o0mVarN = o0n.m().n();
            if (o0mVarN != null && o0mVarN.onGeolocationPermissionsShowPrompt(str, callback)) {
                return;
            }
        } catch (Throwable unused) {
        }
        try {
            if (context.checkPermission("android.permission.ACCESS_FINE_LOCATION", Process.myPid(), Process.myUid()) == 0) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context, o00.o(context, "system_dialog", "style"));
                builder.setMessage(context.getString(o00.o(context, "location_ask_title", k.f38992h))).setCancelable(true).setPositiveButton(context.getString(o00.o(context, "location_allow", k.f38992h)), new DialogInterface.OnClickListener() { // from class: com.thinkup.core.basead.ui.o.o.3
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        GeolocationPermissions.Callback callback2 = callback;
                        if (callback2 != null) {
                            callback2.invoke(str, true, false);
                        }
                    }
                }).setNegativeButton(context.getString(o00.o(context, "location_deny", k.f38992h)), new DialogInterface.OnClickListener() { // from class: com.thinkup.core.basead.ui.o.o.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        GeolocationPermissions.Callback callback2 = callback;
                        if (callback2 != null) {
                            callback2.invoke(str, false, false);
                        }
                    }
                });
                builder.create().show();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void o(WebView webView) {
        webView.setWebChromeClient(new AnonymousClass1(null));
    }
}
