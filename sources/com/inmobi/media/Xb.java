package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.AbsoluteLayout;
import android.widget.FrameLayout;
import com.inmobi.media.Xb;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Xb extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3005ec f23348a;

    public Xb(GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec) {
        this.f23348a = gestureDetectorOnGestureListenerC3005ec;
    }

    public static final boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    public static final void b(JsResult result, DialogInterface dialogInterface, int i2) {
        Intrinsics.f(result, "$result");
        result.confirm();
    }

    public static final void c(JsResult result, DialogInterface dialogInterface, int i2) {
        Intrinsics.f(result, "$result");
        result.cancel();
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
        return defaultVideoPoster == null ? Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888) : defaultVideoPoster;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage cm) {
        Intrinsics.f(cm, "cm");
        String str = cm.message() + " -- From line " + cm.lineNumber() + " of " + cm.sourceId();
        InterfaceC3333z5 interfaceC3333z5 = this.f23348a.f23587i;
        if (interfaceC3333z5 == null) {
            return true;
        }
        String str2 = GestureDetectorOnGestureListenerC3005ec.a1;
        ((A5) interfaceC3333z5).c(str2, I6.a(str2, "access$getTAG$cp(...)", "Console message:", str));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(final String origin, final GeolocationPermissions.Callback callback) {
        Intrinsics.f(origin, "origin");
        Intrinsics.f(callback, "callback");
        if (this.f23348a.q.get() != null) {
            final int i2 = 0;
            AlertDialog.Builder positiveButton = new AlertDialog.Builder((Context) this.f23348a.q.get()).setTitle("Location Permission").setMessage("Allow location access").setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: A.P
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    switch (i2) {
                        case 0:
                            Xb.a(callback, origin, dialogInterface, i3);
                            break;
                        default:
                            Xb.b(callback, origin, dialogInterface, i3);
                            break;
                    }
                }
            });
            final int i3 = 1;
            positiveButton.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: A.P
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    switch (i3) {
                        case 0:
                            Xb.a(callback, origin, dialogInterface, i4);
                            break;
                        default:
                            Xb.b(callback, origin, dialogInterface, i4);
                            break;
                    }
                }
            }).create().show();
        }
        super.onGeolocationPermissionsShowPrompt(origin, callback);
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        a();
        super.onHideCustomView();
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView view, String url, String message, JsResult result) {
        Intrinsics.f(view, "view");
        Intrinsics.f(url, "url");
        Intrinsics.f(message, "message");
        Intrinsics.f(result, "result");
        InterfaceC3333z5 interfaceC3333z5 = this.f23348a.f23587i;
        if (interfaceC3333z5 != null) {
            String str = GestureDetectorOnGestureListenerC3005ec.a1;
            Intrinsics.e(str, "access$getTAG$cp(...)");
            ((A5) interfaceC3333z5).a(str, "jsAlert called with: " + message + url);
        }
        if (!GestureDetectorOnGestureListenerC3005ec.a(this.f23348a, result)) {
            return true;
        }
        Activity fullScreenActivity = this.f23348a.getFullScreenActivity();
        if (fullScreenActivity != null) {
            new AlertDialog.Builder(fullScreenActivity).setMessage(message).setTitle(url).setPositiveButton(R.string.ok, new A.O(result, 2)).setCancelable(false).create().show();
            return true;
        }
        result.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView view, String url, String message, JsResult result) {
        Intrinsics.f(view, "view");
        Intrinsics.f(url, "url");
        Intrinsics.f(message, "message");
        Intrinsics.f(result, "result");
        InterfaceC3333z5 interfaceC3333z5 = this.f23348a.f23587i;
        if (interfaceC3333z5 != null) {
            String str = GestureDetectorOnGestureListenerC3005ec.a1;
            Intrinsics.e(str, "access$getTAG$cp(...)");
            ((A5) interfaceC3333z5).a(str, "jsConfirm called with: " + message + url);
        }
        if (!GestureDetectorOnGestureListenerC3005ec.a(this.f23348a, result)) {
            return true;
        }
        if (this.f23348a.getFullScreenActivity() != null) {
            new AlertDialog.Builder(this.f23348a.getFullScreenActivity()).setMessage(message).setPositiveButton(R.string.ok, new A.O(result, 0)).setNegativeButton(R.string.cancel, new A.O(result, 1)).create().show();
            return true;
        }
        result.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView view, String url, String message, String defaultValue, JsPromptResult result) {
        Intrinsics.f(view, "view");
        Intrinsics.f(url, "url");
        Intrinsics.f(message, "message");
        Intrinsics.f(defaultValue, "defaultValue");
        Intrinsics.f(result, "result");
        InterfaceC3333z5 interfaceC3333z5 = this.f23348a.f23587i;
        if (interfaceC3333z5 != null) {
            String str = GestureDetectorOnGestureListenerC3005ec.a1;
            Intrinsics.e(str, "access$getTAG$cp(...)");
            ((A5) interfaceC3333z5).a(str, "jsPrompt called with: " + message + url);
        }
        if (!GestureDetectorOnGestureListenerC3005ec.a(this.f23348a, result)) {
            return true;
        }
        if (this.f23348a.getFullScreenActivity() != null) {
            return false;
        }
        result.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i2) {
        InterfaceC3333z5 interfaceC3333z5 = this.f23348a.f23587i;
        if (interfaceC3333z5 != null) {
            String str = GestureDetectorOnGestureListenerC3005ec.a1;
            ((A5) interfaceC3333z5).c(str, X8.a(str, "access$getTAG$cp(...)", "webview progress changed - ", i2));
        }
        super.onProgressChanged(webView, i2);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback callback) {
        Intrinsics.f(view, "view");
        Intrinsics.f(callback, "callback");
        if (this.f23348a.q.get() != null) {
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this.f23348a;
            gestureDetectorOnGestureListenerC3005ec.O = view;
            gestureDetectorOnGestureListenerC3005ec.f23575P = callback;
            view.setOnTouchListener(new A.r(1));
            Activity activity = (Activity) this.f23348a.q.get();
            FrameLayout frameLayout = activity != null ? (FrameLayout) activity.findViewById(R.id.content) : null;
            View view2 = this.f23348a.O;
            if (view2 != null) {
                view2.setBackgroundColor(-16777216);
            }
            if (frameLayout != null) {
                frameLayout.addView(this.f23348a.O, new AbsoluteLayout.LayoutParams(-1, -1, 0, 0));
            }
            View view3 = this.f23348a.O;
            if (view3 != null) {
                view3.requestFocus();
            }
            final GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec2 = this.f23348a;
            View view4 = gestureDetectorOnGestureListenerC3005ec2.O;
            View.OnKeyListener onKeyListener = new View.OnKeyListener() { // from class: A.Q
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view5, int i2, KeyEvent keyEvent) {
                    return Xb.a(gestureDetectorOnGestureListenerC3005ec2, this, view5, i2, keyEvent);
                }
            };
            if (view4 != null) {
                view4.setOnKeyListener(onKeyListener);
            }
            if (view4 != null) {
                view4.setFocusable(true);
            }
            if (view4 != null) {
                view4.setFocusableInTouchMode(true);
            }
            if (view4 != null) {
                view4.requestFocus();
            }
        }
    }

    public static final void a(JsResult result, DialogInterface dialogInterface, int i2) {
        Intrinsics.f(result, "$result");
        result.confirm();
    }

    public static final void b(GeolocationPermissions.Callback callback, String origin, DialogInterface dialogInterface, int i2) {
        Intrinsics.f(callback, "$callback");
        Intrinsics.f(origin, "$origin");
        callback.invoke(origin, false, false);
    }

    public static final boolean a(GestureDetectorOnGestureListenerC3005ec this$0, Xb this$1, View view, int i2, KeyEvent keyEvent) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(this$1, "this$1");
        if (4 != keyEvent.getKeyCode() || keyEvent.getAction() != 0) {
            return false;
        }
        InterfaceC3333z5 interfaceC3333z5 = this$0.f23587i;
        if (interfaceC3333z5 != null) {
            String str = GestureDetectorOnGestureListenerC3005ec.a1;
            Intrinsics.e(str, "access$getTAG$cp(...)");
            ((A5) interfaceC3333z5).a(str, "Back pressed when HTML5 video is playing.");
        }
        this$1.a();
        return true;
    }

    public final void a() {
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this.f23348a;
        if (gestureDetectorOnGestureListenerC3005ec.O == null) {
            return;
        }
        WebChromeClient.CustomViewCallback customViewCallback = gestureDetectorOnGestureListenerC3005ec.f23575P;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec2 = this.f23348a;
        gestureDetectorOnGestureListenerC3005ec2.f23575P = null;
        View view = gestureDetectorOnGestureListenerC3005ec2.O;
        if ((view != null ? view.getParent() : null) != null) {
            View view2 = this.f23348a.O;
            ViewParent parent = view2 != null ? view2.getParent() : null;
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.f23348a.O);
            }
            this.f23348a.O = null;
        }
    }

    public static final void a(GeolocationPermissions.Callback callback, String origin, DialogInterface dialogInterface, int i2) {
        Intrinsics.f(callback, "$callback");
        Intrinsics.f(origin, "$origin");
        callback.invoke(origin, true, false);
    }
}
