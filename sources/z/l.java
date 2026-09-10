package z;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements ListenableFuture {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f54595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f54596b = new k(this);

    public l(i iVar) {
        this.f54595a = new WeakReference(iVar);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.f54596b.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        i iVar = (i) this.f54595a.get();
        boolean zCancel = this.f54596b.cancel(z10);
        if (zCancel && iVar != null) {
            iVar.f54590a = null;
            iVar.f54591b = null;
            iVar.f54592c.i(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f54596b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f54596b.f54587a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f54596b.isDone();
    }

    public final String toString() {
        return this.f54596b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f54596b.get(j10, timeUnit);
    }
}
