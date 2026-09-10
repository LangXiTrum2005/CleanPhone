package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.logging.Logging;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
class SafeLoggingExecutor implements Executor {
    public final ExecutorService X;

    public static class SafeLoggingRunnable implements Runnable {
        public final Runnable X;

        public SafeLoggingRunnable(Runnable runnable) {
            this.X = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.X.run();
            } catch (Exception e2) {
                Logging.c("Executor", "Background execution failure.", e2);
            }
        }
    }

    public SafeLoggingExecutor(ExecutorService executorService) {
        this.X = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.X.execute(new SafeLoggingRunnable(runnable));
    }
}
