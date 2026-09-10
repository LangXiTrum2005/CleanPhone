package androidx.work.impl.utils;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class SerialExecutor implements Executor {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final ExecutorService f8810Y;
    public volatile Runnable e0;
    public final ArrayDeque X = new ArrayDeque();
    public final Object Z = new Object();

    public static class Task implements Runnable {
        public final SerialExecutor X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Runnable f8811Y;

        public Task(SerialExecutor serialExecutor, Runnable runnable) {
            this.X = serialExecutor;
            this.f8811Y = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SerialExecutor serialExecutor = this.X;
            try {
                this.f8811Y.run();
            } finally {
                serialExecutor.a();
            }
        }
    }

    public SerialExecutor(ExecutorService executorService) {
        this.f8810Y = executorService;
    }

    public final void a() {
        synchronized (this.Z) {
            try {
                Runnable runnable = (Runnable) this.X.poll();
                this.e0 = runnable;
                if (runnable != null) {
                    this.f8810Y.execute(this.e0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.Z) {
            try {
                this.X.add(new Task(this, runnable));
                if (this.e0 == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
