package ta;

import com.google.android.gms.internal.ads.ee1;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class n0 implements ListenableFuture {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n0 f50627b = new n0(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ee1 f50628c = new ee1(n0.class, 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f50629a;

    public n0(Object obj) {
        this.f50629a = obj;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        go.k.o(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            f50628c.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f50629a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.f50629a + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f50629a;
    }
}
