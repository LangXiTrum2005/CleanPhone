package com.bumptech.glide.load.engine.executor;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class GlideExecutor implements ExecutorService {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final long f12533Y = TimeUnit.SECONDS.toMillis(10);
    public static volatile int Z;
    public final ThreadPoolExecutor X;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f12534a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f12535b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f12536c;
        public final ThreadFactory d = new DefaultPriorityThreadFactory();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final UncaughtThrowableStrategy f12537e = UncaughtThrowableStrategy.f12541b;
        public String f;

        public Builder(boolean z2) {
            this.f12534a = z2;
        }

        public final GlideExecutor a() {
            if (!TextUtils.isEmpty(this.f)) {
                return new GlideExecutor(new ThreadPoolExecutor(this.f12535b, this.f12536c, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new DefaultThreadFactory(this.d, this.f, this.f12534a)));
            }
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f);
        }
    }

    public static final class DefaultPriorityThreadFactory implements ThreadFactory {

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.executor.GlideExecutor$DefaultPriorityThreadFactory$1, reason: invalid class name */
        class AnonymousClass1 extends Thread {
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new AnonymousClass1(runnable);
        }
    }

    public static final class DefaultThreadFactory implements ThreadFactory {
        public final ThreadFactory X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final String f12538Y;
        public final UncaughtThrowableStrategy Z;
        public final boolean e0;
        public final AtomicInteger f0;

        public DefaultThreadFactory(ThreadFactory threadFactory, String str, boolean z2) {
            UncaughtThrowableStrategy uncaughtThrowableStrategy = UncaughtThrowableStrategy.f12541b;
            this.f0 = new AtomicInteger();
            this.X = threadFactory;
            this.f12538Y = str;
            this.Z = uncaughtThrowableStrategy;
            this.e0 = z2;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(final Runnable runnable) {
            Runnable runnable2 = new Runnable() { // from class: com.bumptech.glide.load.engine.executor.GlideExecutor.DefaultThreadFactory.1
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultThreadFactory defaultThreadFactory = DefaultThreadFactory.this;
                    if (defaultThreadFactory.e0) {
                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                    }
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        ((UncaughtThrowableStrategy.AnonymousClass2) defaultThreadFactory.Z).getClass();
                        if (Log.isLoggable("GlideExecutor", 6)) {
                            Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                        }
                    }
                }
            };
            ((DefaultPriorityThreadFactory) this.X).getClass();
            DefaultPriorityThreadFactory.AnonymousClass1 anonymousClass1 = new DefaultPriorityThreadFactory.AnonymousClass1(runnable2);
            anonymousClass1.setName("glide-" + this.f12538Y + "-thread-" + this.f0.getAndIncrement());
            return anonymousClass1;
        }
    }

    public interface UncaughtThrowableStrategy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UncaughtThrowableStrategy f12540a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final UncaughtThrowableStrategy f12541b = new AnonymousClass2();

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.executor.GlideExecutor$UncaughtThrowableStrategy$1, reason: invalid class name */
        public class AnonymousClass1 implements UncaughtThrowableStrategy {
        }

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.executor.GlideExecutor$UncaughtThrowableStrategy$2, reason: invalid class name */
        public class AnonymousClass2 implements UncaughtThrowableStrategy {
        }

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.executor.GlideExecutor$UncaughtThrowableStrategy$3, reason: invalid class name */
        public class AnonymousClass3 implements UncaughtThrowableStrategy {
        }
    }

    public GlideExecutor(ThreadPoolExecutor threadPoolExecutor) {
        this.X = threadPoolExecutor;
    }

    public static GlideExecutor a() {
        return new GlideExecutor(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f12533Y, TimeUnit.MILLISECONDS, new SynchronousQueue(), new DefaultThreadFactory(new DefaultPriorityThreadFactory(), "source-unlimited", false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.X.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.X.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        return this.X.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        return this.X.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.X.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.X.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.X.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.X.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return this.X.submit(runnable);
    }

    public final String toString() {
        return this.X.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.X.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.X.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return this.X.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return this.X.submit(callable);
    }
}
