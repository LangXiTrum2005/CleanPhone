package com.google.common.util.concurrent;

import com.google.common.collect.igbo;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: ForwardingFuture.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class formularize<V> extends igbo implements Future<V> {
    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return wireman().cancel(z);
    }

    @Override // java.util.concurrent.Future
    public V get() throws ExecutionException, InterruptedException {
        return wireman().get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return wireman().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return wireman().isDone();
    }

    public abstract Future<? extends V> wireman();

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return wireman().get(j, timeUnit);
    }
}
