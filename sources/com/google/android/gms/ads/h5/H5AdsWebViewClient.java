package com.google.android.gms.ads.h5;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.ar;
import com.google.android.gms.internal.ads.lr;
import com.google.android.gms.internal.ads.ps1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class H5AdsWebViewClient extends ar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lr f10708a;

    public H5AdsWebViewClient(@NonNull Context context, @NonNull WebView webView) {
        this.f10708a = new lr(context, webView);
    }

    @Override // com.google.android.gms.internal.ads.ar
    public final WebViewClient a() {
        return this.f10708a;
    }

    public void clearAdObjects() {
        this.f10708a.f17111b.clearAdObjects();
    }

    @Nullable
    public WebViewClient getDelegateWebViewClient() {
        return this.f10708a.f17110a;
    }

    public void setDelegateWebViewClient(@Nullable WebViewClient webViewClient) {
        lr lrVar = this.f10708a;
        lrVar.getClass();
        ps1.C("Delegate cannot be itself.", webViewClient != lrVar);
        lrVar.f17110a = webViewClient;
    }
}
