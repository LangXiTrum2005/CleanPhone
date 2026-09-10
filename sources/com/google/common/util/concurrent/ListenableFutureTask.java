package com.google.common.util.concurrent;

import A.W;
import com.google.common.base.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public class ListenableFutureTask<V> extends FutureTask<V> implements ListenableFuture<V> {
    public final ExecutionList X;

    public ListenableFutureTask(W w2) {
        super(w2);
        this.X = new ExecutionList();
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        ExecutionList executionList = this.X;
        executionList.getClass();
        Preconditions.j(runnable, "Runnable was null.");
        Preconditions.j(executor, "Executor was null.");
        synchronized (executionList) {
            try {
                if (executionList.f20124b) {
                    ExecutionList.a(runnable, executor);
                } else {
                    executionList.f20123a = new ExecutionList.RunnableExecutorPair(runnable, executor, executionList.f20123a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        ExecutionList executionList = this.X;
        synchronized (executionList) {
            try {
                if (executionList.f20124b) {
                    return;
                }
                executionList.f20124b = true;
                ExecutionList.RunnableExecutorPair runnableExecutorPair = executionList.f20123a;
                ExecutionList.RunnableExecutorPair runnableExecutorPair2 = null;
                executionList.f20123a = null;
                while (runnableExecutorPair != null) {
                    ExecutionList.RunnableExecutorPair runnableExecutorPair3 = runnableExecutorPair.f20127c;
                    runnableExecutorPair.f20127c = runnableExecutorPair2;
                    runnableExecutorPair2 = runnableExecutorPair;
                    runnableExecutorPair = runnableExecutorPair3;
                }
                while (runnableExecutorPair2 != null) {
                    ExecutionList.a(runnableExecutorPair2.f20125a, runnableExecutorPair2.f20126b);
                    runnableExecutorPair2 = runnableExecutorPair2.f20127c;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        return nanos <= 2147483647999999999L ? super.get(j, timeUnit) : super.get(Math.min(nanos, 2147483647999999999L), TimeUnit.NANOSECONDS);
    }
}
