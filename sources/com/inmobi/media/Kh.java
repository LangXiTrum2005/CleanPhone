package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.inmobi.media.Kh;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class Kh extends WebChromeClient {
    public final /* synthetic */ GestureDetectorOnGestureListenerC2829ci a;

    public Kh(GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci) {
        this.a = gestureDetectorOnGestureListenerC2829ci;
    }

    public static final void a(JsResult jsResult, DialogInterface dialogInterface, int i) {
        jsResult.confirm();
    }

    public static final void b(JsResult jsResult, DialogInterface dialogInterface, int i) {
        jsResult.confirm();
    }

    public static final void c(JsResult jsResult, DialogInterface dialogInterface, int i) {
        jsResult.cancel();
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
        if (defaultVideoPoster != null) {
            return defaultVideoPoster;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage cm) {
        Intrinsics.checkNotNullParameter(cm, "cm");
        String str = cm.message() + " -- From line " + cm.lineNumber() + " of " + cm.sourceId();
        InterfaceC3072m9 interfaceC3072m9 = this.a.i;
        if (interfaceC3072m9 == null) {
            return true;
        }
        String str2 = GestureDetectorOnGestureListenerC2829ci.g1;
        Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$cp(...)");
        ((C3097n9) interfaceC3072m9).c(str2, "Console message:" + str);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(final String origin, final GeolocationPermissions.Callback callback) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (this.a.u.get() != null) {
            new AlertDialog.Builder((Context) this.a.u.get()).setTitle("Location Permission").setMessage("Allow location access").setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: adsuki.libyan
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Kh.a(callback, origin, dialogInterface, i);
                }
            }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: adsuki.deadwork
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Kh.b(callback, origin, dialogInterface, i);
                }
            }).create().show();
        }
        super.onGeolocationPermissionsShowPrompt(origin, callback);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView view, String url, String message, final JsResult result) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(result, "result");
        InterfaceC3072m9 interfaceC3072m9 = this.a.i;
        if (interfaceC3072m9 != null) {
            String str = GestureDetectorOnGestureListenerC2829ci.g1;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((C3097n9) interfaceC3072m9).a(str, "jsAlert called with: " + message + url);
        }
        if (!this.a.a(result)) {
            return true;
        }
        Activity fullScreenActivity = this.a.getFullScreenActivity();
        if (fullScreenActivity != null) {
            new AlertDialog.Builder(fullScreenActivity).setMessage(message).setTitle(url).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: adsuki.molet
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Kh.a(result, dialogInterface, i);
                }
            }).setCancelable(false).create().show();
            return true;
        }
        result.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView view, String url, String message, final JsResult result) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(result, "result");
        InterfaceC3072m9 interfaceC3072m9 = this.a.i;
        if (interfaceC3072m9 != null) {
            String str = GestureDetectorOnGestureListenerC2829ci.g1;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((C3097n9) interfaceC3072m9).a(str, "jsConfirm called with: " + message + url);
        }
        if (!this.a.a(result)) {
            return true;
        }
        if (this.a.getFullScreenActivity() != null) {
            new AlertDialog.Builder(this.a.getFullScreenActivity()).setMessage(message).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: adsuki.homozygous
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Kh.b(result, dialogInterface, i);
                }
            }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: adsuki.lampshade
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Kh.c(result, dialogInterface, i);
                }
            }).create().show();
            return true;
        }
        result.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView view, String url, String message, String defaultValue, JsPromptResult result) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(result, "result");
        InterfaceC3072m9 interfaceC3072m9 = this.a.i;
        if (interfaceC3072m9 != null) {
            String str = GestureDetectorOnGestureListenerC2829ci.g1;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((C3097n9) interfaceC3072m9).a(str, "jsPrompt called with: " + message + url);
        }
        if (!this.a.a(result)) {
            return true;
        }
        if (this.a.getFullScreenActivity() != null) {
            return false;
        }
        result.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        InterfaceC3072m9 interfaceC3072m9 = this.a.i;
        if (interfaceC3072m9 != null) {
            String str = GestureDetectorOnGestureListenerC2829ci.g1;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((C3097n9) interfaceC3072m9).c(str, "webview progress changed - " + i);
        }
        super.onProgressChanged(webView, i);
    }

    public static final void a(GeolocationPermissions.Callback callback, String str, DialogInterface dialogInterface, int i) {
        callback.invoke(str, true, false);
    }

    public static final void b(GeolocationPermissions.Callback callback, String str, DialogInterface dialogInterface, int i) {
        callback.invoke(str, false, false);
    }
}
