package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class ExecutionList {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LazyLogger f20122c = new LazyLogger(ExecutionList.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RunnableExecutorPair f20123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20124b;

    public static final class RunnableExecutorPair {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f20125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f20126b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public RunnableExecutorPair f20127c;

        public RunnableExecutorPair(Runnable runnable, Executor executor, RunnableExecutorPair runnableExecutorPair) {
            this.f20125a = runnable;
            this.f20126b = executor;
            this.f20127c = runnableExecutorPair;
        }
    }

    public static void a(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            f20122c.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }
}
