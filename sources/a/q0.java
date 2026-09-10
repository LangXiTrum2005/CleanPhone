package A;

import android.webkit.WebView;
import com.inmobi.media.C3187q2;
import com.startapp.sdk.internal.al;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class q0 implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ WebView f3192Y;

    public /* synthetic */ q0(WebView webView, int i2) {
        this.X = i2;
        this.f3192Y = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                C3187q2.a(this.f3192Y);
                break;
            default:
                al.b(this.f3192Y);
                break;
        }
    }
}
