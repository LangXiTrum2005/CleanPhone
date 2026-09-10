package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.umeng.analytics.pro.cw;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ey, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0702Ey extends WebViewClient {
    public static byte[] A05;
    public InterfaceC0698Eu A00 = new InterfaceC0698Eu() { // from class: com.facebook.ads.redexgen.X.hB
        @Override // com.facebook.ads.redexgen.core.InterfaceC0698Eu
        public final boolean AAU(String str) {
            return C0702Ey.A04(str);
        }
    };
    public WeakReference<InterfaceC0700Ew> A01 = new WeakReference<>(null);
    public final WeakReference<C1828k1> A02;
    public final WeakReference<InterfaceC0699Ev> A03;
    public final WeakReference<C0695Er> A04;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{28, 31, 18, 8, 9, 71, 31, 17, 28, 19, 22, 37, 42, 27, 37, 39, 48, 45, 50, 45, 48, 61, 12, 3, 9, 31, 2, 4, 9, 67, 4, 3, 25, 8, 3, 25, 67, 12, cw.l, 25, 4, 2, 3, 67, 59, 36, 40, 58, 119, 120, 114, 100, 121, 127, 114, 56, 127, 120, 98, 115, 120, 98, 56, 117, 119, 98, 115, 113, 121, 100, 111, 56, 84, 68, 89, 65, 69, 87, 84, 90, 83, 117, 101, 120, 96, 100, 114, 101, 72, 113, 118, 123, 123, 117, 118, 116, 124, 72, 98, 101, 123, 51, 54, 35, 54, 97, 102, 124, 109, 102, 124, 2, 5, 27, 77, 87, 31, cw.k, 10, 55, 30, 1, cw.k, 31};
    }

    public C0702Ey(WeakReference<C1828k1> weakReference, WeakReference<InterfaceC0699Ev> weakReference2, WeakReference<C0695Er> weakReference3) {
        this.A02 = weakReference;
        this.A03 = weakReference2;
        this.A04 = weakReference3;
    }

    private void A02(String str, C1828k1 c1828k1) {
        c1828k1.A08().AAu(A00(11, 11, 104), AbstractC05418a.A09, new C05428b(A00(111, 5, 91) + str));
    }

    private boolean A03(WebView webView, String str) {
        Intent intent;
        String strA00 = A00(116, 8, 68);
        C1828k1 c1828k1 = this.A02.get();
        if (c1828k1 == null) {
            return false;
        }
        if ((C1656h9.A0A && (TextUtils.isEmpty(str) || A00(0, 11, 81).equals(str))) || !this.A00.AAU(str)) {
            return true;
        }
        try {
            Uri uri = C5.A00(str);
            String scheme = uri.getScheme();
            try {
                boolean zA13 = C05789m.A13(c1828k1);
                String strA01 = A00(48, 33, 58);
                String strA02 = A00(22, 26, 65);
                String strA03 = A00(105, 6, 36);
                if (zA13) {
                    if (!C1656h9.A0E.contains(scheme) && !A00(101, 4, 123).equals(scheme)) {
                        if (strA03.equalsIgnoreCase(scheme)) {
                            intent = Intent.parseUri(str, 1);
                            intent.setComponent(null);
                            intent.setSelector(null);
                        } else {
                            intent = new Intent(strA02, uri);
                        }
                        intent.addCategory(strA01);
                        if (Build.VERSION.SDK_INT >= 30) {
                            intent.setFlags(268436480);
                        } else {
                            intent.setFlags(268435456);
                        }
                        try {
                            if (!C0620Bq.A0D(c1828k1, intent)) {
                                A02(str, c1828k1);
                            }
                            return true;
                        } catch (C0618Bo unused) {
                            if (strA03.equals(scheme)) {
                                String stringExtra = intent.getStringExtra(A00(81, 20, 59));
                                if (!TextUtils.isEmpty(stringExtra)) {
                                    if (!C0620Bq.A0D(c1828k1, new Intent(strA02, C5.A00(stringExtra)))) {
                                        A02(str, c1828k1);
                                    }
                                    return true;
                                }
                            }
                            C05428b c05428b = new C05428b(A00(111, 5, 91) + str);
                            c05428b.A05(1);
                            c1828k1.A08().AAv(A00(11, 11, 104), AbstractC05418a.A06, c05428b);
                            return true;
                        }
                    }
                    return false;
                }
                if (C1656h9.A0A && strA03.equalsIgnoreCase(scheme)) {
                    Intent uri2 = Intent.parseUri(str, 1);
                    uri2.addCategory(strA01);
                    uri2.setComponent(null);
                    uri2.setSelector(null);
                    if (c1828k1.getPackageManager().resolveActivity(uri2, 65536) != null && C0620Bq.A0D(c1828k1, uri2)) {
                        webView.goBack();
                        return true;
                    }
                } else if ((C1656h9.A0A && CT.A04(str)) || !C1656h9.A0E.contains(scheme)) {
                    return C0620Bq.A0D(c1828k1, new Intent(strA02, uri));
                }
            } catch (Exception e) {
                c1828k1.A08().AAv(strA00, AbstractC05418a.A2d, new C05428b(e));
                c1828k1.A0F().A9s(e.toString());
            }
            return false;
        } catch (SecurityException e2) {
            c1828k1.A08().AAv(strA00, AbstractC05418a.A2d, new C05428b(e2));
            return true;
        }
    }

    public static /* synthetic */ boolean A04(String str) {
        return true;
    }

    public final void A05(InterfaceC0698Eu interfaceC0698Eu) {
        this.A00 = interfaceC0698Eu;
    }

    public final void A06(WeakReference<InterfaceC0700Ew> weakReference) {
        this.A01 = weakReference;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C0695Er timingLogger = this.A04.get();
        if (timingLogger != null) {
            timingLogger.A03();
        }
        InterfaceC0699Ev interfaceC0699Ev = this.A03.get();
        if (interfaceC0699Ev != null) {
            interfaceC0699Ev.AEM(str);
        }
        InterfaceC0700Ew interfaceC0700Ew = this.A01.get();
        if (interfaceC0700Ew != null) {
            interfaceC0700Ew.ACT(webView.canGoBack());
            interfaceC0700Ew.ADC(webView.canGoForward());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        InterfaceC0699Ev listener = this.A03.get();
        if (listener != null) {
            listener.AEO(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        C1828k1 c1828k1 = this.A02.get();
        if (c1828k1 != null) {
            StringBuilder sb = new StringBuilder();
            String strA00 = A00(0, 0, 109);
            String errorMessage = CT.A01(i, sb.append(strA00).append(str).toString(), strA00 + str2);
            c1828k1.A0F().A9p(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        C1828k1 c1828k1 = this.A02.get();
        if (c1828k1 != null) {
            int errorCode = webResourceError.getErrorCode();
            StringBuilder sb = new StringBuilder();
            String strA00 = A00(0, 0, 109);
            String errorMessage = CT.A01(errorCode, sb.append(strA00).append((Object) webResourceError.getDescription()).toString(), strA00 + webResourceRequest.getUrl());
            c1828k1.A0F().A9p(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        C1828k1 context = this.A02.get();
        if (context != null) {
            context.A0F().A9q();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        C1828k1 context = this.A02.get();
        if (context != null) {
            context.A0F().A9r();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        F1.A02(AbstractC05418a.A2e);
        InterfaceC0699Ev listener = this.A03.get();
        if (listener != null) {
            listener.AEo();
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return A03(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return A03(webView, str);
    }
}
