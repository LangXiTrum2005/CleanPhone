package tj;

import android.net.Uri;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.google.android.gms.internal.measurement.nf;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class p0 extends m0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f50884h = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f50885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f50886c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f50887d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f50888e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f50889f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f50890g = false;

    public p0(o oVar) {
        this.f50885b = oVar;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage messageArg) {
        bh.a aVar = new bh.a(25);
        o oVar = this.f50885b;
        oVar.getClass();
        kotlin.jvm.internal.n.f(messageArg, "messageArg");
        nf nfVar = oVar.f50873a;
        nfVar.getClass();
        if (((c) nfVar.f23783c).d(this)) {
            new k5.g((xi.f) nfVar.f23782b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onConsoleMessage", nfVar.e(), (Object) null).y(xj.o.Q(this, messageArg), new r1.q(aVar, 26));
        } else {
            q4.a.p("missing-instance-error", "Callback to `WebChromeClient.onConsoleMessage` failed because native instance was not in the instance manager.", "");
        }
        return this.f50887d;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        bh.a aVar = new bh.a(25);
        o oVar = this.f50885b;
        oVar.getClass();
        nf nfVar = oVar.f50873a;
        nfVar.getClass();
        if (((c) nfVar.f23783c).d(this)) {
            new k5.g((xi.f) nfVar.f23782b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsHidePrompt", nfVar.e(), (Object) null).y(j1.f.C(this), new r1.q(aVar, 28));
        } else {
            q4.a.p("missing-instance-error", "Callback to `WebChromeClient.onGeolocationPermissionsHidePrompt` failed because native instance was not in the instance manager.", "");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String originArg, GeolocationPermissions.Callback callbackArg) {
        bh.a aVar = new bh.a(25);
        o oVar = this.f50885b;
        oVar.getClass();
        kotlin.jvm.internal.n.f(originArg, "originArg");
        kotlin.jvm.internal.n.f(callbackArg, "callbackArg");
        nf nfVar = oVar.f50873a;
        nfVar.getClass();
        if (((c) nfVar.f23783c).d(this)) {
            new k5.g((xi.f) nfVar.f23782b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsShowPrompt", nfVar.e(), (Object) null).y(xj.o.Q(this, originArg, callbackArg), new r1.q(aVar, 27));
        } else {
            q4.a.p("missing-instance-error", "Callback to `WebChromeClient.onGeolocationPermissionsShowPrompt` failed because native instance was not in the instance manager.", "");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        bh.a aVar = new bh.a(25);
        o oVar = this.f50885b;
        oVar.getClass();
        nf nfVar = oVar.f50873a;
        nfVar.getClass();
        if (((c) nfVar.f23783c).d(this)) {
            new k5.g((xi.f) nfVar.f23782b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onHideCustomView", nfVar.e(), (Object) null).y(j1.f.C(this), new r1.q(aVar, 22));
        } else {
            q4.a.p("missing-instance-error", "Callback to `WebChromeClient.onHideCustomView` failed because native instance was not in the instance manager.", "");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webViewArg, String urlArg, String messageArg, JsResult jsResult) {
        if (!this.f50888e) {
            return false;
        }
        n0 n0Var = new n0(this, jsResult, 1);
        lj.l0 l0Var = new lj.l0(n0Var, 1);
        o oVar = this.f50885b;
        oVar.getClass();
        kotlin.jvm.internal.n.f(webViewArg, "webViewArg");
        kotlin.jvm.internal.n.f(urlArg, "urlArg");
        kotlin.jvm.internal.n.f(messageArg, "messageArg");
        nf nfVar = oVar.f50873a;
        nfVar.getClass();
        if (((c) nfVar.f23783c).d(this)) {
            new k5.g((xi.f) nfVar.f23782b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsAlert", nfVar.e(), (Object) null).y(xj.o.Q(this, webViewArg, urlArg, messageArg), new d0(l0Var, 1));
            return true;
        }
        Throwable thA = wj.h.a(t9.e.c(new a("missing-instance-error", "Callback to `WebChromeClient.onJsAlert` failed because native instance was not in the instance manager.", "")));
        nf nfVar2 = n0Var.f50871b.f50885b.f50873a;
        Objects.requireNonNull(thA);
        nfVar2.getClass();
        nf.r(thA);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webViewArg, String urlArg, String messageArg, JsResult jsResult) {
        if (!this.f50889f) {
            return false;
        }
        n0 n0Var = new n0(this, jsResult, 0);
        lj.l0 l0Var = new lj.l0(n0Var, 1);
        o oVar = this.f50885b;
        oVar.getClass();
        kotlin.jvm.internal.n.f(webViewArg, "webViewArg");
        kotlin.jvm.internal.n.f(urlArg, "urlArg");
        kotlin.jvm.internal.n.f(messageArg, "messageArg");
        nf nfVar = oVar.f50873a;
        nfVar.getClass();
        if (((c) nfVar.f23783c).d(this)) {
            new k5.g((xi.f) nfVar.f23782b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm", nfVar.e(), (Object) null).y(xj.o.Q(this, webViewArg, urlArg, messageArg), new d0(l0Var, 3));
            return true;
        }
        Throwable thA = wj.h.a(t9.e.c(new a("missing-instance-error", "Callback to `WebChromeClient.onJsConfirm` failed because native instance was not in the instance manager.", "")));
        nf nfVar2 = n0Var.f50871b.f50885b.f50873a;
        Objects.requireNonNull(thA);
        nfVar2.getClass();
        nf.r(thA);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webViewArg, String urlArg, String messageArg, String defaultValueArg, JsPromptResult jsPromptResult) {
        if (!this.f50890g) {
            return false;
        }
        dn.d dVar = new dn.d(2, this, jsPromptResult);
        lj.l0 l0Var = new lj.l0(dVar, 1);
        o oVar = this.f50885b;
        oVar.getClass();
        kotlin.jvm.internal.n.f(webViewArg, "webViewArg");
        kotlin.jvm.internal.n.f(urlArg, "urlArg");
        kotlin.jvm.internal.n.f(messageArg, "messageArg");
        kotlin.jvm.internal.n.f(defaultValueArg, "defaultValueArg");
        nf nfVar = oVar.f50873a;
        nfVar.getClass();
        if (((c) nfVar.f23783c).d(this)) {
            new k5.g((xi.f) nfVar.f23782b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsPrompt", nfVar.e(), (Object) null).y(xj.o.Q(this, webViewArg, urlArg, messageArg, defaultValueArg), new d0(l0Var, 0));
            return true;
        }
        Throwable thA = wj.h.a(t9.e.c(new a("missing-instance-error", "Callback to `WebChromeClient.onJsPrompt` failed because native instance was not in the instance manager.", "")));
        nf nfVar2 = ((p0) dVar.f38968b).f50885b.f50873a;
        Objects.requireNonNull(thA);
        nfVar2.getClass();
        nf.r(thA);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest requestArg) {
        bh.a aVar = new bh.a(25);
        o oVar = this.f50885b;
        oVar.getClass();
        kotlin.jvm.internal.n.f(requestArg, "requestArg");
        nf nfVar = oVar.f50873a;
        nfVar.getClass();
        if (((c) nfVar.f23783c).d(this)) {
            new k5.g((xi.f) nfVar.f23782b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onPermissionRequest", nfVar.e(), (Object) null).y(xj.o.Q(this, requestArg), new r1.q(aVar, 24));
        } else {
            q4.a.p("missing-instance-error", "Callback to `WebChromeClient.onPermissionRequest` failed because native instance was not in the instance manager.", "");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webViewArg, int i10) {
        long j10 = i10;
        bh.a aVar = new bh.a(25);
        o oVar = this.f50885b;
        oVar.getClass();
        kotlin.jvm.internal.n.f(webViewArg, "webViewArg");
        nf nfVar = oVar.f50873a;
        nfVar.getClass();
        if (((c) nfVar.f23783c).d(this)) {
            new k5.g((xi.f) nfVar.f23782b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onProgressChanged", nfVar.e(), (Object) null).y(xj.o.Q(this, webViewArg, Long.valueOf(j10)), new r1.q(aVar, 23));
        } else {
            q4.a.p("missing-instance-error", "Callback to `WebChromeClient.onProgressChanged` failed because native instance was not in the instance manager.", "");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View viewArg, WebChromeClient.CustomViewCallback callbackArg) {
        bh.a aVar = new bh.a(25);
        o oVar = this.f50885b;
        oVar.getClass();
        kotlin.jvm.internal.n.f(viewArg, "viewArg");
        kotlin.jvm.internal.n.f(callbackArg, "callbackArg");
        nf nfVar = oVar.f50873a;
        nfVar.getClass();
        if (((c) nfVar.f23783c).d(this)) {
            new k5.g((xi.f) nfVar.f23782b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowCustomView", nfVar.e(), (Object) null).y(xj.o.Q(this, viewArg, callbackArg), new r1.q(aVar, 25));
        } else {
            q4.a.p("missing-instance-error", "Callback to `WebChromeClient.onShowCustomView` failed because native instance was not in the instance manager.", "");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webViewArg, final ValueCallback valueCallback, WebChromeClient.FileChooserParams paramsArg) {
        final boolean z10 = this.f50886c;
        jk.b bVar = new jk.b() { // from class: tj.o0
            @Override // jk.b
            public final Object invoke(Object obj) {
                j0 j0Var = (j0) obj;
                if (j0Var.f50846d) {
                    nf nfVar = this.f50874a.f50885b.f50873a;
                    Throwable th2 = j0Var.f50845c;
                    Objects.requireNonNull(th2);
                    nfVar.getClass();
                    nf.r(th2);
                    return null;
                }
                List list = (List) j0Var.f50844b;
                Objects.requireNonNull(list);
                List list2 = list;
                if (!z10) {
                    return null;
                }
                Uri[] uriArr = new Uri[list2.size()];
                for (int i10 = 0; i10 < list2.size(); i10++) {
                    uriArr[i10] = Uri.parse((String) list2.get(i10));
                }
                valueCallback.onReceiveValue(uriArr);
                return null;
            }
        };
        lj.l0 l0Var = new lj.l0(bVar, 1);
        o oVar = this.f50885b;
        oVar.getClass();
        kotlin.jvm.internal.n.f(webViewArg, "webViewArg");
        kotlin.jvm.internal.n.f(paramsArg, "paramsArg");
        nf nfVar = oVar.f50873a;
        nfVar.getClass();
        if (((c) nfVar.f23783c).d(this)) {
            new k5.g((xi.f) nfVar.f23782b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowFileChooser", nfVar.e(), (Object) null).y(xj.o.Q(this, webViewArg, paramsArg), new d0(l0Var, 2));
            return z10;
        }
        bVar.invoke(new j0(t9.e.c(new a("missing-instance-error", "Callback to `WebChromeClient.onShowFileChooser` failed because native instance was not in the instance manager.", ""))));
        return z10;
    }
}
