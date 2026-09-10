package com.startapp.sdk.internal;

import android.graphics.Bitmap;
import android.webkit.WebView;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.inappbrowser.AnimatingProgressBar;
import com.startapp.sdk.inappbrowser.NavigationBarLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class v8 extends sk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OverlayActivity f41569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w8 f41570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavigationBarLayout f41571c;
    public final AnimatingProgressBar d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f41572e = 0;
    public boolean f = false;

    public v8(OverlayActivity overlayActivity, NavigationBarLayout navigationBarLayout, AnimatingProgressBar animatingProgressBar, w8 w8Var) {
        this.f41569a = overlayActivity;
        this.d = animatingProgressBar;
        this.f41571c = navigationBarLayout;
        this.f41570b = w8Var;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (w8.f41616B) {
            return;
        }
        this.f41571c.a(webView);
        int i2 = this.f41572e - 1;
        this.f41572e = i2;
        if (i2 == 0) {
            this.f = false;
            this.d.a();
            if (this.d.isShown()) {
                this.d.setVisibility(8);
            }
            this.f41571c.a(webView);
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (w8.f41616B) {
            return;
        }
        if (this.f) {
            this.f41572e = 1;
            this.d.a();
            this.f41571c.a(webView);
        } else {
            this.f41572e = Math.max(this.f41572e, 1);
        }
        this.d.setVisibility(0);
        this.f41571c.b().setText(str);
        this.f41571c.a(webView);
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        this.d.a();
        super.onReceivedError(webView, i2, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (webView != null && str != null && !vi.c(webView.getContext(), str) && !w8.f41616B) {
            if (!this.f) {
                this.f = true;
                this.d.a();
                this.f41572e = 0;
            }
            this.f41572e++;
            if (h0.b(str) && !h0.a(str)) {
                return false;
            }
            this.f41572e = 1;
            h0.b(this.f41569a, str);
            w8 w8Var = this.f41570b;
            if (w8Var != null) {
                w8Var.i();
            }
        }
        return true;
    }
}
