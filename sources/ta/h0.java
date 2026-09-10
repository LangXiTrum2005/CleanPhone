package ta;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends g0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ListenableFuture f50621i;

    public h0(ListenableFuture listenableFuture) {
        this.f50621i = listenableFuture;
    }

    @Override // ta.r, com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.f50621i.addListener(runnable, executor);
    }

    @Override // ta.r, java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return this.f50621i.cancel(z10);
    }

    @Override // ta.r, java.util.concurrent.Future
    public final Object get() {
        return this.f50621i.get();
    }

    @Override // ta.r, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f50621i.isCancelled();
    }

    @Override // ta.r, java.util.concurrent.Future
    public final boolean isDone() {
        return this.f50621i.isDone();
    }

    @Override // ta.r
    public final String toString() {
        return this.f50621i.toString();
    }

    @Override // ta.r, java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f50621i.get(j10, timeUnit);
    }
}
