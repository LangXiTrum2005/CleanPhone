package ads_mobile_sdk;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public final class tk1 implements Runnable {
    public final WebView a;

    public tk1(uk1 uk1Var) {
        this.a = uk1Var.e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.destroy();
    }
}
