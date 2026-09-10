package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
abstract class WrappingExecutorService implements ExecutorService {
    public abstract Callable a(Callable callable);

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw null;
    }

    public void b(Runnable runnable) {
        a(Executors.callable(runnable, null));
        throw null;
    }

    public final void c(Collection collection) {
        ImmutableList.Builder builderS = ImmutableList.s();
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            a((Callable) it.next());
            throw null;
        }
        builderS.j();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable);
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        c(collection);
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        c(collection);
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        b(runnable);
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        c(collection);
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        c(collection);
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        b(runnable);
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        callable.getClass();
        a(callable);
        throw null;
    }
}
