package com.ironsource;

import android.annotation.SuppressLint;
import android.os.Build;
import android.webkit.WebView;

/* JADX INFO: renamed from: com.ironsource.ra, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC0551ra {

    /* JADX INFO: renamed from: com.ironsource.ra$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a implements InterfaceC0551ra {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WebView f30158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f30159b;

        public a() {
            this(0, 1, null);
        }

        @SuppressLint({"NewApi"})
        private final void b(String str) {
            WebView webView = this.f30158a;
            if (webView != null) {
                webView.evaluateJavascript(str, null);
            }
        }

        private final void c(String str) {
            WebView webView = this.f30158a;
            if (webView != null) {
                webView.loadUrl("javascript:" + str);
            }
        }

        @Override // com.ironsource.InterfaceC0551ra
        public boolean a() {
            return this.f30158a != null;
        }

        public a(int i10) {
            this.f30159b = i10 >= 19;
        }

        @Override // com.ironsource.InterfaceC0551ra
        public void a(String script) {
            kotlin.jvm.internal.n.f(script, "script");
            try {
                if (this.f30159b) {
                    b(script);
                } else {
                    c(script);
                }
            } catch (Throwable th2) {
                C0474n4.d().a(th2);
                this.f30159b = false;
                c(script);
            }
        }

        public /* synthetic */ a(int i10, int i11, kotlin.jvm.internal.g gVar) {
            this((i11 & 1) != 0 ? Build.VERSION.SDK_INT : i10);
        }

        @Override // com.ironsource.InterfaceC0551ra
        public void a(WebView webView) {
            kotlin.jvm.internal.n.f(webView, "webView");
            this.f30158a = webView;
        }
    }

    void a(WebView webView);

    void a(String str);

    boolean a();
}
