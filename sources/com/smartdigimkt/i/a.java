package com.smartdigimkt.i;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class a extends WebChromeClient {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f35786b = "CommonWebChromeClient";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<WebChromeClient> f35787a = new CopyOnWriteArrayList<>();

    public void a(WebChromeClient webChromeClient) {
        this.f35787a.add(webChromeClient);
    }

    public void b(WebChromeClient webChromeClient) {
        this.f35787a.remove(webChromeClient);
    }

    @Override // android.webkit.WebChromeClient
    public Bitmap getDefaultVideoPoster() {
        return super.getDefaultVideoPoster();
    }

    @Override // android.webkit.WebChromeClient
    public View getVideoLoadingProgressView() {
        return super.getVideoLoadingProgressView();
    }

    @Override // android.webkit.WebChromeClient
    public void getVisitedHistory(ValueCallback<String[]> valueCallback) {
        super.getVisitedHistory(valueCallback);
    }

    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(WebView webView) {
        Iterator<WebChromeClient> it = this.f35787a.iterator();
        while (it.hasNext()) {
            it.next().onCloseWindow(webView);
        }
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public void onConsoleMessage(String str, int i2, String str2) {
        Iterator<WebChromeClient> it = this.f35787a.iterator();
        while (it.hasNext()) {
            it.next().onConsoleMessage(str, i2, str2);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z2, boolean z3, Message message) {
        Iterator<WebChromeClient> it = this.f35787a.iterator();
        boolean zOnCreateWindow = false;
        while (it.hasNext()) {
            zOnCreateWindow = it.next().onCreateWindow(webView, z2, z3, message);
        }
        return zOnCreateWindow;
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        Iterator<WebChromeClient> it = this.f35787a.iterator();
        while (it.hasNext()) {
            it.next().onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsHidePrompt() {
        Iterator<WebChromeClient> it = this.f35787a.iterator();
        while (it.hasNext()) {
            it.next().onGeolocationPermissionsHidePrompt();
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        Iterator<WebChromeClient> it = this.f35787a.iterator();
        while (it.hasNext()) {
            it.next().onGeolocationPermissionsShowPrompt(str, callback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        Iterator<WebChromeClient> it = this.f35787a.iterator();
        while (it.hasNext()) {
            it.next().onHideCustomView();
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        Iterator<WebChromeClient> it = this.f35787a.iterator();
        boolean zOnJsAlert = false;
        while (it.hasNext()) {
            zOnJsAlert = it.next().onJsAlert(webView, str, str2, jsResult);
        }
        return zOnJsAlert;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        Iterator<WebChromeClient> it = this.f35787a.iterator();
        boolean zOnJsBeforeUnload = false;
        while (it.hasNext()) {
            zOnJsBeforeUnload = it.next().onJsBeforeUnload(webView, str, str2, jsResult);
        }
        return zOnJsBeforeUnload;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        Iterator<WebChromeClient> it = this.f35787a.iterator();
        boolean zOnJsConfirm = false;
        while (it.hasNext()) {
            zOnJsConfirm = it.next().onJsConfirm(webView, str, str2, jsResult);
        }
        return zOnJsConfirm;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        Iterator<WebChromeClient> it = this.f35787a.iterator();
        boolean zOnJsPrompt = false;
        while (it.hasNext()) {
            zOnJsPrompt = it.next().onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }
        return zOnJsPrompt;
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public boolean onJsTimeout() {
        Iterator<WebChromeClient> it = this.f35787a.iterator();
        boolean zOnJsTimeout = false;
        while (it.hasNext()) {
            zOnJsTimeout = it.next().onJsTimeout();
        }
        return zOnJsTimeout;
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        try {
            Iterator<WebChromeClient> it = this.f35787a.iterator();
            while (it.hasNext()) {
                it.next().onPermissionRequest(permissionRequest);
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        try {
            Iterator<WebChromeClient> it = this.f35787a.iterator();
            while (it.hasNext()) {
                it.next().onPermissionRequestCanceled(permissionRequest);
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i2) {
        Iterator<WebChromeClient> it = this.f35787a.iterator();
        while (it.hasNext()) {
            it.next().onProgressChanged(webView, i2);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        Iterator<WebChromeClient> it = this.f35787a.iterator();
        while (it.hasNext()) {
            it.next().onReceivedIcon(webView, bitmap);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        Iterator<WebChromeClient> it = this.f35787a.iterator();
        while (it.hasNext()) {
            it.next().onReceivedTitle(webView, str);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTouchIconUrl(WebView webView, String str, boolean z2) {
        Iterator<WebChromeClient> it = this.f35787a.iterator();
        while (it.hasNext()) {
            it.next().onReceivedTouchIconUrl(webView, str, z2);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onRequestFocus(WebView webView) {
        Iterator<WebChromeClient> it = this.f35787a.iterator();
        while (it.hasNext()) {
            it.next().onRequestFocus(webView);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        Iterator<WebChromeClient> it = this.f35787a.iterator();
        while (it.hasNext()) {
            it.next().onShowCustomView(view, customViewCallback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        boolean zOnShowFileChooser = false;
        try {
            Iterator<WebChromeClient> it = this.f35787a.iterator();
            while (it.hasNext()) {
                zOnShowFileChooser = it.next().onShowFileChooser(webView, valueCallback, fileChooserParams);
            }
            return zOnShowFileChooser;
        } catch (Exception e2) {
            e2.getMessage();
            return false;
        }
    }

    @Deprecated
    public void a(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
        for (WebChromeClient webChromeClient : this.f35787a) {
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        Iterator<WebChromeClient> it = this.f35787a.iterator();
        boolean zOnConsoleMessage = false;
        while (it.hasNext()) {
            zOnConsoleMessage = it.next().onConsoleMessage(consoleMessage);
        }
        return zOnConsoleMessage;
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public void onShowCustomView(View view, int i2, WebChromeClient.CustomViewCallback customViewCallback) {
        Iterator<WebChromeClient> it = this.f35787a.iterator();
        while (it.hasNext()) {
            it.next().onShowCustomView(view, i2, customViewCallback);
        }
    }
}
