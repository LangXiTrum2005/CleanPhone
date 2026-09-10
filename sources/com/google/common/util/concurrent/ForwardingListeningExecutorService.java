package com.google.common.util.concurrent;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingListeningExecutorService extends ForwardingExecutorService implements ListeningExecutorService {
    @Override // com.google.common.util.concurrent.ForwardingExecutorService
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public abstract ListeningExecutorService x();

    @Override // com.google.common.util.concurrent.ForwardingExecutorService, java.util.concurrent.ExecutorService
    public final ListenableFuture submit(Callable callable) {
        return x().submit(callable);
    }

    @Override // com.google.common.util.concurrent.ForwardingExecutorService, java.util.concurrent.ExecutorService
    public final ListenableFuture submit(Runnable runnable) {
        return x().submit(runnable);
    }

    @Override // com.google.common.util.concurrent.ForwardingExecutorService, java.util.concurrent.ExecutorService
    public final ListenableFuture submit(Runnable runnable, Object obj) {
        return x().submit(runnable, obj);
    }
}
