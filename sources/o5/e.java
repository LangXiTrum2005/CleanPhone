package o5;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f47192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ListenableFuture f47193b;

    public e(j jVar, ListenableFuture listenableFuture) {
        this.f47192a = jVar;
        this.f47193b = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f47192a.f47201a != this) {
            return;
        }
        if (h.f47199f.f(this.f47192a, this, h.e(this.f47193b))) {
            h.b(this.f47192a);
        }
    }
}
