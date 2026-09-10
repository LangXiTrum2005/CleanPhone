package com.inmobi.media;

import java.util.concurrent.Callable;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Ua extends ThreadPoolExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f23268a = 0;

    public Ua(TimeUnit timeUnit, PriorityBlockingQueue priorityBlockingQueue, K5 k5) {
        super(1, 1, 0L, timeUnit, priorityBlockingQueue, k5);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        Intrinsics.f(callable, "callable");
        return (RunnableFuture) callable;
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        Intrinsics.f(runnable, "runnable");
        return (RunnableFuture) runnable;
    }
}
