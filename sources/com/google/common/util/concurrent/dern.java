package com.google.common.util.concurrent;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: compiled from: AbstractListeningExecutorService.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class dern extends AbstractExecutorService implements gintrap, AutoCloseable {
    @Override // com.google.common.util.concurrent.gintrap, java.lang.AutoCloseable
    public /* synthetic */ void close() {
        demilitarize.impromptu.attabal(this);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return TrustedListenableFutureTask.seminary(runnable, t);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return TrustedListenableFutureTask.grimness(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.gintrap
    public adultoid<?> submit(Runnable runnable) {
        return (adultoid) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.gintrap
    public <T> adultoid<T> submit(Runnable runnable, T t) {
        return (adultoid) super.submit(runnable, (Object) t);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.gintrap
    public <T> adultoid<T> submit(Callable<T> callable) {
        return (adultoid) super.submit((Callable) callable);
    }
}
