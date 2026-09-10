package d5;

import cn.h1;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements ListenableFuture {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o5.j f38698a = new o5.j();

    public j(h1 h1Var) {
        h1Var.n(new al.f(this, 6));
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.f38698a.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return this.f38698a.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f38698a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f38698a.f47201a instanceof o5.a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f38698a.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f38698a.get(j10, timeUnit);
    }
}
