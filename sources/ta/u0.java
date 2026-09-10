package ta;

import com.google.android.gms.internal.ads.ee1;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class u0 implements Executor {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ee1 f50657f = new ee1(u0.class, 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f50658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f50659b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f50660c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f50661d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n5.i f50662e = new n5.i(this, 3);

    public u0(Executor executor) {
        executor.getClass();
        this.f50658a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f50659b) {
            int i10 = this.f50660c;
            if (i10 != 4 && i10 != 3) {
                long j10 = this.f50661d;
                g6.a aVar = new g6.a(3, runnable);
                this.f50659b.add(aVar);
                this.f50660c = 2;
                try {
                    this.f50658a.execute(this.f50662e);
                    if (this.f50660c != 2) {
                        return;
                    }
                    synchronized (this.f50659b) {
                        try {
                            if (this.f50661d == j10 && this.f50660c == 2) {
                                this.f50660c = 3;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                } catch (Throwable th3) {
                    synchronized (this.f50659b) {
                        try {
                            int i11 = this.f50660c;
                            boolean z10 = true;
                            if ((i11 != 1 && i11 != 2) || !this.f50659b.removeLastOccurrence(aVar)) {
                                z10 = false;
                            }
                            if (!(th3 instanceof RejectedExecutionException) || z10) {
                                throw th3;
                            }
                            return;
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
            }
            this.f50659b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f50658a + "}";
    }
}
