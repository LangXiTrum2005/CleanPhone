package tj;

import android.webkit.WebView;
import com.google.android.gms.internal.measurement.nf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0 f50894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WebView f50895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f50896d;

    public /* synthetic */ q0(s0 s0Var, WebView webView, String str, int i10) {
        this.f50893a = i10;
        this.f50894b = s0Var;
        this.f50895c = webView;
        this.f50896d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f50893a) {
            case 0:
                s0 s0Var = this.f50894b;
                l lVar = s0Var.f50905a;
                bh.a aVar = new bh.a(26);
                lVar.getClass();
                WebView webViewArg = this.f50895c;
                kotlin.jvm.internal.n.f(webViewArg, "webViewArg");
                String urlArg = this.f50896d;
                kotlin.jvm.internal.n.f(urlArg, "urlArg");
                nf nfVar = lVar.f50859a;
                nfVar.getClass();
                if (!((c) nfVar.f23783c).d(s0Var)) {
                    q4.a.p("missing-instance-error", "Callback to `WebViewClient.onPageStarted` failed because native instance was not in the instance manager.", "");
                } else {
                    new k5.g((xi.f) nfVar.f23782b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageStarted", nfVar.e(), (Object) null).y(xj.o.Q(s0Var, webViewArg, urlArg), new g0(aVar, 5));
                }
                break;
            case 1:
                s0 s0Var2 = this.f50894b;
                l lVar2 = s0Var2.f50905a;
                bh.a aVar2 = new bh.a(26);
                lVar2.getClass();
                WebView viewArg = this.f50895c;
                kotlin.jvm.internal.n.f(viewArg, "viewArg");
                String urlArg2 = this.f50896d;
                kotlin.jvm.internal.n.f(urlArg2, "urlArg");
                nf nfVar2 = lVar2.f50859a;
                nfVar2.getClass();
                if (!((c) nfVar2.f23783c).d(s0Var2)) {
                    q4.a.p("missing-instance-error", "Callback to `WebViewClient.onLoadResource` failed because native instance was not in the instance manager.", "");
                } else {
                    new k5.g((xi.f) nfVar2.f23782b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onLoadResource", nfVar2.e(), (Object) null).y(xj.o.Q(s0Var2, viewArg, urlArg2), new g0(aVar2, 3));
                }
                break;
            case 2:
                s0 s0Var3 = this.f50894b;
                l lVar3 = s0Var3.f50905a;
                bh.a aVar3 = new bh.a(26);
                lVar3.getClass();
                WebView webViewArg2 = this.f50895c;
                kotlin.jvm.internal.n.f(webViewArg2, "webViewArg");
                String urlArg3 = this.f50896d;
                kotlin.jvm.internal.n.f(urlArg3, "urlArg");
                nf nfVar3 = lVar3.f50859a;
                nfVar3.getClass();
                if (!((c) nfVar3.f23783c).d(s0Var3)) {
                    q4.a.p("missing-instance-error", "Callback to `WebViewClient.onPageFinished` failed because native instance was not in the instance manager.", "");
                } else {
                    new k5.g((xi.f) nfVar3.f23782b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageFinished", nfVar3.e(), (Object) null).y(xj.o.Q(s0Var3, webViewArg2, urlArg3), new g0(aVar3, 10));
                }
                break;
            default:
                s0 s0Var4 = this.f50894b;
                l lVar4 = s0Var4.f50905a;
                bh.a aVar4 = new bh.a(26);
                lVar4.getClass();
                WebView viewArg2 = this.f50895c;
                kotlin.jvm.internal.n.f(viewArg2, "viewArg");
                String urlArg4 = this.f50896d;
                kotlin.jvm.internal.n.f(urlArg4, "urlArg");
                nf nfVar4 = lVar4.f50859a;
                nfVar4.getClass();
                if (!((c) nfVar4.f23783c).d(s0Var4)) {
                    q4.a.p("missing-instance-error", "Callback to `WebViewClient.onPageCommitVisible` failed because native instance was not in the instance manager.", "");
                } else {
                    new k5.g((xi.f) nfVar4.f23782b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageCommitVisible", nfVar4.e(), (Object) null).y(xj.o.Q(s0Var4, viewArg2, urlArg4), new g0(aVar4, 8));
                }
                break;
        }
    }
}
