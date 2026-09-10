package com.chartboost.sdk.impl;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.ByteArrayInputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nc extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f14541a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final WebResourceResponse a(String url) {
        Intrinsics.f(url, "url");
        if (!StringsKt.p(url, "mraid.js", false)) {
            return null;
        }
        byte[] bytes = fc.f13892a.a().getBytes(Charsets.f44691a);
        Intrinsics.e(bytes, "getBytes(...)");
        return new WebResourceResponse("text/javascript", "UTF-8", new ByteArrayInputStream(bytes));
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        Intrinsics.f(view, "view");
        Intrinsics.f(request, "request");
        String string = request.getUrl().toString();
        Intrinsics.e(string, "toString(...)");
        WebResourceResponse webResourceResponseA = a(string);
        return webResourceResponseA == null ? super.shouldInterceptRequest(view, request) : webResourceResponseA;
    }
}
