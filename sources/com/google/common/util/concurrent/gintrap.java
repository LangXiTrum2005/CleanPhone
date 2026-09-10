package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: ListeningExecutorService.java */
/* JADX INFO: loaded from: classes3.dex */
public interface gintrap extends ExecutorService, AutoCloseable {
    @Override // java.lang.AutoCloseable
    /* synthetic */ default void close() {
        demilitarize.impromptu.attabal(this);
    }

    @Override // java.util.concurrent.ExecutorService, com.google.common.util.concurrent.gintrap
    adultoid<?> submit(Runnable runnable);

    @Override // java.util.concurrent.ExecutorService, com.google.common.util.concurrent.gintrap
    <T> adultoid<T> submit(Runnable runnable, T t);

    @Override // java.util.concurrent.ExecutorService, com.google.common.util.concurrent.gintrap
    <T> adultoid<T> submit(Callable<T> callable);
}
