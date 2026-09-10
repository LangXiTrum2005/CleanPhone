package ub;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import k9.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements Executor {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f51970f = Logger.getLogger(k.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f51971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f51972b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51973c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f51974d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n5.i f51975e = new n5.i(this, 4);

    public k(Executor executor) {
        c0.h(executor);
        this.f51971a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c0.h(runnable);
        synchronized (this.f51972b) {
            int i10 = this.f51973c;
            if (i10 != 4 && i10 != 3) {
                long j10 = this.f51974d;
                g6.a aVar = new g6.a(4, runnable);
                this.f51972b.add(aVar);
                this.f51973c = 2;
                try {
                    this.f51971a.execute(this.f51975e);
                    if (this.f51973c != 2) {
                        return;
                    }
                    synchronized (this.f51972b) {
                        try {
                            if (this.f51974d == j10 && this.f51973c == 2) {
                                this.f51973c = 3;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f51972b) {
                        try {
                            int i11 = this.f51973c;
                            boolean z10 = true;
                            if ((i11 != 1 && i11 != 2) || !this.f51972b.removeLastOccurrence(aVar)) {
                                z10 = false;
                            }
                            if (!(e10 instanceof RejectedExecutionException) || z10) {
                                throw e10;
                            }
                            return;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            this.f51972b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f51971a + "}";
    }
}
