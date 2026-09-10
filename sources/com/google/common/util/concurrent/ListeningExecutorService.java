package com.google.common.util.concurrent;

import com.google.errorprone.annotations.DoNotMock;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
@DoNotMock
@ElementTypesAreNonnullByDefault
public interface ListeningExecutorService extends ExecutorService {
    ListenableFuture submit(Runnable runnable);

    ListenableFuture submit(Runnable runnable, Object obj);

    ListenableFuture submit(Callable callable);
}
