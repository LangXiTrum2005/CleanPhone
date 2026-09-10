package com.ironsource;

import android.os.Build;
import android.webkit.WebView;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.oa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3673oa {

    /* JADX INFO: renamed from: com.ironsource.oa$a */
    public static final class a implements InterfaceC3673oa {
        private WebView a;
        private boolean b;

        public a() {
            this(0, 1, null);
        }

        private final void b(String str) {
            WebView webView = this.a;
            if (webView != null) {
                webView.evaluateJavascript(str, null);
            }
        }

        private final void c(String str) {
            WebView webView = this.a;
            if (webView != null) {
                webView.loadUrl("javascript:" + str);
            }
        }

        @Override // com.ironsource.InterfaceC3673oa
        public boolean a() {
            return this.a != null;
        }

        public a(int i) {
            this.b = i >= 19;
        }

        @Override // com.ironsource.InterfaceC3673oa
        public void a(String script) {
            Intrinsics.checkNotNullParameter(script, "script");
            try {
                if (this.b) {
                    b(script);
                } else {
                    c(script);
                }
            } catch (Throwable th) {
                C3631m4.d().a(th);
                this.b = false;
                c(script);
            }
        }

        public /* synthetic */ a(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? Build.VERSION.SDK_INT : i);
        }

        @Override // com.ironsource.InterfaceC3673oa
        public void a(WebView webView) {
            Intrinsics.checkNotNullParameter(webView, "webView");
            this.a = webView;
        }
    }

    void a(WebView webView);

    void a(String str);

    boolean a();
}
