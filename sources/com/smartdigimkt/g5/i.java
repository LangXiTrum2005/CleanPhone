package com.smartdigimkt.g5;

import android.net.http.SslError;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.smartdigimkt.sdk.basead.mraid.MraidWebView;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f35459a = "i";

    public class a implements Runnable {
        final /* synthetic */ com.smartdigimkt.v6.a X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.w6.f f35460Y;
        final /* synthetic */ int Z;
        final /* synthetic */ boolean e0;
        final /* synthetic */ String f0;
        final /* synthetic */ b g0;
        final /* synthetic */ MraidWebView h0;
        final /* synthetic */ String i0;

        /* JADX INFO: renamed from: com.smartdigimkt.g5.i$a$a, reason: collision with other inner class name */
        public class C0493a extends com.smartdigimkt.g5.b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            boolean f35461b = false;

            public C0493a() {
            }

            @Override // com.smartdigimkt.g5.b, com.smartdigimkt.u4.c
            public void onPageFinished(WebView webView, String str) {
                if (this.f35461b) {
                    return;
                }
                this.f35461b = true;
                if ("about:blank".equals(str)) {
                    a aVar = a.this;
                    String str2 = aVar.f0;
                    b bVar = aVar.g0;
                    if (bVar != null) {
                        bVar.a(com.smartdigimkt.v3.i.a("30005", "Html path is illegal!"));
                        return;
                    }
                    return;
                }
                c.a(webView);
                a aVar2 = a.this;
                MraidWebView mraidWebView = aVar2.h0;
                if (mraidWebView != null) {
                    com.smartdigimkt.r3.d.a(aVar2.i0, mraidWebView);
                }
                a aVar3 = a.this;
                String str3 = aVar3.f0;
                b bVar2 = aVar3.g0;
                if (bVar2 != null) {
                    bVar2.onPageFinished(aVar3.h0, str);
                }
            }

            @Override // com.smartdigimkt.g5.b, com.smartdigimkt.u4.c
            public void onReceivedError(WebView webView, int i2, String str, String str2) {
                if (this.f35461b) {
                    return;
                }
                this.f35461b = true;
                super.onReceivedError(webView, i2, str, str2);
                com.smartdigimkt.v3.h hVarA = com.smartdigimkt.v3.i.a("10000", i2 + "_" + str);
                String str3 = a.this.f0;
                hVarA.c();
                b bVar = a.this.g0;
                if (bVar != null) {
                    bVar.a(hVarA);
                }
            }

            @Override // com.smartdigimkt.g5.b, com.smartdigimkt.u4.c
            public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                if (this.f35461b) {
                    return;
                }
                this.f35461b = true;
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                com.smartdigimkt.v3.h hVarA = com.smartdigimkt.v3.i.a("10000", sslError != null ? sslError.toString() : "onReceivedSslError");
                String str = a.this.f0;
                hVarA.c();
                b bVar = a.this.g0;
                if (bVar != null) {
                    bVar.a(hVarA);
                }
            }
        }

        public a(com.smartdigimkt.v6.a aVar, com.smartdigimkt.w6.f fVar, int i2, boolean z2, String str, b bVar, MraidWebView mraidWebView, String str2) {
            this.X = aVar;
            this.f35460Y = fVar;
            this.Z = i2;
            this.e0 = z2;
            this.f0 = str;
            this.g0 = bVar;
            this.h0 = mraidWebView;
            this.i0 = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.smartdigimkt.i7.d.a(this.X, this.f35460Y, this.Z, this.e0);
            d dVar = new d();
            k kVar = new k(this.f0);
            kVar.a(new C0493a());
            this.h0.setWebViewClient(kVar);
            this.h0.setObject(dVar);
            this.h0.loadUrl(this.f0);
        }
    }

    public interface b {
        void a(com.smartdigimkt.v3.h hVar);

        void onPageFinished(WebView webView, String str);
    }

    public static String a(com.smartdigimkt.v6.a aVar, com.smartdigimkt.w6.f fVar) {
        com.smartdigimkt.w6.f fVar2;
        if (!TextUtils.isEmpty(fVar.P())) {
            if (com.smartdigimkt.k5.e.a().b(fVar, aVar)) {
                fVar2 = fVar;
                com.smartdigimkt.i7.d.a(aVar, fVar2, com.smartdigimkt.k5.e.a().b(), "1", false, "1", "can not inject omsdk js into offer_url");
            } else {
                fVar2 = fVar;
            }
            return fVar2.P();
        }
        if (TextUtils.isEmpty(fVar.K())) {
            return "";
        }
        File fileA = com.smartdigimkt.d7.d.c().a(aVar, fVar);
        if (fileA == null) {
            Log.e(f35459a, "loadMraidResource: html no exists: ");
            return com.smartdigimkt.d7.d.c().a(com.smartdigimkt.k5.e.a().a(fVar.K(), fVar, aVar), aVar, fVar);
        }
        Log.e(f35459a, "loadMraidResource: html exists: " + fileA.toURI().toString());
        return fileA.toURI().toString();
    }

    public static void a(String str, String str2, MraidWebView mraidWebView, b bVar, com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar, int i2, boolean z2) {
        if (mraidWebView == null) {
            return;
        }
        com.smartdigimkt.l7.b.a().e(new a(aVar, fVar, i2, z2, str2, bVar, mraidWebView, str));
    }
}
