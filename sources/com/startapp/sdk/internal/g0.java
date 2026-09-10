package com.startapp.sdk.internal;

import android.content.DialogInterface;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes6.dex */
public final class g0 implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebView f40991a;

    public g0(WebView webView) {
        this.f40991a = webView;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f40991a.stopLoading();
    }
}
