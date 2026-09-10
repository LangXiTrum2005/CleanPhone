package ta;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f50619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ListenableFuture f50620b;

    public h(r rVar, ListenableFuture listenableFuture) {
        this.f50619a = rVar;
        this.f50620b = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f50619a.f50646a != this) {
            return;
        }
        if (r.f50644f.g(this.f50619a, this, r.h(this.f50620b))) {
            r.e(this.f50619a, false);
        }
    }
}
