package com.startapp.sdk.internal;

import android.content.Context;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes6.dex */
public abstract class tc {
    public static void a(Context context, int i2, int i3, int i4, int i5, WebView webView) {
        vi.a(webView, true, "mraid.setCurrentPosition", Integer.valueOf(li.b(context, i2)), Integer.valueOf(Math.round(i3 / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(i4 / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(i5 / context.getResources().getDisplayMetrics().density)));
    }

    public static void b(Context context, int i2, int i3, int i4, int i5, WebView webView) {
        vi.a(webView, true, "mraid.setDefaultPosition", Integer.valueOf(li.b(context, i2)), Integer.valueOf(Math.round(i3 / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(i4 / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(i5 / context.getResources().getDisplayMetrics().density)));
    }

    public static void a(WebView webView, String str, String str2) {
        vi.a(webView, true, "mraid.fireErrorEvent", str, str2);
    }
}
