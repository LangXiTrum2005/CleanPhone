package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l4 extends ij {

    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f14393b = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i3 invoke(Context it) {
            Intrinsics.f(it, "it");
            return new i3(it);
        }
    }

    public static final class b extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f14394b = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WebChromeClient invoke(View it) {
            Intrinsics.f(it, "it");
            return new WebChromeClient();
        }
    }

    public static final class c extends Lambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t9 f14395b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(t9 t9Var) {
            super(2);
            this.f14395b = t9Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j5 invoke(k5 cb, y6 et) {
            Intrinsics.f(cb, "cb");
            Intrinsics.f(et, "et");
            return new j5(cb, et, this.f14395b, (qf) w3.f15454b.a().b().get());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(Context context, String html, k5 callback, t9 impressionInterface, String str, y6 eventTracker, Function1 cbWebViewFactory, Function1 cbWebChromeClientFactory, Function2 cbWebViewClientFactory) {
        super(context);
        Intrinsics.f(context, "context");
        Intrinsics.f(html, "html");
        Intrinsics.f(callback, "callback");
        Intrinsics.f(impressionInterface, "impressionInterface");
        Intrinsics.f(eventTracker, "eventTracker");
        Intrinsics.f(cbWebViewFactory, "cbWebViewFactory");
        Intrinsics.f(cbWebChromeClientFactory, "cbWebChromeClientFactory");
        Intrinsics.f(cbWebViewClientFactory, "cbWebViewClientFactory");
        setFocusable(false);
        y7 y7VarA = y7.a();
        setWebViewContainer((RelativeLayout) y7VarA.a(new RelativeLayout(context)));
        setWebView((i3) cbWebViewFactory.invoke(context));
        vh.f15428b.a(context);
        try {
            WebView.setWebContentsDebuggingEnabled(false);
        } catch (RuntimeException e2) {
            za.e("Exception while enabling webview debugging", e2);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        i3 webView = getWebView();
        if (webView != null) {
            webView.getSettings().setSupportZoom(false);
            webView.setLayoutParams(layoutParams);
            webView.setBackgroundColor(0);
            webView.setWebViewClient((WebViewClient) y7VarA.a(cbWebViewClientFactory.invoke(callback, eventTracker)));
            RelativeLayout webViewContainer = getWebViewContainer();
            if (webViewContainer != null) {
                webViewContainer.setLayoutParams(layoutParams);
                webView.setWebChromeClient((WebChromeClient) cbWebChromeClientFactory.invoke(webViewContainer));
                webViewContainer.addView(webView);
            }
            webView.loadDataWithBaseURL(str, html, "text/html", "utf-8", null);
        }
    }

    public /* synthetic */ l4(Context context, String str, k5 k5Var, t9 t9Var, String str2, y6 y6Var, Function1 function1, Function1 function2, Function2 function3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        t9 t9Var2;
        Function2 cVar;
        Function1 function4 = (i2 & 64) != 0 ? a.f14393b : function1;
        Function1 function5 = (i2 & 128) != 0 ? b.f14394b : function2;
        if ((i2 & 256) != 0) {
            t9Var2 = t9Var;
            cVar = new c(t9Var2);
        } else {
            t9Var2 = t9Var;
            cVar = function3;
        }
        this(context, str, k5Var, t9Var2, str2, y6Var, function4, function5, cVar);
    }
}
