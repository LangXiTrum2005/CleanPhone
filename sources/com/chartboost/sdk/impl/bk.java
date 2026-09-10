package com.chartboost.sdk.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.chartboost.sdk.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class bk extends d2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f13545h = new b(null);
    public final String f;
    public final WebView g;

    public static final class a extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function0 f13546a;

        public a(Function0 function0) {
            this.f13546a = function0;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            Intrinsics.f(view, "view");
            Intrinsics.f(url, "url");
            Function0 function0 = this.f13546a;
            if (function0 == null) {
                return true;
            }
            function0.invoke();
            return true;
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(Context context, AttributeSet attributeSet, int i2, String persistentCtaContentDescription, Function0 function0) {
        super(context, attributeSet, i2, function0);
        Intrinsics.f(context, "context");
        Intrinsics.f(persistentCtaContentDescription, "persistentCtaContentDescription");
        this.f = persistentCtaContentDescription;
        WebView webView = new WebView(context);
        webView.setId(View.generateViewId());
        webView.setLayoutParams(new ConstraintLayout.LayoutParams(a(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE), a(60)));
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.setWebViewClient(new a(function0));
        webView.setFocusable(true);
        webView.setClickable(true);
        webView.setOnClickListener(new p008p.d(function0, 0));
        this.g = webView;
        setContentDescription(persistentCtaContentDescription);
        addView(webView);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.e(this);
        constraintSet.f(webView.getId(), 1, 0, 1);
        constraintSet.f(webView.getId(), 2, 0, 2);
        constraintSet.f(webView.getId(), 3, 0, 3);
        constraintSet.f(webView.getId(), 4, 0, 4);
        constraintSet.b(this);
    }

    @Override // com.chartboost.sdk.impl.d2
    public void a(i5 config) {
        Intrinsics.f(config, "config");
        String strB = config.b();
        if (strB != null) {
            this.g.loadDataWithBaseURL(null, strB, "text/html", "UTF-8", null);
        }
    }

    public final WebView getWebView() {
        return this.g;
    }

    public final void setContentUrl(String url) {
        Intrinsics.f(url, "url");
        this.g.loadUrl(url);
    }

    public static final void a(Function0 function0, View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // com.chartboost.sdk.impl.d2
    public void a(oj tracker, mj purpose) {
        Intrinsics.f(tracker, "tracker");
        Intrinsics.f(purpose, "purpose");
        tracker.a(this, purpose);
        tracker.a(this.g, purpose);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ bk(Context context, AttributeSet attributeSet, int i2, String str, Function0 function0, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        attributeSet = (i3 & 2) != 0 ? null : attributeSet;
        i2 = (i3 & 4) != 0 ? 0 : i2;
        if ((i3 & 8) != 0) {
            str = context.getString(R.string.persistent_cta_description, "Advertisement");
            Intrinsics.e(str, "getString(...)");
        }
        this(context, attributeSet, i2, str, (i3 & 16) != 0 ? null : function0);
    }
}
