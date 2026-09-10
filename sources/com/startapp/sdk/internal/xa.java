package com.startapp.sdk.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MraidMetadata;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class xa extends sk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ za f41669a;

    public xa(za zaVar) {
        this.f41669a = zaVar;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        if (webView == null || str == null) {
            return;
        }
        webView.getContext();
        WeakHashMap weakHashMap = vi.f41589a;
        Log.println(2, "StartAppSDK", "Interstitial received callback onPageFinished()");
        if (this.f41669a.f41774z == null) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            za zaVar = this.f41669a;
            long jMax = Math.max(0L, zaVar.m() - (jUptimeMillis - zaVar.y));
            MraidMetadata mraidMetadataK = MetaData.E().K();
            y0 y0Var = this.f41669a.G;
            y0Var.getClass();
            boolean z2 = (y0Var instanceof xc) && mraidMetadataK != null && vi.a(mraidMetadataK.a());
            za zaVar2 = this.f41669a;
            za zaVar3 = this.f41669a;
            zaVar2.f41774z = new ag(zaVar3.f41606a, zaVar3.m, zaVar3.f41610h, zaVar3.n(), jMax, z2, this.f41669a.M);
            this.f41669a.p();
        }
        this.f41669a.G.a(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (!cd.a(str)) {
            return super.shouldInterceptRequest(webView, str);
        }
        za zaVar = this.f41669a;
        y0 y0Var = zaVar.G;
        y0Var.getClass();
        if (!(y0Var instanceof xc)) {
            xc xcVar = new xc(zaVar);
            zaVar.G = xcVar;
            if (zaVar.H) {
                xcVar.g();
            }
            if (zaVar.f41771I) {
                zaVar.G.f();
            }
        }
        za zaVar2 = this.f41669a;
        zaVar2.getClass();
        new Handler(Looper.getMainLooper()).post(new ua(zaVar2));
        return ((cd) com.startapp.sdk.components.a.a(webView.getContext()).T.a()).b();
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (webView == null || str == null) {
            return true;
        }
        return this.f41669a.G.b(webView, str);
    }
}
