package k;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f44121a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f44122b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a7.g f44123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Runnable f44124d;

    public k(a7.g gVar) {
        this.f44123c = gVar;
    }

    public final void a() {
        synchronized (this.f44121a) {
            try {
                Runnable runnable = (Runnable) this.f44122b.poll();
                this.f44124d = runnable;
                if (runnable != null) {
                    this.f44123c.execute(runnable);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f44121a) {
            try {
                this.f44122b.add(new com.unity3d.services.ads.operation.show.b(23, this, runnable));
                if (this.f44124d == null) {
                    a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
