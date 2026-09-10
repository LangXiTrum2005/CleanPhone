package tj;

import android.content.Context;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.measurement.nf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class w0 extends WebView implements io.flutter.plugin.platform.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f50927d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f50928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WebViewClient f50929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m0 f50930c;

    public w0(o oVar) {
        super((Context) oVar.f50873a.f23785e);
        this.f50928a = oVar;
        this.f50929b = new WebViewClient();
        this.f50930c = new m0();
        setWebViewClient(this.f50929b);
        setWebChromeClient(this.f50930c);
    }

    @Override // android.webkit.WebView
    @Nullable
    public WebChromeClient getWebChromeClient() {
        return this.f50930c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.webkit.WebView, tj.w0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.ViewParent] */
    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        mi.s sVar;
        super.onAttachedToWindow();
        this.f50928a.f50873a.getClass();
        while (true) {
            if (this.getParent() == null) {
                sVar = null;
                break;
            }
            this = this.getParent();
            if (this instanceof mi.s) {
                sVar = (mi.s) this;
                break;
            }
        }
        if (sVar != null) {
            sVar.setImportantForAutofill(1);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onScrollChanged(final int i10, final int i11, final int i12, final int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        this.f50928a.f50873a.x(new Runnable() { // from class: tj.v0
            @Override // java.lang.Runnable
            public final void run() {
                w0 w0Var = this.f50920a;
                o oVar = w0Var.f50928a;
                long j10 = i10;
                long j11 = i11;
                long j12 = i12;
                long j13 = i13;
                bh.a aVar = new bh.a(27);
                oVar.getClass();
                nf nfVar = oVar.f50873a;
                nfVar.getClass();
                if (((c) nfVar.f23783c).d(w0Var)) {
                    new k5.g((xi.f) nfVar.f23782b, "dev.flutter.pigeon.webview_flutter_android.WebView.onScrollChanged", nfVar.e(), (Object) null).y(xj.o.Q(w0Var, Long.valueOf(j10), Long.valueOf(j11), Long.valueOf(j12), Long.valueOf(j13)), new g0(aVar, 1));
                } else {
                    q4.a.p("missing-instance-error", "Callback to `WebView.onScrollChanged` failed because native instance was not in the instance manager.", "");
                }
            }
        });
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(@Nullable WebChromeClient webChromeClient) {
        super.setWebChromeClient(webChromeClient);
        if (!(webChromeClient instanceof m0)) {
            throw new AssertionError("Client must be a SecureWebChromeClient.");
        }
        m0 m0Var = (m0) webChromeClient;
        this.f50930c = m0Var;
        m0Var.f50868a = this.f50929b;
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(@NonNull WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        this.f50929b = webViewClient;
        this.f50930c.f50868a = webViewClient;
    }

    @Override // io.flutter.plugin.platform.d
    public final void dispose() {
    }

    @Override // io.flutter.plugin.platform.d
    @Nullable
    public View getView() {
        return this;
    }
}
