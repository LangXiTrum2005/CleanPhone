package com.google.firebase.crashlytics.internal.common;

import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.Logger;
import com.smartdigimkt.u2.m;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class Utils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ExecutorService f20368a;

    static {
        ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.google.firebase.crashlytics.internal.common.ExecutorUtils.1
            public final /* synthetic */ AtomicLong X;

            /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.ExecutorUtils$1$1 */
            class C02081 extends BackgroundPriorityRunnable {
                public final /* synthetic */ Runnable X;

                public C02081() {
                    runnable = runnable;
                }

                @Override // com.google.firebase.crashlytics.internal.common.BackgroundPriorityRunnable
                public final void b() {
                    runnable.run();
                }
            }

            public AnonymousClass1() {
                atomicLong = atomicLong;
            }

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(new BackgroundPriorityRunnable() { // from class: com.google.firebase.crashlytics.internal.common.ExecutorUtils.1.1
                    public final /* synthetic */ Runnable X;

                    public C02081() {
                        runnable = runnable;
                    }

                    @Override // com.google.firebase.crashlytics.internal.common.BackgroundPriorityRunnable
                    public final void b() {
                        runnable.run();
                    }
                });
                threadNewThread.setName("awaitEvenIfOnMainThread task continuation executor" + atomicLong.getAndIncrement());
                return threadNewThread;
            }
        }, new ThreadPoolExecutor.DiscardPolicy()));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Runtime.getRuntime().addShutdownHook(new Thread(new BackgroundPriorityRunnable() { // from class: com.google.firebase.crashlytics.internal.common.ExecutorUtils.2
            public final /* synthetic */ ExecutorService X;

            public AnonymousClass2() {
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                executorService = executorServiceUnconfigurableExecutorService;
            }

            @Override // com.google.firebase.crashlytics.internal.common.BackgroundPriorityRunnable
            public final void b() {
                Logger logger = Logger.f20289a;
                ExecutorService executorService = executorService;
                try {
                    logger.b("Executing shutdown hook for awaitEvenIfOnMainThread task continuation executor", null);
                    executorService.shutdown();
                    if (executorService.awaitTermination(2L, TimeUnit.SECONDS)) {
                        return;
                    }
                    logger.b("awaitEvenIfOnMainThread task continuation executor did not shut down in the allocated time. Requesting immediate shutdown.", null);
                    executorService.shutdownNow();
                } catch (InterruptedException unused) {
                    Locale locale = Locale.US;
                    logger.b("Interrupted while waiting for awaitEvenIfOnMainThread task continuation executor to shut down. Requesting immediate shutdown.", null);
                    executorService.shutdownNow();
                }
            }
        }, "Crashlytics Shutdown Hook for awaitEvenIfOnMainThread task continuation executor"));
        f20368a = executorServiceUnconfigurableExecutorService;
    }

    public static void a(Task task) throws InterruptedException, TimeoutException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        task.continueWith(f20368a, new g(countDownLatch, 1));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(m.D0, TimeUnit.MILLISECONDS);
        } else {
            countDownLatch.await(4000L, TimeUnit.MILLISECONDS);
        }
        if (task.isSuccessful()) {
            task.getResult();
        } else {
            if (task.isCanceled()) {
                throw new CancellationException("Task is already canceled");
            }
            if (!task.isComplete()) {
                throw new TimeoutException();
            }
            throw new IllegalStateException(task.getException());
        }
    }
}
