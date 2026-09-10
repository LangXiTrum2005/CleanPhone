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
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.at, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1941at extends WebViewClient {
    public static byte[] A05;
    public final WeakReference<C2300gi> A02;
    public final WeakReference<InterfaceC1938aq> A03;
    public final WeakReference<C1933al> A04;
    public final InterfaceC1937ap A01 = new InterfaceC1937ap() { // from class: com.facebook.ads.redexgen.X.M4
        @Override // com.facebook.ads.redexgen.core.InterfaceC1937ap
        public final boolean AAf(String str) {
            return C1941at.A04(str);
        }
    };
    public WeakReference<InterfaceC1939ar> A00 = new WeakReference<>(null);

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{28, 31, 18, 8, 9, 71, 31, 17, 28, 19, 22, 37, 42, 27, 37, 39, 48, 45, 50, 45, 48, 61, 12, 3, 9, 31, 2, 4, 9, 67, 4, 3, 25, 8, 3, 25, 67, 12, 14, 25, 4, 2, 3, 67, 59, 36, 40, 58, 119, 120, 114, 100, 121, AbstractJsonLexerKt.TC_INVALID, 114, 56, AbstractJsonLexerKt.TC_INVALID, 120, 98, 115, 120, 98, 56, 117, 119, 98, 115, 113, 121, 100, 111, 56, 84, 68, 89, 65, 69, 87, 84, 90, 83, 117, 101, 120, 96, 100, 114, 101, 72, 113, 118, 123, 123, 117, 118, 116, 124, 72, 98, 101, 123, 51, 54, 35, 54, 97, 102, 124, 109, 102, 124, 2, 5, 27, 77, 87, 31, 13, 10, 55, 30, 1, 13, 31};
    }

    public C1941at(WeakReference<C2300gi> weakReference, WeakReference<InterfaceC1938aq> weakReference2, WeakReference<C1933al> weakReference3) {
        this.A02 = weakReference;
        this.A03 = weakReference2;
        this.A04 = weakReference3;
    }

    private void A02(String str, C2300gi c2300gi) {
        c2300gi.A08().ABC(A00(11, 11, 104), AbstractC1712Td.A09, new C1713Te(A00(111, 5, 91) + str));
    }

    private boolean A03(WebView webView, String str) {
        Intent intent;
        String strA00 = A00(116, 8, 68);
        C2300gi c2300gi = this.A02.get();
        if (c2300gi != null) {
            if ((M3.A0A && (TextUtils.isEmpty(str) || A00(0, 11, 81).equals(str))) || !this.A01.AAf(str)) {
                return true;
            }
            try {
                Uri uri = XB.A00(str);
                String scheme = uri.getScheme();
                try {
                    boolean zA14 = C1750Up.A14(c2300gi);
                    String strA01 = A00(48, 33, 58);
                    String strA02 = A00(22, 26, 65);
                    String strA03 = A00(105, 6, 36);
                    if (zA14) {
                        if (!M3.A0D.contains(scheme) && !A00(101, 4, 123).equals(scheme)) {
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
                                if (!C1804Wu.A0D(c2300gi, intent)) {
                                    A02(str, c2300gi);
                                }
                                return true;
                            } catch (C1802Ws unused) {
                                if (strA03.equals(scheme)) {
                                    String stringExtra = intent.getStringExtra(A00(81, 20, 59));
                                    if (!TextUtils.isEmpty(stringExtra)) {
                                        if (!C1804Wu.A0D(c2300gi, new Intent(strA02, XB.A00(stringExtra)))) {
                                            A02(str, c2300gi);
                                        }
                                        return true;
                                    }
                                }
                                C1713Te c1713Te = new C1713Te(A00(111, 5, 91) + str);
                                c1713Te.A05(1);
                                c2300gi.A08().ABD(A00(11, 11, 104), AbstractC1712Td.A06, c1713Te);
                                return true;
                            }
                        }
                        return false;
                    }
                    if (!M3.A0A || !strA03.equalsIgnoreCase(scheme)) {
                        if ((M3.A0A && AbstractC1809Xb.A04(str)) || !M3.A0D.contains(scheme)) {
                            return C1804Wu.A0D(c2300gi, new Intent(strA02, uri));
                        }
                    } else {
                        Intent uri2 = Intent.parseUri(str, 1);
                        uri2.addCategory(strA01);
                        uri2.setComponent(null);
                        uri2.setSelector(null);
                        if (c2300gi.getPackageManager().resolveActivity(uri2, 65536) != null && C1804Wu.A0D(c2300gi, uri2)) {
                            webView.goBack();
                            return true;
                        }
                    }
                } catch (Exception e2) {
                    c2300gi.A08().ABD(strA00, AbstractC1712Td.A2d, new C1713Te(e2));
                    c2300gi.A0F().AA2(e2.toString());
                }
                return false;
            } catch (SecurityException e3) {
                c2300gi.A08().ABD(strA00, AbstractC1712Td.A2d, new C1713Te(e3));
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean A04(String str) {
        return true;
    }

    public final void A05(WeakReference<InterfaceC1939ar> weakReference) {
        this.A00 = weakReference;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C1933al timingLogger = this.A04.get();
        if (timingLogger != null) {
            timingLogger.A03();
        }
        InterfaceC1938aq interfaceC1938aq = this.A03.get();
        if (interfaceC1938aq != null) {
            interfaceC1938aq.AF7(str);
        }
        InterfaceC1939ar interfaceC1939ar = this.A00.get();
        if (interfaceC1939ar != null) {
            interfaceC1939ar.ADB(webView.canGoBack());
            interfaceC1939ar.ADx(webView.canGoForward());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        InterfaceC1938aq listener = this.A03.get();
        if (listener != null) {
            listener.AF9(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        super.onReceivedError(webView, i2, str, str2);
        C2300gi c2300gi = this.A02.get();
        if (c2300gi != null) {
            StringBuilder sb = new StringBuilder();
            String strA00 = A00(0, 0, 109);
            String errorMessage = AbstractC1809Xb.A01(i2, sb.append(strA00).append(str).toString(), strA00 + str2);
            c2300gi.A0F().A9z(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        C2300gi c2300gi = this.A02.get();
        if (c2300gi != null) {
            int errorCode = webResourceError.getErrorCode();
            StringBuilder sb = new StringBuilder();
            String strA00 = A00(0, 0, 109);
            String errorMessage = AbstractC1809Xb.A01(errorCode, sb.append(strA00).append((Object) webResourceError.getDescription()).toString(), strA00 + webResourceRequest.getUrl());
            c2300gi.A0F().A9z(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        C2300gi context = this.A02.get();
        if (context != null) {
            context.A0F().AA0();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        C2300gi context = this.A02.get();
        if (context != null) {
            context.A0F().AA1();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC1946ay.A0D(AbstractC1712Td.A2e);
        InterfaceC1938aq listener = this.A03.get();
        if (listener != null) {
            listener.AFe();
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
