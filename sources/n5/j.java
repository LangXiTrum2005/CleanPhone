package n5;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f46530b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Runnable f46532d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f46529a = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f46531c = new Object();

    public j(Executor executor) {
        this.f46530b = executor;
    }

    public final void a() {
        synchronized (this.f46531c) {
            try {
                Runnable runnable = (Runnable) this.f46529a.poll();
                this.f46532d = runnable;
                if (runnable != null) {
                    this.f46530b.execute(this.f46532d);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f46531c) {
            try {
                this.f46529a.add(new i(0, this, runnable));
                if (this.f46532d == null) {
                    a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
