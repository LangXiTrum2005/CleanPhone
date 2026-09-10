package com.startapp.sdk.internal;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.download.Command;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.WeightedChoice;
import com.startapp.sdk.adsbase.remoteconfig.WvfMetadata;
import java.util.LinkedList;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class xk implements tk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb f41692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lb f41693c;
    public final lb d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k7 f41694e;
    public String g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final lb f41696i;
    public final LinkedList f = new LinkedList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f41695h = true;
    public final Runnable j = new C(this, 6);

    public xk(Context context, lb lbVar, lb lbVar2, lb lbVar3, k7 k7Var) {
        if (Build.VERSION.SDK_INT < 31 || context.isUiContext()) {
            this.f41691a = context;
        } else {
            this.f41691a = context.createWindowContext(((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0), 2, null);
        }
        this.f41692b = lbVar;
        this.f41693c = lbVar2;
        this.d = lbVar3;
        this.f41694e = k7Var;
        this.f41696i = new lb(new D(k7Var, 1));
    }

    public final void a(String str) {
        this.g = str;
    }

    @Override // com.startapp.sdk.internal.tk
    public final void b() {
        d();
    }

    @Override // com.startapp.sdk.internal.tk
    public final WebView c() {
        if (this.f.isEmpty()) {
            WebView webView = new WebView(this.f41691a);
            webView.setWebViewClient(new sk());
            return webView;
        }
        if (this.f.size() == 1) {
            d();
        }
        return (WebView) this.f.removeFirst();
    }

    public final void d() {
        try {
            gc gcVar = (gc) this.d.a();
            Runnable runnable = this.j;
            synchronized (gcVar) {
                if (gcVar.f41008c != null) {
                    return;
                }
                Thread thread = new Thread(new fc(gcVar, runnable), "startapp-lid-" + gc.g.incrementAndGet());
                gcVar.f41008c = thread;
                thread.start();
            }
        } catch (Throwable th) {
            if (a(256)) {
                g9.a(th);
            }
        }
    }

    public final void e() {
        WebView webView;
        if (!this.f.isEmpty()) {
            if (this.f41695h && TextUtils.isEmpty(this.g)) {
                this.f41695h = false;
                if (!"default".equals(this.f41696i.a())) {
                    if ("headers".equals(this.f41696i.a())) {
                        a((WebView) this.f.removeFirst());
                        return;
                    }
                    return;
                } else {
                    try {
                        ((Executor) this.f41692b.a()).execute(new uk(this));
                        return;
                    } catch (Throwable th) {
                        if (a(8)) {
                            g9.a(th);
                            return;
                        }
                        return;
                    }
                }
            }
            return;
        }
        try {
            webView = new WebView(this.f41691a);
            webView.setWebViewClient(new sk());
        } catch (Throwable th2) {
            if (a(2)) {
                g9.a(th2);
            }
            webView = null;
        }
        if (webView != null) {
            try {
                this.f.addLast(webView);
            } catch (Throwable th3) {
                if (a(4)) {
                    g9.a(th3);
                }
            }
            if (this.f41695h && TextUtils.isEmpty(this.g)) {
                d();
            }
        }
    }

    public final void f() {
        try {
            String defaultUserAgent = WebSettings.getDefaultUserAgent(this.f41691a);
            m8 m8Var = (m8) this.f41693c.a();
            m8Var.f41243a.post(new com.google.android.exoplayer2.video.a(14, this, defaultUserAgent));
        } catch (Throwable th) {
            if (a(16)) {
                g9.a(th);
            }
        }
    }

    public static /* synthetic */ String a(k7 k7Var) {
        WvfMetadata wvfMetadata = (WvfMetadata) k7Var.a();
        WeightedChoice weightedChoiceB = wvfMetadata != null ? wvfMetadata.b() : null;
        String strA = weightedChoiceB != null ? weightedChoiceB.a() : null;
        return strA != null ? strA : "default";
    }

    public final boolean a(int i2) {
        WvfMetadata wvfMetadata = (WvfMetadata) this.f41694e.a();
        ComponentInfoEventConfig componentInfoEventConfigA = wvfMetadata != null ? wvfMetadata.a() : null;
        return componentInfoEventConfigA != null && componentInfoEventConfigA.a((long) i2);
    }

    @Override // com.startapp.sdk.internal.tk
    public final String a() {
        String str = this.g;
        WeakHashMap weakHashMap = vi.f41589a;
        if (str == null || str.length() <= 0) {
            str = null;
        }
        if (str != null) {
            return str;
        }
        try {
            String property = System.getProperty("http.agent");
            if (property == null || property.length() <= 0) {
                return null;
            }
            return property;
        } catch (Throwable th) {
            if (a(1)) {
                g9.a(th);
            }
            return null;
        }
    }

    public final void a(WebView webView) {
        try {
            webView.setWebViewClient(new vk(this));
            String strA = vi.a();
            m8 m8Var = (m8) this.f41693c.a();
            m8Var.f41243a.post(new com.google.android.exoplayer2.video.a(15, webView, strA));
        } catch (Throwable th) {
            if (a(32)) {
                g9.a(th);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002a  */
    public final void a(WebView webView, WebResourceRequest webResourceRequest) {
        String str;
        try {
            if (webResourceRequest != null) {
                try {
                    Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
                    if (requestHeaders != null) {
                        str = requestHeaders.get(Command.HTTP_HEADER_USER_AGENT);
                        WeakHashMap weakHashMap = vi.f41589a;
                        if (str == null || str.length() <= 0) {
                            str = null;
                        }
                    } else {
                        str = null;
                    }
                } catch (Throwable th) {
                    if (a(128)) {
                        g9.a(th);
                    }
                }
            } else {
                str = null;
            }
            m8 m8Var = (m8) this.f41693c.a();
            m8Var.f41243a.post(new wk(this, str, webView));
        } catch (Throwable th2) {
            if (a(64)) {
                g9.a(th2);
            }
        }
    }
}
