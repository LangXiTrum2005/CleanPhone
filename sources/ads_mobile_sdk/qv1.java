package ads_mobile_sdk;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public final class qv1 implements Runnable {
    public final /* synthetic */ WebView a;
    public final /* synthetic */ String b;
    public final /* synthetic */ rv1 c;

    public qv1(rv1 rv1Var, WebView webView, String str) {
        this.c = rv1Var;
        this.a = webView;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rv1 rv1Var = this.c;
        WebView webView = this.a;
        String str = this.b;
        rv1Var.getClass();
        rv1.a(webView, str);
    }
}
