package com.google.android.gms.internal.ads;

import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class fz0 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14605b;

    public /* synthetic */ fz0(Object obj, int i10) {
        this.f14604a = i10;
        this.f14605b = obj;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        switch (this.f14604a) {
            case 1:
                com.google.android.gms.internal.consent_sdk.t tVar = (com.google.android.gms.internal.consent_sdk.t) this.f14605b;
                int i10 = com.google.android.gms.internal.consent_sdk.t.f23197d;
                if (str != null && str.startsWith("consent://")) {
                    tVar.f23199b.a(str);
                    break;
                }
                break;
            default:
                super.onLoadResource(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        ProgressDialog progressDialog;
        switch (this.f14604a) {
            case 1:
                com.google.android.gms.internal.consent_sdk.t tVar = (com.google.android.gms.internal.consent_sdk.t) this.f14605b;
                if (!tVar.f23200c) {
                    Log.d("UserMessagingPlatform", "Wall html loaded.");
                    tVar.f23200c = true;
                }
                break;
            case 2:
            default:
                super.onPageFinished(view, url);
                break;
            case 3:
                kotlin.jvm.internal.n.f(view, "view");
                kotlin.jvm.internal.n.f(url, "url");
                super.onPageFinished(view, url);
                q7.l0 l0Var = (q7.l0) this.f14605b;
                if (!l0Var.f48720j && (progressDialog = l0Var.f48715e) != null) {
                    progressDialog.dismiss();
                }
                FrameLayout frameLayout = l0Var.f48717g;
                if (frameLayout != null) {
                    frameLayout.setBackgroundColor(0);
                }
                q7.k0 k0Var = l0Var.f48714d;
                if (k0Var != null) {
                    k0Var.setVisibility(0);
                }
                ImageView imageView = l0Var.f48716f;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                l0Var.f48721k = true;
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap bitmap) {
        ProgressDialog progressDialog;
        switch (this.f14604a) {
            case 3:
                kotlin.jvm.internal.n.f(view, "view");
                kotlin.jvm.internal.n.f(url, "url");
                q7.e0.B("FacebookSDK.WebDialog", "Webview loading URL: ".concat(url));
                super.onPageStarted(view, url, bitmap);
                q7.l0 l0Var = (q7.l0) this.f14605b;
                if (!l0Var.f48720j && (progressDialog = l0Var.f48715e) != null) {
                    progressDialog.show();
                    break;
                }
                break;
            default:
                super.onPageStarted(view, url, bitmap);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, int i10, String description, String failingUrl) {
        switch (this.f14604a) {
            case 1:
                com.google.android.gms.internal.consent_sdk.w wVar = ((com.google.android.gms.internal.consent_sdk.t) this.f14605b).f23199b;
                wVar.getClass();
                Locale locale = Locale.US;
                wVar.f23233g.b(new com.google.android.gms.internal.consent_sdk.p1(2, "WebResourceError(" + i10 + ", " + failingUrl + "): " + description));
                break;
            case 2:
            default:
                super.onReceivedError(view, i10, description, failingUrl);
                break;
            case 3:
                kotlin.jvm.internal.n.f(view, "view");
                kotlin.jvm.internal.n.f(description, "description");
                kotlin.jvm.internal.n.f(failingUrl, "failingUrl");
                super.onReceivedError(view, i10, description, failingUrl);
                ((q7.l0) this.f14605b).e(new l7.m(description, i10, failingUrl));
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        switch (this.f14604a) {
            case 3:
                kotlin.jvm.internal.n.f(view, "view");
                kotlin.jvm.internal.n.f(handler, "handler");
                kotlin.jvm.internal.n.f(error, "error");
                super.onReceivedSslError(view, handler, error);
                handler.cancel();
                ((q7.l0) this.f14605b).e(new l7.m(null, -11, null));
                break;
            default:
                super.onReceivedSslError(view, handler, error);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        switch (this.f14604a) {
            case 0:
                String string = renderProcessGoneDetail.toString();
                String strValueOf = String.valueOf(webView);
                Log.w("NativeBridge", d5.u.h(new StringBuilder(String.valueOf(string).length() + 36 + strValueOf.length()), "WebView renderer gone: ", string, "for WebView: ", strValueOf));
                gz0 gz0Var = (gz0) this.f14605b;
                if (gz0Var.c() == webView) {
                    Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                    gz0Var.f13771b = new oz0(null);
                }
                webView.destroy();
                return true;
            case 1:
                if (webView != null) {
                    String str = true != renderProcessGoneDetail.didCrash() ? "was stopped by system" : "crashed";
                    Log.w("UserMessagingPlatform", "WebView render process " + str + ". Renderer priority at exit: " + renderProcessGoneDetail.rendererPriorityAtExit());
                    ViewGroup viewGroup = (ViewGroup) webView.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(webView);
                    }
                    webView.destroy();
                }
                return true;
            default:
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        int i10 = this.f14604a;
        Object obj = this.f14605b;
        switch (i10) {
            case 1:
                String string = webResourceRequest.getUrl().toString();
                com.google.android.gms.internal.consent_sdk.t tVar = (com.google.android.gms.internal.consent_sdk.t) obj;
                int i11 = com.google.android.gms.internal.consent_sdk.t.f23197d;
                if (string == null || !string.startsWith("consent://")) {
                    return false;
                }
                tVar.f23199b.a(string);
                return true;
            case 2:
                ((WebViewActivity) ((a30) obj).f11818b).f43414c.loadUrl(webResourceRequest.getUrl().toString());
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    public /* synthetic */ fz0(com.google.android.gms.internal.consent_sdk.t tVar) {
        this.f14604a = 1;
        Objects.requireNonNull(tVar);
        this.f14605b = tVar;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        int i10;
        int i11 = this.f14604a;
        Object obj = this.f14605b;
        switch (i11) {
            case 1:
                com.google.android.gms.internal.consent_sdk.t tVar = (com.google.android.gms.internal.consent_sdk.t) obj;
                int i12 = com.google.android.gms.internal.consent_sdk.t.f23197d;
                if (url == null || !url.startsWith("consent://")) {
                    return false;
                }
                tVar.f23199b.a(url);
                return true;
            case 2:
            default:
                return super.shouldOverrideUrlLoading(view, url);
            case 3:
                q7.l0 l0Var = (q7.l0) obj;
                kotlin.jvm.internal.n.f(view, "view");
                kotlin.jvm.internal.n.f(url, "url");
                q7.e0.B("FacebookSDK.WebDialog", "Redirect URL: ".concat(url));
                Uri uri = Uri.parse(url);
                boolean z10 = uri.getPath() != null && Pattern.matches("^/(v\\d+\\.\\d+/)??dialog/.*", uri.getPath());
                if (an.p.p0(url, l0Var.f48712b, false)) {
                    Bundle bundleC = l0Var.c(url);
                    String string = bundleC.getString("error");
                    if (string == null) {
                        string = bundleC.getString("error_type");
                    }
                    String string2 = bundleC.getString("error_msg");
                    if (string2 == null) {
                        string2 = bundleC.getString("error_message");
                    }
                    if (string2 == null) {
                        string2 = bundleC.getString("error_description");
                    }
                    String string3 = bundleC.getString("error_code");
                    if (string3 == null || q7.e0.w(string3)) {
                        i10 = -1;
                    } else {
                        try {
                            i10 = Integer.parseInt(string3);
                        } catch (NumberFormatException unused) {
                            i10 = -1;
                        }
                    }
                    if (q7.e0.w(string) && q7.e0.w(string2) && i10 == -1) {
                        q7.g0 g0Var = l0Var.f48713c;
                        if (g0Var != null && !l0Var.f48719i) {
                            l0Var.f48719i = true;
                            g0Var.a(bundleC, null);
                            l0Var.dismiss();
                        }
                    } else if ((string != null && (string.equals("access_denied") || string.equals("OAuthAccessDeniedException"))) || i10 == 4201) {
                        l0Var.cancel();
                    } else {
                        l0Var.e(new l7.u(new l7.q(i10, string, string2), string2));
                    }
                    break;
                } else {
                    if (an.p.p0(url, "fbconnect://cancel", false)) {
                        l0Var.cancel();
                    } else {
                        if (z10 || an.h.q0(url, "touch", false)) {
                            return false;
                        }
                        try {
                            l0Var.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
                        } catch (ActivityNotFoundException unused2) {
                            return false;
                        }
                    }
                    break;
                }
                return true;
        }
    }
}
