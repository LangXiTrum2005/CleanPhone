package com.google.common.util.concurrent;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class JdkFutureAdapters {

    public static class ListenableFutureAdapter<V> extends ForwardingFuture<V> implements ListenableFuture<V> {
        public static final ExecutorService X;

        static {
            ThreadFactoryBuilder threadFactoryBuilder = new ThreadFactoryBuilder();
            threadFactoryBuilder.f20138a = Boolean.TRUE;
            Locale locale = Locale.ROOT;
            X = Executors.newCachedThreadPool(new ThreadFactory() { // from class: com.google.common.util.concurrent.ThreadFactoryBuilder.1
                public final /* synthetic */ ThreadFactory X;

                /* JADX INFO: renamed from: Y */
                public final /* synthetic */ AtomicLong f20139Y;
                public final /* synthetic */ Boolean Z;

                public AnonymousClass1() {
                    threadFactory = threadFactory;
                    atomicLong = atomicLong;
                    bool = bool;
                }

                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread threadNewThread = threadFactory.newThread(runnable);
                    Objects.requireNonNull(threadNewThread);
                    AtomicLong atomicLong = atomicLong;
                    Objects.requireNonNull(atomicLong);
                    long andIncrement = atomicLong.getAndIncrement();
                    Locale locale2 = Locale.ROOT;
                    threadNewThread.setName("ListenableFutureAdapter-thread-" + andIncrement);
                    Boolean bool = bool;
                    if (bool != null) {
                        threadNewThread.setDaemon(bool.booleanValue());
                    }
                    return threadNewThread;
                }
            });
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public final void addListener(Runnable runnable, Executor executor) {
            throw null;
        }

        @Override // com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: w */
        public final /* bridge */ /* synthetic */ Object x() {
            return null;
        }

        @Override // com.google.common.util.concurrent.ForwardingFuture
        /* JADX INFO: renamed from: x */
        public final Future w() {
            return null;
        }
    }
}
