package com.chartboost.sdk.impl;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.widget.RelativeLayout;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ij extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i3 f14201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WebChromeClient f14202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RelativeLayout f14203c;
    public pd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij(Context context) {
        super(context);
        Intrinsics.f(context, "context");
        setFocusableInTouchMode(true);
        requestFocus();
    }

    public void a() {
        Unit unit;
        i3 i3Var = this.f14201a;
        if (i3Var == null) {
            za.a("Webview is null on destroyWebview", (Throwable) null, 2, (Object) null);
            return;
        }
        RelativeLayout relativeLayout = this.f14203c;
        if (relativeLayout != null) {
            relativeLayout.removeView(i3Var);
            removeView(relativeLayout);
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            za.a("webViewContainer is null destroyWebview", (Throwable) null, 2, (Object) null);
        }
        i3 i3Var2 = this.f14201a;
        if (i3Var2 != null) {
            i3Var2.loadUrl("about:blank");
            i3Var2.onPause();
            i3Var2.removeAllViews();
            i3Var2.destroy();
        }
        removeAllViews();
    }

    public final pd getLastOrientation() {
        return this.d;
    }

    public final WebChromeClient getWebChromeClient() {
        return this.f14202b;
    }

    public final i3 getWebView() {
        return this.f14201a;
    }

    public final RelativeLayout getWebViewContainer() {
        return this.f14203c;
    }

    public final void setLastOrientation(pd pdVar) {
        this.d = pdVar;
    }

    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f14202b = webChromeClient;
    }

    public final void setWebView(i3 i3Var) {
        this.f14201a = i3Var;
    }

    public final void setWebViewContainer(RelativeLayout relativeLayout) {
        this.f14203c = relativeLayout;
    }
}
