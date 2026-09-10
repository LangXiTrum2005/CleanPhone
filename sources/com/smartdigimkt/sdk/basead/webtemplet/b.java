package com.smartdigimkt.sdk.basead.webtemplet;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.smartdigimkt.h6.e;
import com.smartdigimkt.r3.d;
import com.smartdigimkt.v3.h;
import com.smartdigimkt.v3.i;
import com.smartdigimkt.w6.f;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f38595a = "b";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f38596b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f38597c = 2;
    public static final int d = -999;

    public class a implements Runnable {
        final /* synthetic */ String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ WTWebView f38598Y;
        final /* synthetic */ f Z;
        final /* synthetic */ com.smartdigimkt.v6.a e0;
        final /* synthetic */ int f0;
        final /* synthetic */ String g0;
        final /* synthetic */ InterfaceC0613b h0;
        final /* synthetic */ Object i0;

        /* JADX INFO: renamed from: com.smartdigimkt.sdk.basead.webtemplet.b$a$a, reason: collision with other inner class name */
        public class C0612a extends com.smartdigimkt.g6.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            boolean f38599a = false;

            public C0612a() {
            }

            @Override // com.smartdigimkt.g6.b, com.smartdigimkt.g6.c
            public void a(WebView webView) {
                a aVar = a.this;
                if (aVar.f0 == 1) {
                    d.a(aVar.g0, aVar.f38598Y);
                }
                if (this.f38599a) {
                    return;
                }
                this.f38599a = true;
                String unused = b.f38595a;
                a aVar2 = a.this;
                String str = aVar2.X;
                InterfaceC0613b interfaceC0613b = aVar2.h0;
                if (interfaceC0613b != null) {
                    interfaceC0613b.a(aVar2.f38598Y);
                }
            }

            @Override // com.smartdigimkt.g6.b, com.smartdigimkt.g6.c
            public void onReceivedError(WebView webView, int i2, String str, String str2) {
                h hVarA;
                if (this.f38599a) {
                    return;
                }
                this.f38599a = true;
                a.this.f38598Y.release();
                super.onReceivedError(webView, i2, str, str2);
                if (i2 == -999) {
                    hVarA = i.a("30010", i2 + "_" + str);
                } else {
                    hVarA = i.a("10000", i2 + "_" + str);
                }
                String unused = b.f38595a;
                String str3 = a.this.X;
                hVarA.c();
                InterfaceC0613b interfaceC0613b = a.this.h0;
                if (interfaceC0613b != null) {
                    interfaceC0613b.a(hVarA);
                }
            }

            @Override // com.smartdigimkt.g6.b, com.smartdigimkt.g6.c
            public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                if (this.f38599a) {
                    return;
                }
                this.f38599a = true;
                a.this.f38598Y.release();
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                h hVarA = i.a("10000", sslError != null ? sslError.toString() : "onReceivedSslError");
                String unused = b.f38595a;
                String str = a.this.X;
                hVarA.c();
                InterfaceC0613b interfaceC0613b = a.this.h0;
                if (interfaceC0613b != null) {
                    interfaceC0613b.a(hVarA);
                }
            }

            @Override // com.smartdigimkt.g6.b, com.smartdigimkt.g6.c
            public void onRenderProcessGone(WebView webView) {
                super.onRenderProcessGone(webView);
                if (this.f38599a) {
                    return;
                }
                this.f38599a = true;
                a.this.f38598Y.release();
                h hVarA = i.a("10000", "onRenderProcessGone");
                String unused = b.f38595a;
                String str = a.this.X;
                hVarA.c();
                InterfaceC0613b interfaceC0613b = a.this.h0;
                if (interfaceC0613b != null) {
                    interfaceC0613b.a(hVarA);
                }
            }
        }

        public a(String str, WTWebView wTWebView, f fVar, com.smartdigimkt.v6.a aVar, int i2, String str2, InterfaceC0613b interfaceC0613b, Object obj) {
            this.X = str;
            this.f38598Y = wTWebView;
            this.Z = fVar;
            this.e0 = aVar;
            this.f0 = i2;
            this.g0 = str2;
            this.h0 = interfaceC0613b;
            this.i0 = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            String unused = b.f38595a;
            this.f38598Y.initData(this.Z, this.e0, this.f0 == 1);
            this.f38598Y.setWebViewListener(new C0612a());
            Object obj = this.i0;
            if (obj instanceof e) {
                ((e) obj).a(this.Z, this.e0);
            }
            this.f38598Y.setJsCommunicationObject(this.i0);
            this.f38598Y.loadUrl(this.X);
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.sdk.basead.webtemplet.b$b, reason: collision with other inner class name */
    public interface InterfaceC0613b {
        void a(WebView webView);

        void a(h hVar);
    }

    public static void a(String str, String str2, WTWebView wTWebView, InterfaceC0613b interfaceC0613b, f fVar, com.smartdigimkt.v6.a aVar, int i2, Object obj) {
        if (wTWebView == null) {
            h hVarA = i.a("10000", "wtWebView is null");
            hVarA.c();
            if (interfaceC0613b != null) {
                interfaceC0613b.a(hVarA);
                return;
            }
            return;
        }
        if (obj == null) {
            h hVarA2 = i.a("10000", "h5 template not support this format");
            hVarA2.c();
            if (interfaceC0613b != null) {
                interfaceC0613b.a(hVarA2);
            }
        }
        com.smartdigimkt.l7.b.a().e(new a(str2, wTWebView, fVar, aVar, i2, str, interfaceC0613b, obj));
    }
}
