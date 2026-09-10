package tj;

import android.webkit.JavascriptInterface;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f50903b;

    public s(String str, l lVar) {
        this.f50902a = str;
        this.f50903b = lVar;
    }

    @JavascriptInterface
    public void postMessage(@NonNull String str) {
        this.f50903b.f50859a.x(new l2.u(26, this, str));
    }
}
