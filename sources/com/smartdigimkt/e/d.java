package com.smartdigimkt.e;

import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.smartdigimkt.c3.e;
import com.smartdigimkt.c3.i;
import com.smartdigimkt.expressad.advanced.js.NativeAdvancedJSBridgeImpl;
import com.smartdigimkt.expressad.advanced.js.NativeAdvancedJsUtils;
import com.smartdigimkt.expressad.advanced.view.ATNativeAdvancedView;
import com.smartdigimkt.expressad.advanced.view.ATNativeAdvancedWebview;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f34572a = "ResManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f34573b = 1;

    public class a extends com.smartdigimkt.k.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.x.d f34574b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ATNativeAdvancedView f34575c;
        final /* synthetic */ c d;

        public a(com.smartdigimkt.x.d dVar, ATNativeAdvancedView aTNativeAdvancedView, c cVar) {
            this.f34574b = dVar;
            this.f34575c = aTNativeAdvancedView;
            this.d = cVar;
        }

        @Override // com.smartdigimkt.k.b, com.smartdigimkt.u4.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!this.f34574b.I2()) {
                com.smartdigimkt.c.a.a(this.f34574b.N1(), true);
                this.f34575c.setH5Ready(true);
            }
            NativeAdvancedJsUtils.fireOnJSBridgeConnected(webView);
        }

        @Override // com.smartdigimkt.k.b, com.smartdigimkt.u4.c
        public void onReceivedError(WebView webView, int i2, String str, String str2) {
            super.onReceivedError(webView, i2, str, str2);
            this.f34575c.setH5Ready(false);
            c cVar = this.d;
            if (cVar != null) {
                cVar.a(str);
            }
        }

        @Override // com.smartdigimkt.k.b, com.smartdigimkt.u4.c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            this.f34575c.setH5Ready(false);
            c cVar = this.d;
            if (cVar != null) {
                cVar.a(sslError.toString());
            }
        }

        @Override // com.smartdigimkt.k.b, com.smartdigimkt.u4.c
        public void readyState(WebView webView, int i2) {
            super.readyState(webView, i2);
            if (i2 == 1) {
                com.smartdigimkt.c.a.a(this.f34574b.N1(), true);
                this.f34575c.setH5Ready(true);
            } else {
                this.f34575c.setH5Ready(false);
            }
            c cVar = this.d;
            if (cVar != null) {
                cVar.b();
            }
        }
    }

    public class b implements Runnable {
        final /* synthetic */ ATNativeAdvancedWebview X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ String f34576Y;

        public b(ATNativeAdvancedWebview aTNativeAdvancedWebview, String str) {
            this.X = aTNativeAdvancedWebview;
            this.f34576Y = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.X.loadUrl(this.f34576Y);
        }
    }

    public interface c {
        void a(String str);

        void b();
    }

    private static com.smartdigimkt.x.d a(com.smartdigimkt.x.d dVar) {
        if (!TextUtils.isEmpty(dVar.U()) || (!TextUtils.isEmpty(dVar.Q()) && dVar.Q().contains("<MBTPLMARK>"))) {
            dVar.h(true);
            dVar.k(false);
            return dVar;
        }
        dVar.h(false);
        dVar.k(true);
        return dVar;
    }

    public static boolean a(ATNativeAdvancedView aTNativeAdvancedView, com.smartdigimkt.x.d dVar, String str, String str2, int i2, boolean z2, c cVar) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = false;
        if (dVar != null) {
            aTNativeAdvancedView.clearResState();
            z3 = true;
            if (!TextUtils.isEmpty(dVar.u2())) {
                boolean zB = e.a().b(com.smartdigimkt.b0.a.b1, str2, dVar.D2());
                if (zB) {
                    aTNativeAdvancedView.setVideoReady(true);
                }
                z4 = zB;
            } else {
                aTNativeAdvancedView.setVideoReady(true);
                z4 = true;
            }
            if (!TextUtils.isEmpty(dVar.B2()) && !aTNativeAdvancedView.isEndCardReady() && !TextUtils.isEmpty(i.a().c(dVar.B2()))) {
                aTNativeAdvancedView.setEndCardReady(true);
            }
            if (TextUtils.isEmpty(dVar.U()) || aTNativeAdvancedView.isH5Ready()) {
                z5 = false;
            } else {
                String strC = i.a().c(dVar.U());
                if (TextUtils.isEmpty(strC)) {
                    z5 = false;
                } else if (com.smartdigimkt.c.a.a(dVar.N1())) {
                    aTNativeAdvancedView.setH5Ready(true);
                    z5 = false;
                    z4 = true;
                } else {
                    a(aTNativeAdvancedView, strC, dVar, str, str2, i2, cVar);
                    z5 = true;
                    if (!z2) {
                    }
                }
                z4 = false;
            }
            if (!TextUtils.isEmpty(dVar.U()) || TextUtils.isEmpty(dVar.Q()) || aTNativeAdvancedView.isH5Ready()) {
                z3 = z5;
            } else {
                String strA = a(dVar.Q());
                if (TextUtils.isEmpty(strA)) {
                    z3 = z5;
                } else if (com.smartdigimkt.c.a.a(dVar.N1())) {
                    aTNativeAdvancedView.setH5Ready(true);
                    if (dVar.K2()) {
                        aTNativeAdvancedView.setVideoReady(true);
                    }
                    z6 = true;
                    z3 = z5;
                } else {
                    a(aTNativeAdvancedView, strA, dVar, str, str2, i2, cVar);
                    if (z2) {
                    }
                }
            }
            z6 = z4;
        } else {
            z3 = false;
        }
        if (z6 && !z3 && cVar != null) {
            cVar.b();
        }
        return z6;
    }

    private static void a(ATNativeAdvancedView aTNativeAdvancedView, String str, com.smartdigimkt.x.d dVar, String str2, String str3, int i2) {
        a(aTNativeAdvancedView, str, dVar, str2, str3, i2, (c) null);
    }

    private static void a(ATNativeAdvancedView aTNativeAdvancedView, String str, com.smartdigimkt.x.d dVar, String str2, String str3, int i2, c cVar) {
        if (aTNativeAdvancedView == null || aTNativeAdvancedView.getAdvancedNativeWebview() == null) {
            return;
        }
        NativeAdvancedJSBridgeImpl nativeAdvancedJSBridgeImpl = new NativeAdvancedJSBridgeImpl(aTNativeAdvancedView.getContext(), str2, str3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar);
        nativeAdvancedJSBridgeImpl.setCampaignList(arrayList);
        nativeAdvancedJSBridgeImpl.setAllowSkip(i2);
        aTNativeAdvancedView.setAdvancedNativeJSBridgeImpl(nativeAdvancedJSBridgeImpl);
        ATNativeAdvancedWebview advancedNativeWebview = aTNativeAdvancedView.getAdvancedNativeWebview();
        System.currentTimeMillis();
        advancedNativeWebview.setWebViewListener(new a(dVar, aTNativeAdvancedView, cVar));
        if (!advancedNativeWebview.isDestroyed()) {
            new Handler(Looper.getMainLooper()).post(new b(advancedNativeWebview, str));
        } else {
            aTNativeAdvancedView.setH5Ready(false);
        }
    }

    private static String a(String str) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                return "";
            }
            return "file:///" + file.getAbsolutePath();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Exception e2) {
                e2.getMessage();
                return "";
            }
        }
    }

    public static boolean a(ATNativeAdvancedView aTNativeAdvancedView, com.smartdigimkt.x.d dVar, String str, String str2) {
        if (aTNativeAdvancedView == null) {
            return false;
        }
        boolean zIsVideoReady = !TextUtils.isEmpty(dVar.u2()) ? aTNativeAdvancedView.isVideoReady() : true;
        if (zIsVideoReady && !TextUtils.isEmpty(dVar.U())) {
            zIsVideoReady = com.smartdigimkt.c.a.a(dVar.N1());
            dVar.N1();
        }
        if (zIsVideoReady && TextUtils.isEmpty(dVar.U()) && !TextUtils.isEmpty(dVar.Q())) {
            zIsVideoReady = com.smartdigimkt.c.a.a(dVar.N1());
        }
        boolean z2 = (TextUtils.isEmpty(dVar.U()) && TextUtils.isEmpty(dVar.Q())) ? false : zIsVideoReady;
        return (!z2 || TextUtils.isEmpty(dVar.B2())) ? z2 : aTNativeAdvancedView.isEndCardReady();
    }
}
