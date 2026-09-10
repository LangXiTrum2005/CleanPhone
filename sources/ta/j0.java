package ta;

import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.X3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class j0 extends k implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ListenableFuture f50625h;

    @Override // ta.r
    public final void c() {
        this.f50625h = null;
    }

    @Override // ta.r
    public final String j() {
        ListenableFuture listenableFuture = this.f50625h;
        if (listenableFuture == null) {
            return null;
        }
        return "delegate=[" + listenableFuture + X3.j.f27836e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.f50625h;
        if (listenableFuture != null) {
            o(listenableFuture);
        }
    }
}
