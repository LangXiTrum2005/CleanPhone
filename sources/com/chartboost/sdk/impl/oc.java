package com.chartboost.sdk.impl;

import android.content.Context;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class oc implements zj {
    @Override // com.chartboost.sdk.impl.zj
    public dc a(Context context, WebView webView, zb placementType) {
        Intrinsics.f(context, "context");
        Intrinsics.f(webView, "webView");
        Intrinsics.f(placementType, "placementType");
        return new rb(context, webView, placementType, null, null, null, 56, null);
    }

    @Override // com.chartboost.sdk.impl.zj
    public WebView a(Context context) {
        Intrinsics.f(context, "context");
        return new lc(context);
    }
}
