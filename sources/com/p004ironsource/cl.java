package com.p004ironsource;

import android.os.Build;
import android.webkit.WebView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0003J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/cl;", "", "", "a", "", "script", "", "Landroid/webkit/WebView;", "webView", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface cl {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u000bR\u0016\u0010\r\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/cl$a;", "Lcom/ironsource/cl;", "", "script", "", "b", "c", "", "a", "Landroid/webkit/WebView;", "webView", "Landroid/webkit/WebView;", "Z", "isKitkatAndAbove", "", "androidSDKVersion", "<init>", "(I)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements cl {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private WebView webView;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean isKitkatAndAbove;

        public a() {
            this(0, 1, null);
        }

        private final void b(String script) {
            WebView webView = this.webView;
            if (webView != null) {
                webView.evaluateJavascript(script, null);
            }
        }

        private final void c(String script) {
            WebView webView = this.webView;
            if (webView != null) {
                webView.loadUrl("javascript:" + script);
            }
        }

        @Override // com.p004ironsource.cl
        public void a(WebView webView) {
            Intrinsics.f(webView, "webView");
            this.webView = webView;
        }

        public a(int i2) {
            this.isKitkatAndAbove = i2 >= 19;
        }

        @Override // com.p004ironsource.cl
        public void a(String script) {
            Intrinsics.f(script, "script");
            try {
                if (this.isKitkatAndAbove) {
                    b(script);
                } else {
                    c(script);
                }
            } catch (Throwable th) {
                q9.d().a(th);
                this.isKitkatAndAbove = false;
                c(script);
            }
        }

        public /* synthetic */ a(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? Build.VERSION.SDK_INT : i2);
        }

        @Override // com.p004ironsource.cl
        public boolean a() {
            return this.webView != null;
        }
    }

    void a(WebView webView);

    void a(String script);

    boolean a();
}
