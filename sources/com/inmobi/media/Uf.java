package com.inmobi.media;

import android.content.Context;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class uf extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f24040a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf(Context context) {
        super(context);
        Intrinsics.f(context, "context");
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        this.f24040a = true;
        super.destroy();
    }
}
