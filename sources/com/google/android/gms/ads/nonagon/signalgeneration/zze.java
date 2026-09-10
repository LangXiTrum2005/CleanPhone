package com.google.android.gms.ads.nonagon.signalgeneration;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.ar;
import com.google.android.gms.internal.ads.fe1;
import com.google.android.gms.internal.ads.l00;
import com.google.android.gms.internal.ads.ln;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zze extends ar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zza f11467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fe1 f11468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f11469c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ScheduledFuture f11470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WebViewClient f11471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WebView f11472f;

    public zze(WebView webView, zza zzaVar, fe1 fe1Var) {
        this.f11472f = webView;
        this.f11467a = zzaVar;
        this.f11468b = fe1Var;
    }

    public static boolean c() {
        if (((Boolean) ln.f17062a.o()).booleanValue()) {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            if (allStackTraces != null && allStackTraces.containsKey(Thread.currentThread())) {
                boolean z10 = false;
                boolean z11 = false;
                for (StackTraceElement stackTraceElement : allStackTraces.get(Thread.currentThread())) {
                    if (stackTraceElement.getClassName().contains(zze.class.getName())) {
                        if (!z10 || !z11) {
                            z10 = true;
                        }
                    } else if (z10) {
                        z11 = true;
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ar
    public final WebViewClient a() {
        return this.f11471e;
    }

    public final void b() {
        synchronized (this.f11469c) {
            try {
                WebView webView = this.f11472f;
                if (webView == null) {
                    return;
                }
                webView.evaluateJavascript(String.format(Locale.getDefault(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12364tb), this.f11467a.zzb()), null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ar, android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z10) {
        if (c()) {
            return;
        }
        super.doUpdateVisitedHistory(webView, str, z10);
    }

    @Override // com.google.android.gms.internal.ads.ar, android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        if (c()) {
            return;
        }
        super.onFormResubmission(webView, message, message2);
    }

    @Override // com.google.android.gms.internal.ads.ar, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        if (c()) {
            return;
        }
        super.onLoadResource(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.ar, android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        if (c()) {
            return;
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.ar, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (c()) {
            return;
        }
        b();
        super.onPageFinished(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.ar, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (c()) {
            return;
        }
        b();
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // com.google.android.gms.internal.ads.ar, android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        if (c()) {
            return;
        }
        super.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    @Override // com.google.android.gms.internal.ads.ar, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        if (c()) {
            return;
        }
        super.onReceivedError(webView, i10, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.ar, android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        if (c()) {
            return;
        }
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.ar, android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (c()) {
            return;
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // com.google.android.gms.internal.ads.ar, android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, @Nullable String str2, String str3) {
        if (c()) {
            return;
        }
        super.onReceivedLoginRequest(webView, str, str2, str3);
    }

    @Override // com.google.android.gms.internal.ads.ar, android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (c()) {
            return;
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // com.google.android.gms.internal.ads.ar, android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (!c()) {
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        synchronized (this.f11469c) {
            try {
                WebView webView2 = this.f11472f;
                if (webView2 != null) {
                    webView2.setWebViewClient(new WebViewClient());
                    this.f11472f = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ScheduledFuture scheduledFuture = this.f11470d;
        if (scheduledFuture == null) {
            return true;
        }
        scheduledFuture.cancel(false);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ar, android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i10, SafeBrowsingResponse safeBrowsingResponse) {
        if (c()) {
            return;
        }
        super.onSafeBrowsingHit(webView, webResourceRequest, i10, safeBrowsingResponse);
    }

    @Override // com.google.android.gms.internal.ads.ar, android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f10, float f11) {
        if (c()) {
            return;
        }
        super.onScaleChanged(webView, f10, f11);
    }

    @Override // com.google.android.gms.internal.ads.ar, android.webkit.WebViewClient
    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        if (c()) {
            return;
        }
        super.onTooManyRedirects(webView, message, message2);
    }

    @Override // com.google.android.gms.internal.ads.ar, android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        if (c()) {
            return;
        }
        super.onUnhandledKeyEvent(webView, keyEvent);
    }

    @Override // com.google.android.gms.internal.ads.ar, android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (c()) {
            return null;
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // com.google.android.gms.internal.ads.ar, android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        if (c()) {
            return false;
        }
        return super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // com.google.android.gms.internal.ads.ar, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (c()) {
            return false;
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    public final void zza() {
        this.f11470d = l00.f16611d.scheduleWithFixedDelay(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzd
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f11466a.zzb();
            }
        }, 0L, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12348sb)).intValue(), TimeUnit.MILLISECONDS);
    }

    public final void zzb() {
        this.f11468b.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzc
            @Override // java.lang.Runnable
            public final void run() {
                zze zzeVar = this.f11465a;
                synchronized (zzeVar.f11469c) {
                    WebView webView = zzeVar.f11472f;
                    if (webView == null) {
                        return;
                    }
                    try {
                        com.google.android.gms.ads.internal.zzt.zzc();
                        WebViewClient webViewClient = webView.getWebViewClient();
                        if (webViewClient == zzeVar) {
                            return;
                        }
                        if (webViewClient != null) {
                            zzeVar.f11471e = webViewClient;
                        }
                        webView.setWebViewClient(zzeVar);
                        zzeVar.b();
                    } catch (IllegalStateException unused) {
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ar, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (c()) {
            return;
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // com.google.android.gms.internal.ads.ar, android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (c()) {
            return null;
        }
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.ar, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (c()) {
            return false;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
