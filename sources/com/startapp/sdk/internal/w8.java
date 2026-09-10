package com.startapp.sdk.internal;

import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.startapp.sdk.inappbrowser.AnimatingProgressBar;
import com.startapp.sdk.inappbrowser.NavigationBarLayout;
import com.startapp.startappsdk.R;

/* JADX INFO: loaded from: classes6.dex */
public final class w8 extends w7 implements View.OnClickListener {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static boolean f41616B = false;
    public static final int C = R.id.io_start_navigation_bar;
    public static final int D = R.id.io_start_navigation_bar_close;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int f41617E = R.id.io_start_navigation_bar_external;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int f41618F = R.id.io_start_navigation_bar_back;
    public static final int G = R.id.io_start_navigation_bar_forward;
    public static final int H = R.id.io_start_navigation_bar_progress;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final String f41619A;
    public RelativeLayout v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public NavigationBarLayout f41620w;
    public WebView x;
    public AnimatingProgressBar y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public FrameLayout f41621z;

    public w8(String str) {
        this.f41619A = str;
    }

    @Override // com.startapp.sdk.internal.w7
    public final void a(Bundle bundle) throws Throwable {
        zb.a(this.f41606a).a(this.f41608c, new IntentFilter("com.startapp.android.CloseAdActivity"));
        f41616B = false;
        this.v = new RelativeLayout(this.f41606a);
        String str = this.f41619A;
        if (this.f41620w == null) {
            NavigationBarLayout navigationBarLayout = new NavigationBarLayout(this.f41606a);
            this.f41620w = navigationBarLayout;
            navigationBarLayout.d();
            this.f41620w.c();
            this.f41620w.setButtonsListener(this);
        }
        this.v.addView(this.f41620w);
        this.y = new AnimatingProgressBar(this.f41606a, null, android.R.attr.progressBarStyleHorizontal);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(Color.parseColor("#45d200"));
        this.y.setProgressDrawable(new ClipDrawable(shapeDrawable, 3, 1));
        this.y.setBackgroundColor(-1);
        this.y.setId(H);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, li.a(this.f41606a, 4));
        layoutParams.addRule(3, C);
        this.v.addView(this.y, layoutParams);
        this.f41621z = new FrameLayout(this.f41606a);
        if (this.x == null) {
            try {
                j();
                this.x.loadUrl(str);
            } catch (Throwable th) {
                g9.a(th);
                this.f41620w.e();
                h0.b(this.f41606a, str);
                this.f41606a.finish();
            }
        }
        this.f41621z.addView(this.x);
        this.f41621z.setBackgroundColor(-1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(15);
        layoutParams2.addRule(3, H);
        this.v.addView(this.f41621z, layoutParams2);
        if (bundle != null) {
            this.x.restoreState(bundle);
        }
        this.f41606a.setContentView(this.v, new RelativeLayout.LayoutParams(-2, -2));
    }

    @Override // com.startapp.sdk.internal.w7
    public final void b(Bundle bundle) {
        this.x.saveState(bundle);
    }

    @Override // com.startapp.sdk.internal.w7
    public final void f() {
    }

    @Override // com.startapp.sdk.internal.w7
    public final void g() {
    }

    public final void i() {
        try {
            f41616B = true;
            this.x.stopLoading();
            this.x.removeAllViews();
            this.x.postInvalidate();
            this.x.onPause();
            this.x.destroy();
            this.x = null;
        } catch (Exception unused) {
        }
        this.f41620w.e();
        this.f41606a.finish();
    }

    public final void j() {
        WebView webViewC = ((tk) com.startapp.sdk.components.a.a(this.f41606a).f40735b.a()).c();
        this.x = webViewC;
        webViewC.getSettings().setJavaScriptEnabled(true);
        this.x.getSettings().setUseWideViewPort(true);
        this.x.getSettings().setLoadWithOverviewMode(true);
        this.x.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.x.getSettings().setBuiltInZoomControls(true);
        this.x.getSettings().setDisplayZoomControls(false);
        this.x.setWebViewClient(new v8(this.f41606a, this.f41620w, this.y, this));
        this.x.setWebChromeClient(new u8(this));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == f41618F) {
            WebView webView = this.x;
            if (webView == null || !webView.canGoBack()) {
                return;
            }
            this.y.a();
            this.x.goBack();
            return;
        }
        if (id == G) {
            WebView webView2 = this.x;
            if (webView2 == null || !webView2.canGoForward()) {
                return;
            }
            this.y.a();
            this.x.goForward();
            return;
        }
        if (id != f41617E) {
            if (id == D) {
                i();
            }
        } else {
            WebView webView3 = this.x;
            if (webView3 != null) {
                h0.b(this.f41606a, webView3.getUrl());
                i();
            }
        }
    }

    @Override // com.startapp.sdk.internal.w7
    public final boolean a(int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i2 != 4) {
            return false;
        }
        WebView webView = this.x;
        if (webView != null && webView.canGoBack()) {
            this.y.a();
            this.x.goBack();
            return true;
        }
        i();
        return true;
    }
}
