package x3;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.ironsource.sdk.controller.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OnBackInvokedDispatcher f53600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f53601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final OnBackInvokedCallback f53602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f53603f;

    public j(OnBackInvokedDispatcher onBackInvokedDispatcher, int i10) {
        this.f53600c = onBackInvokedDispatcher;
        this.f53601d = i10;
        this.f53602e = Build.VERSION.SDK_INT == 33 ? new w(this, 5) : new mi.b(this, 1);
    }

    @Override // x3.e
    public final void b(boolean z10) {
        if (z10 && !this.f53603f) {
            this.f53600c.registerOnBackInvokedCallback(this.f53601d, this.f53602e);
            this.f53603f = true;
        } else {
            if (z10 || !this.f53603f) {
                return;
            }
            this.f53600c.unregisterOnBackInvokedCallback(this.f53602e);
            this.f53603f = false;
        }
    }
}
