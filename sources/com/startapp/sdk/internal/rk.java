package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes6.dex */
public final class rk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lb f41456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedList f41457b = new LinkedList();

    public rk(Context context, lb lbVar) {
        this.f41456a = lbVar;
    }

    public final void a(WebView webView) {
        webView.stopLoading();
        webView.loadUrl("about:blank");
        if (this.f41457b.size() < 3) {
            this.f41457b.add(new WeakReference(webView));
        } else {
            webView.destroy();
        }
    }

    public final void a(String str, ti tiVar) {
        Throwable th;
        ti tiVar2;
        if (com.p004ironsource.mediationsdk.metadata.a.g.equals(vi.a(str, "@doNotRender@", "@doNotRender@"))) {
            tiVar.a();
            return;
        }
        WebView webViewC = null;
        while (webViewC == null) {
            try {
                if (this.f41457b.size() <= 0) {
                    break;
                }
                WeakReference weakReference = (WeakReference) this.f41457b.poll();
                if (weakReference != null) {
                    webViewC = (WebView) weakReference.get();
                }
            } catch (Throwable th2) {
                th = th2;
                tiVar2 = tiVar;
                g9.a(th);
                tiVar2.a("WebView instantiation Error");
            }
        }
        if (webViewC == null) {
            webViewC = ((tk) this.f41456a.a()).c();
        }
        WebView webView = webViewC;
        try {
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            Handler handler = new Handler(Looper.getMainLooper());
            AtomicLong atomicLong = new AtomicLong();
            int i2 = 0;
            if (i0.f.booleanValue()) {
                webView.getSettings().setBlockNetworkImage(false);
                webView.getSettings().setLoadsImagesAutomatically(true);
                webView.getSettings().setJavaScriptEnabled(true);
                i2 = 25000;
            }
            int i3 = i2;
            webView.setWebChromeClient(new WebChromeClient());
            try {
                tiVar2 = tiVar;
                try {
                    webView.setWebViewClient(new ok(this, handler, atomicBoolean, webView, tiVar, atomicLong, i3));
                    atomicLong.set(vi.b());
                    if (!vi.a(webView, str)) {
                        handler.removeCallbacksAndMessages(null);
                        handler.post(new pk(this, atomicBoolean, webView, tiVar2));
                    } else {
                        handler.postDelayed(new qk(this, atomicBoolean, webView, tiVar2, atomicLong), 25000L);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    g9.a(th);
                    tiVar2.a("WebView instantiation Error");
                }
            } catch (Throwable th4) {
                th = th4;
                tiVar2 = tiVar;
            }
        } catch (Throwable th5) {
            th = th5;
            tiVar2 = tiVar;
        }
    }
}
