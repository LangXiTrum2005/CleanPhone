package tj;

import android.webkit.DownloadListener;
import com.google.android.gms.internal.measurement.nf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class n implements DownloadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f50869a;

    public n(o oVar) {
        this.f50869a = oVar;
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(final String str, final String str2, final String str3, final String str4, final long j10) {
        this.f50869a.f50873a.x(new Runnable() { // from class: tj.m
            @Override // java.lang.Runnable
            public final void run() {
                n nVar = this.f50862a;
                o oVar = nVar.f50869a;
                bh.a aVar = new bh.a(24);
                String urlArg = str;
                kotlin.jvm.internal.n.f(urlArg, "urlArg");
                String userAgentArg = str2;
                kotlin.jvm.internal.n.f(userAgentArg, "userAgentArg");
                String contentDispositionArg = str3;
                kotlin.jvm.internal.n.f(contentDispositionArg, "contentDispositionArg");
                String mimetypeArg = str4;
                kotlin.jvm.internal.n.f(mimetypeArg, "mimetypeArg");
                nf nfVar = oVar.f50873a;
                nfVar.getClass();
                if (!((c) nfVar.f23783c).d(nVar)) {
                    q4.a.p("missing-instance-error", "Callback to `DownloadListener.onDownloadStart` failed because native instance was not in the instance manager.", "");
                } else {
                    new k5.g((xi.f) nfVar.f23782b, "dev.flutter.pigeon.webview_flutter_android.DownloadListener.onDownloadStart", nfVar.e(), (Object) null).y(xj.o.Q(nVar, urlArg, userAgentArg, contentDispositionArg, mimetypeArg, Long.valueOf(j10)), new r1.q(aVar, 14));
                }
            }
        });
    }
}
